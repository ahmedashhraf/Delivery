package p076c.p112d.p113a.p114a.p128h;

import android.os.Bundle;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.api.C4059a.C4063d.C4069f;
import com.google.android.gms.common.internal.C4413y;

/* renamed from: c.d.a.a.h.a */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C2679a implements C4069f {

    /* renamed from: U */
    public static final C2679a f9761U;

    /* renamed from: N */
    private final String f9762N = null;

    /* renamed from: O */
    private final boolean f9763O = false;

    /* renamed from: P */
    private final String f9764P = null;

    /* renamed from: Q */
    private final String f9765Q = null;

    /* renamed from: R */
    private final boolean f9766R = false;

    /* renamed from: S */
    private final Long f9767S = null;

    /* renamed from: T */
    private final Long f9768T = null;

    /* renamed from: a */
    private final boolean f9769a = false;

    /* renamed from: b */
    private final boolean f9770b = false;

    /* renamed from: c.d.a.a.h.a$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class C2680a {
    }

    static {
        new C2680a();
        C2679a aVar = new C2679a(false, false, null, false, null, null, false, null, null);
        f9761U = aVar;
    }

    private C2679a(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2) {
    }

    @C0195i0
    /* renamed from: a */
    public final Long mo10331a() {
        return this.f9767S;
    }

    @C0195i0
    /* renamed from: b */
    public final String mo10332b() {
        return this.f9764P;
    }

    @C0195i0
    /* renamed from: c */
    public final String mo10333c() {
        return this.f9765Q;
    }

    @C0195i0
    /* renamed from: d */
    public final Long mo10334d() {
        return this.f9768T;
    }

    /* renamed from: e */
    public final String mo10335e() {
        return this.f9762N;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2679a)) {
            return false;
        }
        C2679a aVar = (C2679a) obj;
        return this.f9769a == aVar.f9769a && this.f9770b == aVar.f9770b && C4413y.m19053a(this.f9762N, aVar.f9762N) && this.f9763O == aVar.f9763O && this.f9766R == aVar.f9766R && C4413y.m19053a(this.f9764P, aVar.f9764P) && C4413y.m19053a(this.f9765Q, aVar.f9765Q) && C4413y.m19053a(this.f9767S, aVar.f9767S) && C4413y.m19053a(this.f9768T, aVar.f9768T);
    }

    /* renamed from: f */
    public final boolean mo10337f() {
        return this.f9763O;
    }

    /* renamed from: g */
    public final boolean mo10338g() {
        return this.f9770b;
    }

    /* renamed from: h */
    public final boolean mo10339h() {
        return this.f9769a;
    }

    public final int hashCode() {
        return C4413y.m19051a(Boolean.valueOf(this.f9769a), Boolean.valueOf(this.f9770b), this.f9762N, Boolean.valueOf(this.f9763O), Boolean.valueOf(this.f9766R), this.f9764P, this.f9765Q, this.f9767S, this.f9768T);
    }

    /* renamed from: i */
    public final Bundle mo10341i() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", this.f9769a);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", this.f9770b);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", this.f9762N);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", this.f9763O);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", this.f9764P);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", this.f9765Q);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", this.f9766R);
        Long l = this.f9767S;
        if (l != null) {
            bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", l.longValue());
        }
        Long l2 = this.f9768T;
        if (l2 != null) {
            bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", l2.longValue());
        }
        return bundle;
    }

    /* renamed from: j */
    public final boolean mo10342j() {
        return this.f9766R;
    }
}
