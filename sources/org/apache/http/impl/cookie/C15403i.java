package org.apache.http.impl.cookie;

import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15224c;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.C15233l;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.impl.cookie.i */
/* compiled from: BasicPathHandler */
public class C15403i implements C15224c {
    /* renamed from: a */
    public void mo47114a(C15233l lVar, String str) throws MalformedCookieException {
        if (lVar != null) {
            if (str == null || str.trim().length() == 0) {
                str = "/";
            }
            lVar.mo47143b(str);
            return;
        }
        throw new IllegalArgumentException("Cookie may not be null");
    }

    /* renamed from: b */
    public boolean mo47115b(C15223b bVar, C15226e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            String b = eVar.mo47119b();
            String path = bVar.getPath();
            String str = "/";
            if (path == null) {
                path = str;
            }
            if (path.length() > 1 && path.endsWith(str)) {
                path = path.substring(0, path.length() - 1);
            }
            boolean startsWith = b.startsWith(path);
            if (!startsWith || b.length() == path.length() || path.endsWith(str)) {
                return startsWith;
            }
            return b.charAt(path.length()) == '/';
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: a */
    public void mo47113a(C15223b bVar, C15226e eVar) throws MalformedCookieException {
        if (!mo47115b(bVar, eVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal path attribute \"");
            sb.append(bVar.getPath());
            sb.append("\". Path of origin: \"");
            sb.append(eVar.mo47119b());
            sb.append("\"");
            throw new MalformedCookieException(sb.toString());
        }
    }
}
