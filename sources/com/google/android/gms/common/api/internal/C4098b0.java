package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.internal.C4167n.C4168a;
import com.google.android.gms.tasks.C5562l;

@C4056a
/* renamed from: com.google.android.gms.common.api.internal.b0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4098b0<A extends C4061b, L> {

    /* renamed from: a */
    private final C4168a<L> f12888a;

    @C4056a
    protected C4098b0(C4168a<L> aVar) {
        this.f12888a = aVar;
    }

    @C4056a
    /* renamed from: a */
    public C4168a<L> mo17775a() {
        return this.f12888a;
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public abstract void mo17776a(A a, C5562l<Boolean> lVar) throws RemoteException;
}
