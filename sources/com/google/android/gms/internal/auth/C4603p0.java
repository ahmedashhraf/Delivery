package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.accounttransfer.C3939q;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.internal.C4346k;

/* renamed from: com.google.android.gms.internal.auth.p0 */
public final class C4603p0 extends C4346k<C4611t0> {

    /* renamed from: L */
    private final Bundle f13850L;

    public C4603p0(Context context, Looper looper, C4329f fVar, C3939q qVar, C4088b bVar, C4089c cVar) {
        super(context, looper, 128, fVar, bVar, cVar);
        if (qVar == null) {
            this.f13850L = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final String mo10082A() {
        return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final String mo10083B() {
        return "com.google.android.gms.auth.api.accounttransfer.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo10084a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
        if (queryLocalInterface instanceof C4611t0) {
            return (C4611t0) queryLocalInterface;
        }
        return new C4574b(iBinder);
    }

    /* renamed from: l */
    public final int mo10085l() {
        return C4284g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Bundle mo18258v() {
        return this.f13850L;
    }
}
