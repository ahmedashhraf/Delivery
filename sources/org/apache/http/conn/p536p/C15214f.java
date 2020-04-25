package org.apache.http.conn.p536p;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.p548i0.C15357i;

/* renamed from: org.apache.http.conn.p.f */
/* compiled from: SocketFactory */
public interface C15214f {
    /* renamed from: a */
    Socket mo28969a() throws IOException;

    /* renamed from: a */
    Socket mo47022a(Socket socket, String str, int i, InetAddress inetAddress, int i2, C15357i iVar) throws IOException, UnknownHostException, ConnectTimeoutException;

    /* renamed from: a */
    boolean mo47023a(Socket socket) throws IllegalArgumentException;
}
