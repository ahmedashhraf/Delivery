package org.apache.http.conn.p536p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.C15460l;
import org.apache.http.p224d0.C6143a;
import org.apache.http.p224d0.C6146d;

@C6146d
/* renamed from: org.apache.http.conn.p.e */
/* compiled from: SchemeRegistry */
public final class C15213e {
    @C6143a("this")

    /* renamed from: a */
    private final Map<String, C15212d> f44119a = new LinkedHashMap();

    /* renamed from: a */
    public final synchronized C15212d mo47085a(C15460l lVar) {
        if (lVar != null) {
        } else {
            throw new IllegalArgumentException("Host must not be null.");
        }
        return mo47087b(lVar.mo47785f());
    }

    /* renamed from: b */
    public final synchronized C15212d mo47087b(String str) {
        C15212d a;
        a = mo47083a(str);
        if (a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Scheme '");
            sb.append(str);
            sb.append("' not registered.");
            throw new IllegalStateException(sb.toString());
        }
        return a;
    }

    /* renamed from: c */
    public final synchronized C15212d mo47088c(String str) {
        if (str != null) {
        } else {
            throw new IllegalArgumentException("Name must not be null.");
        }
        return (C15212d) this.f44119a.remove(str);
    }

    /* renamed from: a */
    public final synchronized C15212d mo47083a(String str) {
        if (str != null) {
        } else {
            throw new IllegalArgumentException("Name must not be null.");
        }
        return (C15212d) this.f44119a.get(str);
    }

    /* renamed from: a */
    public final synchronized C15212d mo47084a(C15212d dVar) {
        if (dVar != null) {
        } else {
            throw new IllegalArgumentException("Scheme must not be null.");
        }
        return (C15212d) this.f44119a.put(dVar.mo47076b(), dVar);
    }

    /* renamed from: a */
    public final synchronized List<String> mo47082a() {
        return new ArrayList(this.f44119a.keySet());
    }

    /* renamed from: a */
    public synchronized void mo47086a(Map<String, C15212d> map) {
        if (map != null) {
            this.f44119a.clear();
            this.f44119a.putAll(map);
        }
    }
}
