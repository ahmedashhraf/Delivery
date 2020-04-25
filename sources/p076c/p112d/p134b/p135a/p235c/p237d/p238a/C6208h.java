package p076c.p112d.p134b.p135a.p235c.p237d.p238a;

import com.google.api.client.auth.oauth2.C7215f;
import com.google.api.client.auth.oauth2.C7221i;
import com.google.api.client.auth.oauth2.C7222j;
import com.google.api.client.auth.oauth2.C7222j.C7224b;
import com.google.api.client.auth.oauth2.C7225k;
import com.google.api.client.auth.oauth2.C7233s;
import com.google.api.client.auth.oauth2.C7236t;
import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7298p;
import com.google.api.client.http.C7308w;
import com.mrsool.utils.webservice.C11687c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Collection;
import java.util.Collections;
import p076c.p112d.p134b.p135a.p136d.C6288b;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.C6292f;
import p076c.p112d.p134b.p135a.p136d.p261m.C6303a;
import p076c.p112d.p134b.p135a.p136d.p261m.C6303a.C6304a;
import p076c.p112d.p134b.p135a.p136d.p261m.C6306b.C6308b;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6378g0;
import p076c.p112d.p134b.p135a.p143g.C6378g0.C6379a;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6384i0;
import p076c.p112d.p134b.p135a.p143g.C6391l;
import p076c.p112d.p134b.p135a.p143g.C6435u;
import p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6206g.C6207a;
import p076c.p112d.p134b.p135a.p235c.p258l.C6284a;

/* renamed from: c.d.b.a.c.d.a.h */
/* compiled from: GoogleCredential */
public class C6208h extends C7222j {

    /* renamed from: t */
    static final String f17468t = "authorized_user";

    /* renamed from: u */
    static final String f17469u = "service_account";
    @C2766f

    /* renamed from: v */
    private static C6197b f17470v = new C6197b();

    /* renamed from: n */
    private String f17471n;

    /* renamed from: o */
    private String f17472o;

    /* renamed from: p */
    private Collection<String> f17473p;

    /* renamed from: q */
    private PrivateKey f17474q;

    /* renamed from: r */
    private String f17475r;

    /* renamed from: s */
    private String f17476s;

    /* renamed from: c.d.b.a.c.d.a.h$a */
    /* compiled from: GoogleCredential */
    public static class C6209a extends C7224b {

        /* renamed from: i */
        String f17477i;

        /* renamed from: j */
        Collection<String> f17478j;

        /* renamed from: k */
        PrivateKey f17479k;

        /* renamed from: l */
        String f17480l;

        /* renamed from: m */
        String f17481m;

        /* renamed from: n */
        String f17482n;

        public C6209a() {
            super(C7215f.m34657a());
            m28651a(C6214k.f17489b);
        }

        /* renamed from: b */
        public C6209a mo25281b(String str) {
            this.f17477i = str;
            return this;
        }

        @C2766f
        /* renamed from: c */
        public C6209a mo25283c(String str) {
            this.f17480l = str;
            return this;
        }

        /* renamed from: d */
        public C6209a mo25284d(String str) {
            this.f17481m = str;
            return this;
        }

        /* renamed from: e */
        public C6209a mo25285e(String str) {
            this.f17482n = str;
            return this;
        }

        /* renamed from: j */
        public final String mo25286j() {
            return this.f17477i;
        }

        /* renamed from: k */
        public final PrivateKey mo25287k() {
            return this.f17479k;
        }

        @C2766f
        /* renamed from: l */
        public final String mo25288l() {
            return this.f17480l;
        }

        /* renamed from: m */
        public final String mo25289m() {
            return this.f17481m;
        }

        /* renamed from: n */
        public final Collection<String> mo25290n() {
            return this.f17478j;
        }

        /* renamed from: o */
        public final String mo25291o() {
            return this.f17482n;
        }

        /* renamed from: b */
        public C6209a mo25282b(Collection<String> collection) {
            this.f17478j = collection;
            return this;
        }

        @C2766f
        /* renamed from: b */
        public C6209a mo25280b(File file) throws GeneralSecurityException, IOException {
            this.f17479k = C6384i0.m29685d().generatePrivate(new PKCS8EncodedKeySpec(C6378g0.m29657a(new FileReader(file), "PRIVATE KEY").mo25757a()));
            return this;
        }

        /* renamed from: a */
        public C6208h m28653a() {
            return new C6208h(this);
        }

        /* renamed from: a */
        public C6209a m28647a(C7253a0 a0Var) {
            return (C6209a) super.mo25270a(a0Var);
        }

        /* renamed from: a */
        public C6209a m28644a(C6290d dVar) {
            return (C6209a) super.mo25267a(dVar);
        }

        /* renamed from: a */
        public C6209a m28645a(C6391l lVar) {
            return (C6209a) super.mo25268a(lVar);
        }

        /* renamed from: a */
        public C6209a mo25276a(String str, String str2) {
            m28649a((C7298p) new C7221i(str, str2));
            return this;
        }

