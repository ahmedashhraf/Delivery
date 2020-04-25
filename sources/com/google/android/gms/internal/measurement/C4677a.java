package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.a */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public class C4677a implements IInterface {

    /* renamed from: a */
    private final IBinder f13958a;

    /* renamed from: b */
    private final String f13959b;

    protected C4677a(IBinder iBinder, String str) {
        this.f13958a = iBinder;
        this.f13959b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public final Parcel mo18819G0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f13959b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo18820a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f13958a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f13958a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18822b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f13958a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
