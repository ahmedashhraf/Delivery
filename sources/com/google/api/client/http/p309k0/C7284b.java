package com.google.api.client.http.p309k0;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

/* renamed from: com.google.api.client.http.k0.b */
/* compiled from: DefaultConnectionFactory */
public class C7284b implements C7283a {

    /* renamed from: a */
    private final Proxy f20598a;

    public C7284b() {
        this(null);
    }

    /* renamed from: a */
    public HttpURLConnection mo28974a(URL url) throws IOException {
        Proxy proxy = this.f20598a;
        return (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
    }

    public C7284b(Proxy proxy) {
        this.f20598a = proxy;
    }
}
