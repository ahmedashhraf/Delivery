package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.GroundOverlay;
import p076c.p112d.p113a.p114a.p118d.p124f.C2666s;

final class zzn extends zzy {
    private final /* synthetic */ OnGroundOverlayClickListener zzv;

    zzn(GoogleMap googleMap, OnGroundOverlayClickListener onGroundOverlayClickListener) {
        this.zzv = onGroundOverlayClickListener;
    }

    public final void zza(C2666s sVar) {
        this.zzv.onGroundOverlayClick(new GroundOverlay(sVar));
    }
}
