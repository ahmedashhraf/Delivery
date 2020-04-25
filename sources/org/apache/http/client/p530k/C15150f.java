package org.apache.http.client.p530k;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import org.apache.http.C15236d;
import org.apache.http.C15250f;
import org.apache.http.C15466r;
import org.apache.http.p224d0.C6145c;
import p076c.p112d.p148d.p279f.C6610c;

@C6145c
/* renamed from: org.apache.http.client.k.f */
/* compiled from: HttpOptions */
public class C15150f extends C15153i {

    /* renamed from: S */
    public static final String f44009S = "OPTIONS";

    public C15150f() {
    }

    /* renamed from: a */
    public Set<String> mo46953a(C15466r rVar) {
        if (rVar != null) {
            C15250f a = rVar.mo47413a(C6610c.f18395Q);
            HashSet hashSet = new HashSet();
            while (a.hasNext()) {
                for (C15236d name : a.mo47173e().mo46915b()) {
                    hashSet.add(name.getName());
                }
            }
            return hashSet;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    /* renamed from: e */
    public String mo28968e() {
        return "OPTIONS";
    }

    public C15150f(URI uri) {
        mo46954a(uri);
    }

    public C15150f(String str) {
        mo46954a(URI.create(str));
    }
}
