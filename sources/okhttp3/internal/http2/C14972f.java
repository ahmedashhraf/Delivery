package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.C14909a;
import okhttp3.internal.C14910b;
import okhttp3.internal.p519j.C15011f;
import p468g.C13799a0;
import p470h.C13887c;
import p470h.C13892d;
import p470h.C13894e;
import p470h.C13896f;
import p470h.C13906p;

/* renamed from: okhttp3.internal.http2.f */
/* compiled from: Http2Connection */
public final class C14972f implements Closeable {

    /* renamed from: f0 */
    static final int f43482f0 = 16777216;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public static final ExecutorService f43483g0;

    /* renamed from: h0 */
    static final /* synthetic */ boolean f43484h0 = false;

    /* renamed from: N */
    final Map<Integer, C14990h> f43485N = new LinkedHashMap();

    /* renamed from: O */
    final String f43486O;

    /* renamed from: P */
    int f43487P;

    /* renamed from: Q */
    int f43488Q;

    /* renamed from: R */
    boolean f43489R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public final ScheduledExecutorService f43490S;

    /* renamed from: T */
    private final ExecutorService f43491T;

    /* renamed from: U */
    final C14997k f43492U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public boolean f43493V;

    /* renamed from: W */
    long f43494W = 0;

    /* renamed from: X */
    long f43495X;

    /* renamed from: Y */
    C14999l f43496Y = new C14999l();

    /* renamed from: Z */
    final C14999l f43497Z = new C14999l();

    /* renamed from: a */
    final boolean f43498a;

    /* renamed from: a0 */
    boolean f43499a0 = false;

    /* renamed from: b */
    final C14980h f43500b;

    /* renamed from: b0 */
    final Socket f43501b0;

    /* renamed from: c0 */
    final C14994i f43502c0;

    /* renamed from: d0 */
    final C14983j f43503d0;

    /* renamed from: e0 */
    final Set<Integer> f43504e0 = new LinkedHashSet();

    /* renamed from: okhttp3.internal.http2.f$a */
    /* compiled from: Http2Connection */
    class C14973a extends C14909a {

        /* renamed from: N */
        final /* synthetic */ C14963a f43505N;

        /* renamed from: b */
        final /* synthetic */ int f43507b;

