package p195e.p196a.p199x0.p453d;

import p195e.p196a.C12280i0;
import p195e.p196a.p199x0.p200j.C13765r;
import p195e.p196a.p199x0.p200j.C13769v;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.d.v */
/* compiled from: QueueDrainObserver */
public abstract class C12429v<T, U, V> extends C12431x implements C12280i0<T>, C13765r<U, V> {

    /* renamed from: q0 */
    protected final C12280i0<? super V> f35600q0;
    /* access modifiers changed from: protected */

    /* renamed from: r0 */
    public final C12405n<U> f35601r0;
    /* access modifiers changed from: protected */

    /* renamed from: s0 */
    public volatile boolean f35602s0;

    /* renamed from: t0 */
    protected volatile boolean f35603t0;

    /* renamed from: u0 */
    protected Throwable f35604u0;

    public C12429v(C12280i0<? super V> i0Var, C12405n<U> nVar) {
        this.f35600q0 = i0Var;
        this.f35601r0 = nVar;
    }

    /* renamed from: a */
    public void mo42184a(C12280i0<? super V> i0Var, U u) {
    }

    /* renamed from: a */
    public final boolean mo42186a() {
        return this.f35635a0.get() == 0 && this.f35635a0.compareAndSet(0, 1);
    }

    /* renamed from: b */
    public final boolean mo42188b() {
        return this.f35635a0.getAndIncrement() == 0;
    }

    /* renamed from: c */
    public final boolean mo42189c() {
        return this.f35603t0;
    }

    /* renamed from: e */
    public final boolean mo42190e() {
        return this.f35602s0;
    }

    /* renamed from: f */
    public final Throwable mo42191f() {
        return this.f35604u0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42185a(U u, boolean z, C12314c cVar) {
        C12280i0<? super V> i0Var = this.f35600q0;
        C12405n<U> nVar = this.f35601r0;
        if (this.f35635a0.get() != 0 || !this.f35635a0.compareAndSet(0, 1)) {
            nVar.offer(u);
            if (!mo42188b()) {
                return;
            }
        } else {
            mo42184a(i0Var, u);
            if (mo42183a(-1) == 0) {
                return;
            }
        }
        C13769v.m58781a(nVar, i0Var, z, cVar, (C13765r<T, U>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo42187b(U u, boolean z, C12314c cVar) {
        C12280i0<? super V> i0Var = this.f35600q0;
        C12405n<U> nVar = this.f35601r0;
        if (this.f35635a0.get() != 0 || !this.f35635a0.compareAndSet(0, 1)) {
            nVar.offer(u);
            if (!mo42188b()) {
                return;
            }
        } else if (nVar.isEmpty()) {
            mo42184a(i0Var, u);
            if (mo42183a(-1) == 0) {
                return;
            }
        } else {
            nVar.offer(u);
        }
        C13769v.m58781a(nVar, i0Var, z, cVar, (C13765r<T, U>) this);
    }

    /* renamed from: a */
    public final int mo42183a(int i) {
        return this.f35635a0.addAndGet(i);
    }
}
