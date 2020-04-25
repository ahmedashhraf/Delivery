package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.internal.C4098b0;
import com.google.android.gms.common.api.internal.C4167n.C4168a;
import com.google.android.gms.internal.location.C4675z;
import com.google.android.gms.tasks.C5562l;

/* renamed from: com.google.android.gms.location.q0 */
final class C5153q0 extends C4098b0<C4675z, C5138k> {

    /* renamed from: b */
    private final /* synthetic */ C5124e f14800b;

    C5153q0(C5124e eVar, C4168a aVar) {
        this.f14800b = eVar;
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17776a(C4061b bVar, C5562l lVar) throws RemoteException {
        try {
            ((C4675z) bVar).mo18803b(mo17775a(), this.f14800b.m22375a(lVar));
        } catch (RuntimeException e) {
            lVar.mo22020b((Exception) e);
        }
    }
}
