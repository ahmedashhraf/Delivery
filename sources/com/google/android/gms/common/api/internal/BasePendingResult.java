package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.C4237l.C4238a;
import com.google.android.gms.common.api.C4243n;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.C4247r;
import com.google.android.gms.common.api.C4249t;
import com.google.android.gms.common.api.C4250u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4380q;
import com.google.android.gms.common.util.C4476d0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p076c.p112d.p113a.p114a.p118d.p121c.C2612r;

@KeepName
@C4056a
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class BasePendingResult<R extends C4246q> extends C4237l<R> {

    /* renamed from: p */
    static final ThreadLocal<Boolean> f12867p = new C4144i3();

    /* renamed from: a */
    private final Object f12868a;

    /* renamed from: b */
    private final C4090a<R> f12869b;

    /* renamed from: c */
    private final WeakReference<C4086i> f12870c;

    /* renamed from: d */
    private final CountDownLatch f12871d;

    /* renamed from: e */
    private final ArrayList<C4238a> f12872e;

    /* renamed from: f */
    private C4247r<? super R> f12873f;

    /* renamed from: g */
    private final AtomicReference<C4214v2> f12874g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public R f12875h;

    /* renamed from: i */
    private Status f12876i;

    /* renamed from: j */
    private volatile boolean f12877j;

    /* renamed from: k */
    private boolean f12878k;

    /* renamed from: l */
    private boolean f12879l;

    /* renamed from: m */
    private C4380q f12880m;
    @KeepName
    private C4091b mResultGuardian;

    /* renamed from: n */
    private volatile C4183p2<R> f12881n;

    /* renamed from: o */
    private boolean f12882o;

    @C4476d0
    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class C4090a<R extends C4246q> extends C2612r {
        public C4090a() {
            this(Looper.getMainLooper());
        }

        /* renamed from: a */
        public final void mo17754a(C4247r<? super R> rVar, R r) {
            sendMessage(obtainMessage(1, new Pair(BasePendingResult.m17673b(rVar), r)));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C4247r rVar = (C4247r) pair.first;
                C4246q qVar = (C4246q) pair.second;
                try {
                    rVar.mo17815a(qVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m17676c(qVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                sb.toString();
                new Exception();
            } else {
                ((BasePendingResult) message.obj).mo17748c(Status.f12783S);
            }
        }

        public C4090a(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private final class C4091b {
        private C4091b() {
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            BasePendingResult.m17676c(BasePendingResult.this.f12875h);
            super.finalize();
        }

        /* synthetic */ C4091b(BasePendingResult basePendingResult, C4144i3 i3Var) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f12868a = new Object();
        this.f12871d = new CountDownLatch(1);
        this.f12872e = new ArrayList<>();
        this.f12874g = new AtomicReference<>();
        this.f12882o = false;
        this.f12869b = new C4090a<>(Looper.getMainLooper());
        this.f12870c = new WeakReference<>(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <R extends C4246q> C4247r<R> m17673b(C4247r<R> rVar) {
        return rVar;
    }

    /* renamed from: h */
    private final R mo17813h() {
        R r;
        synchronized (this.f12868a) {
            C4300a0.m18632b(!this.f12877j, "Result has already been consumed.");
            C4300a0.m18632b(mo17751e(), "Result is not ready.");
            r = this.f12875h;
            this.f12875h = null;
            this.f12873f = null;
            this.f12877j = true;
        }
        C4214v2 v2Var = (C4214v2) this.f12874g.getAndSet(null);
        if (v2Var != null) {
            v2Var.mo17970a(this);
        }
        return r;
    }

    /* renamed from: a */
    public final R mo17739a() {
        C4300a0.m18634c("await must not be called on the UI thread");
        boolean z = true;
        C4300a0.m18632b(!this.f12877j, "Result has already been consumed");
        if (this.f12881n != null) {
            z = false;
        }
        C4300a0.m18632b(z, "Cannot await if then() has been called.");
        try {
            this.f12871d.await();
        } catch (InterruptedException unused) {
            mo17748c(Status.f12781Q);
        }
        C4300a0.m18632b(mo17751e(), "Result is not ready.");
        return mo17813h();
    }

    /* access modifiers changed from: protected */
    @C0193h0
    @C4056a
    /* renamed from: b */
    public abstract R mo17536b(Status status);

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    @com.google.android.gms.common.annotation.C4056a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17653b() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f12868a
            monitor-enter(r0)
            boolean r1 = r2.f12878k     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2.f12877j     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x000c
            goto L_0x0028
        L_0x000c:
            com.google.android.gms.common.internal.q r1 = r2.f12880m     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.common.internal.q r1 = r2.f12880m     // Catch:{ RemoteException -> 0x0015 }
            r1.cancel()     // Catch:{ RemoteException -> 0x0015 }
        L_0x0015:
            R r1 = r2.f12875h     // Catch:{ all -> 0x002a }
            m17676c(r1)     // Catch:{ all -> 0x002a }
            r1 = 1
            r2.f12878k = r1     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f12784T     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.q r1 = r2.mo17536b(r1)     // Catch:{ all -> 0x002a }
            r2.mo17812b((R) r1)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo17653b():void");
    }

    /* renamed from: c */
    public boolean mo17749c() {
        boolean z;
        synchronized (this.f12868a) {
            z = this.f12878k;
        }
        return z;
    }

    /* renamed from: d */
    public final Integer mo17750d() {
        return null;
    }

    @C4056a
    /* renamed from: e */
    public final boolean mo17751e() {
        return this.f12871d.getCount() == 0;
    }

    /* renamed from: f */
    public final boolean mo17752f() {
        boolean c;
        synchronized (this.f12868a) {
            if (((C4086i) this.f12870c.get()) == null || !this.f12882o) {
                mo17653b();
            }
            c = mo17749c();
        }
        return c;
    }

    /* renamed from: g */
    public final void mo17753g() {
        this.f12882o = this.f12882o || ((Boolean) f12867p.get()).booleanValue();
    }

    /* renamed from: c */
    public final void mo17748c(Status status) {
        synchronized (this.f12868a) {
            if (!mo17751e()) {
                mo17744a((R) mo17536b(status));
                this.f12879l = true;
            }
        }
    }

    /* renamed from: a */
    public final R mo17740a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C4300a0.m18634c("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        C4300a0.m18632b(!this.f12877j, "Result has already been consumed.");
        if (this.f12881n != null) {
            z = false;
        }
        C4300a0.m18632b(z, "Cannot await if then() has been called.");
        try {
            if (!this.f12871d.await(j, timeUnit)) {
                mo17748c(Status.f12783S);
            }
        } catch (InterruptedException unused) {
            mo17748c(Status.f12781Q);
        }
        C4300a0.m18632b(mo17751e(), "Result is not ready.");
        return mo17813h();
    }

    @C4056a
    protected BasePendingResult(C4086i iVar) {
        this.f12868a = new Object();
        this.f12871d = new CountDownLatch(1);
        this.f12872e = new ArrayList<>();
        this.f12874g = new AtomicReference<>();
        this.f12882o = false;
        this.f12869b = new C4090a<>(iVar != null ? iVar.mo17717f() : Looper.getMainLooper());
        this.f12870c = new WeakReference<>(iVar);
    }

    /* renamed from: c */
    public static void m17676c(C4246q qVar) {
        if (qVar instanceof C4243n) {
            try {
                ((C4243n) qVar).release();
            } catch (RuntimeException unused) {
                String valueOf = String.valueOf(qVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                sb.toString();
            }
        }
    }

    /* renamed from: b */
    private final void mo17812b(R r) {
        this.f12875h = r;
        this.f12880m = null;
        this.f12871d.countDown();
        this.f12876i = this.f12875h.mo17504f();
        if (this.f12878k) {
            this.f12873f = null;
        } else if (this.f12873f != null) {
            this.f12869b.removeMessages(2);
            this.f12869b.mo17754a(this.f12873f, mo17813h());
        } else if (this.f12875h instanceof C4243n) {
            this.mResultGuardian = new C4091b(this, null);
        }
        ArrayList<C4238a> arrayList = this.f12872e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C4238a) obj).mo17820a(this.f12876i);
        }
        this.f12872e.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return;
     */
    @com.google.android.gms.common.annotation.C4056a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17745a(com.google.android.gms.common.api.C4247r<? super R> r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12868a
            monitor-enter(r0)
            if (r6 != 0) goto L_0x000a
            r6 = 0
            r5.f12873f = r6     // Catch:{ all -> 0x003f }
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x000a:
            boolean r1 = r5.f12877j     // Catch:{ all -> 0x003f }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.String r4 = "Result has already been consumed."
            com.google.android.gms.common.internal.C4300a0.m18632b(r1, r4)     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.internal.p2<R> r1 = r5.f12881n     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.C4300a0.m18632b(r2, r1)     // Catch:{ all -> 0x003f }
            boolean r1 = r5.mo17749c()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x002b:
            boolean r1 = r5.mo17751e()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.common.api.internal.BasePendingResult$a<R> r1 = r5.f12869b     // Catch:{ all -> 0x003f }
            com.google.android.gms.common.api.q r2 = r5.mo17813h()     // Catch:{ all -> 0x003f }
            r1.mo17754a(r6, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x003b:
            r5.f12873f = r6     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo17745a(com.google.android.gms.common.api.r):void");
    }

    @C4056a
    @Deprecated
    protected BasePendingResult(Looper looper) {
        this.f12868a = new Object();
        this.f12871d = new CountDownLatch(1);
        this.f12872e = new ArrayList<>();
        this.f12874g = new AtomicReference<>();
        this.f12882o = false;
        this.f12869b = new C4090a<>(looper);
        this.f12870c = new WeakReference<>(null);
    }

    @C4056a
    @C4476d0
    protected BasePendingResult(@C0193h0 C4090a<R> aVar) {
        this.f12868a = new Object();
        this.f12871d = new CountDownLatch(1);
        this.f12872e = new ArrayList<>();
        this.f12874g = new AtomicReference<>();
        this.f12882o = false;
        this.f12869b = (C4090a) C4300a0.m18621a(aVar, (Object) "CallbackHandler must not be null");
        this.f12870c = new WeakReference<>(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        return;
     */
    @com.google.android.gms.common.annotation.C4056a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17746a(com.google.android.gms.common.api.C4247r<? super R> r6, long r7, java.util.concurrent.TimeUnit r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12868a
            monitor-enter(r0)
            if (r6 != 0) goto L_0x000a
            r6 = 0
            r5.f12873f = r6     // Catch:{ all -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x000a:
            boolean r1 = r5.f12877j     // Catch:{ all -> 0x004d }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.String r4 = "Result has already been consumed."
            com.google.android.gms.common.internal.C4300a0.m18632b(r1, r4)     // Catch:{ all -> 0x004d }
            com.google.android.gms.common.api.internal.p2<R> r1 = r5.f12881n     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.C4300a0.m18632b(r2, r1)     // Catch:{ all -> 0x004d }
            boolean r1 = r5.mo17749c()     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x002b:
            boolean r1 = r5.mo17751e()     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x003b
            com.google.android.gms.common.api.internal.BasePendingResult$a<R> r7 = r5.f12869b     // Catch:{ all -> 0x004d }
            com.google.android.gms.common.api.q r8 = r5.mo17813h()     // Catch:{ all -> 0x004d }
            r7.mo17754a(r6, r8)     // Catch:{ all -> 0x004d }
            goto L_0x004b
        L_0x003b:
            r5.f12873f = r6     // Catch:{ all -> 0x004d }
            com.google.android.gms.common.api.internal.BasePendingResult$a<R> r6 = r5.f12869b     // Catch:{ all -> 0x004d }
            long r7 = r9.toMillis(r7)     // Catch:{ all -> 0x004d }
            r9 = 2
            android.os.Message r9 = r6.obtainMessage(r9, r5)     // Catch:{ all -> 0x004d }
            r6.sendMessageDelayed(r9, r7)     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x004d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo17746a(com.google.android.gms.common.api.r, long, java.util.concurrent.TimeUnit):void");
    }

    /* renamed from: a */
    public final void mo17743a(C4238a aVar) {
        C4300a0.m18628a(aVar != null, (Object) "Callback cannot be null.");
        synchronized (this.f12868a) {
            if (mo17751e()) {
                aVar.mo17820a(this.f12876i);
            } else {
                this.f12872e.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public <S extends C4246q> C4250u<S> mo17741a(C4249t<? super R, ? extends S> tVar) {
        C4250u<S> a;
        C4300a0.m18632b(!this.f12877j, "Result has already been consumed.");
        synchronized (this.f12868a) {
            boolean z = false;
            C4300a0.m18632b(this.f12881n == null, "Cannot call then() twice.");
            C4300a0.m18632b(this.f12873f == null, "Cannot call then() if callbacks are set.");
            if (!this.f12878k) {
                z = true;
            }
            C4300a0.m18632b(z, "Cannot call then() if result was canceled.");
            this.f12882o = true;
            this.f12881n = new C4183p2<>(this.f12870c);
            a = this.f12881n.mo17945a(tVar);
            if (mo17751e()) {
                this.f12869b.mo17754a(this.f12881n, mo17813h());
            } else {
                this.f12873f = this.f12881n;
            }
        }
        return a;
    }

    @C4056a
    /* renamed from: a */
    public final void mo17744a(R r) {
        synchronized (this.f12868a) {
            if (this.f12879l || this.f12878k) {
                m17676c((C4246q) r);
                return;
            }
            mo17751e();
            boolean z = true;
            C4300a0.m18632b(!mo17751e(), "Results have already been set");
            if (this.f12877j) {
                z = false;
            }
            C4300a0.m18632b(z, "Result has already been consumed");
            mo17812b(r);
        }
    }

    /* renamed from: a */
    public final void mo17742a(C4214v2 v2Var) {
        this.f12874g.set(v2Var);
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public final void mo17747a(C4380q qVar) {
        synchronized (this.f12868a) {
            this.f12880m = qVar;
        }
    }
}
