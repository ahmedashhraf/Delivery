package org.apache.http.p541f0.p544n;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.C15133c;
import org.apache.http.C15423j;
import org.apache.http.C15462n;
import org.apache.http.HttpException;
import org.apache.http.p540e0.C15239b;
import org.apache.http.p540e0.C15242e;
import org.apache.http.p541f0.p545o.C15303e;
import org.apache.http.p541f0.p545o.C15305g;
import org.apache.http.p541f0.p545o.C15312n;
import org.apache.http.p546g0.C15321e;

/* renamed from: org.apache.http.f0.n.a */
/* compiled from: EntityDeserializer */
public class C15295a {

    /* renamed from: a */
    private final C15242e f44303a;

    public C15295a(C15242e eVar) {
        if (eVar != null) {
            this.f44303a = eVar;
            return;
        }
        throw new IllegalArgumentException("Content length strategy may not be null");
    }

    /* renamed from: a */
    public C15423j mo47363a(C15321e eVar, C15462n nVar) throws HttpException, IOException {
        if (eVar == null) {
            throw new IllegalArgumentException("Session input buffer may not be null");
        } else if (nVar != null) {
            return mo47364b(eVar, nVar);
        } else {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C15239b mo47364b(C15321e eVar, C15462n nVar) throws HttpException, IOException {
        C15239b bVar = new C15239b();
        long a = this.f44303a.mo47169a(nVar);
        if (a == -2) {
            bVar.mo47160a(true);
            bVar.mo47166a(-1);
            bVar.mo47167a((InputStream) new C15303e(eVar));
        } else if (a == -1) {
            bVar.mo47160a(false);
            bVar.mo47166a(-1);
            bVar.mo47167a((InputStream) new C15312n(eVar));
        } else {
            bVar.mo47160a(false);
            bVar.mo47166a(a);
            bVar.mo47167a((InputStream) new C15305g(eVar, a));
        }
        C15133c f = nVar.mo47426f("Content-Type");
        if (f != null) {
            bVar.mo47163b(f);
        }
        C15133c f2 = nVar.mo47426f("Content-Encoding");
        if (f2 != null) {
            bVar.mo47159a(f2);
        }
        return bVar;
    }
}
