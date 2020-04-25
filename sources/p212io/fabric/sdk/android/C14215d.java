package p212io.fabric.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import p212io.fabric.sdk.android.C14209a.C14212b;
import p212io.fabric.sdk.android.p493p.p495b.C14255l;
import p212io.fabric.sdk.android.p493p.p495b.C14265s;
import p212io.fabric.sdk.android.services.concurrency.C14366m;
import p212io.fabric.sdk.android.services.concurrency.C6035e;
import p212io.fabric.sdk.android.services.concurrency.UnmetDependencyException;

/* renamed from: io.fabric.sdk.android.d */
/* compiled from: Fabric */
public class C14215d {

    /* renamed from: m */
    public static final String f41919m = "Fabric";

    /* renamed from: n */
    static final String f41920n = ".Fabric";

    /* renamed from: o */
    static final String f41921o = "com.crashlytics.sdk.android:crashlytics";

    /* renamed from: p */
    static final String f41922p = "com.crashlytics.sdk.android:answers";

    /* renamed from: q */
    static volatile C14215d f41923q = null;

    /* renamed from: r */
    static final C14228l f41924r = new C14214c();

    /* renamed from: s */
    static final boolean f41925s = false;

    /* renamed from: a */
    private final Context f41926a;

    /* renamed from: b */
    private final Map<Class<? extends C14225i>, C14225i> f41927b;

    /* renamed from: c */
    private final ExecutorService f41928c;

    /* renamed from: d */
    private final Handler f41929d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C14221g<C14215d> f41930e;

    /* renamed from: f */
    private final C14221g<?> f41931f;

    /* renamed from: g */
    private final C14265s f41932g;

    /* renamed from: h */
    private C14209a f41933h;

    /* renamed from: i */
    private WeakReference<Activity> f41934i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AtomicBoolean f41935j = new AtomicBoolean(false);

    /* renamed from: k */
    final C14228l f41936k;

    /* renamed from: l */
    final boolean f41937l;

    /* renamed from: io.fabric.sdk.android.d$a */
    /* compiled from: Fabric */
    class C14216a extends C14212b {
        C14216a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C14215d.this.mo45054a(activity);
        }

        public void onActivityResumed(Activity activity) {
            C14215d.this.mo45054a(activity);
        }

