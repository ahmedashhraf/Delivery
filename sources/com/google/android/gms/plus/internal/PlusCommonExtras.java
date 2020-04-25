package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@KeepName
@C4392a(creator = "PlusCommonExtrasCreator")
public class PlusCommonExtras extends AbstractSafeParcelable {
    public static final Creator<PlusCommonExtras> CREATOR = new C5525l();
    @C4394c(getter = "getClientCallingPackage", mo18384id = 2)

    /* renamed from: N */
    private String f15812N;
    @C4398g(getter = "getVersionCode", mo18390id = 1000)

    /* renamed from: a */
    private final int f15813a;
    @C4394c(getter = "getGpsrc", mo18384id = 1)

    /* renamed from: b */
    private String f15814b;

    public PlusCommonExtras() {
        this.f15813a = 1;
        String str = "";
        this.f15814b = str;
        this.f15812N = str;
    }

    @C4393b
    PlusCommonExtras(@C4396e(mo18387id = 1000) int i, @C4396e(mo18387id = 1) String str, @C4396e(mo18387id = 2) String str2) {
        this.f15813a = i;
        this.f15814b = str;
        this.f15812N = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlusCommonExtras)) {
            return false;
        }
        PlusCommonExtras plusCommonExtras = (PlusCommonExtras) obj;
        return this.f15813a == plusCommonExtras.f15813a && C4413y.m19053a(this.f15814b, plusCommonExtras.f15814b) && C4413y.m19053a(this.f15812N, plusCommonExtras.f15812N);
    }

    public int hashCode() {
        return C4413y.m19051a(Integer.valueOf(this.f15813a), this.f15814b, this.f15812N);
    }

    public String toString() {
        return C4413y.m19052a((Object) this).mo18403a("versionCode", Integer.valueOf(this.f15813a)).mo18403a("Gpsrc", this.f15814b).mo18403a("ClientCallingPackage", this.f15812N).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18979a(parcel, 1, this.f15814b, false);
        C4399a.m18979a(parcel, 2, this.f15812N, false);
        C4399a.m18964a(parcel, 1000, this.f15813a);
        C4399a.m18959a(parcel, a);
    }
}
