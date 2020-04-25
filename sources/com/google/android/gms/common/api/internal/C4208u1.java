package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.common.api.internal.u1 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4208u1 extends BroadcastReceiver {

    /* renamed from: a */
    private Context f13153a;

    /* renamed from: b */
    private final C4203t1 f13154b;

    public C4208u1(C4203t1 t1Var) {
        this.f13154b = t1Var;
    }

    /* renamed from: a */
    public final void mo17977a(Context context) {
        this.f13153a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f13154b.mo17835a();
            mo17976a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo17976a() {
        if (this.f13153a != null) {
            this.f13153a.unregisterReceiver(this);
        }
        this.f13153a = null;
    }
}
