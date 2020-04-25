package p195e.p196a.p199x0.p450a;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.a.g */
/* compiled from: SequentialDisposable */
public final class C12350g extends AtomicReference<C12314c> implements C12314c {
    private static final long serialVersionUID = -754898800686245608L;

    public C12350g() {
    }

    /* renamed from: a */
    public boolean mo42109a(C12314c cVar) {
        return C12347d.m55466a((AtomicReference<C12314c>) this, cVar);
    }

    /* renamed from: b */
    public boolean mo42110b(C12314c cVar) {
        return C12347d.m55467b(this, cVar);
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return C12347d.m55463a((C12314c) get());
    }

    public void dispose() {
        C12347d.m55465a((AtomicReference<C12314c>) this);
    }

    public C12350g(C12314c cVar) {
        lazySet(cVar);
    }
}
