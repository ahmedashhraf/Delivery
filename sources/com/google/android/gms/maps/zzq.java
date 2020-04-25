package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap.OnPolylineClickListener;
import com.google.android.gms.maps.internal.zzbg;
import com.google.android.gms.maps.model.Polyline;
import p076c.p112d.p113a.p114a.p118d.p124f.C2655h0;

final class zzq extends zzbg {
    private final /* synthetic */ OnPolylineClickListener zzy;

    zzq(GoogleMap googleMap, OnPolylineClickListener onPolylineClickListener) {
        this.zzy = onPolylineClickListener;
    }

    public final void zza(C2655h0 h0Var) {
        this.zzy.onPolylineClick(new Polyline(h0Var));
    }
}
