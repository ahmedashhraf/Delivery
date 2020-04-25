package p076c.p112d.p134b.p135a.p143g.p269s0;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* renamed from: c.d.b.a.g.s0.a */
/* compiled from: CharEscapers */
public final class C6417a {

    /* renamed from: a */
    private static final C6418b f17882a = new C6419c(C6419c.f17887d, true);

    /* renamed from: b */
    private static final C6418b f17883b = new C6419c(C6419c.f17888e, false);

    /* renamed from: c */
    private static final C6418b f17884c = new C6419c(C6419c.f17889f, false);

    /* renamed from: d */
    private static final C6418b f17885d = new C6419c(C6419c.f17890g, false);

    /* renamed from: e */
    private static final C6418b f17886e = new C6419c(C6419c.f17891h, false);

    private C6417a() {
    }

    /* renamed from: a */
    public static String m29796a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static String m29797b(String str) {
        return f17882a.mo25853a(str);
    }

    /* renamed from: c */
    public static String m29798c(String str) {
        return f17883b.mo25853a(str);
    }

    /* renamed from: d */
    public static String m29799d(String str) {
        return f17884c.mo25853a(str);
    }

    /* renamed from: e */
    public static String m29800e(String str) {
        return f17886e.mo25853a(str);
    }

    /* renamed from: f */
    public static String m29801f(String str) {
        return f17885d.mo25853a(str);
    }
}
