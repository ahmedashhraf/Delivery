package com.google.android.gms.auth.p165d;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.C4614w;
import com.google.android.gms.internal.auth.C4615x;

/* renamed from: com.google.android.gms.auth.d.e */
public abstract class C4032e extends C4614w implements C4031d {
    public C4032e() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo17563a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo17561a((Account) C4615x.m19727a(parcel, Account.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo17562d(C4615x.m19731a(parcel));
        }
        return true;
    }
}
