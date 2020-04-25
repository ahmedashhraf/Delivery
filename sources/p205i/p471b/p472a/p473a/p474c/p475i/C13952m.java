package p205i.p471b.p472a.p473a.p474c.p475i;

import org.apache.http.C15470v;

/* renamed from: i.b.a.a.c.i.m */
/* compiled from: Frame */
class C13952m {

    /* renamed from: A */
    static final int f40623A = 16777217;

    /* renamed from: B */
    static final int f40624B = 16777218;

    /* renamed from: C */
    static final int f40625C = 16777219;

    /* renamed from: D */
    static final int f40626D = 16777220;

    /* renamed from: E */
    static final int f40627E = 16777221;

    /* renamed from: F */
    static final int f40628F = 16777222;

    /* renamed from: G */
    static final int[] f40629G;

    /* renamed from: i */
    static final int f40630i = -268435456;

    /* renamed from: j */
    static final int f40631j = 268435456;

    /* renamed from: k */
    static final int f40632k = -268435456;

    /* renamed from: l */
    static final int f40633l = 251658240;

    /* renamed from: m */
    static final int f40634m = 8388608;

    /* renamed from: n */
    static final int f40635n = 8388607;

    /* renamed from: o */
    static final int f40636o = 267386880;

    /* renamed from: p */
    static final int f40637p = 1048575;

    /* renamed from: q */
    static final int f40638q = 16777216;

    /* renamed from: r */
    static final int f40639r = 24117248;

    /* renamed from: s */
    static final int f40640s = 25165824;

    /* renamed from: t */
    private static final int f40641t = 33554432;

    /* renamed from: u */
    private static final int f40642u = 50331648;

    /* renamed from: v */
    static final int f40643v = 16777216;

    /* renamed from: w */
    static final int f40644w = 16777225;

    /* renamed from: x */
    static final int f40645x = 16777226;

    /* renamed from: y */
    static final int f40646y = 16777227;

    /* renamed from: z */
    static final int f40647z = 16777228;

    /* renamed from: a */
    C13956q f40648a;

    /* renamed from: b */
    int[] f40649b;

    /* renamed from: c */
    int[] f40650c;

    /* renamed from: d */
    private int[] f40651d;

    /* renamed from: e */
    private int[] f40652e;

    /* renamed from: f */
    int f40653f;

    /* renamed from: g */
    private int f40654g;

    /* renamed from: h */
    private int[] f40655h;

