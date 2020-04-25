package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.C0637b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C4300a0;

/* renamed from: com.google.android.gms.common.api.internal.g0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4128g0 extends C4121e3 {

    /* renamed from: Q */
    private final C0637b<C4102c<?>> f12939Q = new C0637b<>();

    /* renamed from: R */
    private C4137i f12940R;

    private C4128g0(C4162m mVar) {
        super(mVar);
        this.f12884a.mo17920a("ConnectionlessLifecycleHelper", (LifecycleCallback) this);
    }

    /* renamed from: a */
    public static void m17812a(Activity activity, C4137i iVar, C4102c<?> cVar) {
        C4162m a = LifecycleCallback.m17696a(activity);
        C4128g0 g0Var = (C4128g0) a.mo17919a("ConnectionlessLifecycleHelper", C4128g0.class);
        if (g0Var == null) {
            g0Var = new C4128g0(a);
        }
        g0Var.f12940R = iVar;
        C4300a0.m18621a(cVar, (Object) "ApiKey cannot be null");
        g0Var.f12939Q.add(cVar);
        iVar.mo17852a(g0Var);
    }

    /* renamed from: i */
    private final void m17813i() {
        if (!this.f12939Q.isEmpty()) {
            this.f12940R.mo17852a(this);
        }
    }

    /* renamed from: c */
    public void mo17763c() {
        super.mo17763c();
        m17813i();
    }

    /* renamed from: d */
    public void mo17764d() {
        super.mo17764d();
        m17813i();
    }

    /* renamed from: e */
    public void mo17765e() {
        super.mo17765e();
        this.f12940R.mo17855b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo17789f() {
        this.f12940R.mo17857c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final C0637b<C4102c<?>> mo17834h() {
        return this.f12939Q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17788a(ConnectionResult connectionResult, int i) {
        this.f12940R.mo17848a(connectionResult, i);
    }
}
