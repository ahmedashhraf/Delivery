package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth-api.C4551b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.s */
public abstract class C4014s extends C4551b implements C4013r {
    public C4014s() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo17543a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo17541f();
        } else if (i != 2) {
            return false;
        } else {
            mo17542w();
        }
        return true;
    }
}
