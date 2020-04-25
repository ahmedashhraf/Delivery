package p212io.fabric.sdk.android.services.network;

import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14228l;

/* renamed from: io.fabric.sdk.android.services.network.g */
/* compiled from: PinningTrustManager */
class C14391g implements X509TrustManager {

    /* renamed from: f */
    private static final long f42517f = 15552000000L;

    /* renamed from: g */
    private static final X509Certificate[] f42518g = new X509Certificate[0];

    /* renamed from: a */
    private final TrustManager[] f42519a;

    /* renamed from: b */
    private final C14392h f42520b;

    /* renamed from: c */
    private final long f42521c;

    /* renamed from: d */
    private final List<byte[]> f42522d = new LinkedList();

    /* renamed from: e */
    private final Set<X509Certificate> f42523e = Collections.synchronizedSet(new HashSet());

    public C14391g(C14392h hVar, C14390f fVar) {
        this.f42519a = m62337a(hVar);
        this.f42520b = hVar;
        this.f42521c = fVar.getPinCreationTimeInMillis();
        for (String a : fVar.getPins()) {
            this.f42522d.add(m62336a(a));
        }
    }

    /* renamed from: a */
    private TrustManager[] m62337a(C14392h hVar) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(hVar.f42524a);
            return instance.getTrustManagers();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        } catch (KeyStoreException e2) {
            throw new AssertionError(e2);
        }
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Client certificates not supported!");
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (!this.f42523e.contains(x509CertificateArr[0])) {
            m62334a(x509CertificateArr, str);
            m62333a(x509CertificateArr);
            this.f42523e.add(x509CertificateArr[0]);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return f42518g;
    }

    /* renamed from: a */
    private boolean m62335a(X509Certificate x509Certificate) throws CertificateException {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getPublicKey().getEncoded());
            for (byte[] equals : this.f42522d) {
                if (Arrays.equals(equals, digest)) {
                    return true;
                }
            }
            return false;
        } catch (NoSuchAlgorithmException e) {
            throw new CertificateException(e);
        }
    }

    /* renamed from: a */
    private void m62334a(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        for (TrustManager trustManager : this.f42519a) {
            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
        }
    }

    /* renamed from: a */
    private void m62333a(X509Certificate[] x509CertificateArr) throws CertificateException {
        if (this.f42521c == -1 || System.currentTimeMillis() - this.f42521c <= f42517f) {
            X509Certificate[] a = C14384a.m62319a(x509CertificateArr, this.f42520b);
            int length = a.length;
            int i = 0;
            while (i < length) {
                if (!m62335a(a[i])) {
                    i++;
                } else {
                    return;
                }
            }
            throw new CertificateException("No valid pins found in chain!");
        }
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pins are stale, (");
        sb.append(System.currentTimeMillis() - this.f42521c);
        sb.append(" millis vs ");
        sb.append(f42517f);
        sb.append(" millis) falling back to system trust.");
        j.mo45051w(C14215d.f41919m, sb.toString());
    }

    /* renamed from: a */
    private byte[] m62336a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
