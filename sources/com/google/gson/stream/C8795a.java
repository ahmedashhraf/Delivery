package com.google.gson.stream;

import com.facebook.internal.ServerProtocol;
import com.google.gson.p321x.C8828e;
import com.google.gson.p321x.p322m.C8865e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import kotlin.p217i1.C14662d0;

/* renamed from: com.google.gson.stream.a */
/* compiled from: JsonReader */
public class C8795a implements Closeable {

    /* renamed from: A0 */
    private static final int f23038A0 = 6;

    /* renamed from: B0 */
    private static final int f23039B0 = 7;

    /* renamed from: a0 */
    private static final char[] f23040a0 = ")]}'\n".toCharArray();

    /* renamed from: b0 */
    private static final long f23041b0 = -922337203685477580L;

    /* renamed from: c0 */
    private static final int f23042c0 = 0;

    /* renamed from: d0 */
    private static final int f23043d0 = 1;

    /* renamed from: e0 */
    private static final int f23044e0 = 2;

    /* renamed from: f0 */
    private static final int f23045f0 = 3;

    /* renamed from: g0 */
    private static final int f23046g0 = 4;

    /* renamed from: h0 */
    private static final int f23047h0 = 5;

    /* renamed from: i0 */
    private static final int f23048i0 = 6;

    /* renamed from: j0 */
    private static final int f23049j0 = 7;

    /* renamed from: k0 */
    private static final int f23050k0 = 8;

    /* renamed from: l0 */
    private static final int f23051l0 = 9;

    /* renamed from: m0 */
    private static final int f23052m0 = 10;

    /* renamed from: n0 */
    private static final int f23053n0 = 11;

    /* renamed from: o0 */
    private static final int f23054o0 = 12;

    /* renamed from: p0 */
    private static final int f23055p0 = 13;

    /* renamed from: q0 */
    private static final int f23056q0 = 14;

    /* renamed from: r0 */
    private static final int f23057r0 = 15;

    /* renamed from: s0 */
    private static final int f23058s0 = 16;

    /* renamed from: t0 */
    private static final int f23059t0 = 17;

    /* renamed from: u0 */
    private static final int f23060u0 = 0;

    /* renamed from: v0 */
    private static final int f23061v0 = 1;

    /* renamed from: w0 */
    private static final int f23062w0 = 2;

    /* renamed from: x0 */
    private static final int f23063x0 = 3;

    /* renamed from: y0 */
    private static final int f23064y0 = 4;

    /* renamed from: z0 */
    private static final int f23065z0 = 5;

    /* renamed from: N */
    private final char[] f23066N = new char[1024];

    /* renamed from: O */
    private int f23067O = 0;

    /* renamed from: P */
    private int f23068P = 0;

    /* renamed from: Q */
    private int f23069Q = 0;

    /* renamed from: R */
    private int f23070R = 0;

    /* renamed from: S */
    int f23071S = 0;

    /* renamed from: T */
    private long f23072T;

    /* renamed from: U */
    private int f23073U;

    /* renamed from: V */
    private String f23074V;

    /* renamed from: W */
    private int[] f23075W = new int[32];

    /* renamed from: X */
    private int f23076X = 0;

    /* renamed from: Y */
    private String[] f23077Y;

    /* renamed from: Z */
    private int[] f23078Z;

    /* renamed from: a */
    private final Reader f23079a;

    /* renamed from: b */
    private boolean f23080b = false;

    /* renamed from: com.google.gson.stream.a$a */
    /* compiled from: JsonReader */
    static class C8796a extends C8828e {
        C8796a() {
        }

