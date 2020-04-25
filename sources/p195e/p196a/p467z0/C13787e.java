package p195e.p196a.p467z0;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p200j.C13752i;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.z0.e */
/* compiled from: DisposableObserver */
public abstract class C13787e<T> implements C12280i0<T>, C12314c {

    /* renamed from: a */
    final AtomicReference<C12314c> f39835a = new AtomicReference<>();

    /* renamed from: a */
    public final void mo34123a(@C5937f C12314c cVar) {
        if (C13752i.m58718a(this.f39835a, cVar, getClass())) {
            mo33575b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33575b() {
    }

    /* renamed from: d */
    public final boolean mo41878d() {
        return this.f39835a.get() == C12347d.DISPOSED;
    }

    public final void dispose() {
        C12347d.m55465a(this.f39835a);
    }
}
