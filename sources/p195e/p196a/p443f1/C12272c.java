package p195e.p196a.p443f1;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p200j.C13752i;
import p195e.p196a.p199x0.p450a.C12349f;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;

/* renamed from: e.a.f1.c */
/* compiled from: ResourceSubscriber */
public abstract class C12272c<T> implements C12297q<T>, C12314c {

    /* renamed from: N */
    private final AtomicLong f35450N = new AtomicLong();

    /* renamed from: a */
    private final AtomicReference<C14063d> f35451a = new AtomicReference<>();

    /* renamed from: b */
    private final C12349f f35452b = new C12349f();

    /* renamed from: a */
    public final void mo42001a(C12314c cVar) {
        C12390b.m55563a(cVar, "resource is null");
        this.f35452b.mo42072b(cVar);
    }

    /* renamed from: d */
    public final boolean mo41878d() {
        return C13742j.m58672a((C14063d) this.f35451a.get());
    }

    public final void dispose() {
        if (C13742j.m58674a(this.f35451a)) {
            this.f35452b.dispose();
        }
    }

    /* renamed from: a */
    public final void mo41788a(C14063d dVar) {
        if (C13752i.m58719a(this.f35451a, dVar, C12272c.class)) {
            long andSet = this.f35450N.getAndSet(0);
            if (andSet != 0) {
                dVar.mo41813c(andSet);
            }
            mo41999a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo41999a() {
        mo42000a(Long.MAX_VALUE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo42000a(long j) {
        C13742j.m58671a(this.f35451a, this.f35450N, j);
    }
}
