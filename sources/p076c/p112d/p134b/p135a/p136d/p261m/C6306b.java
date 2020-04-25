package p076c.p112d.p134b.p135a.p136d.p261m;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.Collections;
import java.util.List;
import org.jivesoftware.smackx.shim.packet.Header;
import p076c.p112d.p134b.p135a.p136d.C6288b;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6373f0;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: c.d.b.a.d.m.b */
/* compiled from: JsonWebToken */
public class C6306b {

    /* renamed from: a */
    private final C6307a f17666a;

    /* renamed from: b */
    private final C6308b f17667b;

    /* renamed from: c.d.b.a.d.m.b$a */
    /* compiled from: JsonWebToken */
    public static class C6307a extends C6288b {
        @C2768v("typ")

        /* renamed from: O */
        private String f17668O;
        @C2768v("cty")

        /* renamed from: P */
        private String f17669P;

        /* renamed from: a */
        public C6307a mo25571a(String str) {
            this.f17669P = str;
            return this;
        }

        /* renamed from: f */
        public final String mo25572f() {
            return this.f17669P;
        }

        /* renamed from: g */
        public final String mo25573g() {
            return this.f17668O;
        }

        /* renamed from: b */
        public C6307a mo25546b(String str) {
            this.f17668O = str;
            return this;
        }

        /* renamed from: b */
        public C6307a m29344b(String str, Object obj) {
            return (C6307a) super.m29152b(str, obj);
        }

        public C6307a clone() {
            return (C6307a) super.clone();
        }
    }

    /* renamed from: c.d.b.a.d.m.b$b */
    /* compiled from: JsonWebToken */
    public static class C6308b extends C6288b {
        @C2768v("exp")

        /* renamed from: O */
        private Long f17670O;
        @C2768v("nbf")

        /* renamed from: P */
        private Long f17671P;
        @C2768v("iat")

        /* renamed from: Q */
        private Long f17672Q;
        @C2768v("iss")

        /* renamed from: R */
        private String f17673R;
        @C2768v("aud")

        /* renamed from: S */
        private Object f17674S;
        @C2768v("jti")

        /* renamed from: T */
        private String f17675T;
        @C2768v("typ")

        /* renamed from: U */
        private String f17676U;
        @C2768v("sub")

        /* renamed from: V */
        private String f17677V;

        /* renamed from: a */
        public C6308b mo25092a(Long l) {
            this.f17670O = l;
            return this;
        }

        /* renamed from: c */
        public C6308b mo25099c(Long l) {
            this.f17671P = l;
            return this;
        }

        /* renamed from: d */
        public C6308b mo25103d(String str) {
            this.f17676U = str;
            return this;
        }

        /* renamed from: f */
        public final Object mo25574f() {
            return this.f17674S;
        }

        /* renamed from: g */
        public final List<String> mo25575g() {
            Object obj = this.f17674S;
            if (obj == null) {
                return Collections.emptyList();
            }
            if (obj instanceof String) {
                return Collections.singletonList((String) obj);
            }
            return (List) obj;
        }

        /* renamed from: h */
        public final Long mo25576h() {
            return this.f17670O;
        }

        /* renamed from: i */
        public final Long mo25577i() {
            return this.f17672Q;
        }

        /* renamed from: j */
        public final String mo25578j() {
            return this.f17673R;
        }

        /* renamed from: l */
        public final String mo25579l() {
            return this.f17675T;
        }

        /* renamed from: m */
        public final Long mo25580m() {
            return this.f17671P;
        }

        /* renamed from: n */
        public final String mo25581n() {
            return this.f17677V;
        }

        /* renamed from: o */
        public final String mo25582o() {
            return this.f17676U;
        }

        /* renamed from: a */
        public C6308b mo25093a(String str) {
            this.f17673R = str;
            return this;
        }

        /* renamed from: c */
        public C6308b mo25100c(String str) {
            this.f17677V = str;
            return this;
        }

        /* renamed from: b */
        public C6308b mo25095b(Long l) {
            this.f17672Q = l;
            return this;
        }

        /* renamed from: b */
        public C6308b mo25096b(Object obj) {
            this.f17674S = obj;
            return this;
        }

        public C6308b clone() {
            return (C6308b) super.clone();
        }

        /* renamed from: b */
        public C6308b mo25097b(String str) {
            this.f17675T = str;
            return this;
        }

        /* renamed from: b */
        public C6308b m29354b(String str, Object obj) {
            return (C6308b) super.m29152b(str, obj);
        }
    }

    public C6306b(C6307a aVar, C6308b bVar) {
        this.f17666a = (C6307a) C6381h0.m29663a(aVar);
        this.f17667b = (C6308b) C6381h0.m29663a(bVar);
    }

    /* renamed from: a */
    public C6307a mo25539a() {
        return this.f17666a;
    }

    /* renamed from: b */
    public C6308b mo25088b() {
        return this.f17667b;
    }

    public String toString() {
        return C6373f0.m29650a(this).mo25752a(Header.ELEMENT, this.f17666a).mo25752a(MessengerShareContentUtility.ATTACHMENT_PAYLOAD, this.f17667b).toString();
    }
}
