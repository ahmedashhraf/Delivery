package com.amplitude.api;

import android.content.Context;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import p468g.C13876z.C13878b;
import p470h.C13887c;
import p470h.C13896f;

/* renamed from: com.amplitude.api.k */
/* compiled from: PinnedAmplitudeClient */
public class C2887k extends C2857c {

    /* renamed from: c0 */
    public static final String f10213c0 = "com.amplitude.api.PinnedAmplitudeClient";
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public static final C2875d f10214d0 = C2875d.m13566a();

    /* renamed from: e0 */
    protected static final C2889b f10215e0 = new C2889b().mo11431a("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").mo11431a("MIIFdDCCBFygAwIBAgIQJ2buVutJ846r13Ci/ITeIjANBgkqhkiG9w0BAQwFADBvMQswCQYDVQQGEwJTRTEUMBIGA1UEChMLQWRkVHJ1c3QgQUIxJjAkBgNVBAsTHUFkZFRydXN0IEV4dGVybmFsIFRUUCBOZXR3b3JrMSIwIAYDVQQDExlBZGRUcnVzdCBFeHRlcm5hbCBDQSBSb290MB4XDTAwMDUzMDEwNDgzOFoXDTIwMDUzMDEwNDgzOFowgYUxCzAJBgNVBAYTAkdCMRswGQYDVQQIExJHcmVhdGVyIE1hbmNoZXN0ZXIxEDAOBgNVBAcTB1NhbGZvcmQxGjAYBgNVBAoTEUNPTU9ETyBDQSBMaW1pdGVkMSswKQYDVQQDEyJDT01PRE8gUlNBIENlcnRpZmljYXRpb24gQXV0aG9yaXR5MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAkehUktIKVrGsDSTdxc9EZ3SZKzejfSNwAHG8U9/E+ioSj0t/EFa9n3Byt2F/yUsPF6c947AEYe7/EZfH9IY+Cvo+XPmT5jR62RRr55yzhaCCenavcZDX7P0N+pxs+t+wgvQUfvm+xKYvT3+Zf7X8Z0NyvQwA1onrayzT7Y+YHBSrfuXjbvzYqOSSJNpDa2K4Vf3qwbxstovzDo2a5JtsaZn4eEgwRdWt4Q08RWD8MpZRJ7xnw8outmvqRsfHIKCxH2XeSAi6pE6p8oNGN4Tr6MyBSENnTnIqm1y9TBsoilwie7SrmNnu4FGDwwlGTm0+mfqVF9p8M1dBPI1R7Qu2XK8sYxrfV8g/vOldxJuvRZnio1oktLqpVj3Pb6r/SVi+8Kj/9Lit6Tf7urj0Czr56ENCHonYhMsT8dm74YlguIwoVqwUHZwK53Hrzw7dPamWoUi9PPevtQ0iTMARgexWO/bTouJbt7IEIlKVgJNp6I5MZfGRAy1wdALqi2cVKWlSArvX31BqVUa/oKMoYX9w0MOiqiwhqkfOKJwGRXa/ghgntNWutMtQ5mv0TIZxMOmm3xaG4Nj/QN370EKIf6MzOi5cHkERgWPOGHFrK+ymircxXDpqR+DDeVnWIBqv8mqYqnK8V0rSS527EPywTEHl7R09XiidnMy/s1Hap0flhFMCAwEAAaOB9DCB8TAfBgNVHSMEGDAWgBStvZh6NLQm9/rEJlTvA73gJMtUGjAdBgNVHQ4EFgQUu69+Aj36pvE8hI6t7jiY7NkyMtQwDgYDVR0PAQH/BAQDAgGGMA8GA1UdEwEB/wQFMAMBAf8wEQYDVR0gBAowCDAGBgRVHSAAMEQGA1UdHwQ9MDswOaA3oDWGM2h0dHA6Ly9jcmwudXNlcnRydXN0LmNvbS9BZGRUcnVzdEV4dGVybmFsQ0FSb290LmNybDA1BggrBgEFBQcBAQQpMCcwJQYIKwYBBQUHMAGGGWh0dHA6Ly9vY3NwLnVzZXJ0cnVzdC5jb20wDQYJKoZIhvcNAQEMBQADggEBAGS/g/FfmoXQzbihKVcN6Fr30ek+8nYEbvFScLsePP9NDXRqzIGCJdPDoCpdTPW6i6FtxFQJdcfjJw5dhHk3QBN39bSsHNA7qxcS1u80GH4r6XnTq1dFDK8o+tDb5VCViLvfhVdpfZLYUspzgb8c8+a4bmYRBbMelC1/kZWSWfFMzqORcUx8Rww7Cxn2obFshj5cqsQugsv5B5a6SE2Q8pTIqXOi6wZ7I53eovNNVZ96YUWYGGjHXkBrI/V5eu+MtWuLt29G9HvxPUsE2JOAWVrgQSQdso8VYFhH2+9uRv0V9dlfmrPb2LjkQLPNlzmuhbsdjrzch5vRpu/xO28QOG8=");

