package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import p076c.p112d.p113a.p114a.p118d.p124f.C2640a;
import p076c.p112d.p113a.p114a.p118d.p124f.C2642b;
import p076c.p112d.p113a.p114a.p118d.p124f.C2643b0;
import p076c.p112d.p113a.p114a.p118d.p124f.C2645c0;
import p076c.p112d.p113a.p114a.p118d.p124f.C2646d;
import p076c.p112d.p113a.p114a.p118d.p124f.C2648e;
import p076c.p112d.p113a.p114a.p118d.p124f.C2649e0;
import p076c.p112d.p113a.p114a.p118d.p124f.C2651f0;
import p076c.p112d.p113a.p114a.p118d.p124f.C2655h0;
import p076c.p112d.p113a.p114a.p118d.p124f.C2658k;
import p076c.p112d.p113a.p114a.p118d.p124f.C2663p;
import p076c.p112d.p113a.p114a.p118d.p124f.C2664q;
import p076c.p112d.p113a.p114a.p118d.p124f.C2666s;
import p076c.p112d.p113a.p114a.p118d.p124f.C2667t;
import p076c.p112d.p113a.p114a.p118d.p124f.C2669v;
import p076c.p112d.p113a.p114a.p118d.p124f.C2670w;

public final class zzg extends C2640a implements IGoogleMapDelegate {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    public final C2663p addCircle(CircleOptions circleOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) circleOptions);
        Parcel transactAndReadException = transactAndReadException(35, obtainAndWriteInterfaceToken);
        C2663p a = C2664q.m12955a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final C2666s addGroundOverlay(GroundOverlayOptions groundOverlayOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) groundOverlayOptions);
        Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken);
        C2666s a = C2667t.m12992a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final C2643b0 addMarker(MarkerOptions markerOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) markerOptions);
        Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
        C2643b0 a = C2645c0.m12799a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final C2649e0 addPolygon(PolygonOptions polygonOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) polygonOptions);
        Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
        C2649e0 a = C2651f0.m12866a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final C2655h0 addPolyline(PolylineOptions polylineOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) polylineOptions);
        Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
        C2655h0 a = C2642b.m12753a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final C2646d addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) tileOverlayOptions);
        Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken);
        C2646d a = C2648e.m12832a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final void animateCamera(C4519d dVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) dVar);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }

    public final void animateCameraWithCallback(C4519d dVar, zzc zzc) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) dVar);
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzc);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }

    public final void animateCameraWithDurationAndCallback(C4519d dVar, int i, zzc zzc) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) dVar);
        obtainAndWriteInterfaceToken.writeInt(i);
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzc);
        transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
    }

    public final void clear() throws RemoteException {
        transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken());
    }

    public final CameraPosition getCameraPosition() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        CameraPosition cameraPosition = (CameraPosition) C2658k.m12913a(transactAndReadException, CameraPosition.CREATOR);
        transactAndReadException.recycle();
        return cameraPosition;
    }

    public final C2669v getFocusedBuilding() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(44, obtainAndWriteInterfaceToken());
        C2669v a = C2670w.m13015a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    public final void getMapAsync(zzap zzap) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzap);
        transactAndReadExceptionReturnVoid(53, obtainAndWriteInterfaceToken);
    }

    public final int getMapType() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken());
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    public final float getMaxZoomLevel() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        float readFloat = transactAndReadException.readFloat();
        transactAndReadException.recycle();
        return readFloat;
    }

    public final float getMinZoomLevel() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
        float readFloat = transactAndReadException.readFloat();
        transactAndReadException.recycle();
        return readFloat;
    }

    public final Location getMyLocation() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(23, obtainAndWriteInterfaceToken());
        Location location = (Location) C2658k.m12913a(transactAndReadException, Location.CREATOR);
        transactAndReadException.recycle();
        return location;
    }

    public final IProjectionDelegate getProjection() throws RemoteException {
        IProjectionDelegate iProjectionDelegate;
        Parcel transactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            iProjectionDelegate = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            iProjectionDelegate = queryLocalInterface instanceof IProjectionDelegate ? (IProjectionDelegate) queryLocalInterface : new zzbr(readStrongBinder);
        }
        transactAndReadException.recycle();
        return iProjectionDelegate;
    }

    public final IUiSettingsDelegate getUiSettings() throws RemoteException {
        IUiSettingsDelegate iUiSettingsDelegate;
        Parcel transactAndReadException = transactAndReadException(25, obtainAndWriteInterfaceToken());
        IBinder readStrongBinder = transactAndReadException.readStrongBinder();
        if (readStrongBinder == null) {
            iUiSettingsDelegate = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            iUiSettingsDelegate = queryLocalInterface instanceof IUiSettingsDelegate ? (IUiSettingsDelegate) queryLocalInterface : new zzbx(readStrongBinder);
        }
        transactAndReadException.recycle();
        return iUiSettingsDelegate;
    }

    public final boolean isBuildingsEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(40, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final boolean isIndoorEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final boolean isMyLocationEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(21, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final boolean isTrafficEnabled() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final void moveCamera(C4519d dVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) dVar);
        transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
    }

    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        transactAndReadExceptionReturnVoid(54, obtainAndWriteInterfaceToken);
    }

    public final void onDestroy() throws RemoteException {
        transactAndReadExceptionReturnVoid(57, obtainAndWriteInterfaceToken());
    }

    public final void onEnterAmbient(Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        transactAndReadExceptionReturnVoid(81, obtainAndWriteInterfaceToken);
    }

    public final void onExitAmbient() throws RemoteException {
        transactAndReadExceptionReturnVoid(82, obtainAndWriteInterfaceToken());
    }

    public final void onLowMemory() throws RemoteException {
        transactAndReadExceptionReturnVoid(58, obtainAndWriteInterfaceToken());
    }

    public final void onPause() throws RemoteException {
        transactAndReadExceptionReturnVoid(56, obtainAndWriteInterfaceToken());
    }

    public final void onResume() throws RemoteException {
        transactAndReadExceptionReturnVoid(55, obtainAndWriteInterfaceToken());
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) bundle);
        Parcel transactAndReadException = transactAndReadException(60, obtainAndWriteInterfaceToken);
        if (transactAndReadException.readInt() != 0) {
            bundle.readFromParcel(transactAndReadException);
        }
        transactAndReadException.recycle();
    }

    public final void onStart() throws RemoteException {
        transactAndReadExceptionReturnVoid(101, obtainAndWriteInterfaceToken());
    }

    public final void onStop() throws RemoteException {
        transactAndReadExceptionReturnVoid(102, obtainAndWriteInterfaceToken());
    }

    public final void resetMinMaxZoomPreference() throws RemoteException {
        transactAndReadExceptionReturnVoid(94, obtainAndWriteInterfaceToken());
    }

    public final void setBuildingsEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(41, obtainAndWriteInterfaceToken);
    }

    public final void setContentDescription(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(61, obtainAndWriteInterfaceToken);
    }

    public final boolean setIndoorEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken);
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final void setInfoWindowAdapter(zzh zzh) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzh);
        transactAndReadExceptionReturnVoid(33, obtainAndWriteInterfaceToken);
    }

    public final void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) latLngBounds);
        transactAndReadExceptionReturnVoid(95, obtainAndWriteInterfaceToken);
    }

    public final void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) iLocationSourceDelegate);
        transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken);
    }

    public final boolean setMapStyle(MapStyleOptions mapStyleOptions) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) mapStyleOptions);
        Parcel transactAndReadException = transactAndReadException(91, obtainAndWriteInterfaceToken);
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final void setMapType(int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
    }

    public final void setMaxZoomPreference(float f) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeFloat(f);
        transactAndReadExceptionReturnVoid(93, obtainAndWriteInterfaceToken);
    }

    public final void setMinZoomPreference(float f) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeFloat(f);
        transactAndReadExceptionReturnVoid(92, obtainAndWriteInterfaceToken);
    }

    public final void setMyLocationEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
    }

    public final void setOnCameraChangeListener(zzl zzl) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzl);
        transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
    }

    public final void setOnCameraIdleListener(zzn zzn) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzn);
        transactAndReadExceptionReturnVoid(99, obtainAndWriteInterfaceToken);
    }

    public final void setOnCameraMoveCanceledListener(zzp zzp) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzp);
        transactAndReadExceptionReturnVoid(98, obtainAndWriteInterfaceToken);
    }

    public final void setOnCameraMoveListener(zzr zzr) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzr);
        transactAndReadExceptionReturnVoid(97, obtainAndWriteInterfaceToken);
    }

    public final void setOnCameraMoveStartedListener(zzt zzt) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzt);
        transactAndReadExceptionReturnVoid(96, obtainAndWriteInterfaceToken);
    }

    public final void setOnCircleClickListener(zzv zzv) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzv);
        transactAndReadExceptionReturnVoid(89, obtainAndWriteInterfaceToken);
    }

    public final void setOnGroundOverlayClickListener(zzx zzx) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzx);
        transactAndReadExceptionReturnVoid(83, obtainAndWriteInterfaceToken);
    }

    public final void setOnIndoorStateChangeListener(zzz zzz) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzz);
        transactAndReadExceptionReturnVoid(45, obtainAndWriteInterfaceToken);
    }

    public final void setOnInfoWindowClickListener(zzab zzab) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzab);
        transactAndReadExceptionReturnVoid(32, obtainAndWriteInterfaceToken);
    }

    public final void setOnInfoWindowCloseListener(zzad zzad) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzad);
        transactAndReadExceptionReturnVoid(86, obtainAndWriteInterfaceToken);
    }

    public final void setOnInfoWindowLongClickListener(zzaf zzaf) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzaf);
        transactAndReadExceptionReturnVoid(84, obtainAndWriteInterfaceToken);
    }

    public final void setOnMapClickListener(zzaj zzaj) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzaj);
        transactAndReadExceptionReturnVoid(28, obtainAndWriteInterfaceToken);
    }

    public final void setOnMapLoadedCallback(zzal zzal) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzal);
        transactAndReadExceptionReturnVoid(42, obtainAndWriteInterfaceToken);
    }

    public final void setOnMapLongClickListener(zzan zzan) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzan);
        transactAndReadExceptionReturnVoid(29, obtainAndWriteInterfaceToken);
    }

    public final void setOnMarkerClickListener(zzar zzar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzar);
        transactAndReadExceptionReturnVoid(30, obtainAndWriteInterfaceToken);
    }

    public final void setOnMarkerDragListener(zzat zzat) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzat);
        transactAndReadExceptionReturnVoid(31, obtainAndWriteInterfaceToken);
    }

    public final void setOnMyLocationButtonClickListener(zzav zzav) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzav);
        transactAndReadExceptionReturnVoid(37, obtainAndWriteInterfaceToken);
    }

    public final void setOnMyLocationChangeListener(zzax zzax) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzax);
        transactAndReadExceptionReturnVoid(36, obtainAndWriteInterfaceToken);
    }

    public final void setOnMyLocationClickListener(zzaz zzaz) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzaz);
        transactAndReadExceptionReturnVoid(107, obtainAndWriteInterfaceToken);
    }

    public final void setOnPoiClickListener(zzbb zzbb) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzbb);
        transactAndReadExceptionReturnVoid(80, obtainAndWriteInterfaceToken);
    }

    public final void setOnPolygonClickListener(zzbd zzbd) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzbd);
        transactAndReadExceptionReturnVoid(85, obtainAndWriteInterfaceToken);
    }

    public final void setOnPolylineClickListener(zzbf zzbf) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzbf);
        transactAndReadExceptionReturnVoid(87, obtainAndWriteInterfaceToken);
    }

    public final void setPadding(int i, int i2, int i3, int i4) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        obtainAndWriteInterfaceToken.writeInt(i3);
        obtainAndWriteInterfaceToken.writeInt(i4);
        transactAndReadExceptionReturnVoid(39, obtainAndWriteInterfaceToken);
    }

    public final void setTrafficEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
    }

    public final void setWatermarkEnabled(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(51, obtainAndWriteInterfaceToken);
    }

    public final void snapshot(zzbs zzbs, C4519d dVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzbs);
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) dVar);
        transactAndReadExceptionReturnVoid(38, obtainAndWriteInterfaceToken);
    }

    public final void snapshotForTest(zzbs zzbs) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) zzbs);
        transactAndReadExceptionReturnVoid(71, obtainAndWriteInterfaceToken);
    }

    public final void stopAnimation() throws RemoteException {
        transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken());
    }

    public final boolean useViewLifecycleWhenInFragment() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(59, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }
}
