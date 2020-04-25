package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.s */
public abstract class C4568s extends C4551b implements C4567r {
    public C4568s() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo17543a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo18653a((Status) C4552c.m19586a(parcel, Status.CREATOR), (Credential) C4552c.m19586a(parcel, Credential.CREATOR));
        } else if (i == 2) {
            mo18655i((Status) C4552c.m19586a(parcel, Status.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo18654a((Status) C4552c.m19586a(parcel, Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
