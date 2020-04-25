package p076c.p112d.p113a.p114a.p118d.p121c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: c.d.a.a.d.c.b */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C2596b implements IInterface {

    /* renamed from: a */
    private final IBinder f9697a;

    /* renamed from: b */
    private final String f9698b;

    protected C2596b(IBinder iBinder, String str) {
        this.f9697a = iBinder;
        this.f9698b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public final Parcel mo10093G0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9698b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo10094a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f9697a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f9697a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10096b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9697a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo10097c(int i, Parcel parcel) throws RemoteException {
        try {
            this.f9697a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
