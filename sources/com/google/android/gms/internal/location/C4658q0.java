package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4117b;
import com.google.android.gms.location.ActivityTransitionRequest;

/* renamed from: com.google.android.gms.internal.location.q0 */
final class C4658q0 extends C4662s0 {

    /* renamed from: s */
    private final /* synthetic */ ActivityTransitionRequest f13901s;

    /* renamed from: t */
    private final /* synthetic */ PendingIntent f13902t;

    C4658q0(C4652n0 n0Var, C4086i iVar, ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        this.f13901s = activityTransitionRequest;
        this.f13902t = pendingIntent;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4675z) bVar).mo18796a(this.f13901s, this.f13902t, (C4117b<Status>) this);
    }
}