    static {
        int[] iArr = new int[C15470v.f44665f];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE".charAt(i) - 'E';
        }
        f40629G = iArr;
    }

    C13952m() {
    }

    /* renamed from: b */
    private static int m60027b(C13946g gVar, String str) {
        int indexOf = str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0;
        char charAt = str.charAt(indexOf);
        int i = f40624B;
        if (charAt == 'F') {
            return f40624B;
        }
        if (charAt == 'L') {
            return gVar.mo44108a(str.substring(indexOf + 1, str.length() - 1)) | f40639r;
        }
        if (charAt != 'S') {
            if (charAt == 'V') {
                return 0;
            }
            if (!(charAt == 'Z' || charAt == 'I')) {
                if (charAt == 'J') {
                    return f40626D;
                }
                switch (charAt) {
                    case 'B':
                    case 'C':
                        break;
                    case 'D':
                        return f40625C;
                    default:
                        int i2 = indexOf + 1;
                        while (str.charAt(i2) == '[') {
                            i2++;
                        }
                        char charAt2 = str.charAt(i2);
                        if (charAt2 != 'F') {
                            if (charAt2 == 'S') {
                                i = f40647z;
                            } else if (charAt2 == 'Z') {
                                i = f40644w;
                            } else if (charAt2 == 'I') {
                                i = f40623A;
                            } else if (charAt2 != 'J') {
                                switch (charAt2) {
                                    case 'B':
                                        i = f40645x;
                                        break;
                                    case 'C':
                                        i = f40646y;
                                        break;
                                    case 'D':
                                        i = f40625C;
                                        break;
                                    default:
                                        i = gVar.mo44108a(str.substring(i2 + 1, str.length() - 1)) | f40639r;
                                        break;
                                }
                            } else {
                                i = f40626D;
                            }
                        }
                        return ((i2 - indexOf) << 28) | i;
                }
            }
        }
        return f40623A;
    }

    /* renamed from: c */
    private void m60029c(int i) {
        int i2 = this.f40653f;
        if (i2 >= i) {
            this.f40653f = i2 - i;
            return;
        }
        this.f40648a.f40694g -= i - i2;
        this.f40653f = 0;
    }

    /* renamed from: d */
    private void m60030d(int i) {
        if (this.f40652e == null) {
            this.f40652e = new int[10];
        }
        int length = this.f40652e.length;
        int i2 = this.f40653f;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(i2 + 1, length * 2)];
            System.arraycopy(this.f40652e, 0, iArr, 0, length);
            this.f40652e = iArr;
        }
        int[] iArr2 = this.f40652e;
        int i3 = this.f40653f;
        this.f40653f = i3 + 1;
        iArr2[i3] = i;
        C13956q qVar = this.f40648a;
        int i4 = qVar.f40694g + this.f40653f;
        if (i4 > qVar.f40695h) {
            qVar.f40695h = i4;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo44139a(C13946g gVar, int i, Object[] objArr, int i2, Object[] objArr2) {
        int a = m60022a(gVar, i, objArr, this.f40649b);
        while (a < objArr.length) {
            int i3 = a + 1;
            this.f40649b[a] = 16777216;
            a = i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            if (objArr2[i5] == C13959t.f40895f0 || objArr2[i5] == C13959t.f40890e0) {
                i4++;
            }
        }
        this.f40650c = new int[(i4 + i2)];
        m60022a(gVar, i2, objArr2, this.f40650c);
        this.f40653f = 0;
        this.f40654g = 0;
    }

    /* renamed from: a */
    private static int m60022a(C13946g gVar, int i, Object[] objArr, int[] iArr) {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            if (objArr[i4] instanceof Integer) {
                i2 = i3 + 1;
                iArr[i3] = objArr[i4].intValue() | 16777216;
                if (objArr[i4] == C13959t.f40895f0 || objArr[i4] == C13959t.f40890e0) {
                    i3 = i2 + 1;
                    iArr[i2] = 16777216;
                }
            } else if (objArr[i4] instanceof String) {
                i2 = i3 + 1;
                iArr[i3] = m60027b(gVar, C13960u.m60148d(objArr[i4]).mo44204d());
            } else {
                i2 = i3 + 1;
                iArr[i3] = f40640s | gVar.mo44109a("", objArr[i4].f40691d);
            }
            i3 = i2;
        }
        return i3;
    }

    /* renamed from: b */
    private void m60028b(int i) {
        if (this.f40655h == null) {
            this.f40655h = new int[2];
        }
        int length = this.f40655h.length;
        int i2 = this.f40654g;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(i2 + 1, length * 2)];
            System.arraycopy(this.f40655h, 0, iArr, 0, length);
            this.f40655h = iArr;
        }
        int[] iArr2 = this.f40655h;
        int i3 = this.f40654g;
        this.f40654g = i3 + 1;
        iArr2[i3] = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo44140a(C13952m mVar) {
        this.f40649b = mVar.f40649b;
        this.f40650c = mVar.f40650c;
        this.f40651d = mVar.f40651d;
        this.f40652e = mVar.f40652e;
        this.f40653f = mVar.f40653f;
        this.f40654g = mVar.f40654g;
        this.f40655h = mVar.f40655h;
    }

    /* renamed from: a */
    private int m60020a(int i) {
        int[] iArr = this.f40651d;
        if (iArr == null || i >= iArr.length) {
            return i | 33554432;
        }
        int i2 = iArr[i];
        if (i2 == 0) {
            i2 = i | 33554432;
            iArr[i] = i2;
        }
        return i2;
    }

    /* renamed from: a */
    private void m60023a(int i, int i2) {
        if (this.f40651d == null) {
            this.f40651d = new int[10];
        }
        int length = this.f40651d.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.f40651d, 0, iArr, 0, length);
            this.f40651d = iArr;
        }
        this.f40651d[i] = i2;
    }

    /* renamed from: a */
    private void m60024a(C13946g gVar, String str) {
        int b = m60027b(gVar, str);
        if (b != 0) {
            m60030d(b);
            if (b == f40626D || b == f40625C) {
                m60030d(16777216);
            }
        }
    }

    /* renamed from: a */
    private int m60019a() {
        int i = this.f40653f;
        if (i > 0) {
            int[] iArr = this.f40652e;
            int i2 = i - 1;
            this.f40653f = i2;
            return iArr[i2];
        }
        C13956q qVar = this.f40648a;
        int i3 = qVar.f40694g - 1;
        qVar.f40694g = i3;
        return f40642u | (-i3);
    }

    /* renamed from: a */
    private void m60025a(String str) {
        char charAt = str.charAt(0);
        if (charAt == '(') {
            m60029c((C13960u.m60140b(str) >> 2) - 1);
        } else if (charAt == 'J' || charAt == 'D') {
            m60029c(2);
        } else {
            m60029c(1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051 A[LOOP:0: B:8:0x0026->B:19:0x0051, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m60021a(p205i.p471b.p472a.p473a.p474c.p475i.C13946g r7, int r8) {
        /*
            r6 = this;
            r0 = 24117248(0x1700000, float:4.4081038E-38)
            r1 = 16777222(0x1000006, float:2.3509904E-38)
            if (r8 != r1) goto L_0x000f
            java.lang.String r1 = r7.f40575q
            int r7 = r7.mo44108a(r1)
        L_0x000d:
            r7 = r7 | r0
            goto L_0x0025
        L_0x000f:
            r1 = -1048576(0xfffffffffff00000, float:NaN)
            r1 = r1 & r8
            r2 = 25165824(0x1800000, float:4.7019774E-38)
            if (r1 != r2) goto L_0x0054
            i.b.a.a.c.i.p[] r1 = r7.f40571m
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r8
            r1 = r1[r2]
            java.lang.String r1 = r1.f40671e
            int r7 = r7.mo44108a(r1)
            goto L_0x000d
        L_0x0025:
            r0 = 0
        L_0x0026:
            int r1 = r6.f40654g
            if (r0 >= r1) goto L_0x0054
            int[] r1 = r6.f40655h
            r1 = r1[r0]
            r2 = -268435456(0xfffffffff0000000, float:-1.58456325E29)
            r2 = r2 & r1
            r3 = 251658240(0xf000000, float:6.3108872E-30)
            r3 = r3 & r1
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r5 = 8388607(0x7fffff, float:1.1754942E-38)
            if (r3 != r4) goto L_0x0042
            int[] r3 = r6.f40649b
            r1 = r1 & r5
            r1 = r3[r1]
        L_0x0040:
            int r1 = r1 + r2
            goto L_0x004e
        L_0x0042:
            r4 = 50331648(0x3000000, float:3.761582E-37)
            if (r3 != r4) goto L_0x004e
            int[] r3 = r6.f40650c
            int r4 = r3.length
            r1 = r1 & r5
            int r4 = r4 - r1
            r1 = r3[r4]
            goto L_0x0040
        L_0x004e:
            if (r8 != r1) goto L_0x0051
            return r7
        L_0x0051:
            int r0 = r0 + 1
            goto L_0x0026
        L_0x0054:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p471b.p472a.p473a.p474c.p475i.C13952m.m60021a(i.b.a.a.c.i.g, int):int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo44138a(C13946g gVar, int i, C13960u[] uVarArr, int i2) {
        int i3;
        this.f40649b = new int[i2];
        this.f40650c = new int[0];
        int i4 = 1;
        if ((i & 8) != 0) {
            i4 = 0;
        } else if ((i & 524288) == 0) {
            this.f40649b[0] = f40639r | gVar.mo44108a(gVar.f40575q);
        } else {
            this.f40649b[0] = f40628F;
        }
        for (C13960u d : uVarArr) {
            int b = m60027b(gVar, d.mo44204d());
            int i5 = i3 + 1;
            this.f40649b[i3] = b;
            if (b == f40626D || b == f40625C) {
                i3 = i5 + 1;
                this.f40649b[i5] = 16777216;
            } else {
                i3 = i5;
            }
        }
        while (i3 < i2) {
            int i6 = i3 + 1;
            this.f40649b[i3] = 16777216;
            i3 = i6;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x032b, code lost:
        m60030d(f40625C);
        m60030d(16777216);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0332, code lost:
        m60030d(f40624B);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0336, code lost:
        m60030d(f40626D);
        m60030d(16777216);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x033d, code lost:
        m60030d(f40623A);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02af, code lost:
        m60029c(2);
        m60030d(f40625C);
        m60030d(16777216);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02c3, code lost:
        m60029c(2);
        m60030d(f40626D);
        m60030d(16777216);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44131a(int r17, int r18, p205i.p471b.p472a.p473a.p474c.p475i.C13946g r19, p205i.p471b.p472a.p473a.p474c.p475i.C13955p r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = 198(0xc6, float:2.77E-43)
            r6 = 1
            if (r1 == r5) goto L_0x0348
            r5 = 199(0xc7, float:2.79E-43)
            if (r1 == r5) goto L_0x0348
            r5 = 24117248(0x1700000, float:4.4081038E-38)
            r7 = 16777218(0x1000002, float:2.3509893E-38)
            r8 = 16777219(0x1000003, float:2.3509895E-38)
            r9 = 16777217(0x1000001, float:2.350989E-38)
            r10 = 16777220(0x1000004, float:2.3509898E-38)
            r11 = 16777216(0x1000000, float:2.3509887E-38)
            switch(r1) {
                case 0: goto L_0x034b;
                case 1: goto L_0x0341;
                case 2: goto L_0x033d;
                case 3: goto L_0x033d;
                case 4: goto L_0x033d;
                case 5: goto L_0x033d;
                case 6: goto L_0x033d;
                case 7: goto L_0x033d;
                case 8: goto L_0x033d;
                case 9: goto L_0x0336;
                case 10: goto L_0x0336;
                case 11: goto L_0x0332;
                case 12: goto L_0x0332;
                case 13: goto L_0x0332;
                case 14: goto L_0x032b;
                case 15: goto L_0x032b;
                case 16: goto L_0x033d;
                case 17: goto L_0x033d;
                case 18: goto L_0x02e0;
                default: goto L_0x0026;
            }
        L_0x0026:
            switch(r1) {
                case 21: goto L_0x033d;
                case 22: goto L_0x0336;
                case 23: goto L_0x0332;
                case 24: goto L_0x032b;
                case 25: goto L_0x02d7;
                default: goto L_0x0029;
            }
        L_0x0029:
            r12 = 8388608(0x800000, float:1.17549435E-38)
            r13 = 251658240(0xf000000, float:6.3108872E-30)
            switch(r1) {
                case 46: goto L_0x02ce;
                case 47: goto L_0x013e;
                case 48: goto L_0x02ba;
                case 49: goto L_0x0149;
                case 50: goto L_0x02a0;
                case 51: goto L_0x02ce;
                case 52: goto L_0x02ce;
                case 53: goto L_0x02ce;
                case 54: goto L_0x027d;
                case 55: goto L_0x0252;
                case 56: goto L_0x027d;
                case 57: goto L_0x0252;
                case 58: goto L_0x027d;
                default: goto L_0x0030;
            }
        L_0x0030:
            r12 = 3
            r13 = 91
            r15 = 0
            r14 = 4
            switch(r1) {
                case 79: goto L_0x024d;
                case 80: goto L_0x0248;
                case 81: goto L_0x024d;
                case 82: goto L_0x0248;
                case 83: goto L_0x024d;
                case 84: goto L_0x024d;
                case 85: goto L_0x024d;
                case 86: goto L_0x024d;
                case 87: goto L_0x0348;
                case 88: goto L_0x0242;
                case 89: goto L_0x0236;
                case 90: goto L_0x0223;
                case 91: goto L_0x0209;
                case 92: goto L_0x01f3;
                case 93: goto L_0x01d6;
                case 94: goto L_0x01b2;
                case 95: goto L_0x01a2;
                case 96: goto L_0x0199;
                case 97: goto L_0x018e;
                case 98: goto L_0x0185;
                case 99: goto L_0x017a;
                case 100: goto L_0x0199;
                case 101: goto L_0x018e;
                case 102: goto L_0x0185;
                case 103: goto L_0x017a;
                case 104: goto L_0x0199;
                case 105: goto L_0x018e;
                case 106: goto L_0x0185;
                case 107: goto L_0x017a;
                case 108: goto L_0x0199;
                case 109: goto L_0x018e;
                case 110: goto L_0x0185;
                case 111: goto L_0x017a;
                case 112: goto L_0x0199;
                case 113: goto L_0x018e;
                case 114: goto L_0x0185;
                case 115: goto L_0x017a;
                case 116: goto L_0x034b;
                case 117: goto L_0x034b;
                case 118: goto L_0x034b;
                case 119: goto L_0x034b;
                case 120: goto L_0x0199;
                case 121: goto L_0x016f;
                case 122: goto L_0x0199;
                case 123: goto L_0x016f;
                case 124: goto L_0x0199;
                case 125: goto L_0x016f;
                case 126: goto L_0x0199;
                case 127: goto L_0x018e;
                case 128: goto L_0x0199;
                case 129: goto L_0x018e;
                case 130: goto L_0x0199;
                case 131: goto L_0x018e;
                case 132: goto L_0x016a;
                case 133: goto L_0x015f;
                case 134: goto L_0x0157;
                case 135: goto L_0x014c;
                case 136: goto L_0x0199;
                case 137: goto L_0x0185;
                case 138: goto L_0x0149;
                case 139: goto L_0x0141;
                case 140: goto L_0x015f;
                case 141: goto L_0x014c;
                case 142: goto L_0x0199;
                case 143: goto L_0x013e;
                case 144: goto L_0x0185;
                case 145: goto L_0x034b;
                case 146: goto L_0x034b;
                case 147: goto L_0x034b;
                case 148: goto L_0x0136;
                case 149: goto L_0x0199;
                case 150: goto L_0x0199;
                case 151: goto L_0x0136;
                case 152: goto L_0x0136;
                case 153: goto L_0x0348;
                case 154: goto L_0x0348;
                case 155: goto L_0x0348;
                case 156: goto L_0x0348;
                case 157: goto L_0x0348;
                case 158: goto L_0x0348;
                case 159: goto L_0x0242;
                case 160: goto L_0x0242;
                case 161: goto L_0x0242;
                case 162: goto L_0x0242;
                case 163: goto L_0x0242;
                case 164: goto L_0x0242;
                case 165: goto L_0x0242;
                case 166: goto L_0x0242;
                case 167: goto L_0x034b;
                case 168: goto L_0x012e;
                case 169: goto L_0x012e;
                case 170: goto L_0x0348;
                case 171: goto L_0x0348;
                case 172: goto L_0x0348;
                case 173: goto L_0x0242;
                case 174: goto L_0x0348;
                case 175: goto L_0x0242;
                case 176: goto L_0x0348;
                case 177: goto L_0x034b;
                case 178: goto L_0x0127;
                case 179: goto L_0x0120;
                case 180: goto L_0x0116;
                case 181: goto L_0x010c;
                case 182: goto L_0x00e7;
                case 183: goto L_0x00e7;
                case 184: goto L_0x00e7;
                case 185: goto L_0x00e7;
                case 186: goto L_0x00db;
                case 187: goto L_0x00cd;
                case 188: goto L_0x0087;
                case 189: goto L_0x005c;
                case 190: goto L_0x0141;
                case 191: goto L_0x0348;
                case 192: goto L_0x0042;
                case 193: goto L_0x0141;
                case 194: goto L_0x0348;
                case 195: goto L_0x0348;
                default: goto L_0x0038;
            }
        L_0x0038:
            r0.m60029c(r2)
            java.lang.String r1 = r4.f40671e
            r0.m60024a(r3, r1)
            goto L_0x034b
        L_0x0042:
            java.lang.String r1 = r4.f40671e
            r16.m60019a()
            char r2 = r1.charAt(r15)
            if (r2 != r13) goto L_0x0052
            r0.m60024a(r3, r1)
            goto L_0x034b
        L_0x0052:
            int r1 = r3.mo44108a(r1)
            r1 = r1 | r5
            r0.m60030d(r1)
            goto L_0x034b
        L_0x005c:
            java.lang.String r1 = r4.f40671e
            r16.m60019a()
            char r2 = r1.charAt(r15)
            if (r2 != r13) goto L_0x007b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.m60024a(r3, r1)
            goto L_0x034b
        L_0x007b:
            r2 = 292552704(0x11700000, float:1.8932662E-28)
            int r1 = r3.mo44108a(r1)
            r1 = r1 | r2
            r0.m60030d(r1)
            goto L_0x034b
        L_0x0087:
            r16.m60019a()
            switch(r2) {
                case 4: goto L_0x00c5;
                case 5: goto L_0x00bd;
                case 6: goto L_0x00b5;
                case 7: goto L_0x00ad;
                case 8: goto L_0x00a5;
                case 9: goto L_0x009d;
                case 10: goto L_0x0095;
                default: goto L_0x008d;
            }
        L_0x008d:
            r1 = 285212676(0x11000004, float:1.0097424E-28)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x0095:
            r1 = 285212673(0x11000001, float:1.0097421E-28)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x009d:
            r1 = 285212684(0x1100000c, float:1.0097434E-28)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x00a5:
            r1 = 285212682(0x1100000a, float:1.0097432E-28)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x00ad:
            r1 = 285212675(0x11000003, float:1.0097423E-28)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x00b5:
            r1 = 285212674(0x11000002, float:1.0097422E-28)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x00bd:
            r1 = 285212683(0x1100000b, float:1.0097433E-28)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x00c5:
            r1 = 285212681(0x11000009, float:1.009743E-28)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x00cd:
            r1 = 25165824(0x1800000, float:4.7019774E-38)
            java.lang.String r4 = r4.f40671e
            int r2 = r3.mo44109a(r4, r2)
            r1 = r1 | r2
            r0.m60030d(r1)
            goto L_0x034b
        L_0x00db:
            java.lang.String r1 = r4.f40672f
            r0.m60025a(r1)
            java.lang.String r1 = r4.f40672f
            r0.m60024a(r3, r1)
            goto L_0x034b
        L_0x00e7:
            java.lang.String r2 = r4.f40673g
            r0.m60025a(r2)
            r2 = 184(0xb8, float:2.58E-43)
            if (r1 == r2) goto L_0x0105
            int r2 = r16.m60019a()
            r5 = 183(0xb7, float:2.56E-43)
            if (r1 != r5) goto L_0x0105
            java.lang.String r1 = r4.f40672f
            char r1 = r1.charAt(r15)
            r5 = 60
            if (r1 != r5) goto L_0x0105
            r0.m60028b(r2)
        L_0x0105:
            java.lang.String r1 = r4.f40673g
            r0.m60024a(r3, r1)
            goto L_0x034b
        L_0x010c:
            java.lang.String r1 = r4.f40673g
            r0.m60025a(r1)
            r16.m60019a()
            goto L_0x034b
        L_0x0116:
            r0.m60029c(r6)
            java.lang.String r1 = r4.f40673g
            r0.m60024a(r3, r1)
            goto L_0x034b
        L_0x0120:
            java.lang.String r1 = r4.f40673g
            r0.m60025a(r1)
            goto L_0x034b
        L_0x0127:
            java.lang.String r1 = r4.f40673g
            r0.m60024a(r3, r1)
            goto L_0x034b
        L_0x012e:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "JSR/RET are not supported with computeFrames option"
            r1.<init>(r2)
            throw r1
        L_0x0136:
            r0.m60029c(r14)
            r0.m60030d(r9)
            goto L_0x034b
        L_0x013e:
            r1 = 2
            goto L_0x02c3
        L_0x0141:
            r0.m60029c(r6)
            r0.m60030d(r9)
            goto L_0x034b
        L_0x0149:
            r1 = 2
            goto L_0x02af
        L_0x014c:
            r0.m60029c(r6)
            r0.m60030d(r8)
            r0.m60030d(r11)
            goto L_0x034b
        L_0x0157:
            r0.m60029c(r6)
            r0.m60030d(r7)
            goto L_0x034b
        L_0x015f:
            r0.m60029c(r6)
            r0.m60030d(r10)
            r0.m60030d(r11)
            goto L_0x034b
        L_0x016a:
            r0.m60023a(r2, r9)
            goto L_0x034b
        L_0x016f:
            r0.m60029c(r12)
            r0.m60030d(r10)
            r0.m60030d(r11)
            goto L_0x034b
        L_0x017a:
            r0.m60029c(r14)
            r0.m60030d(r8)
            r0.m60030d(r11)
            goto L_0x034b
        L_0x0185:
            r1 = 2
            r0.m60029c(r1)
            r0.m60030d(r7)
            goto L_0x034b
        L_0x018e:
            r0.m60029c(r14)
            r0.m60030d(r10)
            r0.m60030d(r11)
            goto L_0x034b
        L_0x0199:
            r1 = 2
            r0.m60029c(r1)
            r0.m60030d(r9)
            goto L_0x034b
        L_0x01a2:
            int r1 = r16.m60019a()
            int r2 = r16.m60019a()
            r0.m60030d(r1)
            r0.m60030d(r2)
            goto L_0x034b
        L_0x01b2:
            int r1 = r16.m60019a()
            int r2 = r16.m60019a()
            int r3 = r16.m60019a()
            int r4 = r16.m60019a()
            r0.m60030d(r2)
            r0.m60030d(r1)
            r0.m60030d(r4)
            r0.m60030d(r3)
            r0.m60030d(r2)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x01d6:
            int r1 = r16.m60019a()
            int r2 = r16.m60019a()
            int r3 = r16.m60019a()
            r0.m60030d(r2)
            r0.m60030d(r1)
            r0.m60030d(r3)
            r0.m60030d(r2)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x01f3:
            int r1 = r16.m60019a()
            int r2 = r16.m60019a()
            r0.m60030d(r2)
            r0.m60030d(r1)
            r0.m60030d(r2)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x0209:
            int r1 = r16.m60019a()
            int r2 = r16.m60019a()
            int r3 = r16.m60019a()
            r0.m60030d(r1)
            r0.m60030d(r3)
            r0.m60030d(r2)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x0223:
            int r1 = r16.m60019a()
            int r2 = r16.m60019a()
            r0.m60030d(r1)
            r0.m60030d(r2)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x0236:
            int r1 = r16.m60019a()
            r0.m60030d(r1)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x0242:
            r1 = 2
            r0.m60029c(r1)
            goto L_0x034b
        L_0x0248:
            r0.m60029c(r14)
            goto L_0x034b
        L_0x024d:
            r0.m60029c(r12)
            goto L_0x034b
        L_0x0252:
            r0.m60029c(r6)
            int r1 = r16.m60019a()
            r0.m60023a(r2, r1)
            int r1 = r2 + 1
            r0.m60023a(r1, r11)
            if (r2 <= 0) goto L_0x034b
            int r1 = r2 + -1
            int r2 = r0.m60020a(r1)
            if (r2 == r10) goto L_0x0278
            if (r2 != r8) goto L_0x026e
            goto L_0x0278
        L_0x026e:
            r3 = r2 & r13
            if (r3 == r11) goto L_0x034b
            r2 = r2 | r12
            r0.m60023a(r1, r2)
            goto L_0x034b
        L_0x0278:
            r0.m60023a(r1, r11)
            goto L_0x034b
        L_0x027d:
            int r1 = r16.m60019a()
            r0.m60023a(r2, r1)
            if (r2 <= 0) goto L_0x034b
            int r1 = r2 + -1
            int r2 = r0.m60020a(r1)
            if (r2 == r10) goto L_0x029b
            if (r2 != r8) goto L_0x0291
            goto L_0x029b
        L_0x0291:
            r3 = r2 & r13
            if (r3 == r11) goto L_0x034b
            r2 = r2 | r12
            r0.m60023a(r1, r2)
            goto L_0x034b
        L_0x029b:
            r0.m60023a(r1, r11)
            goto L_0x034b
        L_0x02a0:
            r0.m60029c(r6)
            int r1 = r16.m60019a()
            r2 = -268435456(0xfffffffff0000000, float:-1.58456325E29)
            int r1 = r1 + r2
            r0.m60030d(r1)
            goto L_0x034b
        L_0x02af:
            r0.m60029c(r1)
            r0.m60030d(r8)
            r0.m60030d(r11)
            goto L_0x034b
        L_0x02ba:
            r1 = 2
            r0.m60029c(r1)
            r0.m60030d(r7)
            goto L_0x034b
        L_0x02c3:
            r0.m60029c(r1)
            r0.m60030d(r10)
            r0.m60030d(r11)
            goto L_0x034b
        L_0x02ce:
            r1 = 2
            r0.m60029c(r1)
            r0.m60030d(r9)
            goto L_0x034b
        L_0x02d7:
            int r1 = r0.m60020a(r2)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x02e0:
            int r1 = r4.f40668b
            r2 = 16
            if (r1 == r2) goto L_0x0320
            switch(r1) {
                case 3: goto L_0x031c;
                case 4: goto L_0x0318;
                case 5: goto L_0x0311;
                case 6: goto L_0x030a;
                case 7: goto L_0x02ff;
                case 8: goto L_0x02f4;
                default: goto L_0x02e9;
            }
        L_0x02e9:
            java.lang.String r1 = "java/lang/invoke/MethodHandle"
            int r1 = r3.mo44108a(r1)
            r1 = r1 | r5
            r0.m60030d(r1)
            goto L_0x034b
        L_0x02f4:
            java.lang.String r1 = "java/lang/String"
            int r1 = r3.mo44108a(r1)
            r1 = r1 | r5
            r0.m60030d(r1)
            goto L_0x034b
        L_0x02ff:
            java.lang.String r1 = "java/lang/Class"
            int r1 = r3.mo44108a(r1)
            r1 = r1 | r5
            r0.m60030d(r1)
            goto L_0x034b
        L_0x030a:
            r0.m60030d(r8)
            r0.m60030d(r11)
            goto L_0x034b
        L_0x0311:
            r0.m60030d(r10)
            r0.m60030d(r11)
            goto L_0x034b
        L_0x0318:
            r0.m60030d(r7)
            goto L_0x034b
        L_0x031c:
            r0.m60030d(r9)
            goto L_0x034b
        L_0x0320:
            java.lang.String r1 = "java/lang/invoke/MethodType"
            int r1 = r3.mo44108a(r1)
            r1 = r1 | r5
            r0.m60030d(r1)
            goto L_0x034b
        L_0x032b:
            r0.m60030d(r8)
            r0.m60030d(r11)
            goto L_0x034b
        L_0x0332:
            r0.m60030d(r7)
            goto L_0x034b
        L_0x0336:
            r0.m60030d(r10)
            r0.m60030d(r11)
            goto L_0x034b
        L_0x033d:
            r0.m60030d(r9)
            goto L_0x034b
        L_0x0341:
            r1 = 16777221(0x1000005, float:2.35099E-38)
            r0.m60030d(r1)
            goto L_0x034b
        L_0x0348:
            r0.m60029c(r6)
        L_0x034b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p471b.p472a.p473a.p474c.p475i.C13952m.mo44131a(int, int, i.b.a.a.c.i.g, i.b.a.a.c.i.p):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo44141a(p205i.p471b.p472a.p473a.p474c.p475i.C13946g r19, p205i.p471b.p472a.p473a.p474c.p475i.C13952m r20, int r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            int[] r4 = r0.f40649b
            int r4 = r4.length
            int[] r5 = r0.f40650c
            int r5 = r5.length
            int[] r6 = r2.f40649b
            if (r6 != 0) goto L_0x0018
            int[] r6 = new int[r4]
            r2.f40649b = r6
            r6 = 1
            goto L_0x0019
        L_0x0018:
            r6 = 0
        L_0x0019:
            r9 = r6
            r6 = 0
        L_0x001b:
            r11 = 16777220(0x1000004, float:2.3509898E-38)
            r12 = 8388608(0x800000, float:1.17549435E-38)
            r13 = 33554432(0x2000000, float:9.403955E-38)
            r14 = 251658240(0xf000000, float:6.3108872E-30)
            r15 = -268435456(0xfffffffff0000000, float:-1.58456325E29)
            r16 = 8388607(0x7fffff, float:1.1754942E-38)
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            if (r6 >= r4) goto L_0x0079
            int[] r8 = r0.f40651d
            if (r8 == 0) goto L_0x0063
            int r10 = r8.length
            if (r6 >= r10) goto L_0x0063
            r8 = r8[r6]
            if (r8 != 0) goto L_0x003d
            int[] r7 = r0.f40649b
            r7 = r7[r6]
            goto L_0x0067
        L_0x003d:
            r10 = r8 & r15
            r14 = r14 & r8
            if (r14 != r7) goto L_0x0044
            r7 = r8
            goto L_0x0067
        L_0x0044:
            if (r14 != r13) goto L_0x004d
            int[] r13 = r0.f40649b
            r14 = r8 & r16
            r13 = r13[r14]
            goto L_0x0055
        L_0x004d:
            int[] r13 = r0.f40650c
            r14 = r8 & r16
            int r14 = r5 - r14
            r13 = r13[r14]
        L_0x0055:
            int r10 = r10 + r13
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0061
            if (r10 == r11) goto L_0x0067
            r8 = 16777219(0x1000003, float:2.3509895E-38)
            if (r10 != r8) goto L_0x0061
            goto L_0x0067
        L_0x0061:
            r7 = r10
            goto L_0x0067
        L_0x0063:
            int[] r7 = r0.f40649b
            r7 = r7[r6]
        L_0x0067:
            int[] r8 = r0.f40655h
            if (r8 == 0) goto L_0x006f
            int r7 = r0.m60021a(r1, r7)
        L_0x006f:
            int[] r8 = r2.f40649b
            boolean r7 = m60026a(r1, r7, r8, r6)
            r9 = r9 | r7
            int r6 = r6 + 1
            goto L_0x001b
        L_0x0079:
            if (r3 <= 0) goto L_0x00a1
            r8 = r9
            r5 = 0
        L_0x007d:
            if (r5 >= r4) goto L_0x008d
            int[] r6 = r0.f40649b
            r6 = r6[r5]
            int[] r7 = r2.f40649b
            boolean r6 = m60026a(r1, r6, r7, r5)
            r8 = r8 | r6
            int r5 = r5 + 1
            goto L_0x007d
        L_0x008d:
            int[] r4 = r2.f40650c
            if (r4 != 0) goto L_0x0097
            r4 = 1
            int[] r5 = new int[r4]
            r2.f40650c = r5
            goto L_0x0098
        L_0x0097:
            r4 = r8
        L_0x0098:
            int[] r2 = r2.f40650c
            r6 = 0
            boolean r1 = m60026a(r1, r3, r2, r6)
            r1 = r1 | r4
            return r1
        L_0x00a1:
            r4 = 1
            r6 = 0
            int[] r3 = r0.f40650c
            int r3 = r3.length
            i.b.a.a.c.i.q r8 = r0.f40648a
            int r8 = r8.f40694g
            int r3 = r3 + r8
            int[] r8 = r2.f40650c
            if (r8 != 0) goto L_0x00b7
            int r8 = r0.f40653f
            int r8 = r8 + r3
            int[] r8 = new int[r8]
            r2.f40650c = r8
            goto L_0x00b8
        L_0x00b7:
            r4 = r9
        L_0x00b8:
            r8 = r4
            r4 = 0
        L_0x00ba:
            if (r4 >= r3) goto L_0x00d2
            int[] r9 = r0.f40650c
            r9 = r9[r4]
            int[] r10 = r0.f40655h
            if (r10 == 0) goto L_0x00c8
            int r9 = r0.m60021a(r1, r9)
        L_0x00c8:
            int[] r10 = r2.f40650c
            boolean r9 = m60026a(r1, r9, r10, r4)
            r8 = r8 | r9
            int r4 = r4 + 1
            goto L_0x00ba
        L_0x00d2:
            int r4 = r0.f40653f
            if (r6 >= r4) goto L_0x0117
            int[] r4 = r0.f40652e
            r4 = r4[r6]
            r9 = r4 & r15
            r10 = r4 & r14
            if (r10 != r7) goto L_0x00e5
            r9 = r4
        L_0x00e1:
            r4 = 16777219(0x1000003, float:2.3509895E-38)
            goto L_0x0103
        L_0x00e5:
            if (r10 != r13) goto L_0x00ee
            int[] r10 = r0.f40649b
            r17 = r4 & r16
            r10 = r10[r17]
            goto L_0x00f6
        L_0x00ee:
            int[] r10 = r0.f40650c
            r17 = r4 & r16
            int r17 = r5 - r17
            r10 = r10[r17]
        L_0x00f6:
            int r9 = r9 + r10
            r4 = r4 & r12
            if (r4 == 0) goto L_0x00e1
            r4 = 16777219(0x1000003, float:2.3509895E-38)
            if (r9 == r11) goto L_0x0101
            if (r9 != r4) goto L_0x0103
        L_0x0101:
            r9 = 16777216(0x1000000, float:2.3509887E-38)
        L_0x0103:
            int[] r10 = r0.f40655h
            if (r10 == 0) goto L_0x010b
            int r9 = r0.m60021a(r1, r9)
        L_0x010b:
            int[] r10 = r2.f40650c
            int r4 = r3 + r6
            boolean r4 = m60026a(r1, r9, r10, r4)
            r8 = r8 | r4
            int r6 = r6 + 1
            goto L_0x00d2
        L_0x0117:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p471b.p472a.p473a.p474c.p475i.C13952m.mo44141a(i.b.a.a.c.i.g, i.b.a.a.c.i.m, int):boolean");
    }

    /* renamed from: a */
    private static boolean m60026a(C13946g gVar, int i, int[] iArr, int i2) {
        int min;
        int a;
        int i3 = iArr[i2];
        if (i3 == i) {
            return false;
        }
        if ((268435455 & i) == f40627E) {
            if (i3 == f40627E) {
                return false;
            }
            i = f40627E;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            return true;
        }
        int i4 = i3 & f40636o;
        int i5 = 16777216;
        int i6 = -268435456;
        if (i4 == f40639r || (i3 & -268435456) != 0) {
            if (i == f40627E) {
                return false;
            }
            String str = "java/lang/Object";
            if ((i & -1048576) != (-1048576 & i3)) {
                int i7 = i & f40636o;
                if (i7 == f40639r || (i & -268435456) != 0) {
                    int i8 = i & -268435456;
                    int i9 = ((i8 == 0 || i7 == f40639r) ? 0 : -268435456) + i8;
                    int i10 = i3 & -268435456;
                    if (i10 == 0 || i4 == f40639r) {
                        i6 = 0;
                    }
                    min = Math.min(i9, i6 + i10) | f40639r;
                    a = gVar.mo44108a(str);
                }
            } else if (i4 == f40639r) {
                i5 = (i & -268435456) | f40639r | gVar.mo44104a(i & f40637p, f40637p & i3);
            } else {
                min = ((i3 & -268435456) - 268435456) | f40639r;
                a = gVar.mo44108a(str);
            }
            i5 = min | a;
        } else if (i3 == f40627E && ((i & f40636o) == f40639r || (i & -268435456) != 0)) {
            i5 = i;
        }
        if (i3 == i5) {
            return false;
        }
        iArr[i2] = i5;
        return true;
    }
}
