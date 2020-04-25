package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.C15117a0;
import org.apache.http.C15463o;
import org.apache.http.C15473y;
import org.apache.http.ProtocolException;
import org.apache.http.client.p530k.C15155k;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p547h0.C15324a;
import org.apache.http.p547h0.C15338o;
import org.apache.http.p548i0.C15359k;

@C6145c
/* renamed from: org.apache.http.impl.client.r */
/* compiled from: RequestWrapper */
public class C15386r extends C15324a implements C15155k {

    /* renamed from: N */
    private final C15463o f44506N;

    /* renamed from: O */
    private URI f44507O;

    /* renamed from: P */
    private String f44508P;

    /* renamed from: Q */
    private C15473y f44509Q;

    /* renamed from: R */
    private int f44510R;

    public C15386r(C15463o oVar) throws ProtocolException {
        if (oVar != null) {
            this.f44506N = oVar;
            mo47416a(oVar.getParams());
            if (oVar instanceof C15155k) {
                C15155k kVar = (C15155k) oVar;
                this.f44507O = kVar.mo46958k();
                this.f44508P = kVar.mo28968e();
                this.f44509Q = null;
            } else {
                C15117a0 h = oVar.mo46956h();
                try {
                    this.f44507O = new URI(h.mo46856f());
                    this.f44508P = h.mo46855e();
                    this.f44509Q = oVar.mo46955b();
                } catch (URISyntaxException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid request URI: ");
                    sb.append(h.mo46856f());
                    throw new ProtocolException(sb.toString(), e);
                }
            }
            this.f44510R = 0;
            return;
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }

    /* renamed from: a */
    public void mo47657a(C15473y yVar) {
        this.f44509Q = yVar;
    }

    /* renamed from: b */
    public C15473y mo46955b() {
        if (this.f44509Q == null) {
            this.f44509Q = C15359k.m68046d(getParams());
        }
        return this.f44509Q;
    }

    /* renamed from: c */
    public void mo46948c() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public String mo28968e() {
        return this.f44508P;
    }

    /* renamed from: h */
    public void mo47658h(String str) {
        if (str != null) {
            this.f44508P = str;
            return;
        }
        throw new IllegalArgumentException("Method name may not be null");
    }

    /* renamed from: j */
    public boolean mo46957j() {
        return false;
    }

    /* renamed from: k */
    public URI mo46958k() {
        return this.f44507O;
    }

    /* renamed from: n */
    public int mo47659n() {
        return this.f44510R;
    }

    /* renamed from: o */
    public C15463o mo47660o() {
        return this.f44506N;
    }

    /* renamed from: p */
    public void mo47661p() {
        this.f44510R++;
    }

    /* renamed from: q */
    public boolean mo47652q() {
        return true;
    }

    /* renamed from: r */
    public void mo47662r() {
        this.f44362a.mo47519b();
        mo47417a(this.f44506N.mo47427f());
    }

    /* renamed from: a */
    public void mo47656a(URI uri) {
        this.f44507O = uri;
    }

    /* renamed from: h */
    public C15117a0 mo46956h() {
        String e = mo28968e();
        C15473y b = mo46955b();
        URI uri = this.f44507O;
        String aSCIIString = uri != null ? uri.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.length() == 0) {
            aSCIIString = "/";
        }
        return new C15338o(e, aSCIIString, b);
    }
}
