package org.apache.http.auth;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.p224d0.C6143a;
import org.apache.http.p224d0.C6146d;
import org.apache.http.p548i0.C15357i;

@C6146d
/* renamed from: org.apache.http.auth.d */
/* compiled from: AuthSchemeRegistry */
public final class C15121d {
    @C6143a("this")

    /* renamed from: a */
    private final Map<String, C15120c> f43984a = new LinkedHashMap();

    /* renamed from: a */
    public synchronized void mo46877a(String str, C15120c cVar) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else if (cVar != null) {
            this.f43984a.put(str.toLowerCase(Locale.ENGLISH), cVar);
        } else {
            throw new IllegalArgumentException("Authentication scheme factory may not be null");
        }
    }

    /* renamed from: a */
    public synchronized void mo46876a(String str) {
        if (str != null) {
            this.f43984a.remove(str.toLowerCase(Locale.ENGLISH));
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
    }

    /* renamed from: a */
    public synchronized C15119b mo46875a(String str, C15357i iVar) throws IllegalStateException {
        C15120c cVar;
        if (str != null) {
            try {
                cVar = (C15120c) this.f43984a.get(str.toLowerCase(Locale.ENGLISH));
                if (cVar != null) {
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported authentication scheme: ");
                    sb.append(str);
                    throw new IllegalStateException(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
        return cVar.mo46873a(iVar);
    }

    /* renamed from: a */
    public synchronized List<String> mo46874a() {
        return new ArrayList(this.f43984a.keySet());
    }

    /* renamed from: a */
    public synchronized void mo46878a(Map<String, C15120c> map) {
        if (map != null) {
            this.f43984a.clear();
            this.f43984a.putAll(map);
        }
    }
}
