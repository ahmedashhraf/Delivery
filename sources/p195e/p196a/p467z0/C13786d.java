package p195e.p196a.p467z0;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12321v;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p200j.C13752i;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.z0.d */
/* compiled from: DisposableMaybeObserver */
public abstract class C13786d<T> implements C12321v<T>, C12314c {

    /* renamed from: a */
    final AtomicReference<C12314c> f39834a = new AtomicReference<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo43252a() {
    }

    /* renamed from: a */
    public final void mo41931a(@C5937f C12314c cVar) {
        if (C13752i.m58718a(this.f39834a, cVar, C13786d.class)) {
            mo43252a();
        }
    }

    /* renamed from: d */
    public final boolean mo41878d() {
        return this.f39834a.get() == C12347d.DISPOSED;
    }

    public final void dispose() {
        C12347d.m55465a(this.f39834a);
    }
}
