package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.C4607r0;
import com.google.android.gms.internal.auth.C4611t0;
import com.google.android.gms.internal.auth.zzv;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.k */
final class C3933k extends C3923b<DeviceMetaData> {

    /* renamed from: d */
    private final /* synthetic */ zzv f12457d;

    C3933k(C3921b bVar, zzv zzv) {
        this.f12457d = zzv;
        super(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17310a(C4611t0 t0Var) throws RemoteException {
        t0Var.mo18675a((C4607r0) new C3934l(this, this), this.f12457d);
    }
}
