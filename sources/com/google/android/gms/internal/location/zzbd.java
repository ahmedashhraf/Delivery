package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

@C4392a(creator = "LocationRequestInternalCreator")
@C4397f({1000, 2, 3, 4})
public final class zzbd extends AbstractSafeParcelable {
    public static final Creator<zzbd> CREATOR = new C4631e0();

    /* renamed from: T */
    static final List<ClientIdentity> f13925T = Collections.emptyList();
    @C0195i0
    @C4394c(defaultValueUnchecked = "null", mo18384id = 6)

    /* renamed from: N */
    private String f13926N;
    @C4394c(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_HIDE_FROM_APP_OPS", mo18384id = 7)

    /* renamed from: O */
    private boolean f13927O;
    @C4394c(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_FORCE_COARSE_LOCATION", mo18384id = 8)

    /* renamed from: P */
    private boolean f13928P;
    @C4394c(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_EXEMPT_FROM_THROTTLE", mo18384id = 9)

    /* renamed from: Q */
    private boolean f13929Q;
    @C0195i0
    @C4394c(defaultValueUnchecked = "null", mo18384id = 10)

    /* renamed from: R */
    private String f13930R;

    /* renamed from: S */
    private boolean f13931S = true;
    @C4394c(defaultValueUnchecked = "null", mo18384id = 1)

    /* renamed from: a */
    private LocationRequest f13932a;
    @C4394c(defaultValueUnchecked = "LocationRequestInternal.DEFAULT_CLIENTS", mo18384id = 5)

    /* renamed from: b */
    private List<ClientIdentity> f13933b;

    @C4393b
    zzbd(@C4396e(mo18387id = 1) LocationRequest locationRequest, @C4396e(mo18387id = 5) List<ClientIdentity> list, @C4396e(mo18387id = 6) @C0195i0 String str, @C4396e(mo18387id = 7) boolean z, @C4396e(mo18387id = 8) boolean z2, @C4396e(mo18387id = 9) boolean z3, @C4396e(mo18387id = 10) String str2) {
        this.f13932a = locationRequest;
        this.f13933b = list;
        this.f13926N = str;
        this.f13927O = z;
        this.f13928P = z2;
        this.f13929Q = z3;
        this.f13930R = str2;
    }

    @Deprecated
    /* renamed from: a */
    public static zzbd m19891a(LocationRequest locationRequest) {
        zzbd zzbd = new zzbd(locationRequest, f13925T, null, false, false, false, null);
        return zzbd;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbd = (zzbd) obj;
        return C4413y.m19053a(this.f13932a, zzbd.f13932a) && C4413y.m19053a(this.f13933b, zzbd.f13933b) && C4413y.m19053a(this.f13926N, zzbd.f13926N) && this.f13927O == zzbd.f13927O && this.f13928P == zzbd.f13928P && this.f13929Q == zzbd.f13929Q && C4413y.m19053a(this.f13930R, zzbd.f13930R);
    }

    public final int hashCode() {
        return this.f13932a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13932a);
        if (this.f13926N != null) {
            sb.append(" tag=");
            sb.append(this.f13926N);
        }
        if (this.f13930R != null) {
            sb.append(" moduleId=");
            sb.append(this.f13930R);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f13927O);
        sb.append(" clients=");
        sb.append(this.f13933b);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f13928P);
        if (this.f13929Q) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18969a(parcel, 1, (Parcelable) this.f13932a, i, false);
        C4399a.m19017j(parcel, 5, this.f13933b, false);
        C4399a.m18979a(parcel, 6, this.f13926N, false);
        C4399a.m18984a(parcel, 7, this.f13927O);
        C4399a.m18984a(parcel, 8, this.f13928P);
        C4399a.m18984a(parcel, 9, this.f13929Q);
        C4399a.m18979a(parcel, 10, this.f13930R, false);
        C4399a.m18959a(parcel, a);
    }
}
