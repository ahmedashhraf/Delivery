package p468g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: g.i */
/* compiled from: CipherSuite */
public final class C13835i {

    /* renamed from: A */
    public static final C13835i f40011A = m59092a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);

    /* renamed from: A0 */
    public static final C13835i f40012A0 = m59092a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);

    /* renamed from: B */
    public static final C13835i f40013B = m59092a("TLS_KRB5_WITH_RC4_128_MD5", 36);

    /* renamed from: B0 */
    public static final C13835i f40014B0 = m59092a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);

    /* renamed from: C */
    public static final C13835i f40015C = m59092a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);

    /* renamed from: C0 */
    public static final C13835i f40016C0 = m59092a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);

    /* renamed from: D */
    public static final C13835i f40017D = m59092a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);

    /* renamed from: D0 */
    public static final C13835i f40018D0 = m59092a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);

    /* renamed from: E */
    public static final C13835i f40019E = m59092a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);

    /* renamed from: E0 */
    public static final C13835i f40020E0 = m59092a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);

    /* renamed from: F */
    public static final C13835i f40021F = m59092a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);

    /* renamed from: F0 */
    public static final C13835i f40022F0 = m59092a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);

    /* renamed from: G */
    public static final C13835i f40023G = m59092a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: G0 */
    public static final C13835i f40024G0 = m59092a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);

    /* renamed from: H */
    public static final C13835i f40025H = m59092a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);

    /* renamed from: H0 */
    public static final C13835i f40026H0 = m59092a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);

    /* renamed from: I */
    public static final C13835i f40027I = m59092a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);

    /* renamed from: I0 */
    public static final C13835i f40028I0 = m59092a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);

    /* renamed from: J */
    public static final C13835i f40029J = m59092a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);

    /* renamed from: J0 */
    public static final C13835i f40030J0 = m59092a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);

    /* renamed from: K */
    public static final C13835i f40031K = m59092a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: K0 */
    public static final C13835i f40032K0 = m59092a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: L */
    public static final C13835i f40033L = m59092a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);

    /* renamed from: L0 */
    public static final C13835i f40034L0 = m59092a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: M */
    public static final C13835i f40035M = m59092a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);

    /* renamed from: M0 */
    public static final C13835i f40036M0 = m59092a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);

    /* renamed from: N */
    public static final C13835i f40037N = m59092a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);

    /* renamed from: N0 */
    public static final C13835i f40038N0 = m59092a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);

    /* renamed from: O */
    public static final C13835i f40039O = m59092a("TLS_RSA_WITH_NULL_SHA256", 59);

    /* renamed from: O0 */
    public static final C13835i f40040O0 = m59092a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);

    /* renamed from: P */
    public static final C13835i f40041P = m59092a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);

    /* renamed from: P0 */
    public static final C13835i f40042P0 = m59092a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);

    /* renamed from: Q */
    public static final C13835i f40043Q = m59092a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);

    /* renamed from: Q0 */
    public static final C13835i f40044Q0 = m59092a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);

    /* renamed from: R */
    public static final C13835i f40045R = m59092a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);

    /* renamed from: R0 */
    public static final C13835i f40046R0 = m59092a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);

    /* renamed from: S */
    public static final C13835i f40047S = m59092a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);

    /* renamed from: S0 */
    public static final C13835i f40048S0 = m59092a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);

    /* renamed from: T */
    public static final C13835i f40049T = m59092a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);

    /* renamed from: T0 */
    public static final C13835i f40050T0 = m59092a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);

    /* renamed from: U */
    public static final C13835i f40051U = m59092a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);

    /* renamed from: U0 */
    public static final C13835i f40052U0 = m59092a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);

    /* renamed from: V */
    public static final C13835i f40053V = m59092a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);

    /* renamed from: V0 */
    public static final C13835i f40054V0 = m59092a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);

    /* renamed from: W */
    public static final C13835i f40055W = m59092a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);

    /* renamed from: W0 */
    public static final C13835i f40056W0 = m59092a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);

    /* renamed from: X */
    public static final C13835i f40057X = m59092a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);

    /* renamed from: X0 */
    public static final C13835i f40058X0 = m59092a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);

    /* renamed from: Y */
    public static final C13835i f40059Y = m59092a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);

    /* renamed from: Y0 */
    public static final C13835i f40060Y0 = m59092a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);

    /* renamed from: Z */
    public static final C13835i f40061Z = m59092a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);

    /* renamed from: Z0 */
    public static final C13835i f40062Z0 = m59092a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: a0 */
    public static final C13835i f40063a0 = m59092a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", C13959t.f40847U1);

    /* renamed from: a1 */
    public static final C13835i f40064a1 = m59092a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: b */
    static final Comparator<String> f40065b = new C13836a();

    /* renamed from: b0 */
    public static final C13835i f40066b0 = m59092a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", C13959t.f40859X1);

    /* renamed from: b1 */
    public static final C13835i f40067b1 = m59092a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* renamed from: c */
    private static final Map<String, C13835i> f40068c = new LinkedHashMap();

    /* renamed from: c0 */
    public static final C13835i f40069c0 = m59092a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", C13959t.f40863Y1);

    /* renamed from: c1 */
    public static final C13835i f40070c1 = m59092a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* renamed from: d */
    public static final C13835i f40071d = m59092a("SSL_RSA_WITH_NULL_MD5", 1);

    /* renamed from: d0 */
    public static final C13835i f40072d0 = m59092a("TLS_PSK_WITH_RC4_128_SHA", C13959t.f40872a2);

    /* renamed from: d1 */
    public static final C13835i f40073d1 = m59092a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: e */
    public static final C13835i f40074e = m59092a("SSL_RSA_WITH_NULL_SHA", 2);

    /* renamed from: e0 */
    public static final C13835i f40075e0 = m59092a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", C13959t.f40877b2);

    /* renamed from: e1 */
    public static final C13835i f40076e1 = m59092a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: f */
    public static final C13835i f40077f = m59092a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* renamed from: f0 */
    public static final C13835i f40078f0 = m59092a("TLS_PSK_WITH_AES_128_CBC_SHA", C13959t.f40882c2);

    /* renamed from: f1 */
    public static final C13835i f40079f1 = m59092a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* renamed from: g */
    public static final C13835i f40080g = m59092a("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* renamed from: g0 */
    public static final C13835i f40081g0 = m59092a("TLS_PSK_WITH_AES_256_CBC_SHA", C13959t.f40887d2);

    /* renamed from: g1 */
    public static final C13835i f40082g1 = m59092a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);

    /* renamed from: h */
    public static final C13835i f40083h = m59092a("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* renamed from: h0 */
    public static final C13835i f40084h0 = m59092a("TLS_RSA_WITH_SEED_CBC_SHA", C13959t.f40929m2);

    /* renamed from: h1 */
    public static final C13835i f40085h1 = m59092a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* renamed from: i */
    public static final C13835i f40086i = m59092a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* renamed from: i0 */
    public static final C13835i f40087i0 = m59092a("TLS_RSA_WITH_AES_128_GCM_SHA256", C13959t.f40953s2);

    /* renamed from: i1 */
    public static final C13835i f40088i1 = m59092a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* renamed from: j */
    public static final C13835i f40089j = m59092a("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* renamed from: j0 */
    public static final C13835i f40090j0 = m59092a("TLS_RSA_WITH_AES_256_GCM_SHA384", C13959t.f40957t2);

    /* renamed from: j1 */
    public static final C13835i f40091j1 = m59092a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: k */
    public static final C13835i f40092k = m59092a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: k0 */
    public static final C13835i f40093k0 = m59092a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", C13959t.f40961u2);

    /* renamed from: k1 */
    public static final C13835i f40094k1 = m59092a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: l */
    public static final C13835i f40095l = m59092a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* renamed from: l0 */
    public static final C13835i f40096l0 = m59092a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", C13959t.f40965v2);

    /* renamed from: l1 */
    public static final C13835i f40097l1 = m59092a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* renamed from: m */
    public static final C13835i f40098m = m59092a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* renamed from: m0 */
    public static final C13835i f40099m0 = m59092a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", C13959t.f40977y2);

    /* renamed from: m1 */
    public static final C13835i f40100m1 = m59092a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* renamed from: n */
    public static final C13835i f40101n = m59092a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* renamed from: n0 */
    public static final C13835i f40102n0 = m59092a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", C13959t.f40981z2);

    /* renamed from: n1 */
    public static final C13835i f40103n1 = m59092a("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: o */
    public static final C13835i f40104o = m59092a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* renamed from: o0 */
    public static final C13835i f40105o0 = m59092a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", C13959t.f40776C2);

    /* renamed from: o1 */
    public static final C13835i f40106o1 = m59092a("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: p */
    public static final C13835i f40107p = m59092a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* renamed from: p0 */
    public static final C13835i f40108p0 = m59092a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", C13959t.f40780D2);

    /* renamed from: p1 */
    public static final C13835i f40109p1 = m59092a("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: q */
    public static final C13835i f40110q = m59092a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* renamed from: q0 */
    public static final C13835i f40111q0 = m59092a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* renamed from: q1 */
    public static final C13835i f40112q1 = m59092a("TLS_AES_128_CCM_SHA256", 4868);

    /* renamed from: r */
    public static final C13835i f40113r = m59092a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* renamed from: r0 */
    public static final C13835i f40114r0 = m59092a("TLS_FALLBACK_SCSV", 22016);

    /* renamed from: r1 */
    public static final C13835i f40115r1 = m59092a("TLS_AES_256_CCM_8_SHA256", 4869);

    /* renamed from: s */
    public static final C13835i f40116s = m59092a("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* renamed from: s0 */
    public static final C13835i f40117s0 = m59092a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);

    /* renamed from: t */
    public static final C13835i f40118t = m59092a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* renamed from: t0 */
    public static final C13835i f40119t0 = m59092a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);

    /* renamed from: u */
    public static final C13835i f40120u = m59092a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* renamed from: u0 */
    public static final C13835i f40121u0 = m59092a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);

    /* renamed from: v */
    public static final C13835i f40122v = m59092a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* renamed from: v0 */
    public static final C13835i f40123v0 = m59092a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);

    /* renamed from: w */
    public static final C13835i f40124w = m59092a("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* renamed from: w0 */
    public static final C13835i f40125w0 = m59092a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);

    /* renamed from: x */
    public static final C13835i f40126x = m59092a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* renamed from: x0 */
    public static final C13835i f40127x0 = m59092a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);

    /* renamed from: y */
    public static final C13835i f40128y = m59092a("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* renamed from: y0 */
    public static final C13835i f40129y0 = m59092a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);

    /* renamed from: z */
    public static final C13835i f40130z = m59092a("TLS_KRB5_WITH_DES_CBC_MD5", 34);

    /* renamed from: z0 */
    public static final C13835i f40131z0 = m59092a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);

    /* renamed from: a */
    final String f40132a;

    /* renamed from: g.i$a */
    /* compiled from: CipherSuite */
    class C13836a implements Comparator<String> {
        C13836a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            int min = Math.min(str.length(), str2.length());
            int i = 4;
            while (true) {
                int i2 = -1;
                if (i < min) {
                    char charAt = str.charAt(i);
                    char charAt2 = str2.charAt(i);
                    if (charAt != charAt2) {
                        if (charAt >= charAt2) {
                            i2 = 1;
                        }
                        return i2;
                    }
                    i++;
                } else {
                    int length = str.length();
                    int length2 = str2.length();
                    if (length == length2) {
                        return 0;
                    }
                    if (length >= length2) {
                        i2 = 1;
                    }
                    return i2;
                }
            }
        }
    }

    private C13835i(String str) {
        if (str != null) {
            this.f40132a = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static synchronized C13835i m59091a(String str) {
        C13835i iVar;
        synchronized (C13835i.class) {
            iVar = (C13835i) f40068c.get(str);
            if (iVar == null) {
                iVar = (C13835i) f40068c.get(m59094b(str));
                if (iVar == null) {
                    iVar = new C13835i(str);
                }
                f40068c.put(str, iVar);
            }
        }
        return iVar;
    }

    /* renamed from: b */
    private static String m59094b(String str) {
        String str2 = "TLS_";
        String str3 = "SSL_";
        if (str.startsWith(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str.substring(4));
            return sb.toString();
        }
        if (str.startsWith(str3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str.substring(4));
            str = sb2.toString();
        }
        return str;
    }

    public String toString() {
        return this.f40132a;
    }

    /* renamed from: a */
    static List<C13835i> m59093a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(m59091a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static C13835i m59092a(String str, int i) {
        C13835i iVar = new C13835i(str);
        f40068c.put(str, iVar);
        return iVar;
    }

    /* renamed from: a */
    public String mo43482a() {
        return this.f40132a;
    }
}
