package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.auth-api.a */
public class C4550a implements IInterface {

    /* renamed from: a */
    private final IBinder f13822a;

    /* renamed from: b */
    private final String f13823b;

    protected C4550a(IBinder iBinder, String str) {
        this.f13822a = iBinder;
        this.f13823b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public final Parcel mo18648G0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f13823b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18649a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f13822a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f13822a;
    }
}
