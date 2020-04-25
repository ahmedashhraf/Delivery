package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* renamed from: com.google.android.gms.internal.auth.j */
public abstract class C4590j extends C4614w implements C4588i {
    public C4590j() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo17563a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo18689a((ProxyResponse) C4615x.m19727a(parcel, ProxyResponse.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo18690b(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
