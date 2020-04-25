package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C4230z.C4231a;
import com.google.android.gms.tasks.C5562l;

/* renamed from: com.google.android.gms.common.api.internal.o2 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4178o2 extends C4230z<A, ResultT> {

    /* renamed from: c */
    private final /* synthetic */ C4231a f13087c;

    C4178o2(C4231a aVar, Feature[] featureArr, boolean z) {
        this.f13087c = aVar;
        super(featureArr, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10089a(A a, C5562l<ResultT> lVar) throws RemoteException {
        this.f13087c.f13191a.mo17779a(a, lVar);
    }
}
