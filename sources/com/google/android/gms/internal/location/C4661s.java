package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C4167n;
import com.google.android.gms.common.api.internal.C4167n.C4168a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.location.C5138k;
import com.google.android.gms.location.C5140l;
import com.google.android.gms.location.C5165w0;
import com.google.android.gms.location.C5171z0;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.location.s */
public final class C4661s {

    /* renamed from: a */
    private final C4640h0<C4653o> f13904a;

    /* renamed from: b */
    private final Context f13905b;

    /* renamed from: c */
    private ContentProviderClient f13906c = null;

    /* renamed from: d */
    private boolean f13907d = false;

    /* renamed from: e */
    private final Map<C4168a<C5140l>, C4671x> f13908e = new HashMap();

    /* renamed from: f */
    private final Map<C4168a<Object>, C4669w> f13909f = new HashMap();

    /* renamed from: g */
    private final Map<C4168a<C5138k>, C4663t> f13910g = new HashMap();

    public C4661s(Context context, C4640h0<C4653o> h0Var) {
        this.f13905b = context;
        this.f13904a = h0Var;
    }

    /* renamed from: a */
    private final C4671x m19823a(C4167n<C5140l> nVar) {
        C4671x xVar;
        synchronized (this.f13908e) {
            xVar = (C4671x) this.f13908e.get(nVar.mo17932b());
            if (xVar == null) {
                xVar = new C4671x(nVar);
            }
            this.f13908e.put(nVar.mo17932b(), xVar);
        }
        return xVar;
    }

    /* renamed from: b */
    private final C4663t m19824b(C4167n<C5138k> nVar) {
        C4663t tVar;
        synchronized (this.f13910g) {
            tVar = (C4663t) this.f13910g.get(nVar.mo17932b());
            if (tVar == null) {
                tVar = new C4663t(nVar);
            }
            this.f13910g.put(nVar.mo17932b(), tVar);
        }
        return tVar;
    }

    /* renamed from: a */
    public final Location mo18753a() throws RemoteException {
        this.f13904a.mo18732a();
        return ((C4653o) this.f13904a.mo18733b()).mo18739a(this.f13905b.getPackageName());
    }

    /* renamed from: a */
    public final void mo18754a(PendingIntent pendingIntent, C4643j jVar) throws RemoteException {
        this.f13904a.mo18732a();
        C4653o oVar = (C4653o) this.f13904a.mo18733b();
        zzbf zzbf = new zzbf(2, null, null, pendingIntent, null, jVar != null ? jVar.asBinder() : null);
        oVar.mo18744a(zzbf);
    }

    /* renamed from: a */
    public final void mo18755a(Location location) throws RemoteException {
        this.f13904a.mo18732a();
        ((C4653o) this.f13904a.mo18733b()).zza(location);
    }

    /* renamed from: a */
    public final void mo18756a(C4168a<C5140l> aVar, C4643j jVar) throws RemoteException {
        this.f13904a.mo18732a();
        C4300a0.m18621a(aVar, (Object) "Invalid null listener key");
        synchronized (this.f13908e) {
            C4671x xVar = (C4671x) this.f13908e.remove(aVar);
            if (xVar != null) {
                xVar.mo18773G0();
                ((C4653o) this.f13904a.mo18733b()).mo18744a(zzbf.m19893a((C5171z0) xVar, jVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo18757a(C4643j jVar) throws RemoteException {
        this.f13904a.mo18732a();
        ((C4653o) this.f13904a.mo18733b()).mo18743a(jVar);
    }

    /* renamed from: a */
    public final void mo18758a(zzbd zzbd, C4167n<C5138k> nVar, C4643j jVar) throws RemoteException {
        this.f13904a.mo18732a();
        C4653o oVar = (C4653o) this.f13904a.mo18733b();
        zzbf zzbf = new zzbf(1, zzbd, null, null, m19824b(nVar).asBinder(), jVar != null ? jVar.asBinder() : null);
        oVar.mo18744a(zzbf);
    }

    /* renamed from: a */
    public final void mo18759a(LocationRequest locationRequest, PendingIntent pendingIntent, C4643j jVar) throws RemoteException {
        this.f13904a.mo18732a();
        C4653o oVar = (C4653o) this.f13904a.mo18733b();
        zzbf zzbf = new zzbf(1, zzbd.m19891a(locationRequest), null, pendingIntent, null, jVar != null ? jVar.asBinder() : null);
        oVar.mo18744a(zzbf);
    }

    /* renamed from: a */
    public final void mo18760a(LocationRequest locationRequest, C4167n<C5140l> nVar, C4643j jVar) throws RemoteException {
        this.f13904a.mo18732a();
        C4653o oVar = (C4653o) this.f13904a.mo18733b();
        zzbf zzbf = new zzbf(1, zzbd.m19891a(locationRequest), m19823a(nVar).asBinder(), null, null, jVar != null ? jVar.asBinder() : null);
        oVar.mo18744a(zzbf);
    }

    /* renamed from: a */
    public final void mo18761a(boolean z) throws RemoteException {
        this.f13904a.mo18732a();
        ((C4653o) this.f13904a.mo18733b()).mo18751d(z);
        this.f13907d = z;
    }

    /* renamed from: b */
    public final void mo18762b() throws RemoteException {
        synchronized (this.f13908e) {
            for (C4671x xVar : this.f13908e.values()) {
                if (xVar != null) {
                    ((C4653o) this.f13904a.mo18733b()).mo18744a(zzbf.m19893a((C5171z0) xVar, (C4643j) null));
                }
            }
            this.f13908e.clear();
        }
        synchronized (this.f13910g) {
            for (C4663t tVar : this.f13910g.values()) {
                if (tVar != null) {
                    ((C4653o) this.f13904a.mo18733b()).mo18744a(zzbf.m19892a((C5165w0) tVar, (C4643j) null));
                }
            }
            this.f13910g.clear();
        }
        synchronized (this.f13909f) {
            for (C4669w wVar : this.f13909f.values()) {
                if (wVar != null) {
                    ((C4653o) this.f13904a.mo18733b()).mo18745a(new zzo(2, null, wVar.asBinder(), null));
                }
            }
            this.f13909f.clear();
        }
    }

    /* renamed from: b */
    public final void mo18763b(C4168a<C5138k> aVar, C4643j jVar) throws RemoteException {
        this.f13904a.mo18732a();
        C4300a0.m18621a(aVar, (Object) "Invalid null listener key");
        synchronized (this.f13910g) {
            C4663t tVar = (C4663t) this.f13910g.remove(aVar);
            if (tVar != null) {
                tVar.mo18766G0();
                ((C4653o) this.f13904a.mo18733b()).mo18744a(zzbf.m19892a((C5165w0) tVar, jVar));
            }
        }
    }

    /* renamed from: c */
    public final LocationAvailability mo18764c() throws RemoteException {
        this.f13904a.mo18732a();
        return ((C4653o) this.f13904a.mo18733b()).mo18750b(this.f13905b.getPackageName());
    }

    /* renamed from: d */
    public final void mo18765d() throws RemoteException {
        if (this.f13907d) {
            mo18761a(false);
        }
    }
}
