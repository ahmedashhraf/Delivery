package com.google.android.gms.auth.api.signin;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.e */
public class C3990e implements C4246q {

    /* renamed from: a */
    private Status f12664a;

    /* renamed from: b */
    private GoogleSignInAccount f12665b;

    public C3990e(@C0195i0 GoogleSignInAccount googleSignInAccount, @C0193h0 Status status) {
        this.f12665b = googleSignInAccount;
        this.f12664a = status;
    }

    @C0195i0
    /* renamed from: a */
    public GoogleSignInAccount mo17502a() {
        return this.f12665b;
    }

    /* renamed from: b */
    public boolean mo17503b() {
        return this.f12664a.mo17617T();
    }

    @C0193h0
    /* renamed from: f */
    public Status mo17504f() {
        return this.f12664a;
    }
}
