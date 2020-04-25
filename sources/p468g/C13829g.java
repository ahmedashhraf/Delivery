package p468g;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.C14910b;
import okhttp3.internal.p521l.C15015c;
import p201f.p202a.C5952h;
import p470h.C13896f;

/* renamed from: g.g */
/* compiled from: CertificatePinner */
public final class C13829g {

    /* renamed from: c */
    public static final C13829g f39997c = new C13830a().mo43461a();

    /* renamed from: a */
    private final Set<C13831b> f39998a;
    @C5952h

    /* renamed from: b */
    private final C15015c f39999b;

    /* renamed from: g.g$a */
    /* compiled from: CertificatePinner */
    public static final class C13830a {

        /* renamed from: a */
        private final List<C13831b> f40000a = new ArrayList();

        /* renamed from: a */
        public C13830a mo43460a(String str, String... strArr) {
            if (str != null) {
                for (String bVar : strArr) {
                    this.f40000a.add(new C13831b(str, bVar));
                }
                return this;
            }
            throw new NullPointerException("pattern == null");
        }

        /* renamed from: a */
        public C13829g mo43461a() {
            return new C13829g(new LinkedHashSet(this.f40000a), null);
        }
    }

    /* renamed from: g.g$b */
    /* compiled from: CertificatePinner */
    static final class C13831b {

        /* renamed from: e */
        private static final String f40001e = "*.";

        /* renamed from: a */
        final String f40002a;

        /* renamed from: b */
        final String f40003b;

        /* renamed from: c */
        final String f40004c;

        /* renamed from: d */
        final C13896f f40005d;

        C13831b(String str, String str2) {
            String str3;
            this.f40002a = str;
            String str4 = "http://";
            if (str.startsWith(f40001e)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append(str.substring(2));
                str3 = C13868v.m59278f(sb.toString()).mo43649h();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(str);
                str3 = C13868v.m59278f(sb2.toString()).mo43649h();
            }
            this.f40003b = str3;
            String str5 = "sha1/";
            if (str2.startsWith(str5)) {
                this.f40004c = str5;
                this.f40005d = C13896f.m59652b(str2.substring(5));
            } else {
                String str6 = "sha256/";
                if (str2.startsWith(str6)) {
                    this.f40004c = str6;
                    this.f40005d = C13896f.m59652b(str2.substring(7));
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("pins must start with 'sha256/' or 'sha1/': ");
                    sb3.append(str2);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            if (this.f40005d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("pins must be base64: ");
                sb4.append(str2);
                throw new IllegalArgumentException(sb4.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
            if (r11.regionMatches(false, r6, r7, 0, r7.length()) != false) goto L_0x0032;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo43462a(java.lang.String r11) {
            /*
                r10 = this;
                java.lang.String r0 = r10.f40002a
                java.lang.String r1 = "*."
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L_0x0033
                r0 = 46
                int r0 = r11.indexOf(r0)
                int r1 = r11.length()
                int r1 = r1 - r0
                r2 = 1
                int r1 = r1 - r2
                java.lang.String r3 = r10.f40003b
                int r3 = r3.length()
                if (r1 != r3) goto L_0x0031
                r5 = 0
                int r6 = r0 + 1
                java.lang.String r7 = r10.f40003b
                r8 = 0
                int r9 = r7.length()
                r4 = r11
                boolean r11 = r4.regionMatches(r5, r6, r7, r8, r9)
                if (r11 == 0) goto L_0x0031
                goto L_0x0032
            L_0x0031:
                r2 = 0
            L_0x0032:
                return r2
            L_0x0033:
                java.lang.String r0 = r10.f40003b
                boolean r11 = r11.equals(r0)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p468g.C13829g.C13831b.mo43462a(java.lang.String):boolean");
        }

        public boolean equals(Object obj) {
            if (obj instanceof C13831b) {
                C13831b bVar = (C13831b) obj;
                if (this.f40002a.equals(bVar.f40002a) && this.f40004c.equals(bVar.f40004c) && this.f40005d.equals(bVar.f40005d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f40002a.hashCode()) * 31) + this.f40004c.hashCode()) * 31) + this.f40005d.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f40004c);
            sb.append(this.f40005d.mo43972e());
            return sb.toString();
        }
    }

    C13829g(Set<C13831b> set, @C5952h C15015c cVar) {
        this.f39998a = set;
        this.f39999b = cVar;
    }

    /* renamed from: b */
    static C13896f m59071b(X509Certificate x509Certificate) {
        return C13896f.m59656e(x509Certificate.getPublicKey().getEncoded()).mo43983p();
    }

    /* renamed from: a */
    public void mo43456a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        String str2;
        List a = mo43455a(str);
        if (!a.isEmpty()) {
            C15015c cVar = this.f39999b;
            if (cVar != null) {
                list = cVar.mo46624a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = a.size();
                C13896f fVar = null;
                C13896f fVar2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    C13831b bVar = (C13831b) a.get(i2);
                    if (bVar.f40004c.equals("sha256/")) {
                        if (fVar == null) {
                            fVar = m59071b(x509Certificate);
                        }
                        if (bVar.f40005d.equals(fVar)) {
                            return;
                        }
                    } else if (bVar.f40004c.equals("sha1/")) {
                        if (fVar2 == null) {
                            fVar2 = m59069a(x509Certificate);
                        }
                        if (bVar.f40005d.equals(fVar2)) {
                            return;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unsupported hashAlgorithm: ");
                        sb.append(bVar.f40004c);
                        throw new AssertionError(sb.toString());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                str2 = "\n    ";
                if (i3 >= size3) {
                    break;
                }
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb2.append(str2);
                sb2.append(m59070a((Certificate) x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
                i3++;
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            int size4 = a.size();
            for (int i4 = 0; i4 < size4; i4++) {
                C13831b bVar2 = (C13831b) a.get(i4);
                sb2.append(str2);
                sb2.append(bVar2);
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r3.f39998a.equals(r4.f39998a) != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@p201f.p202a.C5952h java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof p468g.C13829g
            if (r1 == 0) goto L_0x001f
            okhttp3.internal.l.c r1 = r3.f39999b
            g.g r4 = (p468g.C13829g) r4
            okhttp3.internal.l.c r2 = r4.f39999b
            boolean r1 = okhttp3.internal.C14910b.m66061a(r1, r2)
            if (r1 == 0) goto L_0x001f
            java.util.Set<g.g$b> r1 = r3.f39998a
            java.util.Set<g.g$b> r4 = r4.f39998a
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p468g.C13829g.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C15015c cVar = this.f39999b;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f39998a.hashCode();
    }

    /* renamed from: a */
    public void mo43457a(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        mo43456a(str, Arrays.asList(certificateArr));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C13831b> mo43455a(String str) {
        List<C13831b> emptyList = Collections.emptyList();
        for (C13831b bVar : this.f39998a) {
            if (bVar.mo43462a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(bVar);
            }
        }
        return emptyList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13829g mo43454a(@C5952h C15015c cVar) {
        if (C14910b.m66061a((Object) this.f39999b, (Object) cVar)) {
            return this;
        }
        return new C13829g(this.f39998a, cVar);
    }

    /* renamed from: a */
    public static String m59070a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder sb = new StringBuilder();
            sb.append("sha256/");
            sb.append(m59071b((X509Certificate) certificate).mo43972e());
            return sb.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* renamed from: a */
    static C13896f m59069a(X509Certificate x509Certificate) {
        return C13896f.m59656e(x509Certificate.getPublicKey().getEncoded()).mo43982k();
    }
}
