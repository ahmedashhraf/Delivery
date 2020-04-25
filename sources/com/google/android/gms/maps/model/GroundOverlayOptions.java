package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import com.google.android.gms.dynamic.C4519d.C4520a;

@C4392a(creator = "GroundOverlayOptionsCreator")
@C4397f({1})
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Creator<GroundOverlayOptions> CREATOR = new zzd();
    public static final float NO_DIMENSION = -1.0f;
    @C4394c(getter = "getBearing", mo18384id = 7)
    private float bearing;
    @C4394c(getter = "getHeight", mo18384id = 5)
    private float height;
    @C4394c(getter = "getWidth", mo18384id = 4)
    private float width;
    @C4394c(getter = "getZIndex", mo18384id = 8)
    private float zzcr;
    @C4394c(getter = "isVisible", mo18384id = 9)
    private boolean zzcs = true;
    @C4394c(getter = "isClickable", mo18384id = 13)
    private boolean zzct = false;
    @C0193h0
    @C4394c(getter = "getWrappedImageDescriptorImplBinder", mo18384id = 2, type = "android.os.IBinder")
    private BitmapDescriptor zzcw;
    @C4394c(getter = "getLocation", mo18384id = 3)
    private LatLng zzcx;
    @C4394c(getter = "getBounds", mo18384id = 6)
    private LatLngBounds zzcy;
    @C4394c(getter = "getTransparency", mo18384id = 10)
    private float zzcz = 0.0f;
    @C4394c(getter = "getAnchorU", mo18384id = 11)
    private float zzda = 0.5f;
    @C4394c(getter = "getAnchorV", mo18384id = 12)
    private float zzdb = 0.5f;

    public GroundOverlayOptions() {
    }

    @C4393b
    GroundOverlayOptions(@C4396e(mo18387id = 2) IBinder iBinder, @C4396e(mo18387id = 3) LatLng latLng, @C4396e(mo18387id = 4) float f, @C4396e(mo18387id = 5) float f2, @C4396e(mo18387id = 6) LatLngBounds latLngBounds, @C4396e(mo18387id = 7) float f3, @C4396e(mo18387id = 8) float f4, @C4396e(mo18387id = 9) boolean z, @C4396e(mo18387id = 10) float f5, @C4396e(mo18387id = 11) float f6, @C4396e(mo18387id = 12) float f7, @C4396e(mo18387id = 13) boolean z2) {
        this.zzcw = new BitmapDescriptor(C4520a.m19510a(iBinder));
        this.zzcx = latLng;
        this.width = f;
        this.height = f2;
        this.zzcy = latLngBounds;
        this.bearing = f3;
        this.zzcr = f4;
        this.zzcs = z;
        this.zzcz = f5;
        this.zzda = f6;
        this.zzdb = f7;
        this.zzct = z2;
    }

    private final GroundOverlayOptions zza(LatLng latLng, float f, float f2) {
        this.zzcx = latLng;
        this.width = f;
        this.height = f2;
        return this;
    }

    public final GroundOverlayOptions anchor(float f, float f2) {
        this.zzda = f;
        this.zzdb = f2;
        return this;
    }

    public final GroundOverlayOptions bearing(float f) {
        this.bearing = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    public final GroundOverlayOptions clickable(boolean z) {
        this.zzct = z;
        return this;
    }

    public final float getAnchorU() {
        return this.zzda;
    }

    public final float getAnchorV() {
        return this.zzdb;
    }

    public final float getBearing() {
        return this.bearing;
    }

    public final LatLngBounds getBounds() {
        return this.zzcy;
    }

    public final float getHeight() {
        return this.height;
    }

    public final BitmapDescriptor getImage() {
        return this.zzcw;
    }

    public final LatLng getLocation() {
        return this.zzcx;
    }

    public final float getTransparency() {
        return this.zzcz;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getZIndex() {
        return this.zzcr;
    }

    public final GroundOverlayOptions image(@C0193h0 BitmapDescriptor bitmapDescriptor) {
        C4300a0.m18621a(bitmapDescriptor, (Object) "imageDescriptor must not be null");
        this.zzcw = bitmapDescriptor;
        return this;
    }

    public final boolean isClickable() {
        return this.zzct;
    }

    public final boolean isVisible() {
        return this.zzcs;
    }

    public final GroundOverlayOptions position(LatLng latLng, float f) {
        boolean z = true;
        C4300a0.m18632b(this.zzcy == null, "Position has already been set using positionFromBounds");
        C4300a0.m18628a(latLng != null, (Object) "Location must be specified");
        if (f < 0.0f) {
            z = false;
        }
        C4300a0.m18628a(z, (Object) "Width must be non-negative");
        return zza(latLng, f, -1.0f);
    }

    public final GroundOverlayOptions position(LatLng latLng, float f, float f2) {
        boolean z = true;
        C4300a0.m18632b(this.zzcy == null, "Position has already been set using positionFromBounds");
        C4300a0.m18628a(latLng != null, (Object) "Location must be specified");
        C4300a0.m18628a(f >= 0.0f, (Object) "Width must be non-negative");
        if (f2 < 0.0f) {
            z = false;
        }
        C4300a0.m18628a(z, (Object) "Height must be non-negative");
        return zza(latLng, f, f2);
    }

    public final GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        boolean z = this.zzcx == null;
        String valueOf = String.valueOf(this.zzcx);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("Position has already been set using position: ");
        sb.append(valueOf);
        C4300a0.m18632b(z, sb.toString());
        this.zzcy = latLngBounds;
        return this;
    }

    public final GroundOverlayOptions transparency(float f) {
        C4300a0.m18628a(f >= 0.0f && f <= 1.0f, (Object) "Transparency must be in the range [0..1]");
        this.zzcz = f;
        return this;
    }

    public final GroundOverlayOptions visible(boolean z) {
        this.zzcs = z;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18967a(parcel, 2, this.zzcw.zza().asBinder(), false);
        C4399a.m18969a(parcel, 3, (Parcelable) getLocation(), i, false);
        C4399a.m18963a(parcel, 4, getWidth());
        C4399a.m18963a(parcel, 5, getHeight());
        C4399a.m18969a(parcel, 6, (Parcelable) getBounds(), i, false);
        C4399a.m18963a(parcel, 7, getBearing());
        C4399a.m18963a(parcel, 8, getZIndex());
        C4399a.m18984a(parcel, 9, isVisible());
        C4399a.m18963a(parcel, 10, getTransparency());
        C4399a.m18963a(parcel, 11, getAnchorU());
        C4399a.m18963a(parcel, 12, getAnchorV());
        C4399a.m18984a(parcel, 13, isClickable());
        C4399a.m18959a(parcel, a);
    }

    public final GroundOverlayOptions zIndex(float f) {
        this.zzcr = f;
        return this;
    }
}
