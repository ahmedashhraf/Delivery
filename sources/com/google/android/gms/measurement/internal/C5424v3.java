package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.C0187e0;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import com.mrsool.utils.C11644i;

/* renamed from: com.google.android.gms.measurement.internal.v3 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
class C5424v3 extends BroadcastReceiver {
    @C4476d0

    /* renamed from: d */
    private static final String f15521d = C5424v3.class.getName();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5461y8 f15522a;

    /* renamed from: b */
    private boolean f15523b;

    /* renamed from: c */
    private boolean f15524c;

    C5424v3(C5461y8 y8Var) {
        C4300a0.m18620a(y8Var);
        this.f15522a = y8Var;
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21731a() {
        this.f15522a.mo21861o();
        this.f15522a.mo21203c().mo21209h();
        if (!this.f15523b) {
            this.f15522a.mo21206e().registerReceiver(this, new IntentFilter(C11644i.f33356l7));
            this.f15524c = this.f15522a.mo21854h().mo21576v();
            this.f15522a.mo21205d().mo21528C().mo21550a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f15524c));
            this.f15523b = true;
        }
    }

    @C0226w0
    /* renamed from: b */
    public final void mo21732b() {
        this.f15522a.mo21861o();
        this.f15522a.mo21203c().mo21209h();
        this.f15522a.mo21203c().mo21209h();
        if (this.f15523b) {
            this.f15522a.mo21205d().mo21528C().mo21549a("Unregistering connectivity change receiver");
            this.f15523b = false;
            this.f15524c = false;
            try {
                this.f15522a.mo21206e().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f15522a.mo21205d().mo21533t().mo21550a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @C0187e0
    public void onReceive(Context context, Intent intent) {
        this.f15522a.mo21861o();
        String action = intent.getAction();
        this.f15522a.mo21205d().mo21528C().mo21550a("NetworkBroadcastReceiver received action", action);
        if (C11644i.f33356l7.equals(action)) {
            boolean v = this.f15522a.mo21854h().mo21576v();
            if (this.f15524c != v) {
                this.f15524c = v;
                this.f15522a.mo21203c().mo21555a((Runnable) new C5413u3(this, v));
            }
            return;
        }
        this.f15522a.mo21205d().mo21536w().mo21550a("NetworkBroadcastReceiver received unknown action", action);
    }
}
