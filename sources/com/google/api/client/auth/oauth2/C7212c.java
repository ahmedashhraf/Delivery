package com.google.api.client.auth.oauth2;

import com.google.api.client.http.C7274j;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: com.google.api.client.auth.oauth2.c */
/* compiled from: AuthorizationCodeResponseUrl */
public class C7212c extends C7274j {
    @C2768v

    /* renamed from: U */
    private String f20382U;
    @C2768v

    /* renamed from: V */
    private String f20383V;
    @C2768v

    /* renamed from: W */
    private String f20384W;
    @C2768v("error_description")

    /* renamed from: X */
    private String f20385X;
    @C2768v("error_uri")

    /* renamed from: Y */
    private String f20386Y;

    public C7212c(String str) {
        super(str);
        boolean z = true;
        if ((this.f20382U == null) == (this.f20384W == null)) {
            z = false;
        }
        C6381h0.m29666a(z);
    }

    /* renamed from: j */
    public C7212c mo25220j(String str) {
        this.f20382U = str;
        return this;
    }

    /* renamed from: l */
    public C7212c mo25221l(String str) {
        this.f20384W = str;
        return this;
    }

    /* renamed from: m */
    public C7212c mo28672m(String str) {
        this.f20385X = str;
        return this;
    }

    /* renamed from: n */
    public C7212c mo28673n(String str) {
        this.f20386Y = str;
        return this;
    }

    /* renamed from: o */
    public C7212c mo28674o(String str) {
        this.f20383V = str;
        return this;
    }

    /* renamed from: q */
    public final String mo28675q() {
        return this.f20382U;
    }

    /* renamed from: r */
    public final String mo28676r() {
        return this.f20384W;
    }

    /* renamed from: s */
    public final String mo28677s() {
        return this.f20385X;
    }

    /* renamed from: t */
    public final String mo28678t() {
        return this.f20386Y;
    }

    /* renamed from: u */
    public final String mo28679u() {
        return this.f20383V;
    }

    /* renamed from: b */
    public C7212c m34615b(String str, Object obj) {
        return (C7212c) super.mo25098b(str, obj);
    }

    public C7212c clone() {
        return (C7212c) super.clone();
    }
}
