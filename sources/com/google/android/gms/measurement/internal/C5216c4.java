package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.C0187e0;
import com.google.android.gms.internal.measurement.C4722d2;
import com.google.android.gms.internal.measurement.C4725d5;

/* renamed from: com.google.android.gms.measurement.internal.c4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5216c4 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f14924a;

    /* renamed from: b */
    final /* synthetic */ C5238e4 f14925b;

    C5216c4(C5238e4 e4Var, String str) {
        this.f14925b = e4Var;
        this.f14924a = str;
    }

    @C0187e0
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f14925b.f14970a.mo21205d().mo21536w().mo21549a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            C4722d2 a = C4725d5.m20020a(iBinder);
            if (a == null) {
                this.f14925b.f14970a.mo21205d().mo21536w().mo21549a("Install Referrer Service implementation was not found");
                return;
            }
            this.f14925b.f14970a.mo21205d().mo21539z().mo21549a("Install Referrer Service connected");
            this.f14925b.f14970a.mo21203c().mo21555a((Runnable) new C5260g4(this, a, this));
        } catch (Exception e) {
            this.f14925b.f14970a.mo21205d().mo21536w().mo21550a("Exception occurred while calling Install Referrer API", e);
        }
    }

    @C0187e0
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f14925b.f14970a.mo21205d().mo21539z().mo21549a("Install Referrer Service disconnected");
    }
}
