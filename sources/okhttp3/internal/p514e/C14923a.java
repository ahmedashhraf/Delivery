package okhttp3.internal.p514e;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.C14910b;
import okhttp3.internal.Internal;
import okhttp3.internal.p514e.C14926c.C14927a;
import okhttp3.internal.p516g.C14947e;
import okhttp3.internal.p516g.C14948f;
import okhttp3.internal.p516g.C14950h;
import org.apache.http.C15470v;
import org.apache.http.p549j0.C15430e;
import p076c.p112d.p148d.p279f.C6610c;
import p468g.C13799a0;
import p468g.C13813c0;
import p468g.C13823e0;
import p468g.C13823e0.C13824a;
import p468g.C13826f0;
import p468g.C13866u;
import p468g.C13866u.C13867a;
import p468g.C13870w;
import p468g.C13870w.C13871a;
import p470h.C13883a0;
import p470h.C13885b0;
import p470h.C13887c;
import p470h.C13892d;
import p470h.C13894e;
import p470h.C13906p;
import p470h.C13924z;

/* renamed from: okhttp3.internal.e.a */
/* compiled from: CacheInterceptor */
public final class C14923a implements C13870w {

    /* renamed from: a */
    final C14937f f43231a;

    /* renamed from: okhttp3.internal.e.a$a */
    /* compiled from: CacheInterceptor */
    class C14924a implements C13883a0 {

        /* renamed from: N */
        final /* synthetic */ C14925b f43232N;

        /* renamed from: O */
        final /* synthetic */ C13892d f43233O;

        /* renamed from: a */
        boolean f43235a;

        /* renamed from: b */
        final /* synthetic */ C13894e f43236b;

        C14924a(C13894e eVar, C14925b bVar, C13892d dVar) {
            this.f43236b = eVar;
            this.f43232N = bVar;
            this.f43233O = dVar;
        }

        public void close() throws IOException {
            if (!this.f43235a && !C14910b.m66059a((C13883a0) this, 100, TimeUnit.MILLISECONDS)) {
                this.f43235a = true;
                this.f43232N.mo43339c();
            }
            this.f43236b.close();
        }

        public long read(C13887c cVar, long j) throws IOException {
            try {
                long read = this.f43236b.read(cVar, j);
                if (read == -1) {
                    if (!this.f43235a) {
                        this.f43235a = true;
                        this.f43233O.close();
                    }
                    return -1;
                }
                cVar.mo43846a(this.f43233O.mo43867b(), cVar.size() - read, read);
                this.f43233O.mo43901m();
                return read;
            } catch (IOException e) {
                if (!this.f43235a) {
                    this.f43235a = true;
                    this.f43232N.mo43339c();
                }
                throw e;
            }
        }

        public C13885b0 timeout() {
            return this.f43236b.timeout();
        }
    }

    public C14923a(C14937f fVar) {
        this.f43231a = fVar;
    }

    /* renamed from: b */
    static boolean m66141b(String str) {
        return !"Connection".equalsIgnoreCase(str) && !C15430e.f44590q.equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !C6610c.f18384F.equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !C6610c.f18385G.equalsIgnoreCase(str);
    }

    /* renamed from: a */
    public C13823e0 mo23463a(C13871a aVar) throws IOException {
        C14937f fVar = this.f43231a;
        C13823e0 b = fVar != null ? fVar.mo43335b(aVar.request()) : null;
        C14926c a = new C14927a(System.currentTimeMillis(), aVar.request(), b).mo46409a();
        C13813c0 c0Var = a.f43237a;
        C13823e0 e0Var = a.f43238b;
        C14937f fVar2 = this.f43231a;
        if (fVar2 != null) {
            fVar2.mo43334a(a);
        }
        if (b != null && e0Var == null) {
            C14910b.m66055a((Closeable) b.mo43416a());
        }
        if (c0Var == null && e0Var == null) {
            return new C13824a().mo43432a(aVar.request()).mo43431a(C13799a0.HTTP_1_1).mo43429a((int) C15470v.f44657T).mo43437a("Unsatisfiable Request (only-if-cached)").mo43434a(C14910b.f43160c).mo43440b(-1).mo43430a(System.currentTimeMillis()).mo43439a();
        }
        if (c0Var == null) {
            return e0Var.mo43410I().mo43433a(m66137a(e0Var)).mo43439a();
        }
        try {
            C13823e0 a2 = aVar.mo43698a(c0Var);
            if (a2 == null && b != null) {
            }
            if (e0Var != null) {
                if (a2.mo43425g() == 304) {
                    C13823e0 a3 = e0Var.mo43410I().mo43436a(m66139a(e0Var.mo43427i(), a2.mo43427i())).mo43440b(a2.mo43415N()).mo43430a(a2.mo43413L()).mo43433a(m66137a(e0Var)).mo43441b(m66137a(a2)).mo43439a();
                    a2.mo43416a().close();
                    this.f43231a.mo43331a();
                    this.f43231a.mo43333a(e0Var, a3);
                    return a3;
                }
                C14910b.m66055a((Closeable) e0Var.mo43416a());
            }
            C13823e0 a4 = a2.mo43410I().mo43433a(m66137a(e0Var)).mo43441b(m66137a(a2)).mo43439a();
            if (this.f43231a != null) {
                if (C14947e.m66237b(a4) && C14926c.m66145a(a4, c0Var)) {
                    return m66138a(this.f43231a.mo43330a(a4), a4);
                }
                if (C14948f.m66244a(c0Var.mo43356e())) {
                    try {
                        this.f43231a.mo43332a(c0Var);
                    } catch (IOException unused) {
                    }
                }
            }
            return a4;
        } finally {
            if (b != null) {
                C14910b.m66055a((Closeable) b.mo43416a());
            }
        }
    }

    /* renamed from: a */
    private static C13823e0 m66137a(C13823e0 e0Var) {
        return (e0Var == null || e0Var.mo43416a() == null) ? e0Var : e0Var.mo43410I().mo43434a((C13826f0) null).mo43439a();
    }

    /* renamed from: a */
    private C13823e0 m66138a(C14925b bVar, C13823e0 e0Var) throws IOException {
        if (bVar == null) {
            return e0Var;
        }
        C13924z d = bVar.mo43340d();
        if (d == null) {
            return e0Var;
        }
        C14924a aVar = new C14924a(e0Var.mo43416a().source(), bVar, C13906p.m59738a(d));
        return e0Var.mo43410I().mo43434a((C13826f0) new C14950h(e0Var.mo43419b("Content-Type"), e0Var.mo43416a().contentLength(), C13906p.m59739a((C13883a0) aVar))).mo43439a();
    }

    /* renamed from: a */
    private static C13866u m66139a(C13866u uVar, C13866u uVar2) {
        C13867a aVar = new C13867a();
        int d = uVar.mo43618d();
        for (int i = 0; i < d; i++) {
            String a = uVar.mo43611a(i);
            String b = uVar.mo43613b(i);
            if ((!C6610c.f18417g.equalsIgnoreCase(a) || !b.startsWith("1")) && (m66140a(a) || !m66141b(a) || uVar2.mo43612a(a) == null)) {
                Internal.instance.addLenient(aVar, a, b);
            }
        }
        int d2 = uVar2.mo43618d();
        for (int i2 = 0; i2 < d2; i2++) {
            String a2 = uVar2.mo43611a(i2);
            if (!m66140a(a2) && m66141b(a2)) {
                Internal.instance.addLenient(aVar, a2, uVar2.mo43613b(i2));
            }
        }
        return aVar.mo43627a();
    }

    /* renamed from: a */
    static boolean m66140a(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }
}
