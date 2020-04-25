package org.apache.http.p541f0;

import org.apache.http.C15116a;
import org.apache.http.C15466r;
import org.apache.http.p549j0.C15431f;

/* renamed from: org.apache.http.f0.j */
/* compiled from: NoConnectionReuseStrategy */
public class C15260j implements C15116a {
    /* renamed from: a */
    public boolean mo46853a(C15466r rVar, C15431f fVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        } else if (fVar != null) {
            return false;
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }
}
