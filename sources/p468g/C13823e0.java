package p468g;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.p516g.C14947e;
import p201f.p202a.C5952h;
import p468g.C13866u.C13867a;
import p470h.C13887c;
import p470h.C13894e;

/* renamed from: g.e0 */
/* compiled from: Response */
public final class C13823e0 implements Closeable {

    /* renamed from: N */
    final int f39965N;

    /* renamed from: O */
    final String f39966O;
    @C5952h

    /* renamed from: P */
    final C13865t f39967P;

    /* renamed from: Q */
    final C13866u f39968Q;
    @C5952h

    /* renamed from: R */
    final C13826f0 f39969R;
    @C5952h

    /* renamed from: S */
    final C13823e0 f39970S;
    @C5952h

    /* renamed from: T */
    final C13823e0 f39971T;
    @C5952h

    /* renamed from: U */
    final C13823e0 f39972U;

    /* renamed from: V */
    final long f39973V;

    /* renamed from: W */
    final long f39974W;
    @C5952h

    /* renamed from: X */
    private volatile C13815d f39975X;

    /* renamed from: a */
    final C13813c0 f39976a;

    /* renamed from: b */
    final C13799a0 f39977b;

    /* renamed from: g.e0$a */
    /* compiled from: Response */
    public static class C13824a {
        @C5952h

        /* renamed from: a */
        C13813c0 f39978a;
        @C5952h

        /* renamed from: b */
        C13799a0 f39979b;

        /* renamed from: c */
        int f39980c;

        /* renamed from: d */
        String f39981d;
        @C5952h

        /* renamed from: e */
        C13865t f39982e;

        /* renamed from: f */
        C13867a f39983f;
        @C5952h

        /* renamed from: g */
        C13826f0 f39984g;
        @C5952h

        /* renamed from: h */
        C13823e0 f39985h;
        @C5952h

        /* renamed from: i */
        C13823e0 f39986i;
        @C5952h

        /* renamed from: j */
        C13823e0 f39987j;

        /* renamed from: k */
        long f39988k;

        /* renamed from: l */
        long f39989l;

        public C13824a() {
            this.f39980c = -1;
            this.f39983f = new C13867a();
        }

        /* renamed from: d */
        private void m59052d(C13823e0 e0Var) {
            if (e0Var.f39969R != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: a */
        public C13824a mo43432a(C13813c0 c0Var) {
            this.f39978a = c0Var;
            return this;
        }

        /* renamed from: b */
        public C13824a mo43443b(String str, String str2) {
            this.f39983f.mo43634d(str, str2);
            return this;
        }

        /* renamed from: c */
        public C13824a mo43444c(@C5952h C13823e0 e0Var) {
            if (e0Var != null) {
                m59052d(e0Var);
            }
            this.f39987j = e0Var;
            return this;
        }

        /* renamed from: a */
        public C13824a mo43431a(C13799a0 a0Var) {
            this.f39979b = a0Var;
            return this;
        }

        /* renamed from: b */
        public C13824a mo43442b(String str) {
            this.f39983f.mo43633d(str);
            return this;
        }

        /* renamed from: a */
        public C13824a mo43429a(int i) {
            this.f39980c = i;
            return this;
        }

        /* renamed from: b */
        public C13824a mo43441b(@C5952h C13823e0 e0Var) {
            if (e0Var != null) {
                m59051a("networkResponse", e0Var);
            }
            this.f39985h = e0Var;
            return this;
        }

        C13824a(C13823e0 e0Var) {
            this.f39980c = -1;
            this.f39978a = e0Var.f39976a;
            this.f39979b = e0Var.f39977b;
            this.f39980c = e0Var.f39965N;
            this.f39981d = e0Var.f39966O;
            this.f39982e = e0Var.f39967P;
            this.f39983f = e0Var.f39968Q.mo43616c();
            this.f39984g = e0Var.f39969R;
            this.f39985h = e0Var.f39970S;
            this.f39986i = e0Var.f39971T;
            this.f39987j = e0Var.f39972U;
            this.f39988k = e0Var.f39973V;
            this.f39989l = e0Var.f39974W;
        }

        /* renamed from: a */
        public C13824a mo43437a(String str) {
            this.f39981d = str;
            return this;
        }

        /* renamed from: a */
        public C13824a mo43435a(@C5952h C13865t tVar) {
            this.f39982e = tVar;
            return this;
        }

        /* renamed from: b */
        public C13824a mo43440b(long j) {
            this.f39988k = j;
            return this;
        }

        /* renamed from: a */
        public C13824a mo43438a(String str, String str2) {
            this.f39983f.mo43625a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C13824a mo43436a(C13866u uVar) {
            this.f39983f = uVar.mo43616c();
            return this;
        }

        /* renamed from: a */
        public C13824a mo43434a(@C5952h C13826f0 f0Var) {
            this.f39984g = f0Var;
            return this;
        }

        /* renamed from: a */
        public C13824a mo43433a(@C5952h C13823e0 e0Var) {
            if (e0Var != null) {
                m59051a("cacheResponse", e0Var);
            }
            this.f39986i = e0Var;
            return this;
        }

        /* renamed from: a */
        private void m59051a(String str, C13823e0 e0Var) {
            if (e0Var.f39969R != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".body != null");
                throw new IllegalArgumentException(sb.toString());
            } else if (e0Var.f39970S != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".networkResponse != null");
                throw new IllegalArgumentException(sb2.toString());
            } else if (e0Var.f39971T != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".cacheResponse != null");
                throw new IllegalArgumentException(sb3.toString());
            } else if (e0Var.f39972U != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString());
            }
        }

