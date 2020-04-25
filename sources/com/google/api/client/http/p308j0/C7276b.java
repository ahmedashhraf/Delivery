package com.google.api.client.http.p308j0;

import com.google.api.client.http.C7261e0;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.C15132b0;
import org.apache.http.C15133c;
import org.apache.http.C15423j;
import org.apache.http.C15466r;
import org.apache.http.client.p530k.C15153i;

/* renamed from: com.google.api.client.http.j0.b */
/* compiled from: ApacheHttpResponse */
final class C7276b extends C7261e0 {

    /* renamed from: a */
    private final C15153i f20585a;

    /* renamed from: b */
    private final C15466r f20586b;

    /* renamed from: c */
    private final C15133c[] f20587c;

    C7276b(C15153i iVar, C15466r rVar) {
        this.f20585a = iVar;
        this.f20586b = rVar;
        this.f20587c = rVar.mo47427f();
    }

    /* renamed from: a */
    public String mo28951a(String str) {
        return this.f20586b.mo47418b(str).getValue();
    }

    /* renamed from: b */
    public InputStream mo25351b() throws IOException {
        C15423j g = this.f20586b.mo47466g();
        if (g == null) {
            return null;
        }
        return g.getContent();
    }

    /* renamed from: c */
    public String mo25353c() {
        C15423j g = this.f20586b.mo47466g();
        if (g != null) {
            C15133c b = g.mo47161b();
            if (b != null) {
                return b.getValue();
            }
        }
        return null;
    }

    /* renamed from: d */
    public long mo25354d() {
        C15423j g = this.f20586b.mo47466g();
        if (g == null) {
            return -1;
        }
        return g.getContentLength();
    }

    /* renamed from: e */
    public String mo25355e() {
        C15423j g = this.f20586b.mo47466g();
        if (g != null) {
            C15133c contentType = g.getContentType();
            if (contentType != null) {
                return contentType.getValue();
            }
        }
        return null;
    }

    /* renamed from: f */
    public int mo25356f() {
        return this.f20587c.length;
    }

    /* renamed from: g */
    public String mo25357g() {
        C15132b0 l = this.f20586b.mo47468l();
        if (l == null) {
            return null;
        }
        return l.mo46914d();
    }

    /* renamed from: h */
    public int mo25358h() {
        C15132b0 l = this.f20586b.mo47468l();
        if (l == null) {
            return 0;
        }
        return l.mo46913c();
    }

    /* renamed from: i */
    public String mo25359i() {
        C15132b0 l = this.f20586b.mo47468l();
        if (l == null) {
            return null;
        }
        return l.toString();
    }

    /* renamed from: a */
    public String mo25350a(int i) {
        return this.f20587c[i].getName();
    }

    /* renamed from: a */
    public void mo25663a() {
        this.f20585a.mo46948c();
    }

    /* renamed from: b */
    public String mo25352b(int i) {
        return this.f20587c[i].getValue();
    }
}
