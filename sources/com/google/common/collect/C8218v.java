package com.google.common.collect;

import com.google.common.base.C5827t;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import java.io.Serializable;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.v */
/* compiled from: ByFunctionOrdering */
final class C8218v<F, T> extends C8133r4<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: N */
    final C7380p<F, ? extends T> f22035N;

    /* renamed from: O */
    final C8133r4<T> f22036O;

    C8218v(C7380p<F, ? extends T> pVar, C8133r4<T> r4Var) {
        this.f22035N = (C7380p) C7397x.m35664a(pVar);
        this.f22036O = (C8133r4) C7397x.m35664a(r4Var);
    }

    public int compare(F f, F f2) {
        return this.f22036O.compare(this.f22035N.apply(f), this.f22035N.apply(f2));
    }

    public boolean equals(@C5952h Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8218v)) {
            return false;
        }
        C8218v vVar = (C8218v) obj;
        if (!this.f22035N.equals(vVar.f22035N) || !this.f22036O.equals(vVar.f22036O)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5827t.m25558a(this.f22035N, this.f22036O);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22036O);
        sb.append(".onResultOf(");
        sb.append(this.f22035N);
        sb.append(")");
        return sb.toString();
    }
}
