package org.apache.http.p547h0;

import org.apache.http.C15133c;
import org.apache.http.C15250f;
import org.apache.http.C15462n;
import org.apache.http.p548i0.C15350b;
import org.apache.http.p548i0.C15357i;

/* renamed from: org.apache.http.h0.a */
/* compiled from: AbstractHttpMessage */
public abstract class C15324a implements C15462n {

    /* renamed from: a */
    protected C15342s f44362a;

    /* renamed from: b */
    protected C15357i f44363b;

    protected C15324a(C15357i iVar) {
        this.f44362a = new C15342s();
        this.f44363b = iVar;
    }

    /* renamed from: a */
    public void mo47415a(C15133c cVar) {
        this.f44362a.mo47515a(cVar);
    }

    /* renamed from: b */
    public C15133c mo47418b(String str) {
        return this.f44362a.mo47527e(str);
    }

    /* renamed from: c */
    public C15133c[] mo47422c(String str) {
        return this.f44362a.mo47526d(str);
    }

    /* renamed from: d */
    public void mo47424d(String str) {
        if (str != null) {
            C15250f e = this.f44362a.mo47528e();
            while (e.hasNext()) {
                if (str.equalsIgnoreCase(((C15133c) e.next()).getName())) {
                    e.remove();
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo47425e(String str) {
        return this.f44362a.mo47517a(str);
    }

    /* renamed from: f */
    public C15133c mo47426f(String str) {
        return this.f44362a.mo47521c(str);
    }

    public C15357i getParams() {
        if (this.f44363b == null) {
            this.f44363b = new C15350b();
        }
        return this.f44363b;
    }

    /* renamed from: a */
    public void mo47414a(String str, String str2) {
        if (str != null) {
            this.f44362a.mo47515a((C15133c) new C15325b(str, str2));
            return;
        }
        throw new IllegalArgumentException("Header name may not be null");
    }

    /* renamed from: b */
    public void mo47419b(String str, String str2) {
        if (str != null) {
            this.f44362a.mo47523c((C15133c) new C15325b(str, str2));
            return;
        }
        throw new IllegalArgumentException("Header name may not be null");
    }

    /* renamed from: c */
    public void mo47421c(C15133c cVar) {
        this.f44362a.mo47523c(cVar);
    }

    /* renamed from: f */
    public C15133c[] mo47427f() {
        return this.f44362a.mo47525d();
    }

    protected C15324a() {
        this(null);
    }

    /* renamed from: a */
    public void mo47417a(C15133c[] cVarArr) {
        this.f44362a.mo47516a(cVarArr);
    }

    /* renamed from: b */
    public void mo47420b(C15133c cVar) {
        this.f44362a.mo47520b(cVar);
    }

    /* renamed from: a */
    public C15250f mo47413a(String str) {
        return this.f44362a.mo47529f(str);
    }

    /* renamed from: d */
    public C15250f mo47423d() {
        return this.f44362a.mo47528e();
    }

    /* renamed from: a */
    public void mo47416a(C15357i iVar) {
        if (iVar != null) {
            this.f44363b = iVar;
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
