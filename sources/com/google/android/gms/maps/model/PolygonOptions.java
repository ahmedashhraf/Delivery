package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import androidx.core.p034l.C0962e0;
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

@C4392a(creator = "PolygonOptionsCreator")
@C4397f({1})
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Creator<PolygonOptions> CREATOR = new zzk();
    @C4394c(getter = "getFillColor", mo18384id = 6)
    private int fillColor;
    @C4394c(getter = "getStrokeColor", mo18384id = 5)
    private int strokeColor;
    @C4394c(getter = "getStrokeWidth", mo18384id = 4)
    private float zzcq;
    @C4394c(getter = "getZIndex", mo18384id = 7)
    private float zzcr;
    @C4394c(getter = "isVisible", mo18384id = 8)
    private boolean zzcs;
    @C4394c(getter = "isClickable", mo18384id = 10)
    private boolean zzct;
    @C0195i0
    @C4394c(getter = "getStrokePattern", mo18384id = 12)
    private List<PatternItem> zzcu;
    @C4394c(getter = "getPoints", mo18384id = 2)
    private final List<LatLng> zzdw;
    @C4394c(getter = "getHolesForParcel", mo18384id = 3, type = "java.util.List")
    private final List<List<LatLng>> zzdx;
    @C4394c(getter = "isGeodesic", mo18384id = 9)
    private boolean zzdy;
    @C4394c(getter = "getStrokeJointType", mo18384id = 11)
    private int zzdz;

    public PolygonOptions() {
        this.zzcq = 10.0f;
        this.strokeColor = C0962e0.f4343t;
        this.fillColor = 0;
        this.zzcr = 0.0f;
        this.zzcs = true;
        this.zzdy = false;
        this.zzct = false;
        this.zzdz = 0;
        this.zzcu = null;
        this.zzdw = new ArrayList();
        this.zzdx = new ArrayList();
    }

    @C4393b
    PolygonOptions(@C4396e(mo18387id = 2) List<LatLng> list, @C4396e(mo18387id = 3) List list2, @C4396e(mo18387id = 4) float f, @C4396e(mo18387id = 5) int i, @C4396e(mo18387id = 6) int i2, @C4396e(mo18387id = 7) float f2, @C4396e(mo18387id = 8) boolean z, @C4396e(mo18387id = 9) boolean z2, @C4396e(mo18387id = 10) boolean z3, @C4396e(mo18387id = 11) int i3, @C4396e(mo18387id = 12) @C0195i0 List<PatternItem> list3) {
        this.zzcq = 10.0f;
        this.strokeColor = C0962e0.f4343t;
        this.fillColor = 0;
        this.zzcr = 0.0f;
        this.zzcs = true;
        this.zzdy = false;
        this.zzct = false;
        this.zzdz = 0;
        this.zzcu = null;
        this.zzdw = list;
        this.zzdx = list2;
        this.zzcq = f;
        this.strokeColor = i;
        this.fillColor = i2;
        this.zzcr = f2;
        this.zzcs = z;
        this.zzdy = z2;
        this.zzct = z3;
        this.zzdz = i3;
        this.zzcu = list3;
    }

    public final PolygonOptions add(LatLng latLng) {
        this.zzdw.add(latLng);
        return this;
    }

    public final PolygonOptions add(LatLng... latLngArr) {
        this.zzdw.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public final PolygonOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng add : iterable) {
            this.zzdw.add(add);
        }
        return this;
    }

    public final PolygonOptions addHole(Iterable<LatLng> iterable) {
        ArrayList arrayList = new ArrayList();
        for (LatLng add : iterable) {
            arrayList.add(add);
        }
        this.zzdx.add(arrayList);
        return this;
    }

    public final PolygonOptions clickable(boolean z) {
        this.zzct = z;
        return this;
    }

    public final PolygonOptions fillColor(int i) {
        this.fillColor = i;
        return this;
    }

    public final PolygonOptions geodesic(boolean z) {
        this.zzdy = z;
        return this;
    }

    public final int getFillColor() {
        return this.fillColor;
    }

    public final List<List<LatLng>> getHoles() {
        return this.zzdx;
    }

    public final List<LatLng> getPoints() {
        return this.zzdw;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final int getStrokeJointType() {
        return this.zzdz;
    }

    @C0195i0
    public final List<PatternItem> getStrokePattern() {
        return this.zzcu;
    }

    public final float getStrokeWidth() {
        return this.zzcq;
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

    public final PolygonOptions strokeColor(int i) {
        this.strokeColor = i;
        return this;
    }

    public final PolygonOptions strokeJointType(int i) {
        this.zzdz = i;
        return this;
    }

    public final PolygonOptions strokePattern(@C0195i0 List<PatternItem> list) {
        this.zzcu = list;
        return this;
    }

    public final PolygonOptions strokeWidth(float f) {
        this.zzcq = f;
        return this;
    }

    public final PolygonOptions visible(boolean z) {
        this.zzcs = z;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m19017j(parcel, 2, getPoints(), false);
        C4399a.m19012f(parcel, 3, (List) this.zzdx, false);
        C4399a.m18963a(parcel, 4, getStrokeWidth());
        C4399a.m18964a(parcel, 5, getStrokeColor());
        C4399a.m18964a(parcel, 6, getFillColor());
        C4399a.m18963a(parcel, 7, getZIndex());
        C4399a.m18984a(parcel, 8, isVisible());
        C4399a.m18984a(parcel, 9, isGeodesic());
        C4399a.m18984a(parcel, 10, isClickable());
        C4399a.m18964a(parcel, 11, getStrokeJointType());
        C4399a.m19017j(parcel, 12, getStrokePattern(), false);
        C4399a.m18959a(parcel, a);
    }

    public final PolygonOptions zIndex(float f) {
        this.zzcr = f;
        return this;
    }
}
