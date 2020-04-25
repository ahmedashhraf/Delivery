package org.apache.http.p549j0;

import java.io.IOException;
import org.apache.http.C15133c;
import org.apache.http.C15423j;
import org.apache.http.C15463o;
import org.apache.http.C15466r;
import org.apache.http.C15468t;
import org.apache.http.C15471w;
import org.apache.http.C15473y;
import org.apache.http.HttpException;

/* renamed from: org.apache.http.j0.w */
/* compiled from: ResponseConnControl */
public class C15448w implements C15468t {
    /* renamed from: a */
    public void mo46976a(C15466r rVar, C15431f fVar) throws HttpException, IOException {
        if (rVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        } else if (fVar != null) {
            int c = rVar.mo47468l().mo46913c();
            String str = C15430e.f44589p;
            String str2 = "Connection";
            if (c == 400 || c == 408 || c == 411 || c == 413 || c == 414 || c == 503 || c == 501) {
                rVar.mo47419b(str2, str);
                return;
            }
            C15423j g = rVar.mo47466g();
            if (g != null) {
                C15473y b = rVar.mo47468l().mo46912b();
                if (g.getContentLength() < 0 && (!g.mo47164c() || b.mo47796d(C15471w.f44688Q))) {
                    rVar.mo47419b(str2, str);
                    return;
                }
            }
            C15463o oVar = (C15463o) fVar.mo47685a(C15429d.f44565b);
            if (oVar != null) {
                C15133c f = oVar.mo47426f(str2);
                if (f != null) {
                    rVar.mo47419b(str2, f.getValue());
                }
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }
}
