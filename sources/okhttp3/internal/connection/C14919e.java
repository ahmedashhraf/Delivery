package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.internal.C14910b;
import p468g.C13798a;
import p468g.C13821e;
import p468g.C13832g0;
import p468g.C13859r;
import p468g.C13868v;

/* renamed from: okhttp3.internal.connection.e */
/* compiled from: RouteSelector */
public final class C14919e {

    /* renamed from: a */
    private final C13798a f43205a;

    /* renamed from: b */
    private final C14918d f43206b;

    /* renamed from: c */
    private final C13821e f43207c;

    /* renamed from: d */
    private final C13859r f43208d;

    /* renamed from: e */
    private List<Proxy> f43209e = Collections.emptyList();

    /* renamed from: f */
    private int f43210f;

    /* renamed from: g */
    private List<InetSocketAddress> f43211g = Collections.emptyList();

    /* renamed from: h */
    private final List<C13832g0> f43212h = new ArrayList();

    /* renamed from: okhttp3.internal.connection.e$a */
    /* compiled from: RouteSelector */
    public static final class C14920a {

        /* renamed from: a */
        private final List<C13832g0> f43213a;

        /* renamed from: b */
        private int f43214b = 0;

        C14920a(List<C13832g0> list) {
            this.f43213a = list;
        }

        /* renamed from: a */
        public List<C13832g0> mo46393a() {
            return new ArrayList(this.f43213a);
        }

        /* renamed from: b */
        public boolean mo46394b() {
            return this.f43214b < this.f43213a.size();
        }

        /* renamed from: c */
        public C13832g0 mo46395c() {
            if (mo46394b()) {
                List<C13832g0> list = this.f43213a;
                int i = this.f43214b;
                this.f43214b = i + 1;
                return (C13832g0) list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public C14919e(C13798a aVar, C14918d dVar, C13821e eVar, C13859r rVar) {
        this.f43205a = aVar;
        this.f43206b = dVar;
        this.f43207c = eVar;
        this.f43208d = rVar;
        m66109a(aVar.mo43286k(), aVar.mo43280f());
    }

    /* renamed from: c */
    private boolean m66111c() {
        return this.f43210f < this.f43209e.size();
    }

    /* renamed from: d */
    private Proxy m66112d() throws IOException {
        if (m66111c()) {
            List<Proxy> list = this.f43209e;
            int i = this.f43210f;
            this.f43210f = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            m66110a(proxy);
            return proxy;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No route to ");
        sb.append(this.f43205a.mo43286k().mo43649h());
        sb.append("; exhausted proxy configurations: ");
        sb.append(this.f43209e);
        throw new SocketException(sb.toString());
    }

    /* renamed from: a */
    public boolean mo46391a() {
        return m66111c() || !this.f43212h.isEmpty();
    }

    /* renamed from: b */
    public C14920a mo46392b() throws IOException {
        if (mo46391a()) {
            ArrayList arrayList = new ArrayList();
            while (m66111c()) {
                Proxy d = m66112d();
                int size = this.f43211g.size();
                for (int i = 0; i < size; i++) {
                    C13832g0 g0Var = new C13832g0(this.f43205a, d, (InetSocketAddress) this.f43211g.get(i));
                    if (this.f43206b.mo46389c(g0Var)) {
                        this.f43212h.add(g0Var);
                    } else {
                        arrayList.add(g0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f43212h);
                this.f43212h.clear();
            }
            return new C14920a(arrayList);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public void mo46390a(C13832g0 g0Var, IOException iOException) {
        if (!(g0Var.mo43467b().type() == Type.DIRECT || this.f43205a.mo43282h() == null)) {
            this.f43205a.mo43282h().connectFailed(this.f43205a.mo43286k().mo43664u(), g0Var.mo43467b().address(), iOException);
        }
        this.f43206b.mo46388b(g0Var);
    }

    /* renamed from: a */
    private void m66109a(C13868v vVar, Proxy proxy) {
        List<Proxy> list;
        if (proxy != null) {
            this.f43209e = Collections.singletonList(proxy);
        } else {
            List select = this.f43205a.mo43282h().select(vVar.mo43664u());
            if (select == null || select.isEmpty()) {
                list = C14910b.m66050a((T[]) new Proxy[]{Proxy.NO_PROXY});
            } else {
                list = C14910b.m66049a(select);
            }
            this.f43209e = list;
        }
        this.f43210f = 0;
    }

    /* renamed from: a */
    private void m66110a(Proxy proxy) throws IOException {
        String str;
        int i;
        this.f43211g = new ArrayList();
        if (proxy.type() == Type.DIRECT || proxy.type() == Type.SOCKS) {
            str = this.f43205a.mo43286k().mo43649h();
            i = this.f43205a.mo43286k().mo43656n();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = m66108a(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Proxy.address() is not an InetSocketAddress: ");
                sb.append(address.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i < 1 || i > 65535) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No route to ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i);
            sb2.append("; port is out of range");
            throw new SocketException(sb2.toString());
        } else if (proxy.type() == Type.SOCKS) {
            this.f43211g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f43208d.mo43580a(this.f43207c, str);
            List lookup = this.f43205a.mo43276c().lookup(str);
            if (!lookup.isEmpty()) {
                this.f43208d.mo43581a(this.f43207c, str, lookup);
                int size = lookup.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f43211g.add(new InetSocketAddress((InetAddress) lookup.get(i2), i));
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f43205a.mo43276c());
            sb3.append(" returned no addresses for ");
            sb3.append(str);
            throw new UnknownHostException(sb3.toString());
        }
    }

    /* renamed from: a */
    static String m66108a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
