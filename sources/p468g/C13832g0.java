package p468g;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import p201f.p202a.C5952h;

/* renamed from: g.g0 */
/* compiled from: Route */
public final class C13832g0 {

    /* renamed from: a */
    final C13798a f40006a;

    /* renamed from: b */
    final Proxy f40007b;

    /* renamed from: c */
    final InetSocketAddress f40008c;

    public C13832g0(C13798a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f40006a = aVar;
            this.f40007b = proxy;
            this.f40008c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    /* renamed from: a */
    public C13798a mo43466a() {
        return this.f40006a;
    }

    /* renamed from: b */
    public Proxy mo43467b() {
        return this.f40007b;
    }

    /* renamed from: c */
    public boolean mo43468c() {
        return this.f40006a.f39866i != null && this.f40007b.type() == Type.HTTP;
    }

    /* renamed from: d */
    public InetSocketAddress mo43469d() {
        return this.f40008c;
    }

    public boolean equals(@C5952h Object obj) {
        if (obj instanceof C13832g0) {
            C13832g0 g0Var = (C13832g0) obj;
            if (g0Var.f40006a.equals(this.f40006a) && g0Var.f40007b.equals(this.f40007b) && g0Var.f40008c.equals(this.f40008c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f40006a.hashCode()) * 31) + this.f40007b.hashCode()) * 31) + this.f40008c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Route{");
        sb.append(this.f40008c);
        sb.append("}");
        return sb.toString();
    }
}
