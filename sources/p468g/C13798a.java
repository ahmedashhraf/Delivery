package p468g;

import com.facebook.common.util.UriUtil;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.C14910b;
import p201f.p202a.C5952h;
import p468g.C13868v.C13869a;

/* renamed from: g.a */
/* compiled from: Address */
public final class C13798a {

    /* renamed from: a */
    final C13868v f39858a;

    /* renamed from: b */
    final C13857q f39859b;

    /* renamed from: c */
    final SocketFactory f39860c;

    /* renamed from: d */
    final C13800b f39861d;

    /* renamed from: e */
    final List<C13799a0> f39862e;

    /* renamed from: f */
    final List<C13848l> f39863f;

    /* renamed from: g */
    final ProxySelector f39864g;
    @C5952h

    /* renamed from: h */
    final Proxy f39865h;
    @C5952h

    /* renamed from: i */
    final SSLSocketFactory f39866i;
    @C5952h

    /* renamed from: j */
    final HostnameVerifier f39867j;
    @C5952h

    /* renamed from: k */
    final C13829g f39868k;

    public C13798a(String str, int i, C13857q qVar, SocketFactory socketFactory, @C5952h SSLSocketFactory sSLSocketFactory, @C5952h HostnameVerifier hostnameVerifier, @C5952h C13829g gVar, C13800b bVar, @C5952h Proxy proxy, List<C13799a0> list, List<C13848l> list2, ProxySelector proxySelector) {
        this.f39858a = new C13869a().mo43694p(sSLSocketFactory != null ? UriUtil.HTTPS_SCHEME : "http").mo43689k(str).mo43667a(i).mo43672a();
        if (qVar != null) {
            this.f39859b = qVar;
            if (socketFactory != null) {
                this.f39860c = socketFactory;
                if (bVar != null) {
                    this.f39861d = bVar;
                    if (list != null) {
                        this.f39862e = C14910b.m66049a(list);
                        if (list2 != null) {
                            this.f39863f = C14910b.m66049a(list2);
                            if (proxySelector != null) {
                                this.f39864g = proxySelector;
                                this.f39865h = proxy;
                                this.f39866i = sSLSocketFactory;
                                this.f39867j = hostnameVerifier;
                                this.f39868k = gVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    @C5952h
    /* renamed from: a */
    public C13829g mo43273a() {
        return this.f39868k;
    }

    /* renamed from: b */
    public List<C13848l> mo43275b() {
        return this.f39863f;
    }

    /* renamed from: c */
    public C13857q mo43276c() {
        return this.f39859b;
    }

    @C5952h
    /* renamed from: d */
    public HostnameVerifier mo43277d() {
        return this.f39867j;
    }

    /* renamed from: e */
    public List<C13799a0> mo43278e() {
        return this.f39862e;
    }

    public boolean equals(@C5952h Object obj) {
        if (obj instanceof C13798a) {
            C13798a aVar = (C13798a) obj;
            if (this.f39858a.equals(aVar.f39858a) && mo43274a(aVar)) {
                return true;
            }
        }
        return false;
    }

    @C5952h
    /* renamed from: f */
    public Proxy mo43280f() {
        return this.f39865h;
    }

    /* renamed from: g */
    public C13800b mo43281g() {
        return this.f39861d;
    }

    /* renamed from: h */
    public ProxySelector mo43282h() {
        return this.f39864g;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.f39858a.hashCode()) * 31) + this.f39859b.hashCode()) * 31) + this.f39861d.hashCode()) * 31) + this.f39862e.hashCode()) * 31) + this.f39863f.hashCode()) * 31) + this.f39864g.hashCode()) * 31;
        Proxy proxy = this.f39865h;
        int i = 0;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f39866i;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f39867j;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C13829g gVar = this.f39868k;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public SocketFactory mo43284i() {
        return this.f39860c;
    }

    @C5952h
    /* renamed from: j */
    public SSLSocketFactory mo43285j() {
        return this.f39866i;
    }

    /* renamed from: k */
    public C13868v mo43286k() {
        return this.f39858a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f39858a.mo43649h());
        sb.append(":");
        sb.append(this.f39858a.mo43656n());
        if (this.f39865h != null) {
            sb.append(", proxy=");
            sb.append(this.f39865h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f39864g);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo43274a(C13798a aVar) {
        return this.f39859b.equals(aVar.f39859b) && this.f39861d.equals(aVar.f39861d) && this.f39862e.equals(aVar.f39862e) && this.f39863f.equals(aVar.f39863f) && this.f39864g.equals(aVar.f39864g) && C14910b.m66061a((Object) this.f39865h, (Object) aVar.f39865h) && C14910b.m66061a((Object) this.f39866i, (Object) aVar.f39866i) && C14910b.m66061a((Object) this.f39867j, (Object) aVar.f39867j) && C14910b.m66061a((Object) this.f39868k, (Object) aVar.f39868k) && mo43286k().mo43656n() == aVar.mo43286k().mo43656n();
    }
}
