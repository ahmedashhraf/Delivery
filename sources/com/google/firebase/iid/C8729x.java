package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.util.C4476d0;
import com.mrsool.utils.C11644i;
import p201f.p202a.C5952h;

@C4476d0
/* renamed from: com.google.firebase.iid.x */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8729x extends BroadcastReceiver {
    @C5952h

    /* renamed from: a */
    private C8731y f22887a;

    public C8729x(C8731y yVar) {
        this.f22887a = yVar;
    }

    /* renamed from: a */
    public final void mo32171a() {
        boolean o = FirebaseInstanceId.m40759o();
        this.f22887a.mo32177a().registerReceiver(this, new IntentFilter(C11644i.f33356l7));
    }

    public final void onReceive(Context context, Intent intent) {
        C8731y yVar = this.f22887a;
        if (yVar != null && yVar.mo32178b()) {
            boolean o = FirebaseInstanceId.m40759o();
            FirebaseInstanceId.m40753a((Runnable) this.f22887a, 0);
            this.f22887a.mo32177a().unregisterReceiver(this);
            this.f22887a = null;
        }
    }
}
