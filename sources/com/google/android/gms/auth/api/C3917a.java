package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.C3954c;
import com.google.android.gms.auth.api.proxy.C3978b;
import com.google.android.gms.auth.api.signin.C3985b;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C4002g;
import com.google.android.gms.auth.api.signin.internal.C4003h;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4063d.C4069f;
import com.google.android.gms.common.api.C4059a.C4072g;
import com.google.android.gms.internal.auth-api.C4556g;
import com.google.android.gms.internal.auth-api.C4565p;

/* renamed from: com.google.android.gms.auth.api.a */
public final class C3917a {

    /* renamed from: a */
    public static final C4072g<C4565p> f12414a = new C4072g<>();

    /* renamed from: b */
    public static final C4072g<C4003h> f12415b = new C4072g<>();

    /* renamed from: c */
    private static final C4060a<C4565p, C3918a> f12416c = new C3974f();

    /* renamed from: d */
    private static final C4060a<C4003h, GoogleSignInOptions> f12417d = new C3975g();
    @C4056a
    @Deprecated

    /* renamed from: e */
    public static final C4059a<C3946c> f12418e = C3945b.f12492c;

    /* renamed from: f */
    public static final C4059a<C3918a> f12419f = new C4059a<>("Auth.CREDENTIALS_API", f12416c, f12414a);

    /* renamed from: g */
    public static final C4059a<GoogleSignInOptions> f12420g = new C4059a<>("Auth.GOOGLE_SIGN_IN_API", f12417d, f12415b);
    @C4056a
    @Deprecated

    /* renamed from: h */
    public static final C3978b f12421h = C3945b.f12493d;

    /* renamed from: i */
    public static final C3954c f12422i = new C4556g();

    /* renamed from: j */
    public static final C3985b f12423j = new C4002g();

    @Deprecated
    /* renamed from: com.google.android.gms.auth.api.a$a */
    public static class C3918a implements C4069f {

        /* renamed from: N */
        private static final C3918a f12424N = new C3919a().mo17298b();

        /* renamed from: a */
        private final String f12425a = null;

        /* renamed from: b */
        private final boolean f12426b;

        @Deprecated
        /* renamed from: com.google.android.gms.auth.api.a$a$a */
        public static class C3919a {

            /* renamed from: a */
            protected Boolean f12427a = Boolean.valueOf(false);

            /* renamed from: a */
            public C3919a mo17297a() {
                this.f12427a = Boolean.valueOf(true);
                return this;
            }

            /* renamed from: b */
            public C3918a mo17298b() {
                return new C3918a(this);
            }
        }

        public C3918a(C3919a aVar) {
            this.f12426b = aVar.f12427a.booleanValue();
        }

        /* renamed from: a */
        public final Bundle mo17296a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.f12426b);
            return bundle;
        }
    }

    private C3917a() {
    }
}
