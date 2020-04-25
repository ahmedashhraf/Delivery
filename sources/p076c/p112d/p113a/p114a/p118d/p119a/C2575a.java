package p076c.p112d.p113a.p114a.p118d.p119a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: c.d.a.a.d.a.a */
public class C2575a implements IInterface {

    /* renamed from: a */
    private final IBinder f9686a;

    /* renamed from: b */
    private final String f9687b;

    protected C2575a(IBinder iBinder, String str) {
        this.f9686a = iBinder;
        this.f9687b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public final Parcel mo10066G0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9687b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo10067a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f9686a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f9686a;
    }
}
