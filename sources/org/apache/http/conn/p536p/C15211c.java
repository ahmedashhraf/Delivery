package org.apache.http.conn.p536p;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p548i0.C15356h;
import org.apache.http.p548i0.C15357i;

@C6144b
/* renamed from: org.apache.http.conn.p.c */
/* compiled from: PlainSocketFactory */
public final class C15211c implements C15214f {

    /* renamed from: b */
    private static final C15211c f44112b = new C15211c();

    /* renamed from: a */
    private final C15209a f44113a;

    public C15211c(C15209a aVar) {
        this.f44113a = aVar;
    }

    /* renamed from: b */
    public static C15211c m67424b() {
        return f44112b;
    }

    /* renamed from: a */
    public Socket mo28969a() {
        return new Socket();
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
            if (inetAddress != null || i2 > 0) {
                if (i2 < 0) {
                    i2 = 0;
                }
                socket.bind(new InetSocketAddress(inetAddress, i2));
            }
            int a = C15356h.m68007a(iVar);
            C15209a aVar = this.f44113a;
            if (aVar != null) {
                inetSocketAddress = new InetSocketAddress(aVar.mo47073a(str), i);
            } else {
                inetSocketAddress = new InetSocketAddress(str, i);
            }
            try {
                socket.connect(inetSocketAddress, a);
                return socket;
            } catch (SocketTimeoutException unused) {
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

    public C15211c() {
        this(null);
    }

    /* renamed from: a */
    public final boolean mo47023a(Socket socket) throws IllegalArgumentException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null.");
        } else if (!socket.isClosed()) {
            return false;
        } else {
            throw new IllegalArgumentException("Socket is closed.");
        }
    }
}
