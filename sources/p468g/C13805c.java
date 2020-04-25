package p468g;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.internal.C14910b;
import okhttp3.internal.p514e.C14925b;
import okhttp3.internal.p514e.C14926c;
import okhttp3.internal.p514e.C14928d;
import okhttp3.internal.p514e.C14928d.C14932d;
import okhttp3.internal.p514e.C14928d.C14935f;
import okhttp3.internal.p514e.C14937f;
import okhttp3.internal.p516g.C14947e;
import okhttp3.internal.p516g.C14948f;
import okhttp3.internal.p516g.C14953k;
import okhttp3.internal.p518i.C15000a;
import okhttp3.internal.p519j.C15011f;
import p201f.p202a.C5952h;
import p468g.C13813c0.C13814a;
import p468g.C13823e0.C13824a;
import p468g.C13866u.C13867a;
import p470h.C13883a0;
import p470h.C13887c;
import p470h.C13892d;
import p470h.C13894e;
import p470h.C13896f;
import p470h.C13898h;
import p470h.C13899i;
import p470h.C13906p;
import p470h.C13924z;

/* renamed from: g.c */
/* compiled from: Cache */
public final class C13805c implements Closeable, Flushable {

    /* renamed from: S */
    private static final int f39881S = 201105;

    /* renamed from: T */
    private static final int f39882T = 0;

    /* renamed from: U */
    private static final int f39883U = 1;

    /* renamed from: V */
    private static final int f39884V = 2;

    /* renamed from: N */
    int f39885N;

    /* renamed from: O */
    int f39886O;

    /* renamed from: P */
    private int f39887P;

    /* renamed from: Q */
    private int f39888Q;

    /* renamed from: R */
    private int f39889R;

    /* renamed from: a */
    final C14937f f39890a;

    /* renamed from: b */
    final C14928d f39891b;

    /* renamed from: g.c$a */
    /* compiled from: Cache */
    class C13806a implements C14937f {
        C13806a() {
        }

        /* renamed from: a */
        public C14925b mo43330a(C13823e0 e0Var) throws IOException {
            return C13805c.this.mo43315a(e0Var);
        }

        /* renamed from: b */
        public C13823e0 mo43335b(C13813c0 c0Var) throws IOException {
            return C13805c.this.mo43314a(c0Var);
        }

        /* renamed from: a */
        public void mo43332a(C13813c0 c0Var) throws IOException {
            C13805c.this.mo43319b(c0Var);
        }

        /* renamed from: a */
        public void mo43333a(C13823e0 e0Var, C13823e0 e0Var2) {
            C13805c.this.mo43317a(e0Var, e0Var2);
        }

        /* renamed from: a */
        public void mo43331a() {
            C13805c.this.mo43310F();
        }

        /* renamed from: a */
        public void mo43334a(C14926c cVar) {
            C13805c.this.mo43318a(cVar);
        }
    }

    /* renamed from: g.c$b */
    /* compiled from: Cache */
    class C13807b implements Iterator<String> {

        /* renamed from: N */
        boolean f39893N;

        /* renamed from: a */
        final Iterator<C14935f> f39895a = C13805c.this.f39891b.mo46410B();
        @C5952h

        /* renamed from: b */
        String f39896b;

        C13807b() throws IOException {
        }

        public boolean hasNext() {
            if (this.f39896b != null) {
                return true;
            }
            this.f39893N = false;
            while (this.f39895a.hasNext()) {
                C14935f fVar = (C14935f) this.f39895a.next();
                try {
                    this.f39896b = C13906p.m59739a(fVar.mo46448e(0)).mo43921u();
                    return true;
                } catch (IOException unused) {
                } finally {
                    fVar.close();
                }
            }
            return false;
        }

        public void remove() {
            if (this.f39893N) {
                this.f39895a.remove();
                return;
            }
            throw new IllegalStateException("remove() before next()");
        }

