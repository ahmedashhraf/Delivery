package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C4150k;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzal;

/* renamed from: com.google.android.gms.internal.location.o */
public interface C4653o extends IInterface {
    /* renamed from: a */
    Location mo18739a(String str) throws RemoteException;

    /* renamed from: a */
    void mo18740a(long j, boolean z, PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: a */
    void mo18741a(PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: a */
    void mo18742a(PendingIntent pendingIntent, C4150k kVar) throws RemoteException;

    /* renamed from: a */
    void mo18743a(C4643j jVar) throws RemoteException;

    /* renamed from: a */
    void mo18744a(zzbf zzbf) throws RemoteException;

    /* renamed from: a */
    void mo18745a(zzo zzo) throws RemoteException;

    /* renamed from: a */
    void mo18746a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, C4150k kVar) throws RemoteException;

    /* renamed from: a */
    void mo18747a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C4649m mVar) throws RemoteException;

    /* renamed from: a */
    void mo18748a(LocationSettingsRequest locationSettingsRequest, C4657q qVar, String str) throws RemoteException;

    /* renamed from: a */
    void mo18749a(zzal zzal, C4649m mVar) throws RemoteException;

    /* renamed from: b */
    LocationAvailability mo18750b(String str) throws RemoteException;

    /* renamed from: d */
    void mo18751d(boolean z) throws RemoteException;

    void zza(Location location) throws RemoteException;
}
