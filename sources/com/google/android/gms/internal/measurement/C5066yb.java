package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.yb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public abstract class C5066yb extends C4707c1 implements C5027vb {
    public C5066yb() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18879a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo19016c((Bundle) C4692b0.m19943a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
