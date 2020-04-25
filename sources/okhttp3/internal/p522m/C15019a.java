package okhttp3.internal.p522m;

import com.fasterxml.jackson.core.p162w.C3868i;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.C14910b;
import okhttp3.internal.Internal;
import okhttp3.internal.connection.C14921f;
import okhttp3.internal.p522m.C15028c.C15029a;
import p076c.p112d.p148d.p279f.C6610c;
import p468g.C13799a0;
import p468g.C13813c0;
import p468g.C13813c0.C13814a;
import p468g.C13821e;
import p468g.C13823e0;
import p468g.C13825f;
import p468g.C13837i0;
import p468g.C13840j0;
import p468g.C13859r;
import p468g.C13876z;
import p470h.C13892d;
import p470h.C13894e;
import p470h.C13896f;

/* renamed from: okhttp3.internal.m.a */
/* compiled from: RealWebSocket */
public final class C15019a implements C13837i0, C15029a {

    /* renamed from: A */
    static final /* synthetic */ boolean f43654A = false;

    /* renamed from: x */
    private static final List<C13799a0> f43655x = Collections.singletonList(C13799a0.HTTP_1_1);

    /* renamed from: y */
    private static final long f43656y = 16777216;

    /* renamed from: z */
    private static final long f43657z = 60000;

    /* renamed from: a */
    private final C13813c0 f43658a;

    /* renamed from: b */
    final C13840j0 f43659b;

    /* renamed from: c */
    private final Random f43660c;

    /* renamed from: d */
    private final long f43661d;

    /* renamed from: e */
    private final String f43662e;

    /* renamed from: f */
    private C13821e f43663f;

    /* renamed from: g */
    private final Runnable f43664g;

    /* renamed from: h */
    private C15028c f43665h;

    /* renamed from: i */
    private C15030d f43666i;

    /* renamed from: j */
    private ScheduledExecutorService f43667j;

    /* renamed from: k */
    private C15026g f43668k;

    /* renamed from: l */
    private final ArrayDeque<C13896f> f43669l = new ArrayDeque<>();

    /* renamed from: m */
    private final ArrayDeque<Object> f43670m = new ArrayDeque<>();

    /* renamed from: n */
    private long f43671n;

    /* renamed from: o */
    private boolean f43672o;

    /* renamed from: p */
    private ScheduledFuture<?> f43673p;

    /* renamed from: q */
    private int f43674q = -1;

    /* renamed from: r */
    private String f43675r;

    /* renamed from: s */
    private boolean f43676s;

    /* renamed from: t */
    private int f43677t;

    /* renamed from: u */
    private int f43678u;

    /* renamed from: v */
    private int f43679v;

    /* renamed from: w */
    private boolean f43680w;

    /* renamed from: okhttp3.internal.m.a$a */
    /* compiled from: RealWebSocket */
    class C15020a implements Runnable {
        C15020a() {
        }

        public void run() {
            do {
                try {
                } catch (IOException e) {
                    C15019a.this.mo46656a((Exception) e, (C13823e0) null);
                    return;
                }
            } while (C15019a.this.mo46671h());
        }
    }

    /* renamed from: okhttp3.internal.m.a$b */
    /* compiled from: RealWebSocket */
    class C15021b implements C13825f {

        /* renamed from: a */
        final /* synthetic */ C13813c0 f43682a;

        C15021b(C13813c0 c0Var) {
            this.f43682a = c0Var;
        }

        public void onFailure(C13821e eVar, IOException iOException) {
            C15019a.this.mo46656a((Exception) iOException, (C13823e0) null);
        }

        public void onResponse(C13821e eVar, C13823e0 e0Var) {
            try {
                C15019a.this.mo46654a(e0Var);
                C14921f streamAllocation = Internal.instance.streamAllocation(eVar);
                streamAllocation.mo46405e();
                C15026g a = streamAllocation.mo46403c().mo46376a(streamAllocation);
                try {
                    C15019a.this.f43659b.mo43498a((C13837i0) C15019a.this, e0Var);
                    StringBuilder sb = new StringBuilder();
                    sb.append("OkHttp WebSocket ");
                    sb.append(this.f43682a.mo43359h().mo43660r());
                    C15019a.this.mo46657a(sb.toString(), a);
                    streamAllocation.mo46403c().mo43496d().setSoTimeout(0);
                    C15019a.this.mo46659b();
                } catch (Exception e) {
                    C15019a.this.mo46656a(e, (C13823e0) null);
                }
            } catch (ProtocolException e2) {
                C15019a.this.mo46656a((Exception) e2, e0Var);
                C14910b.m66055a((Closeable) e0Var);
            }
        }
    }

