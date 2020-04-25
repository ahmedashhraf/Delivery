package com.google.api.client.http.p309k0;

import com.google.api.client.http.C7253a0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6384i0;
import p076c.p112d.p134b.p135a.p143g.C6393l0;

/* renamed from: com.google.api.client.http.k0.e */
/* compiled from: NetHttpTransport */
public final class C7288e extends C7253a0 {

    /* renamed from: f */
    private static final String[] f20607f = {"DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"};

    /* renamed from: c */
    private final C7283a f20608c;

    /* renamed from: d */
    private final SSLSocketFactory f20609d;

    /* renamed from: e */
    private final HostnameVerifier f20610e;

    /* renamed from: com.google.api.client.http.k0.e$a */
    /* compiled from: NetHttpTransport */
    public static final class C7289a {

        /* renamed from: a */
        private SSLSocketFactory f20611a;

        /* renamed from: b */
        private HostnameVerifier f20612b;

        /* renamed from: c */
        private Proxy f20613c;

        /* renamed from: d */
        private C7283a f20614d;

        /* renamed from: a */
        public C7289a mo28980a(Proxy proxy) {
            this.f20613c = proxy;
            return this;
        }

        @C2766f
        /* renamed from: b */
        public C7289a mo28985b() throws GeneralSecurityException {
            this.f20612b = C6393l0.m29712g();
            this.f20611a = C6393l0.m29713h().getSocketFactory();
            return this;
        }

        /* renamed from: c */
        public HostnameVerifier mo28986c() {
            return this.f20612b;
        }

        /* renamed from: d */
        public SSLSocketFactory mo28987d() {
            return this.f20611a;
        }

        /* renamed from: a */
        public C7289a mo28977a(C7283a aVar) {
            this.f20614d = aVar;
            return this;
        }

        /* renamed from: a */
        public C7289a mo28979a(InputStream inputStream, String str) throws GeneralSecurityException, IOException {
            KeyStore b = C6384i0.m29683b();
            C6384i0.m29679a(b, inputStream, str);
            return mo28981a(b);
        }

        /* renamed from: a */
        public C7289a mo28978a(InputStream inputStream) throws GeneralSecurityException, IOException {
            KeyStore b = C6384i0.m29683b();
            b.load(null, null);
            C6384i0.m29680a(b, C6384i0.m29688g(), inputStream);
            return mo28981a(b);
        }

        /* renamed from: a */
        public C7289a mo28981a(KeyStore keyStore) throws GeneralSecurityException {
            SSLContext f = C6393l0.m29711f();
            C6393l0.m29706a(f, keyStore, C6393l0.m29709d());
            return mo28983a(f.getSocketFactory());
        }

        /* renamed from: a */
        public C7289a mo28983a(SSLSocketFactory sSLSocketFactory) {
            this.f20611a = sSLSocketFactory;
            return this;
        }

        /* renamed from: a */
        public C7289a mo28982a(HostnameVerifier hostnameVerifier) {
            this.f20612b = hostnameVerifier;
            return this;
        }

        /* renamed from: a */
        public C7288e mo28984a() {
            Proxy proxy = this.f20613c;
            return proxy == null ? new C7288e(this.f20614d, this.f20611a, this.f20612b) : new C7288e(proxy, this.f20611a, this.f20612b);
        }
    }

    static {
        Arrays.sort(f20607f);
    }

    public C7288e() {
        this((C7283a) null, (SSLSocketFactory) null, (HostnameVerifier) null);
    }

    C7288e(Proxy proxy, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        this((C7283a) new C7284b(proxy), sSLSocketFactory, hostnameVerifier);
    }

    /* renamed from: a */
    public boolean mo25637a(String str) {
        return Arrays.binarySearch(f20607f, str) >= 0;
    }

    C7288e(C7283a aVar, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        if (aVar == null) {
            aVar = new C7284b();
        }
        this.f20608c = aVar;
        this.f20609d = sSLSocketFactory;
        this.f20610e = hostnameVerifier;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7285c m35195a(String str, String str2) throws IOException {
        C6381h0.m29668a(mo25637a(str), "HTTP method %s not supported", str);
        HttpURLConnection a = this.f20608c.mo28974a(new URL(str2));
        a.setRequestMethod(str);
        if (a instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) a;
            HostnameVerifier hostnameVerifier = this.f20610e;
            if (hostnameVerifier != null) {
                httpsURLConnection.setHostnameVerifier(hostnameVerifier);
            }
            SSLSocketFactory sSLSocketFactory = this.f20609d;
            if (sSLSocketFactory != null) {
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
            }
        }
        return new C7285c(a);
    }
}
