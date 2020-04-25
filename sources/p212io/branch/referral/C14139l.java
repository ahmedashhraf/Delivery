package p212io.branch.referral;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.browser.p013a.C0593d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import p212io.branch.referral.C14168s.C14169a;

/* renamed from: io.branch.referral.l */
/* compiled from: BranchStrongMatchHelper */
class C14139l {

    /* renamed from: j */
    private static C14139l f41587j = null;

    /* renamed from: k */
    private static final int f41588k = 500;

    /* renamed from: l */
    public static final int f41589l = 750;

    /* renamed from: m */
    private static final long f41590m = 2592000000L;

    /* renamed from: n */
    private static int f41591n = 750;

    /* renamed from: a */
    Object f41592a = null;

    /* renamed from: b */
    private final Handler f41593b;

    /* renamed from: c */
    private boolean f41594c = true;

    /* renamed from: d */
    boolean f41595d = false;

    /* renamed from: e */
    Class<?> f41596e;

    /* renamed from: f */
    Class<?> f41597f;

    /* renamed from: g */
    Class<?> f41598g;

    /* renamed from: h */
    Class<?> f41599h;

    /* renamed from: i */
    Class<?> f41600i;

    /* renamed from: io.branch.referral.l$a */
    /* compiled from: BranchStrongMatchHelper */
    class C14140a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C14144e f41601a;

        C14140a(C14144e eVar) {
            this.f41601a = eVar;
        }

