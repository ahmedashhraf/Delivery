package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.content.DialogInterface.OnCancelListener;
import androidx.annotation.C0187e0;
import com.google.android.gms.common.C4279e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: com.google.android.gms.common.api.internal.f3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4126f3 implements Runnable {

    /* renamed from: a */
    private final C4131g3 f12936a;

    /* renamed from: b */
    final /* synthetic */ C4121e3 f12937b;

    C4126f3(C4121e3 e3Var, C4131g3 g3Var) {
        this.f12937b = e3Var;
        this.f12936a = g3Var;
    }

    @C0187e0
    public final void run() {
        if (this.f12937b.f12932b) {
            ConnectionResult a = this.f12936a.mo17836a();
            if (a.mo17579Q()) {
                C4121e3 e3Var = this.f12937b;
                e3Var.f12884a.startActivityForResult(GoogleApiActivity.m17529a(e3Var.mo17757a(), a.mo17578P(), this.f12936a.mo17837b(), false), 1);
            } else if (this.f12937b.f12931P.mo18112c(a.mo17576N())) {
                C4121e3 e3Var2 = this.f12937b;
                e3Var2.f12931P.mo18104a(e3Var2.mo17757a(), this.f12937b.f12884a, a.mo17576N(), 2, this.f12937b);
            } else if (a.mo17576N() == 18) {
                Dialog a2 = C4279e.m18474a(this.f12937b.mo17757a(), (OnCancelListener) this.f12937b);
                C4121e3 e3Var3 = this.f12937b;
                e3Var3.f12931P.mo18100a(e3Var3.mo17757a().getApplicationContext(), (C4203t1) new C4136h3(this, a2));
            } else {
                this.f12937b.mo17788a(a, this.f12936a.mo17837b());
            }
        }
    }
}
