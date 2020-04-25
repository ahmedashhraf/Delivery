package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.C4573a0;
import java.io.IOException;

/* renamed from: com.google.android.gms.auth.j */
final class C4043j implements C4047n<Void> {

    /* renamed from: a */
    private final /* synthetic */ String f12735a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f12736b;

    C4043j(String str, Bundle bundle) {
        this.f12735a = str;
        this.f12736b = bundle;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17573a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Bundle bundle = (Bundle) C4041h.m17492a(C4573a0.m19635a(iBinder).mo18680j(this.f12735a, this.f12736b));
        String string = bundle.getString("Error");
        if (bundle.getBoolean("booleanResult")) {
            return null;
        }
        throw new GoogleAuthException(string);
    }
}
