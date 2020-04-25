package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.C0193h0;
import androidx.annotation.C0203m0;
import com.google.android.gms.common.api.C4059a.C4063d.C4067d;
import com.google.android.gms.common.api.C4083h;
import com.google.android.gms.common.api.internal.C4097b;
import com.google.android.gms.common.api.internal.C4221x;
import com.google.android.gms.common.internal.C4416z;
import com.google.android.gms.tasks.C5560k;
import java.util.List;

/* renamed from: com.google.android.gms.location.i */
public class C5134i extends C4083h<C4067d> {
    public C5134i(@C0193h0 Activity activity) {
        super(activity, C5142m.f14784c, null, (C4221x) new C4097b());
    }

    public C5134i(@C0193h0 Context context) {
        super(context, C5142m.f14784c, null, (C4221x) new C4097b());
    }

    /* renamed from: a */
    public C5560k<Void> mo20099a(PendingIntent pendingIntent) {
        return C4416z.m19055a(C5142m.f14786e.mo18724a(mo17679c(), pendingIntent));
    }

    @C0203m0("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: a */
    public C5560k<Void> mo20100a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return C4416z.m19055a(C5142m.f14786e.mo18725a(mo17679c(), geofencingRequest, pendingIntent));
    }

    /* renamed from: a */
    public C5560k<Void> mo20101a(List<String> list) {
        return C4416z.m19055a(C5142m.f14786e.mo18726a(mo17679c(), list));
    }
}
