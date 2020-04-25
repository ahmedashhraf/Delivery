package com.google.common.base;

import java.io.Serializable;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
@C2775a
/* renamed from: com.google.common.base.q */
/* compiled from: FunctionalEquivalence */
final class C7381q<F, T> extends C7359j<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final C7380p<F, ? extends T> f20839a;

    /* renamed from: b */
    private final C7359j<T> f20840b;

    C7381q(C7380p<F, ? extends T> pVar, C7359j<T> jVar) {
        this.f20839a = (C7380p) C7397x.m35664a(pVar);
        this.f20840b = (C7359j) C7397x.m35664a(jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29251a(F f, F f2) {
        return this.f20840b.mo29253b(this.f20839a.apply(f), this.f20839a.apply(f2));
    }

    public boolean equals(@C5952h Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7381q)) {
            return false;
        }
        C7381q qVar = (C7381q) obj;
        if (!this.f20839a.equals(qVar.f20839a) || !this.f20840b.equals(qVar.f20840b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5827t.m25558a(this.f20839a, this.f20840b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20840b);
        sb.append(".onResultOf(");
        sb.append(this.f20839a);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo29248a(F f) {
        return this.f20840b.mo29254c(this.f20839a.apply(f));
    }
}
