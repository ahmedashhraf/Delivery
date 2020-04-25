package org.apache.http.p541f0.p545o;

import java.io.IOException;
import org.apache.http.C15462n;
import org.apache.http.C15464p;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.ParseException;
import org.apache.http.p546g0.C15321e;
import org.apache.http.p547h0.C15346w;
import org.apache.http.p547h0.C15347x;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.f0.o.i */
/* compiled from: HttpRequestParser */
public class C15307i extends C15299a {

    /* renamed from: e */
    private final C15464p f44350e;

    /* renamed from: f */
    private final C15454b f44351f;

    public C15307i(C15321e eVar, C15346w wVar, C15464p pVar, C15357i iVar) {
        super(eVar, wVar, iVar);
        if (pVar != null) {
            this.f44350e = pVar;
            this.f44351f = new C15454b(128);
            return;
        }
        throw new IllegalArgumentException("Request factory may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15462n mo47259a(C15321e eVar) throws IOException, HttpException, ParseException {
        this.f44351f.mo47768c();
        if (eVar.mo47265a(this.f44351f) != -1) {
            return this.f44350e.mo47210a(this.f44308d.mo47486d(this.f44351f, new C15347x(0, this.f44351f.mo47772f())));
        }
        throw new ConnectionClosedException("Client closed connection");
    }
}
