package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface ICameraUpdateFactoryDelegate extends IInterface {
    C4519d newCameraPosition(CameraPosition cameraPosition) throws RemoteException;

    C4519d newLatLng(LatLng latLng) throws RemoteException;

    C4519d newLatLngBounds(LatLngBounds latLngBounds, int i) throws RemoteException;

    C4519d newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException;

    C4519d newLatLngZoom(LatLng latLng, float f) throws RemoteException;

    C4519d scrollBy(float f, float f2) throws RemoteException;

    C4519d zoomBy(float f) throws RemoteException;

    C4519d zoomByWithFocus(float f, int i, int i2) throws RemoteException;

    C4519d zoomIn() throws RemoteException;

    C4519d zoomOut() throws RemoteException;

    C4519d zoomTo(float f) throws RemoteException;
}
