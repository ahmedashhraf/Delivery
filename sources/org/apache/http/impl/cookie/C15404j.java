package org.apache.http.impl.cookie;

import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.C15233l;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.impl.cookie.j */
/* compiled from: BasicSecureHandler */
public class C15404j extends C15388a {
    /* renamed from: a */
    public void mo47114a(C15233l lVar, String str) throws MalformedCookieException {
        if (lVar != null) {
            lVar.mo47142a(true);
            return;
        }
        throw new IllegalArgumentException("Cookie may not be null");
    }

    /* renamed from: b */
    public boolean mo47115b(C15223b bVar, C15226e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            return !bVar.mo47104d() || eVar.mo47121d();
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }
}
