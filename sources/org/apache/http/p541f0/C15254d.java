package org.apache.http.p541f0;

import com.mrsool.utils.C11644i;
import java.io.IOException;
import java.net.Socket;
import org.apache.http.p548i0.C15356h;
import org.apache.http.p548i0.C15357i;

/* renamed from: org.apache.http.f0.d */
/* compiled from: DefaultHttpClientConnection */
public class C15254d extends C15261k {
    /* renamed from: a */
    public void mo47207a(Socket socket, C15357i iVar) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        } else if (iVar != null) {
            mo47236p();
            socket.setTcpNoDelay(C15356h.m68017e(iVar));
            socket.setSoTimeout(C15356h.m68013c(iVar));
            int b = C15356h.m68010b(iVar);
            if (b >= 0) {
                socket.setSoLinger(b > 0, b);
            }
            super.mo47207a(socket, iVar);
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (isOpen()) {
            stringBuffer.append(getRemotePort());
        } else {
            stringBuffer.append(C11644i.f33433v3);
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
