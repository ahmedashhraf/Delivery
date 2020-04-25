package org.apache.http.p549j0;

import java.io.IOException;
import org.apache.http.C15423j;
import org.apache.http.C15452k;
import org.apache.http.C15463o;
import org.apache.http.C15465q;
import org.apache.http.C15471w;
import org.apache.http.C15473y;
import org.apache.http.HttpException;
import org.apache.http.p548i0.C15359k;

/* renamed from: org.apache.http.j0.t */
/* compiled from: RequestExpectContinue */
public class C15445t implements C15465q {
    /* renamed from: a */
    public void mo46975a(C15463o oVar, C15431f fVar) throws HttpException, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (oVar instanceof C15452k) {
            C15423j g = ((C15452k) oVar).mo46951g();
            if (g != null && g.getContentLength() != 0) {
                C15473y b = oVar.mo46956h().mo46854b();
                if (C15359k.m68047e(oVar.getParams()) && !b.mo47796d(C15471w.f44688Q)) {
                    oVar.mo47414a("Expect", C15430e.f44588o);
                }
            }
        }
    }
}
