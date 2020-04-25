package com.google.api.client.auth.oauth2;

import p076c.p112d.p134b.p135a.p136d.C6288b;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: com.google.api.client.auth.oauth2.r */
/* compiled from: TokenErrorResponse */
public class C7232r extends C6288b {
    @C2768v

    /* renamed from: O */
    private String f20432O;
    @C2768v("error_description")

    /* renamed from: P */
    private String f20433P;
    @C2768v("error_uri")

    /* renamed from: Q */
    private String f20434Q;

    /* renamed from: a */
    public C7232r mo28735a(String str) {
        this.f20432O = (String) C6381h0.m29663a(str);
        return this;
    }

    /* renamed from: c */
    public C7232r mo28737c(String str) {
        this.f20434Q = str;
        return this;
    }

    /* renamed from: f */
    public final String mo28738f() {
        return this.f20432O;
    }

    /* renamed from: g */
    public final String mo28739g() {
        return this.f20433P;
    }

    /* renamed from: h */
    public final String mo28740h() {
        return this.f20434Q;
    }

    /* renamed from: b */
    public C7232r mo28736b(String str) {
        this.f20433P = str;
        return this;
    }

    /* renamed from: b */
    public C7232r m34796b(String str, Object obj) {
        return (C7232r) super.m29152b(str, obj);
    }

    public C7232r clone() {
        return (C7232r) super.clone();
    }
}
