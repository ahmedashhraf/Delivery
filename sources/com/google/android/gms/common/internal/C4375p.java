package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p076c.p112d.p113a.p114a.p118d.p122d.C2613a;
import p076c.p112d.p113a.p114a.p118d.p122d.C2614b;
import p076c.p112d.p113a.p114a.p118d.p122d.C2615c;

/* renamed from: com.google.android.gms.common.internal.p */
public interface C4375p extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.p$a */
    public static abstract class C4376a extends C2614b implements C4375p {

        /* renamed from: com.google.android.gms.common.internal.p$a$a */
        public static class C4377a extends C2613a implements C4375p {
            C4377a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            /* renamed from: e */
            public final Account mo18218e() throws RemoteException {
                Parcel a = mo10128a(2, mo10127a());
                Account account = (Account) C2615c.m12723a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        public C4376a() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        /* renamed from: a */
        public static C4375p m18877a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof C4375p) {
                return (C4375p) queryLocalInterface;
            }
            return new C4377a(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo10132a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            Account e = mo18218e();
            parcel2.writeNoException();
            C2615c.m12728b(parcel2, e);
            return true;
        }
    }

    /* renamed from: e */
    Account mo18218e() throws RemoteException;
}
