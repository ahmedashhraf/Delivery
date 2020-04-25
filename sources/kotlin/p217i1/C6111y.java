package kotlin.p217i1;

import com.facebook.internal.FacebookRequestErrorClassification;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.TypeCastException;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14458l1;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.RegexValidateElement;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.i1.y */
/* compiled from: StringsJVM.kt */
class C6111y extends C6110x {
    @C6041f
    /* renamed from: a */
    private static final int m27868a(@C6003d String str, char c, int i) {
        if (str != null) {
            return str.indexOf(c, i);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6041f
    /* renamed from: b */
    private static final int m27910b(@C6003d String str, char c, int i) {
        if (str != null) {
            return str.lastIndexOf(c, i);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m27924c(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m27923c(str, str2, z);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m27927d(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m27926d(str, str2, z);
    }

    @C6041f
    /* renamed from: e */
    private static final String m27928e(@C6003d String str, int i) {
        if (str != null) {
            String substring = str.substring(i);
            C14445h0.m62453a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6041f
    /* renamed from: f */
    private static final String m27929f(@C6003d String str) {
        if (str != null) {
            String intern = str.intern();
            C14445h0.m62453a((Object) intern, "(this as java.lang.String).intern()");
            return intern;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6041f
    /* renamed from: g */
    private static final char[] m27931g(@C6003d String str) {
        if (str != null) {
            char[] charArray = str.toCharArray();
            C14445h0.m62453a((Object) charArray, "(this as java.lang.String).toCharArray()");
            return charArray;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6041f
    /* renamed from: i */
    private static final String m27932i(@C6003d String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            C14445h0.m62453a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6041f
    /* renamed from: k */
    private static final String m27933k(@C6003d String str) {
        if (str != null) {
            String upperCase = str.toUpperCase();
            C14445h0.m62453a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            return upperCase;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6041f
    /* renamed from: a */
    private static final int m27871a(@C6003d String str, String str2, int i) {
        if (str != null) {
            return str.indexOf(str2, i);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6041f
    /* renamed from: b */
    private static final int m27912b(@C6003d String str, String str2, int i) {
        if (str != null) {
            return str.lastIndexOf(str2, i);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: c */
    public static final boolean m27923c(@C6004e String str, @C6004e String str2, boolean z) {
        boolean z2;
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            z2 = str.equals(str2);
        } else {
            z2 = str.equalsIgnoreCase(str2);
        }
        return z2;
    }

    /* renamed from: d */
    public static final boolean m27926d(@C6003d String str, @C6003d String str2, boolean z) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m27900a(str, 0, str2, 0, str2.length(), z);
    }

    @C6041f
    /* renamed from: g */
    private static final Pattern m27930g(@C6003d String str, int i) {
        Pattern compile = Pattern.compile(str, i);
        C14445h0.m62453a((Object) compile, "java.util.regex.Pattern.compile(this, flags)");
        return compile;
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ String m27877a(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m27876a(str, c, c2, z);
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ String m27914b(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m27913b(str, c, c2, z);
    }

    @C6003d
    /* renamed from: a */
    public static final String m27876a(@C6003d String str, char c, char c2, boolean z) {
        C14445h0.m62478f(str, "$receiver");
        if (!z) {
            String replace = str.replace(c, c2);
            C14445h0.m62453a((Object) replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            return replace;
        }
        return C14604p.m63224a(C6112z.m28025b((CharSequence) str, new char[]{c}, z, 0, 4, (Object) null), String.valueOf(c2), null, null, 0, null, null, 62, null);
    }

    @C6003d
    /* renamed from: b */
    public static final String m27913b(@C6003d String str, char c, char c2, boolean z) {
        C14445h0.m62478f(str, "$receiver");
        int a = C6112z.m27935a((CharSequence) str, c, 0, z, 2, (Object) null);
        return a < 0 ? str : C6112z.m27945a((CharSequence) str, a, a + 1, (CharSequence) String.valueOf(c2)).toString();
    }

    @C6041f
    /* renamed from: c */
    private static final String m27922c(@C6003d String str, int i, int i2) {
        if (str != null) {
            String substring = str.substring(i, i2);
            C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6003d
    /* renamed from: d */
    public static final String m27925d(@C6003d String str) {
        C14445h0.m62478f(str, "$receiver");
        if (!(str.length() > 0) || !Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring != null) {
            String lowerCase = substring.toLowerCase();
            C14445h0.m62453a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            sb.append(lowerCase);
            String substring2 = str.substring(1);
            C14445h0.m62453a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6041f
    /* renamed from: c */
    private static final int m27921c(@C6003d String str, int i) {
        if (str != null) {
            return str.codePointBefore(i);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ String m27879a(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m27878a(str, str2, str3, z);
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ String m27916b(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m27915b(str, str2, str3, z);
    }

    @C6003d
    /* renamed from: a */
    public static final String m27878a(@C6003d String str, @C6003d String str2, @C6003d String str3, boolean z) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "oldValue");
        C14445h0.m62478f(str3, "newValue");
        return C14604p.m63224a(C6112z.m28027b((CharSequence) str, new String[]{str2}, z, 0, 4, (Object) null), str3, null, null, 0, null, null, 62, null);
    }

    @C6003d
    /* renamed from: b */
    public static final String m27915b(@C6003d String str, @C6003d String str2, @C6003d String str3, boolean z) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "oldValue");
        C14445h0.m62478f(str3, "newValue");
        int a = C6112z.m27939a((CharSequence) str, str2, 0, z, 2, (Object) null);
        return a < 0 ? str : C6112z.m27945a((CharSequence) str, a, str2.length() + a, (CharSequence) str3).toString();
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ char[] m27909a(String str, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        if (str != null) {
            str.getChars(i2, i3, cArr, i);
            return cArr;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m27920b(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m27919b(str, str2, z);
    }

    @C6041f
    /* renamed from: a */
    private static final char[] m27908a(@C6003d String str, char[] cArr, int i, int i2, int i3) {
        if (str != null) {
            str.getChars(i2, i3, cArr, i);
            return cArr;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: b */
    public static final boolean m27919b(@C6003d String str, @C6003d String str2, boolean z) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m27900a(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    @C6041f
    /* renamed from: a */
    private static final String m27882a(@C6003d String str, Object... objArr) {
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        C14445h0.m62453a((Object) format, "java.lang.String.format(this, *args)");
        return format;
    }

    @C6041f
    /* renamed from: a */
    private static final String m27884a(@C6003d C14458l1 l1Var, String str, Object... objArr) {
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        C14445h0.m62453a((Object) format, "java.lang.String.format(format, *args)");
        return format;
    }

    @C6041f
    /* renamed from: b */
    private static final String m27918b(StringBuilder sb) {
        return new String(sb);
    }

    @C6041f
    /* renamed from: a */
    private static final String m27881a(@C6003d String str, Locale locale, Object... objArr) {
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        C14445h0.m62453a((Object) format, "java.lang.String.format(locale, this, *args)");
        return format;
    }

    @C6041f
    /* renamed from: b */
    private static final int m27911b(@C6003d String str, int i, int i2) {
        if (str != null) {
            return str.offsetByCodePoints(i, i2);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6041f
    /* renamed from: a */
    private static final String m27885a(@C6003d C14458l1 l1Var, Locale locale, String str, Object... objArr) {
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        C14445h0.m62453a((Object) format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    @C6041f
    /* renamed from: b */
    private static final String m27917b(@C6003d String str, Locale locale) {
        if (str != null) {
            String upperCase = str.toUpperCase(locale);
            C14445h0.m62453a((Object) upperCase, "(this as java.lang.String).toUpperCase(locale)");
            return upperCase;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ List m27895a(CharSequence charSequence, Pattern pattern, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m27894a(charSequence, pattern, i);
    }

    @C6003d
    /* renamed from: a */
    public static final List<String> m27894a(@C6003d CharSequence charSequence, @C6003d Pattern pattern, int i) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(pattern, RegexValidateElement.METHOD);
        if (i >= 0) {
            if (i == 0) {
                i = -1;
            }
            String[] split = pattern.split(charSequence, i);
            C14445h0.m62453a((Object) split, "regex.split(this, if (limit == 0) -1 else limit)");
            return C14794o.m64862c((Object[]) split);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m27904a(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m27903a(str, str2, i, z);
    }

    /* renamed from: a */
    public static final boolean m27903a(@C6003d String str, @C6003d String str2, int i, boolean z) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return m27900a(str, i, str2, 0, str2.length(), z);
    }

    @C6041f
    /* renamed from: a */
    private static final String m27888a(byte[] bArr, int i, int i2, Charset charset) {
        return new String(bArr, i, i2, charset);
    }

    @C6041f
    /* renamed from: a */
    private static final String m27889a(byte[] bArr, Charset charset) {
        return new String(bArr, charset);
    }

    @C6041f
    /* renamed from: a */
    private static final String m27887a(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, C14664f.f42876a);
    }

    @C6041f
    /* renamed from: a */
    private static final String m27886a(byte[] bArr) {
        return new String(bArr, C14664f.f42876a);
    }

    @C6041f
    /* renamed from: a */
    private static final String m27890a(char[] cArr) {
        return new String(cArr);
    }

    @C6041f
    /* renamed from: a */
    private static final String m27891a(char[] cArr, int i, int i2) {
        return new String(cArr, i, i2);
    }

    @C6041f
    /* renamed from: a */
    private static final String m27892a(int[] iArr, int i, int i2) {
        return new String(iArr, i, i2);
    }

    @C6041f
    /* renamed from: a */
    private static final String m27883a(StringBuffer stringBuffer) {
        return new String(stringBuffer);
    }

    @C6041f
    /* renamed from: a */
    private static final int m27869a(@C6003d String str, int i) {
        if (str != null) {
            return str.codePointAt(i);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6041f
    /* renamed from: a */
    private static final int m27870a(@C6003d String str, int i, int i2) {
        if (str != null) {
            return str.codePointCount(i, i2);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public static /* synthetic */ int m27873a(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m27872a(str, str2, z);
    }

    /* renamed from: a */
    public static final int m27872a(@C6003d String str, @C6003d String str2, boolean z) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, FacebookRequestErrorClassification.KEY_OTHER);
        if (z) {
            return str.compareToIgnoreCase(str2);
        }
        return str.compareTo(str2);
    }

    @C6041f
    /* renamed from: a */
    private static final boolean m27902a(@C6003d String str, CharSequence charSequence) {
        if (str != null) {
            return str.contentEquals(charSequence);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6041f
    /* renamed from: a */
    private static final boolean m27905a(@C6003d String str, StringBuffer stringBuffer) {
        if (str != null) {
            return str.contentEquals(stringBuffer);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m27897a(@p205i.p209c.p210a.C6003d java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$receiver"
            kotlin.p214b1.p216u.C14445h0.m62478f(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            kotlin.e1.k r0 = kotlin.p217i1.C6112z.m28023b(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            kotlin.v0.l0 r3 = (kotlin.p219v0.C14790l0) r3
            int r3 = r3.mo45559b()
            char r3 = r4.charAt(r3)
            boolean r3 = kotlin.p217i1.C14661d.m63553p(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p217i1.C6111y.m27897a(java.lang.CharSequence):boolean");
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m27899a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z, int i4, Object obj) {
        return m27898a(charSequence, i, charSequence2, i2, i3, (i4 & 16) != 0 ? false : z);
    }

    /* renamed from: a */
    public static final boolean m27898a(@C6003d CharSequence charSequence, int i, @C6003d CharSequence charSequence2, int i2, int i3, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(charSequence2, FacebookRequestErrorClassification.KEY_OTHER);
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return C6112z.m28034b(charSequence, i, charSequence2, i2, i3, z);
        }
        return m27900a((String) charSequence, i, (String) charSequence2, i2, i3, z);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m27901a(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        return m27900a(str, i, str2, i2, i3, (i4 & 16) != 0 ? false : z);
    }

    /* renamed from: a */
    public static final boolean m27900a(@C6003d String str, int i, @C6003d String str2, int i2, int i3, boolean z) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, FacebookRequestErrorClassification.KEY_OTHER);
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    @C6041f
    /* renamed from: a */
    private static final String m27880a(@C6003d String str, Locale locale) {
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            C14445h0.m62453a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6041f
    /* renamed from: a */
    private static final byte[] m27906a(@C6003d String str, Charset charset) {
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            C14445h0.m62453a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ byte[] m27907a(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C14664f.f42876a;
        }
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            C14445h0.m62453a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6003d
    /* renamed from: a */
    public static final String m27875a(@C6003d String str) {
        C14445h0.m62478f(str, "$receiver");
        if (!(str.length() > 0) || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring != null) {
            String upperCase = substring.toUpperCase();
            C14445h0.m62453a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            sb.append(upperCase);
            String substring2 = str.substring(1);
            C14445h0.m62453a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6003d
    /* renamed from: a */
    public static final String m27874a(@C6003d CharSequence charSequence, int i) {
        C14445h0.m62478f(charSequence, "$receiver");
        int i2 = 1;
        if (i >= 0) {
            String str = "";
            if (i == 0) {
                return str;
            }
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return str;
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                if (1 <= i) {
                    while (true) {
                        sb.append(charSequence);
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                String sb2 = sb.toString();
                C14445h0.m62453a((Object) sb2, "sb.toString()");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            int length2 = cArr.length;
            for (int i3 = 0; i3 < length2; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Count 'n' must be non-negative, but was ");
        sb3.append(i);
        sb3.append('.');
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    @C6003d
    /* renamed from: a */
    public static final Comparator<String> m27893a(@C6003d C14458l1 l1Var) {
        C14445h0.m62478f(l1Var, "$receiver");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        C14445h0.m62453a((Object) comparator, "java.lang.String.CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ Pattern m27896a(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Pattern compile = Pattern.compile(str, i);
        C14445h0.m62453a((Object) compile, "java.util.regex.Pattern.compile(this, flags)");
        return compile;
    }
}
