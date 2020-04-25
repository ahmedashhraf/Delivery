package p468g;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.C14910b;
import okhttp3.internal.Internal;
import okhttp3.internal.connection.C14916c;
import okhttp3.internal.connection.C14918d;
import okhttp3.internal.connection.C14921f;
import okhttp3.internal.p514e.C14937f;
import okhttp3.internal.p519j.C15011f;
import okhttp3.internal.p520k.C15012a;
import okhttp3.internal.p521l.C15015c;
import okhttp3.internal.p521l.C15017e;
import okhttp3.internal.p522m.C15019a;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p201f.p202a.C5952h;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;
import p468g.C13821e.C13822a;
import p468g.C13823e0.C13824a;
import p468g.C13837i0.C13838a;
import p468g.C13859r.C13862c;
import p468g.C13866u.C13867a;

/* renamed from: g.z */
/* compiled from: OkHttpClient */
public class C13876z implements Cloneable, C13822a, C13838a {

    /* renamed from: n0 */
    static final List<C13799a0> f40262n0 = C14910b.m66050a((T[]) new C13799a0[]{C13799a0.HTTP_2, C13799a0.HTTP_1_1});

    /* renamed from: o0 */
    static final List<C13848l> f40263o0 = C14910b.m66050a((T[]) new C13848l[]{C13848l.f40149h, C13848l.f40151j});

    /* renamed from: N */
    final List<C13799a0> f40264N;

    /* renamed from: O */
    final List<C13848l> f40265O;

    /* renamed from: P */
    final List<C13870w> f40266P;

    /* renamed from: Q */
    final List<C13870w> f40267Q;

    /* renamed from: R */
    final C13862c f40268R;

    /* renamed from: S */
    final ProxySelector f40269S;

    /* renamed from: T */
    final C13853n f40270T;
    @C5952h

    /* renamed from: U */
    final C13805c f40271U;
    @C5952h

    /* renamed from: V */
    final C14937f f40272V;

    /* renamed from: W */
    final SocketFactory f40273W;

    /* renamed from: X */
    final SSLSocketFactory f40274X;

    /* renamed from: Y */
    final C15015c f40275Y;

    /* renamed from: Z */
    final HostnameVerifier f40276Z;

    /* renamed from: a */
    final C13856p f40277a;

    /* renamed from: a0 */
    final C13829g f40278a0;
    @C5952h

    /* renamed from: b */
    final Proxy f40279b;

    /* renamed from: b0 */
    final C13800b f40280b0;

    /* renamed from: c0 */
    final C13800b f40281c0;

    /* renamed from: d0 */
    final C13841k f40282d0;

    /* renamed from: e0 */
    final C13857q f40283e0;

    /* renamed from: f0 */
    final boolean f40284f0;

    /* renamed from: g0 */
    final boolean f40285g0;

    /* renamed from: h0 */
    final boolean f40286h0;

    /* renamed from: i0 */
    final int f40287i0;

    /* renamed from: j0 */
    final int f40288j0;

    /* renamed from: k0 */
    final int f40289k0;

    /* renamed from: l0 */
    final int f40290l0;

    /* renamed from: m0 */
    final int f40291m0;

    /* renamed from: g.z$a */
    /* compiled from: OkHttpClient */
    class C13877a extends Internal {
        C13877a() {
        }

        public void addLenient(C13867a aVar, String str) {
            aVar.mo43628b(str);
        }

        public void apply(C13848l lVar, SSLSocket sSLSocket, boolean z) {
            lVar.mo43516a(sSLSocket, z);
        }

        public int code(C13824a aVar) {
            return aVar.f39980c;
        }

        public boolean connectionBecameIdle(C13841k kVar, C14916c cVar) {
            return kVar.mo43507a(cVar);
        }

        public Socket deduplicate(C13841k kVar, C13798a aVar, C14921f fVar) {
            return kVar.mo43505a(aVar, fVar);
        }

        public boolean equalsNonHost(C13798a aVar, C13798a aVar2) {
            return aVar.mo43274a(aVar2);
        }

        public C14916c get(C13841k kVar, C13798a aVar, C14921f fVar, C13832g0 g0Var) {
            return kVar.mo43506a(aVar, fVar, g0Var);
        }

        public boolean isInvalidHttpUrlHost(IllegalArgumentException illegalArgumentException) {
            return illegalArgumentException.getMessage().startsWith("Invalid URL host");
        }

        public C13821e newWebSocketCall(C13876z zVar, C13813c0 c0Var) {
            return C13802b0.m58926a(zVar, c0Var, true);
        }

