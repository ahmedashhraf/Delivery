package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4519d.C4520a;
import p076c.p112d.p113a.p114a.p118d.p122d.C2613a;
import p076c.p112d.p113a.p114a.p118d.p122d.C2615c;

/* renamed from: com.google.android.gms.dynamite.l */
public final class C4549l extends C2613a implements C4548k {
    C4549l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: a */
    public final C4519d mo18646a(C4519d dVar, String str, int i, C4519d dVar2) throws RemoteException {
        Parcel a = mo10127a();
        C2615c.m12724a(a, (IInterface) dVar);
        a.writeString(str);
        a.writeInt(i);
        C2615c.m12724a(a, (IInterface) dVar2);
        Parcel a2 = mo10128a(2, a);
        C4519d a3 = C4520a.m19510a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    /* renamed from: b */
    public final C4519d mo18647b(C4519d dVar, String str, int i, C4519d dVar2) throws RemoteException {
        Parcel a = mo10127a();
        C2615c.m12724a(a, (IInterface) dVar);
        a.writeString(str);
        a.writeInt(i);
        C2615c.m12724a(a, (IInterface) dVar2);
        Parcel a2 = mo10128a(3, a);
        C4519d a3 = C4520a.m19510a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
