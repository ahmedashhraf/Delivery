package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;

@C4056a
@C4392a(creator = "FeatureCreator")
public class Feature extends AbstractSafeParcelable {
    public static final Creator<Feature> CREATOR = new C4468u();
    @C4394c(defaultValue = "-1", getter = "getVersion", mo18384id = 3)

    /* renamed from: N */
    private final long f12768N;
    @C4394c(getter = "getName", mo18384id = 1)

    /* renamed from: a */
    private final String f12769a;
    @Deprecated
    @C4394c(getter = "getOldVersion", mo18384id = 2)

    /* renamed from: b */
    private final int f12770b;

    @C4056a
    public Feature(String str, long j) {
        this.f12769a = str;
        this.f12768N = j;
        this.f12770b = -1;
    }

    @C4056a
    /* renamed from: N */
    public String mo17586N() {
        return this.f12769a;
    }

    @C4056a
    /* renamed from: O */
    public long mo17587O() {
        long j = this.f12768N;
        return j == -1 ? (long) this.f12770b : j;
    }

    public boolean equals(@C0195i0 Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((mo17586N() != null && mo17586N().equals(feature.mo17586N())) || (mo17586N() == null && feature.mo17586N() == null)) && mo17587O() == feature.mo17587O()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C4413y.m19051a(mo17586N(), Long.valueOf(mo17587O()));
    }

    public String toString() {
        return C4413y.m19052a((Object) this).mo18403a("name", mo17586N()).mo18403a("version", Long.valueOf(mo17587O())).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18979a(parcel, 1, mo17586N(), false);
        C4399a.m18964a(parcel, 2, this.f12770b);
        C4399a.m18965a(parcel, 3, mo17587O());
        C4399a.m18959a(parcel, a);
    }

    @C4393b
    public Feature(@C4396e(mo18387id = 1) String str, @C4396e(mo18387id = 2) int i, @C4396e(mo18387id = 3) long j) {
        this.f12769a = str;
        this.f12770b = i;
        this.f12768N = j;
    }
}
