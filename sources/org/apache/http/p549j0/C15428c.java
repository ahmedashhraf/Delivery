package org.apache.http.p549j0;

/* renamed from: org.apache.http.j0.c */
/* compiled from: DefaultedHttpContext */
public final class C15428c implements C15431f {

    /* renamed from: b */
    private final C15431f f44562b;

    /* renamed from: c */
    private final C15431f f44563c;

    public C15428c(C15431f fVar, C15431f fVar2) {
        if (fVar != null) {
            this.f44562b = fVar;
            this.f44563c = fVar2;
            return;
        }
        throw new IllegalArgumentException("HTTP context may not be null");
    }

    /* renamed from: a */
    public Object mo47685a(String str) {
        Object a = this.f44562b.mo47685a(str);
        return a == null ? this.f44563c.mo47685a(str) : a;
    }

    /* renamed from: b */
    public Object mo47687b(String str) {
        return this.f44562b.mo47687b(str);
    }

    /* renamed from: a */
    public void mo47686a(String str, Object obj) {
        this.f44562b.mo47686a(str, obj);
    }

    /* renamed from: a */
    public C15431f mo47714a() {
        return this.f44563c;
    }
}
