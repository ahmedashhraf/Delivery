package com.google.android.gms.internal.plus;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.plus.a */
public class C5081a implements IInterface {

    /* renamed from: a */
    private final IBinder f14580a;

    /* renamed from: b */
    private final String f14581b;

    protected C5081a(IBinder iBinder, String str) {
        this.f14580a = iBinder;
        this.f14581b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public final Parcel mo19810G0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f14581b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo19811a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f14580a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f14580a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo19813b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f14580a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
