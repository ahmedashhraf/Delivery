package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4338h0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.util.C4472b0;

/* renamed from: com.google.firebase.g */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
public final class C8668g {

    /* renamed from: h */
    private static final String f22744h = "google_api_key";

    /* renamed from: i */
    private static final String f22745i = "google_app_id";

    /* renamed from: j */
    private static final String f22746j = "firebase_database_url";

    /* renamed from: k */
    private static final String f22747k = "ga_trackingId";

    /* renamed from: l */
    private static final String f22748l = "gcm_defaultSenderId";

    /* renamed from: m */
    private static final String f22749m = "google_storage_bucket";

    /* renamed from: n */
    private static final String f22750n = "project_id";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f22751a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f22752b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f22753c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f22754d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f22755e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f22756f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final String f22757g;

    /* renamed from: com.google.firebase.g$b */
    /* compiled from: com.google.firebase:firebase-common@@19.0.0 */
    public static final class C8670b {

        /* renamed from: a */
        private String f22758a;

        /* renamed from: b */
        private String f22759b;

        /* renamed from: c */
        private String f22760c;

        /* renamed from: d */
        private String f22761d;

        /* renamed from: e */
        private String f22762e;

        /* renamed from: f */
        private String f22763f;

        /* renamed from: g */
        private String f22764g;

        public C8670b() {
        }

        @C0193h0
        /* renamed from: a */
        public C8670b mo32047a(@C0193h0 String str) {
            this.f22758a = C4300a0.m18622a(str, (Object) "ApiKey must be set.");
            return this;
        }

        @C0193h0
        /* renamed from: b */
        public C8670b mo32049b(@C0193h0 String str) {
            this.f22759b = C4300a0.m18622a(str, (Object) "ApplicationId must be set.");
            return this;
        }

        @C0193h0
        /* renamed from: c */
        public C8670b mo32050c(@C0195i0 String str) {
            this.f22760c = str;
            return this;
        }

        @C0193h0
        @C4056a
        /* renamed from: d */
        public C8670b mo32051d(@C0195i0 String str) {
            this.f22761d = str;
            return this;
        }

        @C0193h0
        /* renamed from: e */
        public C8670b mo32052e(@C0195i0 String str) {
            this.f22762e = str;
            return this;
        }

        @C0193h0
        /* renamed from: f */
        public C8670b mo32053f(@C0195i0 String str) {
            this.f22764g = str;
            return this;
        }

        @C0193h0
        /* renamed from: g */
        public C8670b mo32054g(@C0195i0 String str) {
            this.f22763f = str;
            return this;
        }

        public C8670b(@C0193h0 C8668g gVar) {
            this.f22759b = gVar.f22752b;
            this.f22758a = gVar.f22751a;
            this.f22760c = gVar.f22753c;
            this.f22761d = gVar.f22754d;
            this.f22762e = gVar.f22755e;
            this.f22763f = gVar.f22756f;
            this.f22764g = gVar.f22757g;
        }

        @C0193h0
        /* renamed from: a */
        public C8668g mo32048a() {
            C8668g gVar = new C8668g(this.f22759b, this.f22758a, this.f22760c, this.f22761d, this.f22762e, this.f22763f, this.f22764g);
            return gVar;
        }
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C8668g)) {
            return false;
        }
        C8668g gVar = (C8668g) obj;
        if (C4413y.m19053a(this.f22752b, gVar.f22752b) && C4413y.m19053a(this.f22751a, gVar.f22751a) && C4413y.m19053a(this.f22753c, gVar.f22753c) && C4413y.m19053a(this.f22754d, gVar.f22754d) && C4413y.m19053a(this.f22755e, gVar.f22755e) && C4413y.m19053a(this.f22756f, gVar.f22756f) && C4413y.m19053a(this.f22757g, gVar.f22757g)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return C4413y.m19051a(this.f22752b, this.f22751a, this.f22753c, this.f22754d, this.f22755e, this.f22756f, this.f22757g);
    }

    public String toString() {
        return C4413y.m19052a((Object) this).mo18403a("applicationId", this.f22752b).mo18403a("apiKey", this.f22751a).mo18403a("databaseUrl", this.f22753c).mo18403a("gcmSenderId", this.f22755e).mo18403a("storageBucket", this.f22756f).mo18403a("projectId", this.f22757g).toString();
    }

    private C8668g(@C0193h0 String str, @C0193h0 String str2, @C0195i0 String str3, @C0195i0 String str4, @C0195i0 String str5, @C0195i0 String str6, @C0195i0 String str7) {
        C4300a0.m18632b(!C4472b0.m19314b(str), "ApplicationId must be set.");
        this.f22752b = str;
        this.f22751a = str2;
        this.f22753c = str3;
        this.f22754d = str4;
        this.f22755e = str5;
        this.f22756f = str6;
        this.f22757g = str7;
    }

    @C0195i0
    /* renamed from: a */
    public static C8668g m40721a(@C0193h0 Context context) {
        C4338h0 h0Var = new C4338h0(context);
        String a = h0Var.mo18323a(f22745i);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        C8668g gVar = new C8668g(a, h0Var.mo18323a(f22744h), h0Var.mo18323a(f22746j), h0Var.mo18323a(f22747k), h0Var.mo18323a(f22748l), h0Var.mo18323a(f22749m), h0Var.mo18323a(f22750n));
        return gVar;
    }

    @C0193h0
    /* renamed from: b */
    public String mo32038b() {
        return this.f22752b;
    }

    @C0195i0
    /* renamed from: c */
    public String mo32039c() {
        return this.f22753c;
    }

    @C4056a
    @C0195i0
    /* renamed from: d */
    public String mo32040d() {
        return this.f22754d;
    }

    @C0195i0
    /* renamed from: e */
    public String mo32041e() {
        return this.f22755e;
    }

    @C0195i0
    /* renamed from: f */
    public String mo32043f() {
        return this.f22757g;
    }

    @C0195i0
    /* renamed from: g */
    public String mo32044g() {
        return this.f22756f;
    }

    @C0193h0
    /* renamed from: a */
    public String mo32037a() {
        return this.f22751a;
    }
}
