package p468g;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.C14910b;
import p201f.p202a.C5952h;

/* renamed from: g.l */
/* compiled from: ConnectionSpec */
public final class C13848l {

    /* renamed from: e */
    private static final C13835i[] f40146e = {C13835i.f40103n1, C13835i.f40106o1, C13835i.f40109p1, C13835i.f40112q1, C13835i.f40115r1, C13835i.f40062Z0, C13835i.f40073d1, C13835i.f40064a1, C13835i.f40076e1, C13835i.f40094k1, C13835i.f40091j1};

    /* renamed from: f */
    private static final C13835i[] f40147f = {C13835i.f40103n1, C13835i.f40106o1, C13835i.f40109p1, C13835i.f40112q1, C13835i.f40115r1, C13835i.f40062Z0, C13835i.f40073d1, C13835i.f40064a1, C13835i.f40076e1, C13835i.f40094k1, C13835i.f40091j1, C13835i.f40032K0, C13835i.f40034L0, C13835i.f40087i0, C13835i.f40090j0, C13835i.f40023G, C13835i.f40031K, C13835i.f40092k};

    /* renamed from: g */
    public static final C13848l f40148g = new C13849a(true).mo43527a(f40146e).mo43526a(C13834h0.TLS_1_3, C13834h0.TLS_1_2).mo43525a(true).mo43531c();

    /* renamed from: h */
    public static final C13848l f40149h = new C13849a(true).mo43527a(f40147f).mo43526a(C13834h0.TLS_1_3, C13834h0.TLS_1_2, C13834h0.TLS_1_1, C13834h0.TLS_1_0).mo43525a(true).mo43531c();

    /* renamed from: i */
    public static final C13848l f40150i = new C13849a(true).mo43527a(f40147f).mo43526a(C13834h0.TLS_1_0).mo43525a(true).mo43531c();

    /* renamed from: j */
    public static final C13848l f40151j = new C13849a(false).mo43531c();

    /* renamed from: a */
    final boolean f40152a;

    /* renamed from: b */
    final boolean f40153b;
    @C5952h

    /* renamed from: c */
    final String[] f40154c;
    @C5952h

    /* renamed from: d */
    final String[] f40155d;

    /* renamed from: g.l$a */
    /* compiled from: ConnectionSpec */
    public static final class C13849a {

        /* renamed from: a */
        boolean f40156a;
        @C5952h

        /* renamed from: b */
        String[] f40157b;
        @C5952h

        /* renamed from: c */
        String[] f40158c;

        /* renamed from: d */
        boolean f40159d;

        C13849a(boolean z) {
            this.f40156a = z;
        }

        /* renamed from: a */
        public C13849a mo43524a() {
            if (this.f40156a) {
                this.f40157b = null;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: b */
        public C13849a mo43529b() {
            if (this.f40156a) {
                this.f40158c = null;
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: c */
        public C13848l mo43531c() {
            return new C13848l(this);
        }

        public C13849a(C13848l lVar) {
            this.f40156a = lVar.f40152a;
            this.f40157b = lVar.f40154c;
            this.f40158c = lVar.f40155d;
            this.f40159d = lVar.f40153b;
        }

        /* renamed from: a */
        public C13849a mo43527a(C13835i... iVarArr) {
            if (this.f40156a) {
                String[] strArr = new String[iVarArr.length];
                for (int i = 0; i < iVarArr.length; i++) {
                    strArr[i] = iVarArr[i].f40132a;
                }
                return mo43528a(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: b */
        public C13849a mo43530b(String... strArr) {
            if (!this.f40156a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f40158c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        /* renamed from: a */
        public C13849a mo43528a(String... strArr) {
            if (!this.f40156a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f40157b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: a */
        public C13849a mo43526a(C13834h0... h0VarArr) {
            if (this.f40156a) {
                String[] strArr = new String[h0VarArr.length];
                for (int i = 0; i < h0VarArr.length; i++) {
                    strArr[i] = h0VarArr[i].javaName;
                }
                return mo43530b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: a */
        public C13849a mo43525a(boolean z) {
            if (this.f40156a) {
                this.f40159d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
    }

    C13848l(C13849a aVar) {
        this.f40152a = aVar.f40156a;
        this.f40154c = aVar.f40157b;
        this.f40155d = aVar.f40158c;
        this.f40153b = aVar.f40159d;
    }

    @C5952h
    /* renamed from: a */
    public List<C13835i> mo43515a() {
        String[] strArr = this.f40154c;
        if (strArr != null) {
            return C13835i.m59093a(strArr);
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo43518b() {
        return this.f40152a;
    }

    /* renamed from: c */
    public boolean mo43519c() {
        return this.f40153b;
    }

    @C5952h
    /* renamed from: d */
    public List<C13834h0> mo43520d() {
        String[] strArr = this.f40155d;
        if (strArr != null) {
            return C13834h0.m59088a(strArr);
        }
        return null;
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C13848l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C13848l lVar = (C13848l) obj;
        boolean z = this.f40152a;
        if (z != lVar.f40152a) {
            return false;
        }
        return !z || (Arrays.equals(this.f40154c, lVar.f40154c) && Arrays.equals(this.f40155d, lVar.f40155d) && this.f40153b == lVar.f40153b);
    }

    public int hashCode() {
        if (this.f40152a) {
            return ((((527 + Arrays.hashCode(this.f40154c)) * 31) + Arrays.hashCode(this.f40155d)) * 31) + (this.f40153b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f40152a) {
            return "ConnectionSpec()";
        }
        String str = "[all enabled]";
        String obj = this.f40154c != null ? mo43515a().toString() : str;
        if (this.f40155d != null) {
            str = mo43520d().toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ConnectionSpec(cipherSuites=");
        sb.append(obj);
        sb.append(", tlsVersions=");
        sb.append(str);
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f40153b);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    private C13848l m59128b(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.f40154c != null) {
            strArr = C14910b.m66063a(C13835i.f40065b, sSLSocket.getEnabledCipherSuites(), this.f40154c);
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f40155d != null) {
            strArr2 = C14910b.m66063a(C14910b.f43174q, sSLSocket.getEnabledProtocols(), this.f40155d);
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a = C14910b.m66041a(C13835i.f40065b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && a != -1) {
            strArr = C14910b.m66064a(strArr, supportedCipherSuites[a]);
        }
        return new C13849a(this).mo43528a(strArr).mo43530b(strArr2).mo43531c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo43516a(SSLSocket sSLSocket, boolean z) {
        C13848l b = m59128b(sSLSocket, z);
        String[] strArr = b.f40155d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = b.f40154c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* renamed from: a */
    public boolean mo43517a(SSLSocket sSLSocket) {
        if (!this.f40152a) {
            return false;
        }
        String[] strArr = this.f40155d;
        if (strArr != null && !C14910b.m66069b(C14910b.f43174q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f40154c;
        if (strArr2 == null || C14910b.m66069b(C13835i.f40065b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }
}
