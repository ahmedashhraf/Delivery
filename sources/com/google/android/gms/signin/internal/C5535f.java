package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import p076c.p112d.p113a.p114a.p118d.p121c.C2595a;
import p076c.p112d.p113a.p114a.p118d.p121c.C2598d;

/* renamed from: com.google.android.gms.signin.internal.f */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C5535f extends C2595a implements C5532c {
    public C5535f() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo10090a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 3) {
            mo21955a((ConnectionResult) C2598d.m12702a(parcel, ConnectionResult.CREATOR), (zab) C2598d.m12702a(parcel, zab.CREATOR));
        } else if (i == 4) {
            mo21957e((Status) C2598d.m12702a(parcel, Status.CREATOR));
        } else if (i == 6) {
            mo21958f((Status) C2598d.m12702a(parcel, Status.CREATOR));
        } else if (i == 7) {
            mo21956a((Status) C2598d.m12702a(parcel, Status.CREATOR), (GoogleSignInAccount) C2598d.m12702a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            mo17908a((zak) C2598d.m12702a(parcel, zak.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
