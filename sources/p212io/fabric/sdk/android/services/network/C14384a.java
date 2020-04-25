package p212io.fabric.sdk.android.services.network;

import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;

/* renamed from: io.fabric.sdk.android.services.network.a */
/* compiled from: CertificateChainCleaner */
final class C14384a {
    private C14384a() {
    }

    /* renamed from: a */
    public static X509Certificate[] m62319a(X509Certificate[] x509CertificateArr, C14392h hVar) throws CertificateException {
        LinkedList linkedList = new LinkedList();
        boolean b = hVar.mo45508b(x509CertificateArr[0]);
        linkedList.add(x509CertificateArr[0]);
        boolean z = true;
        boolean z2 = b;
        int i = 1;
        while (i < x509CertificateArr.length) {
            if (hVar.mo45508b(x509CertificateArr[i])) {
                z2 = true;
            }
            if (!m62318a(x509CertificateArr[i], x509CertificateArr[i - 1])) {
                break;
            }
            linkedList.add(x509CertificateArr[i]);
            i++;
        }
        X509Certificate a = hVar.mo45507a(x509CertificateArr[i - 1]);
        if (a != null) {
            linkedList.add(a);
        } else {
            z = z2;
        }
        if (z) {
            return (X509Certificate[]) linkedList.toArray(new X509Certificate[linkedList.size()]);
        }
        throw new CertificateException("Didn't find a trust anchor in chain cleanup!");
    }

    /* renamed from: a */
    private static boolean m62318a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getIssuerX500Principal())) {
            return false;
        }
        try {
            x509Certificate2.verify(x509Certificate.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
