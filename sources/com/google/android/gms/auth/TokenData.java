package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import java.util.List;

@C4392a(creator = "TokenDataCreator")
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<TokenData> CREATOR = new C4048o();
    @C4394c(getter = "getExpirationTimeSecs", mo18384id = 3)

    /* renamed from: N */
    private final Long f12406N;
    @C4394c(getter = "isCached", mo18384id = 4)

    /* renamed from: O */
    private final boolean f12407O;
    @C4394c(getter = "isSnowballed", mo18384id = 5)

    /* renamed from: P */
    private final boolean f12408P;
    @C4394c(getter = "getGrantedScopes", mo18384id = 6)

    /* renamed from: Q */
    private final List<String> f12409Q;
    @C4394c(getter = "getScopeData", mo18384id = 7)

    /* renamed from: R */
    private final String f12410R;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f12411a;
    @C4394c(getter = "getToken", mo18384id = 2)

    /* renamed from: b */
    private final String f12412b;

    @C4393b
    TokenData(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) Long l, @C4396e(mo18387id = 4) boolean z, @C4396e(mo18387id = 5) boolean z2, @C4396e(mo18387id = 6) List<String> list, @C4396e(mo18387id = 7) String str2) {
        this.f12411a = i;
        this.f12412b = C4300a0.m18630b(str);
        this.f12406N = l;
        this.f12407O = z;
        this.f12408P = z2;
        this.f12409Q = list;
        this.f12410R = str2;
    }

    @C0195i0
    /* renamed from: a */
    public static TokenData m17095a(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle2.getParcelable("TokenData");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.f12412b, tokenData.f12412b) || !C4413y.m19053a(this.f12406N, tokenData.f12406N) || this.f12407O != tokenData.f12407O || this.f12408P != tokenData.f12408P || !C4413y.m19053a(this.f12409Q, tokenData.f12409Q) || !C4413y.m19053a(this.f12410R, tokenData.f12410R)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4413y.m19051a(this.f12412b, this.f12406N, Boolean.valueOf(this.f12407O), Boolean.valueOf(this.f12408P), this.f12409Q, this.f12410R);
    }

    /* renamed from: i */
    public final String mo17293i() {
        return this.f12412b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f12411a);
        C4399a.m18979a(parcel, 2, this.f12412b, false);
        C4399a.m18978a(parcel, 3, this.f12406N, false);
        C4399a.m18984a(parcel, 4, this.f12407O);
        C4399a.m18984a(parcel, 5, this.f12408P);
        C4399a.m19016i(parcel, 6, this.f12409Q, false);
        C4399a.m18979a(parcel, 7, this.f12410R, false);
        C4399a.m18959a(parcel, a);
    }
}
