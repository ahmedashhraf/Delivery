package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4519d.C4520a;
import p076c.p112d.p113a.p114a.p118d.p122d.C2613a;

/* renamed from: com.google.android.gms.common.internal.j1 */
public final class C4345j1 extends C2613a implements C4339h1 {
    C4345j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: i */
    public final C4519d mo18324i() throws RemoteException {
        Parcel a = mo10128a(1, mo10127a());
        C4519d a2 = C4520a.m19510a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final int mo18325l() throws RemoteException {
        Parcel a = mo10128a(2, mo10127a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
