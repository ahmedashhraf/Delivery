package p195e.p196a.p443f1;

import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p200j.C13752i;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14063d;

/* renamed from: e.a.f1.a */
/* compiled from: DefaultSubscriber */
public abstract class C12270a<T> implements C12297q<T> {

    /* renamed from: a */
    private C14063d f35448a;

    /* renamed from: a */
    public final void mo41788a(C14063d dVar) {
        if (C13752i.m58717a(this.f35448a, dVar, getClass())) {
            this.f35448a = dVar;
            mo41995b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo41995b() {
        mo41994a(Long.MAX_VALUE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41994a(long j) {
        C14063d dVar = this.f35448a;
        if (dVar != null) {
            dVar.mo41813c(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41993a() {
        C14063d dVar = this.f35448a;
        this.f35448a = C13742j.CANCELLED;
        dVar.cancel();
    }
}
