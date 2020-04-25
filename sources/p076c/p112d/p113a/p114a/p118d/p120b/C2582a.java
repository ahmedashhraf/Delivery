package p076c.p112d.p113a.p114a.p118d.p120b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: c.d.a.a.d.b.a */
public class C2582a implements IInterface {

    /* renamed from: a */
    private final IBinder f9690a;

    /* renamed from: b */
    private final String f9691b;

    protected C2582a(IBinder iBinder, String str) {
        this.f9690a = iBinder;
        this.f9691b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public final Parcel mo10074G0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9691b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10075a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9690a.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f9690a;
    }
}
