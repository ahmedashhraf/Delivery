package org.jivesoftware.smack.util;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.jivesoftware.smack.ConnectionConfiguration.Builder;
import org.jivesoftware.smack.SmackException.SecurityNotPossibleException;

public class TLSUtils {
    private static final HostnameVerifier DOES_NOT_VERIFY_VERIFIER = new HostnameVerifier() {
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    };
    public static final String PROTO_SSL3 = "SSLv3";
    public static final String PROTO_TLSV1 = "TLSv1";
    public static final String PROTO_TLSV1_1 = "TLSv1.1";
    public static final String PROTO_TLSV1_2 = "TLSv1.2";
    public static final String SSL = "SSL";
    public static final String TLS = "TLS";

    public static class AcceptAllTrustManager implements X509TrustManager {
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static <B extends Builder<B, ?>> B acceptAllCertificates(B b) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(null, new TrustManager[]{new AcceptAllTrustManager()}, new SecureRandom());
        b.setCustomSSLContext(instance);
        return b;
    }

    public static <B extends Builder<B, ?>> B disableHostnameVerificationForTlsCertificicates(B b) {
        b.setHostnameVerifier(DOES_NOT_VERIFY_VERIFIER);
        return b;
    }

    public static void setEnabledProtocolsAndCiphers(SSLSocket sSLSocket, String[] strArr, String[] strArr2) throws SecurityNotPossibleException {
        String str = "' are supported.";
        String str2 = "', but only '";
        if (strArr != null) {
            HashSet hashSet = new HashSet(Arrays.asList(strArr));
            HashSet hashSet2 = new HashSet(Arrays.asList(sSLSocket.getSupportedProtocols()));
            HashSet hashSet3 = new HashSet(hashSet2);
            hashSet3.retainAll(hashSet);
            if (!hashSet3.isEmpty()) {
                sSLSocket.setEnabledProtocols((String[]) hashSet3.toArray(new String[hashSet3.size()]));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Request to enable SSL/TLS protocols '");
                sb.append(StringUtils.collectionToString(hashSet));
                sb.append(str2);
                sb.append(StringUtils.collectionToString(hashSet2));
                sb.append(str);
                throw new SecurityNotPossibleException(sb.toString());
            }
        }
        if (strArr2 != null) {
            HashSet hashSet4 = new HashSet(Arrays.asList(strArr2));
            HashSet hashSet5 = new HashSet(Arrays.asList(sSLSocket.getEnabledCipherSuites()));
            HashSet hashSet6 = new HashSet(hashSet5);
            hashSet6.retainAll(hashSet4);
            if (!hashSet6.isEmpty()) {
                sSLSocket.setEnabledCipherSuites((String[]) hashSet6.toArray(new String[hashSet6.size()]));
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Request to enable SSL/TLS ciphers '");
            sb2.append(StringUtils.collectionToString(hashSet4));
            sb2.append(str2);
            sb2.append(StringUtils.collectionToString(hashSet5));
            sb2.append(str);
            throw new SecurityNotPossibleException(sb2.toString());
        }
    }

    public static <B extends Builder<B, ?>> B setSSLv3AndTLSOnly(B b) {
        b.setEnabledSSLProtocols(new String[]{PROTO_TLSV1_2, PROTO_TLSV1_1, PROTO_TLSV1, PROTO_SSL3});
        return b;
    }

    public static <B extends Builder<B, ?>> B setTLSOnly(B b) {
        b.setEnabledSSLProtocols(new String[]{PROTO_TLSV1_2, PROTO_TLSV1_1, PROTO_TLSV1});
        return b;
    }
}
