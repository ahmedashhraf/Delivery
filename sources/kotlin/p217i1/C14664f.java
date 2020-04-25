package kotlin.p217i1;

import java.nio.charset.Charset;
import kotlin.p214b1.C6053c;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p216u.C14445h0;
import org.apache.http.p549j0.C15430e;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.i1.f */
/* compiled from: Charsets.kt */
public final class C14664f {
    @C6003d
    @C6053c

    /* renamed from: a */
    public static final Charset f42876a;
    @C6003d
    @C6053c

    /* renamed from: b */
    public static final Charset f42877b;
    @C6003d
    @C6053c

    /* renamed from: c */
    public static final Charset f42878c;
    @C6003d
    @C6053c

    /* renamed from: d */
    public static final Charset f42879d;
    @C6003d
    @C6053c

    /* renamed from: e */
    public static final Charset f42880e;
    @C6003d
    @C6053c

    /* renamed from: f */
    public static final Charset f42881f;

    /* renamed from: g */
    private static Charset f42882g;

    /* renamed from: h */
    private static Charset f42883h;

    /* renamed from: i */
    private static Charset f42884i;

    /* renamed from: j */
    public static final C14664f f42885j = new C14664f();

    static {
        Charset forName = Charset.forName("UTF-8");
        C14445h0.m62453a((Object) forName, "Charset.forName(\"UTF-8\")");
        f42876a = forName;
        Charset forName2 = Charset.forName(C15430e.f44594u);
        C14445h0.m62453a((Object) forName2, "Charset.forName(\"UTF-16\")");
        f42877b = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C14445h0.m62453a((Object) forName3, "Charset.forName(\"UTF-16BE\")");
        f42878c = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C14445h0.m62453a((Object) forName4, "Charset.forName(\"UTF-16LE\")");
        f42879d = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C14445h0.m62453a((Object) forName5, "Charset.forName(\"US-ASCII\")");
        f42880e = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C14445h0.m62453a((Object) forName6, "Charset.forName(\"ISO-8859-1\")");
        f42881f = forName6;
    }

    private C14664f() {
    }

    @C6003d
    @C6055e(name = "UTF32")
    /* renamed from: a */
    public final Charset mo45870a() {
        Charset charset = f42882g;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32");
        C14445h0.m62453a((Object) forName, "Charset.forName(\"UTF-32\")");
        f42882g = forName;
        return forName;
    }

    @C6003d
    @C6055e(name = "UTF32_BE")
    /* renamed from: b */
    public final Charset mo45871b() {
        Charset charset = f42884i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        C14445h0.m62453a((Object) forName, "Charset.forName(\"UTF-32BE\")");
        f42884i = forName;
        return forName;
    }

    @C6003d
    @C6055e(name = "UTF32_LE")
    /* renamed from: c */
    public final Charset mo45872c() {
        Charset charset = f42883h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        C14445h0.m62453a((Object) forName, "Charset.forName(\"UTF-32LE\")");
        f42883h = forName;
        return forName;
    }
}
