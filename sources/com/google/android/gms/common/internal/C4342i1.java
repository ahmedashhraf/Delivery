package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import p076c.p112d.p113a.p114a.p118d.p122d.C2614b;
import p076c.p112d.p113a.p114a.p118d.p122d.C2615c;

/* renamed from: com.google.android.gms.common.internal.i1 */
public abstract class C4342i1 extends C2614b implements C4339h1 {
    public C4342i1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public static C4339h1 m18804a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof C4339h1) {
            return (C4339h1) queryLocalInterface;
        }
        return new C4345j1(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10132a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C4519d i3 = mo18324i();
            parcel2.writeNoException();
            C2615c.m12724a(parcel2, (IInterface) i3);
        } else if (i != 2) {
            return false;
        } else {
            int l = mo18325l();
            parcel2.writeNoException();
            parcel2.writeInt(l);
        }
        return true;
    }
}
