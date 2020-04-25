package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.j9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5298j9 extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f15154a;

    C5298j9() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    /* renamed from: a */
    private final SSLSocket m23042a(SSLSocket sSLSocket) {
        return new C5287i9(this, sSLSocket);
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m23042a((SSLSocket) this.f15154a.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.f15154a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f15154a.getSupportedCipherSuites();
    }

    private C5298j9(SSLSocketFactory sSLSocketFactory) {
        this.f15154a = sSLSocketFactory;
    }

    public final Socket createSocket(String str, int i) throws IOException {
        return m23042a((SSLSocket) this.f15154a.createSocket(str, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m23042a((SSLSocket) this.f15154a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return m23042a((SSLSocket) this.f15154a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m23042a((SSLSocket) this.f15154a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket() throws IOException {
        return m23042a((SSLSocket) this.f15154a.createSocket());
    }
}
