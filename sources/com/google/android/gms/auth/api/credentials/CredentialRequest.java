package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig.C3948a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@C4392a(creator = "CredentialRequestCreator")
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Creator<CredentialRequest> CREATOR = new C3963k();
    @C4394c(getter = "getAccountTypes", mo18384id = 2)

    /* renamed from: N */
    private final String[] f12522N;
    @C4394c(getter = "getCredentialPickerConfig", mo18384id = 3)

    /* renamed from: O */
    private final CredentialPickerConfig f12523O;
    @C4394c(getter = "getCredentialHintPickerConfig", mo18384id = 4)

    /* renamed from: P */
    private final CredentialPickerConfig f12524P;
    @C4394c(getter = "isIdTokenRequested", mo18384id = 5)

    /* renamed from: Q */
    private final boolean f12525Q;
    @C4394c(getter = "getServerClientId", mo18384id = 6)

    /* renamed from: R */
    private final String f12526R;
    @C4394c(getter = "getIdTokenNonce", mo18384id = 7)

    /* renamed from: S */
    private final String f12527S;
    @C4394c(getter = "getRequireUserMediation", mo18384id = 8)

    /* renamed from: T */
    private final boolean f12528T;
    @C4394c(mo18384id = 1000)

    /* renamed from: a */
    private final int f12529a;
    @C4394c(getter = "isPasswordLoginSupported", mo18384id = 1)

    /* renamed from: b */
    private final boolean f12530b;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialRequest$a */
    public static final class C3950a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f12531a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String[] f12532b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public CredentialPickerConfig f12533c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CredentialPickerConfig f12534d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f12535e = false;

        /* renamed from: f */
        private boolean f12536f = false;
        /* access modifiers changed from: private */
        @C0195i0

        /* renamed from: g */
        public String f12537g = null;
        /* access modifiers changed from: private */
        @C0195i0

        /* renamed from: h */
        public String f12538h;

        /* renamed from: a */
        public final C3950a mo17376a(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.f12532b = strArr;
            return this;
        }

        /* renamed from: b */
        public final C3950a mo17380b(boolean z) {
            this.f12531a = z;
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public final C3950a mo17381c(boolean z) {
            return mo17380b(z);
        }

        /* renamed from: a */
        public final C3950a mo17373a(CredentialPickerConfig credentialPickerConfig) {
            this.f12534d = credentialPickerConfig;
            return this;
        }

        /* renamed from: b */
        public final C3950a mo17378b(CredentialPickerConfig credentialPickerConfig) {
            this.f12533c = credentialPickerConfig;
            return this;
        }

        /* renamed from: a */
        public final C3950a mo17375a(boolean z) {
            this.f12535e = z;
            return this;
        }

        /* renamed from: b */
        public final C3950a mo17379b(@C0195i0 String str) {
            this.f12537g = str;
            return this;
        }

        /* renamed from: a */
        public final C3950a mo17374a(@C0195i0 String str) {
            this.f12538h = str;
            return this;
        }

        /* renamed from: a */
        public final CredentialRequest mo17377a() {
            if (this.f12532b == null) {
                this.f12532b = new String[0];
            }
            if (this.f12531a || this.f12532b.length != 0) {
                return new CredentialRequest(this);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }
    }

    @C4393b
    CredentialRequest(@C4396e(mo18387id = 1000) int i, @C4396e(mo18387id = 1) boolean z, @C4396e(mo18387id = 2) String[] strArr, @C4396e(mo18387id = 3) CredentialPickerConfig credentialPickerConfig, @C4396e(mo18387id = 4) CredentialPickerConfig credentialPickerConfig2, @C4396e(mo18387id = 5) boolean z2, @C4396e(mo18387id = 6) String str, @C4396e(mo18387id = 7) String str2, @C4396e(mo18387id = 8) boolean z3) {
        this.f12529a = i;
        this.f12530b = z;
        this.f12522N = (String[]) C4300a0.m18620a(strArr);
        if (credentialPickerConfig == null) {
            credentialPickerConfig = new C3948a().mo17360a();
        }
        this.f12523O = credentialPickerConfig;
        if (credentialPickerConfig2 == null) {
            credentialPickerConfig2 = new C3948a().mo17360a();
        }
        this.f12524P = credentialPickerConfig2;
        if (i < 3) {
            this.f12525Q = true;
            this.f12526R = null;
            this.f12527S = null;
        } else {
            this.f12525Q = z2;
            this.f12526R = str;
            this.f12527S = str2;
        }
        this.f12528T = z3;
    }

    @C0193h0
    /* renamed from: N */
    public final String[] mo17363N() {
        return this.f12522N;
    }

    @C0193h0
    /* renamed from: O */
    public final Set<String> mo17364O() {
        return new HashSet(Arrays.asList(this.f12522N));
    }

    @C0193h0
    /* renamed from: P */
    public final CredentialPickerConfig mo17365P() {
        return this.f12524P;
    }

    @C0193h0
    /* renamed from: Q */
    public final CredentialPickerConfig mo17366Q() {
        return this.f12523O;
    }

    @C0195i0
    /* renamed from: R */
    public final String mo17367R() {
        return this.f12527S;
    }

    @C0195i0
    /* renamed from: S */
    public final String mo17368S() {
        return this.f12526R;
    }

    @Deprecated
    /* renamed from: T */
    public final boolean mo17369T() {
        return mo17371V();
    }

    /* renamed from: U */
    public final boolean mo17370U() {
        return this.f12525Q;
    }

    /* renamed from: V */
    public final boolean mo17371V() {
        return this.f12530b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18984a(parcel, 1, mo17371V());
        C4399a.m18994a(parcel, 2, mo17363N(), false);
        C4399a.m18969a(parcel, 3, (Parcelable) mo17366Q(), i, false);
        C4399a.m18969a(parcel, 4, (Parcelable) mo17365P(), i, false);
        C4399a.m18984a(parcel, 5, mo17370U());
        C4399a.m18979a(parcel, 6, mo17368S(), false);
        C4399a.m18979a(parcel, 7, mo17367R(), false);
        C4399a.m18964a(parcel, 1000, this.f12529a);
        C4399a.m18984a(parcel, 8, this.f12528T);
        C4399a.m18959a(parcel, a);
    }

    private CredentialRequest(C3950a aVar) {
        this(4, aVar.f12531a, aVar.f12532b, aVar.f12533c, aVar.f12534d, aVar.f12535e, aVar.f12537g, aVar.f12538h, false);
    }
}