        public void onActivityStarted(Activity activity) {
            C14215d.this.mo45054a(activity);
        }
    }

    /* renamed from: io.fabric.sdk.android.d$b */
    /* compiled from: Fabric */
    class C14217b implements C14221g {

        /* renamed from: b */
        final CountDownLatch f41939b = new CountDownLatch(this.f41940c);

        /* renamed from: c */
        final /* synthetic */ int f41940c;

        C14217b(int i) {
            this.f41940c = i;
        }

        /* renamed from: a */
        public void mo45068a(Object obj) {
            this.f41939b.countDown();
            if (this.f41939b.getCount() == 0) {
                C14215d.this.f41935j.set(true);
                C14215d.this.f41930e.mo45068a(C14215d.this);
            }
        }

        /* renamed from: a */
        public void mo45067a(Exception exc) {
            C14215d.this.f41930e.mo45067a(exc);
        }
    }

    /* renamed from: io.fabric.sdk.android.d$c */
    /* compiled from: Fabric */
    public static class C14218c {

        /* renamed from: a */
        private final Context f41942a;

        /* renamed from: b */
        private C14225i[] f41943b;

        /* renamed from: c */
        private C14366m f41944c;

        /* renamed from: d */
        private Handler f41945d;

        /* renamed from: e */
        private C14228l f41946e;

        /* renamed from: f */
        private boolean f41947f;

        /* renamed from: g */
        private String f41948g;

        /* renamed from: h */
        private String f41949h;

        /* renamed from: i */
        private C14221g<C14215d> f41950i;

        public C14218c(Context context) {
            if (context != null) {
                this.f41942a = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        @Deprecated
        /* renamed from: a */
        public C14218c mo45069a(Handler handler) {
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public C14218c mo45074a(ExecutorService executorService) {
            return this;
        }

        /* renamed from: a */
        public C14218c mo45076a(C14225i... iVarArr) {
            if (this.f41943b == null) {
                if (!C14255l.m61854a(this.f41942a).mo45147a()) {
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    for (C14225i iVar : iVarArr) {
                        String identifier = iVar.getIdentifier();
                        char c = 65535;
                        int hashCode = identifier.hashCode();
                        if (hashCode != 607220212) {
                            if (hashCode == 1830452504 && identifier.equals(C14215d.f41921o)) {
                                c = 0;
                            }
                        } else if (identifier.equals(C14215d.f41922p)) {
                            c = 1;
                        }
                        if (c == 0 || c == 1) {
                            arrayList.add(iVar);
                        } else if (!z) {
                            C14215d.m61672j().mo45051w(C14215d.f41919m, "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.");
                            z = true;
                        }
                    }
                    iVarArr = (C14225i[]) arrayList.toArray(new C14225i[0]);
                }
                this.f41943b = iVarArr;
                return this;
            }
            throw new IllegalStateException("Kits already set.");
        }

        /* renamed from: b */
        public C14218c mo45078b(String str) {
            if (str == null) {
                throw new IllegalArgumentException("appInstallIdentifier must not be null.");
            } else if (this.f41948g == null) {
                this.f41948g = str;
                return this;
            } else {
                throw new IllegalStateException("appInstallIdentifier already set.");
            }
        }

        /* renamed from: a */
        public C14218c mo45072a(C14366m mVar) {
            if (mVar == null) {
                throw new IllegalArgumentException("PriorityThreadPoolExecutor must not be null.");
            } else if (this.f41944c == null) {
                this.f41944c = mVar;
                return this;
            } else {
                throw new IllegalStateException("PriorityThreadPoolExecutor already set.");
            }
        }

        /* renamed from: a */
        public C14218c mo45071a(C14228l lVar) {
            if (lVar == null) {
                throw new IllegalArgumentException("Logger must not be null.");
            } else if (this.f41946e == null) {
                this.f41946e = lVar;
                return this;
            } else {
                throw new IllegalStateException("Logger already set.");
            }
        }

        /* renamed from: a */
        public C14218c mo45073a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("appIdentifier must not be null.");
            } else if (this.f41949h == null) {
                this.f41949h = str;
                return this;
            } else {
                throw new IllegalStateException("appIdentifier already set.");
            }
        }

        /* renamed from: a */
        public C14218c mo45075a(boolean z) {
            this.f41947f = z;
            return this;
        }

        /* renamed from: a */
        public C14218c mo45070a(C14221g<C14215d> gVar) {
            if (gVar == null) {
                throw new IllegalArgumentException("initializationCallback must not be null.");
            } else if (this.f41950i == null) {
                this.f41950i = gVar;
                return this;
            } else {
                throw new IllegalStateException("initializationCallback already set.");
            }
        }

        /* renamed from: a */
        public C14215d mo45077a() {
            Map map;
            if (this.f41944c == null) {
                this.f41944c = C14366m.m62130a();
            }
            if (this.f41945d == null) {
                this.f41945d = new Handler(Looper.getMainLooper());
            }
            if (this.f41946e == null) {
                if (this.f41947f) {
                    this.f41946e = new C14214c(3);
                } else {
                    this.f41946e = new C14214c();
                }
            }
            if (this.f41949h == null) {
                this.f41949h = this.f41942a.getPackageName();
            }
            if (this.f41950i == null) {
                this.f41950i = C14221g.f41958a;
            }
            C14225i[] iVarArr = this.f41943b;
            if (iVarArr == null) {
                map = new HashMap();
            } else {
                map = C14215d.m61667b((Collection<? extends C14225i>) Arrays.asList(iVarArr));
            }
            Map map2 = map;
            Context applicationContext = this.f41942a.getApplicationContext();
            C14215d dVar = new C14215d(applicationContext, map2, this.f41944c, this.f41945d, this.f41946e, this.f41947f, this.f41950i, new C14265s(applicationContext, this.f41949h, this.f41948g, map2.values()), C14215d.m61670d(this.f41942a));
            return dVar;
        }
    }

    C14215d(Context context, Map<Class<? extends C14225i>, C14225i> map, C14366m mVar, Handler handler, C14228l lVar, boolean z, C14221g gVar, C14265s sVar, Activity activity) {
        this.f41926a = context;
        this.f41927b = map;
        this.f41928c = mVar;
        this.f41929d = handler;
        this.f41936k = lVar;
        this.f41937l = z;
        this.f41930e = gVar;
        this.f41931f = mo45055a(map.size());
        this.f41932g = sVar;
        mo45054a(activity);
    }

    /* renamed from: d */
    public static C14215d m61671d(C14215d dVar) {
        if (f41923q == null) {
            synchronized (C14215d.class) {
                if (f41923q == null) {
                    m61669c(dVar);
                }
            }
        }
        return f41923q;
    }

    /* renamed from: j */
    public static C14228l m61672j() {
        if (f41923q == null) {
            return f41924r;
        }
        return f41923q.f41936k;
    }

    /* renamed from: k */
    private void m61673k() {
        this.f41933h = new C14209a(this.f41926a);
        this.f41933h.mo45030a(new C14216a());
        mo45059b(this.f41926a);
    }

    /* renamed from: l */
    public static boolean m61674l() {
        if (f41923q == null) {
            return false;
        }
        return f41923q.f41937l;
    }

    /* renamed from: m */
    public static boolean m61675m() {
        return f41923q != null && f41923q.f41935j.get();
    }

    /* renamed from: n */
    static C14215d m61676n() {
        if (f41923q != null) {
            return f41923q;
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    /* renamed from: e */
    public ExecutorService mo45062e() {
        return this.f41928c;
    }

    /* renamed from: f */
    public String mo45063f() {
        return "io.fabric.sdk.android:fabric";
    }

    /* renamed from: g */
    public Collection<C14225i> mo45064g() {
        return this.f41927b.values();
    }

    /* renamed from: h */
    public Handler mo45065h() {
        return this.f41929d;
    }

    /* renamed from: i */
    public String mo45066i() {
        return "1.4.8.32";
    }

    /* renamed from: c */
    private static void m61669c(C14215d dVar) {
        f41923q = dVar;
        dVar.m61673k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo45059b(Context context) {
        StringBuilder sb;
        Future a = mo45056a(context);
        Collection g = mo45064g();
        C14229m mVar = new C14229m(a, g);
        ArrayList<C14225i> arrayList = new ArrayList<>(g);
        Collections.sort(arrayList);
        mVar.injectParameters(context, this, C14221g.f41958a, this.f41932g);
        for (C14225i injectParameters : arrayList) {
            injectParameters.injectParameters(context, this, this.f41931f, this.f41932g);
        }
        mVar.initialize();
        C14228l j = m61672j();
        String str = f41919m;
        String str2 = " [Version: ";
        if (j.mo45041a(str, 3)) {
            sb = new StringBuilder("Initializing ");
            sb.append(mo45063f());
            sb.append(str2);
            sb.append(mo45066i());
            sb.append("], with the following kits:\n");
        } else {
            sb = null;
        }
        for (C14225i iVar : arrayList) {
            iVar.initializationTask.addDependency(mVar.initializationTask);
            mo45057a(this.f41927b, iVar);
            iVar.initialize();
            if (sb != null) {
                sb.append(iVar.getIdentifier());
                sb.append(str2);
                sb.append(iVar.getVersion());
                sb.append("]\n");
            }
        }
        if (sb != null) {
            m61672j().mo45042d(str, sb.toString());
        }
    }

    /* renamed from: a */
    public static C14215d m61661a(Context context, C14225i... iVarArr) {
        if (f41923q == null) {
            synchronized (C14215d.class) {
                if (f41923q == null) {
                    m61669c(new C14218c(context).mo45076a(iVarArr).mo45077a());
                }
            }
        }
        return f41923q;
    }

    /* renamed from: c */
    public String mo45060c() {
        return this.f41932g.mo45165f();
    }

    /* renamed from: d */
    public Activity mo45061d() {
        WeakReference<Activity> weakReference = this.f41934i;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static Activity m61670d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* renamed from: a */
    public C14215d mo45054a(Activity activity) {
        this.f41934i = new WeakReference<>(activity);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo45057a(Map<Class<? extends C14225i>, C14225i> map, C14225i iVar) {
        Class[] value;
        C6035e eVar = iVar.dependsOnAnnotation;
        if (eVar != null) {
            for (Class cls : eVar.value()) {
                if (cls.isInterface()) {
                    for (C14225i iVar2 : map.values()) {
                        if (cls.isAssignableFrom(iVar2.getClass())) {
                            iVar.initializationTask.addDependency(iVar2.initializationTask);
                        }
                    }
                } else if (((C14225i) map.get(cls)) != null) {
                    iVar.initializationTask.addDependency(((C14225i) map.get(cls)).initializationTask);
                } else {
                    throw new UnmetDependencyException("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    /* renamed from: a */
    public C14209a mo45053a() {
        return this.f41933h;
    }

    /* renamed from: a */
    public static <T extends C14225i> T m61662a(Class<T> cls) {
        return (C14225i) m61676n().f41927b.get(cls);
    }

    /* renamed from: a */
    private static void m61665a(Map<Class<? extends C14225i>, C14225i> map, Collection<? extends C14225i> collection) {
        for (C14225i iVar : collection) {
            map.put(iVar.getClass(), iVar);
            if (iVar instanceof C14226j) {
                m61665a(map, ((C14226j) iVar).getKits());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C14221g<?> mo45055a(int i) {
        return new C14217b(i);
    }

    /* renamed from: b */
    public String mo45058b() {
        return this.f41932g.mo45164e();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<Class<? extends C14225i>, C14225i> m61667b(Collection<? extends C14225i> collection) {
        HashMap hashMap = new HashMap(collection.size());
        m61665a((Map<Class<? extends C14225i>, C14225i>) hashMap, collection);
        return hashMap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Future<Map<String, C14227k>> mo45056a(Context context) {
        return mo45062e().submit(new C14220f(context.getPackageCodePath()));
    }
}
