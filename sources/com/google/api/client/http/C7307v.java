package com.google.api.client.http;

import java.io.IOException;

/* renamed from: com.google.api.client.http.v */
/* compiled from: HttpRequestFactory */
public final class C7307v {

    /* renamed from: a */
    private final C7253a0 f20702a;

    /* renamed from: b */
    private final C7308w f20703b;

    C7307v(C7253a0 a0Var, C7308w wVar) {
        this.f20702a = a0Var;
        this.f20703b = wVar;
    }

    /* renamed from: a */
    public C7308w mo29133a() {
        return this.f20703b;
    }

    /* renamed from: b */
    public C7253a0 mo29134b() {
        return this.f20702a;
    }

    /* renamed from: c */
    public C7305u mo29138c(C7274j jVar, C7295m mVar) throws IOException {
        return mo29132a("PUT", jVar, mVar);
    }

    /* renamed from: a */
    public C7305u mo29132a(String str, C7274j jVar, C7295m mVar) throws IOException {
        C7305u a = this.f20702a.mo28857a();
        C7308w wVar = this.f20703b;
        if (wVar != null) {
            wVar.mo25083b(a);
        }
        a.mo29090a(str);
        if (jVar != null) {
            a.mo29083a(jVar);
        }
        if (mVar != null) {
            a.mo29084a(mVar);
        }
        return a;
    }

    /* renamed from: b */
    public C7305u mo29135b(C7274j jVar) throws IOException {
        return mo29132a("GET", jVar, null);
    }

    /* renamed from: c */
    public C7305u mo29137c(C7274j jVar) throws IOException {
        return mo29132a("HEAD", jVar, null);
    }

    /* renamed from: b */
    public C7305u mo29136b(C7274j jVar, C7295m mVar) throws IOException {
        return mo29132a("POST", jVar, mVar);
    }

    /* renamed from: a */
    public C7305u mo29130a(C7274j jVar) throws IOException {
        return mo29132a("DELETE", jVar, null);
    }

    /* renamed from: a */
    public C7305u mo29131a(C7274j jVar, C7295m mVar) throws IOException {
        return mo29132a(C7304t.f20670f, jVar, mVar);
    }
}
