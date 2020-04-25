package android.support.p003v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.app.a */
/* compiled from: INotificationSideChannel */
public interface C0009a extends IInterface {

    /* renamed from: android.support.v4.app.a$a */
    /* compiled from: INotificationSideChannel */
    public static abstract class C0010a extends Binder implements C0009a {

        /* renamed from: N */
        static final int f21N = 2;

        /* renamed from: O */
        static final int f22O = 3;

        /* renamed from: a */
        private static final String f23a = "android.support.v4.app.INotificationSideChannel";

        /* renamed from: b */
        static final int f24b = 1;

        /* renamed from: android.support.v4.app.a$a$a */
        /* compiled from: INotificationSideChannel */
        private static class C0011a implements C0009a {

            /* renamed from: a */
            private IBinder f25a;

            C0011a(IBinder iBinder) {
                this.f25a = iBinder;
            }

            /* renamed from: a */
            public String mo33a() {
                return C0010a.f23a;
            }

            /* renamed from: a */
            public void mo29a(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0010a.f23a);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f25a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f25a;
            }

            /* renamed from: d */
            public void mo30d(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0010a.f23a);
                    obtain.writeString(str);
                    this.f25a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo28a(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0010a.f23a);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f25a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0010a() {
            attachInterface(this, f23a);
        }

        /* renamed from: a */
        public static C0009a m39a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f23a);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0009a)) {
                return new C0011a(iBinder);
            }
            return (C0009a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = f23a;
            if (i == 1) {
                parcel.enforceInterface(str);
                mo29a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(str);
                mo28a(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(str);
                mo30d(parcel.readString());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo28a(String str, int i, String str2) throws RemoteException;

    /* renamed from: a */
    void mo29a(String str, int i, String str2, Notification notification) throws RemoteException;

    /* renamed from: d */
    void mo30d(String str) throws RemoteException;
}
