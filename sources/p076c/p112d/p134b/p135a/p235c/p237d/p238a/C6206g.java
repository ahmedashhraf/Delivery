package p076c.p112d.p134b.p135a.p235c.p237d.p238a;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import p076c.p112d.p134b.p135a.p136d.C6288b;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: c.d.b.a.c.d.a.g */
/* compiled from: GoogleClientSecrets */
public final class C6206g extends C6288b {
    @C2768v

    /* renamed from: O */
    private C6207a f17461O;
    @C2768v

    /* renamed from: P */
    private C6207a f17462P;

    /* renamed from: c.d.b.a.c.d.a.g$a */
    /* compiled from: GoogleClientSecrets */
    public static final class C6207a extends C6288b {
        @C2768v("client_id")

        /* renamed from: O */
        private String f17463O;
        @C2768v("client_secret")

        /* renamed from: P */
        private String f17464P;
        @C2768v("redirect_uris")

        /* renamed from: Q */
        private List<String> f17465Q;
        @C2768v("auth_uri")

        /* renamed from: R */
        private String f17466R;
        @C2768v("token_uri")

        /* renamed from: S */
        private String f17467S;

        /* renamed from: a */
        public C6207a mo25243a(List<String> list) {
            this.f17465Q = list;
            return this;
        }

        /* renamed from: c */
        public C6207a mo25245c(String str) {
            this.f17464P = str;
            return this;
        }

        /* renamed from: d */
        public C6207a mo25246d(String str) {
            this.f17467S = str;
            return this;
        }

        /* renamed from: f */
        public String mo25247f() {
            return this.f17466R;
        }

        /* renamed from: g */
        public String mo25248g() {
            return this.f17463O;
        }

        /* renamed from: h */
        public String mo25249h() {
            return this.f17464P;
        }

        /* renamed from: i */
        public List<String> mo25250i() {
            return this.f17465Q;
        }

        /* renamed from: j */
        public String mo25251j() {
            return this.f17467S;
        }

        /* renamed from: a */
        public C6207a mo25242a(String str) {
            this.f17466R = str;
            return this;
        }

        /* renamed from: b */
        public C6207a mo25244b(String str) {
            this.f17463O = str;
            return this;
        }

        /* renamed from: b */
        public C6207a m28595b(String str, Object obj) {
            return (C6207a) super.m29152b(str, obj);
        }

        public C6207a clone() {
            return (C6207a) super.clone();
        }
    }

    /* renamed from: a */
    public C6206g mo25237a(C6207a aVar) {
        this.f17461O = aVar;
        return this;
    }

    /* renamed from: f */
    public C6207a mo25239f() {
        boolean z = true;
        if ((this.f17462P == null) == (this.f17461O == null)) {
            z = false;
        }
        C6381h0.m29666a(z);
        C6207a aVar = this.f17462P;
        return aVar == null ? this.f17461O : aVar;
    }

    /* renamed from: g */
    public C6207a mo25240g() {
        return this.f17461O;
    }

    /* renamed from: h */
    public C6207a mo25241h() {
        return this.f17462P;
    }

    /* renamed from: a */
    public static C6206g m28581a(C6290d dVar, Reader reader) throws IOException {
        return (C6206g) dVar.mo25496a(reader, C6206g.class);
    }

    /* renamed from: b */
    public C6206g mo25238b(C6207a aVar) {
        this.f17462P = aVar;
        return this;
    }

    /* renamed from: b */
    public C6206g m28586b(String str, Object obj) {
        return (C6206g) super.m29152b(str, obj);
    }

    public C6206g clone() {
        return (C6206g) super.clone();
    }
}
