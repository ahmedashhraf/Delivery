package org.apache.commons.codec.p525j;

import com.fasterxml.jackson.core.p162w.C3868i;
import com.mrsool.utils.C11644i;
import org.apache.commons.codec.C15071f;
import org.apache.commons.codec.EncoderException;
import p053b.p063d.p064b.C2108a;

/* renamed from: org.apache.commons.codec.j.a */
/* compiled from: DoubleMetaphone */
public class C15077a implements C15071f {

    /* renamed from: b */
    private static final String f43825b = "AEIOUY";

    /* renamed from: c */
    private static final String[] f43826c = {"GN", "KN", "PN", "WR", "PS"};

    /* renamed from: d */
    private static final String[] f43827d;

    /* renamed from: e */
    private static final String[] f43828e = {"ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", "ER"};

    /* renamed from: f */
    private static final String[] f43829f;

    /* renamed from: a */
    protected int f43830a = 4;

    /* renamed from: org.apache.commons.codec.j.a$a */
    /* compiled from: DoubleMetaphone */
    public class C15078a {

        /* renamed from: a */
        private StringBuffer f43831a = new StringBuffer(C15077a.this.mo46729a());

        /* renamed from: b */
        private StringBuffer f43832b = new StringBuffer(C15077a.this.mo46729a());

        /* renamed from: c */
        private int f43833c;

        public C15078a(int i) {
            this.f43833c = i;
        }

        /* renamed from: a */
        public void mo46736a(char c) {
            mo46743c(c);
            mo46741b(c);
        }

        /* renamed from: b */
        public void mo46741b(char c) {
            if (this.f43832b.length() < this.f43833c) {
                this.f43832b.append(c);
            }
        }

        /* renamed from: c */
        public void mo46743c(char c) {
            if (this.f43831a.length() < this.f43833c) {
                this.f43831a.append(c);
            }
        }

        /* renamed from: a */
        public void mo46737a(char c, char c2) {
            mo46743c(c);
            mo46741b(c2);
        }

        /* renamed from: b */
        public void mo46742b(String str) {
            int length = this.f43833c - this.f43832b.length();
            if (str.length() <= length) {
                this.f43832b.append(str);
            } else {
                this.f43832b.append(str.substring(0, length));
            }
        }

        /* renamed from: c */
        public void mo46744c(String str) {
            int length = this.f43833c - this.f43831a.length();
            if (str.length() <= length) {
                this.f43831a.append(str);
            } else {
                this.f43831a.append(str.substring(0, length));
            }
        }

        /* renamed from: a */
        public void mo46738a(String str) {
            mo46744c(str);
            mo46742b(str);
        }

        /* renamed from: a */
        public void mo46739a(String str, String str2) {
            mo46744c(str);
            mo46742b(str2);
        }

        /* renamed from: b */
        public String mo46740b() {
            return this.f43831a.toString();
        }

        /* renamed from: c */
        public boolean mo46745c() {
            return this.f43831a.length() >= this.f43833c && this.f43832b.length() >= this.f43833c;
        }

        /* renamed from: a */
        public String mo46735a() {
            return this.f43832b.toString();
        }
    }

    static {
        String str = "L";
        String str2 = "N";
        String str3 = "M";
        String str4 = "B";
        f43827d = new String[]{str, "R", str2, str3, str4, "H", "F", C2108a.f8135R4, C2108a.f8103N4, C3868i.f12248b};
        f43829f = new String[]{str, C2108a.f8183X4, "K", C2108a.f8087L4, str2, str3, str4, "Z"};
    }

    /* renamed from: b */
    private int m66798b(String str, C15078a aVar, int i) {
        int i2;
        String str2 = str;
        C15078a aVar2 = aVar;
        int i3 = i;
        if (m66801b(str2, i3)) {
            aVar2.mo46736a('K');
        } else if (i3 != 0 || !m66791a(str2, i3, 6, "CAESAR")) {
            if (m66791a(str2, i3, 2, "CH")) {
                i2 = m66806d(str, aVar, i);
            } else if (!m66791a(str2, i3, 2, "CZ") || m66791a(str2, i3 - 2, 4, "WICZ")) {
                int i4 = i3 + 1;
                if (m66791a(str2, i4, 3, "CIA")) {
                    aVar2.mo46736a('X');
                } else if (m66791a(str2, i3, 2, "CC") && (i3 != 1 || mo46728a(str2, 0) != 'M')) {
                    return m66802c(str, aVar, i);
                } else {
                    if (m66793a(str, i, 2, "CK", "CG", "CQ")) {
                        aVar2.mo46736a('K');
                    } else {
                        if (m66793a(str, i, 2, "CI", "CE", "CY")) {
                            if (m66793a(str, i, 3, "CIO", "CIE", "CIA")) {
                                aVar2.mo46737a('S', 'X');
                            } else {
                                aVar2.mo46736a('S');
                            }
                        } else {
                            aVar2.mo46736a('K');
                            if (!m66793a(str, i4, 2, " C", " Q", " G")) {
                                if (!m66793a(str, i4, 1, "C", "K", "Q") || m66792a(str2, i4, 2, "CE", "CI")) {
                                    i2 = i4;
                                }
                            }
                        }
                    }
                }
                i2 = i3 + 3;
            } else {
                aVar2.mo46737a('S', 'X');
            }
            return i2;
        } else {
            aVar2.mo46736a('S');
        }
        i2 = i3 + 2;
        return i2;
    }

