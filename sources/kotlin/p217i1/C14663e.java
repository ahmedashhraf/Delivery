package kotlin.p217i1;

import kotlin.p213a1.C6041f;

/* renamed from: kotlin.i1.e */
/* compiled from: Char.kt */
class C14663e extends C14661d {
    @C6041f
    /* renamed from: a */
    private static final String m63557a(char c, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(c));
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    public static final boolean m63560c(char c) {
        return 55296 <= c && 57343 >= c;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m63559a(char c, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m63558a(c, c2, z);
    }

    /* renamed from: a */
    public static final boolean m63558a(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }
}
