package org.apache.http.p541f0;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import org.apache.http.C15461m;
import org.apache.http.p541f0.p545o.C15314p;
import org.apache.http.p541f0.p545o.C15315q;
import org.apache.http.p546g0.C15321e;
import org.apache.http.p546g0.C15322f;
import org.apache.http.p548i0.C15356h;
import org.apache.http.p548i0.C15357i;

/* renamed from: org.apache.http.f0.k */
/* compiled from: SocketHttpClientConnection */
public class C15261k extends C15251a implements C15461m {

    /* renamed from: T */
    private volatile boolean f44207T;

    /* renamed from: U */
    private volatile Socket f44208U = null;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15321e mo47226a(Socket socket, int i, C15357i iVar) throws IOException {
        return new C15314p(socket, i, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C15322f mo47227b(Socket socket, int i, C15357i iVar) throws IOException {
        return new C15315q(socket, i, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Socket mo47228c() {
        return this.f44208U;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[ExcHandler: UnsupportedOperationException (unused java.lang.UnsupportedOperationException), SYNTHETIC, Splitter:B:6:0x0010] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() throws java.io.IOException {
        /*
            r1 = this;
            boolean r0 = r1.f44207T
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1.f44207T = r0
            r1.mo47188n()
            java.net.Socket r0 = r1.f44208U     // Catch:{ IOException -> 0x0010 }
            r0.shutdownOutput()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            java.net.Socket r0 = r1.f44208U     // Catch:{ UnsupportedOperationException -> 0x0015, UnsupportedOperationException -> 0x0015 }
            r0.shutdownInput()     // Catch:{ UnsupportedOperationException -> 0x0015, UnsupportedOperationException -> 0x0015 }
        L_0x0015:
            java.net.Socket r0 = r1.f44208U
            r0.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.p541f0.C15261k.close():void");
    }

    public InetAddress getLocalAddress() {
        if (this.f44208U != null) {
            return this.f44208U.getLocalAddress();
        }
        return null;
    }

    public int getLocalPort() {
        if (this.f44208U != null) {
            return this.f44208U.getLocalPort();
        }
        return -1;
    }

    public InetAddress getRemoteAddress() {
        if (this.f44208U != null) {
            return this.f44208U.getInetAddress();
        }
        return null;
    }

    public int getRemotePort() {
        if (this.f44208U != null) {
            return this.f44208U.getPort();
        }
        return -1;
    }

    public int getSocketTimeout() {
        if (this.f44208U != null) {
            try {
                return this.f44208U.getSoTimeout();
            } catch (SocketException unused) {
            }
        }
        return -1;
    }

    public boolean isOpen() {
        return this.f44207T;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo47184j() {
        if (!this.f44207T) {
            throw new IllegalStateException("Connection is not open");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo47236p() {
        if (this.f44207T) {
            throw new IllegalStateException("Connection is already open");
        }
    }

    public void setSocketTimeout(int i) {
        mo47184j();
        if (this.f44208U != null) {
            try {
                this.f44208U.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }

    public void shutdown() throws IOException {
        this.f44207T = false;
        Socket socket = this.f44208U;
        if (socket != null) {
            socket.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47207a(Socket socket, C15357i iVar) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        } else if (iVar != null) {
            this.f44208U = socket;
            int d = C15356h.m68015d(iVar);
            mo47178a(mo47226a(socket, d, iVar), mo47227b(socket, d, iVar), iVar);
            this.f44207T = true;
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }
}
