package okhttp3.internal.connection;

import com.google.api.client.http.C7304t;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.C14910b;
import okhttp3.internal.C14913c;
import okhttp3.internal.Internal;
import okhttp3.internal.http2.C14963a;
import okhttp3.internal.http2.C14970e;
import okhttp3.internal.http2.C14972f;
import okhttp3.internal.http2.C14972f.C14979g;
import okhttp3.internal.http2.C14972f.C14980h;
import okhttp3.internal.http2.C14990h;
import okhttp3.internal.p516g.C14944c;
import okhttp3.internal.p516g.C14947e;
import okhttp3.internal.p517h.C14955a;
import okhttp3.internal.p519j.C15011f;
import okhttp3.internal.p521l.C15017e;
import okhttp3.internal.p522m.C15019a.C15026g;
import org.apache.http.C15470v;
import org.apache.http.p549j0.C15430e;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Close;
import p201f.p202a.C5952h;
import p468g.C13798a;
import p468g.C13799a0;
import p468g.C13813c0;
import p468g.C13813c0.C13814a;
import p468g.C13817d0;
import p468g.C13821e;
import p468g.C13823e0;
import p468g.C13823e0.C13824a;
import p468g.C13832g0;
import p468g.C13839j;
import p468g.C13841k;
import p468g.C13859r;
import p468g.C13865t;
import p468g.C13868v;
import p468g.C13870w.C13871a;
import p468g.C13876z;
import p470h.C13883a0;
import p470h.C13892d;
import p470h.C13894e;
import p470h.C13906p;

/* renamed from: okhttp3.internal.connection.c */
/* compiled from: RealConnection */
public final class C14916c extends C14980h implements C13839j {

    /* renamed from: p */
    private static final String f43186p = "throw with null exception";

    /* renamed from: q */
    private static final int f43187q = 21;

    /* renamed from: b */
    private final C13841k f43188b;

    /* renamed from: c */
    private final C13832g0 f43189c;

    /* renamed from: d */
    private Socket f43190d;

    /* renamed from: e */
    private Socket f43191e;

    /* renamed from: f */
    private C13865t f43192f;

    /* renamed from: g */
    private C13799a0 f43193g;

    /* renamed from: h */
    private C14972f f43194h;

    /* renamed from: i */
    private C13894e f43195i;

    /* renamed from: j */
    private C13892d f43196j;

    /* renamed from: k */
    public boolean f43197k;

    /* renamed from: l */
    public int f43198l;

    /* renamed from: m */
    public int f43199m = 1;

    /* renamed from: n */
    public final List<Reference<C14921f>> f43200n = new ArrayList();

    /* renamed from: o */
    public long f43201o = Long.MAX_VALUE;

    /* renamed from: okhttp3.internal.connection.c$a */
    /* compiled from: RealConnection */
    class C14917a extends C15026g {

        /* renamed from: O */
        final /* synthetic */ C14921f f43202O;

        C14917a(boolean z, C13894e eVar, C13892d dVar, C14921f fVar) {
            this.f43202O = fVar;
            super(z, eVar, dVar);
        }

        public void close() throws IOException {
            C14921f fVar = this.f43202O;
            fVar.mo46401a(true, fVar.mo46402b(), -1, null);
        }
    }

    public C14916c(C13841k kVar, C13832g0 g0Var) {
        this.f43188b = kVar;
        this.f43189c = g0Var;
    }

    /* renamed from: a */
    public static C14916c m66084a(C13841k kVar, C13832g0 g0Var, Socket socket, long j) {
        C14916c cVar = new C14916c(kVar, g0Var);
        cVar.f43191e = socket;
        cVar.f43201o = j;
        return cVar;
    }

