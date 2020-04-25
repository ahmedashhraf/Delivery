package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.C3917a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4086i.C4087a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.x */
public final class C4019x extends C4014s {

    /* renamed from: b */
    private final Context f12704b;

    public C4019x(Context context) {
        this.f12704b = context;
    }

    /* renamed from: G0 */
    private final void m17446G0() {
        if (!C4284g.isGooglePlayServicesUid(this.f12704b, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    /* renamed from: f */
    public final void mo17541f() {
        m17446G0();
        C3997b a = C3997b.m17378a(this.f12704b);
        GoogleSignInAccount b = a.mo17521b();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f12628b0;
        if (b != null) {
            googleSignInOptions = a.mo17522c();
        }
        C4086i a2 = new C4087a(this.f12704b).mo17729a(C3917a.f12420g, googleSignInOptions).mo17736a();
        try {
            if (a2.mo17692a().mo17580R()) {
                if (b != null) {
                    C3917a.f12423j.mo17491b(a2);
                } else {
                    a2.mo17706b();
                }
            }
        } finally {
            a2.mo17715d();
        }
    }

    /* renamed from: w */
    public final void mo17542w() {
        m17446G0();
        C4012q.m17427a(this.f12704b).mo17537a();
    }
}
