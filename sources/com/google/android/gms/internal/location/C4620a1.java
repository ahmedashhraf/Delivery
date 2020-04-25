package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.location.a1 */
final class C4620a1 extends C4624c {

    /* renamed from: s */
    private final /* synthetic */ boolean f13876s;

    C4620a1(C4672x0 x0Var, C4086i iVar, boolean z) {
        this.f13876s = z;
        super(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4675z) bVar).mo18802a(this.f13876s);
        mo17744a(Status.f12780P);
    }
}