    /* renamed from: g */
    private C13813c0 m66090g() throws IOException {
        C13813c0 a = new C13814a().mo43364a(this.f43189c.mo43466a().mo43286k()).mo43368a(C7304t.f20665a, (C13817d0) null).mo43375b("Host", C14910b.m66043a(this.f43189c.mo43466a().mo43286k(), true)).mo43375b("Proxy-Connection", C15430e.f44590q).mo43375b("User-Agent", C14913c.m66075a()).mo43371a();
        C13813c0 a2 = this.f43189c.mo43466a().mo43281g().mo43289a(this.f43189c, new C13824a().mo43432a(a).mo43431a(C13799a0.HTTP_1_1).mo43429a((int) C15470v.f44685z).mo43437a("Preemptive Authenticate").mo43434a(C14910b.f43160c).mo43440b(-1).mo43430a(-1).mo43443b("Proxy-Authenticate", "OkHttp-Preemptive").mo43439a());
        return a2 != null ? a2 : a;
    }

    /* renamed from: b */
    public C13832g0 mo43494b() {
        return this.f43189c;
    }

    /* renamed from: c */
    public C13865t mo43495c() {
        return this.f43192f;
    }

    /* renamed from: d */
    public Socket mo43496d() {
        return this.f43191e;
    }

    /* renamed from: e */
    public void mo46383e() {
        C14910b.m66058a(this.f43190d);
    }

