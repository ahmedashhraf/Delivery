package com.google.zxing.p333t.p334a;

/* renamed from: com.google.zxing.t.a.q */
/* compiled from: ParsedResult */
public abstract class C9033q {

    /* renamed from: a */
    private final C9034r f23646a;

    protected C9033q(C9034r rVar) {
        this.f23646a = rVar;
    }

    /* renamed from: a */
    public static void m42236a(String str, StringBuilder sb) {
        if (str != null && !str.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(10);
            }
            sb.append(str);
        }
    }

    /* renamed from: a */
    public abstract String mo32877a();

    /* renamed from: b */
    public final C9034r mo32953b() {
        return this.f23646a;
    }

    public final String toString() {
        return mo32877a();
    }

    /* renamed from: a */
    public static void m42237a(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String a : strArr) {
                m42236a(a, sb);
            }
        }
    }
}
