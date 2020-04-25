package org.apache.http.p541f0.p542m;

import java.io.IOException;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.http.C15462n;
import org.apache.http.C15467s;
import org.apache.http.HttpException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.ProtocolException;
import org.apache.http.conn.p534n.C15190a;
import org.apache.http.p224d0.C6146d;
import org.apache.http.p541f0.p545o.C15299a;
import org.apache.http.p546g0.C15321e;
import org.apache.http.p547h0.C15346w;
import org.apache.http.p547h0.C15347x;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p550k0.C15454b;

@C6146d
/* renamed from: org.apache.http.f0.m.g */
/* compiled from: DefaultResponseParser */
public class C15269g extends C15299a {

    /* renamed from: e */
    private final C15089a f44231e = C15096h.m66940c(C15269g.class);

    /* renamed from: f */
    private final C15467s f44232f;

    /* renamed from: g */
    private final C15454b f44233g;

    /* renamed from: h */
    private final int f44234h;

    public C15269g(C15321e eVar, C15346w wVar, C15467s sVar, C15357i iVar) {
        super(eVar, wVar, iVar);
        if (sVar != null) {
            this.f44232f = sVar;
            this.f44233g = new C15454b(128);
            this.f44234h = iVar.mo47541b(C15190a.f44077m, Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Response factory may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15462n mo47259a(C15321e eVar) throws IOException, HttpException {
        int i = 0;
        while (true) {
            this.f44233g.mo47768c();
            int a = eVar.mo47265a(this.f44233g);
            if (a == -1 && i == 0) {
                throw new NoHttpResponseException("The target server failed to respond");
            }
            C15347x xVar = new C15347x(0, this.f44233g.mo47772f());
            if (this.f44308d.mo47483a(this.f44233g, xVar)) {
                return this.f44232f.mo47212a(this.f44308d.mo47484b(this.f44233g, xVar), null);
            } else if (a != -1 && i < this.f44234h) {
                if (this.f44231e.mo46785d()) {
                    C15089a aVar = this.f44231e;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Garbage in response: ");
                    sb.append(this.f44233g.toString());
                    aVar.mo46776a(sb.toString());
                }
                i++;
            }
        }
        throw new ProtocolException("The server failed to respond with a valid HTTP response");
    }
}