    /* renamed from: f */
    public boolean mo46384f() {
        return this.f43194h != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f43189c.mo43466a().mo43286k().mo43649h());
        sb.append(":");
        sb.append(this.f43189c.mo43466a().mo43286k().mo43656n());
        sb.append(", proxy=");
        sb.append(this.f43189c.mo43467b());
        sb.append(" hostAddress=");
        sb.append(this.f43189c.mo43469d());
        sb.append(" cipherSuite=");
        C13865t tVar = this.f43192f;
        sb.append(tVar != null ? tVar.mo43602a() : "none");
        sb.append(" protocol=");
        sb.append(this.f43193g);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0143 A[EDGE_INSN: B:63:0x0143->B:56:0x0143 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo46377a(int r17, int r18, int r19, int r20, boolean r21, p468g.C13821e r22, p468g.C13859r r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            g.a0 r0 = r7.f43193g
            if (r0 != 0) goto L_0x0151
            g.g0 r0 = r7.f43189c
            g.a r0 = r0.mo43466a()
            java.util.List r0 = r0.mo43275b()
            okhttp3.internal.connection.b r10 = new okhttp3.internal.connection.b
            r10.<init>(r0)
            g.g0 r1 = r7.f43189c
            g.a r1 = r1.mo43466a()
            javax.net.ssl.SSLSocketFactory r1 = r1.mo43285j()
            if (r1 != 0) goto L_0x0074
            g.l r1 = p468g.C13848l.f40151j
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0067
            g.g0 r0 = r7.f43189c
            g.a r0 = r0.mo43466a()
            g.v r0 = r0.mo43286k()
            java.lang.String r0 = r0.mo43649h()
            okhttp3.internal.j.f r1 = okhttp3.internal.p519j.C15011f.m66571d()
            boolean r1 = r1.mo46622b(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0067:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0074:
            g.g0 r0 = r7.f43189c
            g.a r0 = r0.mo43466a()
            java.util.List r0 = r0.mo43278e()
            g.a0 r1 = p468g.C13799a0.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0144
        L_0x0086:
            r11 = 0
            r12 = r11
        L_0x0088:
            g.g0 r0 = r7.f43189c     // Catch:{ IOException -> 0x00f9 }
            boolean r0 = r0.mo43468c()     // Catch:{ IOException -> 0x00f9 }
            if (r0 == 0) goto L_0x00a9
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.m66086a(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f9 }
            java.net.Socket r0 = r7.f43190d     // Catch:{ IOException -> 0x00f9 }
            if (r0 != 0) goto L_0x00a4
            goto L_0x00c6
        L_0x00a4:
            r13 = r17
            r14 = r18
            goto L_0x00b0
        L_0x00a9:
            r13 = r17
            r14 = r18
            r7.m66087a(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00f7 }
        L_0x00b0:
            r15 = r20
            r7.m66089a(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00f5 }
            g.g0 r0 = r7.f43189c     // Catch:{ IOException -> 0x00f5 }
            java.net.InetSocketAddress r0 = r0.mo43469d()     // Catch:{ IOException -> 0x00f5 }
            g.g0 r1 = r7.f43189c     // Catch:{ IOException -> 0x00f5 }
            java.net.Proxy r1 = r1.mo43467b()     // Catch:{ IOException -> 0x00f5 }
            g.a0 r2 = r7.f43193g     // Catch:{ IOException -> 0x00f5 }
            r9.mo43583a(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f5 }
        L_0x00c6:
            g.g0 r0 = r7.f43189c
            boolean r0 = r0.mo43468c()
            if (r0 == 0) goto L_0x00e0
            java.net.Socket r0 = r7.f43190d
            if (r0 == 0) goto L_0x00d3
            goto L_0x00e0
        L_0x00d3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            throw r1
        L_0x00e0:
            okhttp3.internal.http2.f r0 = r7.f43194h
            if (r0 == 0) goto L_0x00f4
            g.k r1 = r7.f43188b
            monitor-enter(r1)
            okhttp3.internal.http2.f r0 = r7.f43194h     // Catch:{ all -> 0x00f1 }
            int r0 = r0.mo46518f()     // Catch:{ all -> 0x00f1 }
            r7.f43199m = r0     // Catch:{ all -> 0x00f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f4
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            throw r0
        L_0x00f4:
            return
        L_0x00f5:
            r0 = move-exception
            goto L_0x0100
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f9:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00fe:
            r15 = r20
        L_0x0100:
            java.net.Socket r1 = r7.f43191e
            okhttp3.internal.C14910b.m66058a(r1)
            java.net.Socket r1 = r7.f43190d
            okhttp3.internal.C14910b.m66058a(r1)
            r7.f43191e = r11
            r7.f43190d = r11
            r7.f43195i = r11
            r7.f43196j = r11
            r7.f43192f = r11
            r7.f43193g = r11
            r7.f43194h = r11
            g.g0 r1 = r7.f43189c
            java.net.InetSocketAddress r3 = r1.mo43469d()
            g.g0 r1 = r7.f43189c
            java.net.Proxy r4 = r1.mo43467b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.mo43584a(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0136
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            r12 = r1
            goto L_0x0139
        L_0x0136:
            r12.mo46371a(r0)
        L_0x0139:
            if (r21 == 0) goto L_0x0143
            boolean r0 = r10.mo46374a(r0)
            if (r0 == 0) goto L_0x0143
            goto L_0x0088
        L_0x0143:
            throw r12
        L_0x0144:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0151:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            goto L_0x015a
        L_0x0159:
            throw r0
        L_0x015a:
            goto L_0x0159
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C14916c.mo46377a(int, int, int, int, boolean, g.e, g.r):void");
    }

    /* renamed from: a */
    private void m66086a(int i, int i2, int i3, C13821e eVar, C13859r rVar) throws IOException {
        C13813c0 g = m66090g();
        C13868v h = g.mo43359h();
        int i4 = 0;
        while (i4 < 21) {
            m66087a(i, i2, eVar, rVar);
            g = m66083a(i2, i3, g, h);
            if (g != null) {
                C14910b.m66058a(this.f43190d);
                this.f43190d = null;
                this.f43196j = null;
                this.f43195i = null;
                rVar.mo43583a(eVar, this.f43189c.mo43469d(), this.f43189c.mo43467b(), null);
                i4++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m66087a(int i, int i2, C13821e eVar, C13859r rVar) throws IOException {
        Socket socket;
        Proxy b = this.f43189c.mo43467b();
        C13798a a = this.f43189c.mo43466a();
        if (b.type() == Type.DIRECT || b.type() == Type.HTTP) {
            socket = a.mo43284i().createSocket();
        } else {
            socket = new Socket(b);
        }
        this.f43190d = socket;
        rVar.mo43582a(eVar, this.f43189c.mo43469d(), b);
        this.f43190d.setSoTimeout(i2);
        try {
            C15011f.m66571d().mo46617a(this.f43190d, this.f43189c.mo43469d(), i);
            try {
                this.f43195i = C13906p.m59739a(C13906p.m59747b(this.f43190d));
                this.f43196j = C13906p.m59738a(C13906p.m59744a(this.f43190d));
            } catch (NullPointerException e) {
                if (f43186p.equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to connect to ");
            sb.append(this.f43189c.mo43469d());
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: a */
    private void m66089a(C14915b bVar, int i, C13821e eVar, C13859r rVar) throws IOException {
        if (this.f43189c.mo43466a().mo43285j() != null) {
            rVar.mo43592g(eVar);
            m66088a(bVar);
            rVar.mo43578a(eVar, this.f43192f);
            if (this.f43193g == C13799a0.HTTP_2) {
                m66085a(i);
            }
        } else if (this.f43189c.mo43466a().mo43278e().contains(C13799a0.H2_PRIOR_KNOWLEDGE)) {
            this.f43191e = this.f43190d;
            this.f43193g = C13799a0.H2_PRIOR_KNOWLEDGE;
            m66085a(i);
        } else {
            this.f43191e = this.f43190d;
            this.f43193g = C13799a0.HTTP_1_1;
        }
    }

    /* renamed from: a */
    private void m66085a(int i) throws IOException {
        this.f43191e.setSoTimeout(0);
        this.f43194h = new C14979g(true).mo46526a(this.f43191e, this.f43189c.mo43466a().mo43286k().mo43649h(), this.f43195i, this.f43196j).mo46527a((C14980h) this).mo46524a(i).mo46529a();
        this.f43194h.mo46522h();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0111 A[Catch:{ all -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0117 A[Catch:{ all -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011a  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m66088a(okhttp3.internal.connection.C14915b r8) throws java.io.IOException {
        /*
            r7 = this;
            g.g0 r0 = r7.f43189c
            g.a r0 = r0.mo43466a()
            javax.net.ssl.SSLSocketFactory r1 = r0.mo43285j()
            r2 = 0
            java.net.Socket r3 = r7.f43190d     // Catch:{ AssertionError -> 0x010a }
            g.v r4 = r0.mo43286k()     // Catch:{ AssertionError -> 0x010a }
            java.lang.String r4 = r4.mo43649h()     // Catch:{ AssertionError -> 0x010a }
            g.v r5 = r0.mo43286k()     // Catch:{ AssertionError -> 0x010a }
            int r5 = r5.mo43656n()     // Catch:{ AssertionError -> 0x010a }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x010a }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x010a }
            g.l r8 = r8.mo46373a(r1)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            boolean r3 = r8.mo43519c()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            if (r3 == 0) goto L_0x0041
            okhttp3.internal.j.f r3 = okhttp3.internal.p519j.C15011f.m66571d()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            g.v r4 = r0.mo43286k()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.lang.String r4 = r4.mo43649h()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.util.List r5 = r0.mo43278e()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            r3.mo46618a(r1, r4, r5)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
        L_0x0041:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            g.t r4 = p468g.C13865t.m59230a(r3)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            javax.net.ssl.HostnameVerifier r5 = r0.mo43277d()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            g.v r6 = r0.mo43286k()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.lang.String r6 = r6.mo43649h()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            if (r3 == 0) goto L_0x00b0
            g.g r3 = r0.mo43273a()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            g.v r0 = r0.mo43286k()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.lang.String r0 = r0.mo43649h()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.util.List r5 = r4.mo43605d()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            r3.mo43456a(r0, r5)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            boolean r8 = r8.mo43519c()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            if (r8 == 0) goto L_0x007f
            okhttp3.internal.j.f r8 = okhttp3.internal.p519j.C15011f.m66571d()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.lang.String r2 = r8.mo46619b(r1)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
        L_0x007f:
            r7.f43191e = r1     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.net.Socket r8 = r7.f43191e     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            h.a0 r8 = p470h.C13906p.m59747b(r8)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            h.e r8 = p470h.C13906p.m59739a(r8)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            r7.f43195i = r8     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.net.Socket r8 = r7.f43191e     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            h.z r8 = p470h.C13906p.m59744a(r8)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            h.d r8 = p470h.C13906p.m59738a(r8)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            r7.f43196j = r8     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            r7.f43192f = r4     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            if (r2 == 0) goto L_0x00a2
            g.a0 r8 = p468g.C13799a0.m58923b(r2)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            goto L_0x00a4
        L_0x00a2:
            g.a0 r8 = p468g.C13799a0.HTTP_1_1     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
        L_0x00a4:
            r7.f43193g = r8     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            if (r1 == 0) goto L_0x00af
            okhttp3.internal.j.f r8 = okhttp3.internal.p519j.C15011f.m66571d()
            r8.mo46633a(r1)
        L_0x00af:
            return
        L_0x00b0:
            java.util.List r8 = r4.mo43605d()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            r3.<init>()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.lang.String r4 = "Hostname "
            r3.append(r4)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            g.v r0 = r0.mo43286k()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.lang.String r0 = r0.mo43649h()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.lang.String r0 = p468g.C13829g.m59070a(r8)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.lang.String r0 = "\n    DN: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.util.List r8 = okhttp3.internal.p521l.C15017e.m66602a(r8)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            r3.append(r8)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            java.lang.String r8 = r3.toString()     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
            throw r2     // Catch:{ AssertionError -> 0x0104, all -> 0x0102 }
        L_0x0102:
            r8 = move-exception
            goto L_0x0118
        L_0x0104:
            r8 = move-exception
            r2 = r1
            goto L_0x010b
        L_0x0107:
            r8 = move-exception
            r1 = r2
            goto L_0x0118
        L_0x010a:
            r8 = move-exception
        L_0x010b:
            boolean r0 = okhttp3.internal.C14910b.m66060a(r8)     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0117
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0107 }
            r0.<init>(r8)     // Catch:{ all -> 0x0107 }
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x0117:
            throw r8     // Catch:{ all -> 0x0107 }
        L_0x0118:
            if (r1 == 0) goto L_0x0121
            okhttp3.internal.j.f r0 = okhttp3.internal.p519j.C15011f.m66571d()
            r0.mo46633a(r1)
        L_0x0121:
            okhttp3.internal.C14910b.m66058a(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C14916c.m66088a(okhttp3.internal.connection.b):void");
    }

    /* renamed from: a */
    private C13813c0 m66083a(int i, int i2, C13813c0 c0Var, C13868v vVar) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("CONNECT ");
        sb.append(C14910b.m66043a(vVar, true));
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        while (true) {
            C14955a aVar = new C14955a(null, null, this.f43195i, this.f43196j);
            this.f43195i.timeout().mo43828b((long) i, TimeUnit.MILLISECONDS);
            this.f43196j.timeout().mo43828b((long) i2, TimeUnit.MILLISECONDS);
            aVar.mo46474a(c0Var.mo43354c(), sb2);
            aVar.mo46458a();
            C13823e0 a = aVar.mo46455a(false).mo43432a(c0Var).mo43439a();
            long a2 = C14947e.m66225a(a);
            if (a2 == -1) {
                a2 = 0;
            }
            C13883a0 b = aVar.mo46476b(a2);
            C14910b.m66067b(b, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            b.close();
            int g = a.mo43425g();
            if (g != 200) {
                if (g == 407) {
                    C13813c0 a3 = this.f43189c.mo43466a().mo43281g().mo43289a(this.f43189c, a);
                    if (a3 != null) {
                        if (Close.ELEMENT.equalsIgnoreCase(a.mo43419b("Connection"))) {
                            return a3;
                        }
                        c0Var = a3;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unexpected response code for CONNECT: ");
                    sb3.append(a.mo43425g());
                    throw new IOException(sb3.toString());
                }
            } else if (this.f43195i.mo43867b().mo43904p() && this.f43196j.mo43867b().mo43904p()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    /* renamed from: a */
    public boolean mo46380a(C13798a aVar, @C5952h C13832g0 g0Var) {
        if (this.f43200n.size() >= this.f43199m || this.f43197k || !Internal.instance.equalsNonHost(this.f43189c.mo43466a(), aVar)) {
            return false;
        }
        if (aVar.mo43286k().mo43649h().equals(mo43494b().mo43466a().mo43286k().mo43649h())) {
            return true;
        }
        if (this.f43194h == null || g0Var == null || g0Var.mo43467b().type() != Type.DIRECT || this.f43189c.mo43467b().type() != Type.DIRECT || !this.f43189c.mo43469d().equals(g0Var.mo43469d()) || g0Var.mo43466a().mo43277d() != C15017e.f43651a || !mo46381a(aVar.mo43286k())) {
            return false;
        }
        try {
            aVar.mo43273a().mo43456a(aVar.mo43286k().mo43649h(), mo43495c().mo43605d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo46381a(C13868v vVar) {
        if (vVar.mo43656n() != this.f43189c.mo43466a().mo43286k().mo43656n()) {
            return false;
        }
        boolean z = true;
        if (!vVar.mo43649h().equals(this.f43189c.mo43466a().mo43286k().mo43649h()) && (this.f43192f == null || !C15017e.f43651a.mo46651a(vVar.mo43649h(), (X509Certificate) this.f43192f.mo43605d().get(0)))) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public C14944c mo46375a(C13876z zVar, C13871a aVar, C14921f fVar) throws SocketException {
        C14972f fVar2 = this.f43194h;
        if (fVar2 != null) {
            return new C14970e(zVar, aVar, fVar, fVar2);
        }
        this.f43191e.setSoTimeout(aVar.mo43697a());
        this.f43195i.timeout().mo43828b((long) aVar.mo43697a(), TimeUnit.MILLISECONDS);
        this.f43196j.timeout().mo43828b((long) aVar.mo43700b(), TimeUnit.MILLISECONDS);
        return new C14955a(zVar, fVar, this.f43195i, this.f43196j);
    }

    /* renamed from: a */
    public C15026g mo46376a(C14921f fVar) {
        C14917a aVar = new C14917a(true, this.f43195i, this.f43196j, fVar);
        return aVar;
    }

    /* renamed from: a */
    public boolean mo46382a(boolean z) {
        int soTimeout;
        if (this.f43191e.isClosed() || this.f43191e.isInputShutdown() || this.f43191e.isOutputShutdown()) {
            return false;
        }
        C14972f fVar = this.f43194h;
        if (fVar != null) {
            return !fVar.mo46516e();
        }
        if (z) {
            try {
                soTimeout = this.f43191e.getSoTimeout();
                this.f43191e.setSoTimeout(1);
                if (this.f43195i.mo43904p()) {
                    this.f43191e.setSoTimeout(soTimeout);
                    return false;
                }
                this.f43191e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f43191e.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo46379a(C14990h hVar) throws IOException {
        hVar.mo46549a(C14963a.REFUSED_STREAM);
    }

    /* renamed from: a */
    public void mo46378a(C14972f fVar) {
        synchronized (this.f43188b) {
            this.f43199m = fVar.mo46518f();
        }
    }

    /* renamed from: a */
    public C13799a0 mo43493a() {
        return this.f43193g;
    }
}
