package p000a.p001a.p002a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p000a.p001a.p002a.C0000a.C0001a;

/* renamed from: a.a.a.c */
/* compiled from: IPostMessageService */
public interface C0006c extends IInterface {

    /* renamed from: a.a.a.c$a */
    /* compiled from: IPostMessageService */
    public static abstract class C0007a extends Binder implements C0006c {

        /* renamed from: N */
        static final int f17N = 3;

        /* renamed from: a */
        private static final String f18a = "android.support.customtabs.IPostMessageService";

        /* renamed from: b */
        static final int f19b = 2;

        /* renamed from: a.a.a.c$a$a */
        /* compiled from: IPostMessageService */
        private static class C0008a implements C0006c {

            /* renamed from: a */
            private IBinder f20a;

            C0008a(IBinder iBinder) {
                this.f20a = iBinder;
            }

            /* renamed from: a */
            public String mo26a() {
                return C0007a.f18a;
            }

            /* renamed from: a */
            public void mo22a(C0000a aVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0007a.f18a);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f20a;
            }

            /* renamed from: a */
            public void mo23a(C0000a aVar, String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0007a.f18a);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f20a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C0007a() {
            attachInterface(this, f18a);
        }

        /* renamed from: a */
        public static C0006c m32a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f18a);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0006c)) {
                return new C0008a(iBinder);
            }
            return (C0006c) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle = null;
            String str = f18a;
            if (i == 2) {
                parcel.enforceInterface(str);
                C0000a a = C0001a.m5a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo22a(a, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(str);
                C0000a a2 = C0001a.m5a(parcel.readStrongBinder());
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                mo23a(a2, readString, bundle);
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
    void mo22a(C0000a aVar, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo23a(C0000a aVar, String str, Bundle bundle) throws RemoteException;
}
