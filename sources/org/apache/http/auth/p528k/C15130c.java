package org.apache.http.auth.p528k;

import org.apache.http.p224d0.C6144b;
import org.apache.http.p548i0.C15357i;

@C6144b
/* renamed from: org.apache.http.auth.k.c */
/* compiled from: AuthParams */
public final class C15130c {
    private C15130c() {
    }

    /* renamed from: a */
    public static String m67197a(C15357i iVar) {
        if (iVar != null) {
            String str = (String) iVar.mo47549b(C15128a.f44003a);
            return str == null ? "US-ASCII" : str;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: a */
    public static void m67198a(C15357i iVar, String str) {
        if (iVar != null) {
            iVar.mo47546a(C15128a.f44003a, (Object) str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
