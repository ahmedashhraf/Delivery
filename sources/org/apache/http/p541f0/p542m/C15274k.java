package org.apache.http.p541f0.p542m;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.http.C15460l;
import org.apache.http.C15463o;
import org.apache.http.HttpException;
import org.apache.http.conn.p534n.C15200j;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.conn.p535o.C15204d;
import org.apache.http.conn.p536p.C15213e;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p549j0.C15431f;

@C6145c
/* renamed from: org.apache.http.f0.m.k */
/* compiled from: ProxySelectorRoutePlanner */
public class C15274k implements C15204d {

    /* renamed from: a */
    protected final C15213e f44243a;

    /* renamed from: b */
    protected ProxySelector f44244b;

    /* renamed from: org.apache.http.f0.m.k$a */
    /* compiled from: ProxySelectorRoutePlanner */
    static /* synthetic */ class C15275a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44245a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44245a = r0
                int[] r0 = f44245a     // Catch:{ NoSuchFieldError -> 0x0014 }
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44245a     // Catch:{ NoSuchFieldError -> 0x001f }
                java.net.Proxy$Type r1 = java.net.Proxy.Type.HTTP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f44245a     // Catch:{ NoSuchFieldError -> 0x002a }
                java.net.Proxy$Type r1 = java.net.Proxy.Type.SOCKS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.http.p541f0.p542m.C15274k.C15275a.<clinit>():void");
        }
    }

    public C15274k(C15213e eVar, ProxySelector proxySelector) {
        if (eVar != null) {
            this.f44243a = eVar;
            this.f44244b = proxySelector;
            return;
        }
        throw new IllegalArgumentException("SchemeRegistry must not be null.");
    }

    /* renamed from: a */
    public ProxySelector mo47281a() {
        return this.f44244b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C15460l mo47283b(C15460l lVar, C15463o oVar, C15431f fVar) throws HttpException {
        ProxySelector proxySelector = this.f44244b;
        if (proxySelector == null) {
            proxySelector = ProxySelector.getDefault();
        }
        C15460l lVar2 = null;
        if (proxySelector == null) {
            return null;
        }
        try {
            Proxy a = mo47280a(proxySelector.select(new URI(lVar.mo47787h())), lVar, oVar, fVar);
            if (a.type() == Type.HTTP) {
                if (a.address() instanceof InetSocketAddress) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) a.address();
                    lVar2 = new C15460l(mo47279a(inetSocketAddress), inetSocketAddress.getPort());
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to handle non-Inet proxy address: ");
                    sb.append(a.address());
                    throw new HttpException(sb.toString());
                }
            }
            return lVar2;
        } catch (URISyntaxException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot convert host to URI: ");
            sb2.append(lVar);
            throw new HttpException(sb2.toString(), e);
        }
    }

    /* renamed from: a */
    public void mo47282a(ProxySelector proxySelector) {
        this.f44244b = proxySelector;
    }

    /* renamed from: a */
    public C15202b mo47061a(C15460l lVar, C15463o oVar, C15431f fVar) throws HttpException {
        C15202b bVar;
        if (oVar != null) {
            C15202b b = C15200j.m67378b(oVar.getParams());
            if (b != null) {
                return b;
            }
            if (lVar != null) {
                InetAddress c = C15200j.m67379c(oVar.getParams());
                C15460l b2 = mo47283b(lVar, oVar, fVar);
                boolean d = this.f44243a.mo47087b(lVar.mo47785f()).mo47078d();
                if (b2 == null) {
                    bVar = new C15202b(lVar, c, d);
                } else {
                    bVar = new C15202b(lVar, c, b2, d);
                }
                return bVar;
            }
            throw new IllegalStateException("Target host must not be null.");
        }
        throw new IllegalStateException("Request must not be null.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo47279a(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.isUnresolved() ? inetSocketAddress.getHostName() : inetSocketAddress.getAddress().getHostAddress();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Proxy mo47280a(List<Proxy> list, C15460l lVar, C15463o oVar, C15431f fVar) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Proxy list must not be empty.");
        }
        Proxy proxy = null;
        int i = 0;
        while (proxy == null && i < list.size()) {
            Proxy proxy2 = (Proxy) list.get(i);
            int i2 = C15275a.f44245a[proxy2.type().ordinal()];
            if (i2 == 1 || i2 == 2) {
                proxy = proxy2;
            }
            i++;
        }
        return proxy == null ? Proxy.NO_PROXY : proxy;
    }
}
