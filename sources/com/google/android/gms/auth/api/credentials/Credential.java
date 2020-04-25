package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import java.util.List;
import p201f.p202a.C5950g;

@C4392a(creator = "CredentialCreator")
@C4397f({1000})
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<Credential> CREATOR = new C3959g();

    /* renamed from: T */
    public static final String f12494T = "com.google.android.gms.credentials.Credential";
    /* access modifiers changed from: private */
    @C0195i0
    @C4394c(getter = "getProfilePictureUri", mo18384id = 3)

    /* renamed from: N */
    public final Uri f12495N;
    /* access modifiers changed from: private */
    @C5950g
    @C4394c(getter = "getIdTokens", mo18384id = 4)

    /* renamed from: O */
    public final List<IdToken> f12496O;
    /* access modifiers changed from: private */
    @C0195i0
    @C4394c(getter = "getPassword", mo18384id = 5)

    /* renamed from: P */
    public final String f12497P;
    /* access modifiers changed from: private */
    @C0195i0
    @C4394c(getter = "getAccountType", mo18384id = 6)

    /* renamed from: Q */
    public final String f12498Q;
    /* access modifiers changed from: private */
    @C0195i0
    @C4394c(getter = "getGivenName", mo18384id = 9)

    /* renamed from: R */
    public final String f12499R;
    /* access modifiers changed from: private */
    @C0195i0
    @C4394c(getter = "getFamilyName", mo18384id = 10)

    /* renamed from: S */
    public final String f12500S;
    /* access modifiers changed from: private */
    @C5950g
    @C4394c(getter = "getId", mo18384id = 1)

    /* renamed from: a */
    public final String f12501a;
    /* access modifiers changed from: private */
    @C0195i0
    @C4394c(getter = "getName", mo18384id = 2)

    /* renamed from: b */
    public final String f12502b;

    /* renamed from: com.google.android.gms.auth.api.credentials.Credential$a */
    public static class C3947a {

        /* renamed from: a */
        private final String f12503a;

        /* renamed from: b */
        private String f12504b;

        /* renamed from: c */
        private Uri f12505c;

        /* renamed from: d */
        private List<IdToken> f12506d;

        /* renamed from: e */
        private String f12507e;

        /* renamed from: f */
        private String f12508f;

        /* renamed from: g */
        private String f12509g;

        /* renamed from: h */
        private String f12510h;

        public C3947a(String str) {
            this.f12503a = str;
        }

        /* renamed from: a */
        public C3947a mo17349a(Uri uri) {
            this.f12505c = uri;
            return this;
        }

        /* renamed from: b */
        public C3947a mo17352b(String str) {
            this.f12504b = str;
            return this;
        }

        /* renamed from: c */
        public C3947a mo17353c(String str) {
            this.f12507e = str;
            return this;
        }

        /* renamed from: a */
        public C3947a mo17350a(String str) {
            this.f12508f = str;
            return this;
        }

        public C3947a(Credential credential) {
            this.f12503a = credential.f12501a;
            this.f12504b = credential.f12502b;
            this.f12505c = credential.f12495N;
            this.f12506d = credential.f12496O;
            this.f12507e = credential.f12497P;
            this.f12508f = credential.f12498Q;
            this.f12509g = credential.f12499R;
            this.f12510h = credential.f12500S;
        }

        /* renamed from: a */
        public Credential mo17351a() {
            Credential credential = new Credential(this.f12503a, this.f12504b, this.f12505c, this.f12506d, this.f12507e, this.f12508f, this.f12509g, this.f12510h);
            return credential;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (com.facebook.common.util.UriUtil.HTTPS_SCHEME.equalsIgnoreCase(r0.getScheme()) != false) goto L_0x006b;
     */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    Credential(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e(mo18387id = 1) java.lang.String r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e(mo18387id = 2) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e(mo18387id = 3) android.net.Uri r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e(mo18387id = 4) java.util.List<com.google.android.gms.auth.api.credentials.IdToken> r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e(mo18387id = 5) java.lang.String r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e(mo18387id = 6) java.lang.String r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e(mo18387id = 9) java.lang.String r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e(mo18387id = 10) java.lang.String r12) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "credential identifier cannot be null"
            java.lang.Object r5 = com.google.android.gms.common.internal.C4300a0.m18621a(r5, r0)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.trim()
            java.lang.String r0 = "credential identifier cannot be empty"
            com.google.android.gms.common.internal.C4300a0.m18622a(r5, r0)
            if (r9 == 0) goto L_0x0025
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Password must not be empty if set"
            r5.<init>(r6)
            throw r5
        L_0x0025:
            if (r10 == 0) goto L_0x007f
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 0
            if (r0 != 0) goto L_0x006c
            android.net.Uri r0 = android.net.Uri.parse(r10)
            boolean r2 = r0.isAbsolute()
            if (r2 == 0) goto L_0x006c
            boolean r2 = r0.isHierarchical()
            if (r2 == 0) goto L_0x006c
            java.lang.String r2 = r0.getScheme()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x006c
            java.lang.String r2 = r0.getAuthority()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0053
            goto L_0x006c
        L_0x0053:
            java.lang.String r2 = r0.getScheme()
            java.lang.String r3 = "http"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x006b
            java.lang.String r0 = r0.getScheme()
            java.lang.String r2 = "https"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x006c
        L_0x006b:
            r1 = 1
        L_0x006c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0077
            goto L_0x007f
        L_0x0077:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Account type must be a valid Http/Https URI"
            r5.<init>(r6)
            throw r5
        L_0x007f:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0094
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x008c
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Password and AccountType are mutually exclusive"
            r5.<init>(r6)
            throw r5
        L_0x0094:
            if (r6 == 0) goto L_0x00a1
            java.lang.String r0 = r6.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00a1
            r6 = 0
        L_0x00a1:
            r4.f12502b = r6
            r4.f12495N = r7
            if (r8 != 0) goto L_0x00ac
            java.util.List r6 = java.util.Collections.emptyList()
            goto L_0x00b0
        L_0x00ac:
            java.util.List r6 = java.util.Collections.unmodifiableList(r8)
        L_0x00b0:
            r4.f12496O = r6
            r4.f12501a = r5
            r4.f12497P = r9
            r4.f12498Q = r10
            r4.f12499R = r11
            r4.f12500S = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.Credential.<init>(java.lang.String, java.lang.String, android.net.Uri, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @C0195i0
    /* renamed from: N */
    public String mo17338N() {
        return this.f12498Q;
    }

    @C0195i0
    /* renamed from: O */
    public String mo17339O() {
        return this.f12500S;
    }

    @C0195i0
    /* renamed from: P */
    public String mo17340P() {
        return this.f12499R;
    }

    @C5950g
    /* renamed from: Q */
    public String mo17341Q() {
        return this.f12501a;
    }

    @C5950g
    /* renamed from: R */
    public List<IdToken> mo17342R() {
        return this.f12496O;
    }

    @C0195i0
    /* renamed from: S */
    public String mo17343S() {
        return this.f12502b;
    }

    @C0195i0
    /* renamed from: T */
    public String mo17344T() {
        return this.f12497P;
    }

    @C0195i0
    /* renamed from: U */
    public Uri mo17345U() {
        return this.f12495N;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f12501a, credential.f12501a) && TextUtils.equals(this.f12502b, credential.f12502b) && C4413y.m19053a(this.f12495N, credential.f12495N) && TextUtils.equals(this.f12497P, credential.f12497P) && TextUtils.equals(this.f12498Q, credential.f12498Q);
    }

    public int hashCode() {
        return C4413y.m19051a(this.f12501a, this.f12502b, this.f12495N, this.f12497P, this.f12498Q);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18979a(parcel, 1, mo17341Q(), false);
        C4399a.m18979a(parcel, 2, mo17343S(), false);
        C4399a.m18969a(parcel, 3, (Parcelable) mo17345U(), i, false);
        C4399a.m19017j(parcel, 4, mo17342R(), false);
        C4399a.m18979a(parcel, 5, mo17344T(), false);
        C4399a.m18979a(parcel, 6, mo17338N(), false);
        C4399a.m18979a(parcel, 9, mo17340P(), false);
        C4399a.m18979a(parcel, 10, mo17339O(), false);
        C4399a.m18959a(parcel, a);
    }
}
