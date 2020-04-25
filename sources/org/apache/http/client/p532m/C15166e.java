package org.apache.http.client.p532m;

import com.google.api.client.http.C7304t;
import java.io.IOException;
import java.util.Collection;
import org.apache.http.C15133c;
import org.apache.http.C15463o;
import org.apache.http.C15465q;
import org.apache.http.HttpException;
import org.apache.http.client.p531l.C15158c;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p549j0.C15431f;

@C6144b
/* renamed from: org.apache.http.client.m.e */
/* compiled from: RequestDefaultHeaders */
public class C15166e implements C15465q {
    /* renamed from: a */
    public void mo46975a(C15463o oVar, C15431f fVar) throws HttpException, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (!oVar.mo46956h().mo46855e().equalsIgnoreCase(C7304t.f20665a)) {
            Collection<C15133c> collection = (Collection) oVar.getParams().mo47549b(C15158c.f44030k);
            if (collection != null) {
                for (C15133c a : collection) {
                    oVar.mo47415a(a);
                }
            }
        }
    }
}
