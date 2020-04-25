package org.apache.http.impl.cookie;

import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15224c;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.C15233l;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.impl.cookie.f */
/* compiled from: BasicDomainHandler */
public class C15398f implements C15224c {
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
            if (a.equals(h)) {
                return true;
            }
            if (!h.startsWith(".")) {
                StringBuilder sb = new StringBuilder();
                sb.append('.');
                sb.append(h);
                h = sb.toString();
            }
            if (a.endsWith(h) || a.equals(h.substring(1))) {
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
            if (h != null) {
                String str = ".";
                String str2 = "\"";
                String str3 = "\". Domain of origin: \"";
                String str4 = "Illegal domain attribute \"";
                if (a.contains(str)) {
                    if (!a.endsWith(h)) {
                        if (h.startsWith(str)) {
                            h = h.substring(1, h.length());
                        }
                        if (!a.equals(h)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str4);
                            sb.append(h);
                            sb.append(str3);
                            sb.append(a);
                            sb.append(str2);
                            throw new MalformedCookieException(sb.toString());
                        }
                    }
                } else if (!a.equals(h)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str4);
                    sb2.append(h);
                    sb2.append(str3);
                    sb2.append(a);
                    sb2.append(str2);
                    throw new MalformedCookieException(sb2.toString());
                }
            } else {
                throw new MalformedCookieException("Cookie domain may not be null");
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }
}
