package com.google.api.client.http;

import java.io.InputStream;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: com.google.api.client.http.c0 */
/* compiled from: InputStreamContent */
public final class C7257c0 extends C7254b {

    /* renamed from: c */
    private long f20544c = -1;

    /* renamed from: d */
    private boolean f20545d;

    /* renamed from: e */
    private final InputStream f20546e;

    public C7257c0(String str, InputStream inputStream) {
        super(str);
        this.f20546e = (InputStream) C6381h0.m29663a(inputStream);
    }

    /* renamed from: b */
    public long mo25634b() {
        return this.f20544c;
    }

    /* renamed from: d */
    public InputStream mo28864d() {
        return this.f20546e;
    }

    /* renamed from: b */
    public C7257c0 mo28869b(boolean z) {
        this.f20545d = z;
        return this;
    }

    /* renamed from: a */
    public boolean mo25633a() {
        return this.f20545d;
    }

    /* renamed from: a */
    public C7257c0 m34992a(String str) {
        return (C7257c0) super.mo28861a(str);
    }

    /* renamed from: a */
    public C7257c0 m34993a(boolean z) {
        return (C7257c0) super.mo28862a(z);
    }

    /* renamed from: a */
    public C7257c0 mo28868a(long j) {
        this.f20544c = j;
        return this;
    }
}
