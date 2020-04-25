package com.google.android.gms.common.internal.p167k0;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4117b;

/* renamed from: com.google.android.gms.common.internal.k0.h */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4354h extends C4348b {

    /* renamed from: b */
    private final C4117b<Status> f13501b;

    public C4354h(C4117b<Status> bVar) {
        this.f13501b = bVar;
    }

    /* renamed from: l */
    public final void mo18330l(int i) throws RemoteException {
        this.f13501b.mo17810a(new Status(i));
    }
}
