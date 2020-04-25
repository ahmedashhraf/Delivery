package org.apache.http.conn.p537q;

import java.io.IOException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;

/* renamed from: org.apache.http.conn.q.f */
/* compiled from: X509HostnameVerifier */
public interface C15220f extends HostnameVerifier {
    /* renamed from: a */
    void mo47089a(String str, X509Certificate x509Certificate) throws SSLException;

    /* renamed from: a */
    void mo47090a(String str, SSLSocket sSLSocket) throws IOException;

    /* renamed from: a */
    void mo47093a(String str, String[] strArr, String[] strArr2) throws SSLException;
}
