package org.apache.http.p541f0.p542m;

import java.net.InetAddress;
import org.apache.http.C15460l;
import org.apache.http.C15463o;
import org.apache.http.HttpException;
import org.apache.http.conn.p534n.C15200j;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.conn.p535o.C15204d;
import org.apache.http.conn.p536p.C15213e;
import org.apache.http.p224d0.C6146d;
import org.apache.http.p549j0.C15431f;

@C6146d
/* renamed from: org.apache.http.f0.m.f */
/* compiled from: DefaultHttpRoutePlanner */
public class C15268f implements C15204d {

    /* renamed from: a */
    protected final C15213e f44230a;

    public C15268f(C15213e eVar) {
        if (eVar != null) {
            this.f44230a = eVar;
            return;
        }
        throw new IllegalArgumentException("SchemeRegistry must not be null.");
    }

    /* renamed from: a */
    public C15202b mo47061a(C15460l lVar, C15463o oVar, C15431f fVar) throws HttpException {
        C15202b bVar;
        if (oVar != null) {
            C15202b b = C15200j.m67378b(oVar.getParams());
            if (b != null) {
                return b;
            }
            if (lVar != null) {
                InetAddress c = C15200j.m67379c(oVar.getParams());
                C15460l a = C15200j.m67374a(oVar.getParams());
                boolean d = this.f44230a.mo47087b(lVar.mo47785f()).mo47078d();
                if (a == null) {
                    bVar = new C15202b(lVar, c, d);
                } else {
                    bVar = new C15202b(lVar, c, a, d);
                }
                return bVar;
            }
            throw new IllegalStateException("Target host must not be null.");
        }
        throw new IllegalStateException("Request must not be null.");
    }
}
