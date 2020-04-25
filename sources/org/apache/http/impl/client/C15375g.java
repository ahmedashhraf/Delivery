package org.apache.http.impl.client;

import org.apache.http.C15236d;
import org.apache.http.C15466r;
import org.apache.http.conn.C15183g;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p547h0.C15327d;
import org.apache.http.p549j0.C15430e;
import org.apache.http.p549j0.C15431f;

@C6144b
/* renamed from: org.apache.http.impl.client.g */
/* compiled from: DefaultConnectionKeepAliveStrategy */
public class C15375g implements C15183g {
    /* renamed from: a */
    public long mo46999a(C15466r rVar, C15431f fVar) {
        if (rVar != null) {
            C15327d dVar = new C15327d(rVar.mo47413a(C15430e.f44590q));
            while (dVar.hasNext()) {
                C15236d nextElement = dVar.nextElement();
                String name = nextElement.getName();
                String value = nextElement.getValue();
                if (value != null && name.equalsIgnoreCase("timeout")) {
                    try {
                        return Long.parseLong(value) * 1000;
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }
}
