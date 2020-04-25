package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
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
import java.util.List;

@C4392a(creator = "CircleOptionsCreator")
@C4397f({1})
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Creator<CircleOptions> CREATOR = new zzc();
    @C4394c(getter = "getFillColor", mo18384id = 6)
    private int fillColor = 0;
    @C4394c(getter = "getStrokeColor", mo18384id = 5)
    private int strokeColor = C0962e0.f4343t;
    @C4394c(getter = "getCenter", mo18384id = 2)
    private LatLng zzco = null;
    @C4394c(getter = "getRadius", mo18384id = 3)
    private double zzcp = 0.0d;
    @C4394c(getter = "getStrokeWidth", mo18384id = 4)
    private float zzcq = 10.0f;
    @C4394c(getter = "getZIndex", mo18384id = 7)
    private float zzcr = 0.0f;
    @C4394c(getter = "isVisible", mo18384id = 8)
    private boolean zzcs = true;
    @C4394c(getter = "isClickable", mo18384id = 9)
    private boolean zzct = false;
    @C0195i0
    @C4394c(getter = "getStrokePattern", mo18384id = 10)
    private List<PatternItem> zzcu = null;

    public CircleOptions() {
    }

    @C4393b
    CircleOptions(@C4396e(mo18387id = 2) LatLng latLng, @C4396e(mo18387id = 3) double d, @C4396e(mo18387id = 4) float f, @C4396e(mo18387id = 5) int i, @C4396e(mo18387id = 6) int i2, @C4396e(mo18387id = 7) float f2, @C4396e(mo18387id = 8) boolean z, @C4396e(mo18387id = 9) boolean z2, @C4396e(mo18387id = 10) @C0195i0 List<PatternItem> list) {
        this.zzco = latLng;
        this.zzcp = d;
        this.zzcq = f;
        this.strokeColor = i;
        this.fillColor = i2;
        this.zzcr = f2;
        this.zzcs = z;
        this.zzct = z2;
        this.zzcu = list;
    }

    public final CircleOptions center(LatLng latLng) {
        this.zzco = latLng;
        return this;
    }

    public final CircleOptions clickable(boolean z) {
        this.zzct = z;
        return this;
    }

    public final CircleOptions fillColor(int i) {
        this.fillColor = i;
        return this;
    }

    public final LatLng getCenter() {
        return this.zzco;
    }

    public final int getFillColor() {
        return this.fillColor;
    }

    public final double getRadius() {
        return this.zzcp;
    }

    public final int getStrokeColor() {
        return this.strokeColor;
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

    public final boolean isVisible() {
        return this.zzcs;
    }

    public final CircleOptions radius(double d) {
        this.zzcp = d;
        return this;
    }

    public final CircleOptions strokeColor(int i) {
        this.strokeColor = i;
        return this;
    }

    public final CircleOptions strokePattern(@C0195i0 List<PatternItem> list) {
        this.zzcu = list;
        return this;
    }

    public final CircleOptions strokeWidth(float f) {
        this.zzcq = f;
        return this;
    }

    public final CircleOptions visible(boolean z) {
        this.zzcs = z;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18969a(parcel, 2, (Parcelable) getCenter(), i, false);
        C4399a.m18962a(parcel, 3, getRadius());
        C4399a.m18963a(parcel, 4, getStrokeWidth());
        C4399a.m18964a(parcel, 5, getStrokeColor());
        C4399a.m18964a(parcel, 6, getFillColor());
        C4399a.m18963a(parcel, 7, getZIndex());
        C4399a.m18984a(parcel, 8, isVisible());
        C4399a.m18984a(parcel, 9, isClickable());
        C4399a.m19017j(parcel, 10, getStrokePattern(), false);
        C4399a.m18959a(parcel, a);
    }

    public final CircleOptions zIndex(float f) {
        this.zzcr = f;
        return this;
    }
}
