package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.e1 */
final class C4328e1 implements ServiceConnection {

    /* renamed from: a */
    private final Set<ServiceConnection> f13446a = new HashSet();

    /* renamed from: b */
    private int f13447b = 2;

    /* renamed from: c */
    private boolean f13448c;

    /* renamed from: d */
    private IBinder f13449d;

    /* renamed from: e */
    private final C4363a f13450e;

    /* renamed from: f */
    private ComponentName f13451f;

    /* renamed from: g */
    private final /* synthetic */ C4313d1 f13452g;

    public C4328e1(C4313d1 d1Var, C4363a aVar) {
        this.f13452g = d1Var;
        this.f13450e = aVar;
    }

    /* renamed from: a */
    public final void mo18282a(String str) {
        this.f13447b = 3;
        this.f13448c = this.f13452g.f13393f.mo18552a(this.f13452g.f13391d, str, this.f13450e.mo18339a(this.f13452g.f13391d), this, this.f13450e.mo18341c());
        if (this.f13448c) {
            this.f13452g.f13392e.sendMessageDelayed(this.f13452g.f13392e.obtainMessage(1, this.f13450e), this.f13452g.f13395h);
            return;
        }
        this.f13447b = 2;
        try {
            this.f13452g.f13393f.mo18550a(this.f13452g.f13391d, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: b */
    public final void mo18286b(String str) {
        this.f13452g.f13392e.removeMessages(1, this.f13450e);
        this.f13452g.f13393f.mo18550a(this.f13452g.f13391d, this);
        this.f13448c = false;
        this.f13447b = 2;
    }

    /* renamed from: c */
    public final int mo18287c() {
        return this.f13447b;
    }

    /* renamed from: d */
    public final boolean mo18288d() {
        return this.f13448c;
    }

    /* renamed from: e */
    public final boolean mo18289e() {
        return this.f13446a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f13452g.f13390c) {
            this.f13452g.f13392e.removeMessages(1, this.f13450e);
            this.f13449d = iBinder;
            this.f13451f = componentName;
            for (ServiceConnection onServiceConnected : this.f13446a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f13447b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f13452g.f13390c) {
            this.f13452g.f13392e.removeMessages(1, this.f13450e);
            this.f13449d = null;
            this.f13451f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f13446a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f13447b = 2;
        }
    }

    /* renamed from: b */
    public final void mo18285b(ServiceConnection serviceConnection, String str) {
        this.f13452g.f13393f;
        this.f13452g.f13391d;
        this.f13446a.remove(serviceConnection);
    }

    /* renamed from: b */
    public final ComponentName mo18284b() {
        return this.f13451f;
    }

    /* renamed from: a */
    public final void mo18281a(ServiceConnection serviceConnection, String str) {
        this.f13452g.f13393f;
        this.f13452g.f13391d;
        this.f13450e.mo18339a(this.f13452g.f13391d);
        this.f13446a.add(serviceConnection);
    }

    /* renamed from: a */
    public final boolean mo18283a(ServiceConnection serviceConnection) {
        return this.f13446a.contains(serviceConnection);
    }

    /* renamed from: a */
    public final IBinder mo18280a() {
        return this.f13449d;
    }
}
