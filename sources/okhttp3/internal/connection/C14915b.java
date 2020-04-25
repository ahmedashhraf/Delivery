package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.Internal;
import p468g.C13848l;

/* renamed from: okhttp3.internal.connection.b */
/* compiled from: ConnectionSpecSelector */
public final class C14915b {

    /* renamed from: a */
    private final List<C13848l> f43182a;

    /* renamed from: b */
    private int f43183b = 0;

    /* renamed from: c */
    private boolean f43184c;

    /* renamed from: d */
    private boolean f43185d;

    public C14915b(List<C13848l> list) {
        this.f43182a = list;
    }

    /* renamed from: b */
    private boolean m66080b(SSLSocket sSLSocket) {
        for (int i = this.f43183b; i < this.f43182a.size(); i++) {
            if (((C13848l) this.f43182a.get(i)).mo43517a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C13848l mo46373a(SSLSocket sSLSocket) throws IOException {
        C13848l lVar;
        int i = this.f43183b;
        int size = this.f43182a.size();
        while (true) {
            if (i >= size) {
                lVar = null;
                break;
            }
            lVar = (C13848l) this.f43182a.get(i);
            if (lVar.mo43517a(sSLSocket)) {
                this.f43183b = i + 1;
                break;
            }
            i++;
        }
        if (lVar != null) {
            this.f43184c = m66080b(sSLSocket);
            Internal.instance.apply(lVar, sSLSocket, this.f43185d);
            return lVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f43185d);
        sb.append(", modes=");
        sb.append(this.f43182a);
        sb.append(", supported protocols=");
        sb.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(sb.toString());
    }

    /* renamed from: a */
    public boolean mo46374a(IOException iOException) {
        boolean z = true;
        this.f43185d = true;
        if (!this.f43184c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z2 = iOException instanceof SSLHandshakeException;
        if ((z2 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if (!z2 && !(iOException instanceof SSLProtocolException) && !(iOException instanceof SSLException)) {
            z = false;
        }
        return z;
    }
}
