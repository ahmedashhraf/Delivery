package org.apache.http.p548i0;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: org.apache.http.i0.b */
/* compiled from: BasicHttpParams */
public final class C15350b extends C15349a implements Serializable, Cloneable {
    private static final long serialVersionUID = -7086398485908701455L;

    /* renamed from: a */
    private final HashMap f44419a = new HashMap();

    /* renamed from: a */
    public C15357i mo47546a(String str, Object obj) {
        this.f44419a.put(str, obj);
        return this;
    }

    /* renamed from: b */
    public Object mo47549b(String str) {
        return this.f44419a.get(str);
    }

    public Object clone() throws CloneNotSupportedException {
        C15350b bVar = (C15350b) super.clone();
        mo47547a(bVar);
        return bVar;
    }

    /* renamed from: d */
    public boolean mo47552d(String str) {
        if (!this.f44419a.containsKey(str)) {
            return false;
        }
        this.f44419a.remove(str);
        return true;
    }

    /* renamed from: e */
    public void mo47553e() {
        this.f44419a.clear();
    }

    /* renamed from: f */
    public boolean mo47554f(String str) {
        return mo47549b(str) != null;
    }

    /* renamed from: g */
    public boolean mo47555g(String str) {
        return this.f44419a.get(str) != null;
    }

    /* renamed from: a */
    public void mo47548a(String[] strArr, Object obj) {
        for (String a : strArr) {
            mo47546a(a, obj);
        }
    }

    /* renamed from: d */
    public C15357i mo47551d() {
        C15350b bVar = new C15350b();
        mo47547a(bVar);
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47547a(C15357i iVar) {
        for (Entry entry : this.f44419a.entrySet()) {
            if (entry.getKey() instanceof String) {
                iVar.mo47546a((String) entry.getKey(), entry.getValue());
            }
        }
    }
}
