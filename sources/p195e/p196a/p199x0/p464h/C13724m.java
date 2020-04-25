package p195e.p196a.p199x0.p464h;

import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13768u;
import p195e.p196a.p199x0.p200j.C13769v;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.h.m */
/* compiled from: QueueDrainSubscriber */
public abstract class C13724m<T, U, V> extends C13728q implements C12297q<T>, C13768u<U, V> {

    /* renamed from: G0 */
    protected final C14062c<? super V> f39705G0;
    /* access modifiers changed from: protected */

    /* renamed from: H0 */
    public final C12405n<U> f39706H0;
    /* access modifiers changed from: protected */

    /* renamed from: I0 */
    public volatile boolean f39707I0;

    /* renamed from: J0 */
    protected volatile boolean f39708J0;

    /* renamed from: K0 */
    protected Throwable f39709K0;

    public C13724m(C14062c<? super V> cVar, C12405n<U> nVar) {
        this.f39705G0 = cVar;
        this.f39706H0 = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43106a(U u, boolean z, C12314c cVar) {
        C14062c<? super V> cVar2 = this.f39705G0;
        C12405n<U> nVar = this.f39706H0;
        if (mo43113g()) {
            long j = this.f39740q0.get();
            if (j != 0) {
                if (mo42398a(cVar2, u) && j != Long.MAX_VALUE) {
                    mo43105a(1);
                }
                if (mo43103a(-1) == 0) {
                    return;
                }
            } else {
                cVar.dispose();
                cVar2.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
        } else {
            nVar.offer(u);
            if (!mo43109b()) {
                return;
            }
        }
        C13769v.m58782a(nVar, cVar2, z, cVar, (C13768u<T, U>) this);
    }

    /* renamed from: a */
    public boolean mo42398a(C14062c<? super V> cVar, U u) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo43109b() {
        return this.f39756a0.getAndIncrement() == 0;
    }

    /* renamed from: c */
    public final boolean mo43110c() {
        return this.f39708J0;
    }

    /* renamed from: e */
    public final boolean mo43111e() {
        return this.f39707I0;
    }

    /* renamed from: f */
    public final Throwable mo43112f() {
        return this.f39709K0;
    }

    /* renamed from: g */
    public final boolean mo43113g() {
        return this.f39756a0.get() == 0 && this.f39756a0.compareAndSet(0, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo43108b(U u, boolean z, C12314c cVar) {
        C14062c<? super V> cVar2 = this.f39705G0;
        C12405n<U> nVar = this.f39706H0;
        if (mo43113g()) {
            long j = this.f39740q0.get();
            if (j == 0) {
                this.f39707I0 = true;
                cVar.dispose();
                cVar2.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else if (nVar.isEmpty()) {
                if (mo42398a(cVar2, u) && j != Long.MAX_VALUE) {
                    mo43105a(1);
                }
                if (mo43103a(-1) == 0) {
                    return;
                }
            } else {
                nVar.offer(u);
            }
        } else {
            nVar.offer(u);
            if (!mo43109b()) {
                return;
            }
        }
        C13769v.m58782a(nVar, cVar2, z, cVar, (C13768u<T, U>) this);
    }

    /* renamed from: a */
    public final int mo43103a(int i) {
        return this.f39756a0.addAndGet(i);
    }

    /* renamed from: a */
    public final long mo43104a() {
        return this.f39740q0.get();
    }

    /* renamed from: a */
    public final long mo43105a(long j) {
        return this.f39740q0.addAndGet(-j);
    }

    /* renamed from: b */
    public final void mo43107b(long j) {
        if (C13742j.m58678b(j)) {
            C13747d.m58696a(this.f39740q0, j);
        }
    }
}
