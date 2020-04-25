package org.apache.http.conn.p534n;

import java.net.InetAddress;
import org.apache.http.C15460l;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p548i0.C15357i;

@C6144b
/* renamed from: org.apache.http.conn.n.j */
/* compiled from: ConnRouteParams */
public class C15200j implements C15198h {

    /* renamed from: L */
    public static final C15460l f44089L = new C15460l("127.0.0.255", 0, "no-host");

    /* renamed from: M */
    public static final C15202b f44090M = new C15202b(f44089L);

    private C15200j() {
    }

    /* renamed from: a */
    public static C15460l m67374a(C15357i iVar) {
        if (iVar != null) {
            C15460l lVar = (C15460l) iVar.mo47549b(C15198h.f44086q);
            if (lVar == null || !f44089L.equals(lVar)) {
                return lVar;
            }
            return null;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    /* renamed from: b */
    public static C15202b m67378b(C15357i iVar) {
        if (iVar != null) {
            C15202b bVar = (C15202b) iVar.mo47549b(C15198h.f44088s);
            if (bVar == null || !f44090M.equals(bVar)) {
                return bVar;
            }
            return null;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    /* renamed from: c */
    public static InetAddress m67379c(C15357i iVar) {
        if (iVar != null) {
            return (InetAddress) iVar.mo47549b(C15198h.f44087r);
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    /* renamed from: a */
    public static void m67377a(C15357i iVar, C15460l lVar) {
        if (iVar != null) {
            iVar.mo47546a(C15198h.f44086q, (Object) lVar);
            return;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    /* renamed from: a */
    public static void m67376a(C15357i iVar, C15202b bVar) {
        if (iVar != null) {
            iVar.mo47546a(C15198h.f44088s, (Object) bVar);
            return;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    /* renamed from: a */
    public static void m67375a(C15357i iVar, InetAddress inetAddress) {
        if (iVar != null) {
            iVar.mo47546a(C15198h.f44087r, (Object) inetAddress);
            return;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }
}
