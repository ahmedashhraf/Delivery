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

@C4392a(creator = "StreetViewPanoramaLocationCreator")
@C4397f({1})
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Creator<StreetViewPanoramaLocation> CREATOR = new zzo();
    @C4394c(mo18384id = 2)
    public final StreetViewPanoramaLink[] links;
    @C4394c(mo18384id = 4)
    public final String panoId;
    @C4394c(mo18384id = 3)
    public final LatLng position;

    @C4393b
    public StreetViewPanoramaLocation(@C4396e(mo18387id = 2) StreetViewPanoramaLink[] streetViewPanoramaLinkArr, @C4396e(mo18387id = 3) LatLng latLng, @C4396e(mo18387id = 4) String str) {
        this.links = streetViewPanoramaLinkArr;
        this.position = latLng;
        this.panoId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.panoId.equals(streetViewPanoramaLocation.panoId) && this.position.equals(streetViewPanoramaLocation.position);
    }

    public int hashCode() {
        return C4413y.m19051a(this.position, this.panoId);
    }

    public String toString() {
        return C4413y.m19052a((Object) this).mo18403a("panoId", this.panoId).mo18403a("position", this.position.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18993a(parcel, 2, (T[]) this.links, i, false);
        C4399a.m18969a(parcel, 3, (Parcelable) this.position, i, false);
        C4399a.m18979a(parcel, 4, this.panoId, false);
        C4399a.m18959a(parcel, a);
    }
}
