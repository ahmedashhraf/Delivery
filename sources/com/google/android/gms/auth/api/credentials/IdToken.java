package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "IdTokenCreator")
@C4397f({1000})
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<IdToken> CREATOR = new C3967o();
    @C0193h0
    @C4394c(getter = "getAccountType", mo18384id = 1)

    /* renamed from: a */
    private final String f12554a;
    @C0193h0
    @C4394c(getter = "getIdToken", mo18384id = 2)

    /* renamed from: b */
    private final String f12555b;

    @C4393b
    public IdToken(@C0193h0 @C4396e(mo18387id = 1) String str, @C0193h0 @C4396e(mo18387id = 2) String str2) {
        C4300a0.m18628a(!TextUtils.isEmpty(str), (Object) "account type string cannot be null or empty");
        C4300a0.m18628a(!TextUtils.isEmpty(str2), (Object) "id token string cannot be null or empty");
        this.f12554a = str;
        this.f12555b = str2;
    }

    @C0193h0
    /* renamed from: N */
    public final String mo17398N() {
        return this.f12554a;
    }

    @C0193h0
    /* renamed from: O */
    public final String mo17399O() {
        return this.f12555b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return C4413y.m19053a(this.f12554a, idToken.f12554a) && C4413y.m19053a(this.f12555b, idToken.f12555b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18979a(parcel, 1, mo17398N(), false);
        C4399a.m18979a(parcel, 2, mo17399O(), false);
        C4399a.m18959a(parcel, a);
    }
}
