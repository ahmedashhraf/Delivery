package p076c.p112d.p134b.p135a.p235c.p250k.p251b.p252a;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7298p;
import com.google.api.client.http.C7305u;
import java.io.IOException;
import p076c.p112d.p134b.p135a.p136d.C6289c;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.p259k.C6297a;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6391l;
import p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6208h;
import p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6208h.C6209a;
import p076c.p112d.p134b.p135a.p262f.p263a.C6338d;
import p076c.p112d.p134b.p135a.p262f.p263a.C6338d.C6339a;
import p076c.p112d.p134b.p135a.p262f.p263a.C6341f;
import p076c.p112d.p134b.p135a.p262f.p263a.C6342g;

@C2766f
/* renamed from: c.d.b.a.c.k.b.a.a */
/* compiled from: MockGoogleCredential */
public class C6260a extends C6208h {

    /* renamed from: A */
    private static final String f17610A = "{\"access_token\": \"%s\", \"expires_in\":  %s, \"refresh_token\": \"%s\", \"token_type\": \"%s\"}";

    /* renamed from: B */
    private static final String f17611B = String.format(f17610A, new Object[]{f17612w, f17614y, f17613x, f17615z});

    /* renamed from: w */
    public static final String f17612w = "access_xyz";

    /* renamed from: x */
    public static final String f17613x = "refresh123";

    /* renamed from: y */
    private static final String f17614y = "3600";

    /* renamed from: z */
    private static final String f17615z = "Bearer";

    @C2766f
    /* renamed from: c.d.b.a.c.k.b.a.a$b */
    /* compiled from: MockGoogleCredential */
    public static class C6262b extends C6209a {
        /* renamed from: a */
        public C6262b m29062a(C7253a0 a0Var) {
            return (C6262b) super.m28647a(a0Var);
        }

        /* renamed from: a */
        public C6262b m29063a(C7298p pVar) {
            return (C6262b) super.m28649a(pVar);
        }

        /* renamed from: a */
        public C6262b m29060a(C6290d dVar) {
            return (C6262b) super.m28644a(dVar);
        }

        /* renamed from: a */
        public C6262b m29061a(C6391l lVar) {
            return (C6262b) super.m28645a(lVar);
        }

        /* renamed from: a */
        public C6260a m29064a() {
            if (mo28711i() == null) {
                m29067a((C7253a0) new C6339a().mo25643a());
            }
            if (mo28704b() == null) {
                m29068a((C7298p) new C6263c());
            }
            if (mo28706d() == null) {
                m29065a((C6290d) new C6297a());
            }
            return new C6260a(this);
        }
    }

    @C2766f
    /* renamed from: c.d.b.a.c.k.b.a.a$c */
    /* compiled from: MockGoogleCredential */
    private static class C6263c implements C7298p {
        private C6263c() {
        }

        /* renamed from: a */
        public void mo25080a(C7305u uVar) throws IOException {
        }
    }

    public C6260a(C6262b bVar) {
        super(bVar);
    }

    /* renamed from: x */
    public static C6338d m29054x() {
        return new C6339a().mo25640a(new C6341f().mo25649a(new C6342g().mo25667c(C6289c.f17634a).mo25659a(f17611B))).mo25643a();
    }
}
