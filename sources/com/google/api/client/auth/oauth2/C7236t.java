package com.google.api.client.auth.oauth2;

import p076c.p112d.p134b.p135a.p136d.C6288b;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: com.google.api.client.auth.oauth2.t */
/* compiled from: TokenResponse */
public class C7236t extends C6288b {
    @C2768v("access_token")

    /* renamed from: O */
    private String f20445O;
    @C2768v("token_type")

    /* renamed from: P */
    private String f20446P;
    @C2768v("expires_in")

    /* renamed from: Q */
    private Long f20447Q;
    @C2768v("refresh_token")

    /* renamed from: R */
    private String f20448R;
    @C2768v

    /* renamed from: S */
    private String f20449S;

    /* renamed from: a */
    public C7236t mo25115a(String str) {
        this.f20445O = (String) C6381h0.m29663a(str);
        return this;
    }

    /* renamed from: c */
    public C7236t mo25117c(String str) {
        this.f20449S = str;
        return this;
    }

    /* renamed from: d */
    public C7236t mo25118d(String str) {
        this.f20446P = (String) C6381h0.m29663a(str);
        return this;
    }

    /* renamed from: f */
    public final String mo28749f() {
        return this.f20445O;
    }

    /* renamed from: g */
    public final Long mo28750g() {
        return this.f20447Q;
    }

    /* renamed from: h */
    public final String mo28751h() {
        return this.f20448R;
    }

    /* renamed from: i */
    public final String mo28752i() {
        return this.f20449S;
    }

    /* renamed from: j */
    public final String mo28753j() {
        return this.f20446P;
    }

    /* renamed from: a */
    public C7236t mo25114a(Long l) {
        this.f20447Q = l;
        return this;
    }

    /* renamed from: b */
    public C7236t mo25116b(String str) {
        this.f20448R = str;
        return this;
    }

    /* renamed from: b */
    public C7236t m34823b(String str, Object obj) {
        return (C7236t) super.m29152b(str, obj);
    }

    public C7236t clone() {
        return (C7236t) super.clone();
    }
}
