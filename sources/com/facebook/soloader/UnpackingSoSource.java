package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode.ThreadPolicy;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import p201f.p202a.C5952h;

public abstract class UnpackingSoSource extends DirectorySoSource {
    private static final String DEPS_FILE_NAME = "dso_deps";
    private static final String LOCK_FILE_NAME = "dso_lock";
    private static final String MANIFEST_FILE_NAME = "dso_manifest";
    private static final byte MANIFEST_VERSION = 1;
    private static final byte STATE_CLEAN = 1;
    private static final byte STATE_DIRTY = 0;
    private static final String STATE_FILE_NAME = "dso_state";
    private static final String TAG = "fb-UnpackingSoSource";
    @C5952h
    private String[] mAbis;
    protected final Context mContext;
    @C5952h
    protected String mCorruptedLib;
    private final Map<String, Object> mLibsBeingLoaded = new HashMap();

    public static class Dso {
        public final String hash;
        public final String name;

        public Dso(String str, String str2) {
            this.name = str;
            this.hash = str2;
        }
    }

    public static final class DsoManifest {
        public final Dso[] dsos;

        public DsoManifest(Dso[] dsoArr) {
            this.dsos = dsoArr;
        }

        static final DsoManifest read(DataInput dataInput) throws IOException {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    Dso[] dsoArr = new Dso[readInt];
                    for (int i = 0; i < readInt; i++) {
                        dsoArr[i] = new Dso(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new DsoManifest(dsoArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        public final void write(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.dsos.length);
            int i = 0;
            while (true) {
                Dso[] dsoArr = this.dsos;
                if (i < dsoArr.length) {
                    dataOutput.writeUTF(dsoArr[i].name);
                    dataOutput.writeUTF(this.dsos[i].hash);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    protected static final class InputDso implements Closeable {
        public final InputStream content;
        public final Dso dso;

        public InputDso(Dso dso2, InputStream inputStream) {
            this.dso = dso2;
            this.content = inputStream;
        }

        public void close() throws IOException {
            this.content.close();
        }
    }

    protected static abstract class InputDsoIterator implements Closeable {
        protected InputDsoIterator() {
        }

        public void close() throws IOException {
        }

        public abstract boolean hasNext();

        public abstract InputDso next() throws IOException;
    }

    protected static abstract class Unpacker implements Closeable {
        protected Unpacker() {
        }

        public void close() throws IOException {
        }

        /* access modifiers changed from: protected */
        public abstract DsoManifest getDsoManifest() throws IOException;

        /* access modifiers changed from: protected */
        public abstract InputDsoIterator openDsoIterator() throws IOException;
    }

    protected UnpackingSoSource(Context context, String str) {
        super(getSoStorePath(context, str), 1);
        this.mContext = context;
    }

    private void deleteUnmentionedFiles(Dso[] dsoArr) throws IOException {
        String[] list = this.soDirectory.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(STATE_FILE_NAME) && !str.equals(LOCK_FILE_NAME) && !str.equals(DEPS_FILE_NAME) && !str.equals(MANIFEST_FILE_NAME)) {
                    boolean z = false;
                    int i = 0;
                    while (!z && i < dsoArr.length) {
                        if (dsoArr[i].name.equals(str)) {
                            z = true;
                        }
                        i++;
                    }
                    if (!z) {
                        File file = new File(this.soDirectory, str);
                        StringBuilder sb = new StringBuilder();
                        sb.append("deleting unaccounted-for file ");
                        sb.append(file);
                        sb.toString();
                        SysUtil.dumbDeleteRecursive(file);
                    }
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("unable to list directory ");
        sb2.append(this.soDirectory);
        throw new IOException(sb2.toString());
    }

    private void extractDso(InputDso inputDso, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        String str = "rw";
        StringBuilder sb = new StringBuilder();
        sb.append("extracting DSO ");
        sb.append(inputDso.dso.name);
        sb.toString();
        if (this.soDirectory.setWritable(true, true)) {
            File file = new File(this.soDirectory, inputDso.dso.name);
            try {
                randomAccessFile = new RandomAccessFile(file, str);
            } catch (IOException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("error overwriting ");
                sb2.append(file);
                sb2.append(" trying to delete and start over");
                sb2.toString();
                SysUtil.dumbDeleteRecursive(file);
                randomAccessFile = new RandomAccessFile(file, str);
            }
            try {
                int available = inputDso.content.available();
                if (available > 1) {
                    SysUtil.fallocateIfSupported(randomAccessFile.getFD(), (long) available);
                }
                SysUtil.copyBytes(randomAccessFile, inputDso.content, Integer.MAX_VALUE, bArr);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (file.setExecutable(true, false)) {
                    randomAccessFile.close();
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("cannot make file executable: ");
                sb3.append(file);
                throw new IOException(sb3.toString());
            } catch (IOException e) {
                SysUtil.dumbDeleteRecursive(file);
                throw e;
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("cannot make directory writable for us: ");
            sb4.append(this.soDirectory);
            throw new IOException(sb4.toString());
        }
    }

    private Object getLibraryLock(String str) {
        Object obj;
        synchronized (this.mLibsBeingLoaded) {
            obj = this.mLibsBeingLoaded.get(str);
            if (obj == null) {
                obj = new Object();
                this.mLibsBeingLoaded.put(str, obj);
            }
        }
        return obj;
    }

    public static File getSoStorePath(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getApplicationInfo().dataDir);
        sb.append("/");
        sb.append(str);
        return new File(sb.toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:51|(2:53|54)|55|56) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:60|(2:62|63)|64|65) */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c1, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c2, code lost:
        if (r8 != null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        throw r11;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00c7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x00d0 */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean refreshLocked(com.facebook.soloader.FileLocker r11, int r12, byte[] r13) throws java.io.IOException {
        /*
            r10 = this;
            java.io.File r5 = new java.io.File
            java.io.File r0 = r10.soDirectory
            java.lang.String r1 = "dso_state"
            r5.<init>(r0, r1)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r5, r1)
            r7 = 1
            r2 = 0
            byte r3 = r0.readByte()     // Catch:{ EOFException -> 0x002f, all -> 0x0031 }
            if (r3 == r7) goto L_0x0038
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x002f, all -> 0x0031 }
            r3.<init>()     // Catch:{ EOFException -> 0x002f, all -> 0x0031 }
            java.lang.String r4 = "dso store "
            r3.append(r4)     // Catch:{ EOFException -> 0x002f, all -> 0x0031 }
            java.io.File r4 = r10.soDirectory     // Catch:{ EOFException -> 0x002f, all -> 0x0031 }
            r3.append(r4)     // Catch:{ EOFException -> 0x002f, all -> 0x0031 }
            java.lang.String r4 = " regeneration interrupted: wiping clean"
            r3.append(r4)     // Catch:{ EOFException -> 0x002f, all -> 0x0031 }
            r3.toString()     // Catch:{ EOFException -> 0x002f, all -> 0x0031 }
        L_0x002f:
            r3 = 0
            goto L_0x0038
        L_0x0031:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r11 = move-exception
            r0.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r11
        L_0x0038:
            r0.close()
            java.io.File r4 = new java.io.File
            java.io.File r0 = r10.soDirectory
            java.lang.String r6 = "dso_deps"
            r4.<init>(r0, r6)
            r0 = 0
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile
            r6.<init>(r4, r1)
            long r8 = r6.length()     // Catch:{ all -> 0x00d1 }
            int r1 = (int) r8     // Catch:{ all -> 0x00d1 }
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x00d1 }
            int r8 = r6.read(r1)     // Catch:{ all -> 0x00d1 }
            int r9 = r1.length     // Catch:{ all -> 0x00d1 }
            if (r8 == r9) goto L_0x0059
            r3 = 0
        L_0x0059:
            boolean r1 = java.util.Arrays.equals(r1, r13)     // Catch:{ all -> 0x00d1 }
            if (r1 != 0) goto L_0x0060
            r3 = 0
        L_0x0060:
            if (r3 == 0) goto L_0x0069
            r1 = r12 & 2
            if (r1 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r8 = r0
            goto L_0x0086
        L_0x0069:
            writeState(r5, r2)     // Catch:{ all -> 0x00d1 }
            com.facebook.soloader.UnpackingSoSource$Unpacker r0 = r10.makeUnpacker()     // Catch:{ all -> 0x00d1 }
            com.facebook.soloader.UnpackingSoSource$DsoManifest r1 = r0.getDsoManifest()     // Catch:{ all -> 0x00c8 }
            com.facebook.soloader.UnpackingSoSource$InputDsoIterator r8 = r0.openDsoIterator()     // Catch:{ all -> 0x00c8 }
            r10.regenerate(r3, r1, r8)     // Catch:{ all -> 0x00bf }
            if (r8 == 0) goto L_0x0080
            r8.close()     // Catch:{ all -> 0x00c8 }
        L_0x0080:
            if (r0 == 0) goto L_0x0085
            r0.close()     // Catch:{ all -> 0x00d1 }
        L_0x0085:
            r8 = r1
        L_0x0086:
            r6.close()
            if (r8 != 0) goto L_0x008c
            return r2
        L_0x008c:
            com.facebook.soloader.UnpackingSoSource$1 r9 = new com.facebook.soloader.UnpackingSoSource$1
            r0 = r9
            r1 = r10
            r2 = r4
            r3 = r13
            r4 = r8
            r6 = r11
            r0.<init>(r2, r3, r4, r5, r6)
            r11 = r12 & 1
            if (r11 == 0) goto L_0x00bb
            java.lang.Thread r11 = new java.lang.Thread
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "SoSync:"
            r12.append(r13)
            java.io.File r13 = r10.soDirectory
            java.lang.String r13 = r13.getName()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r9, r12)
            r11.start()
            goto L_0x00be
        L_0x00bb:
            r9.run()
        L_0x00be:
            return r7
        L_0x00bf:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r11 = move-exception
            if (r8 == 0) goto L_0x00c7
            r8.close()     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            throw r11     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r11 = move-exception
            if (r0 == 0) goto L_0x00d0
            r0.close()     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            throw r11     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r11 = move-exception
            r6.close()     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.refreshLocked(com.facebook.soloader.FileLocker, int, byte[]):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:31|(2:33|34)|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b3, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b8, code lost:
        throw r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void regenerate(byte r9, com.facebook.soloader.UnpackingSoSource.DsoManifest r10, com.facebook.soloader.UnpackingSoSource.InputDsoIterator r11) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "regenerating DSO store "
            r0.append(r1)
            java.lang.Class r1 = r8.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r0.toString()
            java.io.File r0 = new java.io.File
            java.io.File r1 = r8.soDirectory
            java.lang.String r2 = "dso_manifest"
            r0.<init>(r1, r2)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r1.<init>(r0, r2)
            r0 = 0
            r2 = 1
            if (r9 != r2) goto L_0x0035
            com.facebook.soloader.UnpackingSoSource$DsoManifest r0 = com.facebook.soloader.UnpackingSoSource.DsoManifest.read(r1)     // Catch:{ Exception -> 0x0034 }
            goto L_0x0035
        L_0x0031:
            r9 = move-exception
            goto L_0x00b2
        L_0x0034:
        L_0x0035:
            r9 = 0
            if (r0 != 0) goto L_0x003f
            com.facebook.soloader.UnpackingSoSource$DsoManifest r0 = new com.facebook.soloader.UnpackingSoSource$DsoManifest     // Catch:{ all -> 0x0031 }
            com.facebook.soloader.UnpackingSoSource$Dso[] r3 = new com.facebook.soloader.UnpackingSoSource.Dso[r9]     // Catch:{ all -> 0x0031 }
            r0.<init>(r3)     // Catch:{ all -> 0x0031 }
        L_0x003f:
            com.facebook.soloader.UnpackingSoSource$Dso[] r10 = r10.dsos     // Catch:{ all -> 0x0031 }
            r8.deleteUnmentionedFiles(r10)     // Catch:{ all -> 0x0031 }
            r10 = 32768(0x8000, float:4.5918E-41)
            byte[] r10 = new byte[r10]     // Catch:{ all -> 0x0031 }
        L_0x0049:
            boolean r3 = r11.hasNext()     // Catch:{ all -> 0x0031 }
            if (r3 == 0) goto L_0x0096
            com.facebook.soloader.UnpackingSoSource$InputDso r3 = r11.next()     // Catch:{ all -> 0x0031 }
            r4 = 1
            r5 = 0
        L_0x0055:
            if (r4 == 0) goto L_0x0082
            com.facebook.soloader.UnpackingSoSource$Dso[] r6 = r0.dsos     // Catch:{ all -> 0x0080 }
            int r6 = r6.length     // Catch:{ all -> 0x0080 }
            if (r5 >= r6) goto L_0x0082
            com.facebook.soloader.UnpackingSoSource$Dso[] r6 = r0.dsos     // Catch:{ all -> 0x0080 }
            r6 = r6[r5]     // Catch:{ all -> 0x0080 }
            java.lang.String r6 = r6.name     // Catch:{ all -> 0x0080 }
            com.facebook.soloader.UnpackingSoSource$Dso r7 = r3.dso     // Catch:{ all -> 0x0080 }
            java.lang.String r7 = r7.name     // Catch:{ all -> 0x0080 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0080 }
            if (r6 == 0) goto L_0x007d
            com.facebook.soloader.UnpackingSoSource$Dso[] r6 = r0.dsos     // Catch:{ all -> 0x0080 }
            r6 = r6[r5]     // Catch:{ all -> 0x0080 }
            java.lang.String r6 = r6.hash     // Catch:{ all -> 0x0080 }
            com.facebook.soloader.UnpackingSoSource$Dso r7 = r3.dso     // Catch:{ all -> 0x0080 }
            java.lang.String r7 = r7.hash     // Catch:{ all -> 0x0080 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x0080 }
            if (r6 == 0) goto L_0x007d
            r4 = 0
        L_0x007d:
            int r5 = r5 + 1
            goto L_0x0055
        L_0x0080:
            r9 = move-exception
            goto L_0x0088
        L_0x0082:
            if (r4 == 0) goto L_0x0090
            r8.extractDso(r3, r10)     // Catch:{ all -> 0x0080 }
            goto L_0x0090
        L_0x0088:
            throw r9     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r9 = move-exception
            if (r3 == 0) goto L_0x008f
            r3.close()     // Catch:{ all -> 0x008f }
        L_0x008f:
            throw r9     // Catch:{ all -> 0x0031 }
        L_0x0090:
            if (r3 == 0) goto L_0x0049
            r3.close()     // Catch:{ all -> 0x0031 }
            goto L_0x0049
        L_0x0096:
            r1.close()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Finished regenerating DSO store "
            r9.append(r10)
            java.lang.Class r10 = r8.getClass()
            java.lang.String r10 = r10.getName()
            r9.append(r10)
            r9.toString()
            return
        L_0x00b2:
            throw r9     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r9 = move-exception
            r1.close()     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            goto L_0x00b9
        L_0x00b8:
            throw r9
        L_0x00b9:
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.regenerate(byte, com.facebook.soloader.UnpackingSoSource$DsoManifest, com.facebook.soloader.UnpackingSoSource$InputDsoIterator):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r3 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void writeState(java.io.File r3, byte r4) throws java.io.IOException {
        /*
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)
            r1 = 0
            r0.seek(r1)     // Catch:{ all -> 0x0021 }
            r0.write(r4)     // Catch:{ all -> 0x0021 }
            long r3 = r0.getFilePointer()     // Catch:{ all -> 0x0021 }
            r0.setLength(r3)     // Catch:{ all -> 0x0021 }
            java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ all -> 0x0021 }
            r3.sync()     // Catch:{ all -> 0x0021 }
            r0.close()
            return
        L_0x0021:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r3 = move-exception
            r0.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.writeState(java.io.File, byte):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r1 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getDepsBlock() throws java.io.IOException {
        /*
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            com.facebook.soloader.UnpackingSoSource$Unpacker r1 = r5.makeUnpacker()
            com.facebook.soloader.UnpackingSoSource$DsoManifest r2 = r1.getDsoManifest()     // Catch:{ all -> 0x0038 }
            com.facebook.soloader.UnpackingSoSource$Dso[] r2 = r2.dsos     // Catch:{ all -> 0x0038 }
            r3 = 1
            r0.writeByte(r3)     // Catch:{ all -> 0x0038 }
            int r3 = r2.length     // Catch:{ all -> 0x0038 }
            r0.writeInt(r3)     // Catch:{ all -> 0x0038 }
            r3 = 0
        L_0x0017:
            int r4 = r2.length     // Catch:{ all -> 0x0038 }
            if (r3 >= r4) goto L_0x002b
            r4 = r2[r3]     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = r4.name     // Catch:{ all -> 0x0038 }
            r0.writeString(r4)     // Catch:{ all -> 0x0038 }
            r4 = r2[r3]     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = r4.hash     // Catch:{ all -> 0x0038 }
            r0.writeString(r4)     // Catch:{ all -> 0x0038 }
            int r3 = r3 + 1
            goto L_0x0017
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            byte[] r1 = r0.marshall()
            r0.recycle()
            return r1
        L_0x0038:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            if (r1 == 0) goto L_0x0040
            r1.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            goto L_0x0042
        L_0x0041:
            throw r0
        L_0x0042:
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.getDepsBlock():byte[]");
    }

    public String[] getSoSourceAbis() {
        String[] strArr = this.mAbis;
        return strArr == null ? super.getSoSourceAbis() : strArr;
    }

    public int loadLibrary(String str, int i, ThreadPolicy threadPolicy) throws IOException {
        int loadLibraryFrom;
        synchronized (getLibraryLock(str)) {
            loadLibraryFrom = loadLibraryFrom(str, i, this.soDirectory, threadPolicy);
        }
        return loadLibraryFrom;
    }

    /* access modifiers changed from: protected */
    public abstract Unpacker makeUnpacker() throws IOException;

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public void prepare(int i) throws IOException {
        String str = "releasing dso store lock for ";
        String str2 = " (syncer thread started)";
        String str3 = "not releasing dso store lock for ";
        SysUtil.mkdirOrThrow(this.soDirectory);
        FileLocker lock = FileLocker.lock(new File(this.soDirectory, LOCK_FILE_NAME));
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("locked dso store ");
            sb.append(this.soDirectory);
            sb.toString();
            if (refreshLocked(lock, i, getDepsBlock())) {
                lock = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("dso store is up-to-date: ");
                sb2.append(this.soDirectory);
                sb2.toString();
            }
            if (lock != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(this.soDirectory);
                sb3.toString();
                lock.close();
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(this.soDirectory);
            sb4.append(str2);
            sb4.toString();
        } catch (Throwable th) {
            if (lock != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(this.soDirectory);
                sb5.toString();
                lock.close();
            } else {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str3);
                sb6.append(this.soDirectory);
                sb6.append(str2);
                sb6.toString();
            }
            throw th;
        }
    }

    public void setSoSourceAbis(String[] strArr) {
        this.mAbis = strArr;
    }

    protected UnpackingSoSource(Context context, File file) {
        super(file, 1);
        this.mContext = context;
    }

    /* access modifiers changed from: protected */
    public synchronized void prepare(String str) throws IOException {
        synchronized (getLibraryLock(str)) {
            this.mCorruptedLib = str;
            prepare(2);
        }
    }
}
