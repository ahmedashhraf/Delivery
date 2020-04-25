package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.http.C15133c;
import org.apache.http.C15460l;
import org.apache.http.C15463o;
import org.apache.http.C15466r;
import org.apache.http.ProtocolException;
import org.apache.http.client.C15140f;
import org.apache.http.client.CircularRedirectException;
import org.apache.http.client.p531l.C15158c;
import org.apache.http.client.p533n.C15175f;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p549j0.C15429d;
import org.apache.http.p549j0.C15431f;

@C6144b
/* renamed from: org.apache.http.impl.client.k */
/* compiled from: DefaultRedirectHandler */
public class C15379k implements C15140f {

    /* renamed from: b */
    private static final String f44482b = "http.protocol.redirect-locations";

    /* renamed from: a */
    private final C15089a f44483a = C15096h.m66940c(C15379k.class);

    /* renamed from: a */
    public boolean mo46942a(C15466r rVar, C15431f fVar) {
        if (rVar != null) {
            int c = rVar.mo47468l().mo46913c();
            boolean z = true;
            if (c != 307) {
                switch (c) {
                    case 301:
                    case 302:
                        break;
                    case 303:
                        return true;
                    default:
                        return false;
                }
            }
            String e = ((C15463o) fVar.mo47685a(C15429d.f44565b)).mo46956h().mo46855e();
            if (!e.equalsIgnoreCase("GET") && !e.equalsIgnoreCase("HEAD")) {
                z = false;
            }
            return z;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    /* renamed from: b */
    public URI mo46943b(C15466r rVar, C15431f fVar) throws ProtocolException {
        URI uri;
        if (rVar != null) {
            C15133c f = rVar.mo47426f("location");
            if (f != null) {
                String value = f.getValue();
                String str = "'";
                if (this.f44483a.mo46785d()) {
                    C15089a aVar = this.f44483a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Redirect requested to location '");
                    sb.append(value);
                    sb.append(str);
                    aVar.mo46776a(sb.toString());
                }
                try {
                    URI uri2 = new URI(value);
                    C15357i params = rVar.getParams();
                    if (!uri2.isAbsolute()) {
                        if (!params.mo47545e(C15158c.f44024e)) {
                            C15460l lVar = (C15460l) fVar.mo47685a(C15429d.f44567d);
                            if (lVar != null) {
                                try {
                                    uri2 = C15175f.m67287a(C15175f.m67289a(new URI(((C15463o) fVar.mo47685a(C15429d.f44565b)).mo46956h().mo46856f()), lVar, true), uri2);
                                } catch (URISyntaxException e) {
                                    throw new ProtocolException(e.getMessage(), e);
                                }
                            } else {
                                throw new IllegalStateException("Target host not available in the HTTP context");
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Relative redirect location '");
                            sb2.append(uri2);
                            sb2.append("' not allowed");
                            throw new ProtocolException(sb2.toString());
                        }
                    }
                    if (params.mo47544c(C15158c.f44026g)) {
                        String str2 = f44482b;
                        C15385q qVar = (C15385q) fVar.mo47685a(str2);
                        if (qVar == null) {
                            qVar = new C15385q();
                            fVar.mo47686a(str2, qVar);
                        }
                        if (uri2.getFragment() != null) {
                            try {
                                uri = C15175f.m67289a(uri2, new C15460l(uri2.getHost(), uri2.getPort(), uri2.getScheme()), true);
                            } catch (URISyntaxException e2) {
                                throw new ProtocolException(e2.getMessage(), e2);
                            }
                        } else {
                            uri = uri2;
                        }
                        if (!qVar.mo47654b(uri)) {
                            qVar.mo47653a(uri);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Circular redirect to '");
                            sb3.append(uri);
                            sb3.append(str);
                            throw new CircularRedirectException(sb3.toString());
                        }
                    }
                    return uri2;
                } catch (URISyntaxException e3) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid redirect URI: ");
                    sb4.append(value);
                    throw new ProtocolException(sb4.toString(), e3);
                }
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Received redirect response ");
                sb5.append(rVar.mo47468l());
                sb5.append(" but no location header");
                throw new ProtocolException(sb5.toString());
            }
        } else {
            throw new IllegalArgumentException("HTTP response may not be null");
        }
    }
}
