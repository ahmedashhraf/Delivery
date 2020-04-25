package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.C5117b;

/* renamed from: com.google.android.gms.internal.location.n0 */
public final class C4652n0 implements C5117b {
    /* renamed from: a */
    public final C4237l<Status> mo18735a(C4086i iVar, long j, PendingIntent pendingIntent) {
        C4654o0 o0Var = new C4654o0(this, iVar, j, pendingIntent);
        return iVar.mo17705b(o0Var);
    }

    /* renamed from: a */
    public final C4237l<Status> mo18736a(C4086i iVar, PendingIntent pendingIntent) {
        return iVar.mo17705b(new C4656p0(this, iVar, pendingIntent));
    }

    /* renamed from: a */
    public final C4237l<Status> mo18737a(C4086i iVar, ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        return iVar.mo17705b(new C4658q0(this, iVar, activityTransitionRequest, pendingIntent));
    }

    /* renamed from: b */
    public final C4237l<Status> mo18738b(C4086i iVar, PendingIntent pendingIntent) {
        return iVar.mo17705b(new C4660r0(this, iVar, pendingIntent));
    }
}
