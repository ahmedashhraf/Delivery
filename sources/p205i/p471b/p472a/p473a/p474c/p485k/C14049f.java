package p205i.p471b.p472a.p473a.p474c.p485k;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import p205i.p471b.p472a.p473a.p474c.C13935e;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14041j;
import p205i.p489f.C14069f;

/* renamed from: i.b.a.a.c.k.f */
/* compiled from: TcpServerOutput */
public class C14049f implements C14044b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C14048e f41279a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C13935e f41280b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ServerSocket f41281c;

    /* renamed from: d */
    private Thread f41282d;

    /* renamed from: i.b.a.a.c.k.f$a */
    /* compiled from: TcpServerOutput */
    class C14050a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C14041j f41283a;

        C14050a(C14041j jVar) {
            this.f41283a = jVar;
        }

        public void run() {
            while (!C14049f.this.f41281c.isClosed()) {
                try {
                    synchronized (C14049f.this.f41281c) {
                        C14049f.this.f41279a = new C14048e(C14049f.this.f41281c.accept(), this.f41283a);
                    }
                    C14049f.this.f41279a.mo44375b();
                    C14049f.this.f41279a.mo44376c();
                } catch (IOException e) {
                    if (!C14049f.this.f41281c.isClosed()) {
                        C14049f.this.f41280b.mo44049a(e);
                    }
                }
            }
        }
    }

    public C14049f(C13935e eVar) {
        this.f41280b = eVar;
    }

    public void shutdown() throws Exception {
        this.f41281c.close();
        synchronized (this.f41281c) {
            if (this.f41279a != null) {
                this.f41279a.mo44373a();
            }
        }
        this.f41282d.join();
    }

    /* renamed from: a */
    public void mo44368a(C14030b bVar, C14041j jVar) throws IOException {
        this.f41281c = mo44378a(bVar);
        this.f41282d = new Thread(new C14050a(jVar));
        this.f41282d.setName(C14049f.class.getName());
        this.f41282d.setDaemon(true);
        this.f41282d.start();
    }

    /* renamed from: a */
    public void mo44369a(boolean z) throws IOException {
        C14048e eVar = this.f41279a;
        if (eVar != null) {
            eVar.mo44374a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ServerSocket mo44378a(C14030b bVar) throws IOException {
        return new ServerSocket(bVar.mo44350m(), 1, mo44377a(bVar.mo44320a()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InetAddress mo44377a(String str) throws UnknownHostException {
        if (C14069f.f41343G.equals(str)) {
            return null;
        }
        return InetAddress.getByName(str);
    }
}
