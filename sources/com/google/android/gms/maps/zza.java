package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener;
import com.google.android.gms.maps.internal.zzaa;
import com.google.android.gms.maps.model.IndoorBuilding;
import p076c.p112d.p113a.p114a.p118d.p124f.C2669v;

final class zza extends zzaa {
    private final /* synthetic */ OnIndoorStateChangeListener zzi;

    zza(GoogleMap googleMap, OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.zzi = onIndoorStateChangeListener;
    }

    public final void onIndoorBuildingFocused() {
        this.zzi.onIndoorBuildingFocused();
    }

    public final void zza(C2669v vVar) {
        this.zzi.onIndoorLevelActivated(new IndoorBuilding(vVar));
    }
}
