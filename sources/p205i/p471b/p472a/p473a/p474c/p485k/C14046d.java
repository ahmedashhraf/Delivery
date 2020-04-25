package p205i.p471b.p472a.p473a.p474c.p485k;

import java.io.IOException;
import java.net.Socket;
import p205i.p471b.p472a.p473a.p474c.C13935e;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14041j;

/* renamed from: i.b.a.a.c.k.d */
/* compiled from: TcpClientOutput */
public class C14046d implements C14044b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13935e f41270a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C14048e f41271b;

    /* renamed from: c */
    private Thread f41272c;

    /* renamed from: i.b.a.a.c.k.d$a */
    /* compiled from: TcpClientOutput */
    class C14047a implements Runnable {
        C14047a() {
        }

        public void run() {
            try {
                C14046d.this.f41271b.mo44376c();
            } catch (IOException e) {
                C14046d.this.f41270a.mo44049a(e);
            }
        }
    }

    public C14046d(C13935e eVar) {
        this.f41270a = eVar;
    }

    public void shutdown() throws Exception {
        this.f41271b.mo44373a();
        this.f41272c.join();
    }

    /* renamed from: a */
    public void mo44368a(C14030b bVar, C14041j jVar) throws IOException {
        this.f41271b = new C14048e(mo44371a(bVar), jVar);
        this.f41271b.mo44375b();
        this.f41272c = new Thread(new C14047a());
        this.f41272c.setName(C14046d.class.getName());
        this.f41272c.setDaemon(true);
        this.f41272c.start();
    }

    /* renamed from: a */
    public void mo44369a(boolean z) throws IOException {
        this.f41271b.mo44374a(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Socket mo44371a(C14030b bVar) throws IOException {
        return new Socket(bVar.mo44320a(), bVar.mo44350m());
    }
}
