package org.apache.http.client.p531l;

import org.apache.http.p224d0.C6144b;
import org.apache.http.p548i0.C15357i;

@C6144b
/* renamed from: org.apache.http.client.l.f */
/* compiled from: HttpClientParams */
public class C15161f {
    private C15161f() {
    }

    /* renamed from: a */
    public static void m67260a(C15357i iVar, boolean z) {
        if (iVar != null) {
            iVar.mo47539a(C15158c.f44027h, z);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: b */
    public static void m67261b(C15357i iVar, boolean z) {
        if (iVar != null) {
            iVar.mo47539a(C15158c.f44023d, z);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: c */
    public static boolean m67263c(C15357i iVar) {
        if (iVar != null) {
            return iVar.mo47543b(C15158c.f44023d, true);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: a */
    public static String m67258a(C15357i iVar) {
        if (iVar != null) {
            String str = (String) iVar.mo47549b(C15158c.f44028i);
            return str == null ? C15160e.f44036e : str;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: b */
    public static boolean m67262b(C15357i iVar) {
        if (iVar != null) {
            return iVar.mo47543b(C15158c.f44027h, true);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: a */
    public static void m67259a(C15357i iVar, String str) {
        if (iVar != null) {
            iVar.mo47546a(C15158c.f44028i, (Object) str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
