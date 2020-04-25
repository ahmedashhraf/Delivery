package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.location.C5122d;
import com.google.android.gms.location.C5138k;
import com.google.android.gms.location.C5140l;
import com.google.android.gms.location.C5142m;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;

@C4476d0
/* renamed from: com.google.android.gms.internal.location.x0 */
public final class C4672x0 implements C5122d {
    /* renamed from: a */
    public final Location mo18775a(C4086i iVar) {
        try {
            return C5142m.m22410a(iVar).mo17532E();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C4237l<Status> mo18776a(C4086i iVar, PendingIntent pendingIntent) {
        return iVar.mo17705b(new C4621b(this, iVar, pendingIntent));
    }

    /* renamed from: a */
    public final C4237l<Status> mo18777a(C4086i iVar, Location location) {
        return iVar.mo17705b(new C4623b1(this, iVar, location));
    }

    /* renamed from: a */
    public final C4237l<Status> mo18778a(C4086i iVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return iVar.mo17705b(new C4635f1(this, iVar, locationRequest, pendingIntent));
    }

    /* renamed from: a */
    public final C4237l<Status> mo18779a(C4086i iVar, LocationRequest locationRequest, C5138k kVar, Looper looper) {
        C4632e1 e1Var = new C4632e1(this, iVar, locationRequest, kVar, looper);
        return iVar.mo17705b(e1Var);
    }

    /* renamed from: a */
    public final C4237l<Status> mo18780a(C4086i iVar, LocationRequest locationRequest, C5140l lVar) {
        C4300a0.m18621a(Looper.myLooper(), (Object) "Calling thread must be a prepared Looper thread.");
        return iVar.mo17705b(new C4674y0(this, iVar, locationRequest, lVar));
    }

    /* renamed from: a */
    public final C4237l<Status> mo18781a(C4086i iVar, LocationRequest locationRequest, C5140l lVar, Looper looper) {
        C4629d1 d1Var = new C4629d1(this, iVar, locationRequest, lVar, looper);
        return iVar.mo17705b(d1Var);
    }

    /* renamed from: a */
    public final C4237l<Status> mo18782a(C4086i iVar, C5138k kVar) {
        return iVar.mo17705b(new C4676z0(this, iVar, kVar));
    }

    /* renamed from: a */
    public final C4237l<Status> mo18783a(C4086i iVar, C5140l lVar) {
        return iVar.mo17705b(new C4638g1(this, iVar, lVar));
    }

    /* renamed from: a */
    public final C4237l<Status> mo18784a(C4086i iVar, boolean z) {
        return iVar.mo17705b(new C4620a1(this, iVar, z));
    }

    /* renamed from: b */
    public final LocationAvailability mo18785b(C4086i iVar) {
        try {
            return C5142m.m22410a(iVar).mo18787F();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final C4237l<Status> mo18786c(C4086i iVar) {
        return iVar.mo17705b(new C4626c1(this, iVar));
    }
}
