package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.C0203m0;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: com.google.android.gms.location.b */
public interface C5117b {
    @C0203m0("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: a */
    C4237l<Status> mo18735a(C4086i iVar, long j, PendingIntent pendingIntent);

    @C0203m0("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: a */
    C4237l<Status> mo18736a(C4086i iVar, PendingIntent pendingIntent);

    @C0203m0("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: a */
    C4237l<Status> mo18737a(C4086i iVar, ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent);

    @C0203m0("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: b */
    C4237l<Status> mo18738b(C4086i iVar, PendingIntent pendingIntent);
}
