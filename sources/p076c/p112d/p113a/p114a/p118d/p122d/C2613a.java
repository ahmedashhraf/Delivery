package p076c.p112d.p113a.p114a.p118d.p122d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: c.d.a.a.d.d.a */
public class C2613a implements IInterface {

    /* renamed from: a */
    private final IBinder f9726a;

    /* renamed from: b */
    private final String f9727b;

    protected C2613a(IBinder iBinder, String str) {
        this.f9726a = iBinder;
        this.f9727b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo10127a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9727b);
        return obtain;
    }

    public IBinder asBinder() {
        return this.f9726a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10130b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9726a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo10131c(int i, Parcel parcel) throws RemoteException {
        try {
            this.f9726a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo10128a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f9726a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
