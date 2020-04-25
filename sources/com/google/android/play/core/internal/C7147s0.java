package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.s0 */
public class C7147s0 implements IInterface {

    /* renamed from: a */
    private final IBinder f20253a;

    /* renamed from: b */
    private final String f20254b;

    protected C7147s0(IBinder iBinder, String str) {
        this.f20253a = iBinder;
        this.f20254b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28551a(int i, Parcel parcel) throws RemoteException {
        try {
            this.f20253a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f20253a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Parcel mo28553d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20254b);
        return obtain;
    }
}
