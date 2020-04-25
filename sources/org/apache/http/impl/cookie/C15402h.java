package org.apache.http.impl.cookie;

import java.util.Date;
import org.apache.http.cookie.C15233l;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.impl.cookie.h */
/* compiled from: BasicMaxAgeHandler */
public class C15402h extends C15388a {
    /* renamed from: a */
    public void mo47114a(C15233l lVar, String str) throws MalformedCookieException {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0) {
                    lVar.mo47144b(new Date(System.currentTimeMillis() + (((long) parseInt) * 1000)));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Negative max-age attribute: ");
                sb.append(str);
                throw new MalformedCookieException(sb.toString());
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid max-age attribute: ");
                sb2.append(str);
                throw new MalformedCookieException(sb2.toString());
            }
        } else {
            throw new MalformedCookieException("Missing value for max-age attribute");
        }
    }
}
