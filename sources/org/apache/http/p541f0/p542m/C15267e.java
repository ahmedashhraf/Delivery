package org.apache.http.p541f0.p542m;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import org.apache.http.C15460l;
import org.apache.http.conn.C15181e;
import org.apache.http.conn.C15189m;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.p536p.C15210b;
import org.apache.http.conn.p536p.C15212d;
import org.apache.http.conn.p536p.C15213e;
import org.apache.http.conn.p536p.C15214f;
import org.apache.http.p224d0.C6146d;
import org.apache.http.p548i0.C15356h;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p549j0.C15431f;

@C6146d
/* renamed from: org.apache.http.f0.m.e */
/* compiled from: DefaultClientConnectionOperator */
public class C15267e implements C15181e {

    /* renamed from: a */
    protected final C15213e f44229a;

    public C15267e(C15213e eVar) {
        if (eVar != null) {
            this.f44229a = eVar;
            return;
        }
        throw new IllegalArgumentException("Scheme registry must not be null.");
    }

    /* renamed from: a */
    public C15189m mo46994a() {
        return new C15266d();
    }

    /* renamed from: a */
    public void mo46995a(C15189m mVar, C15460l lVar, InetAddress inetAddress, C15431f fVar, C15357i iVar) throws IOException {
        if (mVar == null) {
            throw new IllegalArgumentException("Connection must not be null.");
        } else if (lVar == null) {
            throw new IllegalArgumentException("Target host must not be null.");
        } else if (iVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (!mVar.isOpen()) {
            C15212d b = this.f44229a.mo47087b(lVar.mo47785f());
            C15214f c = b.mo47077c();
            Socket a = c.mo28969a();
            mVar.mo47024a(a, lVar);
            try {
                Socket a2 = c.mo47022a(a, lVar.mo47782d(), b.mo47075a(lVar.mo47783e()), inetAddress, 0, iVar);
                mo47258a(a2, fVar, iVar);
                mVar.mo47027b(c.mo47023a(a2), iVar);
            } catch (ConnectException e) {
                throw new HttpHostConnectException(lVar, e);
            }
        } else {
            throw new IllegalArgumentException("Connection must not be open.");
        }
    }

    /* renamed from: a */
    public void mo46996a(C15189m mVar, C15460l lVar, C15431f fVar, C15357i iVar) throws IOException {
        if (mVar == null) {
            throw new IllegalArgumentException("Connection must not be null.");
        } else if (lVar == null) {
            throw new IllegalArgumentException("Target host must not be null.");
        } else if (iVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (mVar.isOpen()) {
            C15212d b = this.f44229a.mo47087b(lVar.mo47785f());
            if (b.mo47077c() instanceof C15210b) {
                C15210b bVar = (C15210b) b.mo47077c();
                try {
                    Socket a = bVar.mo28970a(mVar.mo47028c(), lVar.mo47782d(), lVar.mo47783e(), true);
                    mo47258a(a, fVar, iVar);
                    mVar.mo47025a(a, lVar, bVar.mo47023a(a), iVar);
                } catch (ConnectException e) {
                    throw new HttpHostConnectException(lVar, e);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Target scheme (");
                sb.append(b.mo47076b());
                sb.append(") must have layered socket factory.");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("Connection must be open.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47258a(Socket socket, C15431f fVar, C15357i iVar) throws IOException {
        socket.setTcpNoDelay(C15356h.m68017e(iVar));
        socket.setSoTimeout(C15356h.m68013c(iVar));
        int b = C15356h.m68010b(iVar);
        if (b >= 0) {
            socket.setSoLinger(b > 0, b);
        }
    }
}
