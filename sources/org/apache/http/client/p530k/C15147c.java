package org.apache.http.client.p530k;

import org.apache.http.C15133c;
import org.apache.http.C15423j;
import org.apache.http.C15452k;
import org.apache.http.client.p533n.C15170a;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p549j0.C15430e;

@C6145c
/* renamed from: org.apache.http.client.k.c */
/* compiled from: HttpEntityEnclosingRequestBase */
public abstract class C15147c extends C15153i implements C15452k {

    /* renamed from: S */
    private C15423j f44006S;

    /* renamed from: a */
    public void mo46949a(C15423j jVar) {
        this.f44006S = jVar;
    }

    public Object clone() throws CloneNotSupportedException {
        C15147c cVar = (C15147c) super.clone();
        C15423j jVar = this.f44006S;
        if (jVar != null) {
            cVar.f44006S = (C15423j) C15170a.m67276a(jVar);
        }
        return cVar;
    }

    /* renamed from: g */
    public C15423j mo46951g() {
        return this.f44006S;
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
}
