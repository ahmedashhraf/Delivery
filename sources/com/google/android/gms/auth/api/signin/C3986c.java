package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.C0193h0;
import com.google.android.gms.auth.api.C3917a;
import com.google.android.gms.auth.api.signin.internal.C4004i;
import com.google.android.gms.common.C4279e;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.api.C4083h;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.internal.C4097b;
import com.google.android.gms.common.api.internal.C4221x;
import com.google.android.gms.common.internal.C4416z;
import com.google.android.gms.common.internal.C4416z.C4417a;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.C5560k;

/* renamed from: com.google.android.gms.auth.api.signin.c */
public class C3986c extends C4083h<GoogleSignInOptions> {

    /* renamed from: j */
    private static final C3987a f12655j = new C3987a(null);
    @C4476d0

    /* renamed from: k */
    private static int f12656k = C3988b.f12657a;

    /* renamed from: com.google.android.gms.auth.api.signin.c$a */
    private static class C3987a implements C4417a<C3990e, GoogleSignInAccount> {
        private C3987a() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo17498a(C4246q qVar) {
            return ((C3990e) qVar).mo17502a();
        }

        /* synthetic */ C3987a(C4023k kVar) {
            this();
        }
    }

    /* 'enum' access flag removed */
    @C4476d0
    /* renamed from: com.google.android.gms.auth.api.signin.c$b */
    static final class C3988b {

        /* renamed from: a */
        public static final int f12657a = 1;

        /* renamed from: b */
        public static final int f12658b = 2;

        /* renamed from: c */
        public static final int f12659c = 3;

        /* renamed from: d */
        public static final int f12660d = 4;

        /* renamed from: e */
        private static final /* synthetic */ int[] f12661e = {f12657a, f12658b, f12659c, f12660d};

        /* renamed from: a */
        public static int[] m17357a() {
            return (int[]) f12661e.clone();
        }
    }

    C3986c(@C0193h0 Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C3917a.f12420g, googleSignInOptions, (C4221x) new C4097b());
    }

    /* renamed from: o */
    private final synchronized int m17351o() {
        if (f12656k == C3988b.f12657a) {
            Context h = mo17686h();
            C4279e a = C4279e.m18476a();
            int a2 = a.mo18094a(h, (int) C4284g.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (a2 == 0) {
                f12656k = C3988b.f12660d;
            } else if (a.mo18099a(h, a2, (String) null) != null || DynamiteModule.m19542a(h, "com.google.android.gms.auth.api.fallback") == 0) {
                f12656k = C3988b.f12658b;
            } else {
                f12656k = C3988b.f12659c;
            }
        }
        return f12656k;
    }

    @C0193h0
    /* renamed from: k */
    public Intent mo17494k() {
        Context h = mo17686h();
        int i = C4023k.f12705a[m17351o() - 1];
        if (i == 1) {
            return C4004i.m17415b(h, (GoogleSignInOptions) mo17685g());
        }
        if (i != 2) {
            return C4004i.m17417c(h, (GoogleSignInOptions) mo17685g());
        }
        return C4004i.m17410a(h, (GoogleSignInOptions) mo17685g());
    }

    /* renamed from: l */
    public C5560k<Void> mo17495l() {
        return C4416z.m19055a(C4004i.m17416b(mo17679c(), mo17686h(), m17351o() == C3988b.f12659c));
    }

    /* renamed from: m */
    public C5560k<Void> mo17496m() {
        return C4416z.m19055a(C4004i.m17413a(mo17679c(), mo17686h(), m17351o() == C3988b.f12659c));
    }

    /* renamed from: n */
    public C5560k<GoogleSignInAccount> mo17497n() {
        return C4416z.m19057a((C4237l<R>) C4004i.m17412a(mo17679c(), mo17686h(), (GoogleSignInOptions) mo17685g(), m17351o() == C3988b.f12659c), (C4417a<R, T>) f12655j);
    }

    C3986c(@C0193h0 Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, C3917a.f12420g, googleSignInOptions, (C4221x) new C4097b());
    }
}
