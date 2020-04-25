package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.C4551b;
import com.google.android.gms.internal.auth-api.C4552c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.u */
public abstract class C4016u extends C4551b implements C4015t {
    public C4016u() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo17543a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                mo17527a((GoogleSignInAccount) C4552c.m19586a(parcel, GoogleSignInAccount.CREATOR), (Status) C4552c.m19586a(parcel, Status.CREATOR));
                break;
            case 102:
                mo17528b((Status) C4552c.m19586a(parcel, Status.CREATOR));
                break;
            case 103:
                mo17529c((Status) C4552c.m19586a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
