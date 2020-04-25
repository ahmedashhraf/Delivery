package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.location.b1 */
final class C4623b1 extends C4624c {

    /* renamed from: s */
    private final /* synthetic */ Location f13879s;

    C4623b1(C4672x0 x0Var, C4086i iVar, Location location) {
        this.f13879s = location;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4675z) bVar).mo18792a(this.f13879s);
        mo17744a(Status.f12780P);
    }
}
