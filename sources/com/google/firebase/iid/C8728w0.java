package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.C0193h0;

/* renamed from: com.google.firebase.iid.w0 */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
public final class C8728w0 implements C8722t0 {

    /* renamed from: a */
    private final IBinder f22886a;

    C8728w0(@C0193h0 IBinder iBinder) {
        this.f22886a = iBinder;
    }

    /* renamed from: a */
    public final void mo32157a(@C0193h0 Message message) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.f22886a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @C0193h0
    public final IBinder asBinder() {
        return this.f22886a;
    }
}
