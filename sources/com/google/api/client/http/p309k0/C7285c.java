package com.google.api.client.http.p309k0;

import com.google.api.client.http.C7259d0;
import com.google.api.client.http.C7261e0;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: com.google.api.client.http.k0.c */
/* compiled from: NetHttpRequest */
final class C7285c extends C7259d0 {

    /* renamed from: e */
    private final HttpURLConnection f20599e;

    C7285c(HttpURLConnection httpURLConnection) {
        this.f20599e = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    /* renamed from: a */
    public void mo25349a(String str, String str2) {
        this.f20599e.addRequestProperty(str, str2);
    }

    /* renamed from: a */
    public void mo28872a(int i, int i2) {
        this.f20599e.setReadTimeout(i2);
        this.f20599e.setConnectTimeout(i);
    }

    /* renamed from: a */
    public C7261e0 mo25348a() throws IOException {
        HttpURLConnection httpURLConnection = this.f20599e;
        if (mo28880e() != null) {
            String d = mo28879d();
            if (d != null) {
                mo25349a("Content-Type", d);
            }
            String b = mo28876b();
            if (b != null) {
                mo25349a("Content-Encoding", b);
            }
            long c = mo28878c();
            if (c >= 0) {
                mo25349a("Content-Length", Long.toString(c));
            }
            String requestMethod = httpURLConnection.getRequestMethod();
            if ("POST".equals(requestMethod) || "PUT".equals(requestMethod)) {
                httpURLConnection.setDoOutput(true);
                if (c < 0 || c > 2147483647L) {
                    httpURLConnection.setChunkedStreamingMode(0);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode((int) c);
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    mo28880e().writeTo(outputStream);
                    try {
                    } catch (IOException e) {
                        throw e;
                    }
                } finally {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } else {
                C6381h0.m29668a(c == 0, "%s with non-zero content length is not supported", requestMethod);
            }
        }
        try {
            httpURLConnection.connect();
            return new C7286d(httpURLConnection);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
