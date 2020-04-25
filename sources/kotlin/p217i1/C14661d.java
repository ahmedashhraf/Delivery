package kotlin.p217i1;

import kotlin.C6050b0;
import kotlin.p213a1.C6041f;
import kotlin.p504e1.C14525k;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.i1.d */
/* compiled from: CharJVM.kt */
class C14661d {
    @C6003d
    /* renamed from: a */
    public static final C14643a m63538a(char c) {
        return C14643a.Companion.mo45861a(Character.getType(c));
    }

    @C6003d
    /* renamed from: b */
    public static final C14655b m63539b(char c) {
        return C14655b.Companion.mo45869a(Character.getDirectionality(c));
    }

    @C6041f
    /* renamed from: c */
    private static final boolean m63540c(char c) {
        return Character.isDefined(c);
    }

    @C6041f
    /* renamed from: d */
    private static final boolean m63541d(char c) {
        return Character.isDigit(c);
    }

    @C6041f
    /* renamed from: e */
    private static final boolean m63542e(char c) {
        return Character.isHighSurrogate(c);
    }

    @C6041f
    /* renamed from: f */
    private static final boolean m63543f(char c) {
        return Character.isISOControl(c);
    }

    @C6041f
    /* renamed from: g */
    private static final boolean m63544g(char c) {
        return Character.isIdentifierIgnorable(c);
    }

    @C6041f
    /* renamed from: h */
    private static final boolean m63545h(char c) {
        return Character.isJavaIdentifierPart(c);
    }

    @C6041f
    /* renamed from: i */
    private static final boolean m63546i(char c) {
        return Character.isJavaIdentifierStart(c);
    }

    @C6041f
    /* renamed from: j */
    private static final boolean m63547j(char c) {
        return Character.isLetter(c);
    }

    @C6041f
    /* renamed from: k */
    private static final boolean m63548k(char c) {
        return Character.isLetterOrDigit(c);
    }

    @C6041f
    /* renamed from: l */
    private static final boolean m63549l(char c) {
        return Character.isLowSurrogate(c);
    }

    @C6041f
    /* renamed from: m */
    private static final boolean m63550m(char c) {
        return Character.isLowerCase(c);
    }

    @C6041f
    /* renamed from: n */
    private static final boolean m63551n(char c) {
        return Character.isTitleCase(c);
    }

    @C6041f
    /* renamed from: o */
    private static final boolean m63552o(char c) {
        return Character.isUpperCase(c);
    }

    /* renamed from: p */
    public static final boolean m63553p(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    @C6041f
    /* renamed from: q */
    private static final char m63554q(char c) {
        return Character.toLowerCase(c);
    }

    @C6041f
    /* renamed from: r */
    private static final char m63555r(char c) {
        return Character.toTitleCase(c);
    }

    @C6041f
    /* renamed from: s */
    private static final char m63556s(char c) {
        return Character.toUpperCase(c);
    }

    /* renamed from: a */
    public static final int m63536a(char c, int i) {
        return Character.digit(c, i);
    }

    @C6050b0
    /* renamed from: a */
    public static final int m63537a(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("radix ");
        sb.append(i);
        sb.append(" was not in valid range ");
        sb.append(new C14525k(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }
}
