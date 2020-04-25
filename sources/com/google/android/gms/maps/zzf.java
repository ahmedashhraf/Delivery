package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener;
import com.google.android.gms.maps.internal.zzae;
import com.google.android.gms.maps.model.Marker;
import p076c.p112d.p113a.p114a.p118d.p124f.C2643b0;

final class zzf extends zzae {
    private final /* synthetic */ OnInfoWindowCloseListener zzn;

    zzf(GoogleMap googleMap, OnInfoWindowCloseListener onInfoWindowCloseListener) {
        this.zzn = onInfoWindowCloseListener;
    }

    public final void zzg(C2643b0 b0Var) {
        this.zzn.onInfoWindowClose(new Marker(b0Var));
    }
}
