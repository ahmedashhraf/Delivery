package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.p165d.C4028b.C4029a;
import com.google.android.gms.auth.p165d.C4031d;
import com.google.android.gms.auth.p165d.C4033f;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4116a;

/* renamed from: com.google.android.gms.internal.auth.e0 */
final class C4581e0 extends C4116a<C4029a, C4597m0> {

    /* renamed from: s */
    private final /* synthetic */ String f13840s;

    C4581e0(C4577c0 c0Var, C4059a aVar, C4086i iVar, String str) {
        this.f13840s = str;
        super(aVar, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C4033f) ((C4597m0) bVar).mo18262z()).mo17565a((C4031d) new C4583f0(this), this.f13840s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C4246q mo17536b(Status status) {
        return new C4591j0(status, null);
    }
}
