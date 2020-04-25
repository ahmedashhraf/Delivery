package org.apache.http.impl.cookie;

import java.util.StringTokenizer;
import org.apache.http.cookie.C15222a;
import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15224c;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.C15232k;
import org.apache.http.cookie.C15233l;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.impl.cookie.d0 */
/* compiled from: RFC2965PortAttributeHandler */
public class C15395d0 implements C15224c {
    /* renamed from: a */
    private static int[] m68273a(String str) throws MalformedCookieException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken().trim());
                if (iArr[i] >= 0) {
                    i++;
                } else {
                    throw new MalformedCookieException("Invalid Port attribute.");
                }
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid Port attribute: ");
                sb.append(e.getMessage());
                throw new MalformedCookieException(sb.toString());
            }
        }
        return iArr;
    }

    /* renamed from: b */
    public boolean mo47115b(C15223b bVar, C15226e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            int c = eVar.mo47120c();
            if (!(bVar instanceof C15222a) || !((C15222a) bVar).mo47100g("port") || (bVar.mo47105e() != null && m68272a(c, bVar.mo47105e()))) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: a */
    private static boolean m68272a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo47114a(C15233l lVar, String str) throws MalformedCookieException {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (lVar instanceof C15232k) {
            C15232k kVar = (C15232k) lVar;
            if (str != null && str.trim().length() > 0) {
                kVar.mo47138a(m68273a(str));
            }
        }
    }

    /* renamed from: a */
    public void mo47113a(C15223b bVar, C15226e eVar) throws MalformedCookieException {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            int c = eVar.mo47120c();
            if ((bVar instanceof C15222a) && ((C15222a) bVar).mo47100g("port") && !m68272a(c, bVar.mo47105e())) {
                throw new MalformedCookieException("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }
}
