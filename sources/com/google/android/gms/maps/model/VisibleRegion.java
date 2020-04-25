package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "VisibleRegionCreator")
@C4397f({1})
public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Creator<VisibleRegion> CREATOR = new zzv();
    @C4394c(mo18384id = 4)
    public final LatLng farLeft;
    @C4394c(mo18384id = 5)
    public final LatLng farRight;
    @C4394c(mo18384id = 6)
    public final LatLngBounds latLngBounds;
    @C4394c(mo18384id = 2)
    public final LatLng nearLeft;
    @C4394c(mo18384id = 3)
    public final LatLng nearRight;

    @C4393b
    public VisibleRegion(@C4396e(mo18387id = 2) LatLng latLng, @C4396e(mo18387id = 3) LatLng latLng2, @C4396e(mo18387id = 4) LatLng latLng3, @C4396e(mo18387id = 5) LatLng latLng4, @C4396e(mo18387id = 6) LatLngBounds latLngBounds2) {
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds);
    }

    public final int hashCode() {
        return C4413y.m19051a(this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds);
    }

    public final String toString() {
        return C4413y.m19052a((Object) this).mo18403a("nearLeft", this.nearLeft).mo18403a("nearRight", this.nearRight).mo18403a("farLeft", this.farLeft).mo18403a("farRight", this.farRight).mo18403a("latLngBounds", this.latLngBounds).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18969a(parcel, 2, (Parcelable) this.nearLeft, i, false);
        C4399a.m18969a(parcel, 3, (Parcelable) this.nearRight, i, false);
        C4399a.m18969a(parcel, 4, (Parcelable) this.farLeft, i, false);
        C4399a.m18969a(parcel, 5, (Parcelable) this.farRight, i, false);
        C4399a.m18969a(parcel, 6, (Parcelable) this.latLngBounds, i, false);
        C4399a.m18959a(parcel, a);
    }
}
