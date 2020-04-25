package com.google.api.client.http;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6362b;
import p076c.p112d.p134b.p135a.p143g.C6371e;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6387k;
import p076c.p112d.p134b.p135a.p143g.C6398n;
import p076c.p112d.p134b.p135a.p143g.C6399n0;
import p076c.p112d.p134b.p135a.p143g.C6406p0;
import p076c.p112d.p134b.p135a.p143g.C6409q0;
import p076c.p112d.p134b.p135a.p143g.C6412r;
import p076c.p112d.p134b.p135a.p143g.C6413s;
import p076c.p112d.p134b.p135a.p143g.C6413s.C6416c;
import p212io.fabric.sdk.android.services.network.HttpRequest;

/* renamed from: com.google.api.client.http.q */
/* compiled from: HttpHeaders */
public class C7299q extends C6413s {
    @C2768v("Accept")

    /* renamed from: N */
    private List<String> f20625N;
    @C2768v("Accept-Encoding")

    /* renamed from: O */
    private List<String> f20626O = new ArrayList(Collections.singleton(HttpRequest.f42459o));
    @C2768v("Authorization")

    /* renamed from: P */
    private List<String> f20627P;
    @C2768v("Cache-Control")

    /* renamed from: Q */
    private List<String> f20628Q;
    @C2768v("Content-Encoding")

    /* renamed from: R */
    private List<String> f20629R;
    @C2768v("Content-Length")

    /* renamed from: S */
    private List<Long> f20630S;
    @C2768v("Content-MD5")

    /* renamed from: T */
    private List<String> f20631T;
    @C2768v("Content-Range")

    /* renamed from: U */
    private List<String> f20632U;
    @C2768v("Content-Type")

    /* renamed from: V */
    private List<String> f20633V;
    @C2768v("Cookie")

    /* renamed from: W */
    private List<String> f20634W;
    @C2768v("Date")

    /* renamed from: X */
    private List<String> f20635X;
    @C2768v("ETag")

    /* renamed from: Y */
    private List<String> f20636Y;
    @C2768v("Expires")

    /* renamed from: Z */
    private List<String> f20637Z;
    @C2768v("If-Modified-Since")

    /* renamed from: a0 */
    private List<String> f20638a0;
    @C2768v("If-Match")

    /* renamed from: b0 */
    private List<String> f20639b0;
    @C2768v("If-None-Match")

    /* renamed from: c0 */
    private List<String> f20640c0;
    @C2768v("If-Unmodified-Since")

    /* renamed from: d0 */
    private List<String> f20641d0;
    @C2768v("If-Range")

    /* renamed from: e0 */
    private List<String> f20642e0;
    @C2768v("Last-Modified")

    /* renamed from: f0 */
    private List<String> f20643f0;
    @C2768v("Location")

    /* renamed from: g0 */
    private List<String> f20644g0;
    @C2768v("MIME-Version")

    /* renamed from: h0 */
    private List<String> f20645h0;
    @C2768v("Range")

    /* renamed from: i0 */
    private List<String> f20646i0;
    @C2768v("Retry-After")

    /* renamed from: j0 */
    private List<String> f20647j0;
    @C2768v("User-Agent")

    /* renamed from: k0 */
    private List<String> f20648k0;
    @C2768v("WWW-Authenticate")

    /* renamed from: l0 */
    private List<String> f20649l0;
    @C2768v("Age")

    /* renamed from: m0 */
    private List<Long> f20650m0;

    /* renamed from: com.google.api.client.http.q$a */
    /* compiled from: HttpHeaders */
    private static class C7300a extends C7259d0 {

        /* renamed from: e */
        private final C7299q f20651e;

        /* renamed from: f */
        private final C7301b f20652f;

        C7300a(C7299q qVar, C7301b bVar) {
            this.f20651e = qVar;
            this.f20652f = bVar;
        }

        /* renamed from: a */
        public void mo25349a(String str, String str2) {
            this.f20651e.mo29012a(str, str2, this.f20652f);
        }

        /* renamed from: a */
        public C7261e0 mo25348a() throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.api.client.http.q$b */
    /* compiled from: HttpHeaders */
    private static final class C7301b {

        /* renamed from: a */
        final C6362b f20653a;

        /* renamed from: b */
        final StringBuilder f20654b;

        /* renamed from: c */
        final C6387k f20655c;

        /* renamed from: d */
        final List<Type> f20656d;

