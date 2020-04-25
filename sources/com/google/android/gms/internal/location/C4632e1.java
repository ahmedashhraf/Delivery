package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.internal.C4175o;
import com.google.android.gms.location.C5138k;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.e1 */
final class C4632e1 extends C4624c {

    /* renamed from: s */
    private final /* synthetic */ LocationRequest f13886s;

    /* renamed from: t */
    private final /* synthetic */ C5138k f13887t;

    /* renamed from: u */
    private final /* synthetic */ Looper f13888u;

    C4632e1(C4672x0 x0Var, C4086i iVar, LocationRequest locationRequest, C5138k kVar, Looper looper) {
        this.f13886s = locationRequest;
        this.f13887t = kVar;
        this.f13888u = looper;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4675z) bVar).mo18795a(zzbd.m19891a(this.f13886s), C4175o.m18099b(this.f13887t, C4646k0.m19777a(this.f13888u), C5138k.class.getSimpleName()), (C4643j) new C4627d(this));
    }
}
