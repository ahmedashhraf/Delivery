package org.apache.http.impl.client;

import org.apache.http.C15133c;
import org.apache.http.C15423j;
import org.apache.http.C15452k;
import org.apache.http.ProtocolException;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p549j0.C15430e;

@C6145c
/* renamed from: org.apache.http.impl.client.o */
/* compiled from: EntityEnclosingRequestWrapper */
public class C15383o extends C15386r implements C15452k {

    /* renamed from: S */
    private C15423j f44503S;

    public C15383o(C15452k kVar) throws ProtocolException {
        super(kVar);
        this.f44503S = kVar.mo46951g();
    }

    /* renamed from: a */
    public void mo46949a(C15423j jVar) {
        this.f44503S = jVar;
    }

    /* renamed from: g */
    public C15423j mo46951g() {
        return this.f44503S;
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

    /* renamed from: q */
    public boolean mo47652q() {
        C15423j jVar = this.f44503S;
        return jVar == null || jVar.isRepeatable();
    }
}
