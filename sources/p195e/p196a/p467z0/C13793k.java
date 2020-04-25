package p195e.p196a.p467z0;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12292n0;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p200j.C13752i;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12349f;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.z0.k */
/* compiled from: ResourceSingleObserver */
public abstract class C13793k<T> implements C12292n0<T>, C12314c {

    /* renamed from: a */
    private final AtomicReference<C12314c> f39843a = new AtomicReference<>();

    /* renamed from: b */
    private final C12349f f39844b = new C12349f();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo43260a() {
    }

    /* renamed from: a */
    public final void mo41974a(@C5937f C12314c cVar) {
        if (C13752i.m58718a(this.f39843a, cVar, C13793k.class)) {
            mo43260a();
        }
    }

    /* renamed from: b */
    public final void mo43261b(@C5937f C12314c cVar) {
        C12390b.m55563a(cVar, "resource is null");
        this.f39844b.mo42072b(cVar);
    }

    /* renamed from: d */
    public final boolean mo41878d() {
        return C12347d.m55463a((C12314c) this.f39843a.get());
    }

    public final void dispose() {
        if (C12347d.m55465a(this.f39843a)) {
            this.f39844b.dispose();
        }
    }
}