        public void put(C13841k kVar, C14916c cVar) {
            kVar.mo43509b(cVar);
        }

        public C14918d routeDatabase(C13841k kVar) {
            return kVar.f40139e;
        }

        public void setCache(C13878b bVar, C14937f fVar) {
            bVar.mo43792a(fVar);
        }

        public C14921f streamAllocation(C13821e eVar) {
            return ((C13802b0) eVar).mo43294c();
        }

        @C5952h
        public IOException timeoutExit(C13821e eVar, @C5952h IOException iOException) {
            return ((C13802b0) eVar).mo43291a(iOException);
        }

        public void addLenient(C13867a aVar, String str, String str2) {
            aVar.mo43629b(str, str2);
        }
    }

    /* renamed from: g.z$b */
    /* compiled from: OkHttpClient */
    public static final class C13878b {

        /* renamed from: A */
        int f40292A;

        /* renamed from: B */
        int f40293B;

        /* renamed from: a */
        C13856p f40294a;
        @C5952h

        /* renamed from: b */
        Proxy f40295b;

        /* renamed from: c */
        List<C13799a0> f40296c;

        /* renamed from: d */
        List<C13848l> f40297d;

        /* renamed from: e */
        final List<C13870w> f40298e;

        /* renamed from: f */
        final List<C13870w> f40299f;

        /* renamed from: g */
        C13862c f40300g;

        /* renamed from: h */
        ProxySelector f40301h;

        /* renamed from: i */
        C13853n f40302i;
        @C5952h

        /* renamed from: j */
        C13805c f40303j;
        @C5952h

        /* renamed from: k */
        C14937f f40304k;

        /* renamed from: l */
        SocketFactory f40305l;
        @C5952h

        /* renamed from: m */
        SSLSocketFactory f40306m;
        @C5952h

        /* renamed from: n */
        C15015c f40307n;

        /* renamed from: o */
        HostnameVerifier f40308o;

        /* renamed from: p */
        C13829g f40309p;

        /* renamed from: q */
        C13800b f40310q;

        /* renamed from: r */
        C13800b f40311r;

        /* renamed from: s */
        C13841k f40312s;

        /* renamed from: t */
        C13857q f40313t;

        /* renamed from: u */
        boolean f40314u;

        /* renamed from: v */
        boolean f40315v;

        /* renamed from: w */
        boolean f40316w;

        /* renamed from: x */
        int f40317x;

        /* renamed from: y */
        int f40318y;

        /* renamed from: z */
        int f40319z;

        public C13878b() {
            this.f40298e = new ArrayList();
            this.f40299f = new ArrayList();
            this.f40294a = new C13856p();
            this.f40296c = C13876z.f40262n0;
            this.f40297d = C13876z.f40263o0;
            this.f40300g = C13859r.m59197a(C13859r.f40192a);
            this.f40301h = ProxySelector.getDefault();
            if (this.f40301h == null) {
                this.f40301h = new C15012a();
            }
            this.f40302i = C13853n.f40182a;
            this.f40305l = SocketFactory.getDefault();
            this.f40308o = C15017e.f43651a;
            this.f40309p = C13829g.f39997c;
            C13800b bVar = C13800b.f39869a;
            this.f40310q = bVar;
            this.f40311r = bVar;
            this.f40312s = new C13841k();
            this.f40313t = C13857q.f40191a;
            this.f40314u = true;
            this.f40315v = true;
            this.f40316w = true;
            this.f40317x = 0;
            this.f40318y = C14236a.DEFAULT_TIMEOUT;
            this.f40319z = C14236a.DEFAULT_TIMEOUT;
            this.f40292A = C14236a.DEFAULT_TIMEOUT;
            this.f40293B = 0;
        }

