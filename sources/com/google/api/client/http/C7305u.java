package com.google.api.client.http;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6372e0;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6389k0;

/* renamed from: com.google.api.client.http.u */
/* compiled from: HttpRequest */
public final class C7305u {

    /* renamed from: A */
    public static final int f20674A = 10;

    /* renamed from: y */
    public static final String f20675y = "1.23.0";

    /* renamed from: z */
    public static final String f20676z = "Google-HTTP-Java-Client/1.23.0 (gzip)";

    /* renamed from: a */
    private C7298p f20677a;

    /* renamed from: b */
    private C7299q f20678b = new C7299q();

    /* renamed from: c */
    private C7299q f20679c = new C7299q();

    /* renamed from: d */
    private int f20680d = 10;

    /* renamed from: e */
    private int f20681e = 16384;

    /* renamed from: f */
    private boolean f20682f = true;

    /* renamed from: g */
    private boolean f20683g = true;

    /* renamed from: h */
    private C7295m f20684h;

    /* renamed from: i */
    private final C7253a0 f20685i;

    /* renamed from: j */
    private String f20686j;

    /* renamed from: k */
    private C7274j f20687k;

    /* renamed from: l */
    private int f20688l = 20000;

    /* renamed from: m */
    private int f20689m = 20000;

    /* renamed from: n */
    private C7255b0 f20690n;
    @C2766f

    /* renamed from: o */
    private C7302r f20691o;

    /* renamed from: p */
    private C7310y f20692p;

    /* renamed from: q */
    private C6372e0 f20693q;

    /* renamed from: r */
    private C7296n f20694r;
    @C2766f
    @Deprecated

    /* renamed from: s */
    private C7256c f20695s;

    /* renamed from: t */
    private boolean f20696t = true;

    /* renamed from: u */
    private boolean f20697u = true;
    @C2766f
    @Deprecated

    /* renamed from: v */
    private boolean f20698v = false;

    /* renamed from: w */
    private boolean f20699w;

    /* renamed from: x */
    private C6389k0 f20700x = C6389k0.f17813a;

    /* renamed from: com.google.api.client.http.u$a */
    /* compiled from: HttpRequest */
    class C7306a implements Callable<C7309x> {
        C7306a() {
        }

        public C7309x call() throws Exception {
            return C7305u.this.mo29092a();
        }
    }

    C7305u(C7253a0 a0Var, String str) {
        this.f20685i = a0Var;
        mo29090a(str);
    }

    /* renamed from: a */
    public C7305u mo29090a(String str) {
        C6381h0.m29666a(str == null || C7303s.m35306f(str));
        this.f20686j = str;
        return this;
    }

    /* renamed from: b */
    public C7305u mo29095b(int i) {
        C6381h0.m29667a(i >= 0, (Object) "The content logging limit must be non-negative.");
        this.f20681e = i;
        return this;
    }

    @C2766f
    @Deprecated
    /* renamed from: c */
    public C7256c mo29099c() {
        return this.f20695s;
    }

    /* renamed from: d */
    public int mo29102d() {
        return this.f20688l;
    }

    /* renamed from: e */
    public C7295m mo29105e() {
        return this.f20684h;
    }

    /* renamed from: f */
    public int mo29107f() {
        return this.f20681e;
    }

    /* renamed from: g */
    public C7296n mo29109g() {
        return this.f20694r;
    }

    /* renamed from: h */
    public boolean mo29110h() {
        return this.f20696t;
    }

    /* renamed from: i */
    public C7299q mo29111i() {
        return this.f20678b;
    }

    @C2766f
    /* renamed from: j */
    public C7302r mo29112j() {
        return this.f20691o;
    }

    /* renamed from: k */
    public C7298p mo29113k() {
        return this.f20677a;
    }

    /* renamed from: l */
    public int mo29114l() {
        return this.f20680d;
    }

    /* renamed from: m */
    public final C6372e0 mo29115m() {
        return this.f20693q;
    }

    /* renamed from: n */
    public int mo29116n() {
        return this.f20689m;
    }

    /* renamed from: o */
    public String mo29117o() {
        return this.f20686j;
    }

