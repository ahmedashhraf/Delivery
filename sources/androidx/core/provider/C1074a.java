package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0221u;
import androidx.annotation.C0224v0;
import androidx.annotation.C0237z;
import androidx.annotation.RequiresApi;
import androidx.collection.C0649h;
import androidx.collection.LruCache;
import androidx.core.content.p020h.C0865d;
import androidx.core.content.p020h.C0874g.C0875a;
import androidx.core.p018c.C0828g;
import androidx.core.p018c.C0837m;
import androidx.core.p033k.C0944i;
import androidx.core.provider.C1095b.C1100d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: androidx.core.provider.a */
/* compiled from: FontsContractCompat */
public class C1074a {
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})

    /* renamed from: a */
    public static final String f4743a = "font_results";
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})

    /* renamed from: b */
    static final int f4744b = -1;
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})

    /* renamed from: c */
    static final int f4745c = -2;

    /* renamed from: d */
    static final LruCache<String, Typeface> f4746d = new LruCache<>(16);

    /* renamed from: e */
    private static final int f4747e = 10000;

    /* renamed from: f */
    private static final C1095b f4748f = new C1095b("fonts", 10, 10000);

    /* renamed from: g */
    static final Object f4749g = new Object();
    @C0221u("sLock")

    /* renamed from: h */
    static final C0649h<String, ArrayList<C1100d<C1094j>>> f4750h = new C0649h<>();

    /* renamed from: i */
    private static final Comparator<byte[]> f4751i = new C1088e();

    /* renamed from: androidx.core.provider.a$a */
    /* compiled from: FontsContractCompat */
    static class C1075a implements Callable<C1094j> {

        /* renamed from: N */
        final /* synthetic */ int f4752N;

        /* renamed from: O */
        final /* synthetic */ String f4753O;

        /* renamed from: a */
        final /* synthetic */ Context f4754a;

        /* renamed from: b */
        final /* synthetic */ FontRequest f4755b;

        C1075a(Context context, FontRequest fontRequest, int i, String str) {
            this.f4754a = context;
            this.f4755b = fontRequest;
            this.f4752N = i;
            this.f4753O = str;
        }

        public C1094j call() throws Exception {
            C1094j a = C1074a.m6205a(this.f4754a, this.f4755b, this.f4752N);
            Typeface typeface = a.f4802a;
            if (typeface != null) {
                C1074a.f4746d.put(this.f4753O, typeface);
            }
            return a;
        }
    }

    /* renamed from: androidx.core.provider.a$b */
    /* compiled from: FontsContractCompat */
    static class C1076b implements C1100d<C1094j> {

        /* renamed from: a */
        final /* synthetic */ C0875a f4756a;

        /* renamed from: b */
        final /* synthetic */ Handler f4757b;

        C1076b(C0875a aVar, Handler handler) {
            this.f4756a = aVar;
            this.f4757b = handler;
        }

        /* renamed from: a */
        public void mo5242a(C1094j jVar) {
            if (jVar == null) {
                this.f4756a.mo4551a(1, this.f4757b);
                return;
            }
            int i = jVar.f4803b;
            if (i == 0) {
                this.f4756a.mo4552a(jVar.f4802a, this.f4757b);
            } else {
                this.f4756a.mo4551a(i, this.f4757b);
            }
        }
    }

    /* renamed from: androidx.core.provider.a$c */
    /* compiled from: FontsContractCompat */
    static class C1077c implements C1100d<C1094j> {

        /* renamed from: a */
        final /* synthetic */ String f4758a;

        C1077c(String str) {
            this.f4758a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            ((androidx.core.provider.C1095b.C1100d) r1.get(r0)).mo5242a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo5242a(androidx.core.provider.C1074a.C1094j r5) {
            /*
                r4 = this;
                java.lang.Object r0 = androidx.core.provider.C1074a.f4749g
                monitor-enter(r0)
                androidx.collection.h<java.lang.String, java.util.ArrayList<androidx.core.provider.b$d<androidx.core.provider.a$j>>> r1 = androidx.core.provider.C1074a.f4750h     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.f4758a     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                androidx.collection.h<java.lang.String, java.util.ArrayList<androidx.core.provider.b$d<androidx.core.provider.a$j>>> r2 = androidx.core.provider.C1074a.f4750h     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.f4758a     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                androidx.core.provider.b$d r2 = (androidx.core.provider.C1095b.C1100d) r2
                r2.mo5242a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                goto L_0x0031
            L_0x0030:
                throw r5
            L_0x0031:
                goto L_0x0030
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C1074a.C1077c.mo5242a(androidx.core.provider.a$j):void");
        }
    }

    /* renamed from: androidx.core.provider.a$d */
    /* compiled from: FontsContractCompat */
    static class C1078d implements Runnable {

        /* renamed from: N */
        final /* synthetic */ Handler f4759N;

        /* renamed from: O */
        final /* synthetic */ C1092i f4760O;

        /* renamed from: a */
        final /* synthetic */ Context f4761a;

        /* renamed from: b */
        final /* synthetic */ FontRequest f4762b;

        /* renamed from: androidx.core.provider.a$d$a */
        /* compiled from: FontsContractCompat */
        class C1079a implements Runnable {
            C1079a() {
            }

            public void run() {
                C1078d.this.f4760O.mo5263a(-1);
            }
        }

        /* renamed from: androidx.core.provider.a$d$b */
        /* compiled from: FontsContractCompat */
        class C1080b implements Runnable {
            C1080b() {
            }

            public void run() {
                C1078d.this.f4760O.mo5263a(-2);
            }
        }

        /* renamed from: androidx.core.provider.a$d$c */
        /* compiled from: FontsContractCompat */
        class C1081c implements Runnable {
            C1081c() {
            }

            public void run() {
                C1078d.this.f4760O.mo5263a(-3);
            }
        }

        /* renamed from: androidx.core.provider.a$d$d */
        /* compiled from: FontsContractCompat */
        class C1082d implements Runnable {
            C1082d() {
            }

            public void run() {
                C1078d.this.f4760O.mo5263a(-3);
            }
        }

        /* renamed from: androidx.core.provider.a$d$e */
        /* compiled from: FontsContractCompat */
        class C1083e implements Runnable {
            C1083e() {
            }

            public void run() {
                C1078d.this.f4760O.mo5263a(1);
            }
        }

        /* renamed from: androidx.core.provider.a$d$f */
        /* compiled from: FontsContractCompat */
        class C1084f implements Runnable {
            C1084f() {
            }

            public void run() {
                C1078d.this.f4760O.mo5263a(-3);
            }
        }

        /* renamed from: androidx.core.provider.a$d$g */
        /* compiled from: FontsContractCompat */
        class C1085g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f4769a;

            C1085g(int i) {
                this.f4769a = i;
            }

            public void run() {
                C1078d.this.f4760O.mo5263a(this.f4769a);
            }
        }

        /* renamed from: androidx.core.provider.a$d$h */
        /* compiled from: FontsContractCompat */
        class C1086h implements Runnable {
            C1086h() {
            }

            public void run() {
                C1078d.this.f4760O.mo5263a(-3);
            }
        }

        /* renamed from: androidx.core.provider.a$d$i */
        /* compiled from: FontsContractCompat */
        class C1087i implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Typeface f4772a;

            C1087i(Typeface typeface) {
                this.f4772a = typeface;
            }

            public void run() {
                C1078d.this.f4760O.mo5264a(this.f4772a);
            }
        }

        C1078d(Context context, FontRequest fontRequest, Handler handler, C1092i iVar) {
            this.f4761a = context;
            this.f4762b = fontRequest;
            this.f4759N = handler;
            this.f4760O = iVar;
        }

        public void run() {
            try {
                C1090g a = C1074a.m6204a(this.f4761a, (CancellationSignal) null, this.f4762b);
                if (a.mo5257b() != 0) {
                    int b = a.mo5257b();
                    if (b == 1) {
                        this.f4759N.post(new C1080b());
                    } else if (b != 2) {
                        this.f4759N.post(new C1082d());
                    } else {
                        this.f4759N.post(new C1081c());
                    }
                } else {
                    C1091h[] a2 = a.mo5256a();
                    if (a2 == null || a2.length == 0) {
                        this.f4759N.post(new C1083e());
                        return;
                    }
                    for (C1091h hVar : a2) {
                        if (hVar.mo5258a() != 0) {
                            int a3 = hVar.mo5258a();
                            if (a3 < 0) {
                                this.f4759N.post(new C1084f());
                            } else {
                                this.f4759N.post(new C1085g(a3));
                            }
                            return;
                        }
                    }
                    Typeface a4 = C1074a.m6202a(this.f4761a, (CancellationSignal) null, a2);
                    if (a4 == null) {
                        this.f4759N.post(new C1086h());
                    } else {
                        this.f4759N.post(new C1087i(a4));
                    }
                }
            } catch (NameNotFoundException unused) {
                this.f4759N.post(new C1079a());
            }
        }
    }

    /* renamed from: androidx.core.provider.a$e */
    /* compiled from: FontsContractCompat */
    static class C1088e implements Comparator<byte[]> {
        C1088e() {
        }

        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i2 = bArr.length;
                i = bArr2.length;
            } else {
                int i3 = 0;
                while (i3 < bArr.length) {
                    if (bArr[i3] != bArr2[i3]) {
                        i2 = bArr[i3];
                        i = bArr2[i3];
                    } else {
                        i3++;
                    }
                }
                return 0;
            }
            return i2 - i;
        }
    }

    /* renamed from: androidx.core.provider.a$f */
    /* compiled from: FontsContractCompat */
    public static final class C1089f implements BaseColumns {

        /* renamed from: a */
        public static final String f4774a = "file_id";

        /* renamed from: b */
        public static final String f4775b = "font_ttc_index";

        /* renamed from: c */
        public static final String f4776c = "font_variation_settings";

        /* renamed from: d */
        public static final String f4777d = "font_weight";

        /* renamed from: e */
        public static final String f4778e = "font_italic";

        /* renamed from: f */
        public static final String f4779f = "result_code";

        /* renamed from: g */
        public static final int f4780g = 0;

        /* renamed from: h */
        public static final int f4781h = 1;

        /* renamed from: i */
        public static final int f4782i = 2;

        /* renamed from: j */
        public static final int f4783j = 3;
    }

    /* renamed from: androidx.core.provider.a$g */
    /* compiled from: FontsContractCompat */
    public static class C1090g {

        /* renamed from: c */
        public static final int f4784c = 0;

        /* renamed from: d */
        public static final int f4785d = 1;

        /* renamed from: e */
        public static final int f4786e = 2;

        /* renamed from: a */
        private final int f4787a;

        /* renamed from: b */
        private final C1091h[] f4788b;

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        public C1090g(int i, @C0195i0 C1091h[] hVarArr) {
            this.f4787a = i;
            this.f4788b = hVarArr;
        }

        /* renamed from: a */
        public C1091h[] mo5256a() {
            return this.f4788b;
        }

        /* renamed from: b */
        public int mo5257b() {
            return this.f4787a;
        }
    }

    /* renamed from: androidx.core.provider.a$h */
    /* compiled from: FontsContractCompat */
    public static class C1091h {

        /* renamed from: a */
        private final Uri f4789a;

        /* renamed from: b */
        private final int f4790b;

        /* renamed from: c */
        private final int f4791c;

        /* renamed from: d */
        private final boolean f4792d;

        /* renamed from: e */
        private final int f4793e;

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        public C1091h(@C0193h0 Uri uri, @C0237z(from = 0) int i, @C0237z(from = 1, mo691to = 1000) int i2, boolean z, int i3) {
            this.f4789a = (Uri) C0944i.m5337a(uri);
            this.f4790b = i;
            this.f4791c = i2;
            this.f4792d = z;
            this.f4793e = i3;
        }

        /* renamed from: a */
        public int mo5258a() {
            return this.f4793e;
        }

        @C0237z(from = 0)
        /* renamed from: b */
        public int mo5259b() {
            return this.f4790b;
        }

        @C0193h0
        /* renamed from: c */
        public Uri mo5260c() {
            return this.f4789a;
        }

        @C0237z(from = 1, mo691to = 1000)
        /* renamed from: d */
        public int mo5261d() {
            return this.f4791c;
        }

        /* renamed from: e */
        public boolean mo5262e() {
            return this.f4792d;
        }
    }

    /* renamed from: androidx.core.provider.a$i */
    /* compiled from: FontsContractCompat */
    public static class C1092i {
        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})

        /* renamed from: a */
        public static final int f4794a = 0;

        /* renamed from: b */
        public static final int f4795b = -1;

        /* renamed from: c */
        public static final int f4796c = -2;

        /* renamed from: d */
        public static final int f4797d = -3;

        /* renamed from: e */
        public static final int f4798e = -4;

        /* renamed from: f */
        public static final int f4799f = 1;

        /* renamed from: g */
        public static final int f4800g = 2;

        /* renamed from: h */
        public static final int f4801h = 3;

        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.core.provider.a$i$a */
        /* compiled from: FontsContractCompat */
        public @interface C1093a {
        }

        /* renamed from: a */
        public void mo5263a(int i) {
        }

        /* renamed from: a */
        public void mo5264a(Typeface typeface) {
        }
    }

    /* renamed from: androidx.core.provider.a$j */
    /* compiled from: FontsContractCompat */
    private static final class C1094j {

        /* renamed from: a */
        final Typeface f4802a;

        /* renamed from: b */
        final int f4803b;

        C1094j(@C0195i0 Typeface typeface, int i) {
            this.f4802a = typeface;
            this.f4803b = i;
        }
    }

    private C1074a() {
    }

    @C0193h0
    /* renamed from: a */
    static C1094j m6205a(Context context, FontRequest fontRequest, int i) {
        try {
            C1090g a = m6204a(context, (CancellationSignal) null, fontRequest);
            int i2 = -3;
            if (a.mo5257b() == 0) {
                Typeface a2 = C0828g.m4838a(context, null, a.mo5256a(), i);
                if (a2 != null) {
                    i2 = 0;
                }
                return new C1094j(a2, i2);
            }
            if (a.mo5257b() == 1) {
                i2 = -2;
            }
            return new C1094j(null, i2);
        } catch (NameNotFoundException unused) {
            return new C1094j(null, -1);
        }
    }

    /* renamed from: b */
    private static void m6213b(@C0193h0 Context context, @C0193h0 FontRequest fontRequest, @C0193h0 C1092i iVar, @C0193h0 Handler handler) {
        handler.post(new C1078d(context, fontRequest, new Handler(), iVar));
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static void m6209a() {
        f4746d.evictAll();
    }

    /* JADX INFO: used method not loaded: androidx.core.provider.b.a(java.util.concurrent.Callable, androidx.core.provider.b$d):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        f4748f.mo5268a((java.util.concurrent.Callable) r1, (androidx.core.provider.C1095b.C1100d) new androidx.core.provider.C1074a.C1077c(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        return r2;
     */
    @androidx.annotation.C0207n0({androidx.annotation.C0207n0.C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m6203a(android.content.Context r2, androidx.core.provider.FontRequest r3, @androidx.annotation.C0195i0 androidx.core.content.p020h.C0874g.C0875a r4, @androidx.annotation.C0195i0 android.os.Handler r5, boolean r6, int r7, int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getIdentifier()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r1 = f4746d
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0028
            if (r4 == 0) goto L_0x0027
            r4.mo2978a(r1)
        L_0x0027:
            return r1
        L_0x0028:
            if (r6 == 0) goto L_0x0043
            r1 = -1
            if (r7 != r1) goto L_0x0043
            androidx.core.provider.a$j r2 = m6205a(r2, r3, r8)
            if (r4 == 0) goto L_0x0040
            int r3 = r2.f4803b
            if (r3 != 0) goto L_0x003d
            android.graphics.Typeface r3 = r2.f4802a
            r4.mo4552a(r3, r5)
            goto L_0x0040
        L_0x003d:
            r4.mo4551a(r3, r5)
        L_0x0040:
            android.graphics.Typeface r2 = r2.f4802a
            return r2
        L_0x0043:
            androidx.core.provider.a$a r1 = new androidx.core.provider.a$a
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0056
            androidx.core.provider.b r3 = f4748f     // Catch:{ InterruptedException -> 0x0055 }
            java.lang.Object r3 = r3.mo5266a(r1, r7)     // Catch:{ InterruptedException -> 0x0055 }
            androidx.core.provider.a$j r3 = (androidx.core.provider.C1074a.C1094j) r3     // Catch:{ InterruptedException -> 0x0055 }
            android.graphics.Typeface r2 = r3.f4802a     // Catch:{ InterruptedException -> 0x0055 }
        L_0x0055:
            return r2
        L_0x0056:
            if (r4 != 0) goto L_0x005a
            r3 = r2
            goto L_0x005f
        L_0x005a:
            androidx.core.provider.a$b r3 = new androidx.core.provider.a$b
            r3.<init>(r4, r5)
        L_0x005f:
            java.lang.Object r4 = f4749g
            monitor-enter(r4)
            androidx.collection.h<java.lang.String, java.util.ArrayList<androidx.core.provider.b$d<androidx.core.provider.a$j>>> r5 = f4750h     // Catch:{ all -> 0x008e }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x008e }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x008e }
            if (r5 == 0) goto L_0x0073
            if (r3 == 0) goto L_0x0071
            r5.add(r3)     // Catch:{ all -> 0x008e }
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            return r2
        L_0x0073:
            if (r3 == 0) goto L_0x0082
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x008e }
            r5.<init>()     // Catch:{ all -> 0x008e }
            r5.add(r3)     // Catch:{ all -> 0x008e }
            androidx.collection.h<java.lang.String, java.util.ArrayList<androidx.core.provider.b$d<androidx.core.provider.a$j>>> r3 = f4750h     // Catch:{ all -> 0x008e }
            r3.put(r0, r5)     // Catch:{ all -> 0x008e }
        L_0x0082:
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            androidx.core.provider.b r3 = f4748f
            androidx.core.provider.a$c r4 = new androidx.core.provider.a$c
            r4.<init>(r0)
            r3.mo5268a(r1, r4)
            return r2
        L_0x008e:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008e }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C1074a.m6203a(android.content.Context, androidx.core.provider.FontRequest, androidx.core.content.h.g$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public static void m6210a(@C0193h0 Context context, @C0193h0 FontRequest fontRequest, @C0193h0 C1092i iVar, @C0193h0 Handler handler) {
        m6213b(context.getApplicationContext(), fontRequest, iVar, handler);
    }

    @C0195i0
    /* renamed from: a */
    public static Typeface m6202a(@C0193h0 Context context, @C0195i0 CancellationSignal cancellationSignal, @C0193h0 C1091h[] hVarArr) {
        return C0828g.m4838a(context, cancellationSignal, hVarArr, 0);
    }

    @RequiresApi(19)
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static Map<Uri, ByteBuffer> m6208a(Context context, C1091h[] hVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C1091h hVar : hVarArr) {
            if (hVar.mo5258a() == 0) {
                Uri c = hVar.mo5260c();
                if (!hashMap.containsKey(c)) {
                    hashMap.put(c, C0837m.m4897a(context, cancellationSignal, c));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    @C0193h0
    /* renamed from: a */
    public static C1090g m6204a(@C0193h0 Context context, @C0195i0 CancellationSignal cancellationSignal, @C0193h0 FontRequest fontRequest) throws NameNotFoundException {
        ProviderInfo a = m6201a(context.getPackageManager(), fontRequest, context.getResources());
        if (a == null) {
            return new C1090g(1, null);
        }
        return new C1090g(0, m6212a(context, fontRequest, a.authority, cancellationSignal));
    }

    @C0195i0
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0224v0
    /* renamed from: a */
    public static ProviderInfo m6201a(@C0193h0 PackageManager packageManager, @C0193h0 FontRequest fontRequest, @C0195i0 Resources resources) throws NameNotFoundException {
        String providerAuthority = fontRequest.getProviderAuthority();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(providerAuthority, 0);
        if (resolveContentProvider == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No package found for authority: ");
            sb.append(providerAuthority);
            throw new NameNotFoundException(sb.toString());
        } else if (resolveContentProvider.packageName.equals(fontRequest.getProviderPackage())) {
            List a = m6207a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f4751i);
            List a2 = m6206a(fontRequest, resources);
            for (int i = 0; i < a2.size(); i++) {
                ArrayList arrayList = new ArrayList((Collection) a2.get(i));
                Collections.sort(arrayList, f4751i);
                if (m6211a(a, (List<byte[]>) arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found content provider ");
            sb2.append(providerAuthority);
            sb2.append(", but package was not ");
            sb2.append(fontRequest.getProviderPackage());
            throw new NameNotFoundException(sb2.toString());
        }
    }

    /* renamed from: a */
    private static List<List<byte[]>> m6206a(FontRequest fontRequest, Resources resources) {
        if (fontRequest.getCertificates() != null) {
            return fontRequest.getCertificates();
        }
        return C0865d.m5019a(resources, fontRequest.getCertificatesArrayResId());
    }

    /* renamed from: a */
    private static boolean m6211a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static List<byte[]> m6207a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013b  */
    @androidx.annotation.C0193h0
    @androidx.annotation.C0224v0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.core.provider.C1074a.C1091h[] m6212a(android.content.Context r19, androidx.core.provider.FontRequest r20, java.lang.String r21, android.os.CancellationSignal r22) {
        /*
            r0 = r21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r2 = r2.scheme(r3)
            android.net.Uri$Builder r2 = r2.authority(r0)
            android.net.Uri r2 = r2.build()
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            android.net.Uri$Builder r3 = r4.scheme(r3)
            android.net.Uri$Builder r0 = r3.authority(r0)
            java.lang.String r3 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r3)
            android.net.Uri r0 = r0.build()
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0137 }
            r5 = 16
            java.lang.String r7 = "font_variation_settings"
            r9 = 2
            r10 = 7
            java.lang.String r11 = "result_code"
            java.lang.String r12 = "font_italic"
            java.lang.String r13 = "font_weight"
            java.lang.String r14 = "font_ttc_index"
            java.lang.String r15 = "file_id"
            java.lang.String r3 = "_id"
            r6 = 1
            r8 = 0
            if (r4 <= r5) goto L_0x007e
            android.content.ContentResolver r4 = r19.getContentResolver()     // Catch:{ all -> 0x0137 }
            java.lang.String[] r10 = new java.lang.String[r10]     // Catch:{ all -> 0x0137 }
            r10[r8] = r3     // Catch:{ all -> 0x0137 }
            r10[r6] = r15     // Catch:{ all -> 0x0137 }
            r10[r9] = r14     // Catch:{ all -> 0x0137 }
            r5 = 3
            r10[r5] = r7     // Catch:{ all -> 0x0137 }
            r5 = 4
            r10[r5] = r13     // Catch:{ all -> 0x0137 }
            r5 = 5
            r10[r5] = r12     // Catch:{ all -> 0x0137 }
            r5 = 6
            r10[r5] = r11     // Catch:{ all -> 0x0137 }
            java.lang.String r7 = "query = ?"
            java.lang.String[] r9 = new java.lang.String[r6]     // Catch:{ all -> 0x0137 }
            java.lang.String r5 = r20.getQuery()     // Catch:{ all -> 0x0137 }
            r9[r8] = r5     // Catch:{ all -> 0x0137 }
            r16 = 0
            r5 = r2
            r18 = r1
            r1 = 1
            r6 = r10
            r10 = 0
            r8 = r9
            r9 = r16
            r1 = 0
            r10 = r22
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0137 }
            goto L_0x00ab
        L_0x007e:
            r18 = r1
            r1 = 0
            android.content.ContentResolver r4 = r19.getContentResolver()     // Catch:{ all -> 0x0137 }
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ all -> 0x0137 }
            r6[r1] = r3     // Catch:{ all -> 0x0137 }
            r5 = 1
            r6[r5] = r15     // Catch:{ all -> 0x0137 }
            r6[r9] = r14     // Catch:{ all -> 0x0137 }
            r5 = 3
            r6[r5] = r7     // Catch:{ all -> 0x0137 }
            r5 = 4
            r6[r5] = r13     // Catch:{ all -> 0x0137 }
            r5 = 5
            r6[r5] = r12     // Catch:{ all -> 0x0137 }
            r5 = 6
            r6[r5] = r11     // Catch:{ all -> 0x0137 }
            java.lang.String r7 = "query = ?"
            r5 = 1
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ all -> 0x0137 }
            java.lang.String r5 = r20.getQuery()     // Catch:{ all -> 0x0137 }
            r8[r1] = r5     // Catch:{ all -> 0x0137 }
            r9 = 0
            r5 = r2
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0137 }
        L_0x00ab:
            if (r4 == 0) goto L_0x0127
            int r5 = r4.getCount()     // Catch:{ all -> 0x0125 }
            if (r5 <= 0) goto L_0x0127
            int r5 = r4.getColumnIndex(r11)     // Catch:{ all -> 0x0125 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0125 }
            r6.<init>()     // Catch:{ all -> 0x0125 }
            int r3 = r4.getColumnIndex(r3)     // Catch:{ all -> 0x0125 }
            int r7 = r4.getColumnIndex(r15)     // Catch:{ all -> 0x0125 }
            int r8 = r4.getColumnIndex(r14)     // Catch:{ all -> 0x0125 }
            int r9 = r4.getColumnIndex(r13)     // Catch:{ all -> 0x0125 }
            int r10 = r4.getColumnIndex(r12)     // Catch:{ all -> 0x0125 }
        L_0x00d0:
            boolean r11 = r4.moveToNext()     // Catch:{ all -> 0x0125 }
            if (r11 == 0) goto L_0x0129
            r11 = -1
            if (r5 == r11) goto L_0x00e0
            int r12 = r4.getInt(r5)     // Catch:{ all -> 0x0125 }
            r18 = r12
            goto L_0x00e2
        L_0x00e0:
            r18 = 0
        L_0x00e2:
            if (r8 == r11) goto L_0x00ea
            int r12 = r4.getInt(r8)     // Catch:{ all -> 0x0125 }
            r15 = r12
            goto L_0x00eb
        L_0x00ea:
            r15 = 0
        L_0x00eb:
            if (r7 != r11) goto L_0x00f6
            long r12 = r4.getLong(r3)     // Catch:{ all -> 0x0125 }
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r2, r12)     // Catch:{ all -> 0x0125 }
            goto L_0x00fe
        L_0x00f6:
            long r12 = r4.getLong(r7)     // Catch:{ all -> 0x0125 }
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r0, r12)     // Catch:{ all -> 0x0125 }
        L_0x00fe:
            r14 = r12
            if (r9 == r11) goto L_0x0108
            int r12 = r4.getInt(r9)     // Catch:{ all -> 0x0125 }
            r16 = r12
            goto L_0x010c
        L_0x0108:
            r12 = 400(0x190, float:5.6E-43)
            r16 = 400(0x190, float:5.6E-43)
        L_0x010c:
            if (r10 == r11) goto L_0x0118
            int r11 = r4.getInt(r10)     // Catch:{ all -> 0x0125 }
            r12 = 1
            if (r11 != r12) goto L_0x0119
            r17 = 1
            goto L_0x011b
        L_0x0118:
            r12 = 1
        L_0x0119:
            r17 = 0
        L_0x011b:
            androidx.core.provider.a$h r11 = new androidx.core.provider.a$h     // Catch:{ all -> 0x0125 }
            r13 = r11
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0125 }
            r6.add(r11)     // Catch:{ all -> 0x0125 }
            goto L_0x00d0
        L_0x0125:
            r0 = move-exception
            goto L_0x0139
        L_0x0127:
            r6 = r18
        L_0x0129:
            if (r4 == 0) goto L_0x012e
            r4.close()
        L_0x012e:
            androidx.core.provider.a$h[] r0 = new androidx.core.provider.C1074a.C1091h[r1]
            java.lang.Object[] r0 = r6.toArray(r0)
            androidx.core.provider.a$h[] r0 = (androidx.core.provider.C1074a.C1091h[]) r0
            return r0
        L_0x0137:
            r0 = move-exception
            r4 = 0
        L_0x0139:
            if (r4 == 0) goto L_0x013e
            r4.close()
        L_0x013e:
            goto L_0x0140
        L_0x013f:
            throw r0
        L_0x0140:
            goto L_0x013f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C1074a.m6212a(android.content.Context, androidx.core.provider.FontRequest, java.lang.String, android.os.CancellationSignal):androidx.core.provider.a$h[]");
    }
}
