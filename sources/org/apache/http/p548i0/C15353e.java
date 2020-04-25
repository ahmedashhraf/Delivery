package org.apache.http.p548i0;

/* renamed from: org.apache.http.i0.e */
/* compiled from: DefaultedHttpParams */
public final class C15353e extends C15349a {

    /* renamed from: a */
    private final C15357i f44436a;

    /* renamed from: b */
    private final C15357i f44437b;

    public C15353e(C15357i iVar, C15357i iVar2) {
        if (iVar != null) {
            this.f44436a = iVar;
            this.f44437b = iVar2;
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    /* renamed from: a */
    public C15357i mo47546a(String str, Object obj) {
        return this.f44436a.mo47546a(str, obj);
    }

    /* renamed from: b */
    public Object mo47549b(String str) {
        Object b = this.f44436a.mo47549b(str);
        if (b != null) {
            return b;
        }
        C15357i iVar = this.f44437b;
        return iVar != null ? iVar.mo47549b(str) : b;
    }

    /* renamed from: d */
    public C15357i mo47551d() {
        return new C15353e(this.f44436a.mo47551d(), this.f44437b);
    }

    /* renamed from: e */
    public C15357i mo47556e() {
        return this.f44437b;
    }

    /* renamed from: d */
    public boolean mo47552d(String str) {
        return this.f44436a.mo47552d(str);
    }
}
