package org.apache.http.p547h0;

import org.apache.http.C15117a0;
import org.apache.http.C15133c;
import org.apache.http.C15423j;
import org.apache.http.C15452k;
import org.apache.http.C15473y;
import org.apache.http.p549j0.C15430e;

/* renamed from: org.apache.http.h0.h */
/* compiled from: BasicHttpEntityEnclosingRequest */
public class C15331h extends C15332i implements C15452k {

    /* renamed from: Q */
    private C15423j f44384Q;

    public C15331h(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: a */
    public void mo46949a(C15423j jVar) {
        this.f44384Q = jVar;
    }

    /* renamed from: g */
    public C15423j mo46951g() {
        return this.f44384Q;
    }

    /* renamed from: i */
    public boolean mo46952i() {
        C15133c f = mo47426f("Expect");
        if (f != null) {
            if (C15430e.f44588o.equalsIgnoreCase(f.getValue())) {
                return true;
            }
        }
        return false;
    }

    public C15331h(String str, String str2, C15473y yVar) {
        super(str, str2, yVar);
    }

    public C15331h(C15117a0 a0Var) {
        super(a0Var);
    }
}
