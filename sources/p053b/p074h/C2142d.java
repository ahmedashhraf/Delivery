package p053b.p074h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: b.h.d */
/* compiled from: MultiDexExtractor */
final class C2142d implements Closeable {

    /* renamed from: R */
    private static final String f8513R = "MultiDex";

    /* renamed from: S */
    private static final String f8514S = "classes";

    /* renamed from: T */
    static final String f8515T = ".dex";

    /* renamed from: U */
    private static final String f8516U = ".classes";

    /* renamed from: V */
    static final String f8517V = ".zip";

    /* renamed from: W */
    private static final int f8518W = 3;

    /* renamed from: X */
    private static final String f8519X = "multidex.version";

    /* renamed from: Y */
    private static final String f8520Y = "timestamp";

    /* renamed from: Z */
    private static final String f8521Z = "crc";

    /* renamed from: a0 */
    private static final String f8522a0 = "dex.number";

    /* renamed from: b0 */
    private static final String f8523b0 = "dex.crc.";

    /* renamed from: c0 */
    private static final String f8524c0 = "dex.time.";

    /* renamed from: d0 */
    private static final int f8525d0 = 16384;

    /* renamed from: e0 */
    private static final long f8526e0 = -1;

    /* renamed from: f0 */
    private static final String f8527f0 = "MultiDex.lock";

    /* renamed from: N */
    private final File f8528N;

    /* renamed from: O */
    private final RandomAccessFile f8529O;

    /* renamed from: P */
    private final FileChannel f8530P;

    /* renamed from: Q */
    private final FileLock f8531Q;

    /* renamed from: a */
    private final File f8532a;

    /* renamed from: b */
    private final long f8533b;

    /* renamed from: b.h.d$a */
    /* compiled from: MultiDexExtractor */
    class C2143a implements FileFilter {
        C2143a() {
        }

        public boolean accept(File file) {
            return !file.getName().equals(C2142d.f8527f0);
        }
    }

    /* renamed from: b.h.d$b */
    /* compiled from: MultiDexExtractor */
    private static class C2144b extends File {

        /* renamed from: a */
        public long f8535a = -1;

        public C2144b(File file, String str) {
            super(file, str);
        }
    }

