package p195e.p196a.p199x0.p465i;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.i.b */
/* compiled from: AsyncSubscription */
public final class C13734b extends AtomicLong implements C14063d, C12314c {
    private static final long serialVersionUID = 7028635084060361255L;

    /* renamed from: a */
    final AtomicReference<C14063d> f39771a;

    /* renamed from: b */
    final AtomicReference<C12314c> f39772b;

    public C13734b() {
        this.f39772b = new AtomicReference<>();
        this.f39771a = new AtomicReference<>();
    }

    /* renamed from: a */
    public boolean mo43119a(C12314c cVar) {
        return C12347d.m55466a(this.f39772b, cVar);
    }

    /* renamed from: b */
    public boolean mo43120b(C12314c cVar) {
        return C12347d.m55467b(this.f39772b, cVar);
    }

    /* renamed from: c */
    public void mo41813c(long j) {
        C13742j.m58671a(this.f39771a, (AtomicLong) this, j);
    }

    public void cancel() {
        dispose();
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return this.f39771a.get() == C13742j.CANCELLED;
    }

    public void dispose() {
        C13742j.m58674a(this.f39771a);
        C12347d.m55465a(this.f39772b);
    }

    /* renamed from: a */
    public void mo43118a(C14063d dVar) {
        C13742j.m58677a(this.f39771a, (AtomicLong) this, dVar);
    }

    public C13734b(C12314c cVar) {
        this();
        this.f39772b.lazySet(cVar);
    }
}
