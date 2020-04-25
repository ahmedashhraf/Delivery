package org.apache.http.p549j0;

import java.util.HashMap;
import java.util.Map;

/* renamed from: org.apache.http.j0.a */
/* compiled from: BasicHttpContext */
public class C15424a implements C15431f {

    /* renamed from: b */
    private final C15431f f44557b;

    /* renamed from: c */
    private Map f44558c;

    public C15424a() {
        this(null);
    }

    /* renamed from: a */
    public Object mo47685a(String str) {
        if (str != null) {
            Object obj = null;
            Map map = this.f44558c;
            if (map != null) {
                obj = map.get(str);
            }
            if (obj != null) {
                return obj;
            }
            C15431f fVar = this.f44557b;
            return fVar != null ? fVar.mo47685a(str) : obj;
        }
        throw new IllegalArgumentException("Id may not be null");
    }

    /* renamed from: b */
    public Object mo47687b(String str) {
        if (str != null) {
            Map map = this.f44558c;
            if (map != null) {
                return map.remove(str);
            }
            return null;
        }
        throw new IllegalArgumentException("Id may not be null");
    }

    public C15424a(C15431f fVar) {
        this.f44558c = null;
        this.f44557b = fVar;
    }

    /* renamed from: a */
    public void mo47686a(String str, Object obj) {
        if (str != null) {
            if (this.f44558c == null) {
                this.f44558c = new HashMap();
            }
            this.f44558c.put(str, obj);
            return;
        }
        throw new IllegalArgumentException("Id may not be null");
    }
}
