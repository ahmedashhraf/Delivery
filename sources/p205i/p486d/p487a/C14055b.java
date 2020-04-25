package p205i.p486d.p487a;

import p205i.p486d.p487a.p488c.C14060c;

/* renamed from: i.d.a.b */
/* compiled from: XmppStringUtils */
public class C14055b {

    /* renamed from: a */
    private static final C14060c<String, String> f41309a = new C14060c<>(100);

    /* renamed from: b */
    private static final C14060c<String, String> f41310b = new C14060c<>(100);

    /* renamed from: a */
    public static String m60638a(String str) {
        if (str == null) {
            return null;
        }
        String str2 = (String) f41309a.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(str.length() + 8);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                sb.append("\\22");
            } else if (charAt == '/') {
                sb.append("\\2f");
            } else if (charAt == ':') {
                sb.append("\\3a");
            } else if (charAt == '<') {
                sb.append("\\3c");
            } else if (charAt == '>') {
                sb.append("\\3e");
            } else if (charAt == '@') {
                sb.append("\\40");
            } else if (charAt == '\\') {
                sb.append("\\5c");
            } else if (charAt == '&') {
                sb.append("\\26");
            } else if (charAt == '\'') {
                sb.append("\\27");
            } else if (Character.isWhitespace(charAt)) {
                sb.append("\\20");
            } else {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        f41309a.put(str, sb2);
        return sb2;
    }

    /* renamed from: b */
    public static boolean m60642b(String str) {
        return m60647g(str).length() > 0 && m60646f(str).length() > 0 && m60648h(str).length() == 0;
    }

    /* renamed from: c */
    public static boolean m60643c(String str) {
        return m60647g(str).length() > 0 && m60646f(str).length() > 0 && m60648h(str).length() > 0;
    }

    @Deprecated
    /* renamed from: d */
    public static String m60644d(String str) {
        return m60645e(str);
    }

    /* renamed from: e */
    public static String m60645e(String str) {
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        if (indexOf == 0) {
            return "";
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: f */
    public static String m60646f(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(64);
        int i = indexOf + 1;
        if (i > str.length()) {
            return "";
        }
        int indexOf2 = str.indexOf(47);
        if (indexOf2 <= 0) {
            return str.substring(i);
        }
        if (indexOf2 > indexOf) {
            return str.substring(i, indexOf2);
        }
        return str.substring(0, indexOf2);
    }

    /* renamed from: g */
    public static String m60647g(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(64);
        String str2 = "";
        if (indexOf <= 0) {
            return str2;
        }
        int indexOf2 = str.indexOf(47);
        if (indexOf2 < 0 || indexOf2 >= indexOf) {
            return str.substring(0, indexOf);
        }
        return str2;
    }

    /* renamed from: h */
    public static String m60648h(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        int i = indexOf + 1;
        return (i > str.length() || indexOf < 0) ? "" : str.substring(i);
    }

    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m60649i(java.lang.String r10) {
        /*
            if (r10 != 0) goto L_0x0004
            r10 = 0
            return r10
        L_0x0004:
            i.d.a.c.c<java.lang.String, java.lang.String> r0 = f41310b
            java.lang.Object r0 = r0.get(r10)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x000f
            return r0
        L_0x000f:
            char[] r0 = r10.toCharArray()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0.length
            r1.<init>(r2)
            r2 = 0
            int r3 = r0.length
        L_0x001b:
            if (r2 >= r3) goto L_0x009e
            char r4 = r10.charAt(r2)
            r5 = 92
            if (r4 != r5) goto L_0x0096
            int r5 = r2 + 2
            if (r5 >= r3) goto L_0x0096
            int r6 = r2 + 1
            char r6 = r0[r6]
            char r7 = r0[r5]
            r8 = 99
            r9 = 48
            switch(r6) {
                case 50: goto L_0x0065;
                case 51: goto L_0x0048;
                case 52: goto L_0x0040;
                case 53: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0096
        L_0x0038:
            if (r7 != r8) goto L_0x0096
            java.lang.String r2 = "\\"
            r1.append(r2)
            goto L_0x009a
        L_0x0040:
            if (r7 != r9) goto L_0x0096
            java.lang.String r2 = "@"
            r1.append(r2)
            goto L_0x009a
        L_0x0048:
            r6 = 97
            if (r7 == r6) goto L_0x005f
            if (r7 == r8) goto L_0x0059
            r6 = 101(0x65, float:1.42E-43)
            if (r7 == r6) goto L_0x0053
            goto L_0x0096
        L_0x0053:
            r2 = 62
            r1.append(r2)
            goto L_0x009a
        L_0x0059:
            r2 = 60
            r1.append(r2)
            goto L_0x009a
        L_0x005f:
            r2 = 58
            r1.append(r2)
            goto L_0x009a
        L_0x0065:
            if (r7 == r9) goto L_0x0090
            r6 = 50
            if (r7 == r6) goto L_0x008a
            r6 = 102(0x66, float:1.43E-43)
            if (r7 == r6) goto L_0x0084
            r6 = 54
            if (r7 == r6) goto L_0x007e
            r6 = 55
            if (r7 == r6) goto L_0x0078
            goto L_0x0096
        L_0x0078:
            r2 = 39
            r1.append(r2)
            goto L_0x009a
        L_0x007e:
            r2 = 38
            r1.append(r2)
            goto L_0x009a
        L_0x0084:
            r2 = 47
            r1.append(r2)
            goto L_0x009a
        L_0x008a:
            r2 = 34
            r1.append(r2)
            goto L_0x009a
        L_0x0090:
            r2 = 32
            r1.append(r2)
            goto L_0x009a
        L_0x0096:
            r1.append(r4)
            r5 = r2
        L_0x009a:
            int r2 = r5 + 1
            goto L_0x001b
        L_0x009e:
            java.lang.String r0 = r1.toString()
            i.d.a.c.c<java.lang.String, java.lang.String> r1 = f41310b
            r1.put(r10, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p486d.p487a.C14055b.m60649i(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static String m60641b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(9);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m60636a(CharSequence charSequence, CharSequence charSequence2) {
        return m60639a(charSequence != null ? charSequence.toString() : null, charSequence2.toString());
    }

    /* renamed from: a */
    public static String m60639a(String str, String str2) {
        return m60640a(str, str2, (String) null);
    }

    /* renamed from: a */
    public static String m60637a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        String str = null;
        String charSequence4 = charSequence != null ? charSequence.toString() : null;
        String charSequence5 = charSequence2.toString();
        if (charSequence3 != null) {
            str = charSequence3.toString();
        }
        return m60640a(charSequence4, charSequence5, str);
    }

    /* renamed from: a */
    public static String m60640a(String str, String str2, String str3) {
        if (str2 != null) {
            int i = 0;
            int length = str != null ? str.length() : 0;
            int length2 = str2.length();
            if (str3 != null) {
                i = str3.length();
            }
            StringBuilder sb = new StringBuilder(length2 + length + i + 2);
            if (length > 0) {
                sb.append(str);
                sb.append('@');
            }
            sb.append(str2);
            if (i > 0) {
                sb.append('/');
                sb.append(str3);
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("domainpart must not be null");
    }
}
