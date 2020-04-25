package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4519d.C4520a;
import p076c.p112d.p113a.p114a.p118d.p122d.C2613a;
import p076c.p112d.p113a.p114a.p118d.p122d.C2615c;

/* renamed from: com.google.android.gms.dynamite.j */
public final class C4547j extends C2613a implements C4546i {
    C4547j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: B0 */
    public final int mo18641B0() throws RemoteException {
        Parcel a = mo10128a(6, mo10127a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final C4519d mo18643a(C4519d dVar, String str, int i) throws RemoteException {
        Parcel a = mo10127a();
        C2615c.m12724a(a, (IInterface) dVar);
        a.writeString(str);
        a.writeInt(i);
        Parcel a2 = mo10128a(2, a);
        C4519d a3 = C4520a.m19510a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    /* renamed from: b */
    public final int mo18644b(C4519d dVar, String str, boolean z) throws RemoteException {
        Parcel a = mo10127a();
        C2615c.m12724a(a, (IInterface) dVar);
        a.writeString(str);
        C2615c.m12726a(a, z);
        Parcel a2 = mo10128a(3, a);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final int mo18642a(C4519d dVar, String str, boolean z) throws RemoteException {
        Parcel a = mo10127a();
        C2615c.m12724a(a, (IInterface) dVar);
        a.writeString(str);
        C2615c.m12726a(a, z);
        Parcel a2 = mo10128a(5, a);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final C4519d mo18645b(C4519d dVar, String str, int i) throws RemoteException {
        Parcel a = mo10127a();
        C2615c.m12724a(a, (IInterface) dVar);
        a.writeString(str);
        a.writeInt(i);
        Parcel a2 = mo10128a(4, a);
        C4519d a3 = C4520a.m19510a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
