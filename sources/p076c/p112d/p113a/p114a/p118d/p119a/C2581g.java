package p076c.p112d.p113a.p114a.p118d.p119a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: c.d.a.a.d.a.g */
public final class C2581g extends C2575a implements C2579e {
    C2581g(IBinder iBinder) {
        super(iBinder, C14244c.f42007P);
    }

    /* renamed from: b */
    public final boolean mo10071b(boolean z) throws RemoteException {
        Parcel G0 = mo10066G0();
        C2577c.m12671a(G0, true);
        Parcel a = mo10067a(2, G0);
        boolean a2 = C2577c.m12672a(a);
        a.recycle();
        return a2;
    }

    public final String getId() throws RemoteException {
        Parcel a = mo10067a(1, mo10066G0());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: l */
    public final boolean mo10073l() throws RemoteException {
        Parcel a = mo10067a(6, mo10066G0());
        boolean a2 = C2577c.m12672a(a);
        a.recycle();
        return a2;
    }
}
