package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.UnpackingSoSource.Dso;
import com.facebook.soloader.UnpackingSoSource.DsoManifest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class ExoSoSource extends UnpackingSoSource {

    private final class ExoUnpacker extends Unpacker {
        /* access modifiers changed from: private */
        public final FileDso[] mDsos;
        final /* synthetic */ ExoSoSource this$0;

        private final class FileBackedInputDsoIterator extends InputDsoIterator {
            private int mCurrentDso;

            private FileBackedInputDsoIterator() {
            }

            public boolean hasNext() {
                return this.mCurrentDso < ExoUnpacker.this.mDsos.length;
            }

            public InputDso next() throws IOException {
                FileDso[] access$100 = ExoUnpacker.this.mDsos;
                int i = this.mCurrentDso;
                this.mCurrentDso = i + 1;
                FileDso fileDso = access$100[i];
                FileInputStream fileInputStream = new FileInputStream(fileDso.backingFile);
                try {
                    return new InputDso(fileDso, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:36|37|38|39|40|41) */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r8.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e8, code lost:
            r10.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f2, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f3, code lost:
            r2 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            r8.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            throw r2;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00f7 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        ExoUnpacker(com.facebook.soloader.ExoSoSource r18, com.facebook.soloader.UnpackingSoSource r19) throws java.io.IOException {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                r1.this$0 = r0
                r17.<init>()
                android.content.Context r0 = r0.mContext
                java.io.File r2 = new java.io.File
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "/data/local/tmp/exopackage/"
                r3.append(r4)
                java.lang.String r0 = r0.getPackageName()
                r3.append(r0)
                java.lang.String r0 = "/native-libs/"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
                r3.<init>()
                java.lang.String[] r4 = com.facebook.soloader.SysUtil.getSupportedAbis()
                int r5 = r4.length
                r6 = 0
                r7 = 0
            L_0x003b:
                if (r7 >= r5) goto L_0x0100
                r8 = r4[r7]
                java.io.File r9 = new java.io.File
                r9.<init>(r2, r8)
                boolean r10 = r9.isDirectory()
                if (r10 != 0) goto L_0x004c
                goto L_0x00eb
            L_0x004c:
                r3.add(r8)
                java.io.File r8 = new java.io.File
                java.lang.String r10 = "metadata.txt"
                r8.<init>(r9, r10)
                boolean r10 = r8.isFile()
                if (r10 != 0) goto L_0x005e
                goto L_0x00eb
            L_0x005e:
                java.io.FileReader r10 = new java.io.FileReader
                r10.<init>(r8)
                java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ all -> 0x00f8 }
                r8.<init>(r10)     // Catch:{ all -> 0x00f8 }
            L_0x0068:
                java.lang.String r11 = r8.readLine()     // Catch:{ all -> 0x00f0 }
                if (r11 == 0) goto L_0x00e5
                int r12 = r11.length()     // Catch:{ all -> 0x00f0 }
                if (r12 != 0) goto L_0x0075
                goto L_0x0068
            L_0x0075:
                r12 = 32
                int r12 = r11.indexOf(r12)     // Catch:{ all -> 0x00f0 }
                r13 = -1
                if (r12 == r13) goto L_0x00c9
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
                r13.<init>()     // Catch:{ all -> 0x00f0 }
                java.lang.String r14 = r11.substring(r6, r12)     // Catch:{ all -> 0x00f0 }
                r13.append(r14)     // Catch:{ all -> 0x00f0 }
                java.lang.String r14 = ".so"
                r13.append(r14)     // Catch:{ all -> 0x00f0 }
                java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00f0 }
                int r14 = r0.size()     // Catch:{ all -> 0x00f0 }
                r15 = 0
            L_0x0098:
                if (r15 >= r14) goto L_0x00b0
                java.lang.Object r16 = r0.get(r15)     // Catch:{ all -> 0x00f0 }
                r6 = r16
                com.facebook.soloader.ExoSoSource$FileDso r6 = (com.facebook.soloader.ExoSoSource.FileDso) r6     // Catch:{ all -> 0x00f0 }
                java.lang.String r6 = r6.name     // Catch:{ all -> 0x00f0 }
                boolean r6 = r6.equals(r13)     // Catch:{ all -> 0x00f0 }
                if (r6 == 0) goto L_0x00ac
                r6 = 1
                goto L_0x00b1
            L_0x00ac:
                int r15 = r15 + 1
                r6 = 0
                goto L_0x0098
            L_0x00b0:
                r6 = 0
            L_0x00b1:
                if (r6 == 0) goto L_0x00b5
            L_0x00b3:
                r6 = 0
                goto L_0x0068
            L_0x00b5:
                int r12 = r12 + 1
                java.lang.String r6 = r11.substring(r12)     // Catch:{ all -> 0x00f0 }
                com.facebook.soloader.ExoSoSource$FileDso r11 = new com.facebook.soloader.ExoSoSource$FileDso     // Catch:{ all -> 0x00f0 }
                java.io.File r12 = new java.io.File     // Catch:{ all -> 0x00f0 }
                r12.<init>(r9, r6)     // Catch:{ all -> 0x00f0 }
                r11.<init>(r13, r6, r12)     // Catch:{ all -> 0x00f0 }
                r0.add(r11)     // Catch:{ all -> 0x00f0 }
                goto L_0x00b3
            L_0x00c9:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00f0 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f0 }
                r2.<init>()     // Catch:{ all -> 0x00f0 }
                java.lang.String r3 = "illegal line in exopackage metadata: ["
                r2.append(r3)     // Catch:{ all -> 0x00f0 }
                r2.append(r11)     // Catch:{ all -> 0x00f0 }
                java.lang.String r3 = "]"
                r2.append(r3)     // Catch:{ all -> 0x00f0 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00f0 }
                r0.<init>(r2)     // Catch:{ all -> 0x00f0 }
                throw r0     // Catch:{ all -> 0x00f0 }
            L_0x00e5:
                r8.close()     // Catch:{ all -> 0x00f8 }
                r10.close()
            L_0x00eb:
                int r7 = r7 + 1
                r6 = 0
                goto L_0x003b
            L_0x00f0:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x00f2 }
            L_0x00f2:
                r0 = move-exception
                r2 = r0
                r8.close()     // Catch:{ all -> 0x00f7 }
            L_0x00f7:
                throw r2     // Catch:{ all -> 0x00f8 }
            L_0x00f8:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x00fa }
            L_0x00fa:
                r0 = move-exception
                r2 = r0
                r10.close()     // Catch:{ all -> 0x00ff }
            L_0x00ff:
                throw r2
            L_0x0100:
                int r2 = r3.size()
                java.lang.String[] r2 = new java.lang.String[r2]
                java.lang.Object[] r2 = r3.toArray(r2)
                java.lang.String[] r2 = (java.lang.String[]) r2
                r3 = r19
                r3.setSoSourceAbis(r2)
                int r2 = r0.size()
                com.facebook.soloader.ExoSoSource$FileDso[] r2 = new com.facebook.soloader.ExoSoSource.FileDso[r2]
                java.lang.Object[] r0 = r0.toArray(r2)
                com.facebook.soloader.ExoSoSource$FileDso[] r0 = (com.facebook.soloader.ExoSoSource.FileDso[]) r0
                r1.mDsos = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.ExoSoSource.ExoUnpacker.<init>(com.facebook.soloader.ExoSoSource, com.facebook.soloader.UnpackingSoSource):void");
        }

        /* access modifiers changed from: protected */
        public DsoManifest getDsoManifest() throws IOException {
            return new DsoManifest(this.mDsos);
        }

        /* access modifiers changed from: protected */
        public InputDsoIterator openDsoIterator() throws IOException {
            return new FileBackedInputDsoIterator();
        }
    }

    private static final class FileDso extends Dso {
        final File backingFile;

        FileDso(String str, String str2, File file) {
            super(str, str2);
            this.backingFile = file;
        }
    }

    public ExoSoSource(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: protected */
    public Unpacker makeUnpacker() throws IOException {
        return new ExoUnpacker(this, this);
    }
}
