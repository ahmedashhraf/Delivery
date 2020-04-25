package p076c.p112d.p113a.p130b.p131a.p133d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import com.google.android.play.core.internal.C5732a0;
import com.google.android.play.core.internal.C5733aa;
import com.google.android.play.core.internal.C5738d;
import com.google.android.play.core.internal.C5740f;
import com.google.android.play.core.splitinstall.C5780u;
import com.google.android.play.core.splitinstall.C5781w;
import com.google.android.play.core.splitinstall.C5782x;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c.d.a.b.a.d.a */
public class C2693a {

    /* renamed from: c */
    private static final AtomicReference<C2693a> f9812c = new AtomicReference<>(null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2699g f9813a;

    /* renamed from: b */
    private final Set<String> f9814b = new HashSet();

    private C2693a(Context context) {
        try {
            this.f9813a = new C2699g(context);
        } catch (NameNotFoundException | IOException e) {
            throw new C5733aa("Failed to initialize FileStorage", e);
        }
    }

    /* renamed from: a */
    private static void m13067a(Context context, Set<File> set) {
        AssetManager assets = context.getAssets();
        for (File path : set) {
            int intValue = ((Integer) C5732a0.m25199a((Object) assets, "addAssetPath", Integer.class, String.class, path.getPath())).intValue();
            StringBuilder sb = new StringBuilder(39);
            sb.append("addAssetPath completed with ");
            sb.append(intValue);
            sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m13068a() {
        return f9812c.get() != null;
    }

    /* renamed from: a */
    public static boolean m13069a(Context context) {
        return m13070a(context, true);
    }

    /* renamed from: a */
    private static boolean m13070a(Context context, boolean z) {
        if (m13075b()) {
            return false;
        }
        C2693a aVar = (C2693a) f9812c.get();
        if (f9812c.compareAndSet(null, new C2693a(context))) {
            C5738d dVar = new C5738d(context, C2697e.m13082a(), new C5740f(context, aVar.f9813a, new C5732a0()), aVar.f9813a, new C5782x());
            C5780u.m25337a(dVar);
            C5781w.m25340a(new C2708p(aVar));
            C2697e.m13082a().execute(new C2707o(context));
        }
        try {
            aVar.m13074b(context, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001f A[SYNTHETIC, Splitter:B:15:0x001f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m13071a(p076c.p112d.p113a.p130b.p131a.p133d.C2711s r2) throws java.io.IOException {
        /*
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x001c }
            java.io.File r2 = r2.mo10359a()     // Catch:{ IOException -> 0x001c }
            r1.<init>(r2)     // Catch:{ IOException -> 0x001c }
            java.lang.String r2 = "classes.dex"
            java.util.zip.ZipEntry r2 = r1.getEntry(r2)     // Catch:{ IOException -> 0x0019 }
            if (r2 == 0) goto L_0x0014
            r2 = 1
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            r1.close()     // Catch:{ IOException -> 0x0019 }
            return r2
        L_0x0019:
            r2 = move-exception
            r0 = r1
            goto L_0x001d
        L_0x001c:
            r2 = move-exception
        L_0x001d:
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r0 = move-exception
            com.google.android.play.core.internal.C5744i0.m25251a(r2, r0)
        L_0x0027:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p113a.p130b.p131a.p133d.C2693a.m13071a(c.d.a.b.a.d.s):boolean");
    }

    /* renamed from: b */
    private final synchronized void m13073b(Context context) throws IOException {
        HashSet hashSet = new HashSet();
        C2693a aVar = (C2693a) f9812c.get();
        for (String b : aVar == null ? Collections.emptySet() : aVar.m13077c()) {
            hashSet.add(this.f9813a.mo10372b(b));
        }
        m13067a(context, (Set<File>) hashSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0145  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m13074b(android.content.Context r9, boolean r10) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r10 == 0) goto L_0x0009
            c.d.a.b.a.d.g r0 = r8.f9813a     // Catch:{ all -> 0x01d8 }
            r0.mo10370a()     // Catch:{ all -> 0x01d8 }
            goto L_0x0015
        L_0x0009:
            java.util.concurrent.Executor r0 = p076c.p112d.p113a.p130b.p131a.p133d.C2697e.m13082a()     // Catch:{ all -> 0x01d8 }
            c.d.a.b.a.d.r r1 = new c.d.a.b.a.d.r     // Catch:{ all -> 0x01d8 }
            r1.<init>(r8)     // Catch:{ all -> 0x01d8 }
            r0.execute(r1)     // Catch:{ all -> 0x01d8 }
        L_0x0015:
            java.util.List r0 = m13076c(r9)     // Catch:{ all -> 0x01d8 }
            c.d.a.b.a.d.g r1 = r8.f9813a     // Catch:{ all -> 0x01d8 }
            java.util.Set r1 = r1.mo10376d()     // Catch:{ all -> 0x01d8 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x01d8 }
            r2.<init>()     // Catch:{ all -> 0x01d8 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x01d8 }
        L_0x0028:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x01d8 }
            if (r4 == 0) goto L_0x004d
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x01d8 }
            c.d.a.b.a.d.s r4 = (p076c.p112d.p113a.p130b.p131a.p133d.C2711s) r4     // Catch:{ all -> 0x01d8 }
            java.lang.String r4 = r4.mo10360b()     // Catch:{ all -> 0x01d8 }
            boolean r5 = r0.contains(r4)     // Catch:{ all -> 0x01d8 }
            if (r5 == 0) goto L_0x0028
            if (r10 == 0) goto L_0x0046
            c.d.a.b.a.d.g r5 = r8.f9813a     // Catch:{ all -> 0x01d8 }
            r5.mo10380f(r4)     // Catch:{ all -> 0x01d8 }
            goto L_0x0049
        L_0x0046:
            r2.add(r4)     // Catch:{ all -> 0x01d8 }
        L_0x0049:
            r3.remove()     // Catch:{ all -> 0x01d8 }
            goto L_0x0028
        L_0x004d:
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x01d8 }
            if (r3 != 0) goto L_0x005f
            java.util.concurrent.Executor r3 = p076c.p112d.p113a.p130b.p131a.p133d.C2697e.m13082a()     // Catch:{ all -> 0x01d8 }
            c.d.a.b.a.d.q r4 = new c.d.a.b.a.d.q     // Catch:{ all -> 0x01d8 }
            r4.<init>(r8, r2)     // Catch:{ all -> 0x01d8 }
            r3.execute(r4)     // Catch:{ all -> 0x01d8 }
        L_0x005f:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x01d8 }
            r2.<init>()     // Catch:{ all -> 0x01d8 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x01d8 }
        L_0x0068:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x01d8 }
            if (r4 == 0) goto L_0x0082
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x01d8 }
            c.d.a.b.a.d.s r4 = (p076c.p112d.p113a.p130b.p131a.p133d.C2711s) r4     // Catch:{ all -> 0x01d8 }
            java.lang.String r4 = r4.mo10360b()     // Catch:{ all -> 0x01d8 }
            boolean r5 = com.google.android.play.core.splitinstall.C5784z.m25345b(r4)     // Catch:{ all -> 0x01d8 }
            if (r5 != 0) goto L_0x0068
            r2.add(r4)     // Catch:{ all -> 0x01d8 }
            goto L_0x0068
        L_0x0082:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01d8 }
        L_0x0086:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x01d8 }
            if (r3 == 0) goto L_0x009c
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x01d8 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01d8 }
            boolean r4 = com.google.android.play.core.splitinstall.C5784z.m25345b(r3)     // Catch:{ all -> 0x01d8 }
            if (r4 != 0) goto L_0x0086
            r2.add(r3)     // Catch:{ all -> 0x01d8 }
            goto L_0x0086
        L_0x009c:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x01d8 }
            int r3 = r1.size()     // Catch:{ all -> 0x01d8 }
            r0.<init>(r3)     // Catch:{ all -> 0x01d8 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x01d8 }
        L_0x00a9:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x01d8 }
            if (r3 == 0) goto L_0x00d1
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x01d8 }
            c.d.a.b.a.d.s r3 = (p076c.p112d.p113a.p130b.p131a.p133d.C2711s) r3     // Catch:{ all -> 0x01d8 }
            java.lang.String r4 = r3.mo10360b()     // Catch:{ all -> 0x01d8 }
            boolean r4 = com.google.android.play.core.splitinstall.C5784z.m25344a(r4)     // Catch:{ all -> 0x01d8 }
            if (r4 != 0) goto L_0x00cd
            java.lang.String r4 = r3.mo10360b()     // Catch:{ all -> 0x01d8 }
            java.lang.String r4 = com.google.android.play.core.splitinstall.C5784z.m25347c(r4)     // Catch:{ all -> 0x01d8 }
            boolean r4 = r2.contains(r4)     // Catch:{ all -> 0x01d8 }
            if (r4 == 0) goto L_0x00a9
        L_0x00cd:
            r0.add(r3)     // Catch:{ all -> 0x01d8 }
            goto L_0x00a9
        L_0x00d1:
            c.d.a.b.a.d.f r1 = new c.d.a.b.a.d.f     // Catch:{ all -> 0x01d8 }
            c.d.a.b.a.d.g r2 = r8.f9813a     // Catch:{ all -> 0x01d8 }
            r1.<init>(r2)     // Catch:{ all -> 0x01d8 }
            com.google.android.play.core.internal.e r2 = com.google.android.play.core.internal.C5742h.m25242a()     // Catch:{ all -> 0x01d8 }
            java.lang.ClassLoader r3 = r9.getClassLoader()     // Catch:{ all -> 0x01d8 }
            if (r10 == 0) goto L_0x00ea
            java.util.Set r1 = r1.mo10365a()     // Catch:{ all -> 0x01d8 }
            r2.mo23039a(r3, r1)     // Catch:{ all -> 0x01d8 }
            goto L_0x0108
        L_0x00ea:
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x01d8 }
        L_0x00ee:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x01d8 }
            if (r5 == 0) goto L_0x0108
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x01d8 }
            c.d.a.b.a.d.s r5 = (p076c.p112d.p113a.p130b.p131a.p133d.C2711s) r5     // Catch:{ all -> 0x01d8 }
            java.util.Set r5 = r1.mo10366a(r5)     // Catch:{ all -> 0x01d8 }
            if (r5 != 0) goto L_0x0104
            r4.remove()     // Catch:{ all -> 0x01d8 }
            goto L_0x00ee
        L_0x0104:
            r2.mo23039a(r3, r5)     // Catch:{ all -> 0x01d8 }
            goto L_0x00ee
        L_0x0108:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x01d8 }
            r1.<init>()     // Catch:{ all -> 0x01d8 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x01d8 }
        L_0x0111:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x01d8 }
            if (r5 == 0) goto L_0x0168
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x01d8 }
            c.d.a.b.a.d.s r5 = (p076c.p112d.p113a.p130b.p131a.p133d.C2711s) r5     // Catch:{ all -> 0x01d8 }
            boolean r6 = m13071a(r5)     // Catch:{ all -> 0x01d8 }
            if (r6 == 0) goto L_0x013a
            c.d.a.b.a.d.g r6 = r8.f9813a     // Catch:{ all -> 0x01d8 }
            java.lang.String r7 = r5.mo10360b()     // Catch:{ all -> 0x01d8 }
            java.io.File r6 = r6.mo10375c(r7)     // Catch:{ all -> 0x01d8 }
            java.io.File r7 = r5.mo10359a()     // Catch:{ all -> 0x01d8 }
            boolean r6 = r2.mo23040a(r3, r6, r7, r10)     // Catch:{ all -> 0x01d8 }
            if (r6 == 0) goto L_0x0138
            goto L_0x013a
        L_0x0138:
            r6 = 0
            goto L_0x013b
        L_0x013a:
            r6 = 1
        L_0x013b:
            if (r6 == 0) goto L_0x0145
            java.io.File r5 = r5.mo10359a()     // Catch:{ all -> 0x01d8 }
            r1.add(r5)     // Catch:{ all -> 0x01d8 }
            goto L_0x0111
        L_0x0145:
            java.io.File r5 = r5.mo10359a()     // Catch:{ all -> 0x01d8 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d8 }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01d8 }
            int r6 = r6.length()     // Catch:{ all -> 0x01d8 }
            int r6 = r6 + 24
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d8 }
            r7.<init>(r6)     // Catch:{ all -> 0x01d8 }
            java.lang.String r6 = "split was not installed "
            r7.append(r6)     // Catch:{ all -> 0x01d8 }
            r7.append(r5)     // Catch:{ all -> 0x01d8 }
            r7.toString()     // Catch:{ all -> 0x01d8 }
            goto L_0x0111
        L_0x0168:
            m13067a(r9, r1)     // Catch:{ all -> 0x01d8 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x01d8 }
        L_0x016f:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x01d8 }
            if (r10 == 0) goto L_0x01d6
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x01d8 }
            c.d.a.b.a.d.s r10 = (p076c.p112d.p113a.p130b.p131a.p133d.C2711s) r10     // Catch:{ all -> 0x01d8 }
            java.io.File r0 = r10.mo10359a()     // Catch:{ all -> 0x01d8 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x01d8 }
            if (r0 == 0) goto L_0x01b2
            java.lang.String r0 = r10.mo10360b()     // Catch:{ all -> 0x01d8 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01d8 }
            int r2 = r2.length()     // Catch:{ all -> 0x01d8 }
            int r2 = r2 + 30
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d8 }
            r3.<init>(r2)     // Catch:{ all -> 0x01d8 }
            java.lang.String r2 = "Split '"
            r3.append(r2)     // Catch:{ all -> 0x01d8 }
            r3.append(r0)     // Catch:{ all -> 0x01d8 }
            java.lang.String r0 = "' installation emulated"
            r3.append(r0)     // Catch:{ all -> 0x01d8 }
            r3.toString()     // Catch:{ all -> 0x01d8 }
            java.util.Set<java.lang.String> r0 = r8.f9814b     // Catch:{ all -> 0x01d8 }
            java.lang.String r10 = r10.mo10360b()     // Catch:{ all -> 0x01d8 }
            r0.add(r10)     // Catch:{ all -> 0x01d8 }
            goto L_0x016f
        L_0x01b2:
            java.lang.String r10 = r10.mo10360b()     // Catch:{ all -> 0x01d8 }
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01d8 }
            int r0 = r0.length()     // Catch:{ all -> 0x01d8 }
            int r0 = r0 + 35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d8 }
            r2.<init>(r0)     // Catch:{ all -> 0x01d8 }
            java.lang.String r0 = "Split '"
            r2.append(r0)     // Catch:{ all -> 0x01d8 }
            r2.append(r10)     // Catch:{ all -> 0x01d8 }
            java.lang.String r10 = "' installation not emulated."
            r2.append(r10)     // Catch:{ all -> 0x01d8 }
            r2.toString()     // Catch:{ all -> 0x01d8 }
            goto L_0x016f
        L_0x01d6:
            monitor-exit(r8)
            return
        L_0x01d8:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x01dc
        L_0x01db:
            throw r9
        L_0x01dc:
            goto L_0x01db
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p113a.p130b.p131a.p133d.C2693a.m13074b(android.content.Context, boolean):void");
    }

    /* renamed from: b */
    private static boolean m13075b() {
        return VERSION.SDK_INT < 21;
    }

    /* renamed from: c */
    private static List<String> m13076c(Context context) throws IOException {
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            return packageInfo.splitNames == null ? new ArrayList() : Arrays.asList(packageInfo.splitNames);
        } catch (NameNotFoundException e) {
            throw new IOException(String.format("Cannot load data for application '%s'", new Object[]{packageName}), e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final synchronized Set<String> m13077c() {
        return new HashSet(this.f9814b);
    }

    /* renamed from: d */
    public static boolean m13078d(Context context) {
        return m13070a(context, false);
    }

    /* renamed from: e */
    public static boolean m13079e(Context context) {
        if (m13075b()) {
            return false;
        }
        C2693a aVar = (C2693a) f9812c.get();
        if (aVar != null) {
            try {
                aVar.m13073b(context);
                return true;
            } catch (Exception unused) {
                return false;
            }
        } else {
            throw new IllegalStateException("SplitCompat.installActivity can only be called if SplitCompat.install is first called at startup on application context.");
        }
    }
}
