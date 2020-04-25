package org.apache.http.p541f0.p545o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import org.apache.http.p546g0.C15317a;
import org.apache.http.p548i0.C15357i;

/* renamed from: org.apache.http.f0.o.p */
/* compiled from: SocketInputBuffer */
public class C15314p extends C15301c implements C15317a {

    /* renamed from: l */
    private static final Class f44359l = m67805d();

    /* renamed from: j */
    private final Socket f44360j;

    /* renamed from: k */
    private boolean f44361k;

    public C15314p(Socket socket, int i, C15357i iVar) throws IOException {
        if (socket != null) {
            this.f44360j = socket;
            this.f44361k = false;
            if (i < 0) {
                i = socket.getReceiveBufferSize();
            }
            if (i < 1024) {
                i = 1024;
            }
            mo47370a(socket.getInputStream(), i, iVar);
            return;
        }
        throw new IllegalArgumentException("Socket may not be null");
    }

    /* renamed from: a */
    private static boolean m67804a(InterruptedIOException interruptedIOException) {
        Class cls = f44359l;
        if (cls != null) {
            return cls.isInstance(interruptedIOException);
        }
        return true;
    }

    /* renamed from: d */
    private static Class m67805d() {
        try {
            return Class.forName("java.net.SocketTimeoutException");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo47371b() throws IOException {
        int b = super.mo47371b();
        this.f44361k = b == -1;
        return b;
    }

    /* renamed from: a */
    public boolean mo47266a(int i) throws IOException {
        boolean c = mo47372c();
        if (!c) {
            int soTimeout = this.f44360j.getSoTimeout();
            try {
                this.f44360j.setSoTimeout(i);
                mo47371b();
                c = mo47372c();
            } catch (InterruptedIOException e) {
                if (!m67804a(e)) {
                    throw e;
                }
            } catch (Throwable th) {
                this.f44360j.setSoTimeout(soTimeout);
                throw th;
            }
            this.f44360j.setSoTimeout(soTimeout);
        }
        return c;
    }

    /* renamed from: a */
    public boolean mo47412a() {
        return this.f44361k;
    }
}
