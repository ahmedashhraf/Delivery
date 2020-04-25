package org.apache.http.conn.p534n;

import org.apache.http.conn.p535o.C15202b;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p548i0.C15357i;

@C6144b
/* renamed from: org.apache.http.conn.n.e */
/* compiled from: ConnManagerParams */
public final class C15194e implements C15192c {

    /* renamed from: L */
    public static final int f44081L = 20;

    /* renamed from: M */
    private static final C15196f f44082M = new C15195a();

    /* renamed from: org.apache.http.conn.n.e$a */
    /* compiled from: ConnManagerParams */
    static class C15195a implements C15196f {
        C15195a() {
        }

        /* renamed from: a */
        public int mo47034a(C15202b bVar) {
            return 2;
        }
    }

    /* renamed from: a */
    public static void m67360a(C15357i iVar, long j) {
        if (iVar != null) {
            iVar.mo47542b(C15192c.f44078n, j);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: b */
    public static int m67362b(C15357i iVar) {
        if (iVar != null) {
            return iVar.mo47541b(C15192c.f44080p, 20);
        }
        throw new IllegalArgumentException("HTTP parameters must not be null.");
    }

    /* renamed from: c */
    public static long m67363c(C15357i iVar) {
        if (iVar != null) {
            return iVar.mo47536a(C15192c.f44078n, 0);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: a */
    public static void m67361a(C15357i iVar, C15196f fVar) {
        if (iVar != null) {
            iVar.mo47546a(C15192c.f44079o, (Object) fVar);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters must not be null.");
    }

    /* renamed from: a */
    public static C15196f m67358a(C15357i iVar) {
        if (iVar != null) {
            C15196f fVar = (C15196f) iVar.mo47549b(C15192c.f44079o);
            return fVar == null ? f44082M : fVar;
        }
        throw new IllegalArgumentException("HTTP parameters must not be null.");
    }

    /* renamed from: a */
    public static void m67359a(C15357i iVar, int i) {
        if (iVar != null) {
            iVar.mo47538a(C15192c.f44080p, i);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters must not be null.");
    }
}
