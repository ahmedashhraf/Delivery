package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.zb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public abstract class C5079zb extends C4707c1 implements C4690ac {
    public C5079zb() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18879a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo18859a(parcel.readString(), parcel.readString(), (Bundle) C4692b0.m19943a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int a = mo18858a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        }
        return true;
    }
}
