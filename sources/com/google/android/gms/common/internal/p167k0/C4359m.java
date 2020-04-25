package com.google.android.gms.common.internal.p167k0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p076c.p112d.p113a.p114a.p118d.p121c.C2596b;
import p076c.p112d.p113a.p114a.p118d.p121c.C2598d;

/* renamed from: com.google.android.gms.common.internal.k0.m */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4359m extends C2596b implements C4360n {
    C4359m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    /* renamed from: a */
    public final void mo18332a(C4358l lVar) throws RemoteException {
        Parcel G0 = mo10093G0();
        C2598d.m12703a(G0, (IInterface) lVar);
        mo10097c(1, G0);
    }
}
