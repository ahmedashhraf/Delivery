package org.apache.http.p541f0.p544n;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.C15423j;
import org.apache.http.C15462n;
import org.apache.http.HttpException;
import org.apache.http.p540e0.C15242e;
import org.apache.http.p541f0.p545o.C15304f;
import org.apache.http.p541f0.p545o.C15306h;
import org.apache.http.p541f0.p545o.C15313o;
import org.apache.http.p546g0.C15322f;

/* renamed from: org.apache.http.f0.n.b */
/* compiled from: EntitySerializer */
public class C15296b {

    /* renamed from: a */
    private final C15242e f44304a;

    public C15296b(C15242e eVar) {
        if (eVar != null) {
            this.f44304a = eVar;
            return;
        }
        throw new IllegalArgumentException("Content length strategy may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public OutputStream mo47365a(C15322f fVar, C15462n nVar) throws HttpException, IOException {
        long a = this.f44304a.mo47169a(nVar);
        if (a == -2) {
            return new C15304f(fVar);
        }
        if (a == -1) {
            return new C15313o(fVar);
        }
        return new C15306h(fVar, a);
    }

    /* renamed from: a */
    public void mo47366a(C15322f fVar, C15462n nVar, C15423j jVar) throws HttpException, IOException {
        if (fVar == null) {
            throw new IllegalArgumentException("Session output buffer may not be null");
        } else if (nVar == null) {
            throw new IllegalArgumentException("HTTP message may not be null");
        } else if (jVar != null) {
            OutputStream a = mo47365a(fVar, nVar);
            jVar.writeTo(a);
            a.close();
        } else {
            throw new IllegalArgumentException("HTTP entity may not be null");
        }
    }
}
