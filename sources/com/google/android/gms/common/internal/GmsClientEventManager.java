package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.util.C4476d0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p076c.p112d.p113a.p114a.p118d.p121c.C2612r;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class GmsClientEventManager implements Callback {

    /* renamed from: a */
    private final GmsClientEventState f13359a;

    /* renamed from: b */
    private final ArrayList<C4088b> f13360b = new ArrayList<>();
    @C4476d0

    /* renamed from: c */
    private final ArrayList<C4088b> f13361c = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<C4089c> f13362d = new ArrayList<>();

    /* renamed from: e */
    private volatile boolean f13363e = false;

    /* renamed from: f */
    private final AtomicInteger f13364f = new AtomicInteger(0);

    /* renamed from: g */
    private boolean f13365g = false;

    /* renamed from: h */
    private final Handler f13366h;

    /* renamed from: i */
    private final Object f13367i = new Object();

    @C4476d0
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface GmsClientEventState {
        Bundle getConnectionHint();

        boolean isConnected();
    }

    public GmsClientEventManager(Looper looper, GmsClientEventState gmsClientEventState) {
        this.f13359a = gmsClientEventState;
        this.f13366h = new C2612r(looper, this);
    }

    @C4476d0
    /* renamed from: a */
    public final void mo18188a(Bundle bundle) {
        C4300a0.m18625a(this.f13366h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f13367i) {
            boolean z = true;
            C4300a0.m18631b(!this.f13365g);
            this.f13366h.removeMessages(1);
            this.f13365g = true;
            if (this.f13361c.size() != 0) {
                z = false;
            }
            C4300a0.m18631b(z);
            ArrayList arrayList = new ArrayList(this.f13360b);
            int i = this.f13364f.get();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                C4088b bVar = (C4088b) obj;
                if (!this.f13363e || !this.f13359a.isConnected() || this.f13364f.get() != i) {
                    break;
                } else if (!this.f13361c.contains(bVar)) {
                    bVar.mo17777i(bundle);
                }
            }
            this.f13361c.clear();
            this.f13365g = false;
        }
    }

    /* renamed from: b */
    public final void mo18193b() {
        this.f13363e = false;
        this.f13364f.incrementAndGet();
    }

    /* renamed from: c */
    public final void mo18196c() {
        this.f13363e = true;
    }

    /* access modifiers changed from: protected */
    @C4476d0
    /* renamed from: d */
    public final void mo18199d() {
        synchronized (this.f13367i) {
            mo18188a(this.f13359a.getConnectionHint());
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C4088b bVar = (C4088b) message.obj;
            synchronized (this.f13367i) {
                if (this.f13363e && this.f13359a.isConnected() && this.f13360b.contains(bVar)) {
                    bVar.mo17777i(this.f13359a.getConnectionHint());
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        sb.toString();
        new Exception();
        return false;
    }

    /* renamed from: c */
    public final void mo18197c(C4088b bVar) {
        C4300a0.m18620a(bVar);
        synchronized (this.f13367i) {
            if (!this.f13360b.remove(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                sb.append("unregisterConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                sb.toString();
            } else if (this.f13365g) {
                this.f13361c.add(bVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo18194b(C4088b bVar) {
        C4300a0.m18620a(bVar);
        synchronized (this.f13367i) {
            if (this.f13360b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                sb.toString();
            } else {
                this.f13360b.add(bVar);
            }
        }
        if (this.f13359a.isConnected()) {
            Handler handler = this.f13366h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    /* renamed from: c */
    public final void mo18198c(C4089c cVar) {
        C4300a0.m18620a(cVar);
        synchronized (this.f13367i) {
            if (!this.f13362d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                sb.toString();
            }
        }
    }

    /* renamed from: b */
    public final void mo18195b(C4089c cVar) {
        C4300a0.m18620a(cVar);
        synchronized (this.f13367i) {
            if (this.f13362d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                sb.toString();
            } else {
                this.f13362d.add(cVar);
            }
        }
    }

    @C4476d0
    /* renamed from: a */
    public final void mo18187a(int i) {
        C4300a0.m18625a(this.f13366h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f13366h.removeMessages(1);
        synchronized (this.f13367i) {
            this.f13365g = true;
            ArrayList arrayList = new ArrayList(this.f13360b);
            int i2 = this.f13364f.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                C4088b bVar = (C4088b) obj;
                if (!this.f13363e || this.f13364f.get() != i2) {
                    break;
                } else if (this.f13360b.contains(bVar)) {
                    bVar.mo17778n(i);
                }
            }
            this.f13361c.clear();
            this.f13365g = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        return;
     */
    @com.google.android.gms.common.util.C4476d0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18189a(com.google.android.gms.common.ConnectionResult r8) {
        /*
            r7 = this;
            android.os.Handler r0 = r7.f13366h
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.C4300a0.m18625a(r0, r1)
            android.os.Handler r0 = r7.f13366h
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r7.f13367i
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0049 }
            java.util.ArrayList<com.google.android.gms.common.api.i$c> r2 = r7.f13362d     // Catch:{ all -> 0x0049 }
            r1.<init>(r2)     // Catch:{ all -> 0x0049 }
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f13364f     // Catch:{ all -> 0x0049 }
            int r2 = r2.get()     // Catch:{ all -> 0x0049 }
            int r3 = r1.size()     // Catch:{ all -> 0x0049 }
            r4 = 0
        L_0x0022:
            if (r4 >= r3) goto L_0x0047
            java.lang.Object r5 = r1.get(r4)     // Catch:{ all -> 0x0049 }
            int r4 = r4 + 1
            com.google.android.gms.common.api.i$c r5 = (com.google.android.gms.common.api.C4086i.C4089c) r5     // Catch:{ all -> 0x0049 }
            boolean r6 = r7.f13363e     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0045
            java.util.concurrent.atomic.AtomicInteger r6 = r7.f13364f     // Catch:{ all -> 0x0049 }
            int r6 = r6.get()     // Catch:{ all -> 0x0049 }
            if (r6 == r2) goto L_0x0039
            goto L_0x0045
        L_0x0039:
            java.util.ArrayList<com.google.android.gms.common.api.i$c> r6 = r7.f13362d     // Catch:{ all -> 0x0049 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0022
            r5.mo17767a(r8)     // Catch:{ all -> 0x0049 }
            goto L_0x0022
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0049:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x004c:
            throw r8
        L_0x004d:
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.GmsClientEventManager.mo18189a(com.google.android.gms.common.ConnectionResult):void");
    }

    /* renamed from: a */
    public final boolean mo18191a(C4088b bVar) {
        boolean contains;
        C4300a0.m18620a(bVar);
        synchronized (this.f13367i) {
            contains = this.f13360b.contains(bVar);
        }
        return contains;
    }

    /* renamed from: a */
    public final boolean mo18192a(C4089c cVar) {
        boolean contains;
        C4300a0.m18620a(cVar);
        synchronized (this.f13367i) {
            contains = this.f13362d.contains(cVar);
        }
        return contains;
    }

    /* renamed from: a */
    public final boolean mo18190a() {
        return this.f13363e;
    }
}