        C14973a(String str, Object[] objArr, int i, C14963a aVar) {
            this.f43507b = i;
            this.f43505N = aVar;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo43305b() {
            try {
                C14972f.this.mo46512b(this.f43507b, this.f43505N);
            } catch (IOException unused) {
                C14972f.this.m66341F();
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.f$b */
    /* compiled from: Http2Connection */
    class C14974b extends C14909a {

        /* renamed from: N */
        final /* synthetic */ long f43508N;

        /* renamed from: b */
        final /* synthetic */ int f43510b;

        C14974b(String str, Object[] objArr, int i, long j) {
            this.f43510b = i;
            this.f43508N = j;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo43305b() {
            try {
                C14972f.this.f43502c0.mo46572a(this.f43510b, this.f43508N);
            } catch (IOException unused) {
                C14972f.this.m66341F();
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.f$c */
    /* compiled from: Http2Connection */
    class C14975c extends C14909a {

        /* renamed from: N */
        final /* synthetic */ List f43511N;

        /* renamed from: b */
        final /* synthetic */ int f43513b;

        C14975c(String str, Object[] objArr, int i, List list) {
            this.f43513b = i;
            this.f43511N = list;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo43305b() {
            if (C14972f.this.f43492U.mo46591a(this.f43513b, this.f43511N)) {
                try {
                    C14972f.this.f43502c0.mo46574a(this.f43513b, C14963a.CANCEL);
                    synchronized (C14972f.this) {
                        C14972f.this.f43504e0.remove(Integer.valueOf(this.f43513b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.f$d */
    /* compiled from: Http2Connection */
    class C14976d extends C14909a {

        /* renamed from: N */
        final /* synthetic */ List f43514N;

        /* renamed from: O */
        final /* synthetic */ boolean f43515O;

        /* renamed from: b */
        final /* synthetic */ int f43517b;

        C14976d(String str, Object[] objArr, int i, List list, boolean z) {
            this.f43517b = i;
            this.f43514N = list;
            this.f43515O = z;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo43305b() {
            boolean a = C14972f.this.f43492U.mo46592a(this.f43517b, this.f43514N, this.f43515O);
            if (a) {
                try {
                    C14972f.this.f43502c0.mo46574a(this.f43517b, C14963a.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (a || this.f43515O) {
                synchronized (C14972f.this) {
                    C14972f.this.f43504e0.remove(Integer.valueOf(this.f43517b));
                }
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.f$e */
    /* compiled from: Http2Connection */
    class C14977e extends C14909a {

        /* renamed from: N */
        final /* synthetic */ C13887c f43518N;

        /* renamed from: O */
        final /* synthetic */ int f43519O;

        /* renamed from: P */
        final /* synthetic */ boolean f43520P;

        /* renamed from: b */
        final /* synthetic */ int f43522b;

        C14977e(String str, Object[] objArr, int i, C13887c cVar, int i2, boolean z) {
            this.f43522b = i;
            this.f43518N = cVar;
            this.f43519O = i2;
            this.f43520P = z;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo43305b() {
            try {
                boolean a = C14972f.this.f43492U.mo46590a(this.f43522b, this.f43518N, this.f43519O, this.f43520P);
                if (a) {
                    C14972f.this.f43502c0.mo46574a(this.f43522b, C14963a.CANCEL);
                }
                if (a || this.f43520P) {
                    synchronized (C14972f.this) {
                        C14972f.this.f43504e0.remove(Integer.valueOf(this.f43522b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.f$f */
    /* compiled from: Http2Connection */
    class C14978f extends C14909a {

        /* renamed from: N */
        final /* synthetic */ C14963a f43523N;

        /* renamed from: b */
        final /* synthetic */ int f43525b;

        C14978f(String str, Object[] objArr, int i, C14963a aVar) {
            this.f43525b = i;
            this.f43523N = aVar;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo43305b() {
            C14972f.this.f43492U.mo46589a(this.f43525b, this.f43523N);
            synchronized (C14972f.this) {
                C14972f.this.f43504e0.remove(Integer.valueOf(this.f43525b));
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.f$g */
    /* compiled from: Http2Connection */
    public static class C14979g {

        /* renamed from: a */
        Socket f43526a;

        /* renamed from: b */
        String f43527b;

        /* renamed from: c */
        C13894e f43528c;

        /* renamed from: d */
        C13892d f43529d;

        /* renamed from: e */
        C14980h f43530e = C14980h.f43534a;

        /* renamed from: f */
        C14997k f43531f = C14997k.f43598a;

        /* renamed from: g */
        boolean f43532g;

        /* renamed from: h */
        int f43533h;

        public C14979g(boolean z) {
            this.f43532g = z;
        }

        /* renamed from: a */
        public C14979g mo46525a(Socket socket) throws IOException {
            return mo46526a(socket, ((InetSocketAddress) socket.getRemoteSocketAddress()).getHostName(), C13906p.m59739a(C13906p.m59747b(socket)), C13906p.m59738a(C13906p.m59744a(socket)));
        }

        /* renamed from: a */
        public C14979g mo46526a(Socket socket, String str, C13894e eVar, C13892d dVar) {
            this.f43526a = socket;
            this.f43527b = str;
            this.f43528c = eVar;
            this.f43529d = dVar;
            return this;
        }

        /* renamed from: a */
        public C14979g mo46527a(C14980h hVar) {
            this.f43530e = hVar;
            return this;
        }

        /* renamed from: a */
        public C14979g mo46528a(C14997k kVar) {
            this.f43531f = kVar;
            return this;
        }

        /* renamed from: a */
        public C14979g mo46524a(int i) {
            this.f43533h = i;
            return this;
        }

        /* renamed from: a */
        public C14972f mo46529a() {
            return new C14972f(this);
        }
    }

    /* renamed from: okhttp3.internal.http2.f$h */
    /* compiled from: Http2Connection */
    public static abstract class C14980h {

        /* renamed from: a */
        public static final C14980h f43534a = new C14981a();

        /* renamed from: okhttp3.internal.http2.f$h$a */
        /* compiled from: Http2Connection */
        class C14981a extends C14980h {
            C14981a() {
            }

            /* renamed from: a */
            public void mo46379a(C14990h hVar) throws IOException {
                hVar.mo46549a(C14963a.REFUSED_STREAM);
            }
        }

        /* renamed from: a */
        public void mo46378a(C14972f fVar) {
        }

        /* renamed from: a */
        public abstract void mo46379a(C14990h hVar) throws IOException;
    }

    /* renamed from: okhttp3.internal.http2.f$i */
    /* compiled from: Http2Connection */
    final class C14982i extends C14909a {

        /* renamed from: N */
        final int f43535N;

        /* renamed from: O */
        final int f43536O;

        /* renamed from: b */
        final boolean f43538b;

        C14982i(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C14972f.this.f43486O, Integer.valueOf(i), Integer.valueOf(i2));
            this.f43538b = z;
            this.f43535N = i;
            this.f43536O = i2;
        }

        /* renamed from: b */
        public void mo43305b() {
            C14972f.this.mo46510a(this.f43538b, this.f43535N, this.f43536O);
        }
    }

    /* renamed from: okhttp3.internal.http2.f$j */
    /* compiled from: Http2Connection */
    class C14983j extends C14909a implements C14989b {

        /* renamed from: b */
        final C14987g f43540b;

        /* renamed from: okhttp3.internal.http2.f$j$a */
        /* compiled from: Http2Connection */
        class C14984a extends C14909a {

            /* renamed from: b */
            final /* synthetic */ C14990h f43542b;

            C14984a(String str, Object[] objArr, C14990h hVar) {
                this.f43542b = hVar;
                super(str, objArr);
            }

            /* renamed from: b */
            public void mo43305b() {
                try {
                    C14972f.this.f43500b.mo46379a(this.f43542b);
                } catch (IOException e) {
                    C15011f d = C15011f.m66571d();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Http2Connection.Listener failure for ");
                    sb.append(C14972f.this.f43486O);
                    d.mo46615a(4, sb.toString(), (Throwable) e);
                    try {
                        this.f43542b.mo46549a(C14963a.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: okhttp3.internal.http2.f$j$b */
        /* compiled from: Http2Connection */
        class C14985b extends C14909a {
            C14985b(String str, Object... objArr) {
                super(str, objArr);
            }

            /* renamed from: b */
            public void mo43305b() {
                C14972f fVar = C14972f.this;
                fVar.f43500b.mo46378a(fVar);
            }
        }

        /* renamed from: okhttp3.internal.http2.f$j$c */
        /* compiled from: Http2Connection */
        class C14986c extends C14909a {

            /* renamed from: b */
            final /* synthetic */ C14999l f43545b;

            C14986c(String str, Object[] objArr, C14999l lVar) {
                this.f43545b = lVar;
                super(str, objArr);
            }

            /* renamed from: b */
            public void mo43305b() {
                try {
                    C14972f.this.f43502c0.mo46576a(this.f43545b);
                } catch (IOException unused) {
                    C14972f.this.m66341F();
                }
            }
        }

        C14983j(C14987g gVar) {
            super("OkHttp %s", C14972f.this.f43486O);
            this.f43540b = gVar;
        }

        /* renamed from: a */
        public void mo46530a() {
        }

        /* renamed from: a */
        public void mo46531a(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: a */
        public void mo46534a(int i, String str, C13896f fVar, String str2, int i2, long j) {
        }

        /* renamed from: a */
        public void mo46539a(boolean z, int i, C13894e eVar, int i2) throws IOException {
            if (C14972f.this.mo46517e(i)) {
                C14972f.this.mo46499a(i, eVar, i2, z);
                return;
            }
            C14990h a = C14972f.this.mo46495a(i);
            if (a == null) {
                C14972f.this.mo46513c(i, C14963a.PROTOCOL_ERROR);
                long j = (long) i2;
                C14972f.this.mo46505a(j);
                eVar.skip(j);
                return;
            }
            a.mo46546a(eVar, i2);
            if (z) {
                a.mo46562k();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1 = okhttp3.internal.http2.C14963a.PROTOCOL_ERROR;
            r0 = okhttp3.internal.http2.C14963a.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r2 = r4.f43539N;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x002b, code lost:
            r2 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001c */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo43305b() {
            /*
                r4 = this;
                okhttp3.internal.http2.a r0 = okhttp3.internal.http2.C14963a.INTERNAL_ERROR
                okhttp3.internal.http2.g r1 = r4.f43540b     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                r1.mo46541a(r4)     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            L_0x0007:
                okhttp3.internal.http2.g r1 = r4.f43540b     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                r2 = 0
                boolean r1 = r1.mo46542a(r2, r4)     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                if (r1 == 0) goto L_0x0011
                goto L_0x0007
            L_0x0011:
                okhttp3.internal.http2.a r1 = okhttp3.internal.http2.C14963a.NO_ERROR     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                okhttp3.internal.http2.a r0 = okhttp3.internal.http2.C14963a.CANCEL     // Catch:{ IOException -> 0x001c }
                okhttp3.internal.http2.f r2 = okhttp3.internal.http2.C14972f.this     // Catch:{ IOException -> 0x0025 }
                goto L_0x0022
            L_0x0018:
                r2 = move-exception
                r1 = r0
                goto L_0x002c
            L_0x001b:
                r1 = r0
            L_0x001c:
                okhttp3.internal.http2.a r1 = okhttp3.internal.http2.C14963a.PROTOCOL_ERROR     // Catch:{ all -> 0x002b }
                okhttp3.internal.http2.a r0 = okhttp3.internal.http2.C14963a.PROTOCOL_ERROR     // Catch:{ all -> 0x002b }
                okhttp3.internal.http2.f r2 = okhttp3.internal.http2.C14972f.this     // Catch:{ IOException -> 0x0025 }
            L_0x0022:
                r2.mo46507a(r1, r0)     // Catch:{ IOException -> 0x0025 }
            L_0x0025:
                okhttp3.internal.http2.g r0 = r4.f43540b
                okhttp3.internal.C14910b.m66055a(r0)
                return
            L_0x002b:
                r2 = move-exception
            L_0x002c:
                okhttp3.internal.http2.f r3 = okhttp3.internal.http2.C14972f.this     // Catch:{ IOException -> 0x0031 }
                r3.mo46507a(r1, r0)     // Catch:{ IOException -> 0x0031 }
            L_0x0031:
                okhttp3.internal.http2.g r0 = r4.f43540b
                okhttp3.internal.C14910b.m66055a(r0)
                goto L_0x0038
            L_0x0037:
                throw r2
            L_0x0038:
                goto L_0x0037
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C14972f.C14983j.mo43305b():void");
        }

        /* JADX INFO: used method not loaded: okhttp3.internal.http2.h.a(java.util.List):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
            r0.mo46547a((java.util.List) r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
            if (r10 == false) goto L_0x007c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
            r0.mo46562k();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo46538a(boolean r10, int r11, int r12, java.util.List<okhttp3.internal.http2.C14964b> r13) {
            /*
                r9 = this;
                okhttp3.internal.http2.f r12 = okhttp3.internal.http2.C14972f.this
                boolean r12 = r12.mo46517e(r11)
                if (r12 == 0) goto L_0x000e
                okhttp3.internal.http2.f r12 = okhttp3.internal.http2.C14972f.this
                r12.mo46501a(r11, r13, r10)
                return
            L_0x000e:
                okhttp3.internal.http2.f r12 = okhttp3.internal.http2.C14972f.this
                monitor-enter(r12)
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C14972f.this     // Catch:{ all -> 0x007d }
                okhttp3.internal.http2.h r0 = r0.mo46495a(r11)     // Catch:{ all -> 0x007d }
                if (r0 != 0) goto L_0x0073
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C14972f.this     // Catch:{ all -> 0x007d }
                boolean r0 = r0.f43489R     // Catch:{ all -> 0x007d }
                if (r0 == 0) goto L_0x0021
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0021:
                okhttp3.internal.http2.f r0 = okhttp3.internal.http2.C14972f.this     // Catch:{ all -> 0x007d }
                int r0 = r0.f43487P     // Catch:{ all -> 0x007d }
                if (r11 > r0) goto L_0x0029
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0029:
                int r0 = r11 % 2
                okhttp3.internal.http2.f r1 = okhttp3.internal.http2.C14972f.this     // Catch:{ all -> 0x007d }
                int r1 = r1.f43488Q     // Catch:{ all -> 0x007d }
                r2 = 2
                int r1 = r1 % r2
                if (r0 != r1) goto L_0x0035
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0035:
                g.u r8 = okhttp3.internal.C14910b.m66066b(r13)     // Catch:{ all -> 0x007d }
                okhttp3.internal.http2.h r13 = new okhttp3.internal.http2.h     // Catch:{ all -> 0x007d }
                okhttp3.internal.http2.f r5 = okhttp3.internal.http2.C14972f.this     // Catch:{ all -> 0x007d }
                r6 = 0
                r3 = r13
                r4 = r11
                r7 = r10
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x007d }
                okhttp3.internal.http2.f r10 = okhttp3.internal.http2.C14972f.this     // Catch:{ all -> 0x007d }
                r10.f43487P = r11     // Catch:{ all -> 0x007d }
                okhttp3.internal.http2.f r10 = okhttp3.internal.http2.C14972f.this     // Catch:{ all -> 0x007d }
                java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r10 = r10.f43485N     // Catch:{ all -> 0x007d }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007d }
                r10.put(r0, r13)     // Catch:{ all -> 0x007d }
                java.util.concurrent.ExecutorService r10 = okhttp3.internal.http2.C14972f.f43483g0     // Catch:{ all -> 0x007d }
                okhttp3.internal.http2.f$j$a r0 = new okhttp3.internal.http2.f$j$a     // Catch:{ all -> 0x007d }
                java.lang.String r1 = "OkHttp %s stream %d"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x007d }
                r3 = 0
                okhttp3.internal.http2.f r4 = okhttp3.internal.http2.C14972f.this     // Catch:{ all -> 0x007d }
                java.lang.String r4 = r4.f43486O     // Catch:{ all -> 0x007d }
                r2[r3] = r4     // Catch:{ all -> 0x007d }
                r3 = 1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x007d }
                r2[r3] = r11     // Catch:{ all -> 0x007d }
                r0.<init>(r1, r2, r13)     // Catch:{ all -> 0x007d }
                r10.execute(r0)     // Catch:{ all -> 0x007d }
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                return
            L_0x0073:
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                r0.mo46547a(r13)
                if (r10 == 0) goto L_0x007c
                r0.mo46562k()
            L_0x007c:
                return
            L_0x007d:
                r10 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x007d }
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C14972f.C14983j.mo46538a(boolean, int, int, java.util.List):void");
        }

        /* renamed from: a */
        public void mo46535a(int i, C14963a aVar) {
            if (C14972f.this.mo46517e(i)) {
                C14972f.this.mo46502a(i, aVar);
                return;
            }
            C14990h f = C14972f.this.mo46519f(i);
            if (f != null) {
                f.mo46554c(aVar);
            }
        }

        /* renamed from: a */
        public void mo46540a(boolean z, C14999l lVar) {
            C14990h[] hVarArr;
            long j;
            int i;
            synchronized (C14972f.this) {
                int c = C14972f.this.f43497Z.mo46600c();
                if (z) {
                    C14972f.this.f43497Z.mo46595a();
                }
                C14972f.this.f43497Z.mo46596a(lVar);
                m66390a(lVar);
                int c2 = C14972f.this.f43497Z.mo46600c();
                hVarArr = null;
                if (c2 == -1 || c2 == c) {
                    j = 0;
                } else {
                    j = (long) (c2 - c);
                    if (!C14972f.this.f43499a0) {
                        C14972f.this.f43499a0 = true;
                    }
                    if (!C14972f.this.f43485N.isEmpty()) {
                        hVarArr = (C14990h[]) C14972f.this.f43485N.values().toArray(new C14990h[C14972f.this.f43485N.size()]);
                    }
                }
                C14972f.f43483g0.execute(new C14985b("OkHttp %s settings", C14972f.this.f43486O));
            }
            if (hVarArr != null && j != 0) {
                for (C14990h hVar : hVarArr) {
                    synchronized (hVar) {
                        hVar.mo46545a(j);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m66390a(C14999l lVar) {
            try {
                C14972f.this.f43490S.execute(new C14986c("OkHttp %s ACK Settings", new Object[]{C14972f.this.f43486O}, lVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* renamed from: a */
        public void mo46537a(boolean z, int i, int i2) {
            if (z) {
                synchronized (C14972f.this) {
                    C14972f.this.f43493V = false;
                    C14972f.this.notifyAll();
                }
                return;
            }
            try {
                C14972f.this.f43490S.execute(new C14982i(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* renamed from: a */
        public void mo46536a(int i, C14963a aVar, C13896f fVar) {
            C14990h[] hVarArr;
            fVar.mo43985r();
            synchronized (C14972f.this) {
                hVarArr = (C14990h[]) C14972f.this.f43485N.values().toArray(new C14990h[C14972f.this.f43485N.size()]);
                C14972f.this.f43489R = true;
            }
            for (C14990h hVar : hVarArr) {
                if (hVar.mo46556e() > i && hVar.mo46559h()) {
                    hVar.mo46554c(C14963a.REFUSED_STREAM);
                    C14972f.this.mo46519f(hVar.mo46556e());
                }
            }
        }

        /* renamed from: a */
        public void mo46533a(int i, long j) {
            if (i == 0) {
                synchronized (C14972f.this) {
                    C14972f.this.f43495X += j;
                    C14972f.this.notifyAll();
                }
                return;
            }
            C14990h a = C14972f.this.mo46495a(i);
            if (a != null) {
                synchronized (a) {
                    a.mo46545a(j);
                }
            }
        }

        /* renamed from: a */
        public void mo46532a(int i, int i2, List<C14964b> list) {
            C14972f.this.mo46500a(i2, list);
        }
    }

    static {
        Class<C14972f> cls = C14972f.class;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C14910b.m66052a("OkHttp Http2Connection", true));
        f43483g0 = threadPoolExecutor;
    }

    C14972f(C14979g gVar) {
        C14979g gVar2 = gVar;
        this.f43492U = gVar2.f43531f;
        boolean z = gVar2.f43532g;
        this.f43498a = z;
        this.f43500b = gVar2.f43530e;
        this.f43488Q = z ? 1 : 2;
        if (gVar2.f43532g) {
            this.f43488Q += 2;
        }
        if (gVar2.f43532g) {
            this.f43496Y.mo46594a(7, 16777216);
        }
        this.f43486O = gVar2.f43527b;
        this.f43490S = new ScheduledThreadPoolExecutor(1, C14910b.m66052a(C14910b.m66045a("OkHttp %s Writer", this.f43486O), false));
        if (gVar2.f43533h != 0) {
            ScheduledExecutorService scheduledExecutorService = this.f43490S;
            C14982i iVar = new C14982i(false, 0, 0);
            int i = gVar2.f43533h;
            scheduledExecutorService.scheduleAtFixedRate(iVar, (long) i, (long) i, TimeUnit.MILLISECONDS);
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C14910b.m66052a(C14910b.m66045a("OkHttp %s Push Observer", this.f43486O), true));
        this.f43491T = threadPoolExecutor;
        this.f43497Z.mo46594a(7, 65535);
        this.f43497Z.mo46594a(5, 16384);
        this.f43495X = (long) this.f43497Z.mo46600c();
        this.f43501b0 = gVar2.f43526a;
        this.f43502c0 = new C14994i(gVar2.f43529d, this.f43498a);
        this.f43503d0 = new C14983j(new C14987g(gVar2.f43528c, this.f43498a));
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m66341F() {
        try {
            mo46507a(C14963a.PROTOCOL_ERROR, C14963a.PROTOCOL_ERROR);
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.http2.C14990h m66346c(int r11, java.util.List<okhttp3.internal.http2.C14964b> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.i r7 = r10.f43502c0
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0078 }
            int r0 = r10.f43488Q     // Catch:{ all -> 0x0075 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            okhttp3.internal.http2.a r0 = okhttp3.internal.http2.C14963a.REFUSED_STREAM     // Catch:{ all -> 0x0075 }
            r10.mo46506a(r0)     // Catch:{ all -> 0x0075 }
        L_0x0013:
            boolean r0 = r10.f43489R     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x006f
            int r8 = r10.f43488Q     // Catch:{ all -> 0x0075 }
            int r0 = r10.f43488Q     // Catch:{ all -> 0x0075 }
            int r0 = r0 + 2
            r10.f43488Q = r0     // Catch:{ all -> 0x0075 }
            okhttp3.internal.http2.h r9 = new okhttp3.internal.http2.h     // Catch:{ all -> 0x0075 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0075 }
            if (r13 == 0) goto L_0x003c
            long r0 = r10.f43495X     // Catch:{ all -> 0x0075 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003c
            long r0 = r9.f43559b     // Catch:{ all -> 0x0075 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r13 = 0
            goto L_0x003d
        L_0x003c:
            r13 = 1
        L_0x003d:
            boolean r0 = r9.mo46560i()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004c
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r0 = r10.f43485N     // Catch:{ all -> 0x0075 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0075 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0075 }
        L_0x004c:
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            if (r11 != 0) goto L_0x0055
            okhttp3.internal.http2.i r0 = r10.f43502c0     // Catch:{ all -> 0x0078 }
            r0.mo46578a(r6, r8, r11, r12)     // Catch:{ all -> 0x0078 }
            goto L_0x005e
        L_0x0055:
            boolean r0 = r10.f43498a     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0067
            okhttp3.internal.http2.i r0 = r10.f43502c0     // Catch:{ all -> 0x0078 }
            r0.mo46571a(r11, r8, r12)     // Catch:{ all -> 0x0078 }
        L_0x005e:
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            if (r13 == 0) goto L_0x0066
            okhttp3.internal.http2.i r11 = r10.f43502c0
            r11.flush()
        L_0x0066:
            return r9
        L_0x0067:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0078 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0078 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x006f:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0075 }
            r11.<init>()     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C14972f.m66346c(int, java.util.List, boolean):okhttp3.internal.http2.h");
    }

    public void close() throws IOException {
        mo46507a(C14963a.NO_ERROR, C14963a.CANCEL);
    }

    /* renamed from: d */
    public C13799a0 mo46515d() {
        return C13799a0.HTTP_2;
    }

    /* renamed from: e */
    public synchronized boolean mo46516e() {
        return this.f43489R;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo46517e(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public synchronized C14990h mo46519f(int i) {
        C14990h hVar;
        hVar = (C14990h) this.f43485N.remove(Integer.valueOf(i));
        notifyAll();
        return hVar;
    }

    public void flush() throws IOException {
        this.f43502c0.flush();
    }

    /* renamed from: g */
    public synchronized int mo46521g() {
        return this.f43485N.size();
    }

    /* renamed from: h */
    public void mo46522h() throws IOException {
        mo46509a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo46523i() throws InterruptedException {
        mo46510a(false, 1330343787, -257978967);
        mo46497a();
    }

    /* renamed from: b */
    public C14990h mo46511b(int i, List<C14964b> list, boolean z) throws IOException {
        if (!this.f43498a) {
            return m66346c(i, list, z);
        }
        throw new IllegalStateException("Client cannot push requests.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized C14990h mo46495a(int i) {
        return (C14990h) this.f43485N.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo46505a(long j) {
        this.f43494W += j;
        if (this.f43494W >= ((long) (this.f43496Y.mo46600c() / 2))) {
            mo46498a(0, this.f43494W);
            this.f43494W = 0;
        }
    }

    /* renamed from: f */
    public synchronized int mo46518f() {
        return this.f43497Z.mo46599b(Integer.MAX_VALUE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo46512b(int i, C14963a aVar) throws IOException {
        this.f43502c0.mo46574a(i, aVar);
    }

    /* renamed from: a */
    public C14990h mo46496a(List<C14964b> list, boolean z) throws IOException {
        return m66346c(0, list, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46504a(int i, boolean z, List<C14964b> list) throws IOException {
        this.f43502c0.mo46582b(z, i, list);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.f43495X), r8.f43502c0.mo46584d());
        r6 = (long) r3;
        r8.f43495X -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo46503a(int r9, boolean r10, p470h.C13887c r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            okhttp3.internal.http2.i r12 = r8.f43502c0
            r12.mo46579a(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0069
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f43495X     // Catch:{ InterruptedException -> 0x005a }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r3 = r8.f43485N     // Catch:{ InterruptedException -> 0x005a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005a }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x005a }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x005a }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005a }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005a }
            throw r9     // Catch:{ InterruptedException -> 0x005a }
        L_0x0030:
            long r3 = r8.f43495X     // Catch:{ all -> 0x0058 }
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0058 }
            int r4 = (int) r3     // Catch:{ all -> 0x0058 }
            okhttp3.internal.http2.i r3 = r8.f43502c0     // Catch:{ all -> 0x0058 }
            int r3 = r3.mo46584d()     // Catch:{ all -> 0x0058 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0058 }
            long r4 = r8.f43495X     // Catch:{ all -> 0x0058 }
            long r6 = (long) r3     // Catch:{ all -> 0x0058 }
            long r4 = r4 - r6
            r8.f43495X = r4     // Catch:{ all -> 0x0058 }
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            long r12 = r12 - r6
            okhttp3.internal.http2.i r4 = r8.f43502c0
            if (r10 == 0) goto L_0x0053
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            r4.mo46579a(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0058:
            r9 = move-exception
            goto L_0x0067
        L_0x005a:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0058 }
            r9.interrupt()     // Catch:{ all -> 0x0058 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0058 }
            r9.<init>()     // Catch:{ all -> 0x0058 }
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x0067:
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            throw r9
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C14972f.mo46503a(int, boolean, h.c, long):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo46513c(int i, C14963a aVar) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f43490S;
            C14973a aVar2 = new C14973a("OkHttp %s stream %d", new Object[]{this.f43486O, Integer.valueOf(i)}, i, aVar);
            scheduledExecutorService.execute(aVar2);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46498a(int i, long j) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f43490S;
            C14974b bVar = new C14974b("OkHttp Window Update %s stream %d", new Object[]{this.f43486O, Integer.valueOf(i)}, i, j);
            scheduledExecutorService.execute(bVar);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46510a(boolean z, int i, int i2) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.f43493V;
                this.f43493V = true;
            }
            if (z2) {
                m66341F();
                return;
            }
        }
        try {
            this.f43502c0.mo46577a(z, i, i2);
        } catch (IOException unused) {
            m66341F();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo46497a() throws InterruptedException {
        while (this.f43493V) {
            wait();
        }
    }

    /* renamed from: a */
    public void mo46506a(C14963a aVar) throws IOException {
        synchronized (this.f43502c0) {
            synchronized (this) {
                if (!this.f43489R) {
                    this.f43489R = true;
                    int i = this.f43487P;
                    this.f43502c0.mo46575a(i, aVar, C14910b.f43158a);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46507a(C14963a aVar, C14963a aVar2) throws IOException {
        C14990h[] hVarArr = null;
        try {
            mo46506a(aVar);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f43485N.isEmpty()) {
                hVarArr = (C14990h[]) this.f43485N.values().toArray(new C14990h[this.f43485N.size()]);
                this.f43485N.clear();
            }
        }
        if (hVarArr != null) {
            for (C14990h a : hVarArr) {
                try {
                    a.mo46549a(aVar2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f43502c0.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f43501b0.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.f43490S.shutdown();
        this.f43491T.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46509a(boolean z) throws IOException {
        if (z) {
            this.f43502c0.mo46568a();
            this.f43502c0.mo46581b(this.f43496Y);
            int c = this.f43496Y.mo46600c();
            if (c != 65535) {
                this.f43502c0.mo46572a(0, (long) (c - 65535));
            }
        }
        new Thread(this.f43503d0).start();
    }

    /* renamed from: a */
    public void mo46508a(C14999l lVar) throws IOException {
        synchronized (this.f43502c0) {
            synchronized (this) {
                if (!this.f43489R) {
                    this.f43496Y.mo46596a(lVar);
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            this.f43502c0.mo46581b(lVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3 = r8;
        r2 = new okhttp3.internal.http2.C14972f.C14975c(r3, "OkHttp %s Push Request[%s]", new java.lang.Object[]{r8.f43486O, java.lang.Integer.valueOf(r9)}, r9, r10);
        m66342a((okhttp3.internal.C14909a) r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo46500a(int r9, java.util.List<okhttp3.internal.http2.C14964b> r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set<java.lang.Integer> r0 = r8.f43504e0     // Catch:{ all -> 0x003c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x003c }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0014
            okhttp3.internal.http2.a r10 = okhttp3.internal.http2.C14963a.PROTOCOL_ERROR     // Catch:{ all -> 0x003c }
            r8.mo46513c(r9, r10)     // Catch:{ all -> 0x003c }
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            return
        L_0x0014:
            java.util.Set<java.lang.Integer> r0 = r8.f43504e0     // Catch:{ all -> 0x003c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x003c }
            r0.add(r1)     // Catch:{ all -> 0x003c }
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            okhttp3.internal.http2.f$c r0 = new okhttp3.internal.http2.f$c     // Catch:{ RejectedExecutionException -> 0x003b }
            java.lang.String r4 = "OkHttp %s Push Request[%s]"
            r1 = 2
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ RejectedExecutionException -> 0x003b }
            r1 = 0
            java.lang.String r2 = r8.f43486O     // Catch:{ RejectedExecutionException -> 0x003b }
            r5[r1] = r2     // Catch:{ RejectedExecutionException -> 0x003b }
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ RejectedExecutionException -> 0x003b }
            r5[r1] = r2     // Catch:{ RejectedExecutionException -> 0x003b }
            r2 = r0
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5, r6, r7)     // Catch:{ RejectedExecutionException -> 0x003b }
            r8.m66342a(r0)     // Catch:{ RejectedExecutionException -> 0x003b }
        L_0x003b:
            return
        L_0x003c:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C14972f.mo46500a(int, java.util.List):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46501a(int i, List<C14964b> list, boolean z) {
        try {
            C14976d dVar = new C14976d("OkHttp %s Push Headers[%s]", new Object[]{this.f43486O, Integer.valueOf(i)}, i, list, z);
            m66342a((C14909a) dVar);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46499a(int i, C13894e eVar, int i2, boolean z) throws IOException {
        C13887c cVar = new C13887c();
        long j = (long) i2;
        eVar.mo43899k(j);
        eVar.read(cVar, j);
        if (cVar.size() == j) {
            C14977e eVar2 = new C14977e("OkHttp %s Push Data[%s]", new Object[]{this.f43486O, Integer.valueOf(i)}, i, cVar, i2, z);
            m66342a((C14909a) eVar2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.size());
        sb.append(" != ");
        sb.append(i2);
        throw new IOException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46502a(int i, C14963a aVar) {
        C14978f fVar = new C14978f("OkHttp %s Push Reset[%s]", new Object[]{this.f43486O, Integer.valueOf(i)}, i, aVar);
        m66342a((C14909a) fVar);
    }

    /* renamed from: a */
    private synchronized void m66342a(C14909a aVar) {
        if (!mo46516e()) {
            this.f43491T.execute(aVar);
        }
    }
}
