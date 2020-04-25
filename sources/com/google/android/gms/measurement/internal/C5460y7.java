package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4314e.C4315a;
import com.google.android.gms.common.internal.C4314e.C4316b;
import com.google.android.gms.common.stats.C4462a;
import com.google.android.gms.common.util.C4476d0;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

@C4476d0
/* renamed from: com.google.android.gms.measurement.internal.y7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5460y7 implements ServiceConnection, C4315a, C4316b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile boolean f15628a;

    /* renamed from: b */
    private volatile C5314l3 f15629b;

    /* renamed from: c */
    final /* synthetic */ C5252f7 f15630c;

    protected C5460y7(C5252f7 f7Var) {
        this.f15630c = f7Var;
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21830a(Intent intent) {
        this.f15630c.mo21209h();
        Context e = this.f15630c.mo21206e();
        C4462a a = C4462a.m19276a();
        synchronized (this) {
            if (this.f15628a) {
                this.f15630c.mo21205d().mo21528C().mo21549a("Connection attempt already in progress");
                return;
            }
            this.f15630c.mo21205d().mo21528C().mo21549a("Using local app measurement service");
            this.f15628a = true;
            a.mo18551a(e, intent, this.f15630c.f15028c, C13959t.f40835R1);
        }
    }

    @C0226w0
    /* renamed from: b */
    public final void mo21831b() {
        this.f15630c.mo21209h();
        Context e = this.f15630c.mo21206e();
        synchronized (this) {
            if (this.f15628a) {
                this.f15630c.mo21205d().mo21528C().mo21549a("Connection attempt already in progress");
            } else if (this.f15629b == null || (!this.f15629b.mo18244d() && !this.f15629b.isConnected())) {
                this.f15629b = new C5314l3(e, Looper.getMainLooper(), this, this);
                this.f15630c.mo21205d().mo21528C().mo21549a("Connecting to remote service");
                this.f15628a = true;
                this.f15629b.mo18243c();
            } else {
                this.f15630c.mo21205d().mo21528C().mo21549a("Already awaiting connection attempt");
            }
        }
    }

    @C0187e0
    /* renamed from: i */
    public final void mo18263i(@C0195i0 Bundle bundle) {
        C4300a0.m18626a("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f15630c.mo21203c().mo21555a((Runnable) new C5231d8(this, (C5204b3) this.f15629b.mo18262z()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f15629b = null;
                this.f15628a = false;
            }
        }
    }

    @C0187e0
    /* renamed from: n */
    public final void mo18264n(int i) {
        C4300a0.m18626a("MeasurementServiceConnection.onConnectionSuspended");
        this.f15630c.mo21205d().mo21527A().mo21549a("Service connection suspended");
        this.f15630c.mo21203c().mo21555a((Runnable) new C5220c8(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.f15630c.mo21205d().mo21533t().mo21549a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0062 */
    @androidx.annotation.C0187e0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C4300a0.m18626a(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f15628a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.f7 r4 = r3.f15630c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo21205d()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo21533t()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo21549a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0099
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x0052
            if (r5 != 0) goto L_0x002f
            goto L_0x0042
        L_0x002f:
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0062 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.C5204b3     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x003c
            com.google.android.gms.measurement.internal.b3 r1 = (com.google.android.gms.measurement.internal.C5204b3) r1     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0041
        L_0x003c:
            com.google.android.gms.measurement.internal.e3 r1 = new com.google.android.gms.measurement.internal.e3     // Catch:{ RemoteException -> 0x0062 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0062 }
        L_0x0041:
            r0 = r1
        L_0x0042:
            com.google.android.gms.measurement.internal.f7 r5 = r3.f15630c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo21205d()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21528C()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo21549a(r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0052:
            com.google.android.gms.measurement.internal.f7 r5 = r3.f15630c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo21205d()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21533t()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo21550a(r2, r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0062:
            com.google.android.gms.measurement.internal.f7 r5 = r3.f15630c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo21205d()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21533t()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo21549a(r1)     // Catch:{ all -> 0x001c }
        L_0x0071:
            if (r0 != 0) goto L_0x0089
            r3.f15628a = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.common.stats.a r4 = com.google.android.gms.common.stats.C4462a.m19276a()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.f7 r5 = r3.f15630c     // Catch:{ IllegalArgumentException -> 0x0097 }
            android.content.Context r5 = r5.mo21206e()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.f7 r0 = r3.f15630c     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.y7 r0 = r0.f15028c     // Catch:{ IllegalArgumentException -> 0x0097 }
            r4.mo18550a(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0097 }
            goto L_0x0097
        L_0x0089:
            com.google.android.gms.measurement.internal.f7 r4 = r3.f15630c     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.m4 r4 = r4.mo21203c()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.b8 r5 = new com.google.android.gms.measurement.internal.b8     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.mo21555a(r5)     // Catch:{ all -> 0x001c }
        L_0x0097:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0099:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5460y7.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @C0187e0
    public final void onServiceDisconnected(ComponentName componentName) {
        C4300a0.m18626a("MeasurementServiceConnection.onServiceDisconnected");
        this.f15630c.mo21205d().mo21527A().mo21549a("Service disconnected");
        this.f15630c.mo21203c().mo21555a((Runnable) new C5198a8(this, componentName));
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21829a() {
        if (this.f15629b != null && (this.f15629b.isConnected() || this.f15629b.mo18244d())) {
            this.f15629b.mo18230a();
        }
        this.f15629b = null;
    }

    @C0187e0
    /* renamed from: a */
    public final void mo18265a(@C0193h0 ConnectionResult connectionResult) {
        C4300a0.m18626a("MeasurementServiceConnection.onConnectionFailed");
        C5303k3 p = this.f15630c.f15309a.mo21602p();
        if (p != null) {
            p.mo21536w().mo21550a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f15628a = false;
            this.f15629b = null;
        }
        this.f15630c.mo21203c().mo21555a((Runnable) new C5253f8(this));
    }
}
