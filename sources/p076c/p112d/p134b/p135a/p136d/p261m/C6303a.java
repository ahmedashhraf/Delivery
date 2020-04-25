package p076c.p112d.p134b.p135a.p136d.p261m;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.p261m.C6306b.C6307a;
import p076c.p112d.p134b.p135a.p136d.p261m.C6306b.C6308b;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6371e;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6384i0;
import p076c.p112d.p134b.p135a.p143g.C6399n0;

/* renamed from: c.d.b.a.d.m.a */
/* compiled from: JsonWebSignature */
public class C6303a extends C6306b {

    /* renamed from: c */
    private final byte[] f17653c;

    /* renamed from: d */
    private final byte[] f17654d;

    /* renamed from: c.d.b.a.d.m.a$a */
    /* compiled from: JsonWebSignature */
    public static class C6304a extends C6307a {
        @C2768v("alg")

        /* renamed from: Q */
        private String f17655Q;
        @C2768v("jku")

        /* renamed from: R */
        private String f17656R;
        @C2768v("jwk")

        /* renamed from: S */
        private String f17657S;
        @C2768v("kid")

        /* renamed from: T */
        private String f17658T;
        @C2768v("x5u")

        /* renamed from: U */
        private String f17659U;
        @C2768v("x5t")

        /* renamed from: V */
        private String f17660V;
        @C2768v("x5c")

        /* renamed from: W */
        private List<String> f17661W;
        @C2768v("crit")

        /* renamed from: X */
        private List<String> f17662X;

        /* renamed from: a */
        public C6304a mo25545a(List<String> list) {
            this.f17662X = list;
            return this;
        }

        /* renamed from: c */
        public C6304a mo25548c(String str) {
            this.f17655Q = str;
            return this;
        }

        /* renamed from: d */
        public C6304a mo25549d(String str) {
            this.f17657S = str;
            return this;
        }

        /* renamed from: e */
        public C6304a mo25550e(String str) {
            this.f17656R = str;
            return this;
        }

        /* renamed from: f */
        public C6304a mo25551f(String str) {
            this.f17658T = str;
            return this;
        }

        @Deprecated
        /* renamed from: g */
        public C6304a mo25552g(String str) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            this.f17661W = arrayList;
            return this;
        }

        /* renamed from: h */
        public final String mo25554h() {
            return this.f17655Q;
        }

        /* renamed from: i */
        public C6304a mo25555i(String str) {
            this.f17659U = str;
            return this;
        }

        /* renamed from: j */
        public final String mo25557j() {
            return this.f17657S;
        }

        /* renamed from: l */
        public final String mo25558l() {
            return this.f17656R;
        }

        /* renamed from: m */
        public final String mo25559m() {
            return this.f17658T;
        }

        @Deprecated
        /* renamed from: n */
        public final String mo25560n() {
            List<String> list = this.f17661W;
            if (list == null || list.isEmpty()) {
                return null;
            }
            return (String) this.f17661W.get(0);
        }

        /* renamed from: o */
        public final List<String> mo25561o() {
            return this.f17661W;
        }

        /* renamed from: p */
        public final String mo25562p() {
            return this.f17660V;
        }

        /* renamed from: q */
        public final String mo25563q() {
            return this.f17659U;
        }

        /* renamed from: h */
        public C6304a mo25553h(String str) {
            this.f17660V = str;
            return this;
        }

        /* renamed from: i */
        public final List<String> mo25556i() {
            return this.f17662X;
        }

        /* renamed from: b */
        public C6304a m29314b(String str) {
            super.mo25546b(str);
            return this;
        }

        public C6304a clone() {
            return (C6304a) super.clone();
        }

        /* renamed from: b */
        public C6304a mo25547b(List<String> list) {
            this.f17661W = list;
            return this;
        }

