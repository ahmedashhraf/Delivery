package p076c.p112d.p113a.p130b.p131a.p133d;

import com.google.android.play.core.internal.C5744i0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* renamed from: c.d.a.b.a.d.f */
public final class C2698f {

    /* renamed from: b */
    private static final Pattern f9818b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: a */
    private final C2699g f9819a;

    C2698f(C2699g gVar) throws IOException {
        this.f9819a = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Set<File> m13084a(Set<C2706n> set, C2711s sVar, ZipFile zipFile) throws IOException {
        HashSet hashSet = new HashSet();
        m13087a(sVar, set, (C2704l) new C2702j(hashSet, sVar, zipFile));
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e2 A[SYNTHETIC, Splitter:B:32:0x00e2] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13086a(p076c.p112d.p113a.p130b.p131a.p133d.C2711s r13, p076c.p112d.p113a.p130b.p131a.p133d.C2705m r14) throws java.io.IOException {
        /*
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x00de }
            java.io.File r2 = r13.mo10359a()     // Catch:{ IOException -> 0x00de }
            r1.<init>(r2)     // Catch:{ IOException -> 0x00de }
            java.lang.String r13 = r13.mo10360b()     // Catch:{ IOException -> 0x00dc }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ IOException -> 0x00dc }
            r0.<init>()     // Catch:{ IOException -> 0x00dc }
            java.util.Enumeration r2 = r1.entries()     // Catch:{ IOException -> 0x00dc }
        L_0x0017:
            boolean r3 = r2.hasMoreElements()     // Catch:{ IOException -> 0x00dc }
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0065
            java.lang.Object r3 = r2.nextElement()     // Catch:{ IOException -> 0x00dc }
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch:{ IOException -> 0x00dc }
            java.lang.String r7 = r3.getName()     // Catch:{ IOException -> 0x00dc }
            java.util.regex.Pattern r8 = f9818b     // Catch:{ IOException -> 0x00dc }
            java.util.regex.Matcher r7 = r8.matcher(r7)     // Catch:{ IOException -> 0x00dc }
            boolean r8 = r7.matches()     // Catch:{ IOException -> 0x00dc }
            if (r8 == 0) goto L_0x0017
            java.lang.String r8 = r7.group(r6)     // Catch:{ IOException -> 0x00dc }
            java.lang.String r7 = r7.group(r4)     // Catch:{ IOException -> 0x00dc }
            java.lang.String r9 = "NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'"
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x00dc }
            r10[r5] = r13     // Catch:{ IOException -> 0x00dc }
            r10[r6] = r7     // Catch:{ IOException -> 0x00dc }
            r10[r4] = r8     // Catch:{ IOException -> 0x00dc }
            java.lang.String.format(r9, r10)     // Catch:{ IOException -> 0x00dc }
            java.lang.Object r4 = r0.get(r8)     // Catch:{ IOException -> 0x00dc }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ IOException -> 0x00dc }
            if (r4 != 0) goto L_0x005c
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ IOException -> 0x00dc }
            r4.<init>()     // Catch:{ IOException -> 0x00dc }
            r0.put(r8, r4)     // Catch:{ IOException -> 0x00dc }
        L_0x005c:
            c.d.a.b.a.d.n r5 = new c.d.a.b.a.d.n     // Catch:{ IOException -> 0x00dc }
            r5.<init>(r3, r7)     // Catch:{ IOException -> 0x00dc }
            r4.add(r5)     // Catch:{ IOException -> 0x00dc }
            goto L_0x0017
        L_0x0065:
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ IOException -> 0x00dc }
            r13.<init>()     // Catch:{ IOException -> 0x00dc }
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS     // Catch:{ IOException -> 0x00dc }
            int r3 = r2.length     // Catch:{ IOException -> 0x00dc }
            r7 = 0
        L_0x006e:
            if (r7 >= r3) goto L_0x00cc
            r8 = r2[r7]     // Catch:{ IOException -> 0x00dc }
            boolean r9 = r0.containsKey(r8)     // Catch:{ IOException -> 0x00dc }
            if (r9 == 0) goto L_0x00c0
            java.lang.String r9 = "NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x00dc }
            r10[r5] = r8     // Catch:{ IOException -> 0x00dc }
            java.lang.String.format(r9, r10)     // Catch:{ IOException -> 0x00dc }
            java.lang.Object r9 = r0.get(r8)     // Catch:{ IOException -> 0x00dc }
            java.util.Set r9 = (java.util.Set) r9     // Catch:{ IOException -> 0x00dc }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IOException -> 0x00dc }
        L_0x008b:
            boolean r10 = r9.hasNext()     // Catch:{ IOException -> 0x00dc }
            if (r10 == 0) goto L_0x00c9
            java.lang.Object r10 = r9.next()     // Catch:{ IOException -> 0x00dc }
            c.d.a.b.a.d.n r10 = (p076c.p112d.p113a.p130b.p131a.p133d.C2706n) r10     // Catch:{ IOException -> 0x00dc }
            java.lang.String r11 = r10.f9833a     // Catch:{ IOException -> 0x00dc }
            boolean r11 = r13.containsKey(r11)     // Catch:{ IOException -> 0x00dc }
            if (r11 == 0) goto L_0x00ad
            java.lang.String r11 = "NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI"
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00dc }
            java.lang.String r10 = r10.f9833a     // Catch:{ IOException -> 0x00dc }
            r12[r5] = r10     // Catch:{ IOException -> 0x00dc }
            r12[r6] = r8     // Catch:{ IOException -> 0x00dc }
            java.lang.String.format(r11, r12)     // Catch:{ IOException -> 0x00dc }
            goto L_0x008b
        L_0x00ad:
            java.lang.String r11 = r10.f9833a     // Catch:{ IOException -> 0x00dc }
            r13.put(r11, r10)     // Catch:{ IOException -> 0x00dc }
            java.lang.String r11 = "NativeLibraryExtractor: using library %s for ABI %s"
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00dc }
            java.lang.String r10 = r10.f9833a     // Catch:{ IOException -> 0x00dc }
            r12[r5] = r10     // Catch:{ IOException -> 0x00dc }
            r12[r6] = r8     // Catch:{ IOException -> 0x00dc }
            java.lang.String.format(r11, r12)     // Catch:{ IOException -> 0x00dc }
            goto L_0x008b
        L_0x00c0:
            java.lang.String r9 = "NativeLibraryExtractor: there are no native libraries for supported ABI %s"
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x00dc }
            r10[r5] = r8     // Catch:{ IOException -> 0x00dc }
            java.lang.String.format(r9, r10)     // Catch:{ IOException -> 0x00dc }
        L_0x00c9:
            int r7 = r7 + 1
            goto L_0x006e
        L_0x00cc:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ IOException -> 0x00dc }
            java.util.Collection r13 = r13.values()     // Catch:{ IOException -> 0x00dc }
            r0.<init>(r13)     // Catch:{ IOException -> 0x00dc }
            r14.mo10382a(r1, r0)     // Catch:{ IOException -> 0x00dc }
            r1.close()     // Catch:{ IOException -> 0x00dc }
            return
        L_0x00dc:
            r13 = move-exception
            goto L_0x00e0
        L_0x00de:
            r13 = move-exception
            r1 = r0
        L_0x00e0:
            if (r1 == 0) goto L_0x00ea
            r1.close()     // Catch:{ IOException -> 0x00e6 }
            goto L_0x00ea
        L_0x00e6:
            r14 = move-exception
            com.google.android.play.core.internal.C5744i0.m25251a(r13, r14)
        L_0x00ea:
            goto L_0x00ec
        L_0x00eb:
            throw r13
        L_0x00ec:
            goto L_0x00eb
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p113a.p130b.p131a.p133d.C2698f.m13086a(c.d.a.b.a.d.s, c.d.a.b.a.d.m):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m13087a(C2711s sVar, Set<C2706n> set, C2704l lVar) throws IOException {
        for (C2706n nVar : set) {
            File a = this.f9819a.mo10369a(sVar.mo10360b(), nVar.f9833a);
            lVar.mo10381a(nVar, a, a.exists() && a.length() == nVar.f9834b.getSize());
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m13088a(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C5744i0.m25251a(th, th2);
            }
        } else {
            fileOutputStream.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m13089a(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                C5744i0.m25251a(th, th2);
            }
        } else {
            inputStream.close();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        m13089a((java.lang.Throwable) null, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        m13088a(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002c, code lost:
        if (r2 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002e, code lost:
        m13089a(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        m13088a((java.lang.Throwable) null, r3);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13091b(java.util.zip.ZipFile r2, java.util.zip.ZipEntry r3, java.io.File r4) throws java.io.IOException {
        /*
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            java.io.InputStream r2 = r2.getInputStream(r3)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0029 }
            r3.<init>(r4)     // Catch:{ all -> 0x0029 }
        L_0x000d:
            int r4 = r2.read(r0)     // Catch:{ all -> 0x0022 }
            if (r4 <= 0) goto L_0x0018
            r1 = 0
            r3.write(r0, r1, r4)     // Catch:{ all -> 0x0022 }
            goto L_0x000d
        L_0x0018:
            r4 = 0
            m13088a(r4, r3)     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0021
            m13089a(r4, r2)
        L_0x0021:
            return
        L_0x0022:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r0 = move-exception
            m13088a(r4, r3)     // Catch:{ all -> 0x0029 }
            throw r0     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002b }
        L_0x002b:
            r4 = move-exception
            if (r2 == 0) goto L_0x0031
            m13089a(r3, r2)
        L_0x0031:
            goto L_0x0033
        L_0x0032:
            throw r4
        L_0x0033:
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p113a.p130b.p131a.p133d.C2698f.m13091b(java.util.zip.ZipFile, java.util.zip.ZipEntry, java.io.File):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Set<File> mo10365a() throws IOException {
        boolean z;
        Set<C2711s> d = this.f9819a.mo10376d();
        for (String str : this.f9819a.mo10378e()) {
            Iterator it = d.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C2711s) it.next()).mo10360b().equals(str)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", new Object[]{str});
                this.f9819a.mo10377d(str);
            }
        }
        HashSet hashSet = new HashSet();
        for (C2711s sVar : d) {
            HashSet hashSet2 = new HashSet();
            m13086a(sVar, (C2705m) new C2703k(this, hashSet2, sVar));
            for (File file : this.f9819a.mo10379e(sVar.mo10360b())) {
                if (!hashSet2.contains(file)) {
                    String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", new Object[]{file.getAbsolutePath(), sVar.mo10360b(), sVar.mo10359a().getAbsolutePath()});
                    this.f9819a.mo10373b(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Set<File> mo10366a(C2711s sVar) throws IOException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        m13086a(sVar, (C2705m) new C2701i(this, sVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }
}
