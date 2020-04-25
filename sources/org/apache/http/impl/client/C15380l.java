package org.apache.http.impl.client;

import com.google.api.client.http.C7304t;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.http.C15116a;
import org.apache.http.C15133c;
import org.apache.http.C15452k;
import org.apache.http.C15460l;
import org.apache.http.C15463o;
import org.apache.http.C15466r;
import org.apache.http.HttpException;
import org.apache.http.ProtocolException;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.C15119b;
import org.apache.http.auth.C15122e;
import org.apache.http.auth.C15124g;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.C15135a;
import org.apache.http.client.C15137c;
import org.apache.http.client.C15139e;
import org.apache.http.client.C15140f;
import org.apache.http.client.C15141g;
import org.apache.http.client.C15143i;
import org.apache.http.client.RedirectException;
import org.apache.http.client.p531l.C15158c;
import org.apache.http.client.p531l.C15161f;
import org.apache.http.client.p532m.C15162a;
import org.apache.http.client.p533n.C15175f;
import org.apache.http.conn.C15179c;
import org.apache.http.conn.C15183g;
import org.apache.http.conn.C15187k;
import org.apache.http.conn.p535o.C15201a;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.conn.p535o.C15204d;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p547h0.C15332i;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p548i0.C15359k;
import org.apache.http.p549j0.C15429d;
import org.apache.http.p549j0.C15431f;
import org.apache.http.p549j0.C15434i;
import org.apache.http.p549j0.C15435j;

@C6145c
/* renamed from: org.apache.http.impl.client.l */
/* compiled from: DefaultRequestDirector */
public class C15380l implements C15141g {

    /* renamed from: a */
    private final C15089a f44484a;

    /* renamed from: b */
    protected final C15179c f44485b;

    /* renamed from: c */
    protected final C15204d f44486c;

    /* renamed from: d */
    protected final C15116a f44487d;

    /* renamed from: e */
    protected final C15183g f44488e;

    /* renamed from: f */
    protected final C15435j f44489f;

    /* renamed from: g */
    protected final C15434i f44490g;

    /* renamed from: h */
    protected final C15139e f44491h;

    /* renamed from: i */
    protected final C15140f f44492i;

    /* renamed from: j */
    protected final C15135a f44493j;

    /* renamed from: k */
    protected final C15135a f44494k;

    /* renamed from: l */
    protected final C15143i f44495l;

    /* renamed from: m */
    protected final C15357i f44496m;

    /* renamed from: n */
    protected C15187k f44497n;

    /* renamed from: o */
    protected final AuthState f44498o;

    /* renamed from: p */
    protected final AuthState f44499p;

    /* renamed from: q */
    private int f44500q;

    /* renamed from: r */
    private int f44501r;

    /* renamed from: s */
    private C15460l f44502s;

