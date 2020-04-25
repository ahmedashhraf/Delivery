package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.auth.a */
public class C4572a implements IInterface {

    /* renamed from: a */
    private final IBinder f13836a;

    /* renamed from: b */
    private final String f13837b;

    protected C4572a(IBinder iBinder, String str) {
        this.f13836a = iBinder;
        this.f13837b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public final Parcel mo18667G0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f13837b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo18668a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f13836a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f13836a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18670b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f13836a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
