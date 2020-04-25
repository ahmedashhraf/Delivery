package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.internal.zzas;
import com.google.android.gms.maps.model.Marker;
import p076c.p112d.p113a.p114a.p118d.p124f.C2643b0;

final class zzb extends zzas {
    private final /* synthetic */ OnMarkerClickListener zzj;

    zzb(GoogleMap googleMap, OnMarkerClickListener onMarkerClickListener) {
        this.zzj = onMarkerClickListener;
    }

    public final boolean zza(C2643b0 b0Var) {
        return this.zzj.onMarkerClick(new Marker(b0Var));
    }
}
