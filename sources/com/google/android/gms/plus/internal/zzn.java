package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.C4400b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import java.util.Arrays;

@C4392a(creator = "PlusSessionCreator")
public final class zzn extends AbstractSafeParcelable {
    public static final Creator<zzn> CREATOR = new C5527n();
    @C4394c(getter = "getRequestedScopes", mo18384id = 2)

    /* renamed from: N */
    private final String[] f15823N;
    @C4394c(getter = "getVisibleActions", mo18384id = 3)

    /* renamed from: O */
    private final String[] f15824O;
    @C4394c(getter = "getRequiredFeatures", mo18384id = 4)

    /* renamed from: P */
    private final String[] f15825P;
    @C4394c(getter = "getPackageNameForAuth", mo18384id = 5)

    /* renamed from: Q */
    private final String f15826Q;
    @C4394c(getter = "getCallingPackageName", mo18384id = 6)

    /* renamed from: R */
    private final String f15827R;
    @C4394c(getter = "getApplicationName", mo18384id = 7)

    /* renamed from: S */
    private final String f15828S;
    @C4394c(getter = "getClientId_DEPRECATED", mo18384id = 8)

    /* renamed from: T */
    private final String f15829T;
    @C4394c(getter = "getExtras", mo18384id = 9)

    /* renamed from: U */
    private final PlusCommonExtras f15830U;
    @C4398g(getter = "getVersionCode", mo18390id = 1000)

    /* renamed from: a */
    private final int f15831a;
    @C4394c(getter = "getAccountName", mo18384id = 1)

    /* renamed from: b */
    private final String f15832b;

    @C4393b
    zzn(@C4396e(mo18387id = 1000) int i, @C4396e(mo18387id = 1) String str, @C4396e(mo18387id = 2) String[] strArr, @C4396e(mo18387id = 3) String[] strArr2, @C4396e(mo18387id = 4) String[] strArr3, @C4396e(mo18387id = 5) String str2, @C4396e(mo18387id = 6) String str3, @C4396e(mo18387id = 7) String str4, @C4396e(mo18387id = 8) String str5, @C4396e(mo18387id = 9) PlusCommonExtras plusCommonExtras) {
        this.f15831a = i;
        this.f15832b = str;
        this.f15823N = strArr;
        this.f15824O = strArr2;
        this.f15825P = strArr3;
        this.f15826Q = str2;
        this.f15827R = str3;
        this.f15828S = str4;
        this.f15829T = str5;
        this.f15830U = plusCommonExtras;
    }

    public zzn(String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, PlusCommonExtras plusCommonExtras) {
        this.f15831a = 1;
        this.f15832b = str;
        this.f15823N = strArr;
        this.f15824O = strArr2;
        this.f15825P = strArr3;
        this.f15826Q = str2;
        this.f15827R = str3;
        this.f15828S = null;
        this.f15829T = null;
        this.f15830U = plusCommonExtras;
    }

    /* renamed from: N */
    public final String[] mo21946N() {
        return this.f15824O;
    }

    /* renamed from: O */
    public final String mo21947O() {
        return this.f15826Q;
    }

    /* renamed from: P */
    public final Bundle mo21948P() {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(PlusCommonExtras.class.getClassLoader());
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", C4400b.m19025a(this.f15830U));
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zzn = (zzn) obj;
        return this.f15831a == zzn.f15831a && C4413y.m19053a(this.f15832b, zzn.f15832b) && Arrays.equals(this.f15823N, zzn.f15823N) && Arrays.equals(this.f15824O, zzn.f15824O) && Arrays.equals(this.f15825P, zzn.f15825P) && C4413y.m19053a(this.f15826Q, zzn.f15826Q) && C4413y.m19053a(this.f15827R, zzn.f15827R) && C4413y.m19053a(this.f15828S, zzn.f15828S) && C4413y.m19053a(this.f15829T, zzn.f15829T) && C4413y.m19053a(this.f15830U, zzn.f15830U);
    }

    public final int hashCode() {
        return C4413y.m19051a(Integer.valueOf(this.f15831a), this.f15832b, this.f15823N, this.f15824O, this.f15825P, this.f15826Q, this.f15827R, this.f15828S, this.f15829T, this.f15830U);
    }

    public final String toString() {
        return C4413y.m19052a((Object) this).mo18403a("versionCode", Integer.valueOf(this.f15831a)).mo18403a("accountName", this.f15832b).mo18403a("requestedScopes", this.f15823N).mo18403a("visibleActivities", this.f15824O).mo18403a("requiredFeatures", this.f15825P).mo18403a("packageNameForAuth", this.f15826Q).mo18403a("callingPackageName", this.f15827R).mo18403a("applicationName", this.f15828S).mo18403a("extra", this.f15830U.toString()).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18979a(parcel, 1, this.f15832b, false);
        C4399a.m18994a(parcel, 2, this.f15823N, false);
        C4399a.m18994a(parcel, 3, this.f15824O, false);
        C4399a.m18994a(parcel, 4, this.f15825P, false);
        C4399a.m18979a(parcel, 5, this.f15826Q, false);
        C4399a.m18979a(parcel, 6, this.f15827R, false);
        C4399a.m18979a(parcel, 7, this.f15828S, false);
        C4399a.m18964a(parcel, 1000, this.f15831a);
        C4399a.m18979a(parcel, 8, this.f15829T, false);
        C4399a.m18969a(parcel, 9, (Parcelable) this.f15830U, i, false);
        C4399a.m18959a(parcel, a);
    }
}