    /* renamed from: f0 */
    static Map<String, C2887k> f10216f0 = new HashMap();

    /* renamed from: a0 */
    protected SSLSocketFactory f10217a0;

    /* renamed from: b0 */
    protected boolean f10218b0 = false;

    /* renamed from: com.amplitude.api.k$a */
    /* compiled from: PinnedAmplitudeClient */
    class C2888a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2887k f10219a;

        C2888a(C2887k kVar) {
            this.f10219a = kVar;
        }

        public void run() {
            if (!this.f10219a.f10218b0) {
                SSLSocketFactory t = C2887k.this.mo11429t();
                if (t != null) {
                    this.f10219a.f10019b = new C13878b().mo43788a(t).mo43791a();
                } else {
                    C2887k.f10214d0.mo11292b(C2887k.f10213c0, "Unable to pin SSL as requested. Will send data without SSL pinning.");
                }
                this.f10219a.f10218b0 = true;
            }
        }
    }

    /* renamed from: com.amplitude.api.k$b */
    /* compiled from: PinnedAmplitudeClient */
    protected static class C2889b {

        /* renamed from: a */
        private final List<String> f10221a = new ArrayList();

        protected C2889b() {
        }

        /* renamed from: a */
        public C2889b mo11431a(String str) {
            this.f10221a.add(str);
            return this;
        }

        /* renamed from: a */
        public SSLContext mo11432a() {
            String str = C2887k.f10213c0;
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                KeyStore instance3 = KeyStore.getInstance(KeyStore.getDefaultType());
                instance3.load(null, null);
                int i = 1;
                for (String b : this.f10221a) {
                    X509Certificate x509Certificate = (X509Certificate) instance.generateCertificate(new C13887c().m59514a(C13896f.m59652b(b)).mo43833A());
                    int i2 = i + 1;
                    instance3.setCertificateEntry(Integer.toString(i), x509Certificate);
                    i = i2;
                }
                instance2.init(instance3);
                SSLContext instance4 = SSLContext.getInstance("TLS");
                instance4.init(null, instance2.getTrustManagers(), null);
                return instance4;
            } catch (GeneralSecurityException e) {
                C2887k.f10214d0.mo11293b(str, e.getMessage(), e);
                return null;
            } catch (IOException e2) {
                C2887k.f10214d0.mo11293b(str, e2.getMessage(), e2);
                return null;
            }
        }
    }

    public C2887k(String str) {
        super(str);
    }

    /* renamed from: h */
    public static synchronized C2887k m13759h(String str) {
        C2887k kVar;
        synchronized (C2887k.class) {
            String b = C2892n.m13817b(str);
            kVar = (C2887k) f10216f0.get(b);
            if (kVar == null) {
                kVar = new C2887k(b);
                f10216f0.put(b, kVar);
            }
        }
        return kVar;
    }

    /* renamed from: v */
    public static C2887k m13761v() {
        return m13759h(null);
    }

    /* renamed from: a */
    public synchronized C2857c mo11187a(Context context, String str, String str2) {
        super.mo11187a(context, str, str2);
        mo11202a((Runnable) new C2888a(this));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public SSLSocketFactory mo11429t() {
        return mo11428a(f10215e0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SSLSocketFactory mo11428a(C2889b bVar) {
        String str = f10213c0;
        if (bVar == null) {
            return null;
        }
        if (this.f10217a0 == null) {
            try {
                this.f10217a0 = bVar.mo11432a().getSocketFactory();
                f10214d0.mo11295c(str, "Pinning SSL session using Comodo CA Cert");
            } catch (Exception e) {
                f10214d0.mo11293b(str, e.getMessage(), e);
            }
        }
        return this.f10217a0;
    }
}
