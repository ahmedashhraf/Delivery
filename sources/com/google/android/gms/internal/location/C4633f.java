package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C5127f;
import com.google.android.gms.location.C5132h;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GeofencingRequest.C5111a;
import com.google.android.gms.location.zzal;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.f */
public final class C4633f implements C5132h {
    /* renamed from: a */
    private final C4237l<Status> m19759a(C4086i iVar, zzal zzal) {
        return iVar.mo17705b(new C4639h(this, iVar, zzal));
    }

    /* renamed from: a */
    public final C4237l<Status> mo18724a(C4086i iVar, PendingIntent pendingIntent) {
        return m19759a(iVar, zzal.m22440a(pendingIntent));
    }

    /* renamed from: a */
    public final C4237l<Status> mo18725a(C4086i iVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return iVar.mo17705b(new C4636g(this, iVar, geofencingRequest, pendingIntent));
    }

    /* renamed from: a */
    public final C4237l<Status> mo18726a(C4086i iVar, List<String> list) {
        return m19759a(iVar, zzal.zza(list));
    }

    @Deprecated
    /* renamed from: a */
    public final C4237l<Status> mo18727a(C4086i iVar, List<C5127f> list, PendingIntent pendingIntent) {
        C5111a aVar = new C5111a();
        aVar.mo20014a(list);
        aVar.mo20012a(5);
        return mo18725a(iVar, aVar.mo20015a(), pendingIntent);
    }
}
