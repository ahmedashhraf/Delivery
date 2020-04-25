package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.C4413y.C4414a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import com.google.android.gms.common.util.C4476d0;

@C4392a(creator = "PlaceReportCreator")
public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<PlaceReport> CREATOR = new C5151a();
    @C4394c(getter = "getTag", mo18384id = 3)

    /* renamed from: N */
    private final String f14796N;
    @C4394c(getter = "getSource", mo18384id = 4)

    /* renamed from: O */
    private final String f14797O;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f14798a;
    @C4394c(getter = "getPlaceId", mo18384id = 2)

    /* renamed from: b */
    private final String f14799b;

    @C4393b
    PlaceReport(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) String str2, @C4396e(mo18387id = 4) String str3) {
        this.f14798a = i;
        this.f14799b = str;
        this.f14796N = str2;
        this.f14797O = str3;
    }

    @C4476d0
    /* renamed from: a */
    public static PlaceReport m22423a(String str, String str2) {
        char c;
        C4300a0.m18620a(str);
        C4300a0.m18630b(str2);
        String str3 = "unknown";
        C4300a0.m18630b(str3);
        boolean z = false;
        switch (str3.hashCode()) {
            case -284840886:
                c = 0;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2 || c == 3 || c == 4 || c == 5) {
            z = true;
        }
        C4300a0.m18628a(z, (Object) "Invalid source");
        return new PlaceReport(1, str, str2, str3);
    }

    /* renamed from: N */
    public String mo20120N() {
        return this.f14799b;
    }

    /* renamed from: O */
    public String mo20121O() {
        return this.f14796N;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return C4413y.m19053a(this.f14799b, placeReport.f14799b) && C4413y.m19053a(this.f14796N, placeReport.f14796N) && C4413y.m19053a(this.f14797O, placeReport.f14797O);
    }

    public int hashCode() {
        return C4413y.m19051a(this.f14799b, this.f14796N, this.f14797O);
    }

    public String toString() {
        C4414a a = C4413y.m19052a((Object) this);
        a.mo18403a("placeId", this.f14799b);
        a.mo18403a("tag", this.f14796N);
        if (!"unknown".equals(this.f14797O)) {
            a.mo18403a("source", this.f14797O);
        }
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f14798a);
        C4399a.m18979a(parcel, 2, mo20120N(), false);
        C4399a.m18979a(parcel, 3, mo20121O(), false);
        C4399a.m18979a(parcel, 4, this.f14797O, false);
        C4399a.m18959a(parcel, a);
    }
}
