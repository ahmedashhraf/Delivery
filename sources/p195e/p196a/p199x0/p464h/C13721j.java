package p195e.p196a.p199x0.p464h;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p200j.C13769v;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.h.j */
/* compiled from: InnerQueuedSubscriber */
public final class C13721j<T> extends AtomicReference<C14063d> implements C12297q<T>, C14063d {
    private static final long serialVersionUID = 22876611072430776L;

    /* renamed from: N */
    final int f39694N;

    /* renamed from: O */
    volatile C12406o<T> f39695O;

    /* renamed from: P */
    volatile boolean f39696P;

    /* renamed from: Q */
    long f39697Q;

    /* renamed from: R */
    int f39698R;

    /* renamed from: a */
    final C13722k<T> f39699a;

    /* renamed from: b */
    final int f39700b;

    public C13721j(C13722k<T> kVar, int i) {
        this.f39699a = kVar;
        this.f39700b = i;
        this.f39694N = i - (i >> 2);
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        if (C13742j.m58680c(this, dVar)) {
            if (dVar instanceof C12403l) {
                C12403l lVar = (C12403l) dVar;
                int a = lVar.mo41855a(3);
                if (a == 1) {
                    this.f39698R = a;
                    this.f39695O = lVar;
                    this.f39696P = true;
                    this.f39699a.mo42519a(this);
                    return;
                } else if (a == 2) {
                    this.f39698R = a;
                    this.f39695O = lVar;
                    C13769v.m58784a(dVar, this.f39700b);
                    return;
                }
            }
            this.f39695O = C13769v.m58780a(this.f39700b);
            C13769v.m58784a(dVar, this.f39700b);
        }
    }

    /* renamed from: c */
    public void mo41813c(long j) {
        if (this.f39698R != 1) {
            long j2 = this.f39697Q + j;
            if (j2 >= ((long) this.f39694N)) {
                this.f39697Q = 0;
                ((C14063d) get()).mo41813c(j2);
                return;
            }
            this.f39697Q = j2;
        }
    }

    public void cancel() {
        C13742j.m58674a((AtomicReference<C14063d>) this);
    }

    /* renamed from: d */
    public C12406o<T> mo43100d() {
        return this.f39695O;
    }

    /* renamed from: e */
    public void mo43101e() {
        if (this.f39698R != 1) {
            long j = this.f39697Q + 1;
            if (j == ((long) this.f39694N)) {
                this.f39697Q = 0;
                ((C14063d) get()).mo41813c(j);
                return;
            }
            this.f39697Q = j;
        }
    }

    /* renamed from: f */
    public void mo43102f() {
        this.f39696P = true;
    }

    public void onComplete() {
        this.f39699a.mo42519a(this);
    }

    public void onError(Throwable th) {
        this.f39699a.mo42521a(this, th);
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        if (this.f39698R == 0) {
            this.f39699a.mo42520a(this, t);
        } else {
            this.f39699a.mo42518a();
        }
    }

    /* renamed from: a */
    public boolean mo43099a() {
        return this.f39696P;
    }
}
