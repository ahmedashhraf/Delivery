package p195e.p196a.p467z0;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p199x0.p200j.C13752i;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.z0.c */
/* compiled from: DisposableCompletableObserver */
public abstract class C13785c implements C12268f, C12314c {

    /* renamed from: a */
    final AtomicReference<C12314c> f39833a = new AtomicReference<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo43251a() {
    }

    /* renamed from: a */
    public final void mo41921a(@C5937f C12314c cVar) {
        if (C13752i.m58718a(this.f39833a, cVar, C13785c.class)) {
            mo43251a();
        }
    }

    /* renamed from: d */
    public final boolean mo41878d() {
        return this.f39833a.get() == C12347d.DISPOSED;
    }

    public final void dispose() {
        C12347d.m55465a(this.f39833a);
    }
}
