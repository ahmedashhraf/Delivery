package com.google.api.client.http;

import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C6397m0;

/* renamed from: com.google.api.client.http.d0 */
/* compiled from: LowLevelHttpRequest */
public abstract class C7259d0 {

    /* renamed from: a */
    private long f20549a = -1;

    /* renamed from: b */
    private String f20550b;

    /* renamed from: c */
    private String f20551c;

    /* renamed from: d */
    private C6397m0 f20552d;

    /* renamed from: a */
    public abstract C7261e0 mo25348a() throws IOException;

    /* renamed from: a */
    public void mo28872a(int i, int i2) throws IOException {
    }

    /* renamed from: a */
    public final void mo28873a(long j) throws IOException {
        this.f20549a = j;
    }

    /* renamed from: a */
    public abstract void mo25349a(String str, String str2) throws IOException;

    /* renamed from: b */
    public final String mo28876b() {
        return this.f20550b;
    }

    /* renamed from: c */
    public final long mo28878c() {
        return this.f20549a;
    }

    /* renamed from: d */
    public final String mo28879d() {
        return this.f20551c;
    }

    /* renamed from: e */
    public final C6397m0 mo28880e() {
        return this.f20552d;
    }

    /* renamed from: a */
    public final void mo28875a(String str) throws IOException {
        this.f20550b = str;
    }

    /* renamed from: b */
    public final void mo28877b(String str) throws IOException {
        this.f20551c = str;
    }

    /* renamed from: a */
    public final void mo28874a(C6397m0 m0Var) throws IOException {
        this.f20552d = m0Var;
    }
}
