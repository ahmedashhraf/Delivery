package com.google.android.gms.plus.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4380q;
import com.google.android.gms.common.internal.C4380q.C4381a;
import com.google.android.gms.internal.plus.C5081a;
import com.google.android.gms.internal.plus.C5088f;
import java.util.List;

/* renamed from: com.google.android.gms.plus.internal.g */
public final class C5520g extends C5081a implements C5519f {
    C5520g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.plus.internal.IPlusService");
    }

    /* renamed from: a */
    public final C4380q mo21931a(C5515b bVar, int i, int i2, int i3, String str) throws RemoteException {
        Parcel G0 = mo19810G0();
        C5088f.m22087a(G0, (IInterface) bVar);
        G0.writeInt(i);
        G0.writeInt(i2);
        G0.writeInt(-1);
        G0.writeString(str);
        Parcel a = mo19811a(16, G0);
        C4380q a2 = C4381a.m18881a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo21932a() throws RemoteException {
        mo19813b(6, mo19810G0());
    }

    /* renamed from: a */
    public final void mo21933a(C5515b bVar) throws RemoteException {
        Parcel G0 = mo19810G0();
        C5088f.m22087a(G0, (IInterface) bVar);
        mo19813b(19, G0);
    }

    /* renamed from: a */
    public final void mo21934a(C5515b bVar, List<String> list) throws RemoteException {
        Parcel G0 = mo19810G0();
        C5088f.m22087a(G0, (IInterface) bVar);
        G0.writeStringList(list);
        mo19813b(34, G0);
    }

    /* renamed from: x0 */
    public final String mo21935x0() throws RemoteException {
        Parcel a = mo19811a(5, mo19810G0());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