    /* renamed from: okhttp3.internal.m.a$c */
    /* compiled from: RealWebSocket */
    final class C15022c implements Runnable {
        C15022c() {
        }

        public void run() {
            C15019a.this.cancel();
        }
    }

    /* renamed from: okhttp3.internal.m.a$d */
    /* compiled from: RealWebSocket */
    static final class C15023d {

        /* renamed from: a */
        final int f43685a;

        /* renamed from: b */
        final C13896f f43686b;

        /* renamed from: c */
        final long f43687c;

        C15023d(int i, C13896f fVar, long j) {
            this.f43685a = i;
            this.f43686b = fVar;
            this.f43687c = j;
        }
    }

    /* renamed from: okhttp3.internal.m.a$e */
    /* compiled from: RealWebSocket */
    static final class C15024e {

        /* renamed from: a */
        final int f43688a;

        /* renamed from: b */
        final C13896f f43689b;

        C15024e(int i, C13896f fVar) {
            this.f43688a = i;
            this.f43689b = fVar;
        }
    }

    /* renamed from: okhttp3.internal.m.a$f */
    /* compiled from: RealWebSocket */
    private final class C15025f implements Runnable {
        C15025f() {
        }

        public void run() {
            C15019a.this.mo46672i();
        }
    }

    /* renamed from: okhttp3.internal.m.a$g */
    /* compiled from: RealWebSocket */
    public static abstract class C15026g implements Closeable {

        /* renamed from: N */
        public final C13892d f43691N;

        /* renamed from: a */
        public final boolean f43692a;

        /* renamed from: b */
        public final C13894e f43693b;

        public C15026g(boolean z, C13894e eVar, C13892d dVar) {
            this.f43692a = z;
            this.f43693b = eVar;
            this.f43691N = dVar;
        }
    }

    public C15019a(C13813c0 c0Var, C13840j0 j0Var, Random random, long j) {
        if ("GET".equals(c0Var.mo43356e())) {
            this.f43658a = c0Var;
            this.f43659b = j0Var;
            this.f43660c = random;
            this.f43661d = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.f43662e = C13896f.m59656e(bArr).mo43972e();
            this.f43664g = new C15020a();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Request must be GET: ");
        sb.append(c0Var.mo43356e());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: j */
    private void m66610j() {
        ScheduledExecutorService scheduledExecutorService = this.f43667j;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.f43664g);
        }
    }

    /* renamed from: a */
    public synchronized long mo43486a() {
        return this.f43671n;
    }

