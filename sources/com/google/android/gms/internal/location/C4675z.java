package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4117b;
import com.google.android.gms.common.api.internal.C4150k;
import com.google.android.gms.common.api.internal.C4167n;
import com.google.android.gms.common.api.internal.C4167n.C4168a;
import com.google.android.gms.common.api.internal.C4216w;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.C5138k;
import com.google.android.gms.location.C5140l;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.zzal;
import p201f.p202a.C5952h;

/* renamed from: com.google.android.gms.internal.location.z */
public final class C4675z extends C4664t0 {

    /* renamed from: N */
    private final C4661s f13921N;

    public C4675z(Context context, Looper looper, C4088b bVar, C4089c cVar, String str) {
        this(context, looper, bVar, cVar, str, C4329f.m18746a(context));
    }

    public C4675z(Context context, Looper looper, C4088b bVar, C4089c cVar, String str, @C5952h C4329f fVar) {
        super(context, looper, bVar, cVar, str, fVar);
        this.f13921N = new C4661s(context, this.f13913M);
    }

    /* renamed from: E */
    public final Location mo17532E() throws RemoteException {
        return this.f13921N.mo18753a();
    }

    /* renamed from: F */
    public final LocationAvailability mo18787F() throws RemoteException {
        return this.f13921N.mo18764c();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(2:5|6)|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18230a() {
        /*
            r2 = this;
            com.google.android.gms.internal.location.s r0 = r2.f13921N
            monitor-enter(r0)
            boolean r1 = r2.isConnected()     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0013
            com.google.android.gms.internal.location.s r1 = r2.f13921N     // Catch:{ Exception -> 0x0013 }
            r1.mo18762b()     // Catch:{ Exception -> 0x0013 }
            com.google.android.gms.internal.location.s r1 = r2.f13921N     // Catch:{ Exception -> 0x0013 }
            r1.mo18765d()     // Catch:{ Exception -> 0x0013 }
        L_0x0013:
            super.mo18230a()     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return
        L_0x0018:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.C4675z.mo18230a():void");
    }

    /* renamed from: a */
    public final void mo18788a(long j, PendingIntent pendingIntent) throws RemoteException {
        mo18253q();
        C4300a0.m18620a(pendingIntent);
        C4300a0.m18628a(j >= 0, (Object) "detectionIntervalMillis must be >= 0");
        ((C4653o) mo18262z()).mo18740a(j, true, pendingIntent);
    }

    /* renamed from: a */
    public final void mo18789a(PendingIntent pendingIntent) throws RemoteException {
        mo18253q();
        C4300a0.m18620a(pendingIntent);
        ((C4653o) mo18262z()).mo18741a(pendingIntent);
    }

    /* renamed from: a */
    public final void mo18790a(PendingIntent pendingIntent, C4117b<Status> bVar) throws RemoteException {
        mo18253q();
        C4300a0.m18621a(bVar, (Object) "ResultHolder not provided.");
        ((C4653o) mo18262z()).mo18742a(pendingIntent, (C4150k) new C4216w(bVar));
    }

    /* renamed from: a */
    public final void mo18791a(PendingIntent pendingIntent, C4643j jVar) throws RemoteException {
        this.f13921N.mo18754a(pendingIntent, jVar);
    }

    /* renamed from: a */
    public final void mo18792a(Location location) throws RemoteException {
        this.f13921N.mo18755a(location);
    }

    /* renamed from: a */
    public final void mo18793a(C4168a<C5140l> aVar, C4643j jVar) throws RemoteException {
        this.f13921N.mo18756a(aVar, jVar);
    }

    /* renamed from: a */
    public final void mo18794a(C4643j jVar) throws RemoteException {
        this.f13921N.mo18757a(jVar);
    }

    /* renamed from: a */
    public final void mo18795a(zzbd zzbd, C4167n<C5138k> nVar, C4643j jVar) throws RemoteException {
        synchronized (this.f13921N) {
            this.f13921N.mo18758a(zzbd, nVar, jVar);
        }
    }

    /* renamed from: a */
    public final void mo18796a(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, C4117b<Status> bVar) throws RemoteException {
        mo18253q();
        C4300a0.m18621a(bVar, (Object) "ResultHolder not provided.");
        ((C4653o) mo18262z()).mo18746a(activityTransitionRequest, pendingIntent, (C4150k) new C4216w(bVar));
    }

    /* renamed from: a */
    public final void mo18797a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C4117b<Status> bVar) throws RemoteException {
        mo18253q();
        C4300a0.m18621a(geofencingRequest, (Object) "geofencingRequest can't be null.");
        C4300a0.m18621a(pendingIntent, (Object) "PendingIntent must be specified.");
        C4300a0.m18621a(bVar, (Object) "ResultHolder not provided.");
        ((C4653o) mo18262z()).mo18747a(geofencingRequest, pendingIntent, (C4649m) new C4622b0(bVar));
    }

    /* renamed from: a */
    public final void mo18798a(LocationRequest locationRequest, PendingIntent pendingIntent, C4643j jVar) throws RemoteException {
        this.f13921N.mo18759a(locationRequest, pendingIntent, jVar);
    }

    /* renamed from: a */
    public final void mo18799a(LocationRequest locationRequest, C4167n<C5140l> nVar, C4643j jVar) throws RemoteException {
        synchronized (this.f13921N) {
            this.f13921N.mo18760a(locationRequest, nVar, jVar);
        }
    }

    /* renamed from: a */
    public final void mo18800a(LocationSettingsRequest locationSettingsRequest, C4117b<LocationSettingsResult> bVar, @C5952h String str) throws RemoteException {
        mo18253q();
        boolean z = true;
        C4300a0.m18628a(locationSettingsRequest != null, (Object) "locationSettingsRequest can't be null nor empty.");
        if (bVar == null) {
            z = false;
        }
        C4300a0.m18628a(z, (Object) "listener can't be null.");
        ((C4653o) mo18262z()).mo18748a(locationSettingsRequest, (C4657q) new C4628d0(bVar), str);
    }

    /* renamed from: a */
    public final void mo18801a(zzal zzal, C4117b<Status> bVar) throws RemoteException {
        mo18253q();
        C4300a0.m18621a(zzal, (Object) "removeGeofencingRequest can't be null.");
        C4300a0.m18621a(bVar, (Object) "ResultHolder not provided.");
        ((C4653o) mo18262z()).mo18749a(zzal, (C4649m) new C4625c0(bVar));
    }

    /* renamed from: a */
    public final void mo18802a(boolean z) throws RemoteException {
        this.f13921N.mo18761a(z);
    }

    /* renamed from: b */
    public final void mo18803b(C4168a<C5138k> aVar, C4643j jVar) throws RemoteException {
        this.f13921N.mo18763b(aVar, jVar);
    }
}
