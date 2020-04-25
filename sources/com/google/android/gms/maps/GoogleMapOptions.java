package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
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
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CameraPosition.Builder;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

@C4392a(creator = "GoogleMapOptionsCreator")
@C4397f({1})
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<GoogleMapOptions> CREATOR = new zzaa();
    @C4394c(getter = "getMapType", mo18384id = 4)
    private int mapType = -1;
    @C4394c(defaultValue = "-1", getter = "getZOrderOnTopForParcel", mo18384id = 2, type = "byte")
    private Boolean zzaj;
    @C4394c(defaultValue = "-1", getter = "getUseViewLifecycleInFragmentForParcel", mo18384id = 3, type = "byte")
    private Boolean zzak;
    @C4394c(getter = "getCamera", mo18384id = 5)
    private CameraPosition zzal;
    @C4394c(defaultValue = "-1", getter = "getZoomControlsEnabledForParcel", mo18384id = 6, type = "byte")
    private Boolean zzam;
    @C4394c(defaultValue = "-1", getter = "getCompassEnabledForParcel", mo18384id = 7, type = "byte")
    private Boolean zzan;
    @C4394c(defaultValue = "-1", getter = "getScrollGesturesEnabledForParcel", mo18384id = 8, type = "byte")
    private Boolean zzao;
    @C4394c(defaultValue = "-1", getter = "getZoomGesturesEnabledForParcel", mo18384id = 9, type = "byte")
    private Boolean zzap;
    @C4394c(defaultValue = "-1", getter = "getTiltGesturesEnabledForParcel", mo18384id = 10, type = "byte")
    private Boolean zzaq;
    @C4394c(defaultValue = "-1", getter = "getRotateGesturesEnabledForParcel", mo18384id = 11, type = "byte")
    private Boolean zzar;
    @C4394c(defaultValue = "-1", getter = "getLiteModeForParcel", mo18384id = 12, type = "byte")
    private Boolean zzas;
    @C4394c(defaultValue = "-1", getter = "getMapToolbarEnabledForParcel", mo18384id = 14, type = "byte")
    private Boolean zzat;
    @C4394c(defaultValue = "-1", getter = "getAmbientEnabledForParcel", mo18384id = 15, type = "byte")
    private Boolean zzau;
    @C4394c(getter = "getMinZoomPreference", mo18384id = 16)
    private Float zzav = null;
    @C4394c(getter = "getMaxZoomPreference", mo18384id = 17)
    private Float zzaw = null;
    @C4394c(getter = "getLatLngBoundsForCameraTarget", mo18384id = 18)
    private LatLngBounds zzax = null;

    public GoogleMapOptions() {
    }

    @C4393b
    GoogleMapOptions(@C4396e(mo18387id = 2) byte b, @C4396e(mo18387id = 3) byte b2, @C4396e(mo18387id = 4) int i, @C4396e(mo18387id = 5) CameraPosition cameraPosition, @C4396e(mo18387id = 6) byte b3, @C4396e(mo18387id = 7) byte b4, @C4396e(mo18387id = 8) byte b5, @C4396e(mo18387id = 9) byte b6, @C4396e(mo18387id = 10) byte b7, @C4396e(mo18387id = 11) byte b8, @C4396e(mo18387id = 12) byte b9, @C4396e(mo18387id = 14) byte b10, @C4396e(mo18387id = 15) byte b11, @C4396e(mo18387id = 16) Float f, @C4396e(mo18387id = 17) Float f2, @C4396e(mo18387id = 18) LatLngBounds latLngBounds) {
        this.zzaj = zza.zza(b);
        this.zzak = zza.zza(b2);
        this.mapType = i;
        this.zzal = cameraPosition;
        this.zzam = zza.zza(b3);
        this.zzan = zza.zza(b4);
        this.zzao = zza.zza(b5);
        this.zzap = zza.zza(b6);
        this.zzaq = zza.zza(b7);
        this.zzar = zza.zza(b8);
        this.zzas = zza.zza(b9);
        this.zzat = zza.zza(b10);
        this.zzau = zza.zza(b11);
        this.zzav = f;
        this.zzaw = f2;
        this.zzax = latLngBounds;
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C5172R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_mapType)) {
            googleMapOptions.mapType(obtainAttributes.getInt(C5172R.styleable.MapAttrs_mapType, -1));
        }
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_zOrderOnTop)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(C5172R.styleable.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_useViewLifecycle)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(C5172R.styleable.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_uiCompass)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(C5172R.styleable.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_uiRotateGestures)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(C5172R.styleable.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_uiScrollGestures)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(C5172R.styleable.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_uiTiltGestures)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(C5172R.styleable.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_uiZoomGestures)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(C5172R.styleable.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_uiZoomControls)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(C5172R.styleable.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_liteMode)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(C5172R.styleable.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_uiMapToolbar)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(C5172R.styleable.MapAttrs_uiMapToolbar, true));
        }
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_ambientEnabled)) {
            googleMapOptions.ambientEnabled(obtainAttributes.getBoolean(C5172R.styleable.MapAttrs_ambientEnabled, false));
        }
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.minZoomPreference(obtainAttributes.getFloat(C5172R.styleable.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.maxZoomPreference(obtainAttributes.getFloat(C5172R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        googleMapOptions.latLngBoundsForCameraTarget(zza(context, attributeSet));
        googleMapOptions.camera(zzb(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    public static LatLngBounds zza(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C5172R.styleable.MapAttrs);
        Float valueOf = obtainAttributes.hasValue(C5172R.styleable.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(obtainAttributes.getFloat(C5172R.styleable.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        Float valueOf2 = obtainAttributes.hasValue(C5172R.styleable.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(obtainAttributes.getFloat(C5172R.styleable.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        Float valueOf3 = obtainAttributes.hasValue(C5172R.styleable.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(obtainAttributes.getFloat(C5172R.styleable.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        Float valueOf4 = obtainAttributes.hasValue(C5172R.styleable.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(obtainAttributes.getFloat(C5172R.styleable.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
    }

    public static CameraPosition zzb(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C5172R.styleable.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_cameraTargetLat) ? obtainAttributes.getFloat(C5172R.styleable.MapAttrs_cameraTargetLat, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_cameraTargetLng) ? obtainAttributes.getFloat(C5172R.styleable.MapAttrs_cameraTargetLng, 0.0f) : 0.0f));
        Builder builder = CameraPosition.builder();
        builder.target(latLng);
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_cameraZoom)) {
            builder.zoom(obtainAttributes.getFloat(C5172R.styleable.MapAttrs_cameraZoom, 0.0f));
        }
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_cameraBearing)) {
            builder.bearing(obtainAttributes.getFloat(C5172R.styleable.MapAttrs_cameraBearing, 0.0f));
        }
        if (obtainAttributes.hasValue(C5172R.styleable.MapAttrs_cameraTilt)) {
            builder.tilt(obtainAttributes.getFloat(C5172R.styleable.MapAttrs_cameraTilt, 0.0f));
        }
        obtainAttributes.recycle();
        return builder.build();
    }

    public final GoogleMapOptions ambientEnabled(boolean z) {
        this.zzau = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions camera(CameraPosition cameraPosition) {
        this.zzal = cameraPosition;
        return this;
    }

    public final GoogleMapOptions compassEnabled(boolean z) {
        this.zzan = Boolean.valueOf(z);
        return this;
    }

    public final Boolean getAmbientEnabled() {
        return this.zzau;
    }

    public final CameraPosition getCamera() {
        return this.zzal;
    }

    public final Boolean getCompassEnabled() {
        return this.zzan;
    }

    public final LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzax;
    }

    public final Boolean getLiteMode() {
        return this.zzas;
    }

    public final Boolean getMapToolbarEnabled() {
        return this.zzat;
    }

    public final int getMapType() {
        return this.mapType;
    }

    public final Float getMaxZoomPreference() {
        return this.zzaw;
    }

    public final Float getMinZoomPreference() {
        return this.zzav;
    }

    public final Boolean getRotateGesturesEnabled() {
        return this.zzar;
    }

    public final Boolean getScrollGesturesEnabled() {
        return this.zzao;
    }

    public final Boolean getTiltGesturesEnabled() {
        return this.zzaq;
    }

    public final Boolean getUseViewLifecycleInFragment() {
        return this.zzak;
    }

    public final Boolean getZOrderOnTop() {
        return this.zzaj;
    }

    public final Boolean getZoomControlsEnabled() {
        return this.zzam;
    }

    public final Boolean getZoomGesturesEnabled() {
        return this.zzap;
    }

    public final GoogleMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.zzax = latLngBounds;
        return this;
    }

    public final GoogleMapOptions liteMode(boolean z) {
        this.zzas = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions mapToolbarEnabled(boolean z) {
        this.zzat = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions mapType(int i) {
        this.mapType = i;
        return this;
    }

    public final GoogleMapOptions maxZoomPreference(float f) {
        this.zzaw = Float.valueOf(f);
        return this;
    }

    public final GoogleMapOptions minZoomPreference(float f) {
        this.zzav = Float.valueOf(f);
        return this;
    }

    public final GoogleMapOptions rotateGesturesEnabled(boolean z) {
        this.zzar = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions scrollGesturesEnabled(boolean z) {
        this.zzao = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions tiltGesturesEnabled(boolean z) {
        this.zzaq = Boolean.valueOf(z);
        return this;
    }

    public final String toString() {
        return C4413y.m19052a((Object) this).mo18403a("MapType", Integer.valueOf(this.mapType)).mo18403a("LiteMode", this.zzas).mo18403a("Camera", this.zzal).mo18403a("CompassEnabled", this.zzan).mo18403a("ZoomControlsEnabled", this.zzam).mo18403a("ScrollGesturesEnabled", this.zzao).mo18403a("ZoomGesturesEnabled", this.zzap).mo18403a("TiltGesturesEnabled", this.zzaq).mo18403a("RotateGesturesEnabled", this.zzar).mo18403a("MapToolbarEnabled", this.zzat).mo18403a("AmbientEnabled", this.zzau).mo18403a("MinZoomPreference", this.zzav).mo18403a("MaxZoomPreference", this.zzaw).mo18403a("LatLngBoundsForCameraTarget", this.zzax).mo18403a("ZOrderOnTop", this.zzaj).mo18403a("UseViewLifecycleInFragment", this.zzak).toString();
    }

    public final GoogleMapOptions useViewLifecycleInFragment(boolean z) {
        this.zzak = Boolean.valueOf(z);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18960a(parcel, 2, zza.zza(this.zzaj));
        C4399a.m18960a(parcel, 3, zza.zza(this.zzak));
        C4399a.m18964a(parcel, 4, getMapType());
        C4399a.m18969a(parcel, 5, (Parcelable) getCamera(), i, false);
        C4399a.m18960a(parcel, 6, zza.zza(this.zzam));
        C4399a.m18960a(parcel, 7, zza.zza(this.zzan));
        C4399a.m18960a(parcel, 8, zza.zza(this.zzao));
        C4399a.m18960a(parcel, 9, zza.zza(this.zzap));
        C4399a.m18960a(parcel, 10, zza.zza(this.zzaq));
        C4399a.m18960a(parcel, 11, zza.zza(this.zzar));
        C4399a.m18960a(parcel, 12, zza.zza(this.zzas));
        C4399a.m18960a(parcel, 14, zza.zza(this.zzat));
        C4399a.m18960a(parcel, 15, zza.zza(this.zzau));
        C4399a.m18976a(parcel, 16, getMinZoomPreference(), false);
        C4399a.m18976a(parcel, 17, getMaxZoomPreference(), false);
        C4399a.m18969a(parcel, 18, (Parcelable) getLatLngBoundsForCameraTarget(), i, false);
        C4399a.m18959a(parcel, a);
    }

    public final GoogleMapOptions zOrderOnTop(boolean z) {
        this.zzaj = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions zoomControlsEnabled(boolean z) {
        this.zzam = Boolean.valueOf(z);
        return this;
    }

    public final GoogleMapOptions zoomGesturesEnabled(boolean z) {
        this.zzap = Boolean.valueOf(z);
        return this;
    }
}
