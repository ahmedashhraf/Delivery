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

/* renamed from: com.google.android.gms.location.c */
public class C5120c extends C4083h<C4067d> {
    public C5120c(@C0193h0 Activity activity) {
        super(activity, C5142m.f14784c, null, (C4221x) new C4097b());
    }

    public C5120c(@C0193h0 Context context) {
        super(context, C5142m.f14784c, null, (C4221x) new C4097b());
    }

    @C0203m0("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: a */
    public C5560k<Void> mo20068a(long j, PendingIntent pendingIntent) {
        return C4416z.m19055a(C5113a.f14757e.mo18735a(mo17679c(), j, pendingIntent));
    }

    @C0203m0("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: a */
    public C5560k<Void> mo20069a(PendingIntent pendingIntent) {
        return C4416z.m19055a(C5113a.f14757e.mo18738b(mo17679c(), pendingIntent));
    }

    @C0203m0("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: a */
    public C5560k<Void> mo20070a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        return C4416z.m19055a(C5113a.f14757e.mo18737a(mo17679c(), activityTransitionRequest, pendingIntent));
    }

    @C0203m0("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    /* renamed from: b */
    public C5560k<Void> mo20071b(PendingIntent pendingIntent) {
        return C4416z.m19055a(C5113a.f14757e.mo18736a(mo17679c(), pendingIntent));
    }
}
