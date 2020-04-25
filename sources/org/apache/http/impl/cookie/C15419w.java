package org.apache.http.impl.cookie;

import java.util.Locale;
import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15224c;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.C15233l;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.impl.cookie.w */
/* compiled from: RFC2109DomainHandler */
public class C15419w implements C15224c {
    /* renamed from: a */
    public void mo47114a(C15233l lVar, String str) throws MalformedCookieException {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str == null) {
            throw new MalformedCookieException("Missing value for domain attribute");
        } else if (str.trim().length() != 0) {
            lVar.mo47146e(str);
        } else {
            throw new MalformedCookieException("Blank value for domain attribute");
        }
    }

    /* renamed from: b */
    public boolean mo47115b(C15223b bVar, C15226e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            String a = eVar.mo47118a();
            String h = bVar.mo47111h();
            boolean z = false;
            if (h == null) {
                return false;
            }
            if (a.equals(h) || (h.startsWith(".") && a.endsWith(h))) {
                z = true;
            }
            return z;
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: a */
    public void mo47113a(C15223b bVar, C15226e eVar) throws MalformedCookieException {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            String a = eVar.mo47118a();
            String h = bVar.mo47111h();
            if (h == null) {
                throw new MalformedCookieException("Cookie domain may not be null");
            } else if (!h.equals(a)) {
                String str = "\"";
                String str2 = "Domain attribute \"";
                if (h.indexOf(46) == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(h);
                    sb.append("\" does not match the host \"");
                    sb.append(a);
                    sb.append(str);
                    throw new MalformedCookieException(sb.toString());
                } else if (h.startsWith(".")) {
                    int indexOf = h.indexOf(46, 1);
                    if (indexOf < 0 || indexOf == h.length() - 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(h);
                        sb2.append("\" violates RFC 2109: domain must contain an embedded dot");
                        throw new MalformedCookieException(sb2.toString());
                    }
                    String lowerCase = a.toLowerCase(Locale.ENGLISH);
                    if (!lowerCase.endsWith(h)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Illegal domain attribute \"");
                        sb3.append(h);
                        sb3.append("\". Domain of origin: \"");
                        sb3.append(lowerCase);
                        sb3.append(str);
                        throw new MalformedCookieException(sb3.toString());
                    } else if (lowerCase.substring(0, lowerCase.length() - h.length()).indexOf(46) != -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str2);
                        sb4.append(h);
                        sb4.append("\" violates RFC 2109: host minus domain may not contain any dots");
                        throw new MalformedCookieException(sb4.toString());
                    }
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str2);
                    sb5.append(h);
                    sb5.append("\" violates RFC 2109: domain must start with a dot");
                    throw new MalformedCookieException(sb5.toString());
                }
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }
}
