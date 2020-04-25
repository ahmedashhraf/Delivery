package org.apache.http.client.p532m;

import com.google.api.client.http.C7304t;
import java.io.IOException;
import org.apache.http.C15463o;
import org.apache.http.C15465q;
import org.apache.http.HttpException;
import org.apache.http.conn.C15187k;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p549j0.C15429d;
import org.apache.http.p549j0.C15430e;
import org.apache.http.p549j0.C15431f;

@C6144b
/* renamed from: org.apache.http.client.m.d */
/* compiled from: RequestClientConnControl */
public class C15165d implements C15465q {

    /* renamed from: a */
    private static final String f44050a = "Proxy-Connection";

    /* renamed from: a */
    public void mo46975a(C15463o oVar, C15431f fVar) throws HttpException, IOException {
        if (oVar != null) {
            boolean equalsIgnoreCase = oVar.mo46956h().mo46855e().equalsIgnoreCase(C7304t.f20665a);
            String str = C15430e.f44590q;
            String str2 = f44050a;
            if (equalsIgnoreCase) {
                oVar.mo47419b(str2, str);
                return;
            }
            C15187k kVar = (C15187k) fVar.mo47685a(C15429d.f44564a);
            if (kVar != null) {
                C15202b h = kVar.mo47020h();
                if (h.mo47049c() == 1 || h.mo47054f()) {
                    String str3 = "Connection";
                    if (!oVar.mo47425e(str3)) {
                        oVar.mo47414a(str3, str);
                    }
                }
                if (h.mo47049c() == 2 && !h.mo47054f() && !oVar.mo47425e(str2)) {
                    oVar.mo47414a(str2, str);
                }
                return;
            }
            throw new IllegalStateException("Client connection not specified in HTTP context");
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }
}
