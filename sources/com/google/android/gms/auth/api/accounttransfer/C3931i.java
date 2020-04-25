package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.C4607r0;
import com.google.android.gms.internal.auth.C4611t0;
import com.google.android.gms.internal.auth.zzad;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.i */
final class C3931i extends C3923b<byte[]> {

    /* renamed from: d */
    private final /* synthetic */ zzad f12455d;

    C3931i(C3921b bVar, zzad zzad) {
        this.f12455d = zzad;
        super(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17310a(C4611t0 t0Var) throws RemoteException {
        t0Var.mo18672a((C4607r0) new C3932j(this, this), this.f12455d);
    }
}
