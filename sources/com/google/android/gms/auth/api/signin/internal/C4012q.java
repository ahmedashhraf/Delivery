package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.annotation.C0193h0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.C4476d0;

/* renamed from: com.google.android.gms.auth.api.signin.internal.q */
public final class C4012q {

    /* renamed from: d */
    private static C4012q f12700d;
    @C4476d0

    /* renamed from: a */
    private C3997b f12701a;
    @C4476d0

    /* renamed from: b */
    private GoogleSignInAccount f12702b = this.f12701a.mo17521b();
    @C4476d0

    /* renamed from: c */
    private GoogleSignInOptions f12703c = this.f12701a.mo17522c();

    private C4012q(Context context) {
        this.f12701a = C3997b.m17378a(context);
    }

    /* renamed from: a */
    public static synchronized C4012q m17427a(@C0193h0 Context context) {
        C4012q b;
        synchronized (C4012q.class) {
            b = m17428b(context.getApplicationContext());
        }
        return b;
    }

    /* renamed from: b */
    private static synchronized C4012q m17428b(Context context) {
        C4012q qVar;
        synchronized (C4012q.class) {
            if (f12700d == null) {
                f12700d = new C4012q(context);
            }
            qVar = f12700d;
        }
        return qVar;
    }

    /* renamed from: c */
    public final synchronized GoogleSignInOptions mo17540c() {
        return this.f12703c;
    }

    /* renamed from: a */
    public final synchronized void mo17537a() {
        this.f12701a.mo17519a();
        this.f12702b = null;
        this.f12703c = null;
    }

    /* renamed from: b */
    public final synchronized GoogleSignInAccount mo17539b() {
        return this.f12702b;
    }

    /* renamed from: a */
    public final synchronized void mo17538a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f12701a.mo17520a(googleSignInAccount, googleSignInOptions);
        this.f12702b = googleSignInAccount;
        this.f12703c = googleSignInOptions;
    }
}
