package org.apache.http.conn.p537q;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.p536p.C15209a;
import org.apache.http.conn.p536p.C15210b;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p548i0.C15356h;
import org.apache.http.p548i0.C15357i;

@C6145c
/* renamed from: org.apache.http.conn.q.d */
/* compiled from: SSLSocketFactory */
public class C15218d implements C15210b {

    /* renamed from: e */
    public static final String f44121e = "TLS";

    /* renamed from: f */
    public static final String f44122f = "SSL";

    /* renamed from: g */
    public static final String f44123g = "SSLv2";

    /* renamed from: h */
    public static final C15220f f44124h = new C15216b();

    /* renamed from: i */
    public static final C15220f f44125i = new C15217c();

    /* renamed from: j */
    public static final C15220f f44126j = new C15219e();

    /* renamed from: k */
    private static final C15218d f44127k = new C15218d();

    /* renamed from: a */
    private final SSLContext f44128a;

    /* renamed from: b */
    private final SSLSocketFactory f44129b;

    /* renamed from: c */
    private final C15209a f44130c;

    /* renamed from: d */
    private volatile C15220f f44131d;

    public C15218d(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, C15209a aVar) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this.f44131d = f44125i;
        if (str == null) {
            str = "TLS";
        }
        TrustManager[] trustManagerArr = null;
        KeyManager[] a = keyStore != null ? m67454a(keyStore, str2) : null;
        if (keyStore2 != null) {
            trustManagerArr = m67455a(keyStore2);
        }
        this.f44128a = SSLContext.getInstance(str);
        this.f44128a.init(a, trustManagerArr, secureRandom);
        this.f44129b = this.f44128a.getSocketFactory();
        this.f44130c = aVar;
    }

    /* renamed from: a */
    private static KeyManager[] m67454a(KeyStore keyStore, String str) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
        if (keyStore != null) {
            KeyManagerFactory instance = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            instance.init(keyStore, str != null ? str.toCharArray() : null);
            return instance.getKeyManagers();
        }
        throw new IllegalArgumentException("Keystore may not be null");
    }

    /* renamed from: c */
    public static C15218d m67456c() {
        return f44127k;
    }

    /* renamed from: b */
    public C15220f mo47097b() {
        return this.f44131d;
    }

    /* renamed from: a */
    private static TrustManager[] m67455a(KeyStore keyStore) throws KeyStoreException, NoSuchAlgorithmException {
        if (keyStore != null) {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(keyStore);
            return instance.getTrustManagers();
        }
        throw new IllegalArgumentException("Keystore may not be null");
    }

    public C15218d(KeyStore keyStore, String str, KeyStore keyStore2) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this("TLS", keyStore, str, keyStore2, null, null);
    }

    /* renamed from: a */
    public Socket mo28969a() throws IOException {
        return (SSLSocket) this.f44129b.createSocket();
    }

    public C15218d(KeyStore keyStore, String str) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this("TLS", keyStore, str, null, null, null);
    }

    /* renamed from: a */
    public Socket mo47022a(Socket socket, String str, int i, InetAddress inetAddress, int i2, C15357i iVar) throws IOException {
        InetSocketAddress inetSocketAddress;
        if (str == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        } else if (iVar != null) {
            if (socket == null) {
                socket = mo28969a();
            }
            SSLSocket sSLSocket = (SSLSocket) socket;
            if (inetAddress != null || i2 > 0) {
                if (i2 < 0) {
                    i2 = 0;
                }
                sSLSocket.bind(new InetSocketAddress(inetAddress, i2));
            }
            int a = C15356h.m68007a(iVar);
            int c = C15356h.m68013c(iVar);
            C15209a aVar = this.f44130c;
            if (aVar != null) {
                inetSocketAddress = new InetSocketAddress(aVar.mo47073a(str), i);
            } else {
                inetSocketAddress = new InetSocketAddress(str, i);
            }
            try {
                sSLSocket.connect(inetSocketAddress, a);
                sSLSocket.setSoTimeout(c);
                try {
                    this.f44131d.mo47090a(str, sSLSocket);
                    return sSLSocket;
                } catch (IOException e) {
                    try {
                        sSLSocket.close();
                    } catch (Exception unused) {
                    }
                    throw e;
                }
            } catch (SocketTimeoutException unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connect to ");
                sb.append(inetSocketAddress);
                sb.append(" timed out");
                throw new ConnectTimeoutException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("Parameters may not be null.");
        }
    }

    public C15218d(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        this("TLS", null, null, keyStore, null, null);
    }

    public C15218d(SSLContext sSLContext, C15209a aVar) {
        this.f44131d = f44125i;
        this.f44128a = sSLContext;
        this.f44129b = this.f44128a.getSocketFactory();
        this.f44130c = aVar;
    }

    public C15218d(SSLContext sSLContext) {
        this(sSLContext, (C15209a) null);
    }

    private C15218d() {
        this.f44131d = f44125i;
        this.f44128a = null;
        this.f44129b = HttpsURLConnection.getDefaultSSLSocketFactory();
        this.f44130c = null;
    }

    /* renamed from: a */
    public boolean mo47023a(Socket socket) throws IllegalArgumentException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null.");
        } else if (!(socket instanceof SSLSocket)) {
            throw new IllegalArgumentException("Socket not created by this factory.");
        } else if (!socket.isClosed()) {
            return true;
        } else {
            throw new IllegalArgumentException("Socket is closed.");
        }
    }

    /* renamed from: a */
    public Socket mo28970a(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        SSLSocket sSLSocket = (SSLSocket) this.f44129b.createSocket(socket, str, i, z);
        this.f44131d.mo47090a(str, sSLSocket);
        return sSLSocket;
    }

    /* renamed from: a */
    public void mo47096a(C15220f fVar) {
        if (fVar != null) {
            this.f44131d = fVar;
            return;
        }
        throw new IllegalArgumentException("Hostname verifier may not be null");
    }
}
