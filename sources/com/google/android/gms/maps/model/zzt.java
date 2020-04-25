package com.google.android.gms.maps.model;

import p076c.p112d.p113a.p114a.p118d.p124f.C2654h;

final class zzt extends C2654h {
    private final /* synthetic */ TileProvider zzem;

    zzt(TileOverlayOptions tileOverlayOptions, TileProvider tileProvider) {
        this.zzem = tileProvider;
    }

    public final Tile getTile(int i, int i2, int i3) {
        return this.zzem.getTile(i, i2, i3);
    }
}
