package okhttp3.internal.p521l;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.p519j.C15011f;

/* renamed from: okhttp3.internal.l.c */
/* compiled from: CertificateChainCleaner */
public abstract class C15015c {
    /* renamed from: a */
    public static C15015c m66591a(X509TrustManager x509TrustManager) {
        return C15011f.m66571d().mo46614a(x509TrustManager);
    }

    /* renamed from: a */
    public abstract List<Certificate> mo46624a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;

    /* renamed from: a */
    public static C15015c m66592a(X509Certificate... x509CertificateArr) {
        return new C15013a(new C15014b(x509CertificateArr));
    }
}
