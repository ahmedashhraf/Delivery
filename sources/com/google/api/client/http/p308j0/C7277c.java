package com.google.api.client.http.p308j0;

import com.facebook.common.util.UriUtil;
import com.google.api.client.http.C7253a0;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import org.apache.http.C15460l;
import org.apache.http.C15471w;
import org.apache.http.C15473y;
import org.apache.http.client.C15138d;
import org.apache.http.client.C15139e;
import org.apache.http.client.p530k.C15146b;
import org.apache.http.client.p530k.C15148d;
import org.apache.http.client.p530k.C15149e;
import org.apache.http.client.p530k.C15150f;
import org.apache.http.client.p530k.C15151g;
import org.apache.http.client.p530k.C15152h;
import org.apache.http.client.p530k.C15153i;
import org.apache.http.client.p530k.C15154j;
import org.apache.http.client.p531l.C15158c;
import org.apache.http.conn.p534n.C15194e;
import org.apache.http.conn.p534n.C15196f;
import org.apache.http.conn.p534n.C15197g;
import org.apache.http.conn.p534n.C15200j;
import org.apache.http.conn.p535o.C15204d;
import org.apache.http.conn.p536p.C15211c;
import org.apache.http.conn.p536p.C15212d;
import org.apache.http.conn.p536p.C15213e;
import org.apache.http.conn.p537q.C15218d;
import org.apache.http.impl.client.C15376h;
import org.apache.http.impl.client.C15377i;
import org.apache.http.p541f0.p542m.C15274k;
import org.apache.http.p541f0.p542m.p543n.C15291j;
import org.apache.http.p548i0.C15350b;
import org.apache.http.p548i0.C15356h;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p548i0.C15359k;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6384i0;
import p076c.p112d.p134b.p135a.p143g.C6393l0;

/* renamed from: com.google.api.client.http.j0.c */
/* compiled from: ApacheHttpTransport */
public final class C7277c extends C7253a0 {

    /* renamed from: c */
    private final C15138d f20588c;

    /* renamed from: com.google.api.client.http.j0.c$a */
    /* compiled from: ApacheHttpTransport */
    public static final class C7278a {

        /* renamed from: a */
        private C15218d f20589a = C15218d.m67456c();

        /* renamed from: b */
        private C15357i f20590b = C7277c.m35154f();

        /* renamed from: c */
        private ProxySelector f20591c = ProxySelector.getDefault();

        /* renamed from: a */
        public C7278a mo28958a(C15460l lVar) {
            C15200j.m67377a(this.f20590b, lVar);
            if (lVar != null) {
                this.f20591c = null;
            }
            return this;
        }

        @C2766f
        /* renamed from: b */
        public C7278a mo28960b() throws GeneralSecurityException {
            this.f20589a = new C7281f(C6393l0.m29713h());
            this.f20589a.mo47096a(C15218d.f44124h);
            return this;
        }

        /* renamed from: c */
        public C15357i mo28961c() {
            return this.f20590b;
        }

        /* renamed from: d */
        public C15218d mo28962d() {
            return this.f20589a;
        }

        /* renamed from: a */
        public C7278a mo28955a(ProxySelector proxySelector) {
            this.f20591c = proxySelector;
            if (proxySelector != null) {
                C15200j.m67377a(this.f20590b, (C15460l) null);
            }
            return this;
        }

        /* renamed from: a */
        public C7278a mo28954a(InputStream inputStream, String str) throws GeneralSecurityException, IOException {
            KeyStore b = C6384i0.m29683b();
            C6384i0.m29679a(b, inputStream, str);
            return mo28956a(b);
        }

        /* renamed from: a */
        public C7278a mo28953a(InputStream inputStream) throws GeneralSecurityException, IOException {
            KeyStore b = C6384i0.m29683b();
            b.load(null, null);
            C6384i0.m29680a(b, C6384i0.m29688g(), inputStream);
            return mo28956a(b);
        }

        /* renamed from: a */
        public C7278a mo28956a(KeyStore keyStore) throws GeneralSecurityException {
            SSLContext f = C6393l0.m29711f();
            C6393l0.m29706a(f, keyStore, C6393l0.m29709d());
            return mo28957a((C15218d) new C7281f(f));
        }

        /* renamed from: a */
        public C7278a mo28957a(C15218d dVar) {
            this.f20589a = (C15218d) C6381h0.m29663a(dVar);
            return this;
        }

        /* renamed from: a */
        public C7277c mo28959a() {
            return new C7277c(C7277c.m35152a(this.f20589a, this.f20590b, this.f20591c));
        }
    }

    public C7277c() {
        this(m35153e());
    }

    /* renamed from: e */
    public static C15376h m35153e() {
        return m35152a(C15218d.m67456c(), m35154f(), ProxySelector.getDefault());
    }

    /* renamed from: f */
    static C15357i m35154f() {
        C15350b bVar = new C15350b();
        C15356h.m68009a((C15357i) bVar, false);
        C15356h.m68016d(bVar, 8192);
        C15194e.m67359a((C15357i) bVar, 200);
        C15194e.m67361a((C15357i) bVar, (C15196f) new C15197g(20));
        return bVar;
    }

    /* renamed from: a */
    public boolean mo25637a(String str) {
        return true;
    }

    /* renamed from: c */
    public void mo28860c() {
        this.f20588c.getConnectionManager().shutdown();
    }

    /* renamed from: d */
    public C15138d mo28952d() {
        return this.f20588c;
    }

    public C7277c(C15138d dVar) {
        this.f20588c = dVar;
        C15357i params = dVar.getParams();
        C15359k.m68040a(params, (C15473y) C15471w.f44689R);
        params.mo47539a(C15158c.f44023d, false);
    }

    /* renamed from: a */
    static C15376h m35152a(C15218d dVar, C15357i iVar, ProxySelector proxySelector) {
        C15213e eVar = new C15213e();
        eVar.mo47084a(new C15212d("http", C15211c.m67424b(), 80));
        eVar.mo47084a(new C15212d(UriUtil.HTTPS_SCHEME, dVar, 443));
        C15376h hVar = new C15376h(new C15291j(iVar, eVar), iVar);
        hVar.mo47596a((C15139e) new C15377i(0, false));
        if (proxySelector != null) {
            hVar.mo47600a((C15204d) new C15274k(eVar, proxySelector));
        }
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7275a m35156a(String str, String str2) {
        C15153i iVar;
        if (str.equals("DELETE")) {
            iVar = new C15146b(str2);
        } else if (str.equals("GET")) {
            iVar = new C15148d(str2);
        } else if (str.equals("HEAD")) {
            iVar = new C15149e(str2);
        } else if (str.equals("POST")) {
            iVar = new C15151g(str2);
        } else if (str.equals("PUT")) {
            iVar = new C15152h(str2);
        } else if (str.equals("TRACE")) {
            iVar = new C15154j(str2);
        } else if (str.equals("OPTIONS")) {
            iVar = new C15150f(str2);
        } else {
            iVar = new C7280e(str, str2);
        }
        return new C7275a(this.f20588c, iVar);
    }
}