        public String next() {
            if (hasNext()) {
                String str = this.f39896b;
                this.f39896b = null;
                this.f39893N = true;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: g.c$c */
    /* compiled from: Cache */
    private final class C13808c implements C14925b {

        /* renamed from: a */
        private final C14932d f39897a;

        /* renamed from: b */
        private C13924z f39898b;

        /* renamed from: c */
        private C13924z f39899c;

        /* renamed from: d */
        boolean f39900d;

        /* renamed from: g.c$c$a */
        /* compiled from: Cache */
        class C13809a extends C13898h {

            /* renamed from: N */
            final /* synthetic */ C14932d f39902N;

            /* renamed from: b */
            final /* synthetic */ C13805c f39904b;

            C13809a(C13924z zVar, C13805c cVar, C14932d dVar) {
                this.f39904b = cVar;
                this.f39902N = dVar;
                super(zVar);
            }

            public void close() throws IOException {
                synchronized (C13805c.this) {
                    if (!C13808c.this.f39900d) {
                        C13808c.this.f39900d = true;
                        C13805c.this.f39885N++;
                        super.close();
                        this.f39902N.mo46439c();
                    }
                }
            }
        }

        C13808c(C14932d dVar) {
            this.f39897a = dVar;
            this.f39898b = dVar.mo46435a(1);
            this.f39899c = new C13809a(this.f39898b, C13805c.this, dVar);
        }

        /* JADX INFO: used method not loaded: okhttp3.internal.b.a(java.io.Closeable):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r4.f39897a.mo46436a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
            okhttp3.internal.C14910b.m66055a((java.io.Closeable) r4.f39898b);
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo43339c() {
            /*
                r4 = this;
                g.c r0 = p468g.C13805c.this
                monitor-enter(r0)
                boolean r1 = r4.f39900d     // Catch:{ all -> 0x001f }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                return
            L_0x0009:
                r1 = 1
                r4.f39900d = r1     // Catch:{ all -> 0x001f }
                g.c r2 = p468g.C13805c.this     // Catch:{ all -> 0x001f }
                int r3 = r2.f39886O     // Catch:{ all -> 0x001f }
                int r3 = r3 + r1
                r2.f39886O = r3     // Catch:{ all -> 0x001f }
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                h.z r0 = r4.f39898b
                okhttp3.internal.C14910b.m66055a(r0)
                okhttp3.internal.e.d$d r0 = r4.f39897a     // Catch:{ IOException -> 0x001e }
                r0.mo46436a()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                return
            L_0x001f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p468g.C13805c.C13808c.mo43339c():void");
        }

        /* renamed from: d */
        public C13924z mo43340d() {
            return this.f39899c;
        }
    }

    /* renamed from: g.c$d */
    /* compiled from: Cache */
    private static class C13810d extends C13826f0 {
        @C5952h

        /* renamed from: N */
        private final String f39905N;
        @C5952h

        /* renamed from: O */
        private final String f39906O;

        /* renamed from: a */
        final C14935f f39907a;

        /* renamed from: b */
        private final C13894e f39908b;

        /* renamed from: g.c$d$a */
        /* compiled from: Cache */
        class C13811a extends C13899i {

            /* renamed from: a */
            final /* synthetic */ C14935f f39909a;

            C13811a(C13883a0 a0Var, C14935f fVar) {
                this.f39909a = fVar;
                super(a0Var);
            }

            public void close() throws IOException {
                this.f39909a.close();
                super.close();
            }
        }

        C13810d(C14935f fVar, String str, String str2) {
            this.f39907a = fVar;
            this.f39905N = str;
            this.f39906O = str2;
            this.f39908b = C13906p.m59739a((C13883a0) new C13811a(fVar.mo46448e(1), fVar));
        }

        public long contentLength() {
            try {
                if (this.f39906O != null) {
                    return Long.parseLong(this.f39906O);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public C13872x contentType() {
            String str = this.f39905N;
            if (str != null) {
                return C13872x.m59361b(str);
            }
            return null;
        }

        public C13894e source() {
            return this.f39908b;
        }
    }

    /* renamed from: g.c$e */
    /* compiled from: Cache */
    private static final class C13812e {

        /* renamed from: k */
        private static final String f39911k;

        /* renamed from: l */
        private static final String f39912l;

        /* renamed from: a */
        private final String f39913a;

        /* renamed from: b */
        private final C13866u f39914b;

        /* renamed from: c */
        private final String f39915c;

        /* renamed from: d */
        private final C13799a0 f39916d;

        /* renamed from: e */
        private final int f39917e;

        /* renamed from: f */
        private final String f39918f;

        /* renamed from: g */
        private final C13866u f39919g;
        @C5952h

        /* renamed from: h */
        private final C13865t f39920h;

        /* renamed from: i */
        private final long f39921i;

        /* renamed from: j */
        private final long f39922j;

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(C15011f.m66571d().mo46640a());
            sb.append("-Sent-Millis");
            f39911k = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C15011f.m66571d().mo46640a());
            sb2.append("-Received-Millis");
            f39912l = sb2.toString();
        }

        C13812e(C13883a0 a0Var) throws IOException {
            C13834h0 h0Var;
            try {
                C13894e a = C13906p.m59739a(a0Var);
                this.f39913a = a.mo43921u();
                this.f39915c = a.mo43921u();
                C13867a aVar = new C13867a();
                int a2 = C13805c.m58941a(a);
                for (int i = 0; i < a2; i++) {
                    aVar.mo43628b(a.mo43921u());
                }
                this.f39914b = aVar.mo43627a();
                C14953k a3 = C14953k.m66276a(a.mo43921u());
                this.f39916d = a3.f43363a;
                this.f39917e = a3.f43364b;
                this.f39918f = a3.f43365c;
                C13867a aVar2 = new C13867a();
                int a4 = C13805c.m58941a(a);
                for (int i2 = 0; i2 < a4; i2++) {
                    aVar2.mo43628b(a.mo43921u());
                }
                String c = aVar2.mo43632c(f39911k);
                String c2 = aVar2.mo43632c(f39912l);
                aVar2.mo43633d(f39911k);
                aVar2.mo43633d(f39912l);
                long j = 0;
                this.f39921i = c != null ? Long.parseLong(c) : 0;
                if (c2 != null) {
                    j = Long.parseLong(c2);
                }
                this.f39922j = j;
                this.f39919g = aVar2.mo43627a();
                if (m58971a()) {
                    String u = a.mo43921u();
                    if (u.length() <= 0) {
                        C13835i a5 = C13835i.m59091a(a.mo43921u());
                        List a6 = m58969a(a);
                        List a7 = m58969a(a);
                        if (!a.mo43904p()) {
                            h0Var = C13834h0.m59089b(a.mo43921u());
                        } else {
                            h0Var = C13834h0.SSL_3_0;
                        }
                        this.f39920h = C13865t.m59229a(h0Var, a5, a6, a7);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("expected \"\" but was \"");
                        sb.append(u);
                        sb.append("\"");
                        throw new IOException(sb.toString());
                    }
                } else {
                    this.f39920h = null;
                }
            } finally {
                a0Var.close();
            }
        }

        /* renamed from: a */
        public void mo43347a(C14932d dVar) throws IOException {
            String str;
            C13892d a = C13906p.m59738a(dVar.mo46435a(0));
            a.mo43853a(this.f39913a).writeByte(10);
            a.mo43853a(this.f39915c).writeByte(10);
            a.mo43885f((long) this.f39914b.mo43618d()).writeByte(10);
            int d = this.f39914b.mo43618d();
            int i = 0;
            while (true) {
                str = ": ";
                if (i >= d) {
                    break;
                }
                a.mo43853a(this.f39914b.mo43611a(i)).mo43853a(str).mo43853a(this.f39914b.mo43613b(i)).writeByte(10);
                i++;
            }
            a.mo43853a(new C14953k(this.f39916d, this.f39917e, this.f39918f).toString()).writeByte(10);
            a.mo43885f((long) (this.f39919g.mo43618d() + 2)).writeByte(10);
            int d2 = this.f39919g.mo43618d();
            for (int i2 = 0; i2 < d2; i2++) {
                a.mo43853a(this.f39919g.mo43611a(i2)).mo43853a(str).mo43853a(this.f39919g.mo43613b(i2)).writeByte(10);
            }
            a.mo43853a(f39911k).mo43853a(str).mo43885f(this.f39921i).writeByte(10);
            a.mo43853a(f39912l).mo43853a(str).mo43885f(this.f39922j).writeByte(10);
            if (m58971a()) {
                a.writeByte(10);
                a.mo43853a(this.f39920h.mo43602a().mo43482a()).writeByte(10);
                m58970a(a, this.f39920h.mo43605d());
                m58970a(a, this.f39920h.mo43603b());
                a.mo43853a(this.f39920h.mo43608f().mo43481d()).writeByte(10);
            }
            a.close();
        }

        /* renamed from: a */
        private boolean m58971a() {
            return this.f39913a.startsWith("https://");
        }

        C13812e(C13823e0 e0Var) {
            this.f39913a = e0Var.mo43414M().mo43359h().toString();
            this.f39914b = C14947e.m66243e(e0Var);
            this.f39915c = e0Var.mo43414M().mo43356e();
            this.f39916d = e0Var.mo43412K();
            this.f39917e = e0Var.mo43425g();
            this.f39918f = e0Var.mo43408G();
            this.f39919g = e0Var.mo43427i();
            this.f39920h = e0Var.mo43426h();
            this.f39921i = e0Var.mo43415N();
            this.f39922j = e0Var.mo43413L();
        }

        /* renamed from: a */
        private List<Certificate> m58969a(C13894e eVar) throws IOException {
            int a = C13805c.m58941a(eVar);
            if (a == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(a);
                for (int i = 0; i < a; i++) {
                    String u = eVar.mo43921u();
                    C13887c cVar = new C13887c();
                    cVar.m59514a(C13896f.m59652b(u));
                    arrayList.add(instance.generateCertificate(cVar.mo43833A()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: a */
        private void m58970a(C13892d dVar, List<Certificate> list) throws IOException {
            try {
                dVar.mo43885f((long) list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    dVar.mo43853a(C13896f.m59656e(((Certificate) list.get(i)).getEncoded()).mo43972e()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: a */
        public boolean mo43348a(C13813c0 c0Var, C13823e0 e0Var) {
            return this.f39913a.equals(c0Var.mo43359h().toString()) && this.f39915c.equals(c0Var.mo43356e()) && C14947e.m66234a(e0Var, this.f39914b, c0Var);
        }

        /* renamed from: a */
        public C13823e0 mo43346a(C14935f fVar) {
            String a = this.f39919g.mo43612a("Content-Type");
            String a2 = this.f39919g.mo43612a("Content-Length");
            return new C13824a().mo43432a(new C13814a().mo43374b(this.f39913a).mo43368a(this.f39915c, (C13817d0) null).mo43363a(this.f39914b).mo43371a()).mo43431a(this.f39916d).mo43429a(this.f39917e).mo43437a(this.f39918f).mo43436a(this.f39919g).mo43434a((C13826f0) new C13810d(fVar, a, a2)).mo43435a(this.f39920h).mo43440b(this.f39921i).mo43430a(this.f39922j).mo43439a();
        }
    }

    public C13805c(File file, long j) {
        this(file, j, C15000a.f43609a);
    }

    /* renamed from: a */
    public static String m58942a(C13868v vVar) {
        return C13896f.m59655e(vVar.toString()).mo43981j().mo43977g();
    }

    /* renamed from: B */
    public synchronized int mo43309B() {
        return this.f39889R;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public synchronized void mo43310F() {
        this.f39888Q++;
    }

    /* renamed from: G */
    public Iterator<String> mo43311G() throws IOException {
        return new C13807b();
    }

    /* renamed from: H */
    public synchronized int mo43312H() {
        return this.f39886O;
    }

    /* renamed from: I */
    public synchronized int mo43313I() {
        return this.f39885N;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo43319b(C13813c0 c0Var) throws IOException {
        this.f39891b.mo46421d(m58942a(c0Var.mo43359h()));
    }

    public void close() throws IOException {
        this.f39891b.close();
    }

    /* renamed from: d */
    public File mo43321d() {
        return this.f39891b.mo46422e();
    }

    /* renamed from: e */
    public void mo43322e() throws IOException {
        this.f39891b.mo46420d();
    }

    /* renamed from: f */
    public synchronized int mo43323f() {
        return this.f39888Q;
    }

    public void flush() throws IOException {
        this.f39891b.flush();
    }

    /* renamed from: g */
    public void mo43325g() throws IOException {
        this.f39891b.mo46425g();
    }

    /* renamed from: h */
    public long mo43326h() {
        return this.f39891b.mo46423f();
    }

    /* renamed from: i */
    public synchronized int mo43327i() {
        return this.f39887P;
    }

    public boolean isClosed() {
        return this.f39891b.isClosed();
    }

    public long size() throws IOException {
        return this.f39891b.size();
    }

    C13805c(File file, long j, C15000a aVar) {
        this.f39890a = new C13806a();
        this.f39891b = C14928d.m66156a(aVar, file, f39881S, 2, j);
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: a */
    public C13823e0 mo43314a(C13813c0 c0Var) {
        try {
            C14935f c = this.f39891b.mo46418c(m58942a(c0Var.mo43359h()));
            if (c == null) {
                return null;
            }
            try {
                C13812e eVar = new C13812e(c.mo46448e(0));
                C13823e0 a = eVar.mo43346a(c);
                if (eVar.mo43348a(c0Var, a)) {
                    return a;
                }
                C14910b.m66055a((Closeable) a.mo43416a());
                return null;
            } catch (IOException unused) {
                C14910b.m66055a((Closeable) c);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: a */
    public C14925b mo43315a(C13823e0 e0Var) {
        C14932d dVar;
        String e = e0Var.mo43414M().mo43356e();
        if (C14948f.m66244a(e0Var.mo43414M().mo43356e())) {
            try {
                mo43319b(e0Var.mo43414M());
            } catch (IOException unused) {
            }
            return null;
        } else if (!e.equals("GET") || C14947e.m66240c(e0Var)) {
            return null;
        } else {
            C13812e eVar = new C13812e(e0Var);
            try {
                dVar = this.f39891b.mo46417b(m58942a(e0Var.mo43414M().mo43359h()));
                if (dVar == null) {
                    return null;
                }
                try {
                    eVar.mo43347a(dVar);
                    return new C13808c(dVar);
                } catch (IOException unused2) {
                    m58943a(dVar);
                    return null;
                }
            } catch (IOException unused3) {
                dVar = null;
                m58943a(dVar);
                return null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo43317a(C13823e0 e0Var, C13823e0 e0Var2) {
        C14932d dVar;
        C13812e eVar = new C13812e(e0Var2);
        try {
            dVar = ((C13810d) e0Var.mo43416a()).f39907a.mo46445a();
            if (dVar != null) {
                try {
                    eVar.mo43347a(dVar);
                    dVar.mo46439c();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            dVar = null;
            m58943a(dVar);
        }
    }

    /* renamed from: a */
    private void m58943a(@C5952h C14932d dVar) {
        if (dVar != null) {
            try {
                dVar.mo46436a();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo43316a() throws IOException {
        this.f39891b.mo46413a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo43318a(C14926c cVar) {
        this.f39889R++;
        if (cVar.f43237a != null) {
            this.f39887P++;
        } else if (cVar.f43238b != null) {
            this.f39888Q++;
        }
    }

    /* renamed from: a */
    static int m58941a(C13894e eVar) throws IOException {
        try {
            long r = eVar.mo43907r();
            String u = eVar.mo43921u();
            if (r >= 0 && r <= 2147483647L && u.isEmpty()) {
                return (int) r;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("expected an int but was \"");
            sb.append(r);
            sb.append(u);
            sb.append("\"");
            throw new IOException(sb.toString());
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }
}
