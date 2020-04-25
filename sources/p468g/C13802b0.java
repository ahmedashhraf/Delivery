package p468g;

import androidx.core.app.C0770p;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.C14909a;
import okhttp3.internal.connection.C14914a;
import okhttp3.internal.connection.C14921f;
import okhttp3.internal.p514e.C14923a;
import okhttp3.internal.p516g.C14941a;
import okhttp3.internal.p516g.C14942b;
import okhttp3.internal.p516g.C14949g;
import okhttp3.internal.p516g.C14952j;
import okhttp3.internal.p519j.C15011f;
import p201f.p202a.C5952h;
import p470h.C13879a;
import p470h.C13885b0;

/* renamed from: g.b0 */
/* compiled from: RealCall */
final class C13802b0 implements C13821e {

    /* renamed from: N */
    final C13879a f39870N = new C13803a();
    /* access modifiers changed from: private */
    @C5952h

    /* renamed from: O */
    public C13859r f39871O;

    /* renamed from: P */
    final C13813c0 f39872P;

    /* renamed from: Q */
    final boolean f39873Q;

    /* renamed from: R */
    private boolean f39874R;

    /* renamed from: a */
    final C13876z f39875a;

    /* renamed from: b */
    final C14952j f39876b;

    /* renamed from: g.b0$a */
    /* compiled from: RealCall */
    class C13803a extends C13879a {
        C13803a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo43303i() {
            C13802b0.this.cancel();
        }
    }

    /* renamed from: g.b0$b */
    /* compiled from: RealCall */
    final class C13804b extends C14909a {

        /* renamed from: O */
        static final /* synthetic */ boolean f39878O = false;

        /* renamed from: b */
        private final C13825f f39880b;

        static {
            Class<C13802b0> cls = C13802b0.class;
        }

