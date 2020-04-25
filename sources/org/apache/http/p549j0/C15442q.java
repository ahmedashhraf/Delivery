package org.apache.http.p549j0;

import com.google.api.client.http.C7304t;
import java.io.IOException;
import org.apache.http.C15463o;
import org.apache.http.C15465q;
import org.apache.http.HttpException;

/* renamed from: org.apache.http.j0.q */
/* compiled from: RequestConnControl */
public class C15442q implements C15465q {
    /* renamed from: a */
    public void mo46975a(C15463o oVar, C15431f fVar) throws HttpException, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (!oVar.mo46956h().mo46855e().equalsIgnoreCase(C7304t.f20665a)) {
            String str = "Connection";
            if (!oVar.mo47425e(str)) {
                oVar.mo47414a(str, C15430e.f44590q);
            }
        }
    }
}
