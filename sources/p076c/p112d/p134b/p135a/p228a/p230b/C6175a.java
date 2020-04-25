package p076c.p112d.p134b.p135a.p228a.p230b;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.p261m.C6303a;
import p076c.p112d.p134b.p135a.p136d.p261m.C6303a.C6304a;
import p076c.p112d.p134b.p135a.p136d.p261m.C6306b.C6308b;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C2768v;

@C2766f
/* renamed from: c.d.b.a.a.b.a */
/* compiled from: IdToken */
public class C6175a extends C6303a {

    @C2766f
    /* renamed from: c.d.b.a.a.b.a$a */
    /* compiled from: IdToken */
    public static class C6176a extends C6308b {
        @C2768v("auth_time")

        /* renamed from: W */
        private Long f17403W;
        @C2768v("azp")

        /* renamed from: X */
        private String f17404X;
        @C2768v

        /* renamed from: Y */
        private String f17405Y;
        @C2768v("at_hash")

        /* renamed from: Z */
        private String f17406Z;
        @C2768v("acr")

        /* renamed from: a0 */
        private String f17407a0;
        @C2768v("amr")

        /* renamed from: b0 */
        private List<String> f17408b0;

        /* renamed from: e */
        public C6176a mo25104e(String str) {
            this.f17406Z = str;
            return this;
        }

        /* renamed from: f */
        public C6176a mo25105f(String str) {
            this.f17404X = str;
            return this;
        }

        /* renamed from: g */
        public C6176a mo25106g(String str) {
            this.f17407a0 = str;
            return this;
        }

        /* renamed from: h */
        public C6176a mo25107h(String str) {
            this.f17405Y = str;
            return this;
        }

        /* renamed from: p */
        public final String mo25108p() {
            return this.f17406Z;
        }

        /* renamed from: q */
        public final Long mo25109q() {
            return this.f17403W;
        }

        /* renamed from: r */
        public final String mo25110r() {
            return this.f17404X;
        }

        /* renamed from: s */
        public final String mo25111s() {
            return this.f17407a0;
        }

        /* renamed from: t */
        public final List<String> mo25112t() {
            return this.f17408b0;
        }

        /* renamed from: u */
        public final String mo25113u() {
            return this.f17405Y;
        }

        /* renamed from: d */
        public C6176a mo25102d(Long l) {
            this.f17403W = l;
            return this;
        }

        /* renamed from: a */
        public C6176a mo25094a(List<String> list) {
            this.f17408b0 = list;
            return this;
        }

        /* renamed from: c */
        public C6176a m28346c(Long l) {
            return (C6176a) super.mo25099c(l);
        }

        /* renamed from: d */
        public C6176a m28350d(String str) {
            return (C6176a) super.mo25103d(str);
        }

        /* renamed from: a */
        public C6176a m28332a(Long l) {
            return (C6176a) super.mo25092a(l);
        }

        /* renamed from: c */
        public C6176a m28347c(String str) {
            return (C6176a) super.mo25100c(str);
        }

        /* renamed from: a */
        public C6176a m28333a(String str) {
            return (C6176a) super.mo25093a(str);
        }

        public C6176a clone() {
            return (C6176a) super.clone();
        }

        /* renamed from: b */
        public C6176a m28339b(Long l) {
            return (C6176a) super.mo25095b(l);
        }

        /* renamed from: b */
        public C6176a m28340b(Object obj) {
            return (C6176a) super.mo25096b(obj);
        }

        /* renamed from: b */
        public C6176a m28341b(String str) {
            return (C6176a) super.mo25097b(str);
        }

        /* renamed from: b */
        public C6176a m28343b(String str, Object obj) {
            return (C6176a) super.m29355b(str, obj);
        }
    }

    public C6175a(C6304a aVar, C6176a aVar2, byte[] bArr, byte[] bArr2) {
        super(aVar, aVar2, bArr, bArr2);
    }

    /* renamed from: a */
    public final boolean mo25086a(String str) {
        return mo25090b(Collections.singleton(str));
    }

    /* renamed from: c */
    public final boolean mo25091c(long j, long j2) {
        return mo25085a(j, j2) && mo25089b(j, j2);
    }

    /* renamed from: a */
    public final boolean mo25087a(Collection<String> collection) {
        return collection.containsAll(m28325b().mo25575g());
    }

    /* renamed from: b */
    public C6176a m28325b() {
        return (C6176a) super.mo25088b();
    }

    /* renamed from: a */
    public final boolean mo25085a(long j, long j2) {
        return j <= (m28325b().mo25576h().longValue() + j2) * 1000;
    }

    /* renamed from: b */
    public final boolean mo25090b(Collection<String> collection) {
        return collection.contains(m28325b().mo25578j());
    }

    /* renamed from: a */
    public static C6175a m28320a(C6290d dVar, String str) throws IOException {
        C6303a a = C6303a.m29298a(dVar).mo25568b(C6176a.class).mo25565a(str);
        return new C6175a(a.m29303a(), (C6176a) a.mo25088b(), a.mo25542c(), a.mo25543d());
    }

    /* renamed from: b */
    public final boolean mo25089b(long j, long j2) {
        return j >= (m28325b().mo25577i().longValue() - j2) * 1000;
    }
}