        /* renamed from: a */
        public void mo32455a(C8795a aVar) throws IOException {
            if (aVar instanceof C8865e) {
                ((C8865e) aVar).mo32612O();
                return;
            }
            int i = aVar.f23071S;
            if (i == 0) {
                i = aVar.mo32448e();
            }
            if (i == 13) {
                aVar.f23071S = 9;
            } else if (i == 12) {
                aVar.f23071S = 8;
            } else if (i == 14) {
                aVar.f23071S = 10;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a name but was ");
                sb.append(aVar.peek());
                sb.append(aVar.mo32435F());
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    static {
        C8828e.f23146a = new C8796a();
    }

    public C8795a(Reader reader) {
        int[] iArr = this.f23075W;
        int i = this.f23076X;
        this.f23076X = i + 1;
        iArr[i] = 6;
        this.f23077Y = new String[32];
        this.f23078Z = new int[32];
        if (reader != null) {
            this.f23079a = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: O */
    private void mo32612O() throws IOException {
        if (!this.f23080b) {
            throw m41278c("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: P */
    private void m41266P() throws IOException {
        m41275b(true);
        this.f23067O--;
        int i = this.f23067O;
        char[] cArr = f23040a0;
        if (i + cArr.length <= this.f23068P || m41274a(cArr.length)) {
            int i2 = 0;
            while (true) {
                char[] cArr2 = f23040a0;
                if (i2 >= cArr2.length) {
                    this.f23067O += cArr2.length;
                    return;
                } else if (this.f23066N[this.f23067O + i2] == cArr2[i2]) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
        mo32612O();
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m41267Q() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = r1
        L_0x0003:
            r1 = 0
        L_0x0004:
            int r3 = r6.f23067O
            int r4 = r3 + r1
            int r5 = r6.f23068P
            if (r4 >= r5) goto L_0x004f
            char[] r4 = r6.f23066N
            int r3 = r3 + r1
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005d
            r4 = 10
            if (r3 == r4) goto L_0x005d
            r4 = 12
            if (r3 == r4) goto L_0x005d
            r4 = 13
            if (r3 == r4) goto L_0x005d
            r4 = 32
            if (r3 == r4) goto L_0x005d
            r4 = 35
            if (r3 == r4) goto L_0x004b
            r4 = 44
            if (r3 == r4) goto L_0x005d
            r4 = 47
            if (r3 == r4) goto L_0x004b
            r4 = 61
            if (r3 == r4) goto L_0x004b
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005d
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005d
            r4 = 58
            if (r3 == r4) goto L_0x005d
            r4 = 59
            if (r3 == r4) goto L_0x004b
            switch(r3) {
                case 91: goto L_0x005d;
                case 92: goto L_0x004b;
                case 93: goto L_0x005d;
                default: goto L_0x0048;
            }
        L_0x0048:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x004b:
            r6.mo32612O()
            goto L_0x005d
        L_0x004f:
            char[] r3 = r6.f23066N
            int r3 = r3.length
            if (r1 >= r3) goto L_0x005f
            int r3 = r1 + 1
            boolean r3 = r6.m41274a(r3)
            if (r3 == 0) goto L_0x005d
            goto L_0x0004
        L_0x005d:
            r0 = r1
            goto L_0x007f
        L_0x005f:
            if (r2 != 0) goto L_0x006c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r1, r3)
            r2.<init>(r3)
        L_0x006c:
            char[] r3 = r6.f23066N
            int r4 = r6.f23067O
            r2.append(r3, r4, r1)
            int r3 = r6.f23067O
            int r3 = r3 + r1
            r6.f23067O = r3
            r1 = 1
            boolean r1 = r6.m41274a(r1)
            if (r1 != 0) goto L_0x0003
        L_0x007f:
            if (r2 != 0) goto L_0x008b
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f23066N
            int r3 = r6.f23067O
            r1.<init>(r2, r3, r0)
            goto L_0x0096
        L_0x008b:
            char[] r1 = r6.f23066N
            int r3 = r6.f23067O
            r2.append(r1, r3, r0)
            java.lang.String r1 = r2.toString()
        L_0x0096:
            int r2 = r6.f23067O
            int r2 = r2 + r0
            r6.f23067O = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C8795a.m41267Q():java.lang.String");
    }

    /* renamed from: R */
    private int m41268R() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.f23066N[this.f23067O];
        if (c == 't' || c == 'T') {
            i = 5;
            str2 = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE;
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f23067O + i2 >= this.f23068P && !m41274a(i2 + 1)) {
                return 0;
            }
            char c2 = this.f23066N[this.f23067O + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f23067O + length < this.f23068P || m41274a(length + 1)) && m41273a(this.f23066N[this.f23067O + length])) {
            return 0;
        }
        this.f23067O += length;
        this.f23071S = i;
        return i;
    }

    /* renamed from: S */
    private int m41269S() throws IOException {
        char c;
        char[] cArr = this.f23066N;
        int i = this.f23067O;
        int i2 = 0;
        int i3 = this.f23068P;
        int i4 = 0;
        char c2 = 0;
        boolean z = true;
        long j = 0;
        boolean z2 = false;
        while (true) {
            if (i + i4 == i3) {
                if (i4 == cArr.length) {
                    return i2;
                }
                if (!m41274a(i4 + 1)) {
                    break;
                }
                i = this.f23067O;
                i3 = this.f23068P;
            }
            c = cArr[i + i4];
            if (c == '+') {
                i2 = 0;
                if (c2 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i2 = 0;
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i4++;
            } else {
                if (c == '-') {
                    i2 = 0;
                    if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (c == '.') {
                    i2 = 0;
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                } else if (c >= '0' && c <= '9') {
                    if (c2 == 1 || c2 == 0) {
                        j = (long) (-(c - '0'));
                        i2 = 0;
                        c2 = 2;
                    } else {
                        if (c2 == 2) {
                            if (j == 0) {
                                return 0;
                            }
                            long j2 = (10 * j) - ((long) (c - '0'));
                            boolean z3 = j > f23041b0 || (j == f23041b0 && j2 < j);
                            j = j2;
                            z = z3 & z;
                        } else if (c2 == 3) {
                            i2 = 0;
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            i2 = 0;
                            c2 = 7;
                        }
                        i2 = 0;
                    }
                }
                i4++;
            }
            c2 = 6;
            i4++;
        }
        if (m41273a(c)) {
            return 0;
        }
        if (c2 == 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f23072T = j;
            this.f23067O += i4;
            this.f23071S = 15;
            return 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f23073U = i4;
            this.f23071S = 16;
            return 16;
        }
    }

    /* renamed from: T */
    private char m41270T() throws IOException {
        int i;
        int i2;
        String str = "Unterminated escape sequence";
        if (this.f23067O != this.f23068P || m41274a(1)) {
            char[] cArr = this.f23066N;
            int i3 = this.f23067O;
            this.f23067O = i3 + 1;
            char c = cArr[i3];
            if (c == 10) {
                this.f23069Q++;
                this.f23070R = this.f23067O;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    throw m41278c("Invalid escape sequence");
                } else if (this.f23067O + 4 <= this.f23068P || m41274a(4)) {
                    char c2 = 0;
                    int i4 = this.f23067O;
                    int i5 = i4 + 4;
                    while (i4 < i5) {
                        char c3 = this.f23066N[i4];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                StringBuilder sb = new StringBuilder();
                                sb.append("\\u");
                                sb.append(new String(this.f23066N, this.f23067O, 4));
                                throw new NumberFormatException(sb.toString());
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i4++;
                    }
                    this.f23067O += 4;
                    return c2;
                } else {
                    throw m41278c(str);
                }
            }
            return c;
        }
        throw m41278c(str);
    }

    /* renamed from: U */
    private void m41271U() throws IOException {
        char c;
        do {
            if (this.f23067O < this.f23068P || m41274a(1)) {
                char[] cArr = this.f23066N;
                int i = this.f23067O;
                this.f23067O = i + 1;
                c = cArr[i];
                if (c == 10) {
                    this.f23069Q++;
                    this.f23070R = this.f23067O;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        mo32612O();
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m41272V() throws java.io.IOException {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f23067O
            int r2 = r1 + r0
            int r3 = r4.f23068P
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f23066N
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.mo32612O()
        L_0x004b:
            int r1 = r4.f23067O
            int r1 = r1 + r0
            r4.f23067O = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f23067O = r1
            r0 = 1
            boolean r0 = r4.m41274a(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C8795a.m41272V():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r1 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r4) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        r1.append(r0, r4, r2 - r4);
        r9.f23067O = r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m41276b(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f23066N
            r1 = 0
        L_0x0003:
            int r2 = r9.f23067O
            int r3 = r9.f23068P
        L_0x0007:
            r4 = r2
        L_0x0008:
            r5 = 16
            r6 = 1
            if (r2 >= r3) goto L_0x005b
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L_0x0027
            r9.f23067O = r7
            int r7 = r7 - r4
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x001f
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r4, r7)
            return r10
        L_0x001f:
            r1.append(r0, r4, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x0027:
            r8 = 92
            if (r2 != r8) goto L_0x004e
            r9.f23067O = r7
            int r7 = r7 - r4
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x003f
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L_0x003f:
            r1.append(r0, r4, r7)
            char r2 = r9.m41270T()
            r1.append(r2)
            int r2 = r9.f23067O
            int r3 = r9.f23068P
            goto L_0x0007
        L_0x004e:
            r5 = 10
            if (r2 != r5) goto L_0x0059
            int r2 = r9.f23069Q
            int r2 = r2 + r6
            r9.f23069Q = r2
            r9.f23070R = r7
        L_0x0059:
            r2 = r7
            goto L_0x0008
        L_0x005b:
            if (r1 != 0) goto L_0x006b
            int r1 = r2 - r4
            int r1 = r1 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r3.<init>(r1)
            r1 = r3
        L_0x006b:
            int r3 = r2 - r4
            r1.append(r0, r4, r3)
            r9.f23067O = r2
            boolean r2 = r9.m41274a(r6)
            if (r2 == 0) goto L_0x0079
            goto L_0x0003
        L_0x0079:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.m41278c(r10)
            goto L_0x0081
        L_0x0080:
            throw r10
        L_0x0081:
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C8795a.m41276b(char):java.lang.String");
    }

    /* renamed from: c */
    private void m41279c(char c) throws IOException {
        char[] cArr = this.f23066N;
        do {
            int i = this.f23067O;
            int i2 = this.f23068P;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f23067O = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f23067O = i3;
                    m41270T();
                    i = this.f23067O;
                    i2 = this.f23068P;
                } else {
                    if (c2 == 10) {
                        this.f23069Q++;
                        this.f23070R = i3;
                    }
                    i = i3;
                }
            }
            this.f23067O = i;
        } while (m41274a(1));
        throw m41278c("Unterminated string");
    }

    /* renamed from: B */
    public final boolean mo32434B() {
        return this.f23080b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public String mo32435F() {
        int i = this.f23069Q + 1;
        int i2 = (this.f23067O - this.f23070R) + 1;
        StringBuilder sb = new StringBuilder();
        sb.append(" at line ");
        sb.append(i);
        sb.append(" column ");
        sb.append(i2);
        sb.append(" path ");
        sb.append(mo32451h());
        return sb.toString();
    }

    /* renamed from: G */
    public boolean mo32436G() throws IOException {
        int i = this.f23071S;
        if (i == 0) {
            i = mo32448e();
        }
        if (i == 5) {
            this.f23071S = 0;
            int[] iArr = this.f23078Z;
            int i2 = this.f23076X - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f23071S = 0;
            int[] iArr2 = this.f23078Z;
            int i3 = this.f23076X - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a boolean but was ");
            sb.append(peek());
            sb.append(mo32435F());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: H */
    public double mo32437H() throws IOException {
        int i = this.f23071S;
        if (i == 0) {
            i = mo32448e();
        }
        if (i == 15) {
            this.f23071S = 0;
            int[] iArr = this.f23078Z;
            int i2 = this.f23076X - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f23072T;
        }
        if (i == 16) {
            this.f23074V = new String(this.f23066N, this.f23067O, this.f23073U);
            this.f23067O += this.f23073U;
        } else if (i == 8 || i == 9) {
            this.f23074V = m41276b(i == 8 ? '\'' : C14662d0.f42850a);
        } else if (i == 10) {
            this.f23074V = m41267Q();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a double but was ");
            sb.append(peek());
            sb.append(mo32435F());
            throw new IllegalStateException(sb.toString());
        }
        this.f23071S = 11;
        double parseDouble = Double.parseDouble(this.f23074V);
        if (this.f23080b || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f23074V = null;
            this.f23071S = 0;
            int[] iArr2 = this.f23078Z;
            int i3 = this.f23076X - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("JSON forbids NaN and infinities: ");
        sb2.append(parseDouble);
        sb2.append(mo32435F());
        throw new MalformedJsonException(sb2.toString());
    }

    /* renamed from: I */
    public int mo32438I() throws IOException {
        int i = this.f23071S;
        if (i == 0) {
            i = mo32448e();
        }
        String str = "Expected an int but was ";
        if (i == 15) {
            long j = this.f23072T;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f23071S = 0;
                int[] iArr = this.f23078Z;
                int i3 = this.f23076X - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f23072T);
            sb.append(mo32435F());
            throw new NumberFormatException(sb.toString());
        }
        if (i == 16) {
            this.f23074V = new String(this.f23066N, this.f23067O, this.f23073U);
            this.f23067O += this.f23073U;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f23074V = m41267Q();
            } else {
                this.f23074V = m41276b(i == 8 ? '\'' : C14662d0.f42850a);
            }
            try {
                int parseInt = Integer.parseInt(this.f23074V);
                this.f23071S = 0;
                int[] iArr2 = this.f23078Z;
                int i4 = this.f23076X - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(peek());
            sb2.append(mo32435F());
            throw new IllegalStateException(sb2.toString());
        }
        this.f23071S = 11;
        double parseDouble = Double.parseDouble(this.f23074V);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f23074V = null;
            this.f23071S = 0;
            int[] iArr3 = this.f23078Z;
            int i6 = this.f23076X - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(this.f23074V);
        sb3.append(mo32435F());
        throw new NumberFormatException(sb3.toString());
    }

    /* renamed from: J */
    public long mo32439J() throws IOException {
        int i = this.f23071S;
        if (i == 0) {
            i = mo32448e();
        }
        if (i == 15) {
            this.f23071S = 0;
            int[] iArr = this.f23078Z;
            int i2 = this.f23076X - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f23072T;
        }
        String str = "Expected a long but was ";
        if (i == 16) {
            this.f23074V = new String(this.f23066N, this.f23067O, this.f23073U);
            this.f23067O += this.f23073U;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f23074V = m41267Q();
            } else {
                this.f23074V = m41276b(i == 8 ? '\'' : C14662d0.f42850a);
            }
            try {
                long parseLong = Long.parseLong(this.f23074V);
                this.f23071S = 0;
                int[] iArr2 = this.f23078Z;
                int i3 = this.f23076X - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(peek());
            sb.append(mo32435F());
            throw new IllegalStateException(sb.toString());
        }
        this.f23071S = 11;
        double parseDouble = Double.parseDouble(this.f23074V);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f23074V = null;
            this.f23071S = 0;
            int[] iArr3 = this.f23078Z;
            int i4 = this.f23076X - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f23074V);
        sb2.append(mo32435F());
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: K */
    public String mo32440K() throws IOException {
        String str;
        int i = this.f23071S;
        if (i == 0) {
            i = mo32448e();
        }
        if (i == 14) {
            str = m41267Q();
        } else if (i == 12) {
            str = m41276b('\'');
        } else if (i == 13) {
            str = m41276b((char) C14662d0.f42850a);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a name but was ");
            sb.append(peek());
            sb.append(mo32435F());
            throw new IllegalStateException(sb.toString());
        }
        this.f23071S = 0;
        this.f23077Y[this.f23076X - 1] = str;
        return str;
    }

    /* renamed from: L */
    public void mo32441L() throws IOException {
        int i = this.f23071S;
        if (i == 0) {
            i = mo32448e();
        }
        if (i == 7) {
            this.f23071S = 0;
            int[] iArr = this.f23078Z;
            int i2 = this.f23076X - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected null but was ");
        sb.append(peek());
        sb.append(mo32435F());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: M */
    public String mo32442M() throws IOException {
        String str;
        int i = this.f23071S;
        if (i == 0) {
            i = mo32448e();
        }
        if (i == 10) {
            str = m41267Q();
        } else if (i == 8) {
            str = m41276b('\'');
        } else if (i == 9) {
            str = m41276b((char) C14662d0.f42850a);
        } else if (i == 11) {
            str = this.f23074V;
            this.f23074V = null;
        } else if (i == 15) {
            str = Long.toString(this.f23072T);
        } else if (i == 16) {
            str = new String(this.f23066N, this.f23067O, this.f23073U);
            this.f23067O += this.f23073U;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a string but was ");
            sb.append(peek());
            sb.append(mo32435F());
            throw new IllegalStateException(sb.toString());
        }
        this.f23071S = 0;
        int[] iArr = this.f23078Z;
        int i2 = this.f23076X - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: N */
    public void mo32443N() throws IOException {
        int i = 0;
        do {
            int i2 = this.f23071S;
            if (i2 == 0) {
                i2 = mo32448e();
            }
            if (i2 == 3) {
                m41280e(1);
            } else if (i2 == 1) {
                m41280e(3);
            } else {
                if (i2 == 4) {
                    this.f23076X--;
                } else if (i2 == 2) {
                    this.f23076X--;
                } else if (i2 == 14 || i2 == 10) {
                    m41272V();
                    this.f23071S = 0;
                } else if (i2 == 8 || i2 == 12) {
                    m41279c('\'');
                    this.f23071S = 0;
                } else if (i2 == 9 || i2 == 13) {
                    m41279c((char) C14662d0.f42850a);
                    this.f23071S = 0;
                } else {
                    if (i2 == 16) {
                        this.f23067O += this.f23073U;
                    }
                    this.f23071S = 0;
                }
                i--;
                this.f23071S = 0;
            }
            i++;
            this.f23071S = 0;
        } while (i != 0);
        int[] iArr = this.f23078Z;
        int i3 = this.f23076X;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f23077Y[i3 - 1] = "null";
    }

    /* renamed from: a */
    public final void mo32445a(boolean z) {
        this.f23080b = z;
    }

    public void close() throws IOException {
        this.f23071S = 0;
        this.f23075W[0] = 8;
        this.f23076X = 1;
        this.f23079a.close();
    }

    /* renamed from: d */
    public void mo32447d() throws IOException {
        int i = this.f23071S;
        if (i == 0) {
            i = mo32448e();
        }
        if (i == 1) {
            m41280e(3);
            this.f23071S = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_OBJECT but was ");
        sb.append(peek());
        sb.append(mo32435F());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo32448e() throws IOException {
        int[] iArr = this.f23075W;
        int i = this.f23076X;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int b = m41275b(true);
            if (b != 44) {
                if (b == 59) {
                    mo32612O();
                } else if (b == 93) {
                    this.f23071S = 4;
                    return 4;
                } else {
                    throw m41278c("Unterminated array");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            this.f23075W[this.f23076X - 1] = 4;
            if (i2 == 5) {
                int b2 = m41275b(true);
                if (b2 != 44) {
                    if (b2 == 59) {
                        mo32612O();
                    } else if (b2 == 125) {
                        this.f23071S = 2;
                        return 2;
                    } else {
                        throw m41278c("Unterminated object");
                    }
                }
            }
            int b3 = m41275b(true);
            if (b3 == 34) {
                this.f23071S = 13;
                return 13;
            } else if (b3 != 39) {
                String str = "Expected name";
                if (b3 != 125) {
                    mo32612O();
                    this.f23067O--;
                    if (m41273a((char) b3)) {
                        this.f23071S = 14;
                        return 14;
                    }
                    throw m41278c(str);
                } else if (i2 != 5) {
                    this.f23071S = 2;
                    return 2;
                } else {
                    throw m41278c(str);
                }
            } else {
                mo32612O();
                this.f23071S = 12;
                return 12;
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int b4 = m41275b(true);
            if (b4 != 58) {
                if (b4 == 61) {
                    mo32612O();
                    if (this.f23067O < this.f23068P || m41274a(1)) {
                        char[] cArr = this.f23066N;
                        int i3 = this.f23067O;
                        if (cArr[i3] == '>') {
                            this.f23067O = i3 + 1;
                        }
                    }
                } else {
                    throw m41278c("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            if (this.f23080b) {
                m41266P();
            }
            this.f23075W[this.f23076X - 1] = 7;
        } else if (i2 == 7) {
            if (m41275b(false) == -1) {
                this.f23071S = 17;
                return 17;
            }
            mo32612O();
            this.f23067O--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int b5 = m41275b(true);
        if (b5 == 34) {
            this.f23071S = 9;
            return 9;
        } else if (b5 != 39) {
            if (!(b5 == 44 || b5 == 59)) {
                if (b5 == 91) {
                    this.f23071S = 3;
                    return 3;
                } else if (b5 != 93) {
                    if (b5 != 123) {
                        this.f23067O--;
                        int R = m41268R();
                        if (R != 0) {
                            return R;
                        }
                        int S = m41269S();
                        if (S != 0) {
                            return S;
                        }
                        if (m41273a(this.f23066N[this.f23067O])) {
                            mo32612O();
                            this.f23071S = 10;
                            return 10;
                        }
                        throw m41278c("Expected value");
                    }
                    this.f23071S = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f23071S = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                mo32612O();
                this.f23067O--;
                this.f23071S = 7;
                return 7;
            }
            throw m41278c("Unexpected value");
        } else {
            mo32612O();
            this.f23071S = 8;
            return 8;
        }
    }

    /* renamed from: f */
    public void mo32449f() throws IOException {
        int i = this.f23071S;
        if (i == 0) {
            i = mo32448e();
        }
        if (i == 4) {
            this.f23076X--;
            int[] iArr = this.f23078Z;
            int i2 = this.f23076X - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f23071S = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_ARRAY but was ");
        sb.append(peek());
        sb.append(mo32435F());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: g */
    public void mo32450g() throws IOException {
        int i = this.f23071S;
        if (i == 0) {
            i = mo32448e();
        }
        if (i == 2) {
            this.f23076X--;
            String[] strArr = this.f23077Y;
            int i2 = this.f23076X;
            strArr[i2] = null;
            int[] iArr = this.f23078Z;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f23071S = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_OBJECT but was ");
        sb.append(peek());
        sb.append(mo32435F());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: h */
    public String mo32451h() {
        StringBuilder sb = new StringBuilder();
        sb.append(C14662d0.f42851b);
        int i = this.f23076X;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f23075W[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f23078Z[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f23077Y;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: i */
    public boolean mo32452i() throws IOException {
        int i = this.f23071S;
        if (i == 0) {
            i = mo32448e();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public C8798c peek() throws IOException {
        int i = this.f23071S;
        if (i == 0) {
            i = mo32448e();
        }
        switch (i) {
            case 1:
                return C8798c.BEGIN_OBJECT;
            case 2:
                return C8798c.END_OBJECT;
            case 3:
                return C8798c.BEGIN_ARRAY;
            case 4:
                return C8798c.END_ARRAY;
            case 5:
            case 6:
                return C8798c.BOOLEAN;
            case 7:
                return C8798c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C8798c.STRING;
            case 12:
            case 13:
            case 14:
                return C8798c.NAME;
            case 15:
            case 16:
                return C8798c.NUMBER;
            case 17:
                return C8798c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(mo32435F());
        return sb.toString();
    }

    /* renamed from: a */
    public void mo32444a() throws IOException {
        int i = this.f23071S;
        if (i == 0) {
            i = mo32448e();
        }
        if (i == 3) {
            m41280e(1);
            this.f23078Z[this.f23076X - 1] = 0;
            this.f23071S = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_ARRAY but was ");
        sb.append(peek());
        sb.append(mo32435F());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    private boolean m41273a(char c) throws IOException {
        if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
            if (c != '#') {
                if (c != ',') {
                    if (!(c == '/' || c == '=')) {
                        if (!(c == '{' || c == '}' || c == ':')) {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        break;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
            mo32612O();
        }
        return false;
    }

    /* renamed from: a */
    private boolean m41274a(int i) throws IOException {
        char[] cArr = this.f23066N;
        int i2 = this.f23070R;
        int i3 = this.f23067O;
        this.f23070R = i2 - i3;
        int i4 = this.f23068P;
        if (i4 != i3) {
            this.f23068P = i4 - i3;
            System.arraycopy(cArr, i3, cArr, 0, this.f23068P);
        } else {
            this.f23068P = 0;
        }
        this.f23067O = 0;
        do {
            Reader reader = this.f23079a;
            int i5 = this.f23068P;
            int read = reader.read(cArr, i5, cArr.length - i5);
            if (read == -1) {
                return false;
            }
            this.f23068P += read;
            if (this.f23069Q == 0) {
                int i6 = this.f23070R;
                if (i6 == 0 && this.f23068P > 0 && cArr[0] == 65279) {
                    this.f23067O++;
                    this.f23070R = i6 + 1;
                    i++;
                }
            }
        } while (this.f23068P < i);
        return true;
    }

    /* renamed from: c */
    private IOException m41278c(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(mo32435F());
        throw new MalformedJsonException(sb.toString());
    }

    /* renamed from: b */
    private int m41275b(boolean z) throws IOException {
        char[] cArr = this.f23066N;
        int i = this.f23067O;
        int i2 = this.f23068P;
        while (true) {
            if (i == i2) {
                this.f23067O = i;
                if (m41274a(1)) {
                    i = this.f23067O;
                    i2 = this.f23068P;
                } else if (!z) {
                    return -1;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("End of input");
                    sb.append(mo32435F());
                    throw new EOFException(sb.toString());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f23069Q++;
                this.f23070R = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f23067O = i3;
                    if (i3 == i2) {
                        this.f23067O--;
                        boolean a = m41274a(2);
                        this.f23067O++;
                        if (!a) {
                            return c;
                        }
                    }
                    mo32612O();
                    int i4 = this.f23067O;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f23067O = i4 + 1;
                        if (m41277b("*/")) {
                            i = this.f23067O + 2;
                            i2 = this.f23068P;
                        } else {
                            throw m41278c("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f23067O = i4 + 1;
                        m41271U();
                        i = this.f23067O;
                        i2 = this.f23068P;
                    }
                } else if (c == '#') {
                    this.f23067O = i3;
                    mo32612O();
                    m41271U();
                    i = this.f23067O;
                    i2 = this.f23068P;
                } else {
                    this.f23067O = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: b */
    private boolean m41277b(String str) throws IOException {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f23067O + length > this.f23068P && !m41274a(length)) {
                return false;
            }
            char[] cArr = this.f23066N;
            int i2 = this.f23067O;
            if (cArr[i2] == 10) {
                this.f23069Q++;
                this.f23070R = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f23066N[this.f23067O + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f23067O++;
        }
    }

    /* renamed from: e */
    private void m41280e(int i) {
        int i2 = this.f23076X;
        int[] iArr = this.f23075W;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            int[] iArr3 = new int[(i2 * 2)];
            String[] strArr = new String[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f23078Z, 0, iArr3, 0, this.f23076X);
            System.arraycopy(this.f23077Y, 0, strArr, 0, this.f23076X);
            this.f23075W = iArr2;
            this.f23078Z = iArr3;
            this.f23077Y = strArr;
        }
        int[] iArr4 = this.f23075W;
        int i3 = this.f23076X;
        this.f23076X = i3 + 1;
        iArr4[i3] = i;
    }
}
