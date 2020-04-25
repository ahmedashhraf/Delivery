package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.p165d.C4033f;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4116a;

/* renamed from: com.google.android.gms.internal.auth.d0 */
final class C4579d0 extends C4116a<C4246q, C4597m0> {

    /* renamed from: s */
    private final /* synthetic */ boolean f13839s;

    C4579d0(C4577c0 c0Var, C4059a aVar, C4086i iVar, boolean z) {
        this.f13839s = z;
        super(aVar, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4033f) ((C4597m0) bVar).mo18262z()).mo17566b(this.f13839s);
        mo17744a(new C4593k0(Status.f12780P));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C4246q mo17536b(Status status) {
        return new C4593k0(status);
    }
}
