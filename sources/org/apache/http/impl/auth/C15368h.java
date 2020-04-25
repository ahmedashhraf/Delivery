package org.apache.http.impl.auth;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.C15236d;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p547h0.C15330g;
import org.apache.http.p547h0.C15347x;
import org.apache.http.p550k0.C15454b;

@C6145c
/* renamed from: org.apache.http.impl.auth.h */
/* compiled from: RFC2617Scheme */
public abstract class C15368h extends C15360a {

    /* renamed from: b */
    private Map<String, String> f44452b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47568a(C15454b bVar, int i, int i2) throws MalformedChallengeException {
        C15236d[] a = C15330g.f44380a.mo47455a(bVar, new C15347x(i, bVar.mo47772f()));
        if (a.length != 0) {
            this.f44452b = new HashMap(a.length);
            for (C15236d dVar : a) {
                this.f44452b.put(dVar.getName(), dVar.getValue());
            }
            return;
        }
        throw new MalformedChallengeException("Authentication challenge is empty");
    }

    /* renamed from: b */
    public String mo46869b(String str) {
        if (str != null) {
            Map<String, String> map = this.f44452b;
            if (map == null) {
                return null;
            }
            return (String) map.get(str.toLowerCase(Locale.ENGLISH));
        }
        throw new IllegalArgumentException("Parameter name may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Map<String, String> mo47574f() {
        if (this.f44452b == null) {
            this.f44452b = new HashMap();
        }
        return this.f44452b;
    }

    /* renamed from: a */
    public String mo46866a() {
        return mo46869b("realm");
    }
}