        /* renamed from: a */
        public C13878b mo43771a(long j, TimeUnit timeUnit) {
            this.f40317x = C14910b.m66040a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: b */
        public C13878b mo43793b(long j, TimeUnit timeUnit) {
            this.f40318y = C14910b.m66040a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: c */
        public C13878b mo43800c(long j, TimeUnit timeUnit) {
            this.f40293B = C14910b.m66040a("interval", j, timeUnit);
            return this;
        }

        /* renamed from: d */
        public C13878b mo43804d(long j, TimeUnit timeUnit) {
            this.f40319z = C14910b.m66040a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: e */
        public C13878b mo43806e(long j, TimeUnit timeUnit) {
            this.f40292A = C14910b.m66040a("timeout", j, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        /* renamed from: a */
        public C13878b mo43784a(Duration duration) {
            this.f40317x = C14910b.m66040a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        /* renamed from: b */
        public C13878b mo43796b(Duration duration) {
            this.f40318y = C14910b.m66040a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        /* renamed from: c */
        public C13878b mo43801c(Duration duration) {
            this.f40293B = C14910b.m66040a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        /* renamed from: d */
        public C13878b mo43805d(Duration duration) {
            this.f40319z = C14910b.m66040a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        /* renamed from: e */
        public C13878b mo43807e(Duration duration) {
            this.f40292A = C14910b.m66040a("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /* renamed from: a */
        public C13878b mo43782a(@C5952h Proxy proxy) {
            this.f40295b = proxy;
            return this;
        }

        /* renamed from: b */
        public C13878b mo43794b(C13800b bVar) {
            if (bVar != null) {
                this.f40310q = bVar;
                return this;
            }
            throw new NullPointerException("proxyAuthenticator == null");
        }

        /* renamed from: c */
        public C13878b mo43802c(boolean z) {
            this.f40316w = z;
            return this;
        }

        /* renamed from: a */
        public C13878b mo43783a(ProxySelector proxySelector) {
            if (proxySelector != null) {
                this.f40301h = proxySelector;
                return this;
            }
            throw new NullPointerException("proxySelector == null");
        }

        /* renamed from: c */
        public List<C13870w> mo43803c() {
            return this.f40299f;
        }

        /* renamed from: b */
        public C13878b mo43798b(boolean z) {
            this.f40314u = z;
            return this;
        }

        /* renamed from: a */
        public C13878b mo43776a(C13853n nVar) {
            if (nVar != null) {
                this.f40302i = nVar;
                return this;
            }
            throw new NullPointerException("cookieJar == null");
        }

        /* renamed from: b */
        public C13878b mo43797b(List<C13799a0> list) {
            ArrayList arrayList = new ArrayList(list);
            if (!arrayList.contains(C13799a0.H2_PRIOR_KNOWLEDGE) && !arrayList.contains(C13799a0.HTTP_1_1)) {
                StringBuilder sb = new StringBuilder();
                sb.append("protocols must contain h2_prior_knowledge or http/1.1: ");
                sb.append(arrayList);
                throw new IllegalArgumentException(sb.toString());
            } else if (arrayList.contains(C13799a0.H2_PRIOR_KNOWLEDGE) && arrayList.size() > 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("protocols containing h2_prior_knowledge cannot use other protocols: ");
                sb2.append(arrayList);
                throw new IllegalArgumentException(sb2.toString());
            } else if (arrayList.contains(C13799a0.HTTP_1_0)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("protocols must not contain http/1.0: ");
                sb3.append(arrayList);
                throw new IllegalArgumentException(sb3.toString());
            } else if (!arrayList.contains(null)) {
                arrayList.remove(C13799a0.SPDY_3);
                this.f40296c = Collections.unmodifiableList(arrayList);
                return this;
            } else {
                throw new IllegalArgumentException("protocols must not contain null");
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo43792a(@C5952h C14937f fVar) {
            this.f40304k = fVar;
            this.f40303j = null;
        }

        /* renamed from: a */
        public C13878b mo43773a(@C5952h C13805c cVar) {
            this.f40303j = cVar;
            this.f40304k = null;
            return this;
        }

        /* renamed from: a */
        public C13878b mo43778a(C13857q qVar) {
            if (qVar != null) {
                this.f40313t = qVar;
                return this;
            }
            throw new NullPointerException("dns == null");
        }

        /* renamed from: a */
        public C13878b mo43786a(SocketFactory socketFactory) {
            if (socketFactory != null) {
                this.f40305l = socketFactory;
                return this;
            }
            throw new NullPointerException("socketFactory == null");
        }

        /* renamed from: a */
        public C13878b mo43788a(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory != null) {
                this.f40306m = sSLSocketFactory;
                this.f40307n = C15011f.m66571d().mo46641a(sSLSocketFactory);
                return this;
            }
            throw new NullPointerException("sslSocketFactory == null");
        }

        /* renamed from: b */
        public List<C13870w> mo43799b() {
            return this.f40298e;
        }

        /* renamed from: a */
        public C13878b mo43789a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            } else if (x509TrustManager != null) {
                this.f40306m = sSLSocketFactory;
                this.f40307n = C15015c.m66591a(x509TrustManager);
                return this;
            } else {
                throw new NullPointerException("trustManager == null");
            }
        }

        /* renamed from: b */
        public C13878b mo43795b(C13870w wVar) {
            if (wVar != null) {
                this.f40299f.add(wVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: a */
        public C13878b mo43787a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f40308o = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        /* renamed from: a */
        public C13878b mo43774a(C13829g gVar) {
            if (gVar != null) {
                this.f40309p = gVar;
                return this;
            }
            throw new NullPointerException("certificatePinner == null");
        }

        C13878b(C13876z zVar) {
            this.f40298e = new ArrayList();
            this.f40299f = new ArrayList();
            this.f40294a = zVar.f40277a;
            this.f40295b = zVar.f40279b;
            this.f40296c = zVar.f40264N;
            this.f40297d = zVar.f40265O;
            this.f40298e.addAll(zVar.f40266P);
            this.f40299f.addAll(zVar.f40267Q);
            this.f40300g = zVar.f40268R;
            this.f40301h = zVar.f40269S;
            this.f40302i = zVar.f40270T;
            this.f40304k = zVar.f40272V;
            this.f40303j = zVar.f40271U;
            this.f40305l = zVar.f40273W;
            this.f40306m = zVar.f40274X;
            this.f40307n = zVar.f40275Y;
            this.f40308o = zVar.f40276Z;
            this.f40309p = zVar.f40278a0;
            this.f40310q = zVar.f40280b0;
            this.f40311r = zVar.f40281c0;
            this.f40312s = zVar.f40282d0;
            this.f40313t = zVar.f40283e0;
            this.f40314u = zVar.f40284f0;
            this.f40315v = zVar.f40285g0;
            this.f40316w = zVar.f40286h0;
            this.f40317x = zVar.f40287i0;
            this.f40318y = zVar.f40288j0;
            this.f40319z = zVar.f40289k0;
            this.f40292A = zVar.f40290l0;
            this.f40293B = zVar.f40291m0;
        }

        /* renamed from: a */
        public C13878b mo43772a(C13800b bVar) {
            if (bVar != null) {
                this.f40311r = bVar;
                return this;
            }
            throw new NullPointerException("authenticator == null");
        }

        /* renamed from: a */
        public C13878b mo43775a(C13841k kVar) {
            if (kVar != null) {
                this.f40312s = kVar;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        /* renamed from: a */
        public C13878b mo43790a(boolean z) {
            this.f40315v = z;
            return this;
        }

        /* renamed from: a */
        public C13878b mo43777a(C13856p pVar) {
            if (pVar != null) {
                this.f40294a = pVar;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        /* renamed from: a */
        public C13878b mo43785a(List<C13848l> list) {
            this.f40297d = C14910b.m66049a(list);
            return this;
        }

        /* renamed from: a */
        public C13878b mo43781a(C13870w wVar) {
            if (wVar != null) {
                this.f40298e.add(wVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: a */
        public C13878b mo43780a(C13859r rVar) {
            if (rVar != null) {
                this.f40300g = C13859r.m59197a(rVar);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        /* renamed from: a */
        public C13878b mo43779a(C13862c cVar) {
            if (cVar != null) {
                this.f40300g = cVar;
                return this;
            }
            throw new NullPointerException("eventListenerFactory == null");
        }

        /* renamed from: a */
        public C13876z mo43791a() {
            return new C13876z(this);
        }
    }

    static {
        Internal.instance = new C13877a();
    }

    public C13876z() {
        this(new C13878b());
    }

    /* renamed from: a */
    private static SSLSocketFactory m59386a(X509TrustManager x509TrustManager) {
        try {
            SSLContext b = C15011f.m66571d().mo46620b();
            b.init(null, new TrustManager[]{x509TrustManager}, null);
            return b.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw C14910b.m66042a("No System TLS", (Exception) e);
        }
    }

    /* renamed from: A */
    public SocketFactory mo43728A() {
        return this.f40273W;
    }

    /* renamed from: C */
    public SSLSocketFactory mo43729C() {
        return this.f40274X;
    }

    /* renamed from: D */
    public int mo43730D() {
        return this.f40290l0;
    }

    /* renamed from: b */
    public C13800b mo43731b() {
        return this.f40281c0;
    }

    @C5952h
    /* renamed from: c */
    public C13805c mo43732c() {
        return this.f40271U;
    }

    /* renamed from: d */
    public int mo43733d() {
        return this.f40287i0;
    }

    /* renamed from: e */
    public C13829g mo43734e() {
        return this.f40278a0;
    }

    /* renamed from: f */
    public int mo43735f() {
        return this.f40288j0;
    }

    /* renamed from: g */
    public C13841k mo43736g() {
        return this.f40282d0;
    }

    /* renamed from: h */
    public List<C13848l> mo43737h() {
        return this.f40265O;
    }

    /* renamed from: i */
    public C13853n mo43738i() {
        return this.f40270T;
    }

    /* renamed from: j */
    public C13856p mo43739j() {
        return this.f40277a;
    }

    /* renamed from: k */
    public C13857q mo43740k() {
        return this.f40283e0;
    }

    /* renamed from: l */
    public C13862c mo43741l() {
        return this.f40268R;
    }

    /* renamed from: m */
    public boolean mo43742m() {
        return this.f40285g0;
    }

    /* renamed from: n */
    public boolean mo43743n() {
        return this.f40284f0;
    }

    /* renamed from: o */
    public HostnameVerifier mo43744o() {
        return this.f40276Z;
    }

    /* renamed from: p */
    public List<C13870w> mo43745p() {
        return this.f40266P;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public C14937f mo43746q() {
        C13805c cVar = this.f40271U;
        return cVar != null ? cVar.f39890a : this.f40272V;
    }

    /* renamed from: r */
    public List<C13870w> mo43747r() {
        return this.f40267Q;
    }

    /* renamed from: s */
    public C13878b mo43748s() {
        return new C13878b(this);
    }

    /* renamed from: t */
    public int mo43749t() {
        return this.f40291m0;
    }

    /* renamed from: u */
    public List<C13799a0> mo43750u() {
        return this.f40264N;
    }

    @C5952h
    /* renamed from: v */
    public Proxy mo43751v() {
        return this.f40279b;
    }

    /* renamed from: w */
    public C13800b mo43752w() {
        return this.f40280b0;
    }

    /* renamed from: x */
    public ProxySelector mo43753x() {
        return this.f40269S;
    }

    /* renamed from: y */
    public int mo43754y() {
        return this.f40289k0;
    }

    /* renamed from: z */
    public boolean mo43755z() {
        return this.f40286h0;
    }

    C13876z(C13878b bVar) {
        boolean z;
        this.f40277a = bVar.f40294a;
        this.f40279b = bVar.f40295b;
        this.f40264N = bVar.f40296c;
        this.f40265O = bVar.f40297d;
        this.f40266P = C14910b.m66049a(bVar.f40298e);
        this.f40267Q = C14910b.m66049a(bVar.f40299f);
        this.f40268R = bVar.f40300g;
        this.f40269S = bVar.f40301h;
        this.f40270T = bVar.f40302i;
        this.f40271U = bVar.f40303j;
        this.f40272V = bVar.f40304k;
        this.f40273W = bVar.f40305l;
        Iterator it = this.f40265O.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C13848l lVar = (C13848l) it.next();
                if (z || lVar.mo43518b()) {
                    z = true;
                }
            }
        }
        if (bVar.f40306m != null || !z) {
            this.f40274X = bVar.f40306m;
            this.f40275Y = bVar.f40307n;
        } else {
            X509TrustManager a = C14910b.m66053a();
            this.f40274X = m59386a(a);
            this.f40275Y = C15015c.m66591a(a);
        }
        if (this.f40274X != null) {
            C15011f.m66571d().mo46632b(this.f40274X);
        }
        this.f40276Z = bVar.f40308o;
        this.f40278a0 = bVar.f40309p.mo43454a(this.f40275Y);
        this.f40280b0 = bVar.f40310q;
        this.f40281c0 = bVar.f40311r;
        this.f40282d0 = bVar.f40312s;
        this.f40283e0 = bVar.f40313t;
        this.f40284f0 = bVar.f40314u;
        this.f40285g0 = bVar.f40315v;
        this.f40286h0 = bVar.f40316w;
        this.f40287i0 = bVar.f40317x;
        this.f40288j0 = bVar.f40318y;
        this.f40289k0 = bVar.f40319z;
        this.f40290l0 = bVar.f40292A;
        this.f40291m0 = bVar.f40293B;
        if (this.f40266P.contains(null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Null interceptor: ");
            sb.append(this.f40266P);
            throw new IllegalStateException(sb.toString());
        } else if (this.f40267Q.contains(null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Null network interceptor: ");
            sb2.append(this.f40267Q);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: a */
    public C13821e mo43405a(C13813c0 c0Var) {
        return C13802b0.m58926a(this, c0Var, false);
    }

    /* renamed from: a */
    public C13837i0 mo43492a(C13813c0 c0Var, C13840j0 j0Var) {
        C15019a aVar = new C15019a(c0Var, j0Var, new Random(), (long) this.f40291m0);
        aVar.mo46655a(this);
        return aVar;
    }
}
