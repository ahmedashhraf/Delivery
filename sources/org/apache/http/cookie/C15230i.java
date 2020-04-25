package org.apache.http.cookie;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.p224d0.C6143a;
import org.apache.http.p224d0.C6146d;
import org.apache.http.p548i0.C15357i;

@C6146d
/* renamed from: org.apache.http.cookie.i */
/* compiled from: CookieSpecRegistry */
public final class C15230i {
    @C6143a("this")

    /* renamed from: a */
    private final Map<String, C15229h> f44149a = new LinkedHashMap();

    /* renamed from: a */
    public synchronized void mo47135a(String str, C15229h hVar) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else if (hVar != null) {
            this.f44149a.put(str.toLowerCase(Locale.ENGLISH), hVar);
        } else {
            throw new IllegalArgumentException("Cookie spec factory may not be null");
        }
    }

    /* renamed from: b */
    public synchronized void mo47137b(String str) {
        if (str != null) {
            this.f44149a.remove(str.toLowerCase(Locale.ENGLISH));
        } else {
            throw new IllegalArgumentException("Id may not be null");
        }
    }

    /* renamed from: a */
    public synchronized C15228g mo47134a(String str, C15357i iVar) throws IllegalStateException {
        C15229h hVar;
        if (str != null) {
            try {
                hVar = (C15229h) this.f44149a.get(str.toLowerCase(Locale.ENGLISH));
                if (hVar != null) {
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported cookie spec: ");
                    sb.append(str);
                    throw new IllegalStateException(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
        return hVar.mo47131a(iVar);
    }

    /* renamed from: a */
    public synchronized C15228g mo47133a(String str) throws IllegalStateException {
        return mo47134a(str, (C15357i) null);
    }

    /* renamed from: a */
    public synchronized List<String> mo47132a() {
        return new ArrayList(this.f44149a.keySet());
    }

    /* renamed from: a */
    public synchronized void mo47136a(Map<String, C15229h> map) {
        if (map != null) {
            this.f44149a.clear();
            this.f44149a.putAll(map);
        }
    }
}
