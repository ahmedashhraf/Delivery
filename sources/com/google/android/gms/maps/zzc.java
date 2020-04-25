package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap.OnMarkerDragListener;
import com.google.android.gms.maps.internal.zzau;
import com.google.android.gms.maps.model.Marker;
import p076c.p112d.p113a.p114a.p118d.p124f.C2643b0;

final class zzc extends zzau {
    private final /* synthetic */ OnMarkerDragListener zzk;

    zzc(GoogleMap googleMap, OnMarkerDragListener onMarkerDragListener) {
        this.zzk = onMarkerDragListener;
    }

    public final void zzb(C2643b0 b0Var) {
        this.zzk.onMarkerDragStart(new Marker(b0Var));
    }

    public final void zzc(C2643b0 b0Var) {
        this.zzk.onMarkerDragEnd(new Marker(b0Var));
    }

    public final void zzd(C2643b0 b0Var) {
        this.zzk.onMarkerDrag(new Marker(b0Var));
    }
}
