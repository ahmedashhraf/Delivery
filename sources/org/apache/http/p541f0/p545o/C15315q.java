package org.apache.http.p541f0.p545o;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.p548i0.C15357i;

/* renamed from: org.apache.http.f0.o.q */
/* compiled from: SocketOutputBuffer */
public class C15315q extends C15302d {
    public C15315q(Socket socket, int i, C15357i iVar) throws IOException {
        if (socket != null) {
            if (i < 0) {
                i = socket.getSendBufferSize();
            }
            if (i < 1024) {
                i = 1024;
            }
            mo47374a(socket.getOutputStream(), i, iVar);
            return;
        }
        throw new IllegalArgumentException("Socket may not be null");
    }
}
