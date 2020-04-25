package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.cc */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public final class C4718cc extends C4677a implements C4690ac {
    C4718cc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: a */
    public final void mo18859a(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeString(str);
        G0.writeString(str2);
        C4692b0.m19945a(G0, (Parcelable) bundle);
        G0.writeLong(j);
        mo18822b(1, G0);
    }

    /* renamed from: a */
    public final int mo18858a() throws RemoteException {
        Parcel a = mo18820a(2, mo18819G0());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
