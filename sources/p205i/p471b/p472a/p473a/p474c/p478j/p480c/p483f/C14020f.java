package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p483f;

import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;

/* renamed from: i.b.a.a.c.j.c.f.f */
/* compiled from: InstrSupport */
public final class C14020f {

    /* renamed from: a */
    public static final int f41192a = 327680;

    /* renamed from: b */
    public static final String f41193b = "$jacocoData";

    /* renamed from: c */
    public static final int f41194c = 4234;

    /* renamed from: d */
    public static final int f41195d = 4121;

    /* renamed from: e */
    public static final String f41196e = "[Z";

    /* renamed from: f */
    public static final String f41197f = "$jacocoInit";

    /* renamed from: g */
    public static final String f41198g = "()[Z";

    /* renamed from: h */
    public static final int f41199h = 4106;

    /* renamed from: i */
    static final String f41200i = "<clinit>";

    /* renamed from: j */
    static final String f41201j = "()V";

    /* renamed from: k */
    static final int f41202k = 4104;

    private C14020f() {
    }

    /* renamed from: a */
    public static void m60481a(String str, String str2) throws IllegalStateException {
        if (str.equals(f41193b) || str.equals(f41197f)) {
            throw new IllegalStateException(String.format("Class %s is already instrumented.", new Object[]{str2}));
        }
    }

    /* renamed from: a */
    public static void m60480a(C13957r rVar, int i) {
        if (i >= -1 && i <= 5) {
            rVar.mo44189b(i + 3);
        } else if (i >= -128 && i <= 127) {
            rVar.mo44190b(16, i);
        } else if (i < -32768 || i > 32767) {
            rVar.mo44183a((Object) Integer.valueOf(i));
        } else {
            rVar.mo44190b(17, i);
        }
    }
}
