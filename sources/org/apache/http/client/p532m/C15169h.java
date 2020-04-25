package org.apache.http.client.p532m;

import java.io.IOException;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.http.C15133c;
import org.apache.http.C15250f;
import org.apache.http.C15466r;
import org.apache.http.C15468t;
import org.apache.http.HttpException;
import org.apache.http.client.C15136b;
import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.C15228g;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p549j0.C15431f;

@C6144b
/* renamed from: org.apache.http.client.m.h */
/* compiled from: ResponseProcessCookies */
public class C15169h implements C15468t {

    /* renamed from: a */
    private final C15089a f44053a = C15096h.m66940c(C15169h.class);

    /* renamed from: a */
    public void mo46976a(C15466r rVar, C15431f fVar) throws HttpException, IOException {
        if (rVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (fVar != null) {
            C15228g gVar = (C15228g) fVar.mo47685a(C15162a.f44039c);
            if (gVar != null) {
                C15136b bVar = (C15136b) fVar.mo47685a(C15162a.f44041e);
                if (bVar == null) {
                    this.f44053a.mo46779b("CookieStore not available in HTTP context");
                    return;
                }
                C15226e eVar = (C15226e) fVar.mo47685a(C15162a.f44040d);
                if (eVar == null) {
                    this.f44053a.mo46779b("CookieOrigin not available in HTTP context");
                    return;
                }
                m67274a(rVar.mo47413a("Set-Cookie"), gVar, eVar, bVar);
                if (gVar.mo47129b() > 0) {
                    m67274a(rVar.mo47413a("Set-Cookie2"), gVar, eVar, bVar);
                }
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }

    /* renamed from: a */
    private void m67274a(C15250f fVar, C15228g gVar, C15226e eVar, C15136b bVar) {
        String str = "\". ";
        while (fVar.hasNext()) {
            C15133c e = fVar.mo47173e();
            try {
                for (C15223b bVar2 : gVar.mo47126a(e, eVar)) {
                    try {
                        gVar.mo47128a(bVar2, eVar);
                        bVar.mo46925a(bVar2);
                        if (this.f44053a.mo46785d()) {
                            C15089a aVar = this.f44053a;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Cookie accepted: \"");
                            sb.append(bVar2);
                            sb.append(str);
                            aVar.mo46776a(sb.toString());
                        }
                    } catch (MalformedCookieException e2) {
                        if (this.f44053a.mo46778a()) {
                            C15089a aVar2 = this.f44053a;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Cookie rejected: \"");
                            sb2.append(bVar2);
                            sb2.append(str);
                            sb2.append(e2.getMessage());
                            aVar2.mo46783d(sb2.toString());
                        }
                    }
                }
            } catch (MalformedCookieException e3) {
                if (this.f44053a.mo46778a()) {
                    C15089a aVar3 = this.f44053a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid cookie header: \"");
                    sb3.append(e);
                    sb3.append(str);
                    sb3.append(e3.getMessage());
                    aVar3.mo46783d(sb3.toString());
                }
            }
        }
    }
}
