package bolts;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: bolts.j */
/* compiled from: CancellationTokenSource */
public class C2172j implements Closeable {

    /* renamed from: N */
    private final ScheduledExecutorService f8626N = C2167g.m11200d();
    /* access modifiers changed from: private */

    /* renamed from: O */
    public ScheduledFuture<?> f8627O;

    /* renamed from: P */
    private boolean f8628P;

    /* renamed from: Q */
    private boolean f8629Q;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f8630a = new Object();

    /* renamed from: b */
    private final List<C2171i> f8631b = new ArrayList();

    /* renamed from: bolts.j$a */
    /* compiled from: CancellationTokenSource */
    class C2173a implements Runnable {
        C2173a() {
        }

        public void run() {
            synchronized (C2172j.this.f8630a) {
                C2172j.this.f8627O = null;
            }
            C2172j.this.mo9289a();
        }
    }

    /* renamed from: g */
    private void m11212g() {
        ScheduledFuture<?> scheduledFuture = this.f8627O;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f8627O = null;
        }
    }

    /* renamed from: h */
    private void m11213h() {
        if (this.f8629Q) {
            throw new IllegalStateException("Object already closed");
        }
    }

    public void close() {
        synchronized (this.f8630a) {
            if (!this.f8629Q) {
                m11212g();
                for (C2171i close : this.f8631b) {
                    close.close();
                }
                this.f8631b.clear();
                this.f8629Q = true;
            }
        }
    }

    /* renamed from: d */
    public C2170h mo9293d() {
        C2170h hVar;
        synchronized (this.f8630a) {
            m11213h();
            hVar = new C2170h(this);
        }
        return hVar;
    }

    /* renamed from: e */
    public boolean mo9294e() {
        boolean z;
        synchronized (this.f8630a) {
            m11213h();
            z = this.f8628P;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo9295f() throws CancellationException {
        synchronized (this.f8630a) {
            m11213h();
            if (this.f8628P) {
                throw new CancellationException();
            }
        }
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[]{C2172j.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(mo9294e())});
    }

    /* renamed from: a */
    public void mo9289a() {
        synchronized (this.f8630a) {
            m11213h();
            if (!this.f8628P) {
                m11212g();
                this.f8628P = true;
                ArrayList arrayList = new ArrayList(this.f8631b);
                m11211a((List<C2171i>) arrayList);
            }
        }
    }

    /* renamed from: a */
    public void mo9290a(long j) {
        m11210a(j, TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11210a(long r6, java.util.concurrent.TimeUnit r8) {
        /*
            r5 = this;
            r0 = -1
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0032
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0010
            r5.mo9289a()
            return
        L_0x0010:
            java.lang.Object r2 = r5.f8630a
            monitor-enter(r2)
            boolean r3 = r5.f8628P     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x0019
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            return
        L_0x0019:
            r5.m11212g()     // Catch:{ all -> 0x002f }
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 == 0) goto L_0x002d
            java.util.concurrent.ScheduledExecutorService r0 = r5.f8626N     // Catch:{ all -> 0x002f }
            bolts.j$a r1 = new bolts.j$a     // Catch:{ all -> 0x002f }
            r1.<init>()     // Catch:{ all -> 0x002f }
            java.util.concurrent.ScheduledFuture r6 = r0.schedule(r1, r6, r8)     // Catch:{ all -> 0x002f }
            r5.f8627O = r6     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            throw r6
        L_0x0032:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Delay must be >= -1"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bolts.C2172j.m11210a(long, java.util.concurrent.TimeUnit):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2171i mo9288a(Runnable runnable) {
        C2171i iVar;
        synchronized (this.f8630a) {
            m11213h();
            iVar = new C2171i(this, runnable);
            if (this.f8628P) {
                iVar.mo9286a();
            } else {
                this.f8631b.add(iVar);
            }
        }
        return iVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9291a(C2171i iVar) {
        synchronized (this.f8630a) {
            m11213h();
            this.f8631b.remove(iVar);
        }
    }

    /* renamed from: a */
    private void m11211a(List<C2171i> list) {
        for (C2171i a : list) {
            a.mo9286a();
        }
    }
}
