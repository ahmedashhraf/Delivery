package org.apache.http.p549j0;

import com.google.api.client.http.C7304t;
import java.io.IOException;
import java.net.InetAddress;
import org.apache.http.C15323h;
import org.apache.http.C15460l;
import org.apache.http.C15461m;
import org.apache.http.C15463o;
import org.apache.http.C15465q;
import org.apache.http.C15471w;
import org.apache.http.C15473y;
import org.apache.http.HttpException;
import org.apache.http.ProtocolException;

/* renamed from: org.apache.http.j0.u */
/* compiled from: RequestTargetHost */
public class C15446u implements C15465q {
    /* renamed from: a */
    public void mo46975a(C15463o oVar, C15431f fVar) throws HttpException, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (fVar != null) {
            C15473y b = oVar.mo46956h().mo46854b();
            if (!oVar.mo46956h().mo46855e().equalsIgnoreCase(C7304t.f20665a) || !b.mo47796d(C15471w.f44688Q)) {
                String str = "Host";
                if (!oVar.mo47425e(str)) {
                    C15460l lVar = (C15460l) fVar.mo47685a(C15429d.f44567d);
                    if (lVar == null) {
                        C15323h hVar = (C15323h) fVar.mo47685a(C15429d.f44564a);
                        if (hVar instanceof C15461m) {
                            C15461m mVar = (C15461m) hVar;
                            InetAddress remoteAddress = mVar.getRemoteAddress();
                            int remotePort = mVar.getRemotePort();
                            if (remoteAddress != null) {
                                lVar = new C15460l(remoteAddress.getHostName(), remotePort);
                            }
                        }
                        if (lVar == null) {
                            if (!b.mo47796d(C15471w.f44688Q)) {
                                throw new ProtocolException("Target host missing");
                            }
                            return;
                        }
                    }
                    oVar.mo47414a(str, lVar.mo47786g());
                }
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }
}
