package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.internal.zzac;
import com.google.android.gms.maps.model.Marker;
import p076c.p112d.p113a.p114a.p118d.p124f.C2643b0;

final class zzd extends zzac {
    private final /* synthetic */ OnInfoWindowClickListener zzl;

    zzd(GoogleMap googleMap, OnInfoWindowClickListener onInfoWindowClickListener) {
        this.zzl = onInfoWindowClickListener;
    }

    public final void zze(C2643b0 b0Var) {
        this.zzl.onInfoWindowClick(new Marker(b0Var));
    }
}
