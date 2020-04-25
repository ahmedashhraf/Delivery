package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import p076c.p112d.p113a.p114a.p118d.p124f.C2652g;
import p076c.p112d.p113a.p114a.p118d.p124f.C2654h;

@C4392a(creator = "TileOverlayOptionsCreator")
@C4397f({1})
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Creator<TileOverlayOptions> CREATOR = new zzu();
    @C4394c(getter = "getZIndex", mo18384id = 4)
    private float zzcr;
    @C4394c(getter = "isVisible", mo18384id = 3)
    private boolean zzcs = true;
    @C4394c(getter = "getTransparency", mo18384id = 6)
    private float zzcz = 0.0f;
    /* access modifiers changed from: private */
    @C4394c(getter = "getTileProviderDelegate", mo18384id = 2, type = "android.os.IBinder")
    public C2652g zzeh;
    private TileProvider zzei;
    @C4394c(defaultValue = "true", getter = "getFadeIn", mo18384id = 5)
    private boolean zzej = true;

    public TileOverlayOptions() {
    }

    @C4393b
    TileOverlayOptions(@C4396e(mo18387id = 2) IBinder iBinder, @C4396e(mo18387id = 3) boolean z, @C4396e(mo18387id = 4) float f, @C4396e(mo18387id = 5) boolean z2, @C4396e(mo18387id = 6) float f2) {
        this.zzeh = C2654h.zzk(iBinder);
        this.zzei = this.zzeh == null ? null : new zzs(this);
        this.zzcs = z;
        this.zzcr = f;
        this.zzej = z2;
        this.zzcz = f2;
    }

    public final TileOverlayOptions fadeIn(boolean z) {
        this.zzej = z;
        return this;
    }

    public final boolean getFadeIn() {
        return this.zzej;
    }

    public final TileProvider getTileProvider() {
        return this.zzei;
    }

    public final float getTransparency() {
        return this.zzcz;
    }

    public final float getZIndex() {
        return this.zzcr;
    }

    public final boolean isVisible() {
        return this.zzcs;
    }

    public final TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.zzei = tileProvider;
        this.zzeh = this.zzei == null ? null : new zzt(this, tileProvider);
        return this;
    }

    public final TileOverlayOptions transparency(float f) {
        C4300a0.m18628a(f >= 0.0f && f <= 1.0f, (Object) "Transparency must be in the range [0..1]");
        this.zzcz = f;
        return this;
    }

    public final TileOverlayOptions visible(boolean z) {
        this.zzcs = z;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18967a(parcel, 2, this.zzeh.asBinder(), false);
        C4399a.m18984a(parcel, 3, isVisible());
        C4399a.m18963a(parcel, 4, getZIndex());
        C4399a.m18984a(parcel, 5, getFadeIn());
        C4399a.m18963a(parcel, 6, getTransparency());
        C4399a.m18959a(parcel, a);
    }

    public final TileOverlayOptions zIndex(float f) {
        this.zzcr = f;
        return this;
    }
}
