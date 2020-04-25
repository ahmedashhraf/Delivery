package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

@C4392a(creator = "StreetViewPanoramaOptionsCreator")
@C4397f({1})
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<StreetViewPanoramaOptions> CREATOR = new zzai();
    @C4394c(getter = "getPanoramaId", mo18384id = 3)
    private String panoId;
    @C4394c(getter = "getPosition", mo18384id = 4)
    private LatLng position;
    @C4394c(getter = "getUseViewLifecycleInFragmentForParcel", mo18384id = 10, type = "byte")
    private Boolean zzak;
    @C4394c(getter = "getZoomGesturesEnabledForParcel", mo18384id = 7, type = "byte")
    private Boolean zzap;
    @C4394c(getter = "getStreetViewPanoramaCamera", mo18384id = 2)
    private StreetViewPanoramaCamera zzbw;
    @C4394c(getter = "getRadius", mo18384id = 5)
    private Integer zzbx;
    @C4394c(getter = "getUserNavigationEnabledForParcel", mo18384id = 6, type = "byte")
    private Boolean zzby;
    @C4394c(getter = "getPanningGesturesEnabledForParcel", mo18384id = 8, type = "byte")
    private Boolean zzbz;
    @C4394c(getter = "getStreetNamesEnabledForParcel", mo18384id = 9, type = "byte")
    private Boolean zzca;
    @C4394c(getter = "getSource", mo18384id = 11)
    private StreetViewSource zzcb = StreetViewSource.DEFAULT;

    public StreetViewPanoramaOptions() {
        Boolean valueOf = Boolean.valueOf(true);
        this.zzby = valueOf;
        this.zzap = valueOf;
        this.zzbz = valueOf;
        this.zzca = valueOf;
    }

    @C4393b
    StreetViewPanoramaOptions(@C4396e(mo18387id = 2) StreetViewPanoramaCamera streetViewPanoramaCamera, @C4396e(mo18387id = 3) String str, @C4396e(mo18387id = 4) LatLng latLng, @C4396e(mo18387id = 5) Integer num, @C4396e(mo18387id = 6) byte b, @C4396e(mo18387id = 7) byte b2, @C4396e(mo18387id = 8) byte b3, @C4396e(mo18387id = 9) byte b4, @C4396e(mo18387id = 10) byte b5, @C4396e(mo18387id = 11) StreetViewSource streetViewSource) {
        Boolean valueOf = Boolean.valueOf(true);
        this.zzby = valueOf;
        this.zzap = valueOf;
        this.zzbz = valueOf;
        this.zzca = valueOf;
        this.zzbw = streetViewPanoramaCamera;
        this.position = latLng;
        this.zzbx = num;
        this.panoId = str;
        this.zzby = zza.zza(b);
        this.zzap = zza.zza(b2);
        this.zzbz = zza.zza(b3);
        this.zzca = zza.zza(b4);
        this.zzak = zza.zza(b5);
        this.zzcb = streetViewSource;
    }

    public final Boolean getPanningGesturesEnabled() {
        return this.zzbz;
    }

    public final String getPanoramaId() {
        return this.panoId;
    }

    public final LatLng getPosition() {
        return this.position;
    }

    public final Integer getRadius() {
        return this.zzbx;
    }

    public final StreetViewSource getSource() {
        return this.zzcb;
    }

    public final Boolean getStreetNamesEnabled() {
        return this.zzca;
    }

    public final StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.zzbw;
    }

    public final Boolean getUseViewLifecycleInFragment() {
        return this.zzak;
    }

    public final Boolean getUserNavigationEnabled() {
        return this.zzby;
    }

    public final Boolean getZoomGesturesEnabled() {
        return this.zzap;
    }

    public final StreetViewPanoramaOptions panningGesturesEnabled(boolean z) {
        this.zzbz = Boolean.valueOf(z);
        return this;
    }

    public final StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.zzbw = streetViewPanoramaCamera;
        return this;
    }

    public final StreetViewPanoramaOptions panoramaId(String str) {
        this.panoId = str;
        return this;
    }

    public final StreetViewPanoramaOptions position(LatLng latLng) {
        this.position = latLng;
        return this;
    }

    public final StreetViewPanoramaOptions position(LatLng latLng, StreetViewSource streetViewSource) {
        this.position = latLng;
        this.zzcb = streetViewSource;
        return this;
    }

    public final StreetViewPanoramaOptions position(LatLng latLng, Integer num) {
        this.position = latLng;
        this.zzbx = num;
        return this;
    }

    public final StreetViewPanoramaOptions position(LatLng latLng, Integer num, StreetViewSource streetViewSource) {
        this.position = latLng;
        this.zzbx = num;
        this.zzcb = streetViewSource;
        return this;
    }

    public final StreetViewPanoramaOptions streetNamesEnabled(boolean z) {
        this.zzca = Boolean.valueOf(z);
        return this;
    }

    public final String toString() {
        return C4413y.m19052a((Object) this).mo18403a("PanoramaId", this.panoId).mo18403a("Position", this.position).mo18403a("Radius", this.zzbx).mo18403a("Source", this.zzcb).mo18403a("StreetViewPanoramaCamera", this.zzbw).mo18403a("UserNavigationEnabled", this.zzby).mo18403a("ZoomGesturesEnabled", this.zzap).mo18403a("PanningGesturesEnabled", this.zzbz).mo18403a("StreetNamesEnabled", this.zzca).mo18403a("UseViewLifecycleInFragment", this.zzak).toString();
    }

    public final StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z) {
        this.zzak = Boolean.valueOf(z);
        return this;
    }

    public final StreetViewPanoramaOptions userNavigationEnabled(boolean z) {
        this.zzby = Boolean.valueOf(z);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18969a(parcel, 2, (Parcelable) getStreetViewPanoramaCamera(), i, false);
        C4399a.m18979a(parcel, 3, getPanoramaId(), false);
        C4399a.m18969a(parcel, 4, (Parcelable) getPosition(), i, false);
        C4399a.m18977a(parcel, 5, getRadius(), false);
        C4399a.m18960a(parcel, 6, zza.zza(this.zzby));
        C4399a.m18960a(parcel, 7, zza.zza(this.zzap));
        C4399a.m18960a(parcel, 8, zza.zza(this.zzbz));
        C4399a.m18960a(parcel, 9, zza.zza(this.zzca));
        C4399a.m18960a(parcel, 10, zza.zza(this.zzak));
        C4399a.m18969a(parcel, 11, (Parcelable) getSource(), i, false);
        C4399a.m18959a(parcel, a);
    }

    public final StreetViewPanoramaOptions zoomGesturesEnabled(boolean z) {
        this.zzap = Boolean.valueOf(z);
        return this;
    }
}
