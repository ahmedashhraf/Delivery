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
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;

@C4392a(creator = "DeviceOrientationRequestInternalCreator")
public final class zzm extends AbstractSafeParcelable {
    public static final Creator<zzm> CREATOR = new C4668v0();
    @C4476d0

    /* renamed from: O */
    static final List<ClientIdentity> f13949O = Collections.emptyList();

    /* renamed from: P */
    static final zzj f13950P = new zzj();
    @C0195i0
    @C4394c(defaultValueUnchecked = "null", mo18384id = 3)

    /* renamed from: N */
    private String f13951N;
    @C4394c(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_DEVICE_ORIENTATION_REQUEST", mo18384id = 1)

    /* renamed from: a */
    private zzj f13952a;
    @C4394c(defaultValueUnchecked = "DeviceOrientationRequestInternal.DEFAULT_CLIENTS", mo18384id = 2)

    /* renamed from: b */
    private List<ClientIdentity> f13953b;

    @C4393b
    zzm(@C4396e(mo18387id = 1) zzj zzj, @C4396e(mo18387id = 2) List<ClientIdentity> list, @C4396e(mo18387id = 3) String str) {
        this.f13952a = zzj;
        this.f13953b = list;
        this.f13951N = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzm = (zzm) obj;
        return C4413y.m19053a(this.f13952a, zzm.f13952a) && C4413y.m19053a(this.f13953b, zzm.f13953b) && C4413y.m19053a(this.f13951N, zzm.f13951N);
    }

    public final int hashCode() {
        return this.f13952a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18969a(parcel, 1, (Parcelable) this.f13952a, i, false);
        C4399a.m19017j(parcel, 2, this.f13953b, false);
        C4399a.m18979a(parcel, 3, this.f13951N, false);
        C4399a.m18959a(parcel, a);
    }
}
