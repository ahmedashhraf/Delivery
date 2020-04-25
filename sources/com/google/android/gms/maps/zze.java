package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener;
import com.google.android.gms.maps.internal.zzag;
import com.google.android.gms.maps.model.Marker;
import p076c.p112d.p113a.p114a.p118d.p124f.C2643b0;

final class zze extends zzag {
    private final /* synthetic */ OnInfoWindowLongClickListener zzm;

    zze(GoogleMap googleMap, OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        this.zzm = onInfoWindowLongClickListener;
    }

    public final void zzf(C2643b0 b0Var) {
        this.zzm.onInfoWindowLongClick(new Marker(b0Var));
    }
}
