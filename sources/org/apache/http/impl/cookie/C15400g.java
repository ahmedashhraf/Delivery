package org.apache.http.impl.cookie;

import org.apache.http.cookie.C15233l;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.impl.cookie.g */
/* compiled from: BasicExpiresHandler */
public class C15400g extends C15388a {

    /* renamed from: a */
    private final String[] f44526a;

    public C15400g(String[] strArr) {
        if (strArr != null) {
            this.f44526a = strArr;
            return;
        }
        throw new IllegalArgumentException("Array of date patterns may not be null");
    }

    /* renamed from: a */
    public void mo47114a(C15233l lVar, String str) throws MalformedCookieException {
        if (lVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str != null) {
            try {
                lVar.mo47144b(C15410p.m68325a(str, this.f44526a));
            } catch (DateParseException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to parse expires attribute: ");
                sb.append(str);
                throw new MalformedCookieException(sb.toString());
            }
        } else {
            throw new MalformedCookieException("Missing value for expires attribute");
        }
    }
}
