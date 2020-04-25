package p076c.p112d.p134b.p135a.p235c.p241f;

import com.google.api.client.auth.oauth2.C7215f;
import com.google.api.client.auth.oauth2.C7222j;
import com.google.api.client.auth.oauth2.C7222j.C7224b;
import com.google.api.client.auth.oauth2.C7225k;
import com.google.api.client.auth.oauth2.C7236t;
import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7298p;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7308w;
import java.io.IOException;
import java.util.Collection;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.C6292f;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6372e0;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6391l;
import p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6219o;

@C2766f
/* renamed from: c.d.b.a.c.f.a */
/* compiled from: ComputeCredential */
public class C6232a extends C7222j {

    /* renamed from: n */
    public static final String f17546n = String.valueOf(C6219o.m28801a()).concat("/computeMetadata/v1/instance/service-accounts/default/token");

    @C2766f
    /* renamed from: c.d.b.a.c.f.a$a */
    /* compiled from: ComputeCredential */
    public static class C6233a extends C7224b {
        public C6233a(C7253a0 a0Var, C6290d dVar) {
            super(C7215f.m34657a());
            m28856a(a0Var);
            m28853a(dVar);
            m28860a(C6232a.f17546n);
        }

        /* renamed from: a */
        public C6232a m28862a() {
            return new C6232a(this);
        }

        /* renamed from: a */
        public C6233a m28856a(C7253a0 a0Var) {
            return (C6233a) super.mo25270a((C7253a0) C6381h0.m29663a(a0Var));
        }

        /* renamed from: a */
        public C6233a m28854a(C6391l lVar) {
            return (C6233a) super.mo25268a(lVar);
        }

        /* renamed from: a */
        public C6233a m28853a(C6290d dVar) {
            return (C6233a) super.mo25267a((C6290d) C6381h0.m29663a(dVar));
        }

        /* renamed from: a */
        public C6233a m28857a(C7274j jVar) {
            return (C6233a) super.mo25271a((C7274j) C6381h0.m29663a(jVar));
        }

        /* renamed from: a */
        public C6233a m28860a(String str) {
            return (C6233a) super.mo25275a((String) C6381h0.m29663a(str));
        }

        /* renamed from: a */
        public C6233a m28858a(C7298p pVar) {
            C6381h0.m29666a(pVar == null);
            return this;
        }

        /* renamed from: a */
        public C6233a m28859a(C7308w wVar) {
            return (C6233a) super.mo25273a(wVar);
        }

        /* renamed from: a */
        public C6233a m28855a(C7225k kVar) {
            return (C6233a) super.mo25269a(kVar);
        }

        /* renamed from: a */
        public C6233a m28861a(Collection<C7225k> collection) {
            return (C6233a) super.mo25278a(collection);
        }
    }

    public C6232a(C7253a0 a0Var, C6290d dVar) {
        this(new C6233a(a0Var, dVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7236t mo25187a() throws IOException {
        C7305u b = mo28702m().mo28859b().mo29135b(new C7274j(mo28701l()));
        b.mo29079a((C6372e0) new C6292f(mo28696g()));
        b.mo29111i().mo25098b("Metadata-Flavor", (Object) "Google");
        return (C7236t) b.mo29092a().mo29141a(C7236t.class);
    }

    protected C6232a(C6233a aVar) {
        super((C7224b) aVar);
    }
}
