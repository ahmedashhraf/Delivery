package com.google.android.gms.maps;

import android.location.Location;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4523f;
import com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener;
import com.google.android.gms.maps.internal.zzay;

final class zzh extends zzay {
    private final /* synthetic */ OnMyLocationChangeListener zzp;

    zzh(GoogleMap googleMap, OnMyLocationChangeListener onMyLocationChangeListener) {
        this.zzp = onMyLocationChangeListener;
    }

    public final void zza(C4519d dVar) {
        this.zzp.onMyLocationChange((Location) C4523f.m19512d(dVar));
    }
}
