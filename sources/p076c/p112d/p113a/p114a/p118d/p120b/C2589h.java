package p076c.p112d.p113a.p114a.p118d.p120b;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: c.d.a.a.d.b.h */
public abstract class C2589h extends C2583b implements C2588g {
    public C2589h() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo10077a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo10081a((Status) C2584c.m12681a(parcel, Status.CREATOR));
        return true;
    }
}
