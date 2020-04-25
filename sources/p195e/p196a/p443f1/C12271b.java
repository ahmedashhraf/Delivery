package p195e.p196a.p443f1;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p200j.C13752i;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;

/* renamed from: e.a.f1.b */
/* compiled from: DisposableSubscriber */
public abstract class C12271b<T> implements C12297q<T>, C12314c {

    /* renamed from: a */
    final AtomicReference<C14063d> f35449a = new AtomicReference<>();

    /* renamed from: a */
    public final void mo41788a(C14063d dVar) {
        if (C13752i.m58719a(this.f35449a, dVar, getClass())) {
            mo41998c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41997b() {
        dispose();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo41998c() {
        ((C14063d) this.f35449a.get()).mo41813c(Long.MAX_VALUE);
    }

    /* renamed from: d */
    public final boolean mo41878d() {
        return this.f35449a.get() == C13742j.CANCELLED;
    }

    public final void dispose() {
        C13742j.m58674a(this.f35449a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41996a(long j) {
        ((C14063d) this.f35449a.get()).mo41813c(j);
    }
}
