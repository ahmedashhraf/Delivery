package android.support.p003v4.p004os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.a */
/* compiled from: IResultReceiver */
public interface C0163a extends IInterface {

    /* renamed from: android.support.v4.os.a$a */
    /* compiled from: IResultReceiver */
    public static abstract class C0164a extends Binder implements C0163a {

        /* renamed from: a */
        private static final String f604a = "android.support.v4.os.IResultReceiver";

        /* renamed from: b */
        static final int f605b = 1;

        /* renamed from: android.support.v4.os.a$a$a */
        /* compiled from: IResultReceiver */
        private static class C0165a implements C0163a {

            /* renamed from: a */
            private IBinder f606a;

            C0165a(IBinder iBinder) {
                this.f606a = iBinder;
            }

            /* renamed from: a */
            public String mo620a() {
                return C0164a.f604a;
            }

            public IBinder asBinder() {
                return this.f606a;
            }

            /* renamed from: b */
            public void mo616b(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0164a.f604a);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f606a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0164a() {
            attachInterface(this, f604a);
        }

        /* renamed from: a */
        public static C0163a m1084a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f604a);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0163a)) {
                return new C0165a(iBinder);
            }
            return (C0163a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f604a;
            if (i == 1) {
                parcel.enforceInterface(str);
                mo616b(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: b */
    void mo616b(int i, Bundle bundle) throws RemoteException;
}
