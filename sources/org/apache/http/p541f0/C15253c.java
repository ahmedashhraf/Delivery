package org.apache.http.p541f0;

import org.apache.http.C15116a;
import org.apache.http.C15134c0;
import org.apache.http.C15250f;
import org.apache.http.C15323h;
import org.apache.http.C15423j;
import org.apache.http.C15466r;
import org.apache.http.C15471w;
import org.apache.http.C15473y;
import org.apache.http.ParseException;
import org.apache.http.p547h0.C15340q;
import org.apache.http.p549j0.C15429d;
import org.apache.http.p549j0.C15430e;
import org.apache.http.p549j0.C15431f;

/* renamed from: org.apache.http.f0.c */
/* compiled from: DefaultConnectionReuseStrategy */
public class C15253c implements C15116a {
    /* renamed from: a */
    public boolean mo46853a(C15466r rVar, C15431f fVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null.");
        } else if (fVar != null) {
            C15323h hVar = (C15323h) fVar.mo47685a(C15429d.f44564a);
            if (hVar != null && !hVar.isOpen()) {
                return false;
            }
            C15423j g = rVar.mo47466g();
            C15473y b = rVar.mo47468l().mo46912b();
            if (g != null && g.getContentLength() < 0 && (!g.mo47164c() || b.mo47796d(C15471w.f44688Q))) {
                return false;
            }
            C15250f a = rVar.mo47413a("Connection");
            if (!a.hasNext()) {
                a = rVar.mo47413a("Proxy-Connection");
            }
            if (a.hasNext()) {
                try {
                    C15134c0 a2 = mo47206a(a);
                    boolean z = false;
                    while (a2.hasNext()) {
                        String f = a2.mo46918f();
                        if (C15430e.f44589p.equalsIgnoreCase(f)) {
                            return false;
                        }
                        if (C15430e.f44590q.equalsIgnoreCase(f)) {
                            z = true;
                        }
                    }
                    if (z) {
                        return true;
                    }
                } catch (ParseException unused) {
                    return false;
                }
            }
            return !b.mo47796d(C15471w.f44688Q);
        } else {
            throw new IllegalArgumentException("HTTP context may not be null.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15134c0 mo47206a(C15250f fVar) {
        return new C15340q(fVar);
    }
}
