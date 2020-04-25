package p076c.p082c.p083a.p105v;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.C1376c;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;
import p076c.p082c.p083a.C2245q;
import p076c.p082c.p083a.p084a0.C2216i;

/* renamed from: c.c.a.v.k */
/* compiled from: RequestManagerRetriever */
public class C2508k implements Callback {

    /* renamed from: e */
    private static final String f9529e = "RMRetriever";

    /* renamed from: f */
    static final String f9530f = "com.bumptech.glide.manager";

    /* renamed from: g */
    private static final C2508k f9531g = new C2508k();

    /* renamed from: h */
    private static final int f9532h = 1;

    /* renamed from: i */
    private static final int f9533i = 2;

    /* renamed from: a */
    private volatile C2245q f9534a;

    /* renamed from: b */
    final Map<FragmentManager, C2505j> f9535b = new HashMap();

    /* renamed from: c */
    final Map<C1382h, C2511n> f9536c = new HashMap();

    /* renamed from: d */
    private final Handler f9537d = new Handler(Looper.getMainLooper(), this);

    C2508k() {
    }

    /* renamed from: a */
    public static C2508k m12460a() {
        return f9531g;
    }

    /* renamed from: b */
    private C2245q m12461b(Context context) {
        if (this.f9534a == null) {
            synchronized (this) {
                if (this.f9534a == null) {
                    this.f9534a = new C2245q(context.getApplicationContext(), new C2495b(), new C2501f());
                }
            }
        }
        return this.f9534a;
    }

    public boolean handleMessage(Message message) {
        Object obj;
        int i = message.what;
        Object obj2 = null;
        boolean z = true;
        if (i == 1) {
            obj2 = (FragmentManager) message.obj;
            obj = this.f9535b.remove(obj2);
        } else if (i != 2) {
            z = false;
            obj = null;
        } else {
            obj2 = (C1382h) message.obj;
            obj = this.f9536c.remove(obj2);
        }
        if (z && obj == null && Log.isLoggable(f9529e, 5)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to remove expected request manager fragment, manager: ");
            sb.append(obj2);
            sb.toString();
        }
        return z;
    }

    /* renamed from: a */
    public C2245q mo9951a(Context context) {
        if (context != null) {
            if (C2216i.m11350d() && !(context instanceof Application)) {
                if (context instanceof C1376c) {
                    return mo9955a((C1376c) context);
                }
                if (context instanceof Activity) {
                    return mo9949a((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    return mo9951a(((ContextWrapper) context).getBaseContext());
                }
            }
            return m12461b(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @TargetApi(17)
    /* renamed from: b */
    private static void m12462b(Activity activity) {
        if (VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: a */
    public C2245q mo9955a(C1376c cVar) {
        if (C2216i.m11349c()) {
            return mo9951a(cVar.getApplicationContext());
        }
        m12462b((Activity) cVar);
        return mo9953a((Context) cVar, cVar.getSupportFragmentManager());
    }

    /* renamed from: a */
    public C2245q mo9954a(Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (C2216i.m11349c()) {
            return mo9951a(fragment.getActivity().getApplicationContext());
        } else {
            return mo9953a((Context) fragment.getActivity(), fragment.getChildFragmentManager());
        }
    }

    @TargetApi(11)
    /* renamed from: a */
    public C2245q mo9949a(Activity activity) {
        if (C2216i.m11349c() || VERSION.SDK_INT < 11) {
            return mo9951a(activity.getApplicationContext());
        }
        m12462b(activity);
        return mo9952a((Context) activity, activity.getFragmentManager());
    }

    @TargetApi(17)
    /* renamed from: a */
    public C2245q mo9950a(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (C2216i.m11349c() || VERSION.SDK_INT < 17) {
            return mo9951a(fragment.getActivity().getApplicationContext());
        } else {
            return mo9952a((Context) fragment.getActivity(), fragment.getChildFragmentManager());
        }
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(17)
    /* renamed from: a */
    public C2505j mo9956a(FragmentManager fragmentManager) {
        String str = f9530f;
        C2505j jVar = (C2505j) fragmentManager.findFragmentByTag(str);
        if (jVar != null) {
            return jVar;
        }
        C2505j jVar2 = (C2505j) this.f9535b.get(fragmentManager);
        if (jVar2 != null) {
            return jVar2;
        }
        C2505j jVar3 = new C2505j();
        this.f9535b.put(fragmentManager, jVar3);
        fragmentManager.beginTransaction().add(jVar3, str).commitAllowingStateLoss();
        this.f9537d.obtainMessage(1, fragmentManager).sendToTarget();
        return jVar3;
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(11)
    /* renamed from: a */
    public C2245q mo9952a(Context context, FragmentManager fragmentManager) {
        C2505j a = mo9956a(fragmentManager);
        C2245q c = a.mo9940c();
        if (c != null) {
            return c;
        }
        C2245q qVar = new C2245q(context, a.mo9939b(), a.mo9941d());
        a.mo9938a(qVar);
        return qVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2511n mo9957a(C1382h hVar) {
        String str = f9530f;
        C2511n nVar = (C2511n) hVar.mo6223a(str);
        if (nVar != null) {
            return nVar;
        }
        C2511n nVar2 = (C2511n) this.f9536c.get(hVar);
        if (nVar2 != null) {
            return nVar2;
        }
        C2511n nVar3 = new C2511n();
        this.f9536c.put(hVar, nVar3);
        hVar.mo6224a().mo6398a((Fragment) nVar3, str).mo6100f();
        this.f9537d.obtainMessage(2, hVar).sendToTarget();
        return nVar3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2245q mo9953a(Context context, C1382h hVar) {
        C2511n a = mo9957a(hVar);
        C2245q x = a.mo9969x();
        if (x != null) {
            return x;
        }
        C2245q qVar = new C2245q(context, a.getLifecycle(), a.mo9970y());
        a.mo9967a(qVar);
        return qVar;
    }
}
