package org.apache.http.impl.client;

import com.facebook.common.util.UriUtil;
import org.apache.http.C15116a;
import org.apache.http.C15465q;
import org.apache.http.C15468t;
import org.apache.http.C15471w;
import org.apache.http.C15473y;
import org.apache.http.auth.C15120c;
import org.apache.http.auth.C15121d;
import org.apache.http.client.C15135a;
import org.apache.http.client.C15136b;
import org.apache.http.client.C15137c;
import org.apache.http.client.C15139e;
import org.apache.http.client.C15140f;
import org.apache.http.client.C15143i;
import org.apache.http.client.p531l.C15157b;
import org.apache.http.client.p531l.C15158c;
import org.apache.http.client.p531l.C15160e;
import org.apache.http.client.p532m.C15162a;
import org.apache.http.client.p532m.C15164c;
import org.apache.http.client.p532m.C15165d;
import org.apache.http.client.p532m.C15166e;
import org.apache.http.client.p532m.C15167f;
import org.apache.http.client.p532m.C15168g;
import org.apache.http.client.p532m.C15169h;
import org.apache.http.conn.C15179c;
import org.apache.http.conn.C15180d;
import org.apache.http.conn.C15183g;
import org.apache.http.conn.p535o.C15204d;
import org.apache.http.conn.p536p.C15211c;
import org.apache.http.conn.p536p.C15212d;
import org.apache.http.conn.p536p.C15213e;
import org.apache.http.conn.p537q.C15218d;
import org.apache.http.cookie.C15229h;
import org.apache.http.cookie.C15230i;
import org.apache.http.impl.auth.C15362c;
import org.apache.http.impl.auth.C15364e;
import org.apache.http.impl.cookie.C15399f0;
import org.apache.http.impl.cookie.C15406l;
import org.apache.http.impl.cookie.C15408n;
import org.apache.http.impl.cookie.C15416t;
import org.apache.http.impl.cookie.C15421y;
import org.apache.http.p224d0.C6146d;
import org.apache.http.p541f0.C15253c;
import org.apache.http.p541f0.p542m.C15268f;
import org.apache.http.p541f0.p542m.C15276l;
import org.apache.http.p548i0.C15350b;
import org.apache.http.p548i0.C15356h;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p548i0.C15359k;
import org.apache.http.p549j0.C15424a;
import org.apache.http.p549j0.C15426b;
import org.apache.http.p549j0.C15431f;
import org.apache.http.p549j0.C15435j;
import org.apache.http.p549j0.C15443r;
import org.apache.http.p549j0.C15445t;
import org.apache.http.p549j0.C15446u;
import org.apache.http.p549j0.C15447v;
import org.apache.http.p550k0.C15459g;

@C6146d
/* renamed from: org.apache.http.impl.client.h */
/* compiled from: DefaultHttpClient */
public class C15376h extends C15370b {
    public C15376h(C15179c cVar, C15357i iVar) {
        super(cVar, iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C15121d mo47611c() {
        C15121d dVar = new C15121d();
        dVar.mo46877a(C15157b.f44020c, (C15120c) new C15362c());
        dVar.mo46877a(C15157b.f44019b, (C15120c) new C15364e());
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C15179c mo47612d() {
        C15180d dVar;
        C15213e eVar = new C15213e();
        eVar.mo47084a(new C15212d("http", C15211c.m67424b(), 80));
        eVar.mo47084a(new C15212d(UriUtil.HTTPS_SCHEME, C15218d.m67456c(), 443));
        C15357i params = getParams();
        String str = (String) params.mo47549b(C15158c.f44021b);
        if (str != null) {
            try {
                dVar = (C15180d) Class.forName(str).newInstance();
            } catch (ClassNotFoundException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid class name: ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            } catch (IllegalAccessException e) {
                throw new IllegalAccessError(e.getMessage());
            } catch (InstantiationException e2) {
                throw new InstantiationError(e2.getMessage());
            }
        } else {
            dVar = null;
        }
        if (dVar != null) {
            return dVar.mo46993a(params, eVar);
        }
        return new C15276l(getParams(), eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C15183g mo47613e() {
        return new C15375g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C15116a mo47614f() {
        return new C15253c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C15230i mo47615g() {
        C15230i iVar = new C15230i();
        iVar.mo47135a(C15160e.f44036e, (C15229h) new C15406l());
        iVar.mo47135a(C15160e.f44032a, (C15229h) new C15408n());
        iVar.mo47135a(C15160e.f44033b, (C15229h) new C15416t());
        iVar.mo47135a(C15160e.f44034c, (C15229h) new C15421y());
        iVar.mo47135a(C15160e.f44035d, (C15229h) new C15399f0());
        return iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C15136b mo47616h() {
        return new C15371c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C15137c mo47617i() {
        return new C15372d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C15431f mo47618j() {
        C15424a aVar = new C15424a();
        aVar.mo47686a(C15162a.f44037a, getConnectionManager().mo46988a());
        aVar.mo47686a(C15162a.f44042f, mo47628t());
        aVar.mo47686a(C15162a.f44038b, mo47631w());
        aVar.mo47686a(C15162a.f44041e, mo47632x());
        aVar.mo47686a(C15162a.f44043g, mo47633y());
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C15357i mo47619k() {
        C15350b bVar = new C15350b();
        C15359k.m68040a((C15357i) bVar, (C15473y) C15471w.f44689R);
        C15359k.m68039a((C15357i) bVar, "ISO-8859-1");
        C15359k.m68041a((C15357i) bVar, true);
        C15356h.m68012b((C15357i) bVar, true);
        C15356h.m68016d(bVar, 8192);
        C15459g a = C15459g.m68509a("org.apache.http.client", getClass().getClassLoader());
        String d = a != null ? a.mo47778d() : C15459g.f44623f;
        StringBuilder sb = new StringBuilder();
        sb.append("Apache-HttpClient/");
        sb.append(d);
        sb.append(" (java 1.5)");
        C15359k.m68045c(bVar, sb.toString());
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C15426b mo47620l() {
        C15426b bVar = new C15426b();
        bVar.mo47699b((C15465q) new C15166e());
        bVar.mo47699b((C15465q) new C15443r());
        bVar.mo47699b((C15465q) new C15446u());
        bVar.mo47699b((C15465q) new C15165d());
        bVar.mo47699b((C15465q) new C15447v());
        bVar.mo47699b((C15465q) new C15445t());
        bVar.mo47699b((C15465q) new C15164c());
        bVar.mo47701b((C15468t) new C15169h());
        bVar.mo47699b((C15465q) new C15168g());
        bVar.mo47699b((C15465q) new C15167f());
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C15139e mo47621m() {
        return new C15377i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C15204d mo47622n() {
        return new C15268f(getConnectionManager().mo46988a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C15135a mo47623o() {
        return new C15378j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C15140f mo47624p() {
        return new C15379k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C15435j mo47625q() {
        return new C15435j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C15135a mo47626r() {
        return new C15381m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public C15143i mo47627s() {
        return new C15382n();
    }

    public C15376h(C15357i iVar) {
        super(null, iVar);
    }

    public C15376h() {
        super(null, null);
    }
}
