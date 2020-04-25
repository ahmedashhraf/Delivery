package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.amplitude.api.C2876e;
import com.google.android.gms.common.stats.C4462a;
import java.util.HashMap;
import p076c.p112d.p113a.p114a.p118d.p122d.C2617e;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.common.internal.d1 */
final class C4313d1 extends C4362l implements Callback {
    /* access modifiers changed from: private */
    @C5966a("mConnectionStatus")

    /* renamed from: c */
    public final HashMap<C4363a, C4328e1> f13390c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f13391d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Handler f13392e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4462a f13393f;

    /* renamed from: g */
    private final long f13394g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final long f13395h;

    C4313d1(Context context) {
        this.f13391d = context.getApplicationContext();
        this.f13392e = new C2617e(context.getMainLooper(), this);
        this.f13393f = C4462a.m19276a();
        this.f13394g = 5000;
        this.f13395h = C2876e.f10138o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18226a(C4363a aVar, ServiceConnection serviceConnection, String str) {
        boolean d;
        C4300a0.m18621a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f13390c) {
            C4328e1 e1Var = (C4328e1) this.f13390c.get(aVar);
            if (e1Var == null) {
                e1Var = new C4328e1(this, aVar);
                e1Var.mo18281a(serviceConnection, str);
                e1Var.mo18282a(str);
                this.f13390c.put(aVar, e1Var);
            } else {
                this.f13392e.removeMessages(0, aVar);
                if (!e1Var.mo18283a(serviceConnection)) {
                    e1Var.mo18281a(serviceConnection, str);
                    int c = e1Var.mo18287c();
                    if (c == 1) {
                        serviceConnection.onServiceConnected(e1Var.mo18284b(), e1Var.mo18280a());
                    } else if (c == 2) {
                        e1Var.mo18282a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d = e1Var.mo18288d();
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo18227b(C4363a aVar, ServiceConnection serviceConnection, String str) {
        C4300a0.m18621a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f13390c) {
            C4328e1 e1Var = (C4328e1) this.f13390c.get(aVar);
            if (e1Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (e1Var.mo18283a(serviceConnection)) {
                e1Var.mo18285b(serviceConnection, str);
                if (e1Var.mo18289e()) {
                    this.f13392e.sendMessageDelayed(this.f13392e.obtainMessage(0, aVar), this.f13394g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f13390c) {
                C4363a aVar = (C4363a) message.obj;
                C4328e1 e1Var = (C4328e1) this.f13390c.get(aVar);
                if (e1Var != null && e1Var.mo18289e()) {
                    if (e1Var.mo18288d()) {
                        e1Var.mo18286b("GmsClientSupervisor");
                    }
                    this.f13390c.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f13390c) {
                C4363a aVar2 = (C4363a) message.obj;
                C4328e1 e1Var2 = (C4328e1) this.f13390c.get(aVar2);
                if (e1Var2 != null && e1Var2.mo18287c() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    sb.toString();
                    new Exception();
                    ComponentName b = e1Var2.mo18284b();
                    if (b == null) {
                        b = aVar2.mo18338a();
                    }
                    if (b == null) {
                        b = new ComponentName(aVar2.mo18340b(), "unknown");
                    }
                    e1Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
