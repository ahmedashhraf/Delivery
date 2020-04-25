package okhttp3.internal.http2;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.C14910b;
import okhttp3.internal.Internal;
import okhttp3.internal.connection.C14921f;
import okhttp3.internal.p516g.C14944c;
import okhttp3.internal.p516g.C14947e;
import okhttp3.internal.p516g.C14950h;
import okhttp3.internal.p516g.C14951i;
import okhttp3.internal.p516g.C14953k;
import p468g.C13799a0;
import p468g.C13813c0;
import p468g.C13823e0;
import p468g.C13823e0.C13824a;
import p468g.C13826f0;
import p468g.C13866u;
import p468g.C13866u.C13867a;
import p468g.C13870w.C13871a;
import p468g.C13876z;
import p470h.C13883a0;
import p470h.C13887c;
import p470h.C13896f;
import p470h.C13899i;
import p470h.C13906p;
import p470h.C13924z;

/* renamed from: okhttp3.internal.http2.e */
/* compiled from: Http2Codec */
public final class C14970e implements C14944c {

    /* renamed from: g */
    private static final String f43464g = "connection";

    /* renamed from: h */
    private static final String f43465h = "host";

    /* renamed from: i */
    private static final String f43466i = "keep-alive";

    /* renamed from: j */
    private static final String f43467j = "proxy-connection";

    /* renamed from: k */
    private static final String f43468k = "transfer-encoding";

    /* renamed from: l */
    private static final String f43469l = "te";

    /* renamed from: m */
    private static final String f43470m = "encoding";

    /* renamed from: n */
    private static final String f43471n = "upgrade";

    /* renamed from: o */
    private static final List<String> f43472o;

    /* renamed from: p */
    private static final List<String> f43473p;

    /* renamed from: b */
    private final C13871a f43474b;

    /* renamed from: c */
    final C14921f f43475c;

    /* renamed from: d */
    private final C14972f f43476d;

    /* renamed from: e */
    private C14990h f43477e;

    /* renamed from: f */
    private final C13799a0 f43478f;

    /* renamed from: okhttp3.internal.http2.e$a */
    /* compiled from: Http2Codec */
    class C14971a extends C13899i {

        /* renamed from: a */
        boolean f43480a = false;

        /* renamed from: b */
        long f43481b = 0;

        C14971a(C13883a0 a0Var) {
            super(a0Var);
        }

        /* renamed from: a */
        private void m66339a(IOException iOException) {
            if (!this.f43480a) {
                this.f43480a = true;
                C14970e eVar = C14970e.this;
                eVar.f43475c.mo46401a(false, eVar, this.f43481b, iOException);
            }
        }

        public void close() throws IOException {
            super.close();
            m66339a(null);
        }

        public long read(C13887c cVar, long j) throws IOException {
            try {
                long read = delegate().read(cVar, j);
                if (read > 0) {
                    this.f43481b += read;
                }
                return read;
            } catch (IOException e) {
                m66339a(e);
                throw e;
            }
        }
    }

    static {
        String str = f43464g;
        String str2 = f43465h;
        String str3 = f43466i;
        String str4 = f43467j;
        String str5 = f43469l;
        String str6 = f43468k;
        String str7 = f43470m;
        f43472o = C14910b.m66050a((T[]) new String[]{str, str2, str3, str4, str5, str6, str7, f43471n, C14964b.f43403f, C14964b.f43404g, C14964b.f43405h, C14964b.f43406i});
        f43473p = C14910b.m66050a((T[]) new String[]{str, str2, str3, str4, str5, str6, str7, f43471n});
    }

    public C14970e(C13876z zVar, C13871a aVar, C14921f fVar, C14972f fVar2) {
        C13799a0 a0Var;
        this.f43474b = aVar;
        this.f43475c = fVar;
        this.f43476d = fVar2;
        if (zVar.mo43750u().contains(C13799a0.H2_PRIOR_KNOWLEDGE)) {
            a0Var = C13799a0.H2_PRIOR_KNOWLEDGE;
        } else {
            a0Var = C13799a0.HTTP_2;
        }
        this.f43478f = a0Var;
    }

    /* renamed from: a */
    public C13924z mo46457a(C13813c0 c0Var, long j) {
        return this.f43477e.mo46557f();
    }

    /* renamed from: b */
    public void mo46460b() throws IOException {
        this.f43476d.flush();
    }

    public void cancel() {
        C14990h hVar = this.f43477e;
        if (hVar != null) {
            hVar.mo46552b(C14963a.CANCEL);
        }
    }

    /* renamed from: b */
    public static List<C14964b> m66332b(C13813c0 c0Var) {
        C13866u c = c0Var.mo43354c();
        ArrayList arrayList = new ArrayList(c.mo43618d() + 4);
        arrayList.add(new C14964b(C14964b.f43408k, c0Var.mo43356e()));
        arrayList.add(new C14964b(C14964b.f43409l, C14951i.m66262a(c0Var.mo43359h())));
        String a = c0Var.mo43351a("Host");
        if (a != null) {
            arrayList.add(new C14964b(C14964b.f43411n, a));
        }
        arrayList.add(new C14964b(C14964b.f43410m, c0Var.mo43359h().mo43661s()));
        int d = c.mo43618d();
        for (int i = 0; i < d; i++) {
            C13896f e = C13896f.m59655e(c.mo43611a(i).toLowerCase(Locale.US));
            if (!f43472o.contains(e.mo43990v())) {
                arrayList.add(new C14964b(e, c.mo43613b(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo46459a(C13813c0 c0Var) throws IOException {
        if (this.f43477e == null) {
            this.f43477e = this.f43476d.mo46496a(m66332b(c0Var), c0Var.mo43349a() != null);
            this.f43477e.mo46561j().mo43828b((long) this.f43474b.mo43697a(), TimeUnit.MILLISECONDS);
            this.f43477e.mo46565n().mo43828b((long) this.f43474b.mo43700b(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public void mo46458a() throws IOException {
        this.f43477e.mo46557f().close();
    }

    /* renamed from: a */
    public C13824a mo46455a(boolean z) throws IOException {
        C13824a a = m66331a(this.f43477e.mo46563l(), this.f43478f);
        if (!z || Internal.instance.code(a) != 100) {
            return a;
        }
        return null;
    }

    /* renamed from: a */
    public static C13824a m66331a(C13866u uVar, C13799a0 a0Var) throws IOException {
        C13867a aVar = new C13867a();
        int d = uVar.mo43618d();
        C14953k kVar = null;
        for (int i = 0; i < d; i++) {
            String a = uVar.mo43611a(i);
            String b = uVar.mo43613b(i);
            if (a.equals(C14964b.f43402e)) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP/1.1 ");
                sb.append(b);
                kVar = C14953k.m66276a(sb.toString());
            } else if (!f43473p.contains(a)) {
                Internal.instance.addLenient(aVar, a, b);
            }
        }
        if (kVar != null) {
            return new C13824a().mo43431a(a0Var).mo43429a(kVar.f43364b).mo43437a(kVar.f43365c).mo43436a(aVar.mo43627a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: a */
    public C13826f0 mo46456a(C13823e0 e0Var) throws IOException {
        C14921f fVar = this.f43475c;
        fVar.f43221f.mo43590e(fVar.f43220e);
        return new C14950h(e0Var.mo43419b("Content-Type"), C14947e.m66225a(e0Var), C13906p.m59739a((C13883a0) new C14971a(this.f43477e.mo46558g())));
    }
}
