package p000a.p001a.p002a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: a.a.a.a */
/* compiled from: ICustomTabsCallback */
public interface C0000a extends IInterface {

    /* renamed from: a.a.a.a$a */
    /* compiled from: ICustomTabsCallback */
    public static abstract class C0001a extends Binder implements C0000a {

        /* renamed from: N */
        static final int f0N = 3;

        /* renamed from: O */
        static final int f1O = 4;

        /* renamed from: P */
        static final int f2P = 5;

        /* renamed from: Q */
        static final int f3Q = 6;

        /* renamed from: a */
        private static final String f4a = "android.support.customtabs.ICustomTabsCallback";

        /* renamed from: b */
        static final int f5b = 2;

        /* renamed from: a.a.a.a$a$a */
        /* compiled from: ICustomTabsCallback */
        private static class C0002a implements C0000a {

            /* renamed from: a */
            private IBinder f6a;

            C0002a(IBinder iBinder) {
                this.f6a = iBinder;
            }

            /* renamed from: a */
            public String mo8a() {
                return C0001a.f4a;
            }

            /* renamed from: a */
            public void mo2a(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0001a.f4a);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f6a;
            }

            /* renamed from: d */
            public void mo3d(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0001a.f4a);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public void mo4g(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0001a.f4a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public void mo5h(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0001a.f4a);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo1a(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0001a.f4a);
                    obtain.writeInt(i);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z ? 1 : 0);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f6a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0001a() {
            attachInterface(this, f4a);
        }

        /* renamed from: a */
        public static C0000a m5a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f4a);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0000a)) {
                return new C0002a(iBinder);
            }
            return (C0000a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle = null;
            String str = f4a;
            if (i == 2) {
                parcel.enforceInterface(str);
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo2a(readInt, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(str);
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo4g(readString, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i == 4) {
                parcel.enforceInterface(str);
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo3d(bundle);
                parcel2.writeNoException();
                return true;
            } else if (i == 5) {
                parcel.enforceInterface(str);
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo5h(readString2, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i == 6) {
                parcel.enforceInterface(str);
                int readInt2 = parcel.readInt();
                Uri uri = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
                boolean z = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo1a(readInt2, uri, z, bundle);
                parcel2.writeNoException();
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
    void mo1a(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo2a(int i, Bundle bundle) throws RemoteException;

    /* renamed from: d */
    void mo3d(Bundle bundle) throws RemoteException;

    /* renamed from: g */
    void mo4g(String str, Bundle bundle) throws RemoteException;

    /* renamed from: h */
    void mo5h(String str, Bundle bundle) throws RemoteException;
}