        public C7301b(C7299q qVar, StringBuilder sb) {
            Class cls = qVar.getClass();
            this.f20656d = Arrays.asList(new Type[]{cls});
            this.f20655c = C6387k.m29692a(cls, true);
            this.f20654b = sb;
            this.f20653a = new C6362b(qVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo29061a() {
            this.f20653a.mo25745a();
        }
    }

    public C7299q() {
        super(EnumSet.of(C6416c.IGNORE_CASE));
    }

    /* renamed from: A */
    public final String mo29000A() {
        return (String) m35234b(this.f20643f0);
    }

    /* renamed from: C */
    public final String mo29001C() {
        return (String) m35234b(this.f20644g0);
    }

    /* renamed from: D */
    public final String mo29002D() {
        return (String) m35234b(this.f20645h0);
    }

    /* renamed from: E */
    public final String mo29003E() {
        return (String) m35234b(this.f20646i0);
    }

    /* renamed from: G */
    public final String mo29004G() {
        return (String) m35234b(this.f20647j0);
    }

    /* renamed from: H */
    public final String mo29005H() {
        return (String) m35234b(this.f20648k0);
    }

    /* renamed from: a */
    public C7299q mo29008a(List<String> list) {
        this.f20627P = list;
        return this;
    }

    /* renamed from: c */
    public C7299q mo29015c(String str) {
        this.f20625N = m35235b((T) str);
        return this;
    }

    /* renamed from: d */
    public final String mo29017d() {
        return (String) m35234b(this.f20625N);
    }

    /* renamed from: e */
    public final String mo29019e() {
        return (String) m35234b(this.f20626O);
    }

    /* renamed from: f */
    public C7299q mo29020f(String str) {
        return mo29008a(m35235b((T) str));
    }

    /* renamed from: g */
    public C7299q mo29022g(String str) {
        this.f20628Q = m35235b((T) str);
        return this;
    }

    /* renamed from: h */
    public C7299q mo29024h(String str) {
        this.f20629R = m35235b((T) str);
        return this;
    }

    /* renamed from: i */
    public final String mo29027i() {
        return (String) m35234b(this.f20627P);
    }

    /* renamed from: j */
    public final List<String> mo29029j() {
        return this.f20627P;
    }

    /* renamed from: k */
    public C7299q mo29030k(String str) {
        this.f20633V = m35235b((T) str);
        return this;
    }

    /* renamed from: l */
    public final String mo29032l() {
        return (String) m35234b(this.f20628Q);
    }

    /* renamed from: m */
    public final String mo29034m() {
        return (String) m35234b(this.f20629R);
    }

    /* renamed from: n */
    public final Long mo29036n() {
        return (Long) m35234b(this.f20630S);
    }

    /* renamed from: o */
    public final String mo29038o() {
        return (String) m35234b(this.f20631T);
    }

    /* renamed from: p */
    public final String mo29040p() {
        return (String) m35234b(this.f20632U);
    }

    /* renamed from: q */
    public final String mo29042q() {
        return (String) m35234b(this.f20633V);
    }

    /* renamed from: r */
    public final String mo29044r() {
        return (String) m35234b(this.f20634W);
    }

    /* renamed from: s */
    public final String mo29046s() {
        return (String) m35234b(this.f20635X);
    }

    /* renamed from: t */
    public final String mo29048t() {
        return (String) m35234b(this.f20636Y);
    }

    /* renamed from: u */
    public final String mo29050u() {
        return (String) m35234b(this.f20637Z);
    }

    /* renamed from: v */
    public final String mo29052v() {
        return (String) m35234b(this.f20639b0);
    }

    /* renamed from: w */
    public final String mo29054w() {
        return (String) m35234b(this.f20638a0);
    }

    /* renamed from: x */
    public final String mo29056x() {
        return (String) m35234b(this.f20640c0);
    }

    /* renamed from: y */
    public final String mo29058y() {
        return (String) m35234b(this.f20642e0);
    }

    /* renamed from: z */
    public final String mo29060z() {
        return (String) m35234b(this.f20641d0);
    }

    /* renamed from: c */
    private static String m35236c(Object obj) {
        return obj instanceof Enum ? C6412r.m29777a((Enum) obj).mo25834e() : obj.toString();
    }

    /* renamed from: a */
    public C7299q mo29006a(Long l) {
        this.f20650m0 = m35235b((T) l);
        return this;
    }

    /* renamed from: b */
    public C7299q m35252b(String str, Object obj) {
        return (C7299q) super.mo25098b(str, obj);
    }

    /* renamed from: d */
    public C7299q mo29016d(String str) {
        this.f20626O = m35235b((T) str);
        return this;
    }

    /* renamed from: e */
    public C7299q mo29018e(String str) {
        this.f20649l0 = m35235b((T) str);
        return this;
    }

    /* renamed from: f */
    public final Long mo29021f() {
        return (Long) m35234b(this.f20650m0);
    }

    /* renamed from: g */
    public final String mo29023g() {
        return (String) m35234b(this.f20649l0);
    }

    /* renamed from: h */
    public final List<String> mo29025h() {
        return this.f20649l0;
    }

    /* renamed from: i */
    public C7299q mo29026i(String str) {
        this.f20631T = m35235b((T) str);
        return this;
    }

    /* renamed from: j */
    public C7299q mo29028j(String str) {
        this.f20632U = m35235b((T) str);
        return this;
    }

    /* renamed from: l */
    public C7299q mo29031l(String str) {
        this.f20634W = m35235b((T) str);
        return this;
    }

    /* renamed from: m */
    public C7299q mo29033m(String str) {
        this.f20635X = m35235b((T) str);
        return this;
    }

    /* renamed from: n */
    public C7299q mo29035n(String str) {
        this.f20636Y = m35235b((T) str);
        return this;
    }

    /* renamed from: o */
    public C7299q mo29037o(String str) {
        this.f20637Z = m35235b((T) str);
        return this;
    }

    /* renamed from: p */
    public C7299q mo29039p(String str) {
        this.f20639b0 = m35235b((T) str);
        return this;
    }

    /* renamed from: q */
    public C7299q mo29041q(String str) {
        this.f20638a0 = m35235b((T) str);
        return this;
    }

    /* renamed from: r */
    public C7299q mo29043r(String str) {
        this.f20640c0 = m35235b((T) str);
        return this;
    }

    /* renamed from: s */
    public C7299q mo29045s(String str) {
        this.f20642e0 = m35235b((T) str);
        return this;
    }

    /* renamed from: t */
    public C7299q mo29047t(String str) {
        this.f20641d0 = m35235b((T) str);
        return this;
    }

    /* renamed from: u */
    public C7299q mo29049u(String str) {
        this.f20643f0 = m35235b((T) str);
        return this;
    }

    /* renamed from: v */
    public C7299q mo29051v(String str) {
        this.f20644g0 = m35235b((T) str);
        return this;
    }

    /* renamed from: w */
    public C7299q mo29053w(String str) {
        this.f20645h0 = m35235b((T) str);
        return this;
    }

    /* renamed from: x */
    public C7299q mo29055x(String str) {
        this.f20646i0 = m35235b((T) str);
        return this;
    }

    /* renamed from: y */
    public C7299q mo29057y(String str) {
        this.f20647j0 = m35235b((T) str);
        return this;
    }

    /* renamed from: z */
    public C7299q mo29059z(String str) {
        this.f20648k0 = m35235b((T) str);
        return this;
    }

    /* renamed from: a */
    public C7299q mo29007a(String str, String str2) {
        String valueOf = String.valueOf(String.valueOf((String) C6381h0.m29663a(str)));
        String valueOf2 = String.valueOf(String.valueOf((String) C6381h0.m29663a(str2)));
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(valueOf2);
        String valueOf3 = String.valueOf(C6371e.m29643c(C6399n0.m29727a(sb.toString())));
        String str3 = "Basic ";
        return mo29020f(valueOf3.length() != 0 ? str3.concat(valueOf3) : new String(str3));
    }

    /* renamed from: b */
    public C7299q mo29013b(Long l) {
        this.f20630S = m35235b((T) l);
        return this;
    }

    public C7299q clone() {
        return (C7299q) super.clone();
    }

    /* renamed from: b */
    private <T> T m35234b(List<T> list) {
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: b */
    private <T> List<T> m35235b(T t) {
        if (t == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: a */
    private static void m35233a(Logger logger, StringBuilder sb, StringBuilder sb2, C7259d0 d0Var, String str, Object obj, Writer writer) throws IOException {
        if (obj != null && !C6398n.m29723b(obj)) {
            String c = m35236c(obj);
            String str2 = (("Authorization".equalsIgnoreCase(str) || "Cookie".equalsIgnoreCase(str)) && (logger == null || !logger.isLoggable(Level.ALL))) ? "<Not Logged>" : c;
            String str3 = ": ";
            if (sb != null) {
                sb.append(str);
                sb.append(str3);
                sb.append(str2);
                sb.append(C6399n0.f17828a);
            }
            if (sb2 != null) {
                sb2.append(" -H '");
                sb2.append(str);
                sb2.append(str3);
                sb2.append(str2);
                sb2.append("'");
            }
            if (d0Var != null) {
                d0Var.mo25349a(str, c);
            }
            if (writer != null) {
                writer.write(str);
                writer.write(str3);
                writer.write(c);
                writer.write("\r\n");
            }
        }
    }

    /* renamed from: b */
    public List<String> mo29014b(String str) {
        Object obj = get(str.toLowerCase());
        if (obj == null) {
            return Collections.emptyList();
        }
        Class cls = obj.getClass();
        if (!(obj instanceof Iterable) && !cls.isArray()) {
            return Collections.singletonList(m35236c(obj));
        }
        ArrayList arrayList = new ArrayList();
        for (Object c : C6409q0.m29765a(obj)) {
            arrayList.add(m35236c(c));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static void m35230a(C7299q qVar, StringBuilder sb, StringBuilder sb2, Logger logger, C7259d0 d0Var) throws IOException {
        m35231a(qVar, sb, sb2, logger, d0Var, null);
    }

    /* renamed from: a */
    public static void m35232a(C7299q qVar, StringBuilder sb, Logger logger, Writer writer) throws IOException {
        m35231a(qVar, sb, null, logger, null, writer);
    }

    /* renamed from: a */
    static void m35231a(C7299q qVar, StringBuilder sb, StringBuilder sb2, Logger logger, C7259d0 d0Var, Writer writer) throws IOException {
        HashSet hashSet = new HashSet();
        for (Entry entry : qVar.entrySet()) {
            String str = (String) entry.getKey();
            C6381h0.m29668a(hashSet.add(str), "multiple headers of the same name (headers are case insensitive): %s", str);
            Object value = entry.getValue();
            if (value != null) {
                C6412r b = qVar.mo25840b().mo25769b(str);
                if (b != null) {
                    str = b.mo25834e();
                }
                Class cls = value.getClass();
                if ((value instanceof Iterable) || cls.isArray()) {
                    for (Object a : C6409q0.m29765a(value)) {
                        m35233a(logger, sb, sb2, d0Var, str, a, writer);
                    }
                } else {
                    m35233a(logger, sb, sb2, d0Var, str, value, writer);
                }
            }
        }
        if (writer != null) {
            writer.flush();
        }
    }

    /* renamed from: a */
    public final void mo29010a(C7261e0 e0Var, StringBuilder sb) throws IOException {
        clear();
        C7301b bVar = new C7301b(this, sb);
        int f = e0Var.mo25356f();
        for (int i = 0; i < f; i++) {
            mo29012a(e0Var.mo25350a(i), e0Var.mo25352b(i), bVar);
        }
        bVar.mo29061a();
    }

    /* renamed from: a */
    public String mo29009a(String str) {
        Object obj = get(str.toLowerCase());
        if (obj == null) {
            return null;
        }
        Class cls = obj.getClass();
        if ((obj instanceof Iterable) || cls.isArray()) {
            Iterator it = C6409q0.m29765a(obj).iterator();
            if (it.hasNext()) {
                return m35236c(it.next());
            }
        }
        return m35236c(obj);
    }

    /* renamed from: a */
    public final void mo29011a(C7299q qVar) {
        try {
            C7301b bVar = new C7301b(this, null);
            m35230a(qVar, null, null, null, new C7300a(this, bVar));
            bVar.mo29061a();
        } catch (IOException e) {
            throw C6406p0.m29736a(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29012a(String str, String str2, C7301b bVar) {
        List<Type> list = bVar.f20656d;
        C6387k kVar = bVar.f20655c;
        C6362b bVar2 = bVar.f20653a;
        StringBuilder sb = bVar.f20654b;
        if (sb != null) {
            String valueOf = String.valueOf(String.valueOf(str));
            String valueOf2 = String.valueOf(String.valueOf(str2));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 2 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append(": ");
            sb2.append(valueOf2);
            sb.append(sb2.toString());
            sb.append(C6399n0.f17828a);
        }
        C6412r b = kVar.mo25769b(str);
        if (b != null) {
            Type a = C6398n.m29717a(list, b.mo25833d());
            if (C6409q0.m29776d(a)) {
                Class a2 = C6409q0.m29763a(list, C6409q0.m29769a(a));
                bVar2.mo25747a(b.mo25832c(), a2, m35229a((Type) a2, list, str2));
            } else if (C6409q0.m29773a(C6409q0.m29763a(list, a), Iterable.class)) {
                Collection collection = (Collection) b.mo25829a((Object) this);
                if (collection == null) {
                    collection = C6398n.m29722b(a);
                    b.mo25830a((Object) this, (Object) collection);
                }
                collection.add(m35229a(a == Object.class ? null : C6409q0.m29774b(a), list, str2));
            } else {
                b.mo25830a((Object) this, m35229a(a, list, str2));
            }
        } else {
            ArrayList arrayList = (ArrayList) get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                mo25098b(str, (Object) arrayList);
            }
            arrayList.add(str2);
        }
    }

    /* renamed from: a */
    private static Object m35229a(Type type, List<Type> list, String str) {
        return C6398n.m29716a(C6398n.m29717a(list, type), str);
    }
}
