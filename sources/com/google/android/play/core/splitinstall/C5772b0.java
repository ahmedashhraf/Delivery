package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.internal.C5742h;
import p076c.p112d.p113a.p130b.p131a.p132c.C2692b;

/* renamed from: com.google.android.play.core.splitinstall.b0 */
public final class C5772b0 extends C2692b<SplitInstallSessionState> {

    /* renamed from: i */
    private static C5772b0 f16625i;

    /* renamed from: g */
    private final Handler f16626g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private final C5779t f16627h;

    private C5772b0(Context context, C5779t tVar) {
        super(new C5742h("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f16627h = tVar;
    }

    /* renamed from: a */
    public static synchronized C5772b0 m25324a(Context context) {
        C5772b0 b0Var;
        synchronized (C5772b0.class) {
            if (f16625i == null) {
                f16625i = new C5772b0(context, C5780u.INSTANCE);
            }
            b0Var = f16625i;
        }
        return b0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m25325a(SplitInstallSessionState splitInstallSessionState, int i, int i2) {
        this.f16626g.post(new C7157a0(this, splitInstallSessionState, i, i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10353a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra != null) {
            SplitInstallSessionState a = SplitInstallSessionState.m34394a(bundleExtra);
            this.f9806a.mo23045b("ListenerRegistryBroadcastReceiver.onReceive: %s", a);
            C5777r d = this.f16627h.mo23064d();
            if (a.status() != 3 || d == null) {
                mo10355a(a);
            } else {
                d.mo23038a(a.mo28565c(), new C5776q(this, a, intent, context));
            }
        }
    }
}
