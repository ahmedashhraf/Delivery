package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import com.google.android.gms.dynamic.C4519d.C4520a;

@C4392a(creator = "MarkerOptionsCreator")
@C4397f({1})
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Creator<MarkerOptions> CREATOR = new zzh();
    @C4394c(defaultValue = "1.0f", getter = "getAlpha", mo18384id = 14)
    private float alpha = 1.0f;
    @C4394c(getter = "getPosition", mo18384id = 2)
    private LatLng position;
    @C4394c(getter = "getZIndex", mo18384id = 15)
    private float zzcr;
    @C4394c(getter = "isVisible", mo18384id = 9)
    private boolean zzcs = true;
    @C4394c(getter = "getAnchorU", mo18384id = 6)
    private float zzda = 0.5f;
    @C4394c(getter = "getAnchorV", mo18384id = 7)
    private float zzdb = 1.0f;
    @C4394c(getter = "getTitle", mo18384id = 3)
    private String zzdm;
    @C4394c(getter = "getSnippet", mo18384id = 4)
    private String zzdn;
    @C4394c(getter = "getWrappedIconDescriptorImplBinder", mo18384id = 5, type = "android.os.IBinder")
    private BitmapDescriptor zzdo;
    @C4394c(getter = "isDraggable", mo18384id = 8)
    private boolean zzdp;
    @C4394c(getter = "isFlat", mo18384id = 10)
    private boolean zzdq = false;
    @C4394c(getter = "getRotation", mo18384id = 11)
    private float zzdr = 0.0f;
    @C4394c(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", mo18384id = 12)
    private float zzds = 0.5f;
    @C4394c(getter = "getInfoWindowAnchorV", mo18384id = 13)
    private float zzdt = 0.0f;

    public MarkerOptions() {
    }

    @C4393b
    MarkerOptions(@C4396e(mo18387id = 2) LatLng latLng, @C4396e(mo18387id = 3) String str, @C4396e(mo18387id = 4) String str2, @C4396e(mo18387id = 5) IBinder iBinder, @C4396e(mo18387id = 6) float f, @C4396e(mo18387id = 7) float f2, @C4396e(mo18387id = 8) boolean z, @C4396e(mo18387id = 9) boolean z2, @C4396e(mo18387id = 10) boolean z3, @C4396e(mo18387id = 11) float f3, @C4396e(mo18387id = 12) float f4, @C4396e(mo18387id = 13) float f5, @C4396e(mo18387id = 14) float f6, @C4396e(mo18387id = 15) float f7) {
        this.position = latLng;
        this.zzdm = str;
        this.zzdn = str2;
        this.zzdo = iBinder == null ? null : new BitmapDescriptor(C4520a.m19510a(iBinder));
        this.zzda = f;
        this.zzdb = f2;
        this.zzdp = z;
        this.zzcs = z2;
        this.zzdq = z3;
        this.zzdr = f3;
        this.zzds = f4;
        this.zzdt = f5;
        this.alpha = f6;
        this.zzcr = f7;
    }

    public final MarkerOptions alpha(float f) {
        this.alpha = f;
        return this;
    }

    public final MarkerOptions anchor(float f, float f2) {
        this.zzda = f;
        this.zzdb = f2;
        return this;
    }

    public final MarkerOptions draggable(boolean z) {
        this.zzdp = z;
        return this;
    }

    public final MarkerOptions flat(boolean z) {
        this.zzdq = z;
        return this;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final float getAnchorU() {
        return this.zzda;
    }

    public final float getAnchorV() {
        return this.zzdb;
    }

    public final BitmapDescriptor getIcon() {
        return this.zzdo;
    }

    public final float getInfoWindowAnchorU() {
        return this.zzds;
    }

    public final float getInfoWindowAnchorV() {
        return this.zzdt;
    }

    public final LatLng getPosition() {
        return this.position;
    }

    public final float getRotation() {
        return this.zzdr;
    }

    public final String getSnippet() {
        return this.zzdn;
    }

    public final String getTitle() {
        return this.zzdm;
    }

    public final float getZIndex() {
        return this.zzcr;
    }

    public final MarkerOptions icon(@C0195i0 BitmapDescriptor bitmapDescriptor) {
        this.zzdo = bitmapDescriptor;
        return this;
    }

    public final MarkerOptions infoWindowAnchor(float f, float f2) {
        this.zzds = f;
        this.zzdt = f2;
        return this;
    }

    public final boolean isDraggable() {
        return this.zzdp;
    }

    public final boolean isFlat() {
        return this.zzdq;
    }

    public final boolean isVisible() {
        return this.zzcs;
    }

    public final MarkerOptions position(@C0193h0 LatLng latLng) {
        if (latLng != null) {
            this.position = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public final MarkerOptions rotation(float f) {
        this.zzdr = f;
        return this;
    }

    public final MarkerOptions snippet(@C0195i0 String str) {
        this.zzdn = str;
        return this;
    }

    public final MarkerOptions title(@C0195i0 String str) {
        this.zzdm = str;
        return this;
    }

    public final MarkerOptions visible(boolean z) {
        this.zzcs = z;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18969a(parcel, 2, (Parcelable) getPosition(), i, false);
        C4399a.m18979a(parcel, 3, getTitle(), false);
        C4399a.m18979a(parcel, 4, getSnippet(), false);
        BitmapDescriptor bitmapDescriptor = this.zzdo;
        C4399a.m18967a(parcel, 5, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        C4399a.m18963a(parcel, 6, getAnchorU());
        C4399a.m18963a(parcel, 7, getAnchorV());
        C4399a.m18984a(parcel, 8, isDraggable());
        C4399a.m18984a(parcel, 9, isVisible());
        C4399a.m18984a(parcel, 10, isFlat());
        C4399a.m18963a(parcel, 11, getRotation());
        C4399a.m18963a(parcel, 12, getInfoWindowAnchorU());
        C4399a.m18963a(parcel, 13, getInfoWindowAnchorV());
        C4399a.m18963a(parcel, 14, getAlpha());
        C4399a.m18963a(parcel, 15, getZIndex());
        C4399a.m18959a(parcel, a);
    }

    public final MarkerOptions zIndex(float f) {
        this.zzcr = f;
        return this;
    }
}
