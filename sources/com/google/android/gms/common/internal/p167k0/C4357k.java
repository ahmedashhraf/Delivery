package com.google.android.gms.common.internal.p167k0;

import android.os.Parcel;
import android.os.RemoteException;
import p076c.p112d.p113a.p114a.p118d.p121c.C2595a;

/* renamed from: com.google.android.gms.common.internal.k0.k */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4357k extends C2595a implements C4358l {
    public C4357k() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo10090a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo18330l(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
