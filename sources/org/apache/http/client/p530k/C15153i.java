package org.apache.http.client.p530k;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.C15117a0;
import org.apache.http.C15473y;
import org.apache.http.client.p533n.C15170a;
import org.apache.http.conn.C15182f;
import org.apache.http.conn.C15184h;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p547h0.C15324a;
import org.apache.http.p547h0.C15338o;
import org.apache.http.p547h0.C15342s;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p548i0.C15359k;

@C6145c
/* renamed from: org.apache.http.client.k.i */
/* compiled from: HttpRequestBase */
public abstract class C15153i extends C15324a implements C15155k, C15145a, Cloneable {

    /* renamed from: N */
    private Lock f44012N = new ReentrantLock();

    /* renamed from: O */
    private boolean f44013O;

    /* renamed from: P */
    private URI f44014P;

    /* renamed from: Q */
    private C15182f f44015Q;

    /* renamed from: R */
    private C15184h f44016R;

    /* renamed from: a */
    public void mo46954a(URI uri) {
        this.f44014P = uri;
    }

    /* renamed from: b */
    public C15473y mo46955b() {
        return C15359k.m68046d(getParams());
    }

    /* renamed from: c */
    public void mo46948c() {
        this.f44012N.lock();
        try {
            if (!this.f44013O) {
                this.f44013O = true;
                C15182f fVar = this.f44015Q;
                C15184h hVar = this.f44016R;
                this.f44012N.unlock();
                if (fVar != null) {
                    fVar.mo46998a();
                }
                if (hVar != null) {
                    try {
                        hVar.mo46984F();
                    } catch (IOException unused) {
                    }
                }
            }
        } finally {
            this.f44012N.unlock();
        }
    }

    public Object clone() throws CloneNotSupportedException {
        C15153i iVar = (C15153i) super.clone();
        iVar.f44012N = new ReentrantLock();
        iVar.f44013O = false;
        iVar.f44016R = null;
        iVar.f44015Q = null;
        iVar.f44362a = (C15342s) C15170a.m67276a(this.f44362a);
        iVar.f44363b = (C15357i) C15170a.m67276a(this.f44363b);
        return iVar;
    }

    /* renamed from: e */
    public abstract String mo28968e();

    /* renamed from: h */
    public C15117a0 mo46956h() {
        String e = mo28968e();
        C15473y b = mo46955b();
        URI k = mo46958k();
        String aSCIIString = k != null ? k.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.length() == 0) {
            aSCIIString = "/";
        }
        return new C15338o(e, aSCIIString, b);
    }

    /* renamed from: j */
    public boolean mo46957j() {
        return this.f44013O;
    }

    /* renamed from: k */
    public URI mo46958k() {
        return this.f44014P;
    }

    /* renamed from: a */
    public void mo46946a(C15182f fVar) throws IOException {
        this.f44012N.lock();
        try {
            if (!this.f44013O) {
                this.f44016R = null;
                this.f44015Q = fVar;
                return;
            }
            throw new IOException("Request already aborted");
        } finally {
            this.f44012N.unlock();
        }
    }

    /* renamed from: a */
    public void mo46947a(C15184h hVar) throws IOException {
        this.f44012N.lock();
        try {
            if (!this.f44013O) {
                this.f44015Q = null;
                this.f44016R = hVar;
                return;
            }
            throw new IOException("Request already aborted");
        } finally {
            this.f44012N.unlock();
        }
    }
}
