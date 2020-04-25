package org.apache.http.impl.client;

import java.io.IOException;
import org.apache.http.C15132b0;
import org.apache.http.C15423j;
import org.apache.http.C15466r;
import org.apache.http.client.C15142h;
import org.apache.http.client.HttpResponseException;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p550k0.C15456d;

@C6144b
/* renamed from: org.apache.http.impl.client.e */
/* compiled from: BasicResponseHandler */
public class C15373e implements C15142h<String> {
    /* renamed from: a */
    public String m68156a(C15466r rVar) throws HttpResponseException, IOException {
        C15132b0 l = rVar.mo47468l();
        if (l.mo46913c() < 300) {
            C15423j g = rVar.mo47466g();
            if (g == null) {
                return null;
            }
            return C15456d.m68500c(g);
        }
        throw new HttpResponseException(l.mo46913c(), l.mo46914d());
    }
}
