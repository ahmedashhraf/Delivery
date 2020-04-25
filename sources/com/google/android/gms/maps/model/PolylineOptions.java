package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.p034l.C0962e0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@C4392a(creator = "PolylineOptionsCreator")
@C4397f({1})
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Creator<PolylineOptions> CREATOR = new zzl();
    @C4394c(getter = "getColor", mo18384id = 4)
    private int color;
    @C4394c(getter = "getWidth", mo18384id = 3)
    private float width;
    @C4394c(getter = "getZIndex", mo18384id = 5)
    private float zzcr;
    @C4394c(getter = "isVisible", mo18384id = 6)
    private boolean zzcs;
    @C4394c(getter = "isClickable", mo18384id = 8)
    private boolean zzct;
    @C4394c(getter = "getPoints", mo18384id = 2)
    private final List<LatLng> zzdw;
    @C4394c(getter = "isGeodesic", mo18384id = 7)
    private boolean zzdy;
    @C0193h0
    @C4394c(getter = "getStartCap", mo18384id = 9)
    private Cap zzeb;
    @C0193h0
    @C4394c(getter = "getEndCap", mo18384id = 10)
    private Cap zzec;
    @C4394c(getter = "getJointType", mo18384id = 11)
    private int zzed;
    @C0195i0
    @C4394c(getter = "getPattern", mo18384id = 12)
    private List<PatternItem> zzee;

    public PolylineOptions() {
        this.width = 10.0f;
        this.color = C0962e0.f4343t;
        this.zzcr = 0.0f;
        this.zzcs = true;
        this.zzdy = false;
        this.zzct = false;
        this.zzeb = new ButtCap();
        this.zzec = new ButtCap();
        this.zzed = 0;
        this.zzee = null;
        this.zzdw = new ArrayList();
    }

    @C4393b
    PolylineOptions(@C4396e(mo18387id = 2) List list, @C4396e(mo18387id = 3) float f, @C4396e(mo18387id = 4) int i, @C4396e(mo18387id = 5) float f2, @C4396e(mo18387id = 6) boolean z, @C4396e(mo18387id = 7) boolean z2, @C4396e(mo18387id = 8) boolean z3, @C4396e(mo18387id = 9) @C0195i0 Cap cap, @C4396e(mo18387id = 10) @C0195i0 Cap cap2, @C4396e(mo18387id = 11) int i2, @C4396e(mo18387id = 12) @C0195i0 List<PatternItem> list2) {
        this.width = 10.0f;
        this.color = C0962e0.f4343t;
        this.zzcr = 0.0f;
        this.zzcs = true;
        this.zzdy = false;
        this.zzct = false;
        this.zzeb = new ButtCap();
        this.zzec = new ButtCap();
        this.zzed = 0;
        this.zzee = null;
        this.zzdw = list;
        this.width = f;
        this.color = i;
        this.zzcr = f2;
        this.zzcs = z;
        this.zzdy = z2;
        this.zzct = z3;
        if (cap != null) {
            this.zzeb = cap;
        }
        if (cap2 != null) {
            this.zzec = cap2;
        }
        this.zzed = i2;
        this.zzee = list2;
    }

    public final PolylineOptions add(LatLng latLng) {
        this.zzdw.add(latLng);
        return this;
    }

    public final PolylineOptions add(LatLng... latLngArr) {
        this.zzdw.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public final PolylineOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng add : iterable) {
            this.zzdw.add(add);
        }
        return this;
    }

    public final PolylineOptions clickable(boolean z) {
        this.zzct = z;
        return this;
    }

    public final PolylineOptions color(int i) {
        this.color = i;
        return this;
    }

    public final PolylineOptions endCap(@C0193h0 Cap cap) {
        this.zzec = (Cap) C4300a0.m18621a(cap, (Object) "endCap must not be null");
        return this;
    }

    public final PolylineOptions geodesic(boolean z) {
        this.zzdy = z;
        return this;
    }

    public final int getColor() {
        return this.color;
    }

    @C0193h0
    public final Cap getEndCap() {
        return this.zzec;
    }

    public final int getJointType() {
        return this.zzed;
    }

    @C0195i0
    public final List<PatternItem> getPattern() {
        return this.zzee;
    }

    public final List<LatLng> getPoints() {
        return this.zzdw;
    }

    @C0193h0
    public final Cap getStartCap() {
        return this.zzeb;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getZIndex() {
        return this.zzcr;
    }

    public final boolean isClickable() {
        return this.zzct;
    }

    public final boolean isGeodesic() {
        return this.zzdy;
    }

    public final boolean isVisible() {
        return this.zzcs;
    }

    public final PolylineOptions jointType(int i) {
        this.zzed = i;
        return this;
    }

    public final PolylineOptions pattern(@C0195i0 List<PatternItem> list) {
        this.zzee = list;
        return this;
    }

    public final PolylineOptions startCap(@C0193h0 Cap cap) {
        this.zzeb = (Cap) C4300a0.m18621a(cap, (Object) "startCap must not be null");
        return this;
    }

    public final PolylineOptions visible(boolean z) {
        this.zzcs = z;
        return this;
    }

    public final PolylineOptions width(float f) {
        this.width = f;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m19017j(parcel, 2, getPoints(), false);
        C4399a.m18963a(parcel, 3, getWidth());
        C4399a.m18964a(parcel, 4, getColor());
        C4399a.m18963a(parcel, 5, getZIndex());
        C4399a.m18984a(parcel, 6, isVisible());
        C4399a.m18984a(parcel, 7, isGeodesic());
        C4399a.m18984a(parcel, 8, isClickable());
        C4399a.m18969a(parcel, 9, (Parcelable) getStartCap(), i, false);
        C4399a.m18969a(parcel, 10, (Parcelable) getEndCap(), i, false);
        C4399a.m18964a(parcel, 11, getJointType());
        C4399a.m19017j(parcel, 12, getPattern(), false);
        C4399a.m18959a(parcel, a);
    }

    public final PolylineOptions zIndex(float f) {
        this.zzcr = f;
        return this;
    }
}
