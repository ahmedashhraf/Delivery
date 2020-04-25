package com.google.api.client.auth.oauth2;

import com.google.api.client.http.C7274j;
import java.util.Collection;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6435u;

/* renamed from: com.google.api.client.auth.oauth2.e */
/* compiled from: AuthorizationRequestUrl */
public class C7214e extends C7274j {
    @C2768v("response_type")

    /* renamed from: U */
    private String f20389U;
    @C2768v("redirect_uri")

    /* renamed from: V */
    private String f20390V;
    @C2768v("scope")

    /* renamed from: W */
    private String f20391W;
    @C2768v("client_id")

    /* renamed from: X */
    private String f20392X;
    @C2768v

    /* renamed from: Y */
    private String f20393Y;

    public C7214e(String str, String str2, Collection<String> collection) {
        super(str);
        C6381h0.m29666a(mo28937g() == null);
        mo25220j(str2);
        mo25218a(collection);
    }

    /* renamed from: a */
    public C7214e mo25218a(Collection<String> collection) {
        this.f20389U = C6435u.m29851a(' ').mo25875a((Iterable<?>) collection);
        return this;
    }

    /* renamed from: j */
    public C7214e mo25220j(String str) {
        this.f20392X = (String) C6381h0.m29663a(str);
        return this;
    }

    /* renamed from: l */
    public C7214e mo25221l(String str) {
        this.f20390V = str;
        return this;
    }

    /* renamed from: m */
    public C7214e mo25222m(String str) {
        this.f20393Y = str;
        return this;
    }

    /* renamed from: q */
    public final String mo28682q() {
        return this.f20392X;
    }

    /* renamed from: r */
    public final String mo28683r() {
        return this.f20390V;
    }

    /* renamed from: s */
    public final String mo28684s() {
        return this.f20389U;
    }

    /* renamed from: t */
    public final String mo28685t() {
        return this.f20391W;
    }

    /* renamed from: u */
    public final String mo28686u() {
        return this.f20393Y;
    }

    /* renamed from: b */
    public C7214e mo25219b(Collection<String> collection) {
        this.f20391W = (collection == null || !collection.iterator().hasNext()) ? null : C6435u.m29851a(' ').mo25875a((Iterable<?>) collection);
        return this;
    }

    /* renamed from: b */
    public C7214e m34646b(String str, Object obj) {
        return (C7214e) super.mo25098b(str, obj);
    }

    public C7214e clone() {
        return (C7214e) super.clone();
    }
}
