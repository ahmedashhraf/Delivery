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

/* renamed from: org.apache.http.f0.l */
/* compiled from: SocketHttpServerConnection */
public class C15262l extends C15252b implements C15461m {

    /* renamed from: T */
    private volatile boolean f44209T;

    /* renamed from: U */
    private volatile Socket f44210U = null;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47194a() {
        if (!this.f44209T) {
            throw new IllegalStateException("Connection is not open");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C15322f mo47240b(Socket socket, int i, C15357i iVar) throws IOException {
        return mo47243d(socket, i, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C15321e mo47242c(Socket socket, int i, C15357i iVar) throws IOException {
        return new C15314p(socket, i, iVar);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[ExcHandler: UnsupportedOperationException (unused java.lang.UnsupportedOperationException), SYNTHETIC, Splitter:B:6:0x0010] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() throws java.io.IOException {
        /*
            r1 = this;
            boolean r0 = r1.f44209T
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1.f44209T = r0
            r1.mo47204n()
            java.net.Socket r0 = r1.f44210U     // Catch:{ IOException -> 0x0010 }
            r0.shutdownOutput()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            java.net.Socket r0 = r1.f44210U     // Catch:{ UnsupportedOperationException -> 0x0015, UnsupportedOperationException -> 0x0015 }
            r0.shutdownInput()     // Catch:{ UnsupportedOperationException -> 0x0015, UnsupportedOperationException -> 0x0015 }
        L_0x0015:
            java.net.Socket r0 = r1.f44210U
            r0.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.p541f0.C15262l.close():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C15322f mo47243d(Socket socket, int i, C15357i iVar) throws IOException {
        return new C15315q(socket, i, iVar);
    }

    public InetAddress getLocalAddress() {
        if (this.f44210U != null) {
            return this.f44210U.getLocalAddress();
        }
        return null;
    }

    public int getLocalPort() {
        if (this.f44210U != null) {
            return this.f44210U.getLocalPort();
        }
        return -1;
    }

    public InetAddress getRemoteAddress() {
        if (this.f44210U != null) {
            return this.f44210U.getInetAddress();
        }
        return null;
    }

    public int getRemotePort() {
        if (this.f44210U != null) {
            return this.f44210U.getPort();
        }
        return -1;
    }

    public int getSocketTimeout() {
        if (this.f44210U != null) {
            try {
                return this.f44210U.getSoTimeout();
            } catch (SocketException unused) {
            }
        }
        return -1;
    }

    public boolean isOpen() {
        return this.f44209T;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo47244p() {
        if (this.f44209T) {
            throw new IllegalStateException("Connection is already open");
        }
    }

    public void setSocketTimeout(int i) {
        mo47194a();
        if (this.f44210U != null) {
            try {
                this.f44210U.setSoTimeout(i);
            } catch (SocketException unused) {
            }
        }
    }

    public void shutdown() throws IOException {
        this.f44209T = false;
        Socket socket = this.f44210U;
        if (socket != null) {
            socket.close();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Socket mo47241c() {
        return this.f44210U;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15321e mo47239a(Socket socket, int i, C15357i iVar) throws IOException {
        return mo47242c(socket, i, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47214a(Socket socket, C15357i iVar) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        } else if (iVar != null) {
            this.f44210U = socket;
            int d = C15356h.m68015d(iVar);
            mo47195a(mo47239a(socket, d, iVar), mo47240b(socket, d, iVar), iVar);
            this.f44209T = true;
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }
}
