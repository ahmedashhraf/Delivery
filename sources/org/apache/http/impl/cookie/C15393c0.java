package org.apache.http.impl.cookie;

import java.util.Locale;
import org.apache.http.cookie.C15222a;
import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15224c;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.C15233l;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.impl.cookie.c0 */
/* compiled from: RFC2965DomainAttributeHandler */
public class C15393c0 implements C15224c {
    /* renamed from: a */
    public void mo47114a(C15233l lVar, String str) throws MalformedCookieException {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str == null) {
            throw new MalformedCookieException("Missing value for domain attribute");
        } else if (str.trim().length() != 0) {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            if (!lowerCase.startsWith(".")) {
                StringBuilder sb = new StringBuilder();
                sb.append('.');
                sb.append(lowerCase);
                lowerCase = sb.toString();
            }
            lVar.mo47146e(lowerCase);
        } else {
            throw new MalformedCookieException("Blank value for domain attribute");
        }
    }

    /* renamed from: b */
    public boolean mo47115b(C15223b bVar, C15226e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            String lowerCase = eVar.mo47118a().toLowerCase(Locale.ENGLISH);
            String h = bVar.mo47111h();
            boolean z = false;
            if (!mo47670a(lowerCase, h)) {
                return false;
            }
            if (lowerCase.substring(0, lowerCase.length() - h.length()).indexOf(46) == -1) {
                z = true;
            }
            return z;
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: a */
    public boolean mo47670a(String str, String str2) {
        return str.equals(str2) || (str2.startsWith(".") && str.endsWith(str2));
    }

    /* renamed from: a */
    public void mo47113a(C15223b bVar, C15226e eVar) throws MalformedCookieException {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            String lowerCase = eVar.mo47118a().toLowerCase(Locale.ENGLISH);
            if (bVar.mo47111h() != null) {
                String lowerCase2 = bVar.mo47111h().toLowerCase(Locale.ENGLISH);
                if ((bVar instanceof C15222a) && ((C15222a) bVar).mo47100g(C15222a.f44142x)) {
                    String str = "Domain attribute \"";
                    if (lowerCase2.startsWith(".")) {
                        int indexOf = lowerCase2.indexOf(46, 1);
                        if ((indexOf < 0 || indexOf == lowerCase2.length() - 1) && !lowerCase2.equals(".local")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(bVar.mo47111h());
                            sb.append("\" violates RFC 2965: the value contains no embedded dots ");
                            sb.append("and the value is not .local");
                            throw new MalformedCookieException(sb.toString());
                        } else if (!mo47670a(lowerCase, lowerCase2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(bVar.mo47111h());
                            sb2.append("\" violates RFC 2965: effective host name does not ");
                            sb2.append("domain-match domain attribute.");
                            throw new MalformedCookieException(sb2.toString());
                        } else if (lowerCase.substring(0, lowerCase.length() - lowerCase2.length()).indexOf(46) != -1) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str);
                            sb3.append(bVar.mo47111h());
                            sb3.append("\" violates RFC 2965: ");
                            sb3.append("effective host minus domain may not contain any dots");
                            throw new MalformedCookieException(sb3.toString());
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str);
                        sb4.append(bVar.mo47111h());
                        sb4.append("\" violates RFC 2109: domain must start with a dot");
                        throw new MalformedCookieException(sb4.toString());
                    }
                } else if (!bVar.mo47111h().equals(lowerCase)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Illegal domain attribute: \"");
                    sb5.append(bVar.mo47111h());
                    sb5.append("\".");
                    sb5.append("Domain of origin: \"");
                    sb5.append(lowerCase);
                    sb5.append("\"");
                    throw new MalformedCookieException(sb5.toString());
                }
            } else {
                throw new MalformedCookieException("Invalid cookie state: domain not specified");
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }
}
