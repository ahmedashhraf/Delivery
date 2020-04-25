package p076c.p112d.p134b.p135a.p228a.p230b;

import java.util.Collection;
import java.util.Collections;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6391l;

@C2766f
/* renamed from: c.d.b.a.a.b.c */
/* compiled from: IdTokenVerifier */
public class C6178c {

    /* renamed from: e */
    public static final long f17410e = 300;

    /* renamed from: a */
    private final C6391l f17411a;

    /* renamed from: b */
    private final long f17412b;

    /* renamed from: c */
    private final Collection<String> f17413c;

    /* renamed from: d */
    private final Collection<String> f17414d;

    @C2766f
    /* renamed from: c.d.b.a.a.b.c$a */
    /* compiled from: IdTokenVerifier */
    public static class C6179a {

        /* renamed from: a */
        C6391l f17415a = C6391l.f17814a;

        /* renamed from: b */
        long f17416b = 300;

        /* renamed from: c */
        Collection<String> f17417c;

        /* renamed from: d */
        Collection<String> f17418d;

        /* renamed from: a */
        public C6178c mo25132a() {
            return new C6178c(this);
        }

        /* renamed from: b */
        public C6179a mo25134b(Collection<String> collection) {
            C6381h0.m29667a(collection == null || !collection.isEmpty(), (Object) "Issuers must not be empty");
            this.f17417c = collection;
            return this;
        }

        /* renamed from: c */
        public final Collection<String> mo25135c() {
            return this.f17418d;
        }

        /* renamed from: d */
        public final C6391l mo25136d() {
            return this.f17415a;
        }

        /* renamed from: e */
        public final String mo25137e() {
            Collection<String> collection = this.f17417c;
            if (collection == null) {
                return null;
            }
            return (String) collection.iterator().next();
        }

        /* renamed from: f */
        public final Collection<String> mo25138f() {
            return this.f17417c;
        }

        /* renamed from: a */
        public C6179a mo25129a(C6391l lVar) {
            this.f17415a = (C6391l) C6381h0.m29663a(lVar);
            return this;
        }

        /* renamed from: a */
        public C6179a mo25130a(String str) {
            if (str == null) {
                return mo25134b(null);
            }
            return mo25134b(Collections.singleton(str));
        }

        /* renamed from: b */
        public final long mo25133b() {
            return this.f17416b;
        }

        /* renamed from: a */
        public C6179a mo25131a(Collection<String> collection) {
            this.f17418d = collection;
            return this;
        }

        /* renamed from: a */
        public C6179a mo25128a(long j) {
            C6381h0.m29666a(j >= 0);
            this.f17416b = j;
            return this;
        }
    }

    public C6178c() {
        this(new C6179a());
    }

    /* renamed from: a */
    public final long mo25122a() {
        return this.f17412b;
    }

    /* renamed from: b */
    public final Collection<String> mo25124b() {
        return this.f17414d;
    }

    /* renamed from: c */
    public final C6391l mo25125c() {
        return this.f17411a;
    }

    /* renamed from: d */
    public final String mo25126d() {
        Collection<String> collection = this.f17413c;
        if (collection == null) {
            return null;
        }
        return (String) collection.iterator().next();
    }

    /* renamed from: e */
    public final Collection<String> mo25127e() {
        return this.f17413c;
    }

    protected C6178c(C6179a aVar) {
        this.f17411a = aVar.f17415a;
        this.f17412b = aVar.f17416b;
        Collection<String> collection = aVar.f17417c;
        Collection<String> collection2 = null;
        this.f17413c = collection == null ? null : Collections.unmodifiableCollection(collection);
        Collection<String> collection3 = aVar.f17418d;
        if (collection3 != null) {
            collection2 = Collections.unmodifiableCollection(collection3);
        }
        this.f17414d = collection2;
    }

    /* renamed from: a */
    public boolean mo25123a(C6175a aVar) {
        Collection<String> collection = this.f17413c;
        if (collection == null || aVar.mo25090b(collection)) {
            Collection<String> collection2 = this.f17414d;
            if ((collection2 == null || aVar.mo25087a(collection2)) && aVar.mo25091c(this.f17411a.mo25628a(), this.f17412b)) {
                return true;
            }
        }
        return false;
    }
}
