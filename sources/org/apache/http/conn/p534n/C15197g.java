package org.apache.http.conn.p534n;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.p224d0.C6145c;

@C6145c
/* renamed from: org.apache.http.conn.n.g */
/* compiled from: ConnPerRouteBean */
public final class C15197g implements C15196f {

    /* renamed from: c */
    public static final int f44083c = 2;

    /* renamed from: a */
    private final Map<C15202b, Integer> f44084a;

    /* renamed from: b */
    private int f44085b;

    public C15197g(int i) {
        this.f44084a = new HashMap();
        mo47036a(i);
    }

    /* renamed from: a */
    public int mo47035a() {
        return this.f44085b;
    }

    public String toString() {
        return this.f44084a.toString();
    }

    /* renamed from: a */
    public void mo47036a(int i) {
        if (i >= 1) {
            this.f44085b = i;
            return;
        }
        throw new IllegalArgumentException("The maximum must be greater than 0.");
    }

    public C15197g() {
        this(2);
    }

    /* renamed from: a */
    public void mo47038a(C15202b bVar, int i) {
        if (bVar == null) {
            throw new IllegalArgumentException("HTTP route may not be null.");
        } else if (i >= 1) {
            this.f44084a.put(bVar, Integer.valueOf(i));
        } else {
            throw new IllegalArgumentException("The maximum must be greater than 0.");
        }
    }

    /* renamed from: a */
    public int mo47034a(C15202b bVar) {
        if (bVar != null) {
            Integer num = (Integer) this.f44084a.get(bVar);
            if (num != null) {
                return num.intValue();
            }
            return this.f44085b;
        }
        throw new IllegalArgumentException("HTTP route may not be null.");
    }

    /* renamed from: a */
    public void mo47037a(Map<C15202b, Integer> map) {
        if (map != null) {
            this.f44084a.clear();
            this.f44084a.putAll(map);
        }
    }
}