        public void run() {
            C14139l lVar = C14139l.this;
            lVar.m61178a(this.f41601a, lVar.f41595d);
        }
    }

    /* renamed from: io.branch.referral.l$b */
    /* compiled from: BranchStrongMatchHelper */
    class C14141b extends C14143d {

        /* renamed from: b */
        final /* synthetic */ Method f41603b;

        /* renamed from: c */
        final /* synthetic */ Method f41604c;

        /* renamed from: d */
        final /* synthetic */ Uri f41605d;

        /* renamed from: e */
        final /* synthetic */ Method f41606e;

        /* renamed from: f */
        final /* synthetic */ C14204x f41607f;

        /* renamed from: g */
        final /* synthetic */ C14144e f41608g;

        C14141b(Method method, Method method2, Uri uri, Method method3, C14204x xVar, C14144e eVar) {
            this.f41603b = method;
            this.f41604c = method2;
            this.f41605d = uri;
            this.f41606e = method3;
            this.f41607f = xVar;
            this.f41608g = eVar;
            super();
        }

        /* renamed from: a */
        public void mo44701a(ComponentName componentName, Object obj) {
            C14139l lVar = C14139l.this;
            lVar.f41592a = lVar.f41596e.cast(obj);
            Object obj2 = C14139l.this.f41592a;
            if (obj2 != null) {
                try {
                    this.f41603b.invoke(obj2, new Object[]{Integer.valueOf(0)});
                    Object invoke = this.f41604c.invoke(C14139l.this.f41592a, new Object[]{null});
                    if (invoke != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Strong match request ");
                        sb.append(this.f41605d);
                        C14204x.m61509d("BranchSDK", sb.toString());
                        this.f41606e.invoke(invoke, new Object[]{this.f41605d, null, null});
                        this.f41607f.mo44945a(System.currentTimeMillis());
                        C14139l.this.f41595d = true;
                    }
                } catch (Throwable unused) {
                    C14139l lVar2 = C14139l.this;
                    lVar2.f41592a = null;
                    lVar2.m61178a(this.f41608g, lVar2.f41595d);
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C14139l lVar = C14139l.this;
            lVar.f41592a = null;
            lVar.m61178a(this.f41608g, lVar.f41595d);
        }
    }

    /* renamed from: io.branch.referral.l$c */
    /* compiled from: BranchStrongMatchHelper */
    class C14142c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C14144e f41610a;

        C14142c(C14144e eVar) {
            this.f41610a = eVar;
        }

        public void run() {
            this.f41610a.mo24832a();
        }
    }

    /* renamed from: io.branch.referral.l$d */
    /* compiled from: BranchStrongMatchHelper */
    private abstract class C14143d implements ServiceConnection {
        public C14143d() {
        }

        /* renamed from: a */
        public abstract void mo44701a(ComponentName componentName, Object obj);

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                Constructor declaredConstructor = C14139l.this.f41596e.getDeclaredConstructor(new Class[]{C14139l.this.f41600i, ComponentName.class});
                declaredConstructor.setAccessible(true);
                mo44701a(componentName, declaredConstructor.newInstance(new Object[]{Class.forName("a.a.a.b$a").getMethod("asInterface", new Class[]{IBinder.class}).invoke(null, new Object[]{iBinder}), componentName}));
            } catch (Throwable unused) {
                mo44701a(null, null);
            }
        }
    }

    /* renamed from: io.branch.referral.l$e */
    /* compiled from: BranchStrongMatchHelper */
    interface C14144e {
        /* renamed from: a */
        void mo24832a();
    }

    private C14139l() {
        try {
            this.f41596e = Class.forName("androidx.browser.a.b");
            this.f41597f = Class.forName("androidx.browser.a.e");
            this.f41598g = Class.forName("androidx.browser.a.a");
            this.f41599h = Class.forName("androidx.browser.a.f");
            this.f41600i = Class.forName("a.a.a.b");
        } catch (Throwable unused) {
            this.f41594c = false;
        }
        this.f41593b = new Handler();
    }

    /* renamed from: a */
    public static C14139l m61177a() {
        if (f41587j == null) {
            f41587j = new C14139l();
        }
        return f41587j;
    }

    /* renamed from: a */
    public void mo44698a(int i) {
        f41591n = i;
    }

    /* renamed from: a */
    public void mo44699a(Context context, String str, C14175t tVar, C14204x xVar, C14161q0 q0Var, C14144e eVar) {
        C14144e eVar2 = eVar;
        this.f41595d = false;
        if (System.currentTimeMillis() - xVar.mo45007x() < f41590m) {
            m61178a(eVar2, this.f41595d);
        } else if (!this.f41594c) {
            m61178a(eVar2, this.f41595d);
        } else {
            try {
                if (tVar.mo44782b() != null) {
                    Uri a = m61176a(str, tVar, xVar, q0Var, context);
                    if (a != null) {
                        this.f41593b.postDelayed(new C14140a(eVar2), 500);
                        this.f41596e.getMethod("bindCustomTabsService", new Class[]{Context.class, String.class, this.f41597f});
                        Method method = this.f41596e.getMethod("warmup", new Class[]{Long.TYPE});
                        Method method2 = this.f41596e.getMethod("newSession", new Class[]{this.f41598g});
                        Method method3 = this.f41599h.getMethod("mayLaunchUrl", new Class[]{Uri.class, Bundle.class, List.class});
                        Intent intent = new Intent(C0593d.f2372N);
                        intent.setPackage("com.android.chrome");
                        C14141b bVar = new C14141b(method, method2, a, method3, xVar, eVar);
                        Context context2 = context;
                        context.bindService(intent, bVar, 33);
                        return;
                    }
                    m61178a(eVar2, this.f41595d);
                    return;
                }
                m61178a(eVar2, this.f41595d);
            } catch (Throwable unused) {
                m61178a(eVar2, this.f41595d);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m61178a(C14144e eVar, boolean z) {
        if (eVar == null) {
            return;
        }
        if (z) {
            new Handler().postDelayed(new C14142c(eVar), (long) f41591n);
        } else {
            eVar.mo24832a();
        }
    }

    /* renamed from: a */
    private Uri m61176a(String str, C14175t tVar, C14204x xVar, C14161q0 q0Var, Context context) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        sb.append(str);
        sb.append("/_strong_match?os=");
        sb.append(tVar.mo44783c());
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        String str2 = "&";
        sb3.append(str2);
        sb3.append(C14169a.HardwareID.mo44764d());
        String str3 = "=";
        sb3.append(str3);
        sb3.append(tVar.mo44782b());
        String sb4 = sb3.toString();
        String d = (tVar.mo44785e() ? C14169a.HardwareIDTypeVendor : C14169a.HardwareIDTypeRandom).mo44764d();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append(str2);
        sb5.append(C14169a.HardwareIDType.mo44764d());
        sb5.append(str3);
        sb5.append(d);
        String sb6 = sb5.toString();
        if (C14161q0.f41680f != null && !C6031o.m27714c(context)) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append(str2);
            sb7.append(C14169a.GoogleAdvertisingID.mo44764d());
            sb7.append(str3);
            sb7.append(C14161q0.f41680f);
            sb6 = sb7.toString();
        }
        String str4 = "bnc_no_value";
        if (!xVar.mo44981k().equals(str4)) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(sb6);
            sb8.append(str2);
            sb8.append(C14169a.DeviceFingerprintID.mo44764d());
            sb8.append(str3);
            sb8.append(xVar.mo44981k());
            sb6 = sb8.toString();
        }
        if (!tVar.mo44779a().equals(str4)) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb6);
            sb9.append(str2);
            sb9.append(C14169a.AppVersion.mo44764d());
            sb9.append(str3);
            sb9.append(tVar.mo44779a());
            sb6 = sb9.toString();
        }
        if (!xVar.mo44977i().equals(str4)) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append(sb6);
            sb10.append(str2);
            sb10.append(C14169a.BranchKey.mo44764d());
            sb10.append(str3);
            sb10.append(xVar.mo44977i());
            sb6 = sb10.toString();
        }
        StringBuilder sb11 = new StringBuilder();
        sb11.append(sb6);
        sb11.append("&sdk=android2.19.5");
        return Uri.parse(sb11.toString());
    }
}
