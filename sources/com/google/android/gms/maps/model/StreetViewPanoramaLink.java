package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "StreetViewPanoramaLinkCreator")
@C4397f({1})
public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Creator<StreetViewPanoramaLink> CREATOR = new zzn();
    @C4394c(mo18384id = 3)
    public final float bearing;
    @C4394c(mo18384id = 2)
    public final String panoId;

    @C4393b
    public StreetViewPanoramaLink(@C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) float f) {
        this.panoId = str;
        if (((double) f) <= 0.0d) {
            f = (f % 360.0f) + 360.0f;
        }
        this.bearing = f % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.panoId.equals(streetViewPanoramaLink.panoId) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaLink.bearing);
    }

    public int hashCode() {
        return C4413y.m19051a(this.panoId, Float.valueOf(this.bearing));
    }

    public String toString() {
        return C4413y.m19052a((Object) this).mo18403a("panoId", this.panoId).mo18403a("bearing", Float.valueOf(this.bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18979a(parcel, 2, this.panoId, false);
        C4399a.m18963a(parcel, 3, this.bearing);
        C4399a.m18959a(parcel, a);
    }
}
