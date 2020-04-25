package p076c.p112d.p134b.p135a.p143g;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: c.d.b.a.g.l0 */
/* compiled from: SslUtils */
public final class C6393l0 {

    /* renamed from: c.d.b.a.g.l0$a */
    /* compiled from: SslUtils */
    static class C6394a implements X509TrustManager {
        C6394a() {
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    /* renamed from: c.d.b.a.g.l0$b */
    /* compiled from: SslUtils */
    static class C6395b implements HostnameVerifier {
        C6395b() {
        }

        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    private C6393l0() {
    }

    /* renamed from: a */
    public static KeyManagerFactory m29705a() throws NoSuchAlgorithmException {
        return KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
    }

    /* renamed from: b */
    public static TrustManagerFactory m29707b() throws NoSuchAlgorithmException {
        return TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
    }

    /* renamed from: c */
    public static KeyManagerFactory m29708c() throws NoSuchAlgorithmException {
        return KeyManagerFactory.getInstance("PKIX");
    }

    /* renamed from: d */
    public static TrustManagerFactory m29709d() throws NoSuchAlgorithmException {
        return TrustManagerFactory.getInstance("PKIX");
    }

    /* renamed from: e */
    public static SSLContext m29710e() throws NoSuchAlgorithmException {
        return SSLContext.getInstance("SSL");
    }

    /* renamed from: f */
    public static SSLContext m29711f() throws NoSuchAlgorithmException {
        return SSLContext.getInstance("TLS");
    }

    @C2766f
    /* renamed from: g */
    public static HostnameVerifier m29712g() {
        return new C6395b();
    }

    @C2766f
    /* renamed from: h */
    public static SSLContext m29713h() throws GeneralSecurityException {
        TrustManager[] trustManagerArr = {new C6394a()};
        SSLContext f = m29711f();
        f.init(null, trustManagerArr, null);
        return f;
    }

    /* renamed from: a */
    public static SSLContext m29706a(SSLContext sSLContext, KeyStore keyStore, TrustManagerFactory trustManagerFactory) throws GeneralSecurityException {
        trustManagerFactory.init(keyStore);
        sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
        return sSLContext;
    }
}
