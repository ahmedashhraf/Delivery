package org.apache.http.p549j0;

import java.io.IOException;
import org.apache.http.C15452k;
import org.apache.http.C15463o;
import org.apache.http.C15465q;
import org.apache.http.HttpException;

/* renamed from: org.apache.http.j0.s */
/* compiled from: RequestDate */
public class C15444s implements C15465q {

    /* renamed from: a */
    private static final C15432g f44613a = new C15432g();

    /* renamed from: a */
    public void mo46975a(C15463o oVar, C15431f fVar) throws HttpException, IOException {
        if (oVar == null) {
            throw new IllegalArgumentException("HTTP request may not be null.");
        } else if (oVar instanceof C15452k) {
            String str = "Date";
            if (!oVar.mo47425e(str)) {
                oVar.mo47419b(str, f44613a.mo47715a());
            }
        }
    }
}
