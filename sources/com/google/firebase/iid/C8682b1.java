package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.C0187e0;
import com.google.android.gms.common.stats.C4462a;
import java.util.ArrayDeque;
import java.util.Queue;
import p076c.p112d.p113a.p114a.p118d.p123e.C2624e;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.firebase.iid.b1 */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8682b1 implements ServiceConnection {
    @C5966a("this")

    /* renamed from: a */
    int f22795a;

    /* renamed from: b */
    final Messenger f22796b;

    /* renamed from: c */
    C8701j f22797c;
    @C5966a("this")

    /* renamed from: d */
    final Queue<C8703k<?>> f22798d;
    @C5966a("this")

    /* renamed from: e */
    final SparseArray<C8703k<?>> f22799e;

    /* renamed from: f */
    final /* synthetic */ C8679a1 f22800f;

    private C8682b1(C8679a1 a1Var) {
        this.f22800f = a1Var;
        this.f22795a = 0;
        this.f22796b = new Messenger(new C2624e(Looper.getMainLooper(), new C8691e1(this)));
        this.f22798d = new ArrayDeque();
        this.f22799e = new SparseArray<>();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo32109a(com.google.firebase.iid.C8703k<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f22795a     // Catch:{ all -> 0x008e }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r3) goto L_0x003a
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008e }
            int r0 = r5.f22795a     // Catch:{ all -> 0x008e }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r2.<init>(r1)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x008e }
            r2.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x008e }
            r6.<init>(r0)     // Catch:{ all -> 0x008e }
            throw r6     // Catch:{ all -> 0x008e }
        L_0x002e:
            monitor-exit(r5)
            return r2
        L_0x0030:
            java.util.Queue<com.google.firebase.iid.k<?>> r0 = r5.f22798d     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            r5.mo32105a()     // Catch:{ all -> 0x008e }
            monitor-exit(r5)
            return r3
        L_0x003a:
            java.util.Queue<com.google.firebase.iid.k<?>> r0 = r5.f22798d     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            monitor-exit(r5)
            return r3
        L_0x0041:
            java.util.Queue<com.google.firebase.iid.k<?>> r0 = r5.f22798d     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            int r6 = r5.f22795a     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x004c
            r6 = 1
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            com.google.android.gms.common.internal.C4300a0.m18631b(r6)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x008e }
            r5.f22795a = r3     // Catch:{ all -> 0x008e }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x008e }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C4462a.m19276a()     // Catch:{ all -> 0x008e }
            com.google.firebase.iid.a1 r1 = r5.f22800f     // Catch:{ all -> 0x008e }
            android.content.Context r1 = r1.f22790a     // Catch:{ all -> 0x008e }
            boolean r6 = r0.mo18551a(r1, r6, r5, r3)     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x007a
            java.lang.String r6 = "Unable to bind to service"
            r5.mo32107a(r2, r6)     // Catch:{ all -> 0x008e }
            goto L_0x008c
        L_0x007a:
            com.google.firebase.iid.a1 r6 = r5.f22800f     // Catch:{ all -> 0x008e }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f22791b     // Catch:{ all -> 0x008e }
            com.google.firebase.iid.d1 r0 = new com.google.firebase.iid.d1     // Catch:{ all -> 0x008e }
            r0.<init>(r5)     // Catch:{ all -> 0x008e }
            r1 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x008e }
            r6.schedule(r0, r1, r4)     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r5)
            return r3
        L_0x008e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C8682b1.mo32109a(com.google.firebase.iid.k):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized void mo32110b() {
        if (this.f22795a == 2 && this.f22798d.isEmpty() && this.f22799e.size() == 0) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.f22795a = 3;
            C4462a.m19276a().mo18550a(this.f22800f.f22790a, this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final synchronized void mo32111c() {
        if (this.f22795a == 1) {
            mo32107a(1, "Timed out while binding");
        }
    }

    @C0187e0
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
        this.f22800f.f22791b.execute(new C8692f(this, iBinder));
    }

    @C0187e0
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
        this.f22800f.f22791b.execute(new C8696h(this));
    }

    /* JADX INFO: used method not loaded: com.google.firebase.iid.k.a(com.google.firebase.iid.zzag):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.google.firebase.iid.k.a(android.os.Bundle):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        r1.mo32132a(new com.google.firebase.iid.zzag(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        r1.mo32127a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0062, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo32108a(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L_0x001d
            r1 = 41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Received response to request: "
            r2.append(r1)
            r2.append(r0)
            r2.toString()
        L_0x001d:
            monitor-enter(r4)
            android.util.SparseArray<com.google.firebase.iid.k<?>> r1 = r4.f22799e     // Catch:{ all -> 0x0063 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0063 }
            com.google.firebase.iid.k r1 = (com.google.firebase.iid.C8703k) r1     // Catch:{ all -> 0x0063 }
            r2 = 1
            if (r1 != 0) goto L_0x003d
            r5 = 50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r1.<init>(r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Received response for unknown request: "
            r1.append(r5)     // Catch:{ all -> 0x0063 }
            r1.append(r0)     // Catch:{ all -> 0x0063 }
            r1.toString()     // Catch:{ all -> 0x0063 }
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            return r2
        L_0x003d:
            android.util.SparseArray<com.google.firebase.iid.k<?>> r3 = r4.f22799e     // Catch:{ all -> 0x0063 }
            r3.remove(r0)     // Catch:{ all -> 0x0063 }
            r4.mo32110b()     // Catch:{ all -> 0x0063 }
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            android.os.Bundle r5 = r5.getData()
            r0 = 0
            java.lang.String r3 = "unsupported"
            boolean r0 = r5.getBoolean(r3, r0)
            if (r0 == 0) goto L_0x005f
            com.google.firebase.iid.zzag r5 = new com.google.firebase.iid.zzag
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.mo32132a(r5)
            goto L_0x0062
        L_0x005f:
            r1.mo32127a(r5)
        L_0x0062:
            return r2
        L_0x0063:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C8682b1.mo32108a(android.os.Message):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32105a() {
        this.f22800f.f22791b.execute(new C8689e(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo32107a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str2 = "Disconnected: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
        }
        int i2 = this.f22795a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.f22795a = 4;
            C4462a.m19276a().mo18550a(this.f22800f.f22790a, this);
            zzag zzag = new zzag(i, str);
            for (C8703k a : this.f22798d) {
                a.mo32132a(zzag);
            }
            this.f22798d.clear();
            for (int i3 = 0; i3 < this.f22799e.size(); i3++) {
                ((C8703k) this.f22799e.valueAt(i3)).mo32132a(zzag);
            }
            this.f22799e.clear();
        } else if (i2 == 3) {
            this.f22795a = 4;
        } else if (i2 != 4) {
            int i4 = this.f22795a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo32106a(int i) {
        C8703k kVar = (C8703k) this.f22799e.get(i);
        if (kVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            sb.toString();
            this.f22799e.remove(i);
            kVar.mo32132a(new zzag(3, "Timed out waiting for response"));
            mo32110b();
        }
    }
}