    /* renamed from: p */
    public C7299q mo29118p() {
        return this.f20679c;
    }

    /* renamed from: q */
    public C7310y mo29119q() {
        return this.f20692p;
    }

    @C2766f
    @Deprecated
    /* renamed from: r */
    public boolean mo29120r() {
        return this.f20698v;
    }

    /* renamed from: s */
    public C6389k0 mo29121s() {
        return this.f20700x;
    }

    /* renamed from: t */
    public boolean mo29122t() {
        return this.f20699w;
    }

    /* renamed from: u */
    public boolean mo29123u() {
        return this.f20697u;
    }

    /* renamed from: v */
    public C7253a0 mo29124v() {
        return this.f20685i;
    }

    /* renamed from: w */
    public C7255b0 mo29125w() {
        return this.f20690n;
    }

    /* renamed from: x */
    public C7274j mo29126x() {
        return this.f20687k;
    }

    /* renamed from: y */
    public boolean mo29127y() {
        return this.f20683g;
    }

    /* renamed from: z */
    public boolean mo29128z() {
        return this.f20682f;
    }

    /* renamed from: c */
    public C7305u mo29101c(boolean z) {
        this.f20682f = z;
        return this;
    }

    /* renamed from: d */
    public C7305u mo29103d(int i) {
        C6381h0.m29666a(i >= 0);
        this.f20689m = i;
        return this;
    }

    /* renamed from: e */
    public C7305u mo29106e(boolean z) {
        this.f20699w = z;
        return this;
    }

    /* renamed from: f */
    public C7305u mo29108f(boolean z) {
        this.f20697u = z;
        return this;
    }

    /* renamed from: a */
    public C7305u mo29083a(C7274j jVar) {
        this.f20687k = (C7274j) C6381h0.m29663a(jVar);
        return this;
    }

    /* renamed from: b */
    public C7305u mo29096b(C7299q qVar) {
        this.f20679c = (C7299q) C6381h0.m29663a(qVar);
        return this;
    }

    /* renamed from: c */
    public C7305u mo29100c(int i) {
        C6381h0.m29666a(i >= 0);
        this.f20680d = i;
        return this;
    }

    /* renamed from: a */
    public C7305u mo29084a(C7295m mVar) {
        this.f20684h = mVar;
        return this;
    }

    /* renamed from: b */
    public C7305u mo29097b(boolean z) {
        this.f20696t = z;
        return this;
    }

    @C2766f
    @Deprecated
    /* renamed from: d */
    public C7305u mo29104d(boolean z) {
        this.f20698v = z;
        return this;
    }

    /* renamed from: a */
    public C7305u mo29085a(C7296n nVar) {
        this.f20694r = nVar;
        return this;
    }

    @C2766f
    /* renamed from: b */
    public Future<C7309x> mo29098b() {
        return mo29093a((Executor) Executors.newSingleThreadExecutor());
    }

    @C2766f
    @Deprecated
    /* renamed from: a */
    public C7305u mo29082a(C7256c cVar) {
        this.f20695s = cVar;
        return this;
    }

    /* renamed from: a */
    public C7305u mo29091a(boolean z) {
        this.f20683g = z;
        return this;
    }

    /* renamed from: a */
    public C7305u mo29078a(int i) {
        C6381h0.m29666a(i >= 0);
        this.f20688l = i;
        return this;
    }

    /* renamed from: a */
    public C7305u mo29087a(C7299q qVar) {
        this.f20678b = (C7299q) C6381h0.m29663a(qVar);
        return this;
    }

    /* renamed from: a */
    public C7305u mo29086a(C7298p pVar) {
        this.f20677a = pVar;
        return this;
    }

    /* renamed from: a */
    public C7305u mo29081a(C7255b0 b0Var) {
        this.f20690n = b0Var;
        return this;
    }

    @C2766f
    /* renamed from: a */
    public C7305u mo29088a(C7302r rVar) {
        this.f20691o = rVar;
        return this;
    }

    /* renamed from: a */
    public C7305u mo29089a(C7310y yVar) {
        this.f20692p = yVar;
        return this;
    }

