package org.apache.http.impl.cookie;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.cookie.C15224c;
import org.apache.http.cookie.C15228g;
import org.apache.http.p224d0.C6145c;

@C6145c
/* renamed from: org.apache.http.impl.cookie.b */
/* compiled from: AbstractCookieSpec */
public abstract class C15390b implements C15228g {

    /* renamed from: a */
    private final Map<String, C15224c> f44513a = new HashMap(10);

    /* renamed from: a */
    public void mo47666a(String str, C15224c cVar) {
        if (str == null) {
            throw new IllegalArgumentException("Attribute name may not be null");
        } else if (cVar != null) {
            this.f44513a.put(str, cVar);
        } else {
            throw new IllegalArgumentException("Attribute handler may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C15224c mo47667b(String str) {
        C15224c a = mo47665a(str);
        if (a != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Handler not registered for ");
        sb.append(str);
        sb.append(" attribute.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Collection<C15224c> mo47668c() {
        return this.f44513a.values();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15224c mo47665a(String str) {
        return (C15224c) this.f44513a.get(str);
    }
}