        C13804b(C13825f fVar) {
            super("OkHttp %s", C13802b0.this.mo43293b());
            this.f39880b = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo43304a(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                C13802b0.this.f39871O.mo43579a((C13821e) C13802b0.this, (IOException) interruptedIOException);
                this.f39880b.onFailure(C13802b0.this, interruptedIOException);
                C13802b0.this.f39875a.mo43739j().mo43564b(this);
            } catch (Throwable th) {
                C13802b0.this.f39875a.mo43739j().mo43564b(this);
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a A[Catch:{ all -> 0x003d }] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x006a A[Catch:{ all -> 0x003d }] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo43305b() {
            /*
                r5 = this;
                g.b0 r0 = p468g.C13802b0.this
                h.a r0 = r0.f39870N
                r0.mo43813g()
                r0 = 1
                r1 = 0
                g.b0 r2 = p468g.C13802b0.this     // Catch:{ IOException -> 0x003f }
                g.e0 r2 = r2.mo43290a()     // Catch:{ IOException -> 0x003f }
                g.b0 r3 = p468g.C13802b0.this     // Catch:{ IOException -> 0x003f }
                okhttp3.internal.g.j r3 = r3.f39876b     // Catch:{ IOException -> 0x003f }
                boolean r1 = r3.mo46469b()     // Catch:{ IOException -> 0x003f }
                if (r1 == 0) goto L_0x0028
                g.f r1 = r5.f39880b     // Catch:{ IOException -> 0x003b }
                g.b0 r2 = p468g.C13802b0.this     // Catch:{ IOException -> 0x003b }
                java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x003b }
                java.lang.String r4 = "Canceled"
                r3.<init>(r4)     // Catch:{ IOException -> 0x003b }
                r1.onFailure(r2, r3)     // Catch:{ IOException -> 0x003b }
                goto L_0x002f
            L_0x0028:
                g.f r1 = r5.f39880b     // Catch:{ IOException -> 0x003b }
                g.b0 r3 = p468g.C13802b0.this     // Catch:{ IOException -> 0x003b }
                r1.onResponse(r3, r2)     // Catch:{ IOException -> 0x003b }
            L_0x002f:
                g.b0 r0 = p468g.C13802b0.this
                g.z r0 = r0.f39875a
                g.p r0 = r0.mo43739j()
                r0.mo43564b(r5)
                goto L_0x007d
            L_0x003b:
                r1 = move-exception
                goto L_0x0042
            L_0x003d:
                r0 = move-exception
                goto L_0x007e
            L_0x003f:
                r0 = move-exception
                r1 = r0
                r0 = 0
            L_0x0042:
                g.b0 r2 = p468g.C13802b0.this     // Catch:{ all -> 0x003d }
                java.io.IOException r1 = r2.mo43291a(r1)     // Catch:{ all -> 0x003d }
                if (r0 == 0) goto L_0x006a
                okhttp3.internal.j.f r0 = okhttp3.internal.p519j.C15011f.m66571d()     // Catch:{ all -> 0x003d }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
                r3.<init>()     // Catch:{ all -> 0x003d }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x003d }
                g.b0 r4 = p468g.C13802b0.this     // Catch:{ all -> 0x003d }
                java.lang.String r4 = r4.mo43297d()     // Catch:{ all -> 0x003d }
                r3.append(r4)     // Catch:{ all -> 0x003d }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x003d }
                r0.mo46615a(r2, r3, r1)     // Catch:{ all -> 0x003d }
                goto L_0x002f
            L_0x006a:
                g.b0 r0 = p468g.C13802b0.this     // Catch:{ all -> 0x003d }
                g.r r0 = r0.f39871O     // Catch:{ all -> 0x003d }
                g.b0 r2 = p468g.C13802b0.this     // Catch:{ all -> 0x003d }
                r0.mo43579a(r2, r1)     // Catch:{ all -> 0x003d }
                g.f r0 = r5.f39880b     // Catch:{ all -> 0x003d }
                g.b0 r2 = p468g.C13802b0.this     // Catch:{ all -> 0x003d }
                r0.onFailure(r2, r1)     // Catch:{ all -> 0x003d }
                goto L_0x002f
            L_0x007d:
                return
            L_0x007e:
                g.b0 r1 = p468g.C13802b0.this
                g.z r1 = r1.f39875a
                g.p r1 = r1.mo43739j()
                r1.mo43564b(r5)
                goto L_0x008b
            L_0x008a:
                throw r0
            L_0x008b:
                goto L_0x008a
            */
            throw new UnsupportedOperationException("Method not decompiled: p468g.C13802b0.C13804b.mo43305b():void");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C13802b0 mo43306c() {
            return C13802b0.this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public String mo43307d() {
            return C13802b0.this.f39872P.mo43359h().mo43649h();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C13813c0 mo43308e() {
            return C13802b0.this.f39872P;
        }
    }

    private C13802b0(C13876z zVar, C13813c0 c0Var, boolean z) {
        this.f39875a = zVar;
        this.f39872P = c0Var;
        this.f39873Q = z;
        this.f39876b = new C14952j(zVar, z);
        this.f39870N.mo43828b((long) zVar.mo43733d(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: e */
    private void m58928e() {
        this.f39876b.mo46468a(C15011f.m66571d().mo46613a("response.body().close()"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo43293b() {
        return this.f39872P.mo43359h().mo43660r();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C14921f mo43294c() {
        return this.f39876b.mo46470c();
    }

    public void cancel() {
        this.f39876b.mo46467a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public String mo43297d() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f39873Q ? "web socket" : C0770p.f3516c0);
        sb.append(" to ");
        sb.append(mo43293b());
        return sb.toString();
    }

    public C13823e0 execute() throws IOException {
        synchronized (this) {
            if (!this.f39874R) {
                this.f39874R = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        m58928e();
        this.f39870N.mo43813g();
        this.f39871O.mo43585b(this);
        try {
            this.f39875a.mo43739j().mo43560a(this);
            C13823e0 a = mo43290a();
            if (a != null) {
                this.f39875a.mo43739j().mo43565b(this);
                return a;
            }
            throw new IOException("Canceled");
        } catch (IOException e) {
            IOException a2 = mo43291a(e);
            this.f39871O.mo43579a((C13821e) this, a2);
            throw a2;
        } catch (Throwable th) {
            this.f39875a.mo43739j().mo43565b(this);
            throw th;
        }
    }

    public boolean isCanceled() {
        return this.f39876b.mo46469b();
    }

    public synchronized boolean isExecuted() {
        return this.f39874R;
    }

    public C13813c0 request() {
        return this.f39872P;
    }

    public C13885b0 timeout() {
        return this.f39870N;
    }

    /* renamed from: a */
    static C13802b0 m58926a(C13876z zVar, C13813c0 c0Var, boolean z) {
        C13802b0 b0Var = new C13802b0(zVar, c0Var, z);
        b0Var.f39871O = zVar.mo43741l().mo43593a(b0Var);
        return b0Var;
    }

    public C13802b0 clone() {
        return m58926a(this.f39875a, this.f39872P, this.f39873Q);
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: a */
    public IOException mo43291a(@C5952h IOException iOException) {
        if (!this.f39870N.mo43814h()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: a */
    public void mo43292a(C13825f fVar) {
        synchronized (this) {
            if (!this.f39874R) {
                this.f39874R = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        m58928e();
        this.f39871O.mo43585b(this);
        this.f39875a.mo43739j().mo43559a(new C13804b(fVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13823e0 mo43290a() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f39875a.mo43745p());
        arrayList.add(this.f39876b);
        arrayList.add(new C14941a(this.f39875a.mo43738i()));
        arrayList.add(new C14923a(this.f39875a.mo43746q()));
        arrayList.add(new C14914a(this.f39875a));
        if (!this.f39873Q) {
            arrayList.addAll(this.f39875a.mo43747r());
        }
        arrayList.add(new C14942b(this.f39873Q));
        C14949g gVar = new C14949g(arrayList, null, null, null, 0, this.f39872P, this, this.f39871O, this.f39875a.mo43735f(), this.f39875a.mo43754y(), this.f39875a.mo43730D());
        return gVar.mo43698a(this.f39872P);
    }
}
