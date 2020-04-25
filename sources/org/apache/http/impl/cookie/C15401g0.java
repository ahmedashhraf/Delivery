package org.apache.http.impl.cookie;

import org.apache.http.cookie.C15222a;
import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15224c;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.C15232k;
import org.apache.http.cookie.C15233l;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.impl.cookie.g0 */
/* compiled from: RFC2965VersionAttributeHandler */
public class C15401g0 implements C15224c {
    /* renamed from: a */
    public void mo47114a(C15233l lVar, String str) throws MalformedCookieException {
        int i;
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str != null) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i >= 0) {
                lVar.mo47141a(i);
                return;
            }
            throw new MalformedCookieException("Invalid cookie version.");
        } else {
            throw new MalformedCookieException("Missing value for version attribute");
        }
    }

    /* renamed from: b */
    public boolean mo47115b(C15223b bVar, C15226e eVar) {
        return true;
    }

    /* renamed from: a */
    public void mo47113a(C15223b bVar, C15226e eVar) throws MalformedCookieException {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if ((bVar instanceof C15232k) && (bVar instanceof C15222a) && !((C15222a) bVar).mo47100g("version")) {
            throw new MalformedCookieException("Violates RFC 2965. Version attribute is required.");
        }
    }
}
