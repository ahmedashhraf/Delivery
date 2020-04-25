package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import androidx.annotation.C0203m0;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: com.google.android.gms.location.d */
public interface C5122d {
    @Deprecated

    /* renamed from: a */
    public static final String f14758a = "com.google.android.location.LOCATION";

    /* renamed from: b */
    public static final String f14759b = "mockLocation";

    @C0203m0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    Location mo18775a(C4086i iVar);

    /* renamed from: a */
    C4237l<Status> mo18776a(C4086i iVar, PendingIntent pendingIntent);

    @C0203m0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    C4237l<Status> mo18777a(C4086i iVar, Location location);

    @C0203m0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    C4237l<Status> mo18778a(C4086i iVar, LocationRequest locationRequest, PendingIntent pendingIntent);

    @C0203m0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    C4237l<Status> mo18779a(C4086i iVar, LocationRequest locationRequest, C5138k kVar, Looper looper);

    @C0203m0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    C4237l<Status> mo18780a(C4086i iVar, LocationRequest locationRequest, C5140l lVar);

    @C0203m0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    C4237l<Status> mo18781a(C4086i iVar, LocationRequest locationRequest, C5140l lVar, Looper looper);

    /* renamed from: a */
    C4237l<Status> mo18782a(C4086i iVar, C5138k kVar);

    /* renamed from: a */
    C4237l<Status> mo18783a(C4086i iVar, C5140l lVar);

    @C0203m0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    C4237l<Status> mo18784a(C4086i iVar, boolean z);

    @C0203m0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: b */
    LocationAvailability mo18785b(C4086i iVar);

    /* renamed from: c */
    C4237l<Status> mo18786c(C4086i iVar);
}
