package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap.OnPolygonClickListener;
import com.google.android.gms.maps.internal.zzbe;
import com.google.android.gms.maps.model.Polygon;
import p076c.p112d.p113a.p114a.p118d.p124f.C2649e0;

final class zzp extends zzbe {
    private final /* synthetic */ OnPolygonClickListener zzx;

    zzp(GoogleMap googleMap, OnPolygonClickListener onPolygonClickListener) {
        this.zzx = onPolygonClickListener;
    }

    public final void zza(C2649e0 e0Var) {
        this.zzx.onPolygonClick(new Polygon(e0Var));
    }
}
