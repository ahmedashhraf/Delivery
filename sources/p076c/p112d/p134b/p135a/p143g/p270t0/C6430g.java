package p076c.p112d.p134b.p135a.p143g.p270t0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.logging.Logger;
import p076c.p112d.p134b.p135a.p143g.C6364b0;
import p076c.p112d.p134b.p135a.p143g.C6423t;

/* renamed from: c.d.b.a.g.t0.g */
/* compiled from: FileDataStoreFactory */
public class C6430g extends C6425b {

    /* renamed from: e */
    private static final Logger f17905e = Logger.getLogger(C6430g.class.getName());

    /* renamed from: d */
    private final File f17906d;

    /* renamed from: c.d.b.a.g.t0.g$a */
    /* compiled from: FileDataStoreFactory */
    static class C6431a<V extends Serializable> extends C6426c<V> {

        /* renamed from: e */
        private final File f17907e;

        C6431a(C6430g gVar, File file, String str) throws IOException {
            super(gVar, str);
            this.f17907e = new File(file, str);
            if (C6423t.m29820a(this.f17907e)) {
                String valueOf = String.valueOf(String.valueOf(this.f17907e));
                StringBuilder sb = new StringBuilder(valueOf.length() + 31);
                sb.append("unable to use a symbolic link: ");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            } else if (this.f17907e.createNewFile()) {
                this.f17904d = C6364b0.m29631a();
                mo25868b();
            } else {
                this.f17904d = (HashMap) C6423t.m29815a((InputStream) new FileInputStream(this.f17907e));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo25868b() throws IOException {
            C6423t.m29819a((Object) this.f17904d, (OutputStream) new FileOutputStream(this.f17907e));
        }

        /* renamed from: a */
        public C6430g m29845a() {
            return (C6430g) super.mo25858a();
        }
    }

    public C6430g(File file) throws IOException {
        File canonicalFile = file.getCanonicalFile();
        this.f17906d = canonicalFile;
        if (C6423t.m29820a(canonicalFile)) {
            String valueOf = String.valueOf(String.valueOf(canonicalFile));
            StringBuilder sb = new StringBuilder(valueOf.length() + 31);
            sb.append("unable to use a symbolic link: ");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        } else if (canonicalFile.exists() || canonicalFile.mkdirs()) {
            m29841a(canonicalFile);
        } else {
            String valueOf2 = String.valueOf(String.valueOf(canonicalFile));
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 28);
            sb2.append("unable to create directory: ");
            sb2.append(valueOf2);
            throw new IOException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final File mo25874a() {
        return this.f17906d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <V extends Serializable> C6427d<V> mo25865b(String str) throws IOException {
        return new C6431a(this, this.f17906d, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0085, code lost:
        if (((java.lang.Boolean) r3.invoke(r10, new java.lang.Object[]{java.lang.Boolean.valueOf(false), java.lang.Boolean.valueOf(false)})).booleanValue() == false) goto L_0x0087;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m29841a(java.io.File r10) throws java.io.IOException {
        /*
            java.lang.Class<java.io.File> r0 = java.io.File.class
            r1 = 2
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r4 = 0
            r2[r4] = r3     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r5 = 1
            r2[r5] = r3     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.String r3 = "setReadable"
            java.lang.reflect.Method r0 = r0.getMethod(r3, r2)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Class<java.io.File> r2 = java.io.File.class
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r3[r4] = r6     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r3[r5] = r6     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.String r6 = "setWritable"
            java.lang.reflect.Method r2 = r2.getMethod(r6, r3)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Class<java.io.File> r3 = java.io.File.class
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r6[r4] = r7     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r6[r5] = r7     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.String r7 = "setExecutable"
            java.lang.reflect.Method r3 = r3.getMethod(r7, r6)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r6[r4] = r7     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r6[r5] = r7     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Object r6 = r0.invoke(r10, r6)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            boolean r6 = r6.booleanValue()     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            if (r6 == 0) goto L_0x0087
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r6[r4] = r7     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r6[r5] = r7     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Object r6 = r2.invoke(r10, r6)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            boolean r6 = r6.booleanValue()     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            if (r6 == 0) goto L_0x0087
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r6[r4] = r7     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r6[r5] = r7     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Object r6 = r3.invoke(r10, r6)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            boolean r6 = r6.booleanValue()     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            if (r6 != 0) goto L_0x00ab
        L_0x0087:
            java.util.logging.Logger r6 = f17905e     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.String r7 = java.lang.String.valueOf(r10)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            int r9 = r7.length()     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            int r9 = r9 + 44
            r8.<init>(r9)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.String r9 = "unable to change permissions for everybody: "
            r8.append(r9)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r8.append(r7)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.String r7 = r8.toString()     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r6.warning(r7)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
        L_0x00ab:
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r6[r4] = r7     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r6[r5] = r7     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Object r0 = r0.invoke(r10, r6)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            boolean r0 = r0.booleanValue()     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            if (r0 == 0) goto L_0x00f9
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r0[r4] = r6     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r0[r5] = r6     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Object r0 = r2.invoke(r10, r0)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            boolean r0 = r0.booleanValue()     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            if (r0 == 0) goto L_0x00f9
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r0[r4] = r1     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r0[r5] = r1     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Object r0 = r3.invoke(r10, r0)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            boolean r0 = r0.booleanValue()     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            if (r0 != 0) goto L_0x0147
        L_0x00f9:
            java.util.logging.Logger r0 = f17905e     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.String r1 = java.lang.String.valueOf(r10)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            int r3 = r1.length()     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            int r3 = r3 + 40
            r2.<init>(r3)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.String r3 = "unable to change permissions for owner: "
            r2.append(r3)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r2.append(r1)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            java.lang.String r1 = r2.toString()     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            r0.warning(r1)     // Catch:{ InvocationTargetException -> 0x0148, NoSuchMethodException -> 0x011e, IllegalAccessException | IllegalArgumentException | SecurityException -> 0x0147 }
            goto L_0x0147
        L_0x011e:
            java.util.logging.Logger r0 = f17905e
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r10.length()
            int r2 = r2 + 93
            r1.<init>(r2)
            java.lang.String r2 = "Unable to set permissions for "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = ", likely because you are running a version of Java prior to 1.6"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.warning(r10)
        L_0x0147:
            return
        L_0x0148:
            r10 = move-exception
            java.lang.Throwable r10 = r10.getCause()
            java.lang.Class<java.io.IOException> r0 = java.io.IOException.class
            p076c.p112d.p134b.p135a.p143g.C6406p0.m29737a(r10, r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p134b.p135a.p143g.p270t0.C6430g.m29841a(java.io.File):void");
    }
}
