package org.apache.http.impl.cookie;

import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.C15233l;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.impl.cookie.z */
/* compiled from: RFC2109VersionHandler */
public class C15422z extends C15388a {
    /* renamed from: a */
    public void mo47114a(C15233l lVar, String str) throws MalformedCookieException {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str == null) {
            throw new MalformedCookieException("Missing value for version attribute");
        } else if (str.trim().length() != 0) {
            try {
                lVar.mo47141a(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid version: ");
                sb.append(e.getMessage());
                throw new MalformedCookieException(sb.toString());
            }
        } else {
            throw new MalformedCookieException("Blank value for version attribute");
        }
    }

    /* renamed from: a */
    public void mo47113a(C15223b bVar, C15226e eVar) throws MalformedCookieException {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (bVar.mo47102b() < 0) {
            throw new MalformedCookieException("Cookie version may not be negative");
        }
    }
}