    C15380l(C15089a aVar, C15435j jVar, C15179c cVar, C15116a aVar2, C15183g gVar, C15204d dVar, C15434i iVar, C15139e eVar, C15140f fVar, C15135a aVar3, C15135a aVar4, C15143i iVar2, C15357i iVar3) {
        if (aVar == null) {
            throw new IllegalArgumentException("Log may not be null.");
        } else if (jVar == null) {
            throw new IllegalArgumentException("Request executor may not be null.");
        } else if (cVar == null) {
            throw new IllegalArgumentException("Client connection manager may not be null.");
        } else if (aVar2 == null) {
            throw new IllegalArgumentException("Connection reuse strategy may not be null.");
        } else if (gVar == null) {
            throw new IllegalArgumentException("Connection keep alive strategy may not be null.");
        } else if (dVar == null) {
            throw new IllegalArgumentException("Route planner may not be null.");
        } else if (iVar == null) {
            throw new IllegalArgumentException("HTTP protocol processor may not be null.");
        } else if (eVar == null) {
            throw new IllegalArgumentException("HTTP request retry handler may not be null.");
        } else if (fVar == null) {
            throw new IllegalArgumentException("Redirect handler may not be null.");
        } else if (aVar3 == null) {
            throw new IllegalArgumentException("Target authentication handler may not be null.");
        } else if (aVar4 == null) {
            throw new IllegalArgumentException("Proxy authentication handler may not be null.");
        } else if (iVar2 == null) {
            throw new IllegalArgumentException("User token handler may not be null.");
        } else if (iVar3 != null) {
            this.f44484a = aVar;
            this.f44489f = jVar;
            this.f44485b = cVar;
            this.f44487d = aVar2;
            this.f44488e = gVar;
            this.f44486c = dVar;
            this.f44490g = iVar;
            this.f44491h = eVar;
            this.f44492i = fVar;
            this.f44493j = aVar3;
            this.f44494k = aVar4;
            this.f44495l = iVar2;
            this.f44496m = iVar3;
            this.f44497n = null;
            this.f44500q = 0;
            this.f44501r = this.f44496m.mo47541b(C15158c.f44025f, 100);
            this.f44498o = new AuthState();
            this.f44499p = new AuthState();
        } else {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
    }

    /* renamed from: a */
    private C15386r m68190a(C15463o oVar) throws ProtocolException {
        if (oVar instanceof C15452k) {
            return new C15383o((C15452k) oVar);
        }
        return new C15386r(oVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0169  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo47650b(org.apache.http.conn.p535o.C15202b r18, org.apache.http.p549j0.C15431f r19) throws org.apache.http.HttpException, java.io.IOException {
        /*
            r17 = this;
            r7 = r17
            r8 = r19
            org.apache.http.l r9 = r18.mo47057h()
            org.apache.http.l r10 = r18.mo47048b()
            r11 = 0
            r12 = 0
            r1 = r11
            r0 = 0
        L_0x0010:
            if (r0 != 0) goto L_0x012e
            org.apache.http.conn.k r0 = r7.f44497n
            boolean r0 = r0.isOpen()
            if (r0 != 0) goto L_0x0024
            org.apache.http.conn.k r0 = r7.f44497n
            org.apache.http.i0.i r1 = r7.f44496m
            r14 = r18
            r0.mo47011a(r14, r8, r1)
            goto L_0x0026
        L_0x0024:
            r14 = r18
        L_0x0026:
            org.apache.http.o r0 = r17.mo47646a(r18, r19)
            org.apache.http.i0.i r1 = r7.f44496m
            r0.mo47416a(r1)
            java.lang.String r1 = "http.target_host"
            r8.mo47686a(r1, r10)
            java.lang.String r1 = "http.proxy_host"
            r8.mo47686a(r1, r9)
            org.apache.http.conn.k r1 = r7.f44497n
            java.lang.String r2 = "http.connection"
            r8.mo47686a(r2, r1)
            org.apache.http.auth.AuthState r1 = r7.f44498o
            java.lang.String r2 = "http.auth.target-scope"
            r8.mo47686a(r2, r1)
            org.apache.http.auth.AuthState r1 = r7.f44499p
            java.lang.String r2 = "http.auth.proxy-scope"
            r8.mo47686a(r2, r1)
            java.lang.String r1 = "http.request"
            r8.mo47686a(r1, r0)
            org.apache.http.j0.j r1 = r7.f44489f
            org.apache.http.j0.i r2 = r7.f44490g
            r1.mo47718a(r0, r2, r8)
            org.apache.http.j0.j r1 = r7.f44489f
            org.apache.http.conn.k r2 = r7.f44497n
            org.apache.http.r r15 = r1.mo47722c(r0, r2, r8)
            org.apache.http.i0.i r0 = r7.f44496m
            r15.mo47416a(r0)
            org.apache.http.j0.j r0 = r7.f44489f
            org.apache.http.j0.i r1 = r7.f44490g
            r0.mo47719a(r15, r1, r8)
            org.apache.http.b0 r0 = r15.mo47468l()
            int r0 = r0.mo46913c()
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L_0x0113
            java.lang.String r0 = "http.auth.credentials-provider"
            java.lang.Object r0 = r8.mo47685a(r0)
            r6 = r0
            org.apache.http.client.c r6 = (org.apache.http.client.C15137c) r6
            if (r6 == 0) goto L_0x010f
            org.apache.http.i0.i r0 = r7.f44496m
            boolean r0 = org.apache.http.client.p531l.C15161f.m67262b(r0)
            if (r0 == 0) goto L_0x010f
            org.apache.http.client.a r0 = r7.f44494k
            boolean r0 = r0.mo46922a(r15, r8)
            if (r0 == 0) goto L_0x010a
            org.apache.commons.logging.a r0 = r7.f44484a
            java.lang.String r1 = "Proxy requested authentication"
            r0.mo46776a(r1)
            org.apache.http.client.a r0 = r7.f44494k
            java.util.Map r2 = r0.mo46923b(r15, r8)
            org.apache.http.auth.AuthState r3 = r7.f44499p     // Catch:{ AuthenticationException -> 0x00b2 }
            org.apache.http.client.a r4 = r7.f44494k     // Catch:{ AuthenticationException -> 0x00b2 }
            r1 = r17
            r5 = r15
            r13 = r6
            r6 = r19
            r1.m68191a(r2, r3, r4, r5, r6)     // Catch:{ AuthenticationException -> 0x00b0 }
            goto L_0x00d7
        L_0x00b0:
            r0 = move-exception
            goto L_0x00b4
        L_0x00b2:
            r0 = move-exception
            r13 = r6
        L_0x00b4:
            org.apache.commons.logging.a r1 = r7.f44484a
            boolean r1 = r1.mo46778a()
            if (r1 == 0) goto L_0x00d7
            org.apache.commons.logging.a r1 = r7.f44484a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Authentication error: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.mo46783d(r0)
            goto L_0x012f
        L_0x00d7:
            org.apache.http.auth.AuthState r0 = r7.f44499p
            r7.m68192a(r0, r9, r13)
            org.apache.http.auth.AuthState r0 = r7.f44499p
            org.apache.http.auth.g r0 = r0.getCredentials()
            if (r0 == 0) goto L_0x0105
            org.apache.http.a r0 = r7.f44487d
            boolean r0 = r0.mo46853a(r15, r8)
            if (r0 == 0) goto L_0x00fd
            org.apache.commons.logging.a r0 = r7.f44484a
            java.lang.String r1 = "Connection kept alive"
            r0.mo46776a(r1)
            org.apache.http.j r0 = r15.mo47466g()
            if (r0 == 0) goto L_0x0102
            r0.mo46986j()
            goto L_0x0102
        L_0x00fd:
            org.apache.http.conn.k r0 = r7.f44497n
            r0.close()
        L_0x0102:
            r16 = 0
            goto L_0x0107
        L_0x0105:
            r16 = 1
        L_0x0107:
            r0 = r16
            goto L_0x0110
        L_0x010a:
            org.apache.http.auth.AuthState r0 = r7.f44499p
            r0.setAuthScope(r11)
        L_0x010f:
            r0 = 1
        L_0x0110:
            r1 = r15
            goto L_0x0010
        L_0x0113:
            org.apache.http.HttpException r0 = new org.apache.http.HttpException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected response to CONNECT request: "
            r1.append(r2)
            org.apache.http.b0 r2 = r15.mo47468l()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x012e:
            r15 = r1
        L_0x012f:
            org.apache.http.b0 r0 = r15.mo47468l()
            int r0 = r0.mo46913c()
            r1 = 299(0x12b, float:4.19E-43)
            if (r0 <= r1) goto L_0x0169
            org.apache.http.j r0 = r15.mo47466g()
            if (r0 == 0) goto L_0x0149
            org.apache.http.e0.c r1 = new org.apache.http.e0.c
            r1.<init>(r0)
            r15.mo47462a(r1)
        L_0x0149:
            org.apache.http.conn.k r0 = r7.f44497n
            r0.close()
            org.apache.http.impl.client.TunnelRefusedException r0 = new org.apache.http.impl.client.TunnelRefusedException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "CONNECT refused by proxy: "
            r1.append(r2)
            org.apache.http.b0 r2 = r15.mo47468l()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r15)
            throw r0
        L_0x0169:
            org.apache.http.conn.k r0 = r7.f44497n
            r0.mo47018g()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.C15380l.mo47650b(org.apache.http.conn.o.b, org.apache.http.j0.f):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo47651c(C15202b bVar, C15431f fVar) throws HttpException, IOException {
        int a;
        C15201a aVar = new C15201a();
        do {
            C15202b h = this.f44497n.mo47020h();
            a = aVar.mo47044a(bVar, h);
            switch (a) {
                case -1:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to establish route.\nplanned = ");
                    sb.append(bVar);
                    sb.append("\ncurrent = ");
                    sb.append(h);
                    throw new IllegalStateException(sb.toString());
                case 0:
                    break;
                case 1:
                case 2:
                    this.f44497n.mo47011a(bVar, fVar, this.f44496m);
                    continue;
                case 3:
                    boolean b = mo47650b(bVar, fVar);
                    this.f44484a.mo46776a("Tunnel to target created.");
                    this.f44497n.mo47014a(b, this.f44496m);
                    continue;
                case 4:
                    int c = h.mo47049c() - 1;
                    boolean a2 = mo47649a(bVar, c, fVar);
                    this.f44484a.mo46776a("Tunnel to proxy created.");
                    this.f44497n.mo47013a(bVar.mo47047a(c), a2, this.f44496m);
                    continue;
                case 5:
                    this.f44497n.mo47012a(fVar, this.f44496m);
                    continue;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown step indicator ");
                    sb2.append(a);
                    sb2.append(" from RouteDirector.");
                    throw new IllegalStateException(sb2.toString());
            }
        } while (a > 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02b3, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02b9, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02e8, code lost:
        m68193b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02eb, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02f0, code lost:
        m68193b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02f4, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016d, code lost:
        r19 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016f, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r1.f44484a.mo46776a("Closing the connection.");
        r1.f44497n.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0182, code lost:
        if (r1.f44491h.mo46941a(r2, r13, r3) == false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018a, code lost:
        if (r1.f44484a.mo46791f() != false) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018c, code lost:
        r5 = r1.f44484a;
        r6 = new java.lang.StringBuilder();
        r6.append("I/O exception (");
        r6.append(r2.getClass().getName());
        r6.append(") caught when processing request: ");
        r6.append(r2.getMessage());
        r5.mo46779b(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01bc, code lost:
        if (r1.f44484a.mo46785d() != false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01be, code lost:
        r1.f44484a.mo46777a(r2.getMessage(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c7, code lost:
        r1.f44484a.mo46779b("Retrying request");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d2, code lost:
        if (r14.mo47054f() == false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d4, code lost:
        r1.f44484a.mo46776a("Reopening the direct connection.");
        r1.f44497n.mo47011a(r14, r3, r1.f44496m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e3, code lost:
        r1.f44484a.mo46776a("Proxied connection. Need to start over.");
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ec, code lost:
        r16 = r2;
        r2 = r17;
        r5 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f4, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02b2 A[Catch:{ InterruptedException -> 0x008b, HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }, ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:8:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02b8 A[Catch:{ InterruptedException -> 0x008b, HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }, ExcHandler: HttpException (r0v0 'e' org.apache.http.HttpException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:2:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01f4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0184 A[Catch:{ InterruptedException -> 0x008b, HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.C15466r execute(org.apache.http.C15460l r22, org.apache.http.C15463o r23, org.apache.http.p549j0.C15431f r24) throws org.apache.http.HttpException, java.io.IOException {
        /*
            r21 = this;
            r1 = r21
            r2 = r23
            r3 = r24
            java.lang.String r4 = "http.user-token"
            org.apache.http.impl.client.r r5 = r1.m68190a(r2)
            org.apache.http.i0.i r6 = r1.f44496m
            r5.mo47416a(r6)
            r6 = r22
            org.apache.http.conn.o.b r6 = r1.mo47644a(r6, r5, r3)
            org.apache.http.i0.i r7 = r23.getParams()
            java.lang.String r8 = "http.virtual-host"
            java.lang.Object r7 = r7.mo47549b(r8)
            org.apache.http.l r7 = (org.apache.http.C15460l) r7
            r1.f44502s = r7
            org.apache.http.impl.client.s r7 = new org.apache.http.impl.client.s
            r7.<init>(r5, r6)
            org.apache.http.i0.i r5 = r1.f44496m
            long r5 = org.apache.http.conn.p534n.C15194e.m67363c(r5)
            r10 = r7
            r7 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0035:
            if (r7 != 0) goto L_0x02bb
            org.apache.http.impl.client.r r12 = r10.mo47663a()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.conn.o.b r14 = r10.mo47664b()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.Object r15 = r3.mo47685a(r4)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.conn.k r8 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r8 != 0) goto L_0x0096
            org.apache.http.conn.c r8 = r1.f44485b     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.conn.f r8 = r8.mo46987a(r14, r15)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            boolean r9 = r2 instanceof org.apache.http.client.p530k.C15145a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r9 == 0) goto L_0x0057
            r9 = r2
            org.apache.http.client.k.a r9 = (org.apache.http.client.p530k.C15145a) r9     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r9.mo46946a(r8)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x0057:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x008b }
            org.apache.http.conn.k r8 = r8.mo46997a(r5, r9)     // Catch:{ InterruptedException -> 0x008b }
            r1.f44497n = r8     // Catch:{ InterruptedException -> 0x008b }
            org.apache.http.i0.i r8 = r1.f44496m     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            boolean r8 = org.apache.http.p548i0.C15356h.m68018f(r8)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r8 == 0) goto L_0x0096
            org.apache.http.conn.k r8 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            boolean r8 = r8.isOpen()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r8 == 0) goto L_0x0096
            org.apache.commons.logging.a r8 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r9 = "Stale connection check"
            r8.mo46776a(r9)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.conn.k r8 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            boolean r8 = r8.isStale()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r8 == 0) goto L_0x0096
            org.apache.commons.logging.a r8 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r9 = "Stale connection detected"
            r8.mo46776a(r9)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.conn.k r8 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r8.close()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            goto L_0x0096
        L_0x008b:
            r0 = move-exception
            r2 = r0
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r3.<init>()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r3.initCause(r2)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            throw r3     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x0096:
            boolean r8 = r2 instanceof org.apache.http.client.p530k.C15145a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r8 == 0) goto L_0x00a2
            r8 = r2
            org.apache.http.client.k.a r8 = (org.apache.http.client.p530k.C15145a) r8     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.conn.k r9 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r8.mo46947a(r9)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x00a2:
            org.apache.http.conn.k r8 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            boolean r8 = r8.isOpen()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r8 != 0) goto L_0x00b2
            org.apache.http.conn.k r8 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.i0.i r9 = r1.f44496m     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r8.mo47011a(r14, r3, r9)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            goto L_0x00bd
        L_0x00b2:
            org.apache.http.conn.k r8 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.i0.i r9 = r1.f44496m     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            int r9 = org.apache.http.p548i0.C15356h.m68013c(r9)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r8.setSocketTimeout(r9)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x00bd:
            r1.mo47651c(r14, r3)     // Catch:{ TunnelRefusedException -> 0x029a }
            r12.mo47662r()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r1.mo47648a(r12, r14)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.l r8 = r1.f44502s     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r8 != 0) goto L_0x00ce
            org.apache.http.l r8 = r14.mo47048b()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x00ce:
            org.apache.http.l r9 = r14.mo47057h()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r2 = "http.target_host"
            r3.mo47686a(r2, r8)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r2 = "http.proxy_host"
            r3.mo47686a(r2, r9)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r2 = "http.connection"
            org.apache.http.conn.k r8 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r3.mo47686a(r2, r8)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r2 = "http.auth.target-scope"
            org.apache.http.auth.AuthState r8 = r1.f44498o     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r3.mo47686a(r2, r8)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r2 = "http.auth.proxy-scope"
            org.apache.http.auth.AuthState r8 = r1.f44499p     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r3.mo47686a(r2, r8)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.j0.j r2 = r1.f44489f     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.j0.i r8 = r1.f44490g     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r2.mo47718a(r12, r8, r3)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r9 = 1
            r2 = 1
            r8 = 0
            r16 = 0
        L_0x00fd:
            if (r2 == 0) goto L_0x01f5
            int r13 = r13 + 1
            r12.mo47661p()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r17 = r2
            int r2 = r12.mo47659n()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r2 <= r9) goto L_0x012d
            boolean r2 = r12.mo47652q()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r2 != 0) goto L_0x012d
            org.apache.commons.logging.a r2 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r3 = "Cannot retry non-repeatable request"
            r2.mo46776a(r3)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r2 = r16
            if (r2 == 0) goto L_0x0125
            org.apache.http.client.NonRepeatableRequestException r3 = new org.apache.http.client.NonRepeatableRequestException     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r4 = "Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed."
            r3.<init>(r4, r2)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            throw r3     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x0125:
            org.apache.http.client.NonRepeatableRequestException r2 = new org.apache.http.client.NonRepeatableRequestException     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r3 = "Cannot retry request with a non-repeatable request entity."
            r2.<init>(r3)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            throw r2     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x012d:
            r2 = r16
            org.apache.commons.logging.a r9 = r1.f44484a     // Catch:{ IOException -> 0x016c, HttpException -> 0x02b8, RuntimeException -> 0x02b2 }
            boolean r9 = r9.mo46785d()     // Catch:{ IOException -> 0x016c, HttpException -> 0x02b8, RuntimeException -> 0x02b2 }
            if (r9 == 0) goto L_0x0157
            org.apache.commons.logging.a r9 = r1.f44484a     // Catch:{ IOException -> 0x016c, HttpException -> 0x02b8, RuntimeException -> 0x02b2 }
            r18 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x016c, HttpException -> 0x02b8, RuntimeException -> 0x02b2 }
            r2.<init>()     // Catch:{ IOException -> 0x016c, HttpException -> 0x02b8, RuntimeException -> 0x02b2 }
            r19 = r5
            java.lang.String r5 = "Attempt "
            r2.append(r5)     // Catch:{ IOException -> 0x016a, HttpException -> 0x02b8, RuntimeException -> 0x02b2 }
            r2.append(r13)     // Catch:{ IOException -> 0x016a, HttpException -> 0x02b8, RuntimeException -> 0x02b2 }
            java.lang.String r5 = " to execute request"
            r2.append(r5)     // Catch:{ IOException -> 0x016a, HttpException -> 0x02b8, RuntimeException -> 0x02b2 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x016a, HttpException -> 0x02b8, RuntimeException -> 0x02b2 }
            r9.mo46776a(r2)     // Catch:{ IOException -> 0x016a, HttpException -> 0x02b8, RuntimeException -> 0x02b2 }
            goto L_0x015b
        L_0x0157:
            r18 = r2
            r19 = r5
        L_0x015b:
            org.apache.http.j0.j r2 = r1.f44489f     // Catch:{ IOException -> 0x016a, HttpException -> 0x02b8, RuntimeException -> 0x02b2 }
            org.apache.http.conn.k r5 = r1.f44497n     // Catch:{ IOException -> 0x016a, HttpException -> 0x02b8, RuntimeException -> 0x02b2 }
            org.apache.http.r r8 = r2.mo47722c(r12, r5, r3)     // Catch:{ IOException -> 0x016a, HttpException -> 0x02b8, RuntimeException -> 0x02b2 }
            r16 = r18
            r5 = r19
            r2 = 0
        L_0x0168:
            r9 = 1
            goto L_0x00fd
        L_0x016a:
            r0 = move-exception
            goto L_0x016f
        L_0x016c:
            r0 = move-exception
            r19 = r5
        L_0x016f:
            r2 = r0
            org.apache.commons.logging.a r5 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r6 = "Closing the connection."
            r5.mo46776a(r6)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.conn.k r5 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r5.close()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.client.e r5 = r1.f44491h     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            boolean r5 = r5.mo46941a(r2, r13, r3)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r5 == 0) goto L_0x01f4
            org.apache.commons.logging.a r5 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            boolean r5 = r5.mo46791f()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r5 == 0) goto L_0x01b6
            org.apache.commons.logging.a r5 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r6.<init>()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r9 = "I/O exception ("
            r6.append(r9)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.Class r9 = r2.getClass()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r9 = r9.getName()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r6.append(r9)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r9 = ") caught when processing request: "
            r6.append(r9)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r9 = r2.getMessage()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r6.append(r9)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r6 = r6.toString()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r5.mo46779b(r6)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x01b6:
            org.apache.commons.logging.a r5 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            boolean r5 = r5.mo46785d()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r5 == 0) goto L_0x01c7
            org.apache.commons.logging.a r5 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r6 = r2.getMessage()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r5.mo46777a(r6, r2)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x01c7:
            org.apache.commons.logging.a r5 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r6 = "Retrying request"
            r5.mo46779b(r6)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            boolean r5 = r14.mo47054f()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r5 != 0) goto L_0x01e3
            org.apache.commons.logging.a r5 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r6 = "Reopening the direct connection."
            r5.mo46776a(r6)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.conn.k r5 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.i0.i r6 = r1.f44496m     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r5.mo47011a(r14, r3, r6)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            goto L_0x01ec
        L_0x01e3:
            org.apache.commons.logging.a r5 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r6 = "Proxied connection. Need to start over."
            r5.mo46776a(r6)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r17 = 0
        L_0x01ec:
            r16 = r2
            r2 = r17
            r5 = r19
            goto L_0x0168
        L_0x01f4:
            throw r2     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x01f5:
            r19 = r5
            if (r8 != 0) goto L_0x0200
        L_0x01f9:
            r2 = r23
            r12 = r8
            r5 = r19
            goto L_0x0035
        L_0x0200:
            org.apache.http.i0.i r2 = r1.f44496m     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r8.mo47416a(r2)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.j0.j r2 = r1.f44489f     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.j0.i r5 = r1.f44490g     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r2.mo47719a(r8, r5, r3)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.a r2 = r1.f44487d     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            boolean r11 = r2.mo46853a(r8, r3)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r11 == 0) goto L_0x0252
            org.apache.http.conn.g r2 = r1.f44488e     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            long r5 = r2.mo46999a(r8, r3)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.conn.k r2 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r2.mo47009a(r5, r9)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.commons.logging.a r2 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            boolean r2 = r2.mo46785d()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r2 == 0) goto L_0x0252
            r17 = 0
            int r2 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r2 < 0) goto L_0x024b
            org.apache.commons.logging.a r2 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r9.<init>()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r12 = "Connection can be kept alive for "
            r9.append(r12)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r9.append(r5)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r5 = " ms"
            r9.append(r5)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r5 = r9.toString()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r2.mo46776a(r5)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            goto L_0x0252
        L_0x024b:
            org.apache.commons.logging.a r2 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r5 = "Connection can be kept alive indefinitely"
            r2.mo46776a(r5)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x0252:
            org.apache.http.impl.client.s r2 = r1.mo47645a(r10, r8, r3)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r2 != 0) goto L_0x025a
            r7 = 1
            goto L_0x0282
        L_0x025a:
            if (r11 == 0) goto L_0x026b
            org.apache.http.j r5 = r8.mo47466g()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r5 == 0) goto L_0x0265
            r5.mo46986j()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x0265:
            org.apache.http.conn.k r5 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r5.mo47018g()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            goto L_0x0270
        L_0x026b:
            org.apache.http.conn.k r5 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r5.close()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x0270:
            org.apache.http.conn.o.b r5 = r2.mo47664b()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.conn.o.b r6 = r10.mo47664b()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            boolean r5 = r5.equals(r6)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r5 != 0) goto L_0x0281
            r21.mo47647a()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x0281:
            r10 = r2
        L_0x0282:
            org.apache.http.conn.k r2 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r2 == 0) goto L_0x01f9
            if (r15 != 0) goto L_0x01f9
            org.apache.http.client.i r2 = r1.f44495l     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.Object r2 = r2.mo46945a(r3)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r3.mo47686a(r4, r2)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r2 == 0) goto L_0x01f9
            org.apache.http.conn.k r5 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r5.mo47010a(r2)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            goto L_0x01f9
        L_0x029a:
            r0 = move-exception
            r2 = r0
            org.apache.commons.logging.a r3 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            boolean r3 = r3.mo46785d()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r3 == 0) goto L_0x02ad
            org.apache.commons.logging.a r3 = r1.f44484a     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            java.lang.String r4 = r2.getMessage()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r3.mo46776a(r4)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x02ad:
            org.apache.http.r r12 = r2.mo47575a()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            goto L_0x02bb
        L_0x02b2:
            r0 = move-exception
            r2 = r0
            goto L_0x02e8
        L_0x02b5:
            r0 = move-exception
            r2 = r0
            goto L_0x02ec
        L_0x02b8:
            r0 = move-exception
            r2 = r0
            goto L_0x02f0
        L_0x02bb:
            if (r12 == 0) goto L_0x02dd
            org.apache.http.j r2 = r12.mo47466g()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r2 == 0) goto L_0x02dd
            org.apache.http.j r2 = r12.mo47466g()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            boolean r2 = r2.isStreaming()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            if (r2 != 0) goto L_0x02ce
            goto L_0x02dd
        L_0x02ce:
            org.apache.http.j r2 = r12.mo47466g()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.conn.b r3 = new org.apache.http.conn.b     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            org.apache.http.conn.k r4 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r3.<init>(r2, r4, r11)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r12.mo47462a(r3)     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            goto L_0x02e7
        L_0x02dd:
            if (r11 == 0) goto L_0x02e4
            org.apache.http.conn.k r2 = r1.f44497n     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
            r2.mo47018g()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x02e4:
            r21.mo47647a()     // Catch:{ HttpException -> 0x02b8, IOException -> 0x02b5, RuntimeException -> 0x02b2 }
        L_0x02e7:
            return r12
        L_0x02e8:
            r21.m68193b()
            throw r2
        L_0x02ec:
            r21.m68193b()
            throw r2
        L_0x02f0:
            r21.m68193b()
            goto L_0x02f5
        L_0x02f4:
            throw r2
        L_0x02f5:
            goto L_0x02f4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.C15380l.execute(org.apache.http.l, org.apache.http.o, org.apache.http.j0.f):org.apache.http.r");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47648a(C15386r rVar, C15202b bVar) throws ProtocolException {
        try {
            URI k = rVar.mo46958k();
            if (bVar.mo47057h() == null || bVar.mo47054f()) {
                if (k.isAbsolute()) {
                    rVar.mo47656a(C15175f.m67288a(k, (C15460l) null));
                }
            } else if (!k.isAbsolute()) {
                rVar.mo47656a(C15175f.m67288a(k, bVar.mo47048b()));
            }
        } catch (URISyntaxException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid URI: ");
            sb.append(rVar.mo46956h().mo46856f());
            throw new ProtocolException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47647a() {
        try {
            this.f44497n.mo46983B();
        } catch (IOException e) {
            this.f44484a.mo46777a("IOException releasing connection", e);
        }
        this.f44497n = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15202b mo47644a(C15460l lVar, C15463o oVar, C15431f fVar) throws HttpException {
        if (lVar == null) {
            lVar = (C15460l) oVar.getParams().mo47549b(C15158c.f44031l);
        }
        if (lVar != null) {
            return this.f44486c.mo47061a(lVar, oVar, fVar);
        }
        throw new IllegalStateException("Target host must not be null, or set in parameters.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo47649a(C15202b bVar, int i, C15431f fVar) throws HttpException, IOException {
        throw new UnsupportedOperationException("Proxy chains are not supported.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15463o mo47646a(C15202b bVar, C15431f fVar) {
        C15460l b = bVar.mo47048b();
        String d = b.mo47782d();
        int e = b.mo47783e();
        if (e < 0) {
            e = this.f44485b.mo46988a().mo47087b(b.mo47785f()).mo47074a();
        }
        StringBuilder sb = new StringBuilder(d.length() + 6);
        sb.append(d);
        sb.append(':');
        sb.append(Integer.toString(e));
        return new C15332i(C7304t.f20665a, sb.toString(), C15359k.m68046d(this.f44496m));
    }

    public C15380l(C15435j jVar, C15179c cVar, C15116a aVar, C15183g gVar, C15204d dVar, C15434i iVar, C15139e eVar, C15140f fVar, C15135a aVar2, C15135a aVar3, C15143i iVar2, C15357i iVar3) {
        this(C15096h.m66940c(C15380l.class), jVar, cVar, aVar, gVar, dVar, iVar, eVar, fVar, aVar2, aVar3, iVar2, iVar3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C15387s mo47645a(C15387s sVar, C15466r rVar, C15431f fVar) throws HttpException, IOException {
        C15202b b = sVar.mo47664b();
        C15386r a = sVar.mo47663a();
        C15357i params = a.getParams();
        if (!C15161f.m67263c(params) || !this.f44492i.mo46942a(rVar, fVar)) {
            C15137c cVar = (C15137c) fVar.mo47685a(C15162a.f44043g);
            if (cVar != null && C15161f.m67262b(params)) {
                String str = "Authentication error: ";
                if (this.f44493j.mo46922a(rVar, fVar)) {
                    C15460l lVar = (C15460l) fVar.mo47685a(C15429d.f44567d);
                    if (lVar == null) {
                        lVar = b.mo47048b();
                    }
                    this.f44484a.mo46776a("Target requested authentication");
                    try {
                        m68191a(this.f44493j.mo46923b(rVar, fVar), this.f44498o, this.f44493j, rVar, fVar);
                    } catch (AuthenticationException e) {
                        if (this.f44484a.mo46778a()) {
                            C15089a aVar = this.f44484a;
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(e.getMessage());
                            aVar.mo46783d(sb.toString());
                            return null;
                        }
                    }
                    m68192a(this.f44498o, lVar, cVar);
                    if (this.f44498o.getCredentials() != null) {
                        return sVar;
                    }
                    return null;
                }
                this.f44498o.setAuthScope(null);
                if (this.f44494k.mo46922a(rVar, fVar)) {
                    C15460l h = b.mo47057h();
                    this.f44484a.mo46776a("Proxy requested authentication");
                    try {
                        m68191a(this.f44494k.mo46923b(rVar, fVar), this.f44499p, this.f44494k, rVar, fVar);
                    } catch (AuthenticationException e2) {
                        if (this.f44484a.mo46778a()) {
                            C15089a aVar2 = this.f44484a;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(e2.getMessage());
                            aVar2.mo46783d(sb2.toString());
                            return null;
                        }
                    }
                    m68192a(this.f44499p, h, cVar);
                    if (this.f44499p.getCredentials() != null) {
                        return sVar;
                    }
                    return null;
                }
                this.f44499p.setAuthScope(null);
            }
            return null;
        }
        int i = this.f44500q;
        if (i < this.f44501r) {
            this.f44500q = i + 1;
            this.f44502s = null;
            URI b2 = this.f44492i.mo46943b(rVar, fVar);
            C15460l lVar2 = new C15460l(b2.getHost(), b2.getPort(), b2.getScheme());
            this.f44498o.setAuthScope(null);
            this.f44499p.setAuthScope(null);
            if (!b.mo47048b().equals(lVar2)) {
                this.f44498o.invalidate();
                C15119b authScheme = this.f44499p.getAuthScheme();
                if (authScheme != null && authScheme.mo46870b()) {
                    this.f44499p.invalidate();
                }
            }
            C15384p pVar = new C15384p(a.mo28968e(), b2);
            pVar.mo47417a(a.mo47660o().mo47427f());
            C15386r rVar2 = new C15386r(pVar);
            rVar2.mo47416a(params);
            C15202b a2 = mo47644a(lVar2, (C15463o) rVar2, fVar);
            C15387s sVar2 = new C15387s(rVar2, a2);
            if (this.f44484a.mo46785d()) {
                C15089a aVar3 = this.f44484a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Redirecting to '");
                sb3.append(b2);
                sb3.append("' via ");
                sb3.append(a2);
                aVar3.mo46776a(sb3.toString());
            }
            return sVar2;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Maximum redirects (");
        sb4.append(this.f44501r);
        sb4.append(") exceeded");
        throw new RedirectException(sb4.toString());
    }

    /* renamed from: b */
    private void m68193b() {
        C15187k kVar = this.f44497n;
        if (kVar != null) {
            this.f44497n = null;
            try {
                kVar.mo46984F();
            } catch (IOException e) {
                if (this.f44484a.mo46785d()) {
                    this.f44484a.mo46777a(e.getMessage(), e);
                }
            }
            try {
                kVar.mo46983B();
            } catch (IOException e2) {
                this.f44484a.mo46777a("Error releasing connection", e2);
            }
        }
    }

    /* renamed from: a */
    private void m68191a(Map<String, C15133c> map, AuthState authState, C15135a aVar, C15466r rVar, C15431f fVar) throws MalformedChallengeException, AuthenticationException {
        C15119b authScheme = authState.getAuthScheme();
        if (authScheme == null) {
            authScheme = aVar.mo46921a(map, rVar, fVar);
            authState.setAuthScheme(authScheme);
        }
        String c = authScheme.mo46871c();
        C15133c cVar = (C15133c) map.get(c.toLowerCase(Locale.ENGLISH));
        if (cVar != null) {
            authScheme.mo46868a(cVar);
            this.f44484a.mo46776a("Authorization challenge processed");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(" authorization challenge expected, but not found");
        throw new AuthenticationException(sb.toString());
    }

    /* renamed from: a */
    private void m68192a(AuthState authState, C15460l lVar, C15137c cVar) {
        if (authState.isValid()) {
            String d = lVar.mo47782d();
            int e = lVar.mo47783e();
            if (e < 0) {
                e = this.f44485b.mo46988a().mo47085a(lVar).mo47074a();
            }
            C15119b authScheme = authState.getAuthScheme();
            C15122e eVar = new C15122e(d, e, authScheme.mo46866a(), authScheme.mo46871c());
            if (this.f44484a.mo46785d()) {
                C15089a aVar = this.f44484a;
                StringBuilder sb = new StringBuilder();
                sb.append("Authentication scope: ");
                sb.append(eVar);
                aVar.mo46776a(sb.toString());
            }
            C15124g credentials = authState.getCredentials();
            if (credentials == null) {
                credentials = cVar.mo46928a(eVar);
                if (this.f44484a.mo46785d()) {
                    if (credentials != null) {
                        this.f44484a.mo46776a("Found credentials");
                    } else {
                        this.f44484a.mo46776a("Credentials not found");
                    }
                }
            } else if (authScheme.mo46872d()) {
                this.f44484a.mo46776a("Authentication failed");
                credentials = null;
            }
            authState.setAuthScope(eVar);
            authState.setCredentials(credentials);
        }
    }
}