    C2142d(File file, File file2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor(");
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(file2.getPath());
        sb.append(")");
        sb.toString();
        this.f8532a = file;
        this.f8528N = file2;
        this.f8533b = m11129b(file);
        File file3 = new File(file2, f8527f0);
        this.f8529O = new RandomAccessFile(file3, "rw");
        try {
            this.f8530P = this.f8529O.getChannel();
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Blocking on lock ");
                sb2.append(file3.getPath());
                sb2.toString();
                this.f8531Q = this.f8530P.lock();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(file3.getPath());
                sb3.append(" locked");
                sb3.toString();
            } catch (IOException e) {
                e = e;
                m11126a((Closeable) this.f8530P);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                m11126a((Closeable) this.f8530P);
                throw e;
            } catch (Error e3) {
                e = e3;
                m11126a((Closeable) this.f8530P);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m11126a((Closeable) this.f8529O);
            throw e4;
        }
    }

    /* renamed from: b */
    private static long m11129b(File file) throws IOException {
        long a = C2146f.m11132a(file);
        return a == -1 ? a - 1 : a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r10 = new java.lang.StringBuilder();
        r10.append("Failed to read crc from ");
        r10.append(r8.getAbsolutePath());
        r10.toString();
        r10 = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0086 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<p053b.p074h.C2142d.C2144b> m11130d() throws java.io.IOException {
        /*
            r14 = this;
            java.lang.String r0 = ".dex"
            java.lang.String r1 = "classes"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r14.f8532a
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ".classes"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r14.m11124a()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile
            java.io.File r5 = r14.f8532a
            r4.<init>(r5)
            r5 = 2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r6.<init>()     // Catch:{ all -> 0x0142 }
            r6.append(r1)     // Catch:{ all -> 0x0142 }
            r6.append(r5)     // Catch:{ all -> 0x0142 }
            r6.append(r0)     // Catch:{ all -> 0x0142 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0142 }
            java.util.zip.ZipEntry r6 = r4.getEntry(r6)     // Catch:{ all -> 0x0142 }
        L_0x0041:
            if (r6 == 0) goto L_0x013e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r7.<init>()     // Catch:{ all -> 0x0142 }
            r7.append(r2)     // Catch:{ all -> 0x0142 }
            r7.append(r5)     // Catch:{ all -> 0x0142 }
            java.lang.String r8 = ".zip"
            r7.append(r8)     // Catch:{ all -> 0x0142 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0142 }
            b.h.d$b r8 = new b.h.d$b     // Catch:{ all -> 0x0142 }
            java.io.File r9 = r14.f8528N     // Catch:{ all -> 0x0142 }
            r8.<init>(r9, r7)     // Catch:{ all -> 0x0142 }
            r3.add(r8)     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r7.<init>()     // Catch:{ all -> 0x0142 }
            java.lang.String r9 = "Extraction is needed for file "
            r7.append(r9)     // Catch:{ all -> 0x0142 }
            r7.append(r8)     // Catch:{ all -> 0x0142 }
            r7.toString()     // Catch:{ all -> 0x0142 }
            r7 = 0
            r9 = 0
            r10 = 0
        L_0x0074:
            r11 = 3
            if (r9 >= r11) goto L_0x00fa
            if (r10 != 0) goto L_0x00fa
            int r9 = r9 + 1
            m11127a(r4, r6, r8, r2)     // Catch:{ all -> 0x0142 }
            long r10 = m11129b(r8)     // Catch:{ IOException -> 0x0086 }
            r8.f8535a = r10     // Catch:{ IOException -> 0x0086 }
            r10 = 1
            goto L_0x009b
        L_0x0086:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r10.<init>()     // Catch:{ all -> 0x0142 }
            java.lang.String r11 = "Failed to read crc from "
            r10.append(r11)     // Catch:{ all -> 0x0142 }
            java.lang.String r11 = r8.getAbsolutePath()     // Catch:{ all -> 0x0142 }
            r10.append(r11)     // Catch:{ all -> 0x0142 }
            r10.toString()     // Catch:{ all -> 0x0142 }
            r10 = 0
        L_0x009b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r11.<init>()     // Catch:{ all -> 0x0142 }
            java.lang.String r12 = "Extraction "
            r11.append(r12)     // Catch:{ all -> 0x0142 }
            if (r10 == 0) goto L_0x00aa
            java.lang.String r12 = "succeeded"
            goto L_0x00ac
        L_0x00aa:
            java.lang.String r12 = "failed"
        L_0x00ac:
            r11.append(r12)     // Catch:{ all -> 0x0142 }
            java.lang.String r12 = " '"
            r11.append(r12)     // Catch:{ all -> 0x0142 }
            java.lang.String r12 = r8.getAbsolutePath()     // Catch:{ all -> 0x0142 }
            r11.append(r12)     // Catch:{ all -> 0x0142 }
            java.lang.String r12 = "': length "
            r11.append(r12)     // Catch:{ all -> 0x0142 }
            long r12 = r8.length()     // Catch:{ all -> 0x0142 }
            r11.append(r12)     // Catch:{ all -> 0x0142 }
            java.lang.String r12 = " - crc: "
            r11.append(r12)     // Catch:{ all -> 0x0142 }
            long r12 = r8.f8535a     // Catch:{ all -> 0x0142 }
            r11.append(r12)     // Catch:{ all -> 0x0142 }
            r11.toString()     // Catch:{ all -> 0x0142 }
            if (r10 != 0) goto L_0x0074
            r8.delete()     // Catch:{ all -> 0x0142 }
            boolean r11 = r8.exists()     // Catch:{ all -> 0x0142 }
            if (r11 == 0) goto L_0x0074
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r11.<init>()     // Catch:{ all -> 0x0142 }
            java.lang.String r12 = "Failed to delete corrupted secondary dex '"
            r11.append(r12)     // Catch:{ all -> 0x0142 }
            java.lang.String r12 = r8.getPath()     // Catch:{ all -> 0x0142 }
            r11.append(r12)     // Catch:{ all -> 0x0142 }
            java.lang.String r12 = "'"
            r11.append(r12)     // Catch:{ all -> 0x0142 }
            r11.toString()     // Catch:{ all -> 0x0142 }
            goto L_0x0074
        L_0x00fa:
            if (r10 == 0) goto L_0x0116
            int r5 = r5 + 1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r6.<init>()     // Catch:{ all -> 0x0142 }
            r6.append(r1)     // Catch:{ all -> 0x0142 }
            r6.append(r5)     // Catch:{ all -> 0x0142 }
            r6.append(r0)     // Catch:{ all -> 0x0142 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0142 }
            java.util.zip.ZipEntry r6 = r4.getEntry(r6)     // Catch:{ all -> 0x0142 }
            goto L_0x0041
        L_0x0116:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0142 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0142 }
            r1.<init>()     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = "Could not create zip file "
            r1.append(r2)     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = r8.getAbsolutePath()     // Catch:{ all -> 0x0142 }
            r1.append(r2)     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = " for secondary dex ("
            r1.append(r2)     // Catch:{ all -> 0x0142 }
            r1.append(r5)     // Catch:{ all -> 0x0142 }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0142 }
            r0.<init>(r1)     // Catch:{ all -> 0x0142 }
            throw r0     // Catch:{ all -> 0x0142 }
        L_0x013e:
            r4.close()     // Catch:{ IOException -> 0x0141 }
        L_0x0141:
            return r3
        L_0x0142:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0146 }
        L_0x0146:
            goto L_0x0148
        L_0x0147:
            throw r0
        L_0x0148:
            goto L_0x0147
        */
        throw new UnsupportedOperationException("Method not decompiled: p053b.p074h.C2142d.m11130d():java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<? extends File> mo9225a(Context context, String str, boolean z) throws IOException {
        List<? extends File> list;
        StringBuilder sb = new StringBuilder();
        sb.append("MultiDexExtractor.load(");
        sb.append(this.f8532a.getPath());
        String str2 = ", ";
        sb.append(str2);
        sb.append(z);
        sb.append(str2);
        sb.append(str);
        sb.append(")");
        sb.toString();
        if (this.f8531Q.isValid()) {
            if (z || m11128a(context, this.f8532a, this.f8533b, str)) {
                list = m11130d();
                m11125a(context, str, m11121a(this.f8532a), this.f8533b, list);
            } else {
                try {
                    list = m11123a(context, str);
                } catch (IOException unused) {
                    list = m11130d();
                    m11125a(context, str, m11121a(this.f8532a), this.f8533b, list);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("load found ");
            sb2.append(list.size());
            sb2.append(" secondary dex files");
            sb2.toString();
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    public void close() throws IOException {
        this.f8531Q.release();
        this.f8530P.close();
        this.f8529O.close();
    }

    /* renamed from: a */
    private List<C2144b> m11123a(Context context, String str) throws IOException {
        String str2 = str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8532a.getName());
        sb.append(f8516U);
        String sb2 = sb.toString();
        SharedPreferences a = m11122a(context);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(f8522a0);
        int i = a.getInt(sb3.toString(), 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append(i2);
            sb4.append(f8517V);
            C2144b bVar = new C2144b(this.f8528N, sb4.toString());
            if (bVar.isFile()) {
                bVar.f8535a = m11129b(bVar);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append(f8523b0);
                sb5.append(i2);
                long j = a.getLong(sb5.toString(), -1);
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                sb6.append(f8524c0);
                sb6.append(i2);
                long j2 = a.getLong(sb6.toString(), -1);
                long lastModified = bVar.lastModified();
                if (j2 == lastModified) {
                    String str3 = sb2;
                    SharedPreferences sharedPreferences = a;
                    if (j == bVar.f8535a) {
                        arrayList.add(bVar);
                        i2++;
                        a = sharedPreferences;
                        sb2 = str3;
                    }
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Invalid extracted dex: ");
                sb7.append(bVar);
                sb7.append(" (key \"");
                sb7.append(str2);
                sb7.append("\"), expected modification time: ");
                sb7.append(j2);
                sb7.append(", modification time: ");
                sb7.append(lastModified);
                sb7.append(", expected crc: ");
                sb7.append(j);
                sb7.append(", file crc: ");
                sb7.append(bVar.f8535a);
                throw new IOException(sb7.toString());
            }
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Missing extracted secondary dex file '");
            sb8.append(bVar.getPath());
            sb8.append("'");
            throw new IOException(sb8.toString());
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m11128a(Context context, File file, long j, String str) {
        SharedPreferences a = m11122a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("timestamp");
        if (a.getLong(sb.toString(), -1) == m11121a(file)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(f8521Z);
            if (a.getLong(sb2.toString(), -1) == j) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static long m11121a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: a */
    private static void m11125a(Context context, String str, long j, long j2, List<C2144b> list) {
        Editor edit = m11122a(context).edit();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("timestamp");
        edit.putLong(sb.toString(), j);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(f8521Z);
        edit.putLong(sb2.toString(), j2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(f8522a0);
        edit.putInt(sb3.toString(), list.size() + 1);
        int i = 2;
        for (C2144b bVar : list) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(f8523b0);
            sb4.append(i);
            edit.putLong(sb4.toString(), bVar.f8535a);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(f8524c0);
            sb5.append(i);
            edit.putLong(sb5.toString(), bVar.lastModified());
            i++;
        }
        edit.commit();
    }

    /* renamed from: a */
    private static SharedPreferences m11122a(Context context) {
        return context.getSharedPreferences(f8519X, VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /* renamed from: a */
    private void m11124a() {
        File[] listFiles = this.f8528N.listFiles(new C2143a());
        if (listFiles == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to list secondary dex dir content (");
            sb.append(this.f8528N.getPath());
            sb.append(").");
            sb.toString();
            return;
        }
        for (File file : listFiles) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Trying to delete old file ");
            sb2.append(file.getPath());
            sb2.append(" of size ");
            sb2.append(file.length());
            sb2.toString();
            if (!file.delete()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to delete old file ");
                sb3.append(file.getPath());
                sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Deleted old file ");
                sb4.append(file.getPath());
                sb4.toString();
            }
        }
    }

    /* renamed from: a */
    private static void m11127a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        StringBuilder sb = new StringBuilder();
        sb.append("tmp-");
        sb.append(str);
        File createTempFile = File.createTempFile(sb.toString(), f8517V, file.getParentFile());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Extracting ");
        sb2.append(createTempFile.getPath());
        sb2.toString();
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Renaming to ");
                sb3.append(file.getPath());
                sb3.toString();
                if (createTempFile.renameTo(file)) {
                    m11126a((Closeable) inputStream);
                    createTempFile.delete();
                    return;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Failed to rename \"");
                sb4.append(createTempFile.getAbsolutePath());
                sb4.append("\" to \"");
                sb4.append(file.getAbsolutePath());
                sb4.append("\"");
                throw new IOException(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Failed to mark readonly \"");
            sb5.append(createTempFile.getAbsolutePath());
            sb5.append("\" (tmp of \"");
            sb5.append(file.getAbsolutePath());
            sb5.append("\")");
            throw new IOException(sb5.toString());
        } catch (Throwable th) {
            m11126a((Closeable) inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m11126a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
