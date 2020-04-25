package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig.C3948a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;

@C4392a(creator = "HintRequestCreator")
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<HintRequest> CREATOR = new C3966n();
    @C4394c(getter = "isEmailAddressIdentifierSupported", mo18384id = 2)

    /* renamed from: N */
    private final boolean f12539N;
    @C4394c(getter = "isPhoneNumberIdentifierSupported", mo18384id = 3)

    /* renamed from: O */
    private final boolean f12540O;
    @C4394c(getter = "getAccountTypes", mo18384id = 4)

    /* renamed from: P */
    private final String[] f12541P;
    @C4394c(getter = "isIdTokenRequested", mo18384id = 5)

    /* renamed from: Q */
    private final boolean f12542Q;
    @C4394c(getter = "getServerClientId", mo18384id = 6)

    /* renamed from: R */
    private final String f12543R;
    @C4394c(getter = "getIdTokenNonce", mo18384id = 7)

    /* renamed from: S */
    private final String f12544S;
    @C4394c(mo18384id = 1000)

    /* renamed from: a */
    private final int f12545a;
    @C4394c(getter = "getHintPickerConfig", mo18384id = 1)

    /* renamed from: b */
    private final CredentialPickerConfig f12546b;

    /* renamed from: com.google.android.gms.auth.api.credentials.HintRequest$a */
    public static final class C3951a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f12547a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f12548b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String[] f12549c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CredentialPickerConfig f12550d = new C3948a().mo17360a();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f12551e = false;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f12552f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f12553g;

        /* renamed from: a */
        public final C3951a mo17392a(boolean z) {
            this.f12547a = z;
            return this;
        }

        /* renamed from: b */
        public final C3951a mo17396b(boolean z) {
            this.f12551e = z;
            return this;
        }

        /* renamed from: c */
        public final C3951a mo17397c(boolean z) {
            this.f12548b = z;
            return this;
        }

        /* renamed from: a */
        public final C3951a mo17393a(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.f12549c = strArr;
            return this;
        }

        /* renamed from: b */
        public final C3951a mo17395b(@C0195i0 String str) {
            this.f12552f = str;
            return this;
        }

        /* renamed from: a */
        public final C3951a mo17390a(@C0193h0 CredentialPickerConfig credentialPickerConfig) {
            this.f12550d = (CredentialPickerConfig) C4300a0.m18620a(credentialPickerConfig);
            return this;
        }

        /* renamed from: a */
        public final C3951a mo17391a(@C0195i0 String str) {
            this.f12553g = str;
            return this;
        }

        /* renamed from: a */
        public final HintRequest mo17394a() {
            if (this.f12549c == null) {
                this.f12549c = new String[0];
            }
            if (this.f12547a || this.f12548b || this.f12549c.length != 0) {
                return new HintRequest(this);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }
    }

    @C4393b
    HintRequest(@C4396e(mo18387id = 1000) int i, @C4396e(mo18387id = 1) CredentialPickerConfig credentialPickerConfig, @C4396e(mo18387id = 2) boolean z, @C4396e(mo18387id = 3) boolean z2, @C4396e(mo18387id = 4) String[] strArr, @C4396e(mo18387id = 5) boolean z3, @C4396e(mo18387id = 6) String str, @C4396e(mo18387id = 7) String str2) {
        this.f12545a = i;
        this.f12546b = (CredentialPickerConfig) C4300a0.m18620a(credentialPickerConfig);
        this.f12539N = z;
        this.f12540O = z2;
        this.f12541P = (String[]) C4300a0.m18620a(strArr);
        if (this.f12545a < 2) {
            this.f12542Q = true;
            this.f12543R = null;
            this.f12544S = null;
            return;
        }
        this.f12542Q = z3;
        this.f12543R = str;
        this.f12544S = str2;
    }

    @C0193h0
    /* renamed from: N */
    public final String[] mo17383N() {
        return this.f12541P;
    }

    @C0193h0
    /* renamed from: O */
    public final CredentialPickerConfig mo17384O() {
        return this.f12546b;
    }

    @C0195i0
    /* renamed from: P */
    public final String mo17385P() {
        return this.f12544S;
    }

    @C0195i0
    /* renamed from: Q */
    public final String mo17386Q() {
        return this.f12543R;
    }

    /* renamed from: R */
    public final boolean mo17387R() {
        return this.f12539N;
    }

    /* renamed from: S */
    public final boolean mo17388S() {
        return this.f12542Q;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18969a(parcel, 1, (Parcelable) mo17384O(), i, false);
        C4399a.m18984a(parcel, 2, mo17387R());
        C4399a.m18984a(parcel, 3, this.f12540O);
        C4399a.m18994a(parcel, 4, mo17383N(), false);
        C4399a.m18984a(parcel, 5, mo17388S());
        C4399a.m18979a(parcel, 6, mo17386Q(), false);
        C4399a.m18979a(parcel, 7, mo17385P(), false);
        C4399a.m18964a(parcel, 1000, this.f12545a);
        C4399a.m18959a(parcel, a);
    }

    private HintRequest(C3951a aVar) {
        this(2, aVar.f12550d, aVar.f12547a, aVar.f12548b, aVar.f12549c, aVar.f12551e, aVar.f12552f, aVar.f12553g);
    }
}
