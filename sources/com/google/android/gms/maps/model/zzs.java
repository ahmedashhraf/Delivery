package com.google.android.gms.maps.model;

import android.os.RemoteException;
import p076c.p112d.p113a.p114a.p118d.p124f.C2652g;

final class zzs implements TileProvider {
    private final C2652g zzek = this.zzel.zzeh;
    private final /* synthetic */ TileOverlayOptions zzel;

    zzs(TileOverlayOptions tileOverlayOptions) {
        this.zzel = tileOverlayOptions;
    }

    public final Tile getTile(int i, int i2, int i3) {
        try {
            return this.zzek.getTile(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
