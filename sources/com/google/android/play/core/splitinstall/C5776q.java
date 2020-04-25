package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.play.core.splitinstall.q */
public class C5776q {

    /* renamed from: a */
    final /* synthetic */ SplitInstallSessionState f16655a;

    /* renamed from: b */
    final /* synthetic */ Intent f16656b;

    /* renamed from: c */
    final /* synthetic */ Context f16657c;

    /* renamed from: d */
    final /* synthetic */ C5772b0 f16658d;

    C5776q(C5772b0 b0Var, SplitInstallSessionState splitInstallSessionState, Intent intent, Context context) {
        this.f16658d = b0Var;
        this.f16655a = splitInstallSessionState;
        this.f16656b = intent;
        this.f16657c = context;
    }

    /* renamed from: a */
    public void mo23060a() {
        this.f16658d.m25325a(this.f16655a, 5, 0);
    }

    /* renamed from: a */
    public void mo23061a(int i) {
        this.f16658d.m25325a(this.f16655a, 6, i);
    }

    /* renamed from: b */
    public void mo23062b() {
        String str = "triggered_from_app_after_verification";
        if (!this.f16656b.getBooleanExtra(str, false)) {
            this.f16656b.putExtra(str, true);
            this.f16657c.sendBroadcast(this.f16656b);
            return;
        }
        this.f16658d.f9806a.mo23047d("Splits copied and verified more than once.", new Object[0]);
    }
}
