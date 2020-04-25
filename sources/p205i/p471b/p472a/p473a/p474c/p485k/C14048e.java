package p205i.p471b.p472a.p473a.p474c.p485k;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import org.jacoco.agent.p551rt.internal_8ff85ea.core.data.C15479e;
import org.jacoco.agent.p551rt.internal_8ff85ea.core.data.C15480f;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14034e;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14039h;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14040i;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14041j;

/* renamed from: i.b.a.a.c.k.e */
/* compiled from: TcpConnection */
class C14048e implements C14034e {

    /* renamed from: a */
    private final C14041j f41274a;

    /* renamed from: b */
    private final Socket f41275b;

    /* renamed from: c */
    private C14040i f41276c;

    /* renamed from: d */
    private C14039h f41277d;

    /* renamed from: e */
    private boolean f41278e = false;

    public C14048e(Socket socket, C14041j jVar) {
        this.f41275b = socket;
        this.f41274a = jVar;
    }

    /* renamed from: a */
    public void mo44374a(boolean z) throws IOException {
        if (this.f41278e && !this.f41275b.isClosed()) {
            mo44354a(true, z);
        }
    }

    /* renamed from: b */
    public void mo44375b() throws IOException {
        this.f41276c = new C14040i(this.f41275b.getOutputStream());
        this.f41277d = new C14039h(this.f41275b.getInputStream());
        this.f41277d.mo44357a((C14034e) this);
        this.f41278e = true;
    }

    /* renamed from: c */
    public void mo44376c() throws IOException {
        do {
            try {
            } catch (SocketException e) {
                if (!this.f41275b.isClosed()) {
                    throw e;
                }
            } catch (Throwable th) {
                mo44373a();
                throw th;
            }
        } while (this.f41277d.mo47815a());
        mo44373a();
    }

    /* renamed from: a */
    public void mo44373a() throws IOException {
        if (!this.f41275b.isClosed()) {
            this.f41275b.close();
        }
    }

    /* renamed from: a */
    public void mo44354a(boolean z, boolean z2) throws IOException {
        if (z) {
            C14041j jVar = this.f41274a;
            C14040i iVar = this.f41276c;
            jVar.mo44363a((C15479e) iVar, (C15480f) iVar, z2);
        } else if (z2) {
            this.f41274a.mo44365b();
        }
        this.f41276c.mo44359c();
    }
}