    /* renamed from: c */
    private int m66802c(String str, C15078a aVar, int i) {
        int i2 = i + 2;
        if (!m66793a(str, i2, 1, "I", C2108a.f8095M4, "H") || m66791a(str, i2, 2, "HU")) {
            aVar.mo46736a('K');
            return i2;
        }
        if (!(i == 1 && mo46728a(str, i - 1) == 'A') && !m66792a(str, i - 1, 5, "UCCEE", "UCCES")) {
            aVar.mo46736a('X');
        } else {
            aVar.mo46738a("KS");
        }
        return i + 3;
    }

    /* renamed from: d */
    private int m66806d(String str, C15078a aVar, int i) {
        if (i > 0 && m66791a(str, i, 4, "CHAE")) {
            aVar.mo46737a('K', 'X');
        } else if (m66805c(str, i)) {
            aVar.mo46736a('K');
        } else if (m66809d(str, i)) {
            aVar.mo46736a('K');
        } else {
            if (i <= 0) {
                aVar.mo46736a('X');
            } else if (m66791a(str, 0, 2, "MC")) {
                aVar.mo46736a('K');
            } else {
                aVar.mo46737a('X', 'K');
            }
            return i + 2;
        }
        return i + 2;
    }

    /* renamed from: e */
    private int m66810e(String str, C15078a aVar, int i) {
        if (m66791a(str, i, 2, "DG")) {
            int i2 = i + 2;
            if (m66793a(str, i2, 1, "I", C2108a.f8095M4, "Y")) {
                aVar.mo46736a('J');
                return i + 3;
            }
            aVar.mo46738a("TK");
            return i2;
        } else if (m66792a(str, i, 2, "DT", "DD")) {
            aVar.mo46736a('T');
            return 2 + i;
        } else {
            aVar.mo46736a('T');
            return i + 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (m66793a(r16, r11 - 2, 1, "B", "H", "D") == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (m66793a(r16, r11 - 3, 1, "B", "H", "D") == false) goto L_0x005e;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m66813f(java.lang.String r16, org.apache.commons.codec.p525j.C15077a.C15078a r17, int r18) {
        /*
            r15 = this;
            r0 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = 75
            r13 = 2
            if (r11 <= 0) goto L_0x001f
            int r1 = r11 + -1
            char r1 = r15.mo46728a(r9, r1)
            boolean r1 = r15.m66790a(r1)
            if (r1 != 0) goto L_0x001f
            r10.mo46736a(r12)
        L_0x001b:
            int r1 = r11 + 2
            goto L_0x00a4
        L_0x001f:
            r14 = 73
            if (r11 != 0) goto L_0x0037
            int r1 = r11 + 2
            char r2 = r15.mo46728a(r9, r1)
            if (r2 != r14) goto L_0x0032
            r2 = 74
            r10.mo46736a(r2)
            goto L_0x00a4
        L_0x0032:
            r10.mo46736a(r12)
            goto L_0x00a4
        L_0x0037:
            r7 = 1
            if (r11 <= r7) goto L_0x004b
            int r2 = r11 + -2
            r3 = 1
            java.lang.String r4 = "B"
            java.lang.String r5 = "H"
            java.lang.String r6 = "D"
            r1 = r16
            boolean r1 = m66793a(r1, r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x001b
        L_0x004b:
            if (r11 <= r13) goto L_0x005e
            int r2 = r11 + -3
            r3 = 1
            java.lang.String r4 = "B"
            java.lang.String r5 = "H"
            java.lang.String r6 = "D"
            r1 = r16
            boolean r1 = m66793a(r1, r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x001b
        L_0x005e:
            r1 = 3
            if (r11 <= r1) goto L_0x006e
            int r1 = r11 + -4
            java.lang.String r2 = "B"
            java.lang.String r3 = "H"
            boolean r1 = m66792a(r9, r1, r7, r2, r3)
            if (r1 == 0) goto L_0x006e
            goto L_0x001b
        L_0x006e:
            if (r11 <= r13) goto L_0x0095
            int r1 = r11 + -1
            char r1 = r15.mo46728a(r9, r1)
            r2 = 85
            if (r1 != r2) goto L_0x0095
            int r2 = r11 + -3
            r3 = 1
            java.lang.String r4 = "C"
            java.lang.String r5 = "G"
            java.lang.String r6 = "L"
            java.lang.String r7 = "R"
            java.lang.String r8 = "T"
            r1 = r16
            boolean r1 = m66795a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r1 == 0) goto L_0x0095
            r1 = 70
            r10.mo46736a(r1)
            goto L_0x001b
        L_0x0095:
            if (r11 <= 0) goto L_0x001b
            int r1 = r11 + -1
            char r1 = r15.mo46728a(r9, r1)
            if (r1 == r14) goto L_0x001b
            r10.mo46736a(r12)
            goto L_0x001b
        L_0x00a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.p525j.C15077a.m66813f(java.lang.String, org.apache.commons.codec.j.a$a, int):int");
    }

    /* renamed from: g */
    private int m66815g(String str, C15078a aVar, int i) {
        if ((i != 0 && !m66790a(mo46728a(str, i - 1))) || !m66790a(mo46728a(str, i + 1))) {
            return i + 1;
        }
        aVar.mo46736a('H');
        return i + 2;
    }

    /* renamed from: h */
    private int m66816h(String str, C15078a aVar, int i) {
        aVar.mo46736a('L');
        int i2 = i + 1;
        if (mo46728a(str, i2) != 'L') {
            return i2;
        }
        if (m66812e(str, i)) {
            aVar.mo46741b(' ');
        }
        return i + 2;
    }

    /* renamed from: i */
    private int m66817i(String str, C15078a aVar, int i) {
        int i2 = i + 1;
        if (mo46728a(str, i2) == 'H') {
            aVar.mo46736a('F');
            return i + 2;
        }
        aVar.mo46736a('P');
        if (m66792a(str, i2, 1, C11644i.f33192S6, "B")) {
            i2 = i + 2;
        }
        return i2;
    }

    /* renamed from: j */
    private int m66818j(String str, C15078a aVar, int i) {
        String str2 = str;
        C15078a aVar2 = aVar;
        int i2 = i + 2;
        String str3 = "SK";
        if (mo46728a(str2, i2) == 'H') {
            int i3 = i + 3;
            if (m66796a(str, i3, 2, "OO", "ER", "EN", "UY", "ED", "EM")) {
                if (m66792a(str2, i3, 2, "ER", "EN")) {
                    aVar2.mo46739a("X", str3);
                } else {
                    aVar2.mo46738a(str3);
                }
            } else if (i != 0 || m66790a(mo46728a(str2, 3)) || mo46728a(str2, 3) == 'W') {
                aVar2.mo46736a('X');
            } else {
                aVar2.mo46737a('X', 'S');
            }
        } else {
            if (m66793a(str, i2, 1, "I", C2108a.f8095M4, "Y")) {
                aVar2.mo46736a('S');
            } else {
                aVar2.mo46738a(str3);
            }
        }
        return i + 3;
    }

    /* renamed from: k */
    private int m66819k(String str, C15078a aVar, int i) {
        if (m66791a(str, i, 4, "TION")) {
            aVar.mo46736a('X');
        } else if (m66792a(str, i, 3, "TIA", "TCH")) {
            aVar.mo46736a('X');
        } else if (m66791a(str, i, 2, "TH") || m66791a(str, i, 3, "TTH")) {
            int i2 = i + 2;
            if (m66792a(str, i2, 2, "OM", "AM") || m66792a(str, 0, 4, "VAN ", "VON ") || m66791a(str, 0, 3, "SCH")) {
                aVar.mo46736a('T');
                return i2;
            }
            aVar.mo46737a('0', 'T');
            return i2;
        } else {
            aVar.mo46736a('T');
            int i3 = i + 1;
            return m66792a(str, i3, 1, C2108a.f8183X4, "D") ? i + 2 : i3;
        }
        return i + 3;
    }

    /* renamed from: l */
    private int m66820l(String str, C15078a aVar, int i) {
        int i2 = 2;
        if (m66791a(str, i, 2, "WR")) {
            aVar.mo46736a('R');
        } else {
            if (i == 0) {
                int i3 = i + 1;
                if (m66790a(mo46728a(str, i3)) || m66791a(str, i, 2, "WH")) {
                    if (m66790a(mo46728a(str, i3))) {
                        aVar.mo46737a('A', 'F');
                    } else {
                        aVar.mo46736a('A');
                    }
                    return i3;
                }
            }
            if (i != str.length() - 1 || !m66790a(mo46728a(str, i - 1))) {
                if (!m66794a(str, i - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") && !m66791a(str, 0, 3, "SCH")) {
                    i2 = 4;
                    if (m66792a(str, i, 4, "WICZ", "WITZ")) {
                        aVar.mo46739a("TS", "FX");
                    }
                    return i + 1;
                }
            }
            aVar.mo46741b('F');
            return i + 1;
        }
        return i + i2;
    }

    /* renamed from: m */
    private int m66821m(String str, C15078a aVar, int i) {
        if (i == 0) {
            aVar.mo46736a('S');
            return i + 1;
        }
        if (i != str.length() - 1 || (!m66792a(str, i - 3, 3, "IAU", "EAU") && !m66792a(str, i - 2, 2, "AU", "OU"))) {
            aVar.mo46738a("KS");
        }
        int i2 = i + 1;
        return m66792a(str, i2, 1, "C", "X") ? i + 2 : i2;
    }

    /* renamed from: a */
    public String mo46730a(String str) {
        return mo46731a(str, false);
    }

    public String encode(String str) {
        return mo46730a(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (mo46728a(r8, r3) == 'V') goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        r1 = r1 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (mo46728a(r8, r3) == 'Q') goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (mo46728a(r8, r3) == 'N') goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        if (m66814f(r8, r1) != false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        if (mo46728a(r8, r3) == 'K') goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
        if (mo46728a(r8, r3) == 'F') goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e3, code lost:
        if (mo46728a(r8, r3) == 'B') goto L_0x005b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo46731a(java.lang.String r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r8 = r7.m66800b(r8)
            if (r8 != 0) goto L_0x0008
            r8 = 0
            return r8
        L_0x0008:
            boolean r0 = r7.m66808d(r8)
            boolean r1 = r7.m66804c(r8)
            org.apache.commons.codec.j.a$a r2 = new org.apache.commons.codec.j.a$a
            int r3 = r7.mo46729a()
            r2.<init>(r3)
        L_0x0019:
            boolean r3 = r2.mo46745c()
            if (r3 != 0) goto L_0x00f9
            int r3 = r8.length()
            int r3 = r3 + -1
            if (r1 > r3) goto L_0x00f9
            char r3 = r8.charAt(r1)
            r4 = 199(0xc7, float:2.79E-43)
            if (r3 == r4) goto L_0x00f2
            r4 = 209(0xd1, float:2.93E-43)
            r5 = 78
            if (r3 == r4) goto L_0x00ed
            r4 = 75
            r6 = 70
            switch(r3) {
                case 65: goto L_0x00e7;
                case 66: goto L_0x00d6;
                case 67: goto L_0x00d0;
                case 68: goto L_0x00ca;
                case 69: goto L_0x00e7;
                case 70: goto L_0x00be;
                case 71: goto L_0x00b8;
                case 72: goto L_0x00b2;
                case 73: goto L_0x00e7;
                case 74: goto L_0x00ac;
                case 75: goto L_0x00a0;
                case 76: goto L_0x009a;
                case 77: goto L_0x008e;
                case 78: goto L_0x0082;
                case 79: goto L_0x00e7;
                case 80: goto L_0x007d;
                case 81: goto L_0x006f;
                case 82: goto L_0x006a;
                case 83: goto L_0x0065;
                case 84: goto L_0x0060;
                case 85: goto L_0x00e7;
                case 86: goto L_0x004e;
                case 87: goto L_0x0049;
                case 88: goto L_0x0044;
                case 89: goto L_0x00e7;
                case 90: goto L_0x003f;
                default: goto L_0x003c;
            }
        L_0x003c:
            int r1 = r1 + 1
            goto L_0x0019
        L_0x003f:
            int r1 = r7.m66811e(r8, r2, r1, r0)
            goto L_0x0019
        L_0x0044:
            int r1 = r7.m66821m(r8, r2, r1)
            goto L_0x0019
        L_0x0049:
            int r1 = r7.m66820l(r8, r2, r1)
            goto L_0x0019
        L_0x004e:
            r2.mo46736a(r6)
            int r3 = r1 + 1
            char r4 = r7.mo46728a(r8, r3)
            r5 = 86
            if (r4 != r5) goto L_0x005e
        L_0x005b:
            int r1 = r1 + 2
            goto L_0x0019
        L_0x005e:
            r1 = r3
            goto L_0x0019
        L_0x0060:
            int r1 = r7.m66819k(r8, r2, r1)
            goto L_0x0019
        L_0x0065:
            int r1 = r7.m66807d(r8, r2, r1, r0)
            goto L_0x0019
        L_0x006a:
            int r1 = r7.m66803c(r8, r2, r1, r0)
            goto L_0x0019
        L_0x006f:
            r2.mo46736a(r4)
            int r3 = r1 + 1
            char r4 = r7.mo46728a(r8, r3)
            r5 = 81
            if (r4 != r5) goto L_0x005e
            goto L_0x005b
        L_0x007d:
            int r1 = r7.m66817i(r8, r2, r1)
            goto L_0x0019
        L_0x0082:
            r2.mo46736a(r5)
            int r3 = r1 + 1
            char r4 = r7.mo46728a(r8, r3)
            if (r4 != r5) goto L_0x005e
            goto L_0x005b
        L_0x008e:
            r3 = 77
            r2.mo46736a(r3)
            boolean r3 = r7.m66814f(r8, r1)
            if (r3 == 0) goto L_0x003c
            goto L_0x005b
        L_0x009a:
            int r1 = r7.m66816h(r8, r2, r1)
            goto L_0x0019
        L_0x00a0:
            r2.mo46736a(r4)
            int r3 = r1 + 1
            char r5 = r7.mo46728a(r8, r3)
            if (r5 != r4) goto L_0x005e
            goto L_0x005b
        L_0x00ac:
            int r1 = r7.m66799b(r8, r2, r1, r0)
            goto L_0x0019
        L_0x00b2:
            int r1 = r7.m66815g(r8, r2, r1)
            goto L_0x0019
        L_0x00b8:
            int r1 = r7.m66789a(r8, r2, r1, r0)
            goto L_0x0019
        L_0x00be:
            r2.mo46736a(r6)
            int r3 = r1 + 1
            char r4 = r7.mo46728a(r8, r3)
            if (r4 != r6) goto L_0x005e
            goto L_0x005b
        L_0x00ca:
            int r1 = r7.m66810e(r8, r2, r1)
            goto L_0x0019
        L_0x00d0:
            int r1 = r7.m66798b(r8, r2, r1)
            goto L_0x0019
        L_0x00d6:
            r3 = 80
            r2.mo46736a(r3)
            int r3 = r1 + 1
            char r4 = r7.mo46728a(r8, r3)
            r5 = 66
            if (r4 != r5) goto L_0x005e
            goto L_0x005b
        L_0x00e7:
            int r1 = r7.m66788a(r8, r2, r1)
            goto L_0x0019
        L_0x00ed:
            r2.mo46736a(r5)
            goto L_0x003c
        L_0x00f2:
            r3 = 83
            r2.mo46736a(r3)
            goto L_0x003c
        L_0x00f9:
            if (r9 == 0) goto L_0x0100
            java.lang.String r8 = r2.mo46735a()
            goto L_0x0104
        L_0x0100:
            java.lang.String r8 = r2.mo46740b()
        L_0x0104:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.p525j.C15077a.mo46731a(java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: c */
    private int m66803c(String str, C15078a aVar, int i, boolean z) {
        if (i != str.length() - 1 || z || !m66791a(str, i - 2, 2, "IE") || m66792a(str, i - 4, 2, "ME", "MA")) {
            aVar.mo46736a('R');
        } else {
            aVar.mo46741b('R');
        }
        int i2 = i + 1;
        return mo46728a(str, i2) == 'R' ? i + 2 : i2;
    }

    /* renamed from: e */
    private int m66811e(String str, C15078a aVar, int i, boolean z) {
        int i2 = i + 1;
        if (mo46728a(str, i2) == 'H') {
            aVar.mo46736a('J');
            return i + 2;
        }
        if (m66793a(str, i2, 2, "ZO", "ZI", "ZA") || (z && i > 0 && mo46728a(str, i - 1) != 'T')) {
            aVar.mo46739a(C2108a.f8087L4, "TS");
        } else {
            aVar.mo46736a('S');
        }
        if (mo46728a(str, i2) == 'Z') {
            i2 = i + 2;
        }
        return i2;
    }

    /* renamed from: c */
    private boolean m66805c(String str, int i) {
        if (i != 0) {
            return false;
        }
        int i2 = i + 1;
        if (!m66792a(str, i2, 5, "HARAC", "HARIS")) {
            if (!m66794a(str, i2, 3, "HOR", "HYM", "HIA", "HEM")) {
                return false;
            }
        }
        return !m66791a(str, 0, 5, "CHORE");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        if (m66794a(r16, r9 + 1, 1, "M", "N", "L", p053b.p063d.p064b.C2108a.f8103N4) == false) goto L_0x007d;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m66807d(java.lang.String r16, org.apache.commons.codec.p525j.C15077a.C15078a r17, int r18, boolean r19) {
        /*
            r15 = this;
            r7 = r16
            r8 = r17
            r9 = r18
            int r0 = r9 + -1
            r1 = 3
            java.lang.String r2 = "ISL"
            java.lang.String r3 = "YSL"
            boolean r0 = m66792a(r7, r0, r1, r2, r3)
            r10 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0014:
            int r0 = r9 + 1
            goto L_0x00cc
        L_0x0018:
            r11 = 88
            r12 = 83
            if (r9 != 0) goto L_0x002b
            r0 = 5
            java.lang.String r2 = "SUGAR"
            boolean r0 = m66791a(r7, r9, r0, r2)
            if (r0 == 0) goto L_0x002b
            r8.mo46737a(r11, r12)
            goto L_0x0014
        L_0x002b:
            r13 = 2
            java.lang.String r0 = "SH"
            boolean r0 = m66791a(r7, r9, r13, r0)
            if (r0 == 0) goto L_0x0052
            int r1 = r9 + 1
            r2 = 4
            java.lang.String r3 = "HEIM"
            java.lang.String r4 = "HOEK"
            java.lang.String r5 = "HOLM"
            java.lang.String r6 = "HOLZ"
            r0 = r16
            boolean r0 = m66794a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004b
            r8.mo46736a(r12)
            goto L_0x004e
        L_0x004b:
            r8.mo46736a(r11)
        L_0x004e:
            int r0 = r9 + 2
            goto L_0x00cc
        L_0x0052:
            java.lang.String r0 = "SIO"
            java.lang.String r2 = "SIA"
            boolean r0 = m66792a(r7, r9, r1, r0, r2)
            if (r0 != 0) goto L_0x00c1
            r0 = 4
            java.lang.String r2 = "SIAN"
            boolean r0 = m66791a(r7, r9, r0, r2)
            if (r0 == 0) goto L_0x0066
            goto L_0x00c1
        L_0x0066:
            java.lang.String r14 = "Z"
            if (r9 != 0) goto L_0x007d
            int r1 = r9 + 1
            r2 = 1
            java.lang.String r3 = "M"
            java.lang.String r4 = "N"
            java.lang.String r5 = "L"
            java.lang.String r6 = "W"
            r0 = r16
            boolean r0 = m66794a(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0085
        L_0x007d:
            int r0 = r9 + 1
            boolean r1 = m66791a(r7, r0, r10, r14)
            if (r1 == 0) goto L_0x0091
        L_0x0085:
            r8.mo46737a(r12, r11)
            int r0 = r9 + 1
            boolean r1 = m66791a(r7, r0, r10, r14)
            if (r1 == 0) goto L_0x00cc
            goto L_0x004e
        L_0x0091:
            java.lang.String r1 = "SC"
            boolean r1 = m66791a(r7, r9, r13, r1)
            if (r1 == 0) goto L_0x009e
            int r0 = r15.m66818j(r16, r17, r18)
            goto L_0x00cc
        L_0x009e:
            int r1 = r16.length()
            int r1 = r1 - r10
            if (r9 != r1) goto L_0x00b5
            int r1 = r9 + -2
            java.lang.String r2 = "AI"
            java.lang.String r3 = "OI"
            boolean r1 = m66792a(r7, r1, r13, r2, r3)
            if (r1 == 0) goto L_0x00b5
            r8.mo46741b(r12)
            goto L_0x00b8
        L_0x00b5:
            r8.mo46736a(r12)
        L_0x00b8:
            java.lang.String r1 = "S"
            boolean r1 = m66792a(r7, r0, r10, r1, r14)
            if (r1 == 0) goto L_0x00cc
            goto L_0x004e
        L_0x00c1:
            if (r19 == 0) goto L_0x00c7
            r8.mo46736a(r12)
            goto L_0x00ca
        L_0x00c7:
            r8.mo46737a(r12, r11)
        L_0x00ca:
            int r0 = r9 + 3
        L_0x00cc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.p525j.C15077a.m66807d(java.lang.String, org.apache.commons.codec.j.a$a, int, boolean):int");
    }

    /* renamed from: f */
    private boolean m66814f(String str, int i) {
        int i2 = i + 1;
        boolean z = true;
        if (mo46728a(str, i2) == 'M') {
            return true;
        }
        if (!m66791a(str, i - 1, 3, "UMB") || (i2 != str.length() - 1 && !m66791a(str, i + 2, 2, "ER"))) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private boolean m66804c(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f43826c;
            if (i >= strArr.length) {
                return false;
            }
            if (str.startsWith(strArr[i])) {
                return true;
            }
            i++;
        }
    }

    /* renamed from: e */
    private boolean m66812e(String str, int i) {
        if (i == str.length() - 3) {
            if (m66793a(str, i - 1, 4, "ILLO", "ILLA", "ALLE")) {
                return true;
            }
        }
        int i2 = i - 1;
        if ((m66792a(str, i2, 2, "AS", "OS") || m66792a(str, str.length() - 1, 1, C2108a.f8127Q4, "O")) && m66791a(str, i2, 4, "ALLE")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private int m66799b(String str, C15078a aVar, int i, boolean z) {
        String str2 = str;
        C15078a aVar2 = aVar;
        int i2 = i;
        String str3 = "JOSE";
        String str4 = "SAN ";
        if (m66791a(str, i2, 4, str3) || m66791a(str, 0, 4, str4)) {
            if ((i2 == 0 && mo46728a(str, i2 + 4) == ' ') || str.length() == 4 || m66791a(str, 0, 4, str4)) {
                aVar.mo46736a('H');
            } else {
                aVar.mo46737a('J', 'H');
            }
            return i2 + 1;
        }
        if (i2 != 0 || m66791a(str, i2, 4, str3)) {
            int i3 = i2 - 1;
            if (m66790a(mo46728a(str, i3)) && !z) {
                int i4 = i2 + 1;
                if (mo46728a(str, i4) == 'A' || mo46728a(str, i4) == 'O') {
                    aVar.mo46737a('J', 'H');
                }
            }
            if (i2 == str.length() - 1) {
                aVar.mo46737a('J', ' ');
            } else if (!m66797a(str, i2 + 1, 1, f43829f)) {
                if (!m66793a(str, i3, 1, C2108a.f8087L4, "K", "L")) {
                    aVar.mo46736a('J');
                }
            }
        } else {
            aVar.mo46737a('J', 'A');
        }
        int i5 = i2 + 1;
        if (mo46728a(str, i5) == 'J') {
            return i2 + 2;
        }
        return i5;
    }

    /* renamed from: d */
    private boolean m66809d(String str, int i) {
        if (!m66792a(str, 0, 4, "VAN ", "VON ") && !m66791a(str, 0, 3, "SCH")) {
            if (!m66793a(str, i - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) {
                int i2 = i + 2;
                if (!m66792a(str, i2, 1, C2108a.f8183X4, C2108a.f8087L4)) {
                    if (!m66794a(str, i - 1, 1, C2108a.f8127Q4, "O", "U", C2108a.f8095M4) && i != 0) {
                        return false;
                    }
                    if (!m66797a(str, i2, 1, f43827d) && i + 1 != str.length() - 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    private boolean m66808d(String str) {
        return str.indexOf(87) > -1 || str.indexOf(75) > -1 || str.indexOf("CZ") > -1 || str.indexOf("WITZ") > -1;
    }

    /* renamed from: b */
    private boolean m66801b(String str, int i) {
        if (m66791a(str, i, 4, "CHIA")) {
            return true;
        }
        boolean z = false;
        if (i <= 1) {
            return false;
        }
        int i2 = i - 2;
        if (m66790a(mo46728a(str, i2)) || !m66791a(str, i - 1, 3, "ACH")) {
            return false;
        }
        char a = mo46728a(str, i + 2);
        if (!(a == 'I' || a == 'E') || m66792a(str, i2, 6, "BACHER", "MACHER")) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public Object mo46723a(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return mo46730a((String) obj);
        }
        throw new EncoderException("DoubleMetaphone encode parameter is not of type String");
    }

    /* renamed from: b */
    private String m66800b(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return null;
        }
        return trim.toUpperCase();
    }

    /* renamed from: a */
    public boolean mo46733a(String str, String str2) {
        return mo46734a(str, str2, false);
    }

    /* renamed from: a */
    public boolean mo46734a(String str, String str2, boolean z) {
        return mo46731a(str, z).equals(mo46731a(str2, z));
    }

    /* renamed from: a */
    public int mo46729a() {
        return this.f43830a;
    }

    /* renamed from: a */
    public void mo46732a(int i) {
        this.f43830a = i;
    }

    /* renamed from: a */
    private int m66788a(String str, C15078a aVar, int i) {
        if (i == 0) {
            aVar.mo46736a('A');
        }
        return i + 1;
    }

    /* renamed from: a */
    private int m66789a(String str, C15078a aVar, int i, boolean z) {
        int i2;
        String str2 = str;
        C15078a aVar2 = aVar;
        int i3 = i;
        int i4 = i3 + 1;
        if (mo46728a(str2, i4) == 'H') {
            return m66813f(str, aVar, i);
        }
        if (mo46728a(str2, i4) == 'N') {
            String str3 = "N";
            String str4 = "KN";
            if (i3 == 1 && m66790a(mo46728a(str2, 0)) && !z) {
                aVar2.mo46739a(str4, str3);
            } else if (m66791a(str2, i3 + 2, 2, "EY") || mo46728a(str2, i4) == 'Y' || z) {
                aVar2.mo46738a(str4);
            } else {
                aVar2.mo46739a(str3, str4);
            }
        } else if (m66791a(str2, i4, 2, "LI") && !z) {
            aVar2.mo46739a("KL", "L");
        } else if (i3 != 0 || (mo46728a(str2, i4) != 'Y' && !m66797a(str2, i4, 2, f43828e))) {
            if (m66791a(str2, i4, 2, "ER") || mo46728a(str2, i4) == 'Y') {
                i2 = 3;
                if (!m66793a(str, 0, 6, "DANGER", "RANGER", "MANGER")) {
                    int i5 = i3 - 1;
                    if (!m66792a(str2, i5, 1, C2108a.f8095M4, "I") && !m66792a(str2, i5, 3, "RGY", "OGY")) {
                        aVar2.mo46737a('K', 'J');
                    }
                }
            } else {
                i2 = 3;
            }
            if (m66793a(str, i4, 1, C2108a.f8095M4, "I", "Y") || m66792a(str2, i3 - 1, 4, "AGGI", "OGGI")) {
                if (m66792a(str2, 0, 4, "VAN ", "VON ") || m66791a(str2, 0, i2, "SCH") || m66791a(str2, i4, 2, "ET")) {
                    aVar2.mo46736a('K');
                } else if (m66791a(str2, i4, 4, "IER")) {
                    aVar2.mo46736a('J');
                } else {
                    aVar2.mo46737a('J', 'K');
                }
            } else if (mo46728a(str2, i4) == 'G') {
                int i6 = i3 + 2;
                aVar2.mo46736a('K');
                return i6;
            } else {
                aVar2.mo46736a('K');
                return i4;
            }
        } else {
            aVar2.mo46737a('K', 'J');
        }
        return i3 + 2;
    }

    /* renamed from: a */
    private boolean m66790a(char c) {
        return f43825b.indexOf(c) != -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public char mo46728a(String str, int i) {
        if (i < 0 || i >= str.length()) {
            return 0;
        }
        return str.charAt(i);
    }

    /* renamed from: a */
    private static boolean m66791a(String str, int i, int i2, String str2) {
        return m66797a(str, i, i2, new String[]{str2});
    }

    /* renamed from: a */
    private static boolean m66792a(String str, int i, int i2, String str2, String str3) {
        return m66797a(str, i, i2, new String[]{str2, str3});
    }

    /* renamed from: a */
    private static boolean m66793a(String str, int i, int i2, String str2, String str3, String str4) {
        return m66797a(str, i, i2, new String[]{str2, str3, str4});
    }

    /* renamed from: a */
    private static boolean m66794a(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        return m66797a(str, i, i2, new String[]{str2, str3, str4, str5});
    }

    /* renamed from: a */
    private static boolean m66795a(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6) {
        return m66797a(str, i, i2, new String[]{str2, str3, str4, str5, str6});
    }

    /* renamed from: a */
    private static boolean m66796a(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, String str7) {
        return m66797a(str, i, i2, new String[]{str2, str3, str4, str5, str6, str7});
    }

    /* renamed from: a */
    protected static boolean m66797a(String str, int i, int i2, String[] strArr) {
        if (i < 0) {
            return false;
        }
        int i3 = i2 + i;
        if (i3 > str.length()) {
            return false;
        }
        String substring = str.substring(i, i3);
        for (String equals : strArr) {
            if (substring.equals(equals)) {
                return true;
            }
        }
        return false;
    }
}
