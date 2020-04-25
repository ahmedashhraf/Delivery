package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C4150k;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzal;

/* renamed from: com.google.android.gms.internal.location.p */
public final class C4655p extends C4618a implements C4653o {
    C4655p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: a */
    public final Location mo18739a(String str) throws RemoteException {
        Parcel G0 = mo18707G0();
        G0.writeString(str);
        Parcel a = mo18708a(21, G0);
        Location location = (Location) C4648l0.m19779a(a, Location.CREATOR);
        a.recycle();
        return location;
    }

    /* renamed from: a */
    public final void mo18740a(long j, boolean z, PendingIntent pendingIntent) throws RemoteException {
        Parcel G0 = mo18707G0();
        G0.writeLong(j);
        C4648l0.m19782a(G0, true);
        C4648l0.m19781a(G0, (Parcelable) pendingIntent);
        mo18710b(5, G0);
    }

    /* renamed from: a */
    public final void mo18741a(PendingIntent pendingIntent) throws RemoteException {
        Parcel G0 = mo18707G0();
        C4648l0.m19781a(G0, (Parcelable) pendingIntent);
        mo18710b(6, G0);
    }

    /* renamed from: a */
    public final void mo18742a(PendingIntent pendingIntent, C4150k kVar) throws RemoteException {
        Parcel G0 = mo18707G0();
        C4648l0.m19781a(G0, (Parcelable) pendingIntent);
        C4648l0.m19780a(G0, (IInterface) kVar);
        mo18710b(73, G0);
    }

    /* renamed from: a */
    public final void mo18743a(C4643j jVar) throws RemoteException {
        Parcel G0 = mo18707G0();
        C4648l0.m19780a(G0, (IInterface) jVar);
        mo18710b(67, G0);
    }

    /* renamed from: a */
    public final void mo18744a(zzbf zzbf) throws RemoteException {
        Parcel G0 = mo18707G0();
        C4648l0.m19781a(G0, (Parcelable) zzbf);
        mo18710b(59, G0);
    }

    /* renamed from: a */
    public final void mo18745a(zzo zzo) throws RemoteException {
        Parcel G0 = mo18707G0();
        C4648l0.m19781a(G0, (Parcelable) zzo);
        mo18710b(75, G0);
    }

    /* renamed from: a */
    public final void mo18746a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, C4150k kVar) throws RemoteException {
        Parcel G0 = mo18707G0();
        C4648l0.m19781a(G0, (Parcelable) activityTransitionRequest);
        C4648l0.m19781a(G0, (Parcelable) pendingIntent);
        C4648l0.m19780a(G0, (IInterface) kVar);
        mo18710b(72, G0);
    }

    /* renamed from: a */
    public final void mo18747a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C4649m mVar) throws RemoteException {
        Parcel G0 = mo18707G0();
        C4648l0.m19781a(G0, (Parcelable) geofencingRequest);
        C4648l0.m19781a(G0, (Parcelable) pendingIntent);
        C4648l0.m19780a(G0, (IInterface) mVar);
        mo18710b(57, G0);
    }

    /* renamed from: a */
    public final void mo18748a(LocationSettingsRequest locationSettingsRequest, C4657q qVar, String str) throws RemoteException {
        Parcel G0 = mo18707G0();
        C4648l0.m19781a(G0, (Parcelable) locationSettingsRequest);
        C4648l0.m19780a(G0, (IInterface) qVar);
        G0.writeString(str);
        mo18710b(63, G0);
    }

    /* renamed from: a */
    public final void mo18749a(zzal zzal, C4649m mVar) throws RemoteException {
        Parcel G0 = mo18707G0();
        C4648l0.m19781a(G0, (Parcelable) zzal);
        C4648l0.m19780a(G0, (IInterface) mVar);
        mo18710b(74, G0);
    }

    /* renamed from: b */
    public final LocationAvailability mo18750b(String str) throws RemoteException {
        Parcel G0 = mo18707G0();
        G0.writeString(str);
        Parcel a = mo18708a(34, G0);
        LocationAvailability locationAvailability = (LocationAvailability) C4648l0.m19779a(a, LocationAvailability.CREATOR);
        a.recycle();
        return locationAvailability;
    }

    /* renamed from: d */
    public final void mo18751d(boolean z) throws RemoteException {
        Parcel G0 = mo18707G0();
        C4648l0.m19782a(G0, z);
        mo18710b(12, G0);
    }

    public final void zza(Location location) throws RemoteException {
        Parcel G0 = mo18707G0();
        C4648l0.m19781a(G0, (Parcelable) location);
        mo18710b(13, G0);
    }
}
