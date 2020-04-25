package com.clevertap.android.sdk;

import java.io.BufferedInputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

/* renamed from: com.clevertap.android.sdk.p1 */
/* compiled from: SSLContextBuilder */
final class C3206p1 {
    C3206p1() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public SSLContext mo12551a() {
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            KeyStore instance3 = KeyStore.getInstance(KeyStore.getDefaultType());
            instance3.load(null, null);
            instance3.setCertificateEntry("DigiCertGlobalRootCA", (X509Certificate) instance.generateCertificate(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("com/clevertap/android/sdk/certificates/DigiCertGlobalRootCA.crt"))));
            instance3.setCertificateEntry("DigiCertSHA2SecureServerCA", (X509Certificate) instance.generateCertificate(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("com/clevertap/android/sdk/certificates/DigiCertSHA2SecureServerCA.crt"))));
            instance2.init(instance3);
            SSLContext instance4 = SSLContext.getInstance("TLS");
            instance4.init(null, instance2.getTrustManagers(), null);
            C3111h1.m14930d("SSL Context built");
            return instance4;
        } catch (Throwable th) {
            C3111h1.m14937e("Error building SSL Context", th);
            return null;
        }
    }
}
