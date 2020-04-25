package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import p076c.p112d.p113a.p114a.p118d.p124f.C2660m;

public interface zze extends IInterface {
    IMapViewDelegate zza(C4519d dVar, GoogleMapOptions googleMapOptions) throws RemoteException;

    IStreetViewPanoramaViewDelegate zza(C4519d dVar, StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException;

    void zza(C4519d dVar, int i) throws RemoteException;

    IMapFragmentDelegate zzc(C4519d dVar) throws RemoteException;

    ICameraUpdateFactoryDelegate zzd() throws RemoteException;

    IStreetViewPanoramaFragmentDelegate zzd(C4519d dVar) throws RemoteException;

    C2660m zze() throws RemoteException;
}
