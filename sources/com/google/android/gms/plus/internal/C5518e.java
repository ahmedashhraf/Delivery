package com.google.android.gms.plus.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4519d.C4520a;
import com.google.android.gms.internal.plus.C5081a;
import com.google.android.gms.internal.plus.C5088f;

/* renamed from: com.google.android.gms.plus.internal.e */
public final class C5518e extends C5081a implements C5517d {
    C5518e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.internal.IPlusOneButtonCreator");
    }

    /* renamed from: a */
    public final C4519d mo21930a(C4519d dVar, int i, int i2, String str, int i3) throws RemoteException {
        Parcel G0 = mo19810G0();
        C5088f.m22087a(G0, (IInterface) dVar);
        G0.writeInt(i);
        G0.writeInt(i2);
        G0.writeString(str);
        G0.writeInt(i3);
        Parcel a = mo19811a(1, G0);
        C4519d a2 = C4520a.m19510a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
