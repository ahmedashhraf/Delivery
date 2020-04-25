package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap.OnCircleClickListener;
import com.google.android.gms.maps.internal.zzw;
import com.google.android.gms.maps.model.Circle;
import p076c.p112d.p113a.p114a.p118d.p124f.C2663p;

final class zzo extends zzw {
    private final /* synthetic */ OnCircleClickListener zzw;

    zzo(GoogleMap googleMap, OnCircleClickListener onCircleClickListener) {
        this.zzw = onCircleClickListener;
    }

    public final void zza(C2663p pVar) {
        this.zzw.onCircleClick(new Circle(pVar));
    }
}
