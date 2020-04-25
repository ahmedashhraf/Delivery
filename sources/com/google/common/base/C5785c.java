package com.google.common.base;

import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.base.c */
/* compiled from: Ascii */
public final class C5785c {

    /* renamed from: A */
    public static final byte f16668A = 23;

    /* renamed from: B */
    public static final byte f16669B = 24;

    /* renamed from: C */
    public static final byte f16670C = 25;

    /* renamed from: D */
    public static final byte f16671D = 26;

    /* renamed from: E */
    public static final byte f16672E = 27;

    /* renamed from: F */
    public static final byte f16673F = 28;

    /* renamed from: G */
    public static final byte f16674G = 29;

    /* renamed from: H */
    public static final byte f16675H = 30;

    /* renamed from: I */
    public static final byte f16676I = 31;

    /* renamed from: J */
    public static final byte f16677J = 32;

    /* renamed from: K */
    public static final byte f16678K = 32;

    /* renamed from: L */
    public static final byte f16679L = Byte.MAX_VALUE;

    /* renamed from: M */
    public static final char f16680M = '\u0000';

    /* renamed from: N */
    public static final char f16681N = '';

    /* renamed from: a */
    public static final byte f16682a = 0;

    /* renamed from: b */
    public static final byte f16683b = 1;

    /* renamed from: c */
    public static final byte f16684c = 2;

    /* renamed from: d */
    public static final byte f16685d = 3;

    /* renamed from: e */
    public static final byte f16686e = 4;

    /* renamed from: f */
    public static final byte f16687f = 5;

    /* renamed from: g */
    public static final byte f16688g = 6;

    /* renamed from: h */
    public static final byte f16689h = 7;

    /* renamed from: i */
    public static final byte f16690i = 8;

    /* renamed from: j */
    public static final byte f16691j = 9;

    /* renamed from: k */
    public static final byte f16692k = 10;

    /* renamed from: l */
    public static final byte f16693l = 10;

    /* renamed from: m */
    public static final byte f16694m = 11;

    /* renamed from: n */
    public static final byte f16695n = 12;

    /* renamed from: o */
    public static final byte f16696o = 13;

    /* renamed from: p */
    public static final byte f16697p = 14;

    /* renamed from: q */
    public static final byte f16698q = 15;

    /* renamed from: r */
    public static final byte f16699r = 16;

    /* renamed from: s */
    public static final byte f16700s = 17;

    /* renamed from: t */
    public static final byte f16701t = 17;

    /* renamed from: u */
    public static final byte f16702u = 18;

    /* renamed from: v */
    public static final byte f16703v = 19;

    /* renamed from: w */
    public static final byte f16704w = 19;

    /* renamed from: x */
    public static final byte f16705x = 20;

    /* renamed from: y */
    public static final byte f16706y = 21;

    /* renamed from: z */
    public static final byte f16707z = 22;

    private C5785c() {
    }

    /* renamed from: a */
    private static int m25353a(char c) {
        return (char) ((c | ' ') - 'a');
    }

    /* renamed from: a */
    public static String m25356a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m25361c(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m25361c(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: b */
    public static String m25359b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m25360b(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m25360b(c)) {
                        charArray[i] = (char) (c & '_');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m25360b(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: c */
    public static boolean m25361c(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: d */
    public static char m25362d(char c) {
        return m25361c(c) ? (char) (c ^ ' ') : c;
    }

    /* renamed from: e */
    public static char m25363e(char c) {
        return m25360b(c) ? (char) (c & '_') : c;
    }

    /* renamed from: a */
    public static String m25354a(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return m25356a((String) charSequence);
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(m25362d(charSequence.charAt(i)));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m25358b(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return m25359b((String) charSequence);
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(m25363e(charSequence.charAt(i)));
        }
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.CharSequence, code=null, for r6v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v3, types: [java.lang.String]
      assigns: [java.lang.String, java.lang.CharSequence]
      uses: [java.lang.String, java.lang.CharSequence, java.lang.Object]
      mth insns count: 25
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    @p201f.p202a.C5944c
    @p076c.p112d.p148d.p149a.C2775a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m25355a(java.lang.CharSequence r6, int r7, java.lang.String r8) {
        /*
            com.google.common.base.C7397x.m35664a(r6)
            int r0 = r8.length()
            int r0 = r7 - r0
            r1 = 1
            r2 = 0
            if (r0 < 0) goto L_0x000f
            r3 = 1
            goto L_0x0010
        L_0x000f:
            r3 = 0
        L_0x0010:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r4[r2] = r5
            int r5 = r8.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r1] = r5
            java.lang.String r1 = "maxLength (%s) must be >= length of the truncation indicator (%s)"
            com.google.common.base.C7397x.m35672a(r3, r1, r4)
            int r1 = r6.length()
            if (r1 > r7) goto L_0x0039
            java.lang.String r6 = r6.toString()
            int r1 = r6.length()
            if (r1 > r7) goto L_0x0039
            return r6
        L_0x0039:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r6, r2, r0)
            r1.append(r8)
            java.lang.String r6 = r1.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.C5785c.m25355a(java.lang.CharSequence, int, java.lang.String):java.lang.String");
    }

    @C2775a
    /* renamed from: a */
    public static boolean m25357a(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2) {
                int a = m25353a(charAt);
                if (a >= 26 || a != m25353a(charAt2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
