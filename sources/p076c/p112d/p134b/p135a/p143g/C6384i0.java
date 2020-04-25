package p076c.p112d.p134b.p135a.p143g;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* renamed from: c.d.b.a.g.i0 */
/* compiled from: SecurityUtils */
public final class C6384i0 {
    private C6384i0() {
    }

    /* renamed from: a */
    public static KeyStore m29675a() throws KeyStoreException {
        return KeyStore.getInstance(KeyStore.getDefaultType());
    }

    /* renamed from: b */
    public static KeyStore m29683b() throws KeyStoreException {
        return KeyStore.getInstance("JKS");
    }

    /* renamed from: c */
    public static KeyStore m29684c() throws KeyStoreException {
        return KeyStore.getInstance("PKCS12");
    }

    /* renamed from: d */
    public static KeyFactory m29685d() throws NoSuchAlgorithmException {
        return KeyFactory.getInstance("RSA");
    }

    /* renamed from: e */
    public static Signature m29686e() throws NoSuchAlgorithmException {
        return Signature.getInstance("SHA1withRSA");
    }

    /* renamed from: f */
    public static Signature m29687f() throws NoSuchAlgorithmException {
        return Signature.getInstance("SHA256withRSA");
    }

    /* renamed from: g */
    public static CertificateFactory m29688g() throws CertificateException {
        return CertificateFactory.getInstance("X.509");
    }

    /* renamed from: a */
    public static void m29679a(KeyStore keyStore, InputStream inputStream, String str) throws IOException, GeneralSecurityException {
        try {
            keyStore.load(inputStream, str.toCharArray());
        } finally {
            inputStream.close();
        }
    }

    /* renamed from: a */
    public static PrivateKey m29677a(KeyStore keyStore, String str, String str2) throws GeneralSecurityException {
        return (PrivateKey) keyStore.getKey(str, str2.toCharArray());
    }

    /* renamed from: a */
    public static PrivateKey m29676a(KeyStore keyStore, InputStream inputStream, String str, String str2, String str3) throws IOException, GeneralSecurityException {
        m29679a(keyStore, inputStream, str);
        return m29677a(keyStore, str2, str3);
    }

    /* renamed from: a */
    public static byte[] m29682a(Signature signature, PrivateKey privateKey, byte[] bArr) throws InvalidKeyException, SignatureException {
        signature.initSign(privateKey);
        signature.update(bArr);
        return signature.sign();
    }

    /* renamed from: a */
    public static boolean m29681a(Signature signature, PublicKey publicKey, byte[] bArr, byte[] bArr2) throws InvalidKeyException, SignatureException {
        signature.initVerify(publicKey);
        signature.update(bArr2);
        try {
            return signature.verify(bArr);
        } catch (SignatureException unused) {
            return false;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.cert.X509Certificate m29678a(java.security.Signature r7, javax.net.ssl.X509TrustManager r8, java.util.List<java.lang.String> r9, byte[] r10, byte[] r11) throws java.security.InvalidKeyException, java.security.SignatureException {
        /*
            r0 = 0
            java.security.cert.CertificateFactory r1 = m29688g()     // Catch:{ CertificateException -> 0x004c }
            int r2 = r9.size()
            java.security.cert.X509Certificate[] r2 = new java.security.cert.X509Certificate[r2]
            java.util.Iterator r9 = r9.iterator()
            r3 = 0
            r4 = 0
        L_0x0011:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x0038
            java.lang.Object r5 = r9.next()
            java.lang.String r5 = (java.lang.String) r5
            byte[] r5 = p076c.p112d.p134b.p135a.p143g.C6371e.m29640a(r5)
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r5)
            java.security.cert.Certificate r5 = r1.generateCertificate(r6)     // Catch:{ CertificateException -> 0x0037 }
            boolean r6 = r5 instanceof java.security.cert.X509Certificate     // Catch:{ CertificateException -> 0x0037 }
            if (r6 != 0) goto L_0x002f
            return r0
        L_0x002f:
            int r6 = r4 + 1
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch:{ CertificateException -> 0x0037 }
            r2[r4] = r5     // Catch:{ CertificateException -> 0x0037 }
            r4 = r6
            goto L_0x0011
        L_0x0037:
            return r0
        L_0x0038:
            java.lang.String r9 = "RSA"
            r8.checkServerTrusted(r2, r9)     // Catch:{  }
            r8 = r2[r3]
            java.security.PublicKey r8 = r8.getPublicKey()
            boolean r7 = m29681a(r7, r8, r10, r11)
            if (r7 == 0) goto L_0x004c
            r7 = r2[r3]
            return r7
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p134b.p135a.p143g.C6384i0.m29678a(java.security.Signature, javax.net.ssl.X509TrustManager, java.util.List, byte[], byte[]):java.security.cert.X509Certificate");
    }

    /* renamed from: a */
    public static void m29680a(KeyStore keyStore, CertificateFactory certificateFactory, InputStream inputStream) throws GeneralSecurityException {
        int i = 0;
        for (Certificate certificateEntry : certificateFactory.generateCertificates(inputStream)) {
            keyStore.setCertificateEntry(String.valueOf(i), certificateEntry);
            i++;
        }
    }
}