    /* renamed from: a */
    public C7305u mo29079a(C6372e0 e0Var) {
        this.f20693q = e0Var;
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v7, types: [c.d.b.a.g.m0] */
    /* JADX WARNING: type inference failed for: r2v8, types: [c.d.b.a.g.m0] */
    /* JADX WARNING: type inference failed for: r3v11, types: [com.google.api.client.http.o, c.d.b.a.g.m0] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r3v15, types: [c.d.b.a.g.a0] */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0271 A[SYNTHETIC, Splitter:B:116:0x0271] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02f2 A[LOOP:0: B:8:0x0022->B:168:0x02f2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02d1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0206  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.api.client.http.C7309x mo29092a() throws java.io.IOException {
        /*
            r25 = this;
            r1 = r25
            int r0 = r1.f20680d
            r3 = 1
            if (r0 < 0) goto L_0x0009
            r0 = 1
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            p076c.p112d.p134b.p135a.p143g.C6381h0.m29666a(r0)
            int r0 = r1.f20680d
            com.google.api.client.http.c r4 = r1.f20695s
            if (r4 == 0) goto L_0x0016
            r4.reset()
        L_0x0016:
            java.lang.String r4 = r1.f20686j
            p076c.p112d.p134b.p135a.p143g.C6381h0.m29663a(r4)
            com.google.api.client.http.j r4 = r1.f20687k
            p076c.p112d.p134b.p135a.p143g.C6381h0.m29663a(r4)
            r5 = r0
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.mo29156m()
        L_0x0027:
            com.google.api.client.http.p r0 = r1.f20677a
            if (r0 == 0) goto L_0x002e
            r0.mo25080a(r1)
        L_0x002e:
            com.google.api.client.http.j r0 = r1.f20687k
            java.lang.String r0 = r0.mo28930d()
            com.google.api.client.http.a0 r6 = r1.f20685i
            java.lang.String r7 = r1.f20686j
            com.google.api.client.http.d0 r6 = r6.mo25360a(r7, r0)
            java.util.logging.Logger r7 = com.google.api.client.http.C7253a0.f20539a
            boolean r8 = r1.f20682f
            if (r8 == 0) goto L_0x004c
            java.util.logging.Level r8 = java.util.logging.Level.CONFIG
            boolean r8 = r7.isLoggable(r8)
            if (r8 == 0) goto L_0x004c
            r8 = 1
            goto L_0x004d
        L_0x004c:
            r8 = 0
        L_0x004d:
            if (r8 == 0) goto L_0x0090
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "-------------- REQUEST  --------------"
            r9.append(r10)
            java.lang.String r10 = p076c.p112d.p134b.p135a.p143g.C6399n0.f17828a
            r9.append(r10)
            java.lang.String r10 = r1.f20686j
            r9.append(r10)
            r10 = 32
            r9.append(r10)
            r9.append(r0)
            java.lang.String r10 = p076c.p112d.p134b.p135a.p143g.C6399n0.f17828a
            r9.append(r10)
            boolean r10 = r1.f20683g
            if (r10 == 0) goto L_0x0091
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "curl -v --compressed"
            r10.<init>(r11)
            java.lang.String r11 = r1.f20686j
            java.lang.String r12 = "GET"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0092
            java.lang.String r11 = " -X "
            r10.append(r11)
            java.lang.String r11 = r1.f20686j
            r10.append(r11)
            goto L_0x0092
        L_0x0090:
            r9 = 0
        L_0x0091:
            r10 = 0
        L_0x0092:
            com.google.api.client.http.q r11 = r1.f20678b
            java.lang.String r11 = r11.mo29005H()
            boolean r12 = r1.f20699w
            if (r12 != 0) goto L_0x00d3
            java.lang.String r12 = "Google-HTTP-Java-Client/1.23.0 (gzip)"
            if (r11 != 0) goto L_0x00a6
            com.google.api.client.http.q r13 = r1.f20678b
            r13.mo29059z(r12)
            goto L_0x00d3
        L_0x00a6:
            com.google.api.client.http.q r13 = r1.f20678b
            java.lang.String r14 = java.lang.String.valueOf(r11)
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r16 = r14.length()
            int r16 = r16 + 1
            int r17 = r12.length()
            int r2 = r16 + r17
            r15.<init>(r2)
            r15.append(r14)
            java.lang.String r2 = " "
            r15.append(r2)
            r15.append(r12)
            java.lang.String r2 = r15.toString()
            r13.mo29059z(r2)
        L_0x00d3:
            com.google.api.client.http.q r2 = r1.f20678b
            com.google.api.client.http.C7299q.m35230a(r2, r9, r10, r7, r6)
            boolean r2 = r1.f20699w
            if (r2 != 0) goto L_0x00e1
            com.google.api.client.http.q r2 = r1.f20678b
            r2.mo29059z(r11)
        L_0x00e1:
            com.google.api.client.http.m r2 = r1.f20684h
            if (r2 == 0) goto L_0x00ee
            boolean r11 = r2.mo25633a()
            if (r11 == 0) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r11 = 0
            goto L_0x00ef
        L_0x00ee:
            r11 = 1
        L_0x00ef:
            java.lang.String r14 = "'"
            if (r2 == 0) goto L_0x0200
            com.google.api.client.http.m r15 = r1.f20684h
            java.lang.String r15 = r15.getType()
            if (r8 == 0) goto L_0x0107
            c.d.b.a.g.a0 r3 = new c.d.b.a.g.a0
            java.util.logging.Logger r4 = com.google.api.client.http.C7253a0.f20539a
            java.util.logging.Level r12 = java.util.logging.Level.CONFIG
            int r13 = r1.f20681e
            r3.<init>(r2, r4, r12, r13)
            r2 = r3
        L_0x0107:
            com.google.api.client.http.n r3 = r1.f20694r
            if (r3 != 0) goto L_0x0113
            com.google.api.client.http.m r3 = r1.f20684h
            long r3 = r3.mo25634b()
            r12 = 0
            goto L_0x012d
        L_0x0113:
            java.lang.String r4 = r3.getName()
            com.google.api.client.http.o r3 = new com.google.api.client.http.o
            com.google.api.client.http.n r12 = r1.f20694r
            r3.<init>(r2, r12)
            if (r11 == 0) goto L_0x0125
            long r12 = p076c.p112d.p134b.p135a.p143g.C6423t.m29814a(r3)
            goto L_0x0127
        L_0x0125:
            r12 = -1
        L_0x0127:
            r2 = r3
            r23 = r12
            r12 = r4
            r3 = r23
        L_0x012d:
            if (r8 == 0) goto L_0x01e8
            java.lang.String r13 = " -H '"
            if (r15 == 0) goto L_0x017c
            java.lang.String r1 = "Content-Type: "
            r18 = r5
            java.lang.String r5 = java.lang.String.valueOf(r15)
            int r19 = r5.length()
            if (r19 == 0) goto L_0x0146
            java.lang.String r1 = r1.concat(r5)
            goto L_0x014c
        L_0x0146:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
            r1 = r5
        L_0x014c:
            r9.append(r1)
            java.lang.String r5 = p076c.p112d.p134b.p135a.p143g.C6399n0.f17828a
            r9.append(r5)
            if (r10 == 0) goto L_0x017e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r19 = r1.length()
            r20 = r11
            int r11 = r19 + 6
            r5.<init>(r11)
            r5.append(r13)
            r5.append(r1)
            r5.append(r14)
            java.lang.String r1 = r5.toString()
            r10.append(r1)
            goto L_0x0180
        L_0x017c:
            r18 = r5
        L_0x017e:
            r20 = r11
        L_0x0180:
            if (r12 == 0) goto L_0x01c6
            java.lang.String r1 = "Content-Encoding: "
            java.lang.String r5 = java.lang.String.valueOf(r12)
            int r11 = r5.length()
            if (r11 == 0) goto L_0x0193
            java.lang.String r1 = r1.concat(r5)
            goto L_0x0199
        L_0x0193:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
            r1 = r5
        L_0x0199:
            r9.append(r1)
            java.lang.String r5 = p076c.p112d.p134b.p135a.p143g.C6399n0.f17828a
            r9.append(r5)
            if (r10 == 0) goto L_0x01c6
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r11 = r1.length()
            int r11 = r11 + 6
            r5.<init>(r11)
            r5.append(r13)
            r5.append(r1)
            r5.append(r14)
            java.lang.String r1 = r5.toString()
            r10.append(r1)
        L_0x01c6:
            r21 = 0
            int r1 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r1 < 0) goto L_0x01ec
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r5 = 36
            r1.<init>(r5)
            java.lang.String r5 = "Content-Length: "
            r1.append(r5)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.String r1 = p076c.p112d.p134b.p135a.p143g.C6399n0.f17828a
            r9.append(r1)
            goto L_0x01ec
        L_0x01e8:
            r18 = r5
            r20 = r11
        L_0x01ec:
            if (r10 == 0) goto L_0x01f3
            java.lang.String r1 = " -d '@-'"
            r10.append(r1)
        L_0x01f3:
            r6.mo28877b(r15)
            r6.mo28875a(r12)
            r6.mo28873a(r3)
            r6.mo28874a(r2)
            goto L_0x0204
        L_0x0200:
            r18 = r5
            r20 = r11
        L_0x0204:
            if (r8 == 0) goto L_0x022e
            java.lang.String r1 = r9.toString()
            r7.config(r1)
            if (r10 == 0) goto L_0x022e
            java.lang.String r1 = " -- '"
            r10.append(r1)
            java.lang.String r1 = "'\"'\"'"
            java.lang.String r0 = r0.replaceAll(r14, r1)
            r10.append(r0)
            r10.append(r14)
            if (r2 == 0) goto L_0x0227
            java.lang.String r0 = " << $$$"
            r10.append(r0)
        L_0x0227:
            java.lang.String r0 = r10.toString()
            r7.config(r0)
        L_0x022e:
            if (r20 == 0) goto L_0x0234
            if (r18 <= 0) goto L_0x0234
            r2 = 1
            goto L_0x0235
        L_0x0234:
            r2 = 0
        L_0x0235:
            r1 = r25
            int r0 = r1.f20688l
            int r3 = r1.f20689m
            r6.mo28872a(r0, r3)
            com.google.api.client.http.e0 r3 = r6.mo25348a()     // Catch:{ IOException -> 0x0255 }
            com.google.api.client.http.x r0 = new com.google.api.client.http.x     // Catch:{ all -> 0x024a }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x024a }
            r3 = r0
            r4 = 0
            goto L_0x026f
        L_0x024a:
            r0 = move-exception
            java.io.InputStream r3 = r3.mo25351b()     // Catch:{ IOException -> 0x0255 }
            if (r3 == 0) goto L_0x0254
            r3.close()     // Catch:{ IOException -> 0x0255 }
        L_0x0254:
            throw r0     // Catch:{ IOException -> 0x0255 }
        L_0x0255:
            r0 = move-exception
            r4 = r0
            boolean r0 = r1.f20698v
            if (r0 != 0) goto L_0x0267
            com.google.api.client.http.r r0 = r1.f20691o
            if (r0 == 0) goto L_0x0266
            boolean r0 = r0.mo28836a(r1, r2)
            if (r0 == 0) goto L_0x0266
            goto L_0x0267
        L_0x0266:
            throw r4
        L_0x0267:
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            java.lang.String r3 = "exception thrown while executing request"
            r7.log(r0, r3, r4)
            r3 = 0
        L_0x026f:
            if (r3 == 0) goto L_0x02c7
            boolean r0 = r3.mo29158o()     // Catch:{ all -> 0x02c0 }
            if (r0 != 0) goto L_0x02c7
            com.google.api.client.http.b0 r0 = r1.f20690n     // Catch:{ all -> 0x02c0 }
            if (r0 == 0) goto L_0x0282
            com.google.api.client.http.b0 r0 = r1.f20690n     // Catch:{ all -> 0x02c0 }
            boolean r0 = r0.mo25648a(r1, r3, r2)     // Catch:{ all -> 0x02c0 }
            goto L_0x0283
        L_0x0282:
            r0 = 0
        L_0x0283:
            if (r0 != 0) goto L_0x02b9
            int r5 = r3.mo29153j()     // Catch:{ all -> 0x02c0 }
            com.google.api.client.http.q r6 = r3.mo29150g()     // Catch:{ all -> 0x02c0 }
            boolean r5 = r1.mo29094a(r5, r6)     // Catch:{ all -> 0x02c0 }
            if (r5 == 0) goto L_0x0295
        L_0x0293:
            r0 = 1
            goto L_0x02b9
        L_0x0295:
            if (r2 == 0) goto L_0x02b9
            com.google.api.client.http.c r5 = r1.f20695s     // Catch:{ all -> 0x02c0 }
            if (r5 == 0) goto L_0x02b9
            com.google.api.client.http.c r5 = r1.f20695s     // Catch:{ all -> 0x02c0 }
            int r6 = r3.mo29153j()     // Catch:{ all -> 0x02c0 }
            boolean r5 = r5.mo28866a(r6)     // Catch:{ all -> 0x02c0 }
            if (r5 == 0) goto L_0x02b9
            com.google.api.client.http.c r5 = r1.f20695s     // Catch:{ all -> 0x02c0 }
            long r5 = r5.mo28865a()     // Catch:{ all -> 0x02c0 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x02b9
            c.d.b.a.g.k0 r0 = r1.f20700x     // Catch:{ InterruptedException -> 0x0293 }
            r0.mo25709a(r5)     // Catch:{ InterruptedException -> 0x0293 }
            goto L_0x0293
        L_0x02b9:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x02cd
            r3.mo29156m()     // Catch:{ all -> 0x02c0 }
            goto L_0x02cd
        L_0x02c0:
            r0 = move-exception
            if (r3 == 0) goto L_0x02c6
            r3.mo29143a()
        L_0x02c6:
            throw r0
        L_0x02c7:
            if (r3 != 0) goto L_0x02cb
            r0 = 1
            goto L_0x02cc
        L_0x02cb:
            r0 = 0
        L_0x02cc:
            r0 = r0 & r2
        L_0x02cd:
            int r5 = r18 + -1
            if (r0 != 0) goto L_0x02f2
            if (r3 == 0) goto L_0x02f1
            com.google.api.client.http.y r0 = r1.f20692p
            if (r0 == 0) goto L_0x02da
            r0.mo25471a(r3)
        L_0x02da:
            boolean r0 = r1.f20697u
            if (r0 == 0) goto L_0x02f0
            boolean r0 = r3.mo29158o()
            if (r0 == 0) goto L_0x02e5
            goto L_0x02f0
        L_0x02e5:
            com.google.api.client.http.HttpResponseException r0 = new com.google.api.client.http.HttpResponseException     // Catch:{ all -> 0x02eb }
            r0.<init>(r3)     // Catch:{ all -> 0x02eb }
            throw r0     // Catch:{ all -> 0x02eb }
        L_0x02eb:
            r0 = move-exception
            r3.mo29143a()
            throw r0
        L_0x02f0:
            return r3
        L_0x02f1:
            throw r4
        L_0x02f2:
            r0 = r3
            r3 = 1
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.http.C7305u.mo29092a():com.google.api.client.http.x");
    }

    @C2766f
    /* renamed from: a */
    public Future<C7309x> mo29093a(Executor executor) {
        FutureTask futureTask = new FutureTask(new C7306a());
        executor.execute(futureTask);
        return futureTask;
    }

    /* renamed from: a */
    public boolean mo29094a(int i, C7299q qVar) {
        String C = qVar.mo29001C();
        if (!mo29110h() || !C7311z.m35405a(i) || C == null) {
            return false;
        }
        mo29083a(new C7274j(this.f20687k.mo28942i(C)));
        if (i == 303) {
            mo29090a("GET");
            mo29084a((C7295m) null);
        }
        this.f20678b.mo29020f(null);
        this.f20678b.mo29039p(null);
        this.f20678b.mo29043r(null);
        this.f20678b.mo29041q(null);
        this.f20678b.mo29047t(null);
        this.f20678b.mo29045s(null);
        return true;
    }

    /* renamed from: a */
    public C7305u mo29080a(C6389k0 k0Var) {
        this.f20700x = (C6389k0) C6381h0.m29663a(k0Var);
        return this;
    }
}
