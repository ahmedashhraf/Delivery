package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4523f;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;

public final class Projection {
    private final IProjectionDelegate zzbm;

    Projection(IProjectionDelegate iProjectionDelegate) {
        this.zzbm = iProjectionDelegate;
    }

    public final LatLng fromScreenLocation(Point point) {
        try {
            return this.zzbm.fromScreenLocation(C4523f.m19511a(point));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final VisibleRegion getVisibleRegion() {
        try {
            return this.zzbm.getVisibleRegion();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Point toScreenLocation(LatLng latLng) {
        try {
            return (Point) C4523f.m19512d(this.zzbm.toScreenLocation(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
