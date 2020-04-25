package com.google.android.gms.maps;

import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4523f;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.internal.zzi;
import com.google.android.gms.maps.model.Marker;
import p076c.p112d.p113a.p114a.p118d.p124f.C2643b0;

final class zzg extends zzi {
    private final /* synthetic */ InfoWindowAdapter zzo;

    zzg(GoogleMap googleMap, InfoWindowAdapter infoWindowAdapter) {
        this.zzo = infoWindowAdapter;
    }

    public final C4519d zzh(C2643b0 b0Var) {
        return C4523f.m19511a(this.zzo.getInfoWindow(new Marker(b0Var)));
    }

    public final C4519d zzi(C2643b0 b0Var) {
        return C4523f.m19511a(this.zzo.getInfoContents(new Marker(b0Var)));
    }
}
