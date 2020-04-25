package org.apache.http.impl.cookie;

import java.util.Locale;
import java.util.StringTokenizer;
import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.impl.cookie.q */
/* compiled from: NetscapeDomainHandler */
public class C15413q extends C15398f {
    /* renamed from: a */
    public void mo47113a(C15223b bVar, C15226e eVar) throws MalformedCookieException {
        super.mo47113a(bVar, eVar);
        String a = eVar.mo47118a();
        String h = bVar.mo47111h();
        String str = ".";
        if (a.contains(str)) {
            int countTokens = new StringTokenizer(h, str).countTokens();
            String str2 = "Domain attribute \"";
            if (m68328a(h)) {
                if (countTokens < 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(h);
                    sb.append("\" violates the Netscape cookie specification for ");
                    sb.append("special domains");
                    throw new MalformedCookieException(sb.toString());
                }
            } else if (countTokens < 3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(h);
                sb2.append("\" violates the Netscape cookie specification");
                throw new MalformedCookieException(sb2.toString());
            }
        }
    }

    /* renamed from: b */
    public boolean mo47115b(C15223b bVar, C15226e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            String a = eVar.mo47118a();
            String h = bVar.mo47111h();
            if (h == null) {
                return false;
            }
            return a.endsWith(h);
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: a */
    private static boolean m68328a(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        return upperCase.endsWith(".COM") || upperCase.endsWith(".EDU") || upperCase.endsWith(".NET") || upperCase.endsWith(".GOV") || upperCase.endsWith(".MIL") || upperCase.endsWith(".ORG") || upperCase.endsWith(".INT");
    }
}
