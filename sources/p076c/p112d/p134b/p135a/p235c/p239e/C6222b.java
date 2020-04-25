package p076c.p112d.p134b.p135a.p235c.p239e;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7256c;
import com.google.api.client.http.C7263f0;
import com.google.api.client.http.C7263f0.C7264a;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7295m;
import com.google.api.client.http.C7298p;
import com.google.api.client.http.C7299q;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7307v;
import com.google.api.client.http.C7308w;
import com.google.api.client.http.C7309x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6389k0;

/* renamed from: c.d.b.a.c.e.b */
/* compiled from: BatchRequest */
public final class C6222b {

    /* renamed from: a */
    private C7274j f17512a = new C7274j("https://www.googleapis.com/batch");

    /* renamed from: b */
    private final C7307v f17513b;

    /* renamed from: c */
    List<C6224b<?, ?>> f17514c = new ArrayList();

    /* renamed from: d */
    private C6389k0 f17515d = C6389k0.f17813a;

    /* renamed from: c.d.b.a.c.e.b$a */
    /* compiled from: BatchRequest */
    class C6223a implements C7298p {

        /* renamed from: a */
        private C7298p f17516a;

        C6223a(C7298p pVar) {
            this.f17516a = pVar;
        }

        /* renamed from: a */
        public void mo25080a(C7305u uVar) throws IOException {
            C7298p pVar = this.f17516a;
            if (pVar != null) {
                pVar.mo25080a(uVar);
            }
            for (C6224b bVar : C6222b.this.f17514c) {
                C7298p k = bVar.f17521d.mo29113k();
                if (k != null) {
                    k.mo25080a(bVar.f17521d);
                }
            }
        }
    }

    /* renamed from: c.d.b.a.c.e.b$b */
    /* compiled from: BatchRequest */
    static class C6224b<T, E> {

        /* renamed from: a */
        final C6221a<T, E> f17518a;

        /* renamed from: b */
        final Class<T> f17519b;

        /* renamed from: c */
        final Class<E> f17520c;

        /* renamed from: d */
        final C7305u f17521d;

        C6224b(C6221a<T, E> aVar, Class<T> cls, Class<E> cls2, C7305u uVar) {
            this.f17518a = aVar;
            this.f17519b = cls;
            this.f17520c = cls2;
            this.f17521d = uVar;
        }
    }

    public C6222b(C7253a0 a0Var, C7308w wVar) {
        this.f17513b = wVar == null ? a0Var.mo28859b() : a0Var.mo28858a(wVar);
    }

    /* renamed from: a */
    public C6222b mo25340a(C7274j jVar) {
        this.f17512a = jVar;
        return this;
    }

    /* renamed from: b */
    public C7274j mo25343b() {
        return this.f17512a;
    }

    /* renamed from: c */
    public C6389k0 mo25344c() {
        return this.f17515d;
    }

    /* renamed from: d */
    public int mo25345d() {
        return this.f17514c.size();
    }

    /* renamed from: a */
    public C6222b mo25339a(C6389k0 k0Var) {
        this.f17515d = (C6389k0) C6381h0.m29663a(k0Var);
        return this;
    }

    /* renamed from: a */
    public <T, E> C6222b mo25341a(C7305u uVar, Class<T> cls, Class<E> cls2, C6221a<T, E> aVar) throws IOException {
        C6381h0.m29663a(uVar);
        C6381h0.m29663a(aVar);
        C6381h0.m29663a(cls);
        C6381h0.m29663a(cls2);
        this.f17514c.add(new C6224b(aVar, cls, cls2, uVar));
        return this;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo25342a() throws IOException {
        boolean z;
        C6381h0.m29669b(!this.f17514c.isEmpty());
        C7305u b = this.f17513b.mo29136b(this.f17512a, null);
        b.mo29086a((C7298p) new C6223a(b.mo29113k()));
        int l = b.mo29114l();
        C7256c c = b.mo29099c();
        if (c != null) {
            c.reset();
        }
        do {
            z = l > 0;
            C7263f0 f0Var = new C7263f0();
            f0Var.mo28856e().mo29069c("mixed");
            int i = 1;
            for (C6224b bVar : this.f17514c) {
                int i2 = i + 1;
                f0Var.mo28881a(new C7264a(new C7299q().mo29016d(null).mo25098b("Content-ID", (Object) Integer.valueOf(i)), new C6230d(bVar.f17521d)));
                i = i2;
            }
            b.mo29084a((C7295m) f0Var);
            C7309x a = b.mo29092a();
            String str = "--";
            try {
                String valueOf = String.valueOf(a.mo29151h().mo29065a("boundary"));
                C6225c cVar = new C6225c(a.mo29145b(), valueOf.length() != 0 ? str.concat(valueOf) : new String(str), this.f17514c, z);
                while (cVar.f17525d) {
                    cVar.mo25346a();
                }
                a.mo29143a();
                List<C6224b<?, ?>> list = cVar.f17526e;
                if (list.isEmpty()) {
                    break;
                }
                this.f17514c = list;
                if (cVar.f17527f && c != null) {
                    long a2 = c.mo28865a();
                    if (a2 != -1) {
                        try {
                            this.f17515d.mo25709a(a2);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
                l--;
            } catch (Throwable th) {
                a.mo29143a();
                throw th;
            }
        } while (z);
        this.f17514c.clear();
    }
}