        /* renamed from: a */
        public C6209a mo25266a(C6206g gVar) {
            C6207a f = gVar.mo25239f();
            m28649a((C7298p) new C7221i(f.mo25248g(), f.mo25249h()));
            return this;
        }

        /* renamed from: a */
        public C6209a mo25277a(PrivateKey privateKey) {
            this.f17479k = privateKey;
            return this;
        }

        /* renamed from: a */
        public C6209a mo25274a(File file) throws GeneralSecurityException, IOException {
            KeyStore c = C6384i0.m29684c();
            FileInputStream fileInputStream = new FileInputStream(file);
            String str = "notasecret";
            this.f17479k = C6384i0.m29676a(c, (InputStream) fileInputStream, str, "privatekey", str);
            return this;
        }

        /* renamed from: a */
        public C6209a m28650a(C7308w wVar) {
            return (C6209a) super.mo25273a(wVar);
        }

        /* renamed from: a */
        public C6209a m28646a(C7225k kVar) {
            return (C6209a) super.mo25269a(kVar);
        }

        /* renamed from: a */
        public C6209a m28652a(Collection<C7225k> collection) {
            return (C6209a) super.mo25278a(collection);
        }

        /* renamed from: a */
        public C6209a m28648a(C7274j jVar) {
            return (C6209a) super.mo25271a(jVar);
        }

        /* renamed from: a */
        public C6209a m28651a(String str) {
            return (C6209a) super.mo25275a(str);
        }

        /* renamed from: a */
        public C6209a m28649a(C7298p pVar) {
            return (C6209a) super.mo25272a(pVar);
        }
    }

    public C6208h() {
        this(new C6209a());
    }

    @C2766f
    /* renamed from: c */
    private static PrivateKey m28608c(String str) throws IOException {
        C6379a a = C6378g0.m29657a(new StringReader(str), "PRIVATE KEY");
        if (a != null) {
            try {
                return C6384i0.m29685d().generatePrivate(new PKCS8EncodedKeySpec(a.mo25757a()));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                throw ((IOException) C6219o.m28803a(new IOException("Unexpected exception reading PKCS data"), e));
            }
        } else {
            throw new IOException("Invalid PKCS8 data.");
        }
    }

    @C2766f
    /* renamed from: w */
    public static C6208h m28609w() throws IOException {
        return m28604a(C6284a.m29145b(), C6284a.m29144a());
    }

    @C2766f
    /* renamed from: o */
    public boolean mo25258o() {
        boolean z = false;
        if (this.f17474q == null) {
            return false;
        }
        Collection<String> collection = this.f17473p;
        if (collection == null || collection.isEmpty()) {
            z = true;
        }
        return z;
    }

    /* renamed from: p */
    public final String mo25259p() {
        return this.f17471n;
    }

    /* renamed from: q */
    public final PrivateKey mo25260q() {
        return this.f17474q;
    }

    @C2766f
    /* renamed from: r */
    public final String mo25261r() {
        return this.f17475r;
    }

    /* renamed from: s */
    public final String mo25262s() {
        return this.f17472o;
    }

    /* renamed from: t */
    public final Collection<String> mo25263t() {
        return this.f17473p;
    }

    /* renamed from: u */
    public final String mo25264u() {
        if (this.f17473p == null) {
            return null;
        }
        return C6435u.m29851a(' ').mo25875a((Iterable<?>) this.f17473p);
    }

    /* renamed from: v */
    public final String mo25265v() {
        return this.f17476s;
    }

    protected C6208h(C6209a aVar) {
        super((C7224b) aVar);
        if (aVar.f17479k == null) {
            C6381h0.m29666a(aVar.f17477i == null && aVar.f17478j == null && aVar.f17482n == null);
            return;
        }
        this.f17471n = (String) C6381h0.m29663a(aVar.f17477i);
        this.f17472o = aVar.f17481m;
        Collection<String> collection = aVar.f17478j;
        this.f17473p = collection == null ? Collections.emptyList() : Collections.unmodifiableCollection(collection);
        this.f17474q = aVar.f17479k;
        this.f17475r = aVar.f17480l;
        this.f17476s = aVar.f17482n;
    }

    /* renamed from: b */
    public C6208h m28621b(String str) {
        if (str != null) {
            C6381h0.m29667a((mo28696g() == null || mo28702m() == null || mo28692c() == null) ? false : true, (Object) "Please use the Builder and call setJsonFactory, setTransport and setClientSecrets");
        }
        return (C6208h) super.mo25257b(str);
    }

    @C2766f
    /* renamed from: a */
    public static C6208h m28604a(C7253a0 a0Var, C6290d dVar) throws IOException {
        C6381h0.m29663a(a0Var);
        C6381h0.m29663a(dVar);
        return f17470v.mo25189a(a0Var, dVar);
    }

    /* renamed from: b */
    public C6208h m28620b(Long l) {
        return (C6208h) super.mo25256b(l);
    }

