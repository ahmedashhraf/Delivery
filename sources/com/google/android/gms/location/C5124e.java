package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0203m0;
import com.google.android.gms.common.api.C4059a.C4063d.C4067d;
import com.google.android.gms.common.api.C4083h;
import com.google.android.gms.common.api.internal.C4093a0;
import com.google.android.gms.common.api.internal.C4097b;
import com.google.android.gms.common.api.internal.C4167n;
import com.google.android.gms.common.api.internal.C4175o;
import com.google.android.gms.common.api.internal.C4221x;
import com.google.android.gms.common.api.internal.C4230z;
import com.google.android.gms.common.internal.C4416z;
import com.google.android.gms.internal.location.C4643j;
import com.google.android.gms.internal.location.C4645k;
import com.google.android.gms.internal.location.C4646k0;
import com.google.android.gms.internal.location.zzad;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5562l;

/* renamed from: com.google.android.gms.location.e */
public class C5124e extends C4083h<C4067d> {

    /* renamed from: j */
    public static final String f14760j = "verticalAccuracy";

    /* renamed from: com.google.android.gms.location.e$a */
    private static class C5125a extends C4645k {

        /* renamed from: b */
        private final C5562l<Void> f14761b;

        public C5125a(C5562l<Void> lVar) {
            this.f14761b = lVar;
        }

        /* renamed from: a */
        public final void mo18718a(zzad zzad) {
            C4093a0.m17711a(zzad.mo17504f(), this.f14761b);
        }
    }

    public C5124e(@C0193h0 Activity activity) {
        super(activity, C5142m.f14784c, null, (C4221x) new C4097b());
    }

    public C5124e(@C0193h0 Context context) {
        super(context, C5142m.f14784c, null, (C4221x) new C4097b());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C4643j m22375a(C5562l<Boolean> lVar) {
        return new C5155r0(this, lVar);
    }

    /* renamed from: a */
    public C5560k<Void> mo20076a(PendingIntent pendingIntent) {
        return C4416z.m19055a(C5142m.f14785d.mo18776a(mo17679c(), pendingIntent));
    }

    @C0203m0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    public C5560k<Void> mo20077a(Location location) {
        return C4416z.m19055a(C5142m.f14785d.mo18777a(mo17679c(), location));
    }

    @C0203m0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    public C5560k<Void> mo20078a(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return C4416z.m19055a(C5142m.f14785d.mo18778a(mo17679c(), locationRequest, pendingIntent));
    }

    @C0203m0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    public C5560k<Void> mo20079a(LocationRequest locationRequest, C5138k kVar, @C0195i0 Looper looper) {
        zzbd a = zzbd.m19891a(locationRequest);
        C4167n b = C4175o.m18099b(kVar, C4646k0.m19777a(looper), C5138k.class.getSimpleName());
        return mo17673a(new C5150p0(this, b, a, b), new C5153q0(this, b.mo17932b()));
    }

    /* renamed from: a */
    public C5560k<Void> mo20080a(C5138k kVar) {
        return C4093a0.m17710a(mo17672a(C4175o.m18098a(kVar, C5138k.class.getSimpleName())));
    }

    @C0203m0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: a */
    public C5560k<Void> mo20081a(boolean z) {
        return C4416z.m19055a(C5142m.f14785d.mo18784a(mo17679c(), z));
    }

    /* renamed from: k */
    public C5560k<Void> mo20082k() {
        return C4416z.m19055a(C5142m.f14785d.mo18786c(mo17679c()));
    }

    @C0203m0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: l */
    public C5560k<Location> mo20083l() {
        return mo17678b((C4230z<A, TResult>) new C5146n0<A,TResult>(this));
    }

    @C0203m0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: m */
    public C5560k<LocationAvailability> mo20084m() {
        return mo17678b((C4230z<A, TResult>) new C5148o0<A,TResult>(this));
    }
}
