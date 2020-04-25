package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.p169n.C4432a;
import com.google.android.gms.internal.auth.C4573a0;
import com.google.android.gms.internal.auth.C4613v;
import java.io.IOException;

/* renamed from: com.google.android.gms.auth.i */
final class C4042i implements C4047n<TokenData> {

    /* renamed from: a */
    private final /* synthetic */ Account f12732a;

    /* renamed from: b */
    private final /* synthetic */ String f12733b;

    /* renamed from: c */
    private final /* synthetic */ Bundle f12734c;

    C4042i(Account account, String str, Bundle bundle) {
        this.f12732a = account;
        this.f12733b = str;
        this.f12734c = bundle;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17573a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Bundle bundle = (Bundle) C4041h.m17492a(C4573a0.m19635a(iBinder).mo18676a(this.f12732a, this.f12733b, this.f12734c));
        TokenData a = TokenData.m17095a(bundle, "tokenDetails");
        if (a != null) {
            return a;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        C4613v b = C4613v.m19725b(string);
        boolean z = false;
        if (!C4613v.m19724a(b)) {
            if (C4613v.NETWORK_ERROR.equals(b) || C4613v.SERVICE_UNAVAILABLE.equals(b) || C4613v.INTNERNAL_ERROR.equals(b)) {
                z = true;
            }
            if (z) {
                throw new IOException(string);
            }
            throw new GoogleAuthException(string);
        }
        C4432a a2 = C4041h.f12731l;
        String valueOf = String.valueOf(b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("isUserRecoverableError status: ");
        sb.append(valueOf);
        a2.mo18437e("GoogleAuthUtil", sb.toString());
        throw new UserRecoverableAuthException(string, intent);
    }
}
