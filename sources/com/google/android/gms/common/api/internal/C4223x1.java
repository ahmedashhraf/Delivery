package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4305c;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5562l;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.gms.common.api.internal.x1 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4223x1 extends C4121e3 {

    /* renamed from: Q */
    private C5562l<Void> f13179Q = new C5562l<>();

    private C4223x1(C4162m mVar) {
        super(mVar);
        this.f12884a.mo17920a("GmsAvailabilityHelper", (LifecycleCallback) this);
    }

    /* renamed from: b */
    public static C4223x1 m18273b(Activity activity) {
        C4162m a = LifecycleCallback.m17696a(activity);
        C4223x1 x1Var = (C4223x1) a.mo17919a("GmsAvailabilityHelper", C4223x1.class);
        if (x1Var == null) {
            return new C4223x1(a);
        }
        if (x1Var.f13179Q.mo22017a().mo22012d()) {
            x1Var.f13179Q = new C5562l<>();
        }
        return x1Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17788a(ConnectionResult connectionResult, int i) {
        this.f13179Q.mo22018a((Exception) C4305c.m18635a(new Status(connectionResult.mo17576N(), connectionResult.mo17577O(), connectionResult.mo17578P())));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo17789f() {
        Activity s = this.f12884a.mo17922s();
        if (s == null) {
            this.f13179Q.mo22020b((Exception) new ApiException(new Status(8)));
            return;
        }
        int d = this.f12931P.mo18113d(s);
        if (d == 0) {
            this.f13179Q.mo22021b(null);
            return;
        }
        if (!this.f13179Q.mo22017a().mo22012d()) {
            mo17817b(new ConnectionResult(d, null), 0);
        }
    }

    /* renamed from: h */
    public final C5560k<Void> mo17993h() {
        return this.f13179Q.mo22017a();
    }

    /* renamed from: b */
    public void mo17761b() {
        super.mo17761b();
        this.f13179Q.mo22020b((Exception) new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }
}
