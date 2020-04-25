package p195e.p196a.p447u0;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p450a.C12347d;

/* renamed from: e.a.u0.h */
/* compiled from: SerialDisposable */
public final class C12319h implements C12314c {

    /* renamed from: a */
    final AtomicReference<C12314c> f35497a;

    public C12319h() {
        this.f35497a = new AtomicReference<>();
    }

    /* renamed from: a */
    public boolean mo42077a(@C5938g C12314c cVar) {
        return C12347d.m55466a(this.f35497a, cVar);
    }

    /* renamed from: b */
    public boolean mo42078b(@C5938g C12314c cVar) {
        return C12347d.m55467b(this.f35497a, cVar);
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return C12347d.m55463a((C12314c) this.f35497a.get());
    }

    public void dispose() {
        C12347d.m55465a(this.f35497a);
    }

    @C5938g
    /* renamed from: a */
    public C12314c mo42076a() {
        C12314c cVar = (C12314c) this.f35497a.get();
        return cVar == C12347d.DISPOSED ? C12315d.m55413a() : cVar;
    }

    public C12319h(@C5938g C12314c cVar) {
        this.f35497a = new AtomicReference<>(cVar);
    }
}
