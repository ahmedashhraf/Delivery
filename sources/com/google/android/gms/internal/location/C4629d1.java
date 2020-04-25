package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.internal.C4175o;
import com.google.android.gms.location.C5140l;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.d1 */
final class C4629d1 extends C4624c {

    /* renamed from: s */
    private final /* synthetic */ LocationRequest f13883s;

    /* renamed from: t */
    private final /* synthetic */ C5140l f13884t;

    /* renamed from: u */
    private final /* synthetic */ Looper f13885u;

    C4629d1(C4672x0 x0Var, C4086i iVar, LocationRequest locationRequest, C5140l lVar, Looper looper) {
        this.f13883s = locationRequest;
        this.f13884t = lVar;
        this.f13885u = looper;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4675z) bVar).mo18799a(this.f13883s, C4175o.m18099b(this.f13884t, C4646k0.m19777a(this.f13885u), C5140l.class.getSimpleName()), (C4643j) new C4627d(this));
    }
}
