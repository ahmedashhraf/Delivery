package org.apache.http.p541f0.p545o;

import java.io.IOException;
import org.apache.http.C15462n;
import org.apache.http.C15467s;
import org.apache.http.HttpException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ParseException;
import org.apache.http.p546g0.C15321e;
import org.apache.http.p547h0.C15346w;
import org.apache.http.p547h0.C15347x;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.f0.o.k */
/* compiled from: HttpResponseParser */
public class C15309k extends C15299a {

    /* renamed from: e */
    private final C15467s f44352e;

    /* renamed from: f */
    private final C15454b f44353f;

    public C15309k(C15321e eVar, C15346w wVar, C15467s sVar, C15357i iVar) {
        super(eVar, wVar, iVar);
        if (sVar != null) {
            this.f44352e = sVar;
            this.f44353f = new C15454b(128);
            return;
        }
        throw new IllegalArgumentException("Response factory may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15462n mo47259a(C15321e eVar) throws IOException, HttpException, ParseException {
        this.f44353f.mo47768c();
        if (eVar.mo47265a(this.f44353f) != -1) {
            return this.f44352e.mo47212a(this.f44308d.mo47484b(this.f44353f, new C15347x(0, this.f44353f.mo47772f())), null);
        }
        throw new NoHttpResponseException("The target server failed to respond");
    }
}
