package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.a */
public class C4618a implements IInterface {

    /* renamed from: a */
    private final IBinder f13873a;

    /* renamed from: b */
    private final String f13874b;

    protected C4618a(IBinder iBinder, String str) {
        this.f13873a = iBinder;
        this.f13874b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public final Parcel mo18707G0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f13874b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo18708a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f13873a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f13873a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18710b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f13873a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo18711c(int i, Parcel parcel) throws RemoteException {
        try {
            this.f13873a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
