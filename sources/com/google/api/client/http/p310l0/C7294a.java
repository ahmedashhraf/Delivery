package com.google.api.client.http.p310l0;

import com.google.api.client.http.C7252a;
import com.google.api.client.http.C7303s;
import java.io.IOException;
import java.io.OutputStream;
import p076c.p112d.p134b.p135a.p136d.C6289c;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.C6291e;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: com.google.api.client.http.l0.a */
/* compiled from: JsonHttpContent */
public class C7294a extends C7252a {

    /* renamed from: c */
    private final Object f20620c;

    /* renamed from: d */
    private final C6290d f20621d;

    /* renamed from: e */
    private String f20622e;

    public C7294a(C6290d dVar, Object obj) {
        super(C6289c.f17634a);
        this.f20621d = (C6290d) C6381h0.m29663a(dVar);
        this.f20620c = C6381h0.m29663a(obj);
    }

    /* renamed from: f */
    public final Object mo28995f() {
        return this.f20620c;
    }

    /* renamed from: g */
    public final C6290d mo28996g() {
        return this.f20621d;
    }

    /* renamed from: h */
    public final String mo28997h() {
        return this.f20622e;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        C6291e a = this.f20621d.mo25139a(outputStream, mo28855d());
        if (this.f20622e != null) {
            a.mo25163i();
            a.mo25150a(this.f20622e);
        }
        a.mo25501a(this.f20620c);
        if (this.f20622e != null) {
            a.mo25160f();
        }
        a.mo25156c();
    }

    /* renamed from: a */
    public C7294a m35218a(C7303s sVar) {
        super.mo28853a(sVar);
        return this;
    }

    /* renamed from: a */
    public C7294a mo28994a(String str) {
        this.f20622e = str;
        return this;
    }
}
