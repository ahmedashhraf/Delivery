package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "StreetViewPanoramaCameraCreator")
@C4397f({1})
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<StreetViewPanoramaCamera> CREATOR = new zzm();
    @C4394c(mo18384id = 4)
    public final float bearing;
    @C4394c(mo18384id = 3)
    public final float tilt;
    @C4394c(mo18384id = 2)
    public final float zoom;
    @C0193h0
    private final StreetViewPanoramaOrientation zzef;

    public static final class Builder {
        public float bearing;
        public float tilt;
        public float zoom;

        public Builder() {
        }

        public Builder(@C0193h0 StreetViewPanoramaCamera streetViewPanoramaCamera) {
            C4300a0.m18621a(streetViewPanoramaCamera, (Object) "StreetViewPanoramaCamera");
            this.zoom = streetViewPanoramaCamera.zoom;
            this.bearing = streetViewPanoramaCamera.bearing;
            this.tilt = streetViewPanoramaCamera.tilt;
        }

        public final Builder bearing(float f) {
            this.bearing = f;
            return this;
        }

        public final StreetViewPanoramaCamera build() {
            return new StreetViewPanoramaCamera(this.zoom, this.tilt, this.bearing);
        }

        public final Builder orientation(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            C4300a0.m18621a(streetViewPanoramaOrientation, (Object) "StreetViewPanoramaOrientation");
            this.tilt = streetViewPanoramaOrientation.tilt;
            this.bearing = streetViewPanoramaOrientation.bearing;
            return this;
        }

        public final Builder tilt(float f) {
            this.tilt = f;
            return this;
        }

        public final Builder zoom(float f) {
            this.zoom = f;
            return this;
        }
    }

    @C4393b
    public StreetViewPanoramaCamera(@C4396e(mo18387id = 2) float f, @C4396e(mo18387id = 3) float f2, @C4396e(mo18387id = 4) float f3) {
        boolean z = -90.0f <= f2 && f2 <= 90.0f;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        C4300a0.m18628a(z, (Object) sb.toString());
        if (((double) f) <= 0.0d) {
            f = 0.0f;
        }
        this.zoom = f;
        this.tilt = 0.0f + f2;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
        this.zzef = new com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder().tilt(f2).bearing(f3).build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(@C0193h0 StreetViewPanoramaCamera streetViewPanoramaCamera) {
        return new Builder(streetViewPanoramaCamera);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        return Float.floatToIntBits(this.zoom) == Float.floatToIntBits(streetViewPanoramaCamera.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaCamera.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaCamera.bearing);
    }

    @C0193h0
    public StreetViewPanoramaOrientation getOrientation() {
        return this.zzef;
    }

    public int hashCode() {
        return C4413y.m19051a(Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    public String toString() {
        return C4413y.m19052a((Object) this).mo18403a("zoom", Float.valueOf(this.zoom)).mo18403a("tilt", Float.valueOf(this.tilt)).mo18403a("bearing", Float.valueOf(this.bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18963a(parcel, 2, this.zoom);
        C4399a.m18963a(parcel, 3, this.tilt);
        C4399a.m18963a(parcel, 4, this.bearing);
        C4399a.m18959a(parcel, a);
    }
}
