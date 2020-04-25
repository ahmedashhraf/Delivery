package org.apache.http.p548i0;

import org.apache.http.C15471w;
import org.apache.http.C15473y;

/* renamed from: org.apache.http.i0.k */
/* compiled from: HttpProtocolParams */
public final class C15359k implements C15352d {
    private C15359k() {
    }

    /* renamed from: a */
    public static String m68038a(C15357i iVar) {
        if (iVar != null) {
            String str = (String) iVar.mo47549b(C15352d.f44430F);
            return str == null ? "ISO-8859-1" : str;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: b */
    public static String m68042b(C15357i iVar) {
        if (iVar != null) {
            String str = (String) iVar.mo47549b(C15352d.f44429E);
            return str == null ? "US-ASCII" : str;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: c */
    public static String m68044c(C15357i iVar) {
        if (iVar != null) {
            return (String) iVar.mo47549b(C15352d.f44431G);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: d */
    public static C15473y m68046d(C15357i iVar) {
        if (iVar != null) {
            Object b = iVar.mo47549b(C15352d.f44428D);
            if (b == null) {
                return C15471w.f44689R;
            }
            return (C15473y) b;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: e */
    public static boolean m68047e(C15357i iVar) {
        if (iVar != null) {
            return iVar.mo47543b(C15352d.f44434J, false);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: a */
    public static void m68039a(C15357i iVar, String str) {
        if (iVar != null) {
            iVar.mo47546a(C15352d.f44430F, (Object) str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: b */
    public static void m68043b(C15357i iVar, String str) {
        if (iVar != null) {
            iVar.mo47546a(C15352d.f44429E, (Object) str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: c */
    public static void m68045c(C15357i iVar, String str) {
        if (iVar != null) {
            iVar.mo47546a(C15352d.f44431G, (Object) str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: a */
    public static void m68040a(C15357i iVar, C15473y yVar) {
        if (iVar != null) {
            iVar.mo47546a(C15352d.f44428D, (Object) yVar);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: a */
    public static void m68041a(C15357i iVar, boolean z) {
        if (iVar != null) {
            iVar.mo47539a(C15352d.f44434J, z);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
