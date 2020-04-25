package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.h3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4136h3 extends C4203t1 {

    /* renamed from: a */
    private final /* synthetic */ Dialog f12951a;

    /* renamed from: b */
    private final /* synthetic */ C4126f3 f12952b;

    C4136h3(C4126f3 f3Var, Dialog dialog) {
        this.f12952b = f3Var;
        this.f12951a = dialog;
    }

    /* renamed from: a */
    public final void mo17835a() {
        this.f12952b.f12937b.mo17818g();
        if (this.f12951a.isShowing()) {
            this.f12951a.dismiss();
        }
    }
}