    @C2766f
    /* renamed from: b */
    private static C6208h m28607b(C6288b bVar, C7253a0 a0Var, C6290d dVar) throws IOException {
        String str = (String) bVar.get("client_id");
        String str2 = (String) bVar.get(C11687c.f33834s0);
        String str3 = (String) bVar.get("refresh_token");
        if (str == null || str2 == null || str3 == null) {
            throw new IOException("Error reading user credential from stream,  expecting 'client_id', 'client_secret' and 'refresh_token'.");
        }
        C6208h a = new C6209a().mo25276a(str, str2).m28647a(a0Var).m28644a(dVar).m28653a();
        a.m28621b(str3);
        a.mo28703n();
        return a;
    }

    @C2766f
    /* renamed from: a */
    public static C6208h m28605a(InputStream inputStream) throws IOException {
        return m28606a(inputStream, C6284a.m29145b(), C6284a.m29144a());
    }

    @C2766f
    /* renamed from: a */
    public static C6208h m28606a(InputStream inputStream, C7253a0 a0Var, C6290d dVar) throws IOException {
        C6381h0.m29663a(inputStream);
        C6381h0.m29663a(a0Var);
        C6381h0.m29663a(dVar);
        C6288b bVar = (C6288b) new C6292f(dVar).mo25503a(inputStream, C6219o.f17506a, C6288b.class);
        String str = (String) bVar.get("type");
        if (str != null) {
            String str2 = f17468t;
            if (str2.equals(str)) {
                return m28607b(bVar, a0Var, dVar);
            }
            String str3 = f17469u;
            if (str3.equals(str)) {
                return m28603a(bVar, a0Var, dVar);
            }
            throw new IOException(String.format("Error reading credentials from stream, 'type' value '%s' not recognized. Expecting '%s' or '%s'.", new Object[]{str, str2, str3}));
        }
        throw new IOException("Error reading credentials from stream, 'type' field not specified.");
    }

    /* renamed from: a */
    public C6208h m28616a(String str) {
        return (C6208h) super.mo25254a(str);
    }

    /* renamed from: a */
    public C6208h m28615a(Long l) {
        return (C6208h) super.mo25253a(l);
    }

    /* renamed from: a */
    public C6208h m28614a(C7236t tVar) {
        return (C6208h) super.mo25252a(tVar);
    }

    /* access modifiers changed from: protected */
    @C2766f
    /* renamed from: a */
    public C7236t mo25187a() throws IOException {
        if (this.f17474q == null) {
            return super.mo25187a();
        }
        C6304a aVar = new C6304a();
        aVar.mo25548c("RS256");
        aVar.m29314b("JWT");
        aVar.mo25551f(this.f17475r);
        C6308b bVar = new C6308b();
        long a = mo28693d().mo25628a();
        bVar.mo25093a(this.f17471n);
        bVar.mo25096b((Object) mo28701l());
        long j = a / 1000;
        bVar.mo25095b(Long.valueOf(j));
        bVar.mo25092a(Long.valueOf(j + 3600));
        bVar.mo25100c(this.f17476s);
        bVar.put("scope", C6435u.m29851a(' ').mo25875a((Iterable<?>) this.f17473p));
        try {
            String a2 = C6303a.m29300a(this.f17474q, mo28696g(), aVar, bVar);
            C7233s sVar = new C7233s(mo28702m(), mo28696g(), new C7274j(mo28701l()), "urn:ietf:params:oauth:grant-type:jwt-bearer");
            sVar.put("assertion", a2);
            return sVar.execute();
        } catch (GeneralSecurityException e) {
            IOException iOException = new IOException();
            iOException.initCause(e);
            throw iOException;
        }
    }

    @C2766f
    /* renamed from: a */
    public C6208h mo25255a(Collection<String> collection) {
        if (this.f17474q == null) {
            return this;
        }
        return new C6209a().mo25277a(this.f17474q).mo25283c(this.f17475r).mo25281b(this.f17471n).mo25284d(this.f17472o).mo25285e(this.f17476s).mo25282b(collection).m28651a(mo28701l()).m28647a(mo28702m()).m28644a(mo28696g()).m28645a(mo28693d()).m28653a();
    }

    @C2766f
    /* renamed from: a */
    private static C6208h m28603a(C6288b bVar, C7253a0 a0Var, C6290d dVar) throws IOException {
        String str = (String) bVar.get("client_email");
        String str2 = (String) bVar.get("private_key");
        String str3 = (String) bVar.get("private_key_id");
        if (((String) bVar.get("client_id")) == null || str == null || str2 == null || str3 == null) {
            throw new IOException("Error reading service account credential from stream, expecting  'client_id', 'client_email', 'private_key' and 'private_key_id'.");
        }
        C6209a c = new C6209a().m28647a(a0Var).m28644a(dVar).mo25281b(str).mo25282b((Collection<String>) Collections.emptyList()).mo25277a(m28608c(str2)).mo25283c(str3);
        String str4 = (String) bVar.get("token_uri");
        if (str4 != null) {
            c.m28651a(str4);
        }
        String str5 = (String) bVar.get("project_id");
        if (str5 != null) {
            c.mo25284d(str5);
        }
        return c.m28653a();
    }
}