    /* renamed from: b */
    public void mo46659b() throws IOException {
        while (this.f43674q == -1) {
            this.f43665h.mo46676a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo46664c() throws IOException {
        boolean z = false;
        try {
            this.f43665h.mo46676a();
            if (this.f43674q == -1) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            mo46656a(e, (C13823e0) null);
            return false;
        }
    }

    public void cancel() {
        this.f43663f.cancel();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public synchronized int mo46665d() {
        return this.f43678u;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public synchronized int mo46667e() {
        return this.f43679v;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public synchronized int mo46669f() {
        return this.f43677t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo46670g() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.f43673p;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f43667j.shutdown();
        this.f43667j.awaitTermination(10, TimeUnit.SECONDS);
    }

    /* JADX INFO: used method not loaded: okhttp3.internal.m.d.a(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: okhttp3.internal.m.d.a(int, h.f):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r2 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.mo46681b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        if ((r5 instanceof okhttp3.internal.p522m.C15019a.C15024e) == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        r1 = ((okhttp3.internal.p522m.C15019a.C15024e) r5).f43689b;
        r0 = p470h.C13906p.m59738a(r0.mo46677a(((okhttp3.internal.p522m.C15019a.C15024e) r5).f43688a, (long) r1.mo43985r()));
        r0.mo43847a(r1);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r11.f43671n -= (long) r1.mo43985r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        if ((r5 instanceof okhttp3.internal.p522m.C15019a.C15023d) == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        r5 = (okhttp3.internal.p522m.C15019a.C15023d) r5;
        r0.mo46679a(r5.f43685a, r5.f43686b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0093, code lost:
        if (r4 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0095, code lost:
        r11.f43659b.mo43497a((p468g.C13837i0) r11, r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009a, code lost:
        okhttp3.internal.C14910b.m66055a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a4, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a6, code lost:
        okhttp3.internal.C14910b.m66055a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a9, code lost:
        throw r0;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo46671h() throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.f43676s     // Catch:{ all -> 0x00aa }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r11)     // Catch:{ all -> 0x00aa }
            return r1
        L_0x0008:
            okhttp3.internal.m.d r0 = r11.f43666i     // Catch:{ all -> 0x00aa }
            java.util.ArrayDeque<h.f> r2 = r11.f43669l     // Catch:{ all -> 0x00aa }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00aa }
            h.f r2 = (p470h.C13896f) r2     // Catch:{ all -> 0x00aa }
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x004c
            java.util.ArrayDeque<java.lang.Object> r5 = r11.f43670m     // Catch:{ all -> 0x00aa }
            java.lang.Object r5 = r5.poll()     // Catch:{ all -> 0x00aa }
            boolean r6 = r5 instanceof okhttp3.internal.p522m.C15019a.C15023d     // Catch:{ all -> 0x00aa }
            if (r6 == 0) goto L_0x0046
            int r1 = r11.f43674q     // Catch:{ all -> 0x00aa }
            java.lang.String r6 = r11.f43675r     // Catch:{ all -> 0x00aa }
            if (r1 == r3) goto L_0x0031
            okhttp3.internal.m.a$g r3 = r11.f43668k     // Catch:{ all -> 0x00aa }
            r11.f43668k = r4     // Catch:{ all -> 0x00aa }
            java.util.concurrent.ScheduledExecutorService r4 = r11.f43667j     // Catch:{ all -> 0x00aa }
            r4.shutdown()     // Catch:{ all -> 0x00aa }
            r4 = r3
            goto L_0x004f
        L_0x0031:
            java.util.concurrent.ScheduledExecutorService r3 = r11.f43667j     // Catch:{ all -> 0x00aa }
            okhttp3.internal.m.a$c r7 = new okhttp3.internal.m.a$c     // Catch:{ all -> 0x00aa }
            r7.<init>()     // Catch:{ all -> 0x00aa }
            r8 = r5
            okhttp3.internal.m.a$d r8 = (okhttp3.internal.p522m.C15019a.C15023d) r8     // Catch:{ all -> 0x00aa }
            long r8 = r8.f43687c     // Catch:{ all -> 0x00aa }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00aa }
            java.util.concurrent.ScheduledFuture r3 = r3.schedule(r7, r8, r10)     // Catch:{ all -> 0x00aa }
            r11.f43673p = r3     // Catch:{ all -> 0x00aa }
            goto L_0x004f
        L_0x0046:
            if (r5 != 0) goto L_0x004a
            monitor-exit(r11)     // Catch:{ all -> 0x00aa }
            return r1
        L_0x004a:
            r6 = r4
            goto L_0x004e
        L_0x004c:
            r5 = r4
            r6 = r5
        L_0x004e:
            r1 = -1
        L_0x004f:
            monitor-exit(r11)     // Catch:{ all -> 0x00aa }
            if (r2 == 0) goto L_0x0056
            r0.mo46681b(r2)     // Catch:{ all -> 0x00a5 }
            goto L_0x009a
        L_0x0056:
            boolean r2 = r5 instanceof okhttp3.internal.p522m.C15019a.C15024e     // Catch:{ all -> 0x00a5 }
            if (r2 == 0) goto L_0x0086
            r1 = r5
            okhttp3.internal.m.a$e r1 = (okhttp3.internal.p522m.C15019a.C15024e) r1     // Catch:{ all -> 0x00a5 }
            h.f r1 = r1.f43689b     // Catch:{ all -> 0x00a5 }
            okhttp3.internal.m.a$e r5 = (okhttp3.internal.p522m.C15019a.C15024e) r5     // Catch:{ all -> 0x00a5 }
            int r2 = r5.f43688a     // Catch:{ all -> 0x00a5 }
            int r3 = r1.mo43985r()     // Catch:{ all -> 0x00a5 }
            long r5 = (long) r3     // Catch:{ all -> 0x00a5 }
            h.z r0 = r0.mo46677a(r2, r5)     // Catch:{ all -> 0x00a5 }
            h.d r0 = p470h.C13906p.m59738a(r0)     // Catch:{ all -> 0x00a5 }
            r0.mo43847a(r1)     // Catch:{ all -> 0x00a5 }
            r0.close()     // Catch:{ all -> 0x00a5 }
            monitor-enter(r11)     // Catch:{ all -> 0x00a5 }
            long r2 = r11.f43671n     // Catch:{ all -> 0x0083 }
            int r0 = r1.mo43985r()     // Catch:{ all -> 0x0083 }
            long r0 = (long) r0     // Catch:{ all -> 0x0083 }
            long r2 = r2 - r0
            r11.f43671n = r2     // Catch:{ all -> 0x0083 }
            monitor-exit(r11)     // Catch:{ all -> 0x0083 }
            goto L_0x009a
        L_0x0083:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0083 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x0086:
            boolean r2 = r5 instanceof okhttp3.internal.p522m.C15019a.C15023d     // Catch:{ all -> 0x00a5 }
            if (r2 == 0) goto L_0x009f
            okhttp3.internal.m.a$d r5 = (okhttp3.internal.p522m.C15019a.C15023d) r5     // Catch:{ all -> 0x00a5 }
            int r2 = r5.f43685a     // Catch:{ all -> 0x00a5 }
            h.f r3 = r5.f43686b     // Catch:{ all -> 0x00a5 }
            r0.mo46679a(r2, r3)     // Catch:{ all -> 0x00a5 }
            if (r4 == 0) goto L_0x009a
            g.j0 r0 = r11.f43659b     // Catch:{ all -> 0x00a5 }
            r0.mo43497a(r11, r1, r6)     // Catch:{ all -> 0x00a5 }
        L_0x009a:
            r0 = 1
            okhttp3.internal.C14910b.m66055a(r4)
            return r0
        L_0x009f:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00a5 }
            r0.<init>()     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            okhttp3.internal.C14910b.m66055a(r4)
            throw r0
        L_0x00aa:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00aa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p522m.C15019a.mo46671h():boolean");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r1 == -1) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("sent ping but didn't receive pong within ");
        r2.append(r7.f43661d);
        r2.append("ms (after ");
        r2.append(r1 - 1);
        r2.append(" successful ping/pongs)");
        mo46656a((java.lang.Exception) new java.net.SocketTimeoutException(r2.toString()), (p468g.C13823e0) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.mo46680a(p470h.C13896f.f40352P);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        mo46656a((java.lang.Exception) r0, (p468g.C13823e0) null);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo46672i() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f43676s     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)     // Catch:{ all -> 0x0053 }
            return
        L_0x0007:
            okhttp3.internal.m.d r0 = r7.f43666i     // Catch:{ all -> 0x0053 }
            boolean r1 = r7.f43680w     // Catch:{ all -> 0x0053 }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            int r1 = r7.f43677t     // Catch:{ all -> 0x0053 }
            goto L_0x0012
        L_0x0011:
            r1 = -1
        L_0x0012:
            int r3 = r7.f43677t     // Catch:{ all -> 0x0053 }
            r4 = 1
            int r3 = r3 + r4
            r7.f43677t = r3     // Catch:{ all -> 0x0053 }
            r7.f43680w = r4     // Catch:{ all -> 0x0053 }
            monitor-exit(r7)     // Catch:{ all -> 0x0053 }
            r3 = 0
            if (r1 == r2) goto L_0x0048
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.append(r5)
            long r5 = r7.f43661d
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.mo46656a(r0, r3)
            return
        L_0x0048:
            h.f r1 = p470h.C13896f.f40352P     // Catch:{ IOException -> 0x004e }
            r0.mo46680a(r1)     // Catch:{ IOException -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r0 = move-exception
            r7.mo46656a(r0, r3)
        L_0x0052:
            return
        L_0x0053:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0053 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p522m.C15019a.mo46672i():void");
    }

    public C13813c0 request() {
        return this.f43658a;
    }

    /* renamed from: a */
    public void mo46655a(C13876z zVar) {
        C13876z a = zVar.mo43748s().mo43780a(C13859r.f40192a).mo43797b(f43655x).mo43791a();
        C13814a f = this.f43658a.mo43357f();
        String str = C6610c.f18385G;
        C13813c0 a2 = f.mo43375b(str, "websocket").mo43375b("Connection", str).mo43375b("Sec-WebSocket-Key", this.f43662e).mo43375b("Sec-WebSocket-Version", "13").mo43371a();
        this.f43663f = Internal.instance.newWebSocketCall(a, a2);
        this.f43663f.timeout().mo43827b();
        this.f43663f.mo43292a(new C15021b(a2));
    }

    /* renamed from: d */
    public synchronized void mo46666d(C13896f fVar) {
        this.f43679v++;
        this.f43680w = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public synchronized boolean mo46668e(C13896f fVar) {
        if (!this.f43676s) {
            if (!this.f43672o || !this.f43670m.isEmpty()) {
                this.f43669l.add(fVar);
                m66610j();
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo46662b(String str) throws IOException {
        this.f43659b.mo43500a((C13837i0) this, str);
    }

    /* renamed from: b */
    public void mo46661b(C13896f fVar) throws IOException {
        this.f43659b.mo43499a((C13837i0) this, fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo46663c(p470h.C13896f r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f43676s     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.f43672o     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            java.util.ArrayDeque<java.lang.Object> r0 = r1.f43670m     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            java.util.ArrayDeque<h.f> r0 = r1.f43669l     // Catch:{ all -> 0x0024 }
            r0.add(r2)     // Catch:{ all -> 0x0024 }
            r1.m66610j()     // Catch:{ all -> 0x0024 }
            int r2 = r1.f43678u     // Catch:{ all -> 0x0024 }
            int r2 = r2 + 1
            r1.f43678u = r2     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)
            return
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p522m.C15019a.mo46663c(h.f):void");
    }

    /* renamed from: b */
    public void mo46660b(int i, String str) {
        Closeable closeable;
        if (i != -1) {
            synchronized (this) {
                if (this.f43674q == -1) {
                    this.f43674q = i;
                    this.f43675r = str;
                    if (!this.f43672o || !this.f43670m.isEmpty()) {
                        closeable = null;
                    } else {
                        closeable = this.f43668k;
                        this.f43668k = null;
                        if (this.f43673p != null) {
                            this.f43673p.cancel(false);
                        }
                        this.f43667j.shutdown();
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                this.f43659b.mo43502b(this, i, str);
                if (closeable != null) {
                    this.f43659b.mo43497a((C13837i0) this, i, str);
                }
            } finally {
                C14910b.m66055a(closeable);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46654a(C13823e0 e0Var) throws ProtocolException {
        String str = "'";
        if (e0Var.mo43425g() == 101) {
            String b = e0Var.mo43419b("Connection");
            String str2 = C6610c.f18385G;
            if (str2.equalsIgnoreCase(b)) {
                String b2 = e0Var.mo43419b(str2);
                if ("websocket".equalsIgnoreCase(b2)) {
                    String b3 = e0Var.mo43419b("Sec-WebSocket-Accept");
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f43662e);
                    sb.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                    String e = C13896f.m59655e(sb.toString()).mo43982k().mo43972e();
                    if (!e.equals(b3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected 'Sec-WebSocket-Accept' header value '");
                        sb2.append(e);
                        sb2.append("' but was '");
                        sb2.append(b3);
                        sb2.append(str);
                        throw new ProtocolException(sb2.toString());
                    }
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Expected 'Upgrade' header value 'websocket' but was '");
                sb3.append(b2);
                sb3.append(str);
                throw new ProtocolException(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Expected 'Connection' header value 'Upgrade' but was '");
            sb4.append(b);
            sb4.append(str);
            throw new ProtocolException(sb4.toString());
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Expected HTTP 101 response but was '");
        sb5.append(e0Var.mo43425g());
        sb5.append(C3868i.f12248b);
        sb5.append(e0Var.mo43408G());
        sb5.append(str);
        throw new ProtocolException(sb5.toString());
    }

    /* renamed from: a */
    public void mo46657a(String str, C15026g gVar) throws IOException {
        synchronized (this) {
            this.f43668k = gVar;
            this.f43666i = new C15030d(gVar.f43692a, gVar.f43691N, this.f43660c);
            this.f43667j = new ScheduledThreadPoolExecutor(1, C14910b.m66052a(str, false));
            if (this.f43661d != 0) {
                this.f43667j.scheduleAtFixedRate(new C15025f(), this.f43661d, this.f43661d, TimeUnit.MILLISECONDS);
            }
            if (!this.f43670m.isEmpty()) {
                m66610j();
            }
        }
        this.f43665h = new C15028c(gVar.f43692a, gVar.f43693b, this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46653a(int i, TimeUnit timeUnit) throws InterruptedException {
        this.f43667j.awaitTermination((long) i, timeUnit);
    }

    /* renamed from: a */
    public boolean mo43489a(String str) {
        if (str != null) {
            return m66609a(C13896f.m59655e(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    /* renamed from: a */
    public boolean mo43488a(C13896f fVar) {
        if (fVar != null) {
            return m66609a(fVar, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m66609a(p470h.C13896f r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f43676s     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.f43672o     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.f43671n     // Catch:{ all -> 0x003e }
            int r0 = r7.mo43985r()     // Catch:{ all -> 0x003e }
            long r4 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.mo43487a(r7, r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.f43671n     // Catch:{ all -> 0x003e }
            int r2 = r7.mo43985r()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.f43671n = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.f43670m     // Catch:{ all -> 0x003e }
            okhttp3.internal.m.a$e r1 = new okhttp3.internal.m.a$e     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.m66610j()     // Catch:{ all -> 0x003e }
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x003c:
            monitor-exit(r6)
            return r1
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p522m.C15019a.m66609a(h.f, int):boolean");
    }

    /* renamed from: a */
    public boolean mo43487a(int i, String str) {
        return mo46658a(i, str, f43657z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized boolean mo46658a(int i, String str, long j) {
        C15027b.m66638b(i);
        C13896f fVar = null;
        if (str != null) {
            fVar = C13896f.m59655e(str);
            if (((long) fVar.mo43985r()) > 123) {
                StringBuilder sb = new StringBuilder();
                sb.append("reason.size() > 123: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (!this.f43676s) {
            if (!this.f43672o) {
                this.f43672o = true;
                this.f43670m.add(new C15023d(i, fVar, j));
                m66610j();
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.f43659b.mo43501a((p468g.C13837i0) r3, (java.lang.Throwable) r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        okhttp3.internal.C14910b.m66055a((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        throw r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo46656a(java.lang.Exception r4, @p201f.p202a.C5952h p468g.C13823e0 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f43676s     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0007:
            r0 = 1
            r3.f43676s = r0     // Catch:{ all -> 0x0031 }
            okhttp3.internal.m.a$g r0 = r3.f43668k     // Catch:{ all -> 0x0031 }
            r1 = 0
            r3.f43668k = r1     // Catch:{ all -> 0x0031 }
            java.util.concurrent.ScheduledFuture<?> r1 = r3.f43673p     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0019
            java.util.concurrent.ScheduledFuture<?> r1 = r3.f43673p     // Catch:{ all -> 0x0031 }
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x0031 }
        L_0x0019:
            java.util.concurrent.ScheduledExecutorService r1 = r3.f43667j     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0022
            java.util.concurrent.ScheduledExecutorService r1 = r3.f43667j     // Catch:{ all -> 0x0031 }
            r1.shutdown()     // Catch:{ all -> 0x0031 }
        L_0x0022:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            g.j0 r1 = r3.f43659b     // Catch:{ all -> 0x002c }
            r1.mo43501a(r3, r4, r5)     // Catch:{ all -> 0x002c }
            okhttp3.internal.C14910b.m66055a(r0)
            return
        L_0x002c:
            r4 = move-exception
            okhttp3.internal.C14910b.m66055a(r0)
            throw r4
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p522m.C15019a.mo46656a(java.lang.Exception, g.e0):void");
    }
}
