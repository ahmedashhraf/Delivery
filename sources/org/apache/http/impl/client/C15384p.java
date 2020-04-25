package org.apache.http.impl.client;

import java.net.URI;
import org.apache.http.client.p530k.C15153i;
import org.apache.http.p224d0.C6145c;

@C6145c
/* renamed from: org.apache.http.impl.client.p */
/* compiled from: HttpRedirect */
class C15384p extends C15153i {

    /* renamed from: S */
    private String f44504S;

    public C15384p(String str, URI uri) {
        String str2 = "HEAD";
        if (str.equalsIgnoreCase(str2)) {
            this.f44504S = str2;
        } else {
            this.f44504S = "GET";
        }
        mo46954a(uri);
    }

    /* renamed from: e */
    public String mo28968e() {
        return this.f44504S;
    }
}
