package p468g;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.C14910b;
import p201f.p202a.C5952h;

/* renamed from: g.t */
/* compiled from: Handshake */
public final class C13865t {

    /* renamed from: a */
    private final C13834h0 f40200a;

    /* renamed from: b */
    private final C13835i f40201b;

    /* renamed from: c */
    private final List<Certificate> f40202c;

    /* renamed from: d */
    private final List<Certificate> f40203d;

    private C13865t(C13834h0 h0Var, C13835i iVar, List<Certificate> list, List<Certificate> list2) {
        this.f40200a = h0Var;
        this.f40201b = iVar;
        this.f40202c = list;
        this.f40203d = list2;
    }

    /* renamed from: a */
    public static C13865t m59230a(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            C13835i a = C13835i.m59091a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                C13834h0 b = C13834h0.m59089b(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = C14910b.m66050a((T[]) certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = C14910b.m66050a((T[]) localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new C13865t(b, a, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    /* renamed from: b */
    public List<Certificate> mo43603b() {
        return this.f40203d;
    }

    @C5952h
    /* renamed from: c */
    public Principal mo43604c() {
        if (!this.f40203d.isEmpty()) {
            return ((X509Certificate) this.f40203d.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    /* renamed from: d */
    public List<Certificate> mo43605d() {
        return this.f40202c;
    }

    @C5952h
    /* renamed from: e */
    public Principal mo43606e() {
        if (!this.f40202c.isEmpty()) {
            return ((X509Certificate) this.f40202c.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    public boolean equals(@C5952h Object obj) {
        boolean z = false;
        if (!(obj instanceof C13865t)) {
            return false;
        }
        C13865t tVar = (C13865t) obj;
        if (this.f40200a.equals(tVar.f40200a) && this.f40201b.equals(tVar.f40201b) && this.f40202c.equals(tVar.f40202c) && this.f40203d.equals(tVar.f40203d)) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    public C13834h0 mo43608f() {
        return this.f40200a;
    }

    public int hashCode() {
        return ((((((527 + this.f40200a.hashCode()) * 31) + this.f40201b.hashCode()) * 31) + this.f40202c.hashCode()) * 31) + this.f40203d.hashCode();
    }

    /* renamed from: a */
    public static C13865t m59229a(C13834h0 h0Var, C13835i iVar, List<Certificate> list, List<Certificate> list2) {
        if (h0Var == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (iVar != null) {
            return new C13865t(h0Var, iVar, C14910b.m66049a(list), C14910b.m66049a(list2));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    /* renamed from: a */
    public C13835i mo43602a() {
        return this.f40201b;
    }
}
