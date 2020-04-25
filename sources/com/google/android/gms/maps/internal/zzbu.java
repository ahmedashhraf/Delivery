package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4519d.C4520a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;
import p076c.p112d.p113a.p114a.p118d.p124f.C2640a;
import p076c.p112d.p113a.p114a.p118d.p124f.C2658k;

public final class zzbu extends C2640a implements IStreetViewPanoramaDelegate {
    zzbu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    }

    public final void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) streetViewPanoramaCamera);
        obtainAndWriteInterfaceToken.writeLong(j);
        transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
    }

    public final void enablePanning(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    public final void enableStreetNames(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }

    public final void enableUserNavigation(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    public final void enableZoom(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    public final StreetViewPanoramaCamera getPanoramaCamera() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) C2658k.m12913a(transactAndReadException, StreetViewPanoramaCamera.CREATOR);
        transactAndReadException.recycle();
        return streetViewPanoramaCamera;
    }

    public final StreetViewPanoramaLocation getStreetViewPanoramaLocation() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) C2658k.m12913a(transactAndReadException, StreetViewPanoramaLocation.CREATOR);
        transactAndReadException.recycle();
        return streetViewPanoramaLocation;
    }

    public final boolean isPanningGesturesEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final boolean isStreetNamesEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final boolean isUserNavigationEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final boolean isZoomGesturesEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final C4519d orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) streetViewPanoramaOrientation);
        Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken);
        C4519d a = C4520a.m19510a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final StreetViewPanoramaOrientation pointToOrientation(C4519d dVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) dVar);
        Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken);
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) C2658k.m12913a(transactAndReadException, StreetViewPanoramaOrientation.CREATOR);
        transactAndReadException.recycle();
        return streetViewPanoramaOrientation;
    }

    public final void setOnStreetViewPanoramaCameraChangeListener(zzbh zzbh) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzbh);
        transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
    }

    public final void setOnStreetViewPanoramaChangeListener(zzbj zzbj) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzbj);
        transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
    }

    public final void setOnStreetViewPanoramaClickListener(zzbl zzbl) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzbl);
        transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
    }

    public final void setOnStreetViewPanoramaLongClickListener(zzbn zzbn) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzbn);
        transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
    }

    public final void setPosition(LatLng latLng) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) latLng);
        transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
    }

    public final void setPositionWithID(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
    }

    public final void setPositionWithRadius(LatLng latLng, int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) latLng);
        obtainAndWriteInterfaceToken.writeInt(i);
        transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
    }

    public final void setPositionWithRadiusAndSource(LatLng latLng, int i, StreetViewSource streetViewSource) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) latLng);
        obtainAndWriteInterfaceToken.writeInt(i);
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) streetViewSource);
        transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
    }

    public final void setPositionWithSource(LatLng latLng, StreetViewSource streetViewSource) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) latLng);
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) streetViewSource);
        transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
    }
}
