package com.google.api.client.http;

import java.io.IOException;
import java.nio.charset.Charset;
import p076c.p112d.p134b.p135a.p143g.C6385j;
import p076c.p112d.p134b.p135a.p143g.C6397m0;
import p076c.p112d.p134b.p135a.p143g.C6423t;

/* renamed from: com.google.api.client.http.a */
/* compiled from: AbstractHttpContent */
public abstract class C7252a implements C7295m {

    /* renamed from: a */
    private C7303s f20537a;

    /* renamed from: b */
    private long f20538b;

    protected C7252a(String str) {
        this(str == null ? null : new C7303s(str));
    }

    /* renamed from: a */
    public C7252a mo28853a(C7303s sVar) {
        this.f20537a = sVar;
        return this;
    }

    /* renamed from: a */
    public boolean mo25633a() {
        return true;
    }

    /* renamed from: b */
    public long mo25634b() throws IOException {
        if (this.f20538b == -1) {
            this.f20538b = mo28854c();
        }
        return this.f20538b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo28854c() throws IOException {
        return m34969a((C7295m) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Charset mo28855d() {
        C7303s sVar = this.f20537a;
        return (sVar == null || sVar.mo29070c() == null) ? C6385j.f17804a : this.f20537a.mo29070c();
    }

    /* renamed from: e */
    public final C7303s mo28856e() {
        return this.f20537a;
    }

    public String getType() {
        C7303s sVar = this.f20537a;
        if (sVar == null) {
            return null;
        }
        return sVar.mo29064a();
    }

    protected C7252a(C7303s sVar) {
        this.f20538b = -1;
        this.f20537a = sVar;
    }

    /* renamed from: a */
    public static long m34969a(C7295m mVar) throws IOException {
        if (!mVar.mo25633a()) {
            return -1;
        }
        return C6423t.m29814a((C6397m0) mVar);
    }
}
