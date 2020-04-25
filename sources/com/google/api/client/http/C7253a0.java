package com.google.api.client.http;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: com.google.api.client.http.a0 */
/* compiled from: HttpTransport */
public abstract class C7253a0 {

    /* renamed from: a */
    static final Logger f20539a = Logger.getLogger(C7253a0.class.getName());

    /* renamed from: b */
    private static final String[] f20540b = {"DELETE", "GET", "POST", "PUT"};

    static {
        Arrays.sort(f20540b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C7259d0 mo25360a(String str, String str2) throws IOException;

    /* renamed from: a */
    public final C7307v mo28858a(C7308w wVar) {
        return new C7307v(this, wVar);
    }

    /* renamed from: b */
    public final C7307v mo28859b() {
        return mo28858a((C7308w) null);
    }

    /* renamed from: c */
    public void mo28860c() throws IOException {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7305u mo28857a() {
        return new C7305u(this, null);
    }

    /* renamed from: a */
    public boolean mo25637a(String str) throws IOException {
        return Arrays.binarySearch(f20540b, str) >= 0;
    }
}
