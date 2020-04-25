package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4519d.C4520a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p076c.p112d.p113a.p114a.p118d.p124f.C2640a;
import p076c.p112d.p113a.p114a.p118d.p124f.C2658k;

public final class zzb extends C2640a implements ICameraUpdateFactoryDelegate {
    zzb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    public final C4519d newCameraPosition(CameraPosition cameraPosition) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) cameraPosition);
        Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
        C4519d a = C4520a.m19510a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final C4519d newLatLng(LatLng latLng) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) latLng);
        Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
        C4519d a = C4520a.m19510a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final C4519d newLatLngBounds(LatLngBounds latLngBounds, int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) latLngBounds);
        obtainAndWriteInterfaceToken.writeInt(i);
        Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
        C4519d a = C4520a.m19510a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final C4519d newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) latLngBounds);
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        obtainAndWriteInterfaceToken.writeInt(i3);
        Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
        C4519d a = C4520a.m19510a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final C4519d newLatLngZoom(LatLng latLng, float f) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) latLng);
        obtainAndWriteInterfaceToken.writeFloat(f);
        Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
        C4519d a = C4520a.m19510a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final C4519d scrollBy(float f, float f2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeFloat(f);
        obtainAndWriteInterfaceToken.writeFloat(f2);
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
        C4519d a = C4520a.m19510a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final C4519d zoomBy(float f) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeFloat(f);
        Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
        C4519d a = C4520a.m19510a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final C4519d zoomByWithFocus(float f, int i, int i2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeFloat(f);
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
        C4519d a = C4520a.m19510a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final C4519d zoomIn() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        C4519d a = C4520a.m19510a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final C4519d zoomOut() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        C4519d a = C4520a.m19510a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final C4519d zoomTo(float f) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeFloat(f);
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
        C4519d a = C4520a.m19510a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }
}
