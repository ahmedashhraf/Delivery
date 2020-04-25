package org.apache.http.p541f0.p542m;

import java.io.IOException;
import java.net.Socket;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.http.C15133c;
import org.apache.http.C15460l;
import org.apache.http.C15463o;
import org.apache.http.C15466r;
import org.apache.http.C15467s;
import org.apache.http.HttpException;
import org.apache.http.conn.C15189m;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p541f0.C15261k;
import org.apache.http.p546g0.C15318b;
import org.apache.http.p546g0.C15321e;
import org.apache.http.p546g0.C15322f;
import org.apache.http.p548i0.C15357i;

@C6145c
/* renamed from: org.apache.http.f0.m.d */
/* compiled from: DefaultClientConnection */
public class C15266d extends C15261k implements C15189m {

    /* renamed from: V */
    private final C15089a f44222V = C15096h.m66940c(C15266d.class);

    /* renamed from: W */
    private final C15089a f44223W = C15096h.m66949f("org.apache.http.headers");

    /* renamed from: X */
    private final C15089a f44224X = C15096h.m66949f("org.apache.http.wire");

    /* renamed from: Y */
    private volatile Socket f44225Y;

    /* renamed from: Z */
    private C15460l f44226Z;

    /* renamed from: a0 */
    private boolean f44227a0;

    /* renamed from: b0 */
    private volatile boolean f44228b0;

    /* renamed from: a */
    public void mo47024a(Socket socket, C15460l lVar) throws IOException {
        mo47236p();
        this.f44225Y = socket;
        this.f44226Z = lVar;
        if (this.f44228b0) {
            socket.close();
            throw new IOException("Connection already shutdown");
        }
    }

    /* renamed from: b */
    public final C15460l mo47026b() {
        return this.f44226Z;
    }

    /* renamed from: c */
    public final Socket mo47228c() {
        return this.f44225Y;
    }

    public void close() throws IOException {
        this.f44222V.mo46776a("Connection closed");
        super.close();
    }

    /* renamed from: d */
    public final boolean mo47029d() {
        return this.f44227a0;
    }

    public void sendRequestHeader(C15463o oVar) throws HttpException, IOException {
        C15133c[] f;
        if (this.f44222V.mo46785d()) {
            C15089a aVar = this.f44222V;
            StringBuilder sb = new StringBuilder();
            sb.append("Sending request: ");
            sb.append(oVar.mo46956h());
            aVar.mo46776a(sb.toString());
        }
        super.sendRequestHeader(oVar);
        if (this.f44223W.mo46785d()) {
            C15089a aVar2 = this.f44223W;
            StringBuilder sb2 = new StringBuilder();
            String str = ">> ";
            sb2.append(str);
            sb2.append(oVar.mo46956h().toString());
            aVar2.mo46776a(sb2.toString());
            for (C15133c cVar : oVar.mo47427f()) {
                C15089a aVar3 = this.f44223W;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(cVar.toString());
                aVar3.mo46776a(sb3.toString());
            }
        }
    }

    public void shutdown() throws IOException {
        this.f44222V.mo46776a("Connection shut down");
        this.f44228b0 = true;
        super.shutdown();
        Socket socket = this.f44225Y;
        if (socket != null) {
            socket.close();
        }
    }

    /* renamed from: b */
    public void mo47027b(boolean z, C15357i iVar) throws IOException {
        mo47236p();
        if (iVar != null) {
            this.f44227a0 = z;
            mo47207a(this.f44225Y, iVar);
            return;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C15322f mo47227b(Socket socket, int i, C15357i iVar) throws IOException {
        if (i == -1) {
            i = 8192;
        }
        C15322f b = super.mo47227b(socket, i, iVar);
        return this.f44224X.mo46785d() ? new C15273j(b, new C15280m(this.f44224X)) : b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15321e mo47226a(Socket socket, int i, C15357i iVar) throws IOException {
        if (i == -1) {
            i = 8192;
        }
        C15321e a = super.mo47226a(socket, i, iVar);
        return this.f44224X.mo46785d() ? new C15272i(a, new C15280m(this.f44224X)) : a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15318b mo47175a(C15321e eVar, C15467s sVar, C15357i iVar) {
        return new C15269g(eVar, null, sVar, iVar);
    }

    /* renamed from: a */
    public void mo47025a(Socket socket, C15460l lVar, boolean z, C15357i iVar) throws IOException {
        mo47184j();
        if (lVar == null) {
            throw new IllegalArgumentException("Target host must not be null.");
        } else if (iVar != null) {
            if (socket != null) {
                this.f44225Y = socket;
                mo47207a(socket, iVar);
            }
            this.f44226Z = lVar;
            this.f44227a0 = z;
        } else {
            throw new IllegalArgumentException("Parameters must not be null.");
        }
    }

    /* renamed from: a */
    public C15466r mo47177a() throws HttpException, IOException {
        C15133c[] f;
        C15466r a = super.mo47177a();
        if (this.f44222V.mo46785d()) {
            C15089a aVar = this.f44222V;
            StringBuilder sb = new StringBuilder();
            sb.append("Receiving response: ");
            sb.append(a.mo47468l());
            aVar.mo46776a(sb.toString());
        }
        if (this.f44223W.mo46785d()) {
            C15089a aVar2 = this.f44223W;
            StringBuilder sb2 = new StringBuilder();
            String str = "<< ";
            sb2.append(str);
            sb2.append(a.mo47468l().toString());
            aVar2.mo46776a(sb2.toString());
            for (C15133c cVar : a.mo47427f()) {
                C15089a aVar3 = this.f44223W;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(cVar.toString());
                aVar3.mo46776a(sb3.toString());
            }
        }
        return a;
    }
}
