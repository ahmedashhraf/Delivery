package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p076c.p112d.p113a.p114a.p118d.p124f.C2640a;
import p076c.p112d.p113a.p114a.p118d.p124f.C2658k;

public final class zzbx extends C2640a implements IUiSettingsDelegate {
    zzbx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    public final boolean isCompassEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final boolean isIndoorLevelPickerEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final boolean isMapToolbarEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final boolean isMyLocationButtonEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final boolean isRotateGesturesEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final boolean isScrollGesturesEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final boolean isTiltGesturesEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final boolean isZoomControlsEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final boolean isZoomGesturesEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final void setAllGesturesEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
    }

    public final void setCompassEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
    }

    public final void setIndoorLevelPickerEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
    }

    public final void setMapToolbarEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
    }

    public final void setMyLocationButtonEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    public final void setRotateGesturesEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
    }

    public final void setScrollGesturesEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }

    public final void setTiltGesturesEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }

    public final void setZoomControlsEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
    }

    public final void setZoomGesturesEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }
}
