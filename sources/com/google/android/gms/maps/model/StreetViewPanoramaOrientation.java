package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "StreetViewPanoramaOrientationCreator")
@C4397f({1})
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Creator<StreetViewPanoramaOrientation> CREATOR = new zzp();
    @C4394c(mo18384id = 3)
    public final float bearing;
    @C4394c(mo18384id = 2)
    public final float tilt;

    public static final class Builder {
        public float bearing;
        public float tilt;

        public Builder() {
        }

        public Builder(@C0193h0 StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            C4300a0.m18621a(streetViewPanoramaOrientation, (Object) "StreetViewPanoramaOrientation");
            this.bearing = streetViewPanoramaOrientation.bearing;
            this.tilt = streetViewPanoramaOrientation.tilt;
        }

        public final Builder bearing(float f) {
            this.bearing = f;
            return this;
        }

        public final StreetViewPanoramaOrientation build() {
            return new StreetViewPanoramaOrientation(this.tilt, this.bearing);
        }

        public final Builder tilt(float f) {
            this.tilt = f;
            return this;
        }
    }

    @C4393b
    public StreetViewPanoramaOrientation(@C4396e(mo18387id = 2) float f, @C4396e(mo18387id = 3) float f2) {
        boolean z = -90.0f <= f && f <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f);
        C4300a0.m18628a(z, (Object) sb.toString());
        this.tilt = f + 0.0f;
        if (((double) f2) <= 0.0d) {
            f2 = (f2 % 360.0f) + 360.0f;
        }
        this.bearing = f2 % 360.0f;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(@C0193h0 StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        return new Builder(streetViewPanoramaOrientation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaOrientation.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaOrientation.bearing);
    }

    public int hashCode() {
        return C4413y.m19051a(Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public String toString() {
        return C4413y.m19052a((Object) this).mo18403a("tilt", Float.valueOf(this.tilt)).mo18403a("bearing", Float.valueOf(this.bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18963a(parcel, 2, this.tilt);
        C4399a.m18963a(parcel, 3, this.bearing);
        C4399a.m18959a(parcel, a);
    }
}