        /* renamed from: a */
        public C13824a mo43430a(long j) {
            this.f39989l = j;
            return this;
        }

        /* renamed from: a */
        public C13823e0 mo43439a() {
            if (this.f39978a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f39979b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f39980c < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("code < 0: ");
                sb.append(this.f39980c);
                throw new IllegalStateException(sb.toString());
            } else if (this.f39981d != null) {
                return new C13823e0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }
    }

    C13823e0(C13824a aVar) {
        this.f39976a = aVar.f39978a;
        this.f39977b = aVar.f39979b;
        this.f39965N = aVar.f39980c;
        this.f39966O = aVar.f39981d;
        this.f39967P = aVar.f39982e;
        this.f39968Q = aVar.f39983f.mo43627a();
        this.f39969R = aVar.f39984g;
        this.f39970S = aVar.f39985h;
        this.f39971T = aVar.f39986i;
        this.f39972U = aVar.f39987j;
        this.f39973V = aVar.f39988k;
        this.f39974W = aVar.f39989l;
    }

    /* renamed from: B */
    public boolean mo43406B() {
        int i = this.f39965N;
        if (!(i == 307 || i == 308)) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    public boolean mo43407F() {
        int i = this.f39965N;
        return i >= 200 && i < 300;
    }

    /* renamed from: G */
    public String mo43408G() {
        return this.f39966O;
    }

    @C5952h
    /* renamed from: H */
    public C13823e0 mo43409H() {
        return this.f39970S;
    }

    /* renamed from: I */
    public C13824a mo43410I() {
        return new C13824a(this);
    }

    @C5952h
    /* renamed from: J */
    public C13823e0 mo43411J() {
        return this.f39972U;
    }

    /* renamed from: K */
    public C13799a0 mo43412K() {
        return this.f39977b;
    }

    /* renamed from: L */
    public long mo43413L() {
        return this.f39974W;
    }

    /* renamed from: M */
    public C13813c0 mo43414M() {
        return this.f39976a;
    }

    /* renamed from: N */
    public long mo43415N() {
        return this.f39973V;
    }

    @C5952h
    /* renamed from: a */
    public String mo43418a(String str, @C5952h String str2) {
        String a = this.f39968Q.mo43612a(str);
        return a != null ? a : str2;
    }

    @C5952h
    /* renamed from: b */
    public String mo43419b(String str) {
        return mo43418a(str, null);
    }

    /* renamed from: c */
    public List<String> mo43420c(String str) {
        return this.f39968Q.mo43617c(str);
    }

    public void close() {
        C13826f0 f0Var = this.f39969R;
        if (f0Var != null) {
            f0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    /* renamed from: d */
    public C13815d mo43422d() {
        C13815d dVar = this.f39975X;
        if (dVar != null) {
            return dVar;
        }
        C13815d a = C13815d.m59005a(this.f39968Q);
        this.f39975X = a;
        return a;
    }

    @C5952h
    /* renamed from: e */
    public C13823e0 mo43423e() {
        return this.f39971T;
    }

    /* renamed from: f */
    public List<C13833h> mo43424f() {
        String str;
        int i = this.f39965N;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return C14947e.m66231a(mo43427i(), str);
    }

    /* renamed from: g */
    public int mo43425g() {
        return this.f39965N;
    }

    @C5952h
    /* renamed from: h */
    public C13865t mo43426h() {
        return this.f39967P;
    }

    /* renamed from: i */
    public C13866u mo43427i() {
        return this.f39968Q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Response{protocol=");
        sb.append(this.f39977b);
        sb.append(", code=");
        sb.append(this.f39965N);
        sb.append(", message=");
        sb.append(this.f39966O);
        sb.append(", url=");
        sb.append(this.f39976a.mo43359h());
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public C13826f0 mo43417a(long j) throws IOException {
        C13894e source = this.f39969R.source();
        source.mo43874c(j);
        C13887c clone = source.mo43867b().clone();
        if (clone.size() > j) {
            C13887c cVar = new C13887c();
            cVar.mo43815b(clone, j);
            clone.mo43879d();
            clone = cVar;
        }
        return C13826f0.create(this.f39969R.contentType(), clone.size(), clone);
    }

    @C5952h
    /* renamed from: a */
    public C13826f0 mo43416a() {
        return this.f39969R;
    }
}
