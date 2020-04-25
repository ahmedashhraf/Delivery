package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public interface IProjectionDelegate extends IInterface {
    LatLng fromScreenLocation(C4519d dVar) throws RemoteException;

    VisibleRegion getVisibleRegion() throws RemoteException;

    C4519d toScreenLocation(LatLng latLng) throws RemoteException;
}
