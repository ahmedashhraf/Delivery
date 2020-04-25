package org.apache.http.conn;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.apache.http.conn.p536p.C15214f;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p548i0.C15356h;
import org.apache.http.p548i0.C15357i;

@C6144b
/* renamed from: org.apache.http.conn.l */
/* compiled from: MultihomePlainSocketFactory */
public final class C15188l implements C15214f {

    /* renamed from: a */
    private static final C15188l f44076a = new C15188l();

    private C15188l() {
    }

    /* renamed from: b */
    public static C15188l m67344b() {
        return f44076a;
    }

    /* renamed from: a */
    public Socket mo28969a() {
        return new Socket();
    }

    /* renamed from: a */
    public Socket mo47022a(Socket socket, String str, int i, InetAddress inetAddress, int i2, C15357i iVar) throws IOException {
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
            InetAddress[] allByName = InetAddress.getAllByName(str);
            ArrayList<InetAddress> arrayList = new ArrayList<>(allByName.length);
            arrayList.addAll(Arrays.asList(allByName));
            Collections.shuffle(arrayList);
            Throwable th = null;
            for (InetAddress inetAddress2 : arrayList) {
                try {
                    socket.connect(new InetSocketAddress(inetAddress2, i), a);
                    break;
                } catch (SocketTimeoutException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Connect to ");
                    sb.append(inetAddress2);
                    sb.append(" timed out");
                    throw new ConnectTimeoutException(sb.toString());
                } catch (IOException e) {
                    th = e;
                    socket = new Socket();
                }
            }
            if (th == null) {
                return socket;
            }
            throw th;
        } else {
            throw new IllegalArgumentException("Parameters may not be null.");
        }
    }

    /* renamed from: a */
    public final boolean mo47023a(Socket socket) throws IllegalArgumentException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null.");
        } else if (socket.getClass() != Socket.class) {
            throw new IllegalArgumentException("Socket not created by this factory.");
        } else if (!socket.isClosed()) {
            return false;
        } else {
            throw new IllegalArgumentException("Socket is closed.");
        }
    }
}
