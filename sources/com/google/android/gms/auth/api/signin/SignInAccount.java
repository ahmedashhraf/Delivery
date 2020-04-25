package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import p201f.p202a.C5952h;

@C4392a(creator = "SignInAccountCreator")
@C4397f({1})
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<SignInAccount> CREATOR = new C4024l();
    @Deprecated
    @C4394c(defaultValue = "", mo18384id = 8)

    /* renamed from: N */
    private String f12651N;
    @Deprecated
    @C4394c(defaultValue = "", mo18384id = 4)

    /* renamed from: a */
    private String f12652a;
    @C4394c(getter = "getGoogleSignInAccount", mo18384id = 7)

    /* renamed from: b */
    private GoogleSignInAccount f12653b;

    @C4393b
    SignInAccount(@C4396e(mo18387id = 4) String str, @C4396e(mo18387id = 7) GoogleSignInAccount googleSignInAccount, @C4396e(mo18387id = 8) String str2) {
        this.f12653b = googleSignInAccount;
        this.f12652a = C4300a0.m18622a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.f12651N = C4300a0.m18622a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
    }

    @C5952h
    /* renamed from: N */
    public final GoogleSignInAccount mo17487N() {
        return this.f12653b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18979a(parcel, 4, this.f12652a, false);
        C4399a.m18969a(parcel, 7, (Parcelable) this.f12653b, i, false);
        C4399a.m18979a(parcel, 8, this.f12651N, false);
        C4399a.m18959a(parcel, a);
    }
}
