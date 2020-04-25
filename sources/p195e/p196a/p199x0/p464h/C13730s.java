package p195e.p196a.p199x0.p464h;

import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.h.s */
/* compiled from: SinglePostCompleteSubscriber */
public abstract class C13730s<T, R> extends AtomicLong implements C12297q<T>, C14063d {

    /* renamed from: P */
    static final long f39757P = Long.MIN_VALUE;

    /* renamed from: Q */
    static final long f39758Q = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;

    /* renamed from: N */
    protected R f39759N;

    /* renamed from: O */
    protected long f39760O;

    /* renamed from: a */
    protected final C14062c<? super R> f39761a;

    /* renamed from: b */
    protected C14063d f39762b;

    public C13730s(C14062c<? super R> cVar) {
        this.f39761a = cVar;
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        if (C13742j.m58673a(this.f39762b, dVar)) {
            this.f39762b = dVar;
            this.f39761a.mo41788a((C14063d) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo43114c(R r) {
        long j = this.f39760O;
        if (j != 0) {
            C13747d.m58699c(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                mo42290d(r);
                return;
            } else if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.f39761a.mo41789a(r);
                this.f39761a.onComplete();
                return;
            } else {
                this.f39759N = r;
                if (!compareAndSet(0, Long.MIN_VALUE)) {
                    this.f39759N = null;
                } else {
                    return;
                }
            }
        }
    }

    public void cancel() {
        this.f39762b.cancel();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo42290d(R r) {
    }

    /* renamed from: c */
    public final void mo41813c(long j) {
        long j2;
        if (C13742j.m58678b(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.f39761a.mo41789a(this.f39759N);
                        this.f39761a.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, C13747d.m58695a(j2, j)));
            this.f39762b.mo41813c(j);
        }
    }
}
