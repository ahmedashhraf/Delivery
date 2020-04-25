package org.apache.http.p540e0;

import java.io.IOException;
import org.apache.http.C15133c;
import org.apache.http.C15423j;
import org.apache.http.p547h0.C15325b;

/* renamed from: org.apache.http.e0.a */
/* compiled from: AbstractHttpEntity */
public abstract class C15238a implements C15423j {

    /* renamed from: N */
    protected boolean f44156N;

    /* renamed from: a */
    protected C15133c f44157a;

    /* renamed from: b */
    protected C15133c f44158b;

    protected C15238a() {
    }

    /* renamed from: a */
    public void mo47159a(C15133c cVar) {
        this.f44158b = cVar;
    }

    /* renamed from: b */
    public C15133c mo47161b() {
        return this.f44158b;
    }

    /* renamed from: c */
    public boolean mo47164c() {
        return this.f44156N;
    }

    public C15133c getContentType() {
        return this.f44157a;
    }

    /* renamed from: j */
    public void mo46986j() throws IOException, UnsupportedOperationException {
        if (isStreaming()) {
            throw new UnsupportedOperationException("streaming entity does not implement consumeContent()");
        }
    }

    /* renamed from: a */
    public void mo47158a(String str) {
        mo47159a((C15133c) str != null ? new C15325b("Content-Encoding", str) : null);
    }

    /* renamed from: b */
    public void mo47163b(C15133c cVar) {
        this.f44157a = cVar;
    }

    /* renamed from: b */
    public void mo47162b(String str) {
        mo47163b((C15133c) str != null ? new C15325b("Content-Type", str) : null);
    }

    /* renamed from: a */
    public void mo47160a(boolean z) {
        this.f44156N = z;
    }
}