        /* renamed from: b */
        public C6304a m29312b(String str, Object obj) {
            return (C6304a) super.m29345b(str, obj);
        }
    }

    /* renamed from: c.d.b.a.d.m.a$b */
    /* compiled from: JsonWebSignature */
    public static final class C6305b {

        /* renamed from: a */
        private final C6290d f17663a;

        /* renamed from: b */
        private Class<? extends C6304a> f17664b = C6304a.class;

        /* renamed from: c */
        private Class<? extends C6308b> f17665c = C6308b.class;

        public C6305b(C6290d dVar) {
            this.f17663a = (C6290d) C6381h0.m29663a(dVar);
        }

        /* renamed from: a */
        public Class<? extends C6304a> mo25566a() {
            return this.f17664b;
        }

        /* renamed from: b */
        public C6305b mo25568b(Class<? extends C6308b> cls) {
            this.f17665c = cls;
            return this;
        }

        /* renamed from: c */
        public Class<? extends C6308b> mo25569c() {
            return this.f17665c;
        }

        /* renamed from: a */
        public C6305b mo25564a(Class<? extends C6304a> cls) {
            this.f17664b = cls;
            return this;
        }

        /* renamed from: b */
        public C6290d mo25567b() {
            return this.f17663a;
        }

        /* renamed from: a */
        public C6303a mo25565a(String str) throws IOException {
            int indexOf = str.indexOf(46);
            boolean z = true;
            C6381h0.m29666a(indexOf != -1);
            byte[] a = C6371e.m29640a(str.substring(0, indexOf));
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(46, i);
            C6381h0.m29666a(indexOf2 != -1);
            int i2 = indexOf2 + 1;
            C6381h0.m29666a(str.indexOf(46, i2) == -1);
            byte[] a2 = C6371e.m29640a(str.substring(i, indexOf2));
            byte[] a3 = C6371e.m29640a(str.substring(i2));
            byte[] a4 = C6399n0.m29727a(str.substring(0, indexOf2));
            C6304a aVar = (C6304a) this.f17663a.mo25494a((InputStream) new ByteArrayInputStream(a), this.f17664b);
            if (aVar.mo25554h() == null) {
                z = false;
            }
            C6381h0.m29666a(z);
            return new C6303a(aVar, (C6308b) this.f17663a.mo25494a((InputStream) new ByteArrayInputStream(a2), this.f17665c), a3, a4);
        }
    }

    public C6303a(C6304a aVar, C6308b bVar, byte[] bArr, byte[] bArr2) {
        super(aVar, bVar);
        this.f17653c = (byte[]) C6381h0.m29663a(bArr);
        this.f17654d = (byte[]) C6381h0.m29663a(bArr2);
    }

    /* renamed from: f */
    private static X509TrustManager m29301f() {
        TrustManager[] trustManagers;
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(null);
            for (TrustManager trustManager : instance.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
        } catch (KeyStoreException | NoSuchAlgorithmException unused) {
        }
        return null;
    }

    /* renamed from: c */
    public final byte[] mo25542c() {
        return this.f17653c;
    }

    /* renamed from: d */
    public final byte[] mo25543d() {
        return this.f17654d;
    }

    @C2766f
    /* renamed from: e */
    public final X509Certificate mo25544e() throws GeneralSecurityException {
        X509TrustManager f = m29301f();
        if (f == null) {
            return null;
        }
        return mo25540a(f);
    }

    /* renamed from: a */
    public C6304a m29303a() {
        return (C6304a) super.mo25539a();
    }

    /* renamed from: a */
    public final boolean mo25541a(PublicKey publicKey) throws GeneralSecurityException {
        if ("RS256".equals(m29303a().mo25554h())) {
            return C6384i0.m29681a(C6384i0.m29687f(), publicKey, this.f17653c, this.f17654d);
        }
        return false;
    }

    @C2766f
    /* renamed from: a */
    public final X509Certificate mo25540a(X509TrustManager x509TrustManager) throws GeneralSecurityException {
        List o = m29303a().mo25561o();
        if (o != null && !o.isEmpty()) {
            if ("RS256".equals(m29303a().mo25554h())) {
                return C6384i0.m29678a(C6384i0.m29687f(), x509TrustManager, o, this.f17653c, this.f17654d);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C6303a m29299a(C6290d dVar, String str) throws IOException {
        return m29298a(dVar).mo25565a(str);
    }

    /* renamed from: a */
    public static C6305b m29298a(C6290d dVar) {
        return new C6305b(dVar);
    }

    /* renamed from: a */
    public static String m29300a(PrivateKey privateKey, C6290d dVar, C6304a aVar, C6308b bVar) throws GeneralSecurityException, IOException {
        String valueOf = String.valueOf(String.valueOf(C6371e.m29645e(dVar.mo25498a((Object) aVar))));
        String valueOf2 = String.valueOf(String.valueOf(C6371e.m29645e(dVar.mo25498a((Object) bVar))));
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        String str = ".";
        sb.append(str);
        sb.append(valueOf2);
        String sb2 = sb.toString();
        byte[] a = C6384i0.m29682a(C6384i0.m29687f(), privateKey, C6399n0.m29727a(sb2));
        String valueOf3 = String.valueOf(String.valueOf(sb2));
        String valueOf4 = String.valueOf(String.valueOf(C6371e.m29645e(a)));
        StringBuilder sb3 = new StringBuilder(valueOf3.length() + 1 + valueOf4.length());
        sb3.append(valueOf3);
        sb3.append(str);
        sb3.append(valueOf4);
        return sb3.toString();
    }
}
