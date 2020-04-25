package okhttp3.internal.p519j;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import p201f.p202a.C5952h;
import p468g.C13799a0;

/* renamed from: okhttp3.internal.j.b */
/* compiled from: ConscryptPlatform */
public class C15006b extends C15011f {
    private C15006b() {
    }

    /* renamed from: f */
    private Provider m66546f() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    /* renamed from: a */
    public void mo46618a(SSLSocket sSLSocket, String str, List<C13799a0> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C15011f.m66568a(list).toArray(new String[0]));
            return;
        }
        super.mo46618a(sSLSocket, str, list);
    }

    @C5952h
    /* renamed from: b */
    public String mo46619b(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.mo46619b(sSLSocket);
    }

    @C5952h
    /* renamed from: c */
    public X509TrustManager mo46623c(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.mo46623c(sSLSocketFactory);
        }
        try {
            Object a = C15011f.m66567a((Object) sSLSocketFactory, Object.class, "sslParameters");
            if (a != null) {
                return (X509TrustManager) C15011f.m66567a(a, X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (Exception e) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }

    /* renamed from: b */
    public SSLContext mo46620b() {
        try {
            return SSLContext.getInstance("TLSv1.3", m66546f());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", m66546f());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    /* renamed from: c */
    public static C15006b m66545c() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new C15006b();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public void mo46632b(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
