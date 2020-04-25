package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.C0203m0;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.Status;
import java.util.List;

@Deprecated
/* renamed from: com.google.android.gms.location.h */
public interface C5132h {
    /* renamed from: a */
    C4237l<Status> mo18724a(C4086i iVar, PendingIntent pendingIntent);

    @C0203m0("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: a */
    C4237l<Status> mo18725a(C4086i iVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent);

    /* renamed from: a */
    C4237l<Status> mo18726a(C4086i iVar, List<String> list);

    @Deprecated
    @C0203m0("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: a */
    C4237l<Status> mo18727a(C4086i iVar, List<C5127f> list, PendingIntent pendingIntent);
}
