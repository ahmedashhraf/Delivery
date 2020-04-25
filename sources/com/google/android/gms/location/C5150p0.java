package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.internal.C4167n;
import com.google.android.gms.common.api.internal.C4195s;
import com.google.android.gms.internal.location.C4643j;
import com.google.android.gms.internal.location.C4675z;
import com.google.android.gms.internal.location.zzbd;
import com.google.android.gms.tasks.C5562l;

/* renamed from: com.google.android.gms.location.p0 */
final class C5150p0 extends C4195s<C4675z, C5138k> {

    /* renamed from: d */
    private final /* synthetic */ zzbd f14794d;

    /* renamed from: e */
    private final /* synthetic */ C4167n f14795e;

    C5150p0(C5124e eVar, C4167n nVar, zzbd zzbd, C4167n nVar2) {
        this.f14794d = zzbd;
        this.f14795e = nVar2;
        super(nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17829a(C4061b bVar, C5562l lVar) throws RemoteException {
        ((C4675z) bVar).mo18795a(this.f14794d, this.f14795e, (C4643j) new C5125a(lVar));
    }
}
