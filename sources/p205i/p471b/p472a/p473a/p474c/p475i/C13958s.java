package p205i.p471b.p472a.p473a.p474c.p475i;

import org.jcodec.codecs.mjpeg.JpegConst;

/* renamed from: i.b.a.a.c.i.s */
/* compiled from: MethodWriter */
class C13958s extends C13957r {

    /* renamed from: j4 */
    static final int f40702j4 = 524288;

    /* renamed from: k4 */
    static final int f40703k4 = 0;

    /* renamed from: l4 */
    static final int f40704l4 = 64;

    /* renamed from: m4 */
    static final int f40705m4 = 128;

    /* renamed from: n4 */
    static final int f40706n4 = 247;

    /* renamed from: o4 */
    static final int f40707o4 = 248;

    /* renamed from: p4 */
    static final int f40708p4 = 251;

    /* renamed from: q4 */
    static final int f40709q4 = 252;

    /* renamed from: r4 */
    static final int f40710r4 = 255;

    /* renamed from: s4 */
    static final int f40711s4 = 0;

    /* renamed from: t4 */
    static final int f40712t4 = 1;

    /* renamed from: u4 */
    static final int f40713u4 = 2;

    /* renamed from: v4 */
    static final int f40714v4 = 3;

    /* renamed from: A3 */
    private C13941b[] f40715A3;

    /* renamed from: B3 */
    private C13941b[] f40716B3;

    /* renamed from: C3 */
    private int f40717C3;

    /* renamed from: D3 */
    private C13942c f40718D3;

    /* renamed from: E3 */
    private C13943d f40719E3 = new C13943d();

    /* renamed from: F3 */
    private int f40720F3;

    /* renamed from: G3 */
    private int f40721G3;

    /* renamed from: H3 */
    private int f40722H3;

    /* renamed from: I3 */
    private int f40723I3;

    /* renamed from: J3 */
    private C13943d f40724J3;

    /* renamed from: K3 */
    private int f40725K3;

    /* renamed from: L3 */
    private int[] f40726L3;

    /* renamed from: M3 */
    private int[] f40727M3;

    /* renamed from: N3 */
    private int f40728N3;

    /* renamed from: O3 */
    private C13954o f40729O3;

    /* renamed from: P3 */
    private C13954o f40730P3;

    /* renamed from: Q3 */
    private int f40731Q3;

    /* renamed from: R3 */
    private C13943d f40732R3;

    /* renamed from: S3 */
    private int f40733S3;

    /* renamed from: T3 */
    private C13943d f40734T3;

    /* renamed from: U3 */
    private int f40735U3;

    /* renamed from: V3 */
    private C13943d f40736V3;

    /* renamed from: W3 */
    private int f40737W3;

    /* renamed from: X3 */
    private C13943d f40738X3;

    /* renamed from: Y3 */
    private int f40739Y3;

    /* renamed from: Z3 */
    private C13941b f40740Z3;

    /* renamed from: a4 */
    private C13941b f40741a4;

    /* renamed from: b4 */
    private C13942c f40742b4;

    /* renamed from: c4 */
    private int f40743c4;

    /* renamed from: d4 */
    private final int f40744d4;

    /* renamed from: e4 */
    private C13956q f40745e4;

    /* renamed from: f4 */
    private C13956q f40746f4;

    /* renamed from: g4 */
    private C13956q f40747g4;

    /* renamed from: h4 */
    private int f40748h4;

    /* renamed from: i4 */
    private int f40749i4;

    /* renamed from: l3 */
    final C13946g f40750l3;

    /* renamed from: m3 */
    private int f40751m3;

    /* renamed from: n3 */
    private final int f40752n3;

    /* renamed from: o3 */
    private final int f40753o3;

    /* renamed from: p3 */
    private final String f40754p3;

    /* renamed from: q3 */
    String f40755q3;

    /* renamed from: r3 */
    int f40756r3;

    /* renamed from: s3 */
    int f40757s3;

    /* renamed from: t3 */
    int f40758t3;

    /* renamed from: u3 */
    int[] f40759u3;

    /* renamed from: v3 */
    private C13943d f40760v3;

    /* renamed from: w3 */
    private C13941b f40761w3;

    /* renamed from: x3 */
    private C13941b f40762x3;

    /* renamed from: y3 */
    private C13941b f40763y3;

    /* renamed from: z3 */
    private C13941b f40764z3;

    C13958s(C13946g gVar, int i, String str, String str2, String str3, String[] strArr, int i2) {
        super(327680);
        if (gVar.f40557K == null) {
            gVar.f40557K = this;
        } else {
            gVar.f40558L.f40701k3 = this;
        }
        gVar.f40558L = this;
        this.f40750l3 = gVar;
        this.f40751m3 = i;
        if ("<init>".equals(str)) {
            this.f40751m3 |= 524288;
        }
        this.f40752n3 = gVar.mo44130f(str);
        this.f40753o3 = gVar.mo44130f(str2);
        this.f40754p3 = str2;
        this.f40755q3 = str3;
        if (strArr != null && strArr.length > 0) {
            this.f40758t3 = strArr.length;
            this.f40759u3 = new int[this.f40758t3];
            for (int i3 = 0; i3 < this.f40758t3; i3++) {
                this.f40759u3[i3] = gVar.mo44116b(strArr[i3]);
            }
        }
        this.f40744d4 = i2;
        if (i2 != 3) {
            int b = C13960u.m60140b(this.f40754p3) >> 2;
            if ((i & 8) != 0) {
                b--;
            }
            this.f40721G3 = b;
            this.f40722H3 = b;
            this.f40745e4 = new C13956q();
            C13956q qVar = this.f40745e4;
            qVar.f40689b |= 8;
            mo44180a(qVar);
        }
    }

    /* renamed from: e */
    private void m60095e() {
        if (this.f40726L3 != null) {
            if (this.f40724J3 == null) {
                this.f40724J3 = new C13943d();
            }
            m60099h();
            this.f40723I3++;
        }
        this.f40726L3 = this.f40727M3;
        this.f40727M3 = null;
    }

    /* renamed from: f */
    private void m60097f() {
        if (this.f40744d4 == 0) {
            C13956q qVar = new C13956q();
            qVar.f40696i = new C13952m();
            qVar.f40696i.f40648a = qVar;
            C13943d dVar = this.f40719E3;
            qVar.mo44164a(this, dVar.f40485b, dVar.f40484a);
            this.f40746f4.f40697j = qVar;
            this.f40746f4 = qVar;
        } else {
            this.f40747g4.f40695h = this.f40749i4;
        }
        if (this.f40744d4 != 1) {
            this.f40747g4 = null;
        }
    }

    /* renamed from: g */
    private void m60098g() {
        int i;
        int i2;
        int i3;
        int i4;
        int a = m60090a(0, this.f40754p3.length() + 1, 0);
        int i5 = this.f40751m3;
        if ((i5 & 8) != 0) {
            i = a;
        } else if ((i5 & 524288) == 0) {
            int[] iArr = this.f40727M3;
            i = a + 1;
            C13946g gVar = this.f40750l3;
            iArr[a] = gVar.mo44108a(gVar.f40575q) | 24117248;
        } else {
            i = a + 1;
            this.f40727M3[a] = 6;
        }
        int i6 = 1;
        while (true) {
            int i7 = i6 + 1;
            char charAt = this.f40754p3.charAt(i6);
            if (charAt == 'F') {
                i2 = i + 1;
                this.f40727M3[i] = 2;
            } else if (charAt != 'L') {
                if (!(charAt == 'S' || charAt == 'I')) {
                    if (charAt == 'J') {
                        i2 = i + 1;
                        this.f40727M3[i] = 4;
                    } else if (charAt != 'Z') {
                        if (charAt != '[') {
                            switch (charAt) {
                                case 'B':
                                case 'C':
                                    break;
                                case 'D':
                                    i4 = i + 1;
                                    this.f40727M3[i] = 3;
                                    break;
                                default:
                                    this.f40727M3[1] = i - 3;
                                    m60095e();
                                    return;
                            }
                        } else {
                            while (this.f40754p3.charAt(i7) == '[') {
                                i7++;
                            }
                            if (this.f40754p3.charAt(i7) == 'L') {
                                do {
                                    i7++;
                                } while (this.f40754p3.charAt(i7) != ';');
                            }
                            i4 = i + 1;
                            i7++;
                            this.f40727M3[i] = this.f40750l3.mo44108a(this.f40754p3.substring(i6, i7)) | 24117248;
                        }
                        i6 = i7;
                        i3 = i4;
                    }
                }
                i2 = i + 1;
                this.f40727M3[i] = 1;
            } else {
                int i8 = i7;
                while (this.f40754p3.charAt(i8) != ';') {
                    i8++;
                }
                int i9 = i + 1;
                int i10 = i8 + 1;
                this.f40727M3[i] = this.f40750l3.mo44108a(this.f40754p3.substring(i7, i8)) | 24117248;
                i3 = i9;
                i6 = i10;
            }
            i3 = i2;
            i6 = i7;
        }
    }

    /* renamed from: h */
    private void m60099h() {
        int i;
        int i2;
        char c;
        char c2;
        int[] iArr = this.f40727M3;
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = 0;
        if ((this.f40750l3.f40562d & 65535) < 50) {
            this.f40724J3.mo44074c(iArr[0]).mo44074c(i3);
            int i6 = i3 + 3;
            m60096e(3, i6);
            this.f40724J3.mo44074c(i4);
            m60096e(i6, i4 + i6);
            return;
        }
        int[] iArr2 = this.f40726L3;
        int i7 = iArr2[1];
        if (this.f40723I3 == 0) {
            i = iArr[0];
        } else {
            i = (iArr[0] - iArr2[0]) - 1;
        }
        if (i4 == 0) {
            int i8 = i3 - i7;
            switch (i8) {
                case -3:
                case -2:
                case -1:
                    i7 = i3;
                    c2 = 248;
                    break;
                case 0:
                    if (i >= 64) {
                        c2 = 251;
                        break;
                    } else {
                        c2 = 0;
                        break;
                    }
                case 1:
                case 2:
                case 3:
                    c2 = 252;
                    break;
                default:
                    c2 = 255;
                    break;
            }
            char c3 = c2;
            i2 = i8;
            c = c3;
        } else {
            c = (i3 == i7 && i4 == 1) ? i < 63 ? '@' : 247 : 255;
            i2 = 0;
        }
        if (c != 255) {
            int i9 = 3;
            while (true) {
                if (i5 < i7) {
                    if (this.f40727M3[i9] != this.f40726L3[i9]) {
                        c = 255;
                    } else {
                        i9++;
                        i5++;
                    }
                }
            }
        }
        if (c == 0) {
            this.f40724J3.mo44066a(i);
        } else if (c == '@') {
            this.f40724J3.mo44066a(i + 64);
            m60096e(i3 + 3, i3 + 4);
        } else if (c == f40706n4) {
            this.f40724J3.mo44066a((int) f40706n4).mo44074c(i);
            m60096e(i3 + 3, i3 + 4);
        } else if (c == f40707o4) {
            this.f40724J3.mo44066a(i2 + f40708p4).mo44074c(i);
        } else if (c == f40708p4) {
            this.f40724J3.mo44066a((int) f40708p4).mo44074c(i);
        } else if (c != f40709q4) {
            this.f40724J3.mo44066a(255).mo44074c(i).mo44074c(i3);
            int i10 = i3 + 3;
            m60096e(3, i10);
            this.f40724J3.mo44074c(i4);
            m60096e(i10, i4 + i10);
        } else {
            this.f40724J3.mo44066a(i2 + f40708p4).mo44074c(i);
            m60096e(i7 + 3, i3 + 3);
        }
    }

    /* renamed from: a */
    public C13940a mo44167a() {
        this.f40760v3 = new C13943d();
        C13941b bVar = new C13941b(this.f40750l3, false, this.f40760v3, null, 0);
        return bVar;
    }

    /* renamed from: b */
    public void mo44188b() {
    }

    /* renamed from: b */
    public void mo44193b(String str, int i) {
        if (this.f40732R3 == null) {
            this.f40732R3 = new C13943d();
        }
        this.f40731Q3++;
        this.f40732R3.mo44074c(str == null ? 0 : this.f40750l3.mo44130f(str)).mo44074c(i);
    }

    /* renamed from: c */
    public C13940a mo44194c(int i, C13961v vVar, String str, boolean z) {
        C13943d dVar = new C13943d();
        C13941b.m59893a(i, vVar, dVar);
        dVar.mo44074c(this.f40750l3.mo44130f(str)).mo44074c(0);
        C13941b bVar = new C13941b(this.f40750l3, true, dVar, dVar, dVar.f40485b - 2);
        if (z) {
            bVar.f40479i = this.f40763y3;
            this.f40763y3 = bVar;
        } else {
            bVar.f40479i = this.f40764z3;
            this.f40764z3 = bVar;
        }
        return bVar;
    }

    /* renamed from: c */
    public void mo44195c() {
    }

    /* renamed from: d */
    public void mo44197d(int i, int i2) {
        this.f40739Y3 = this.f40719E3.f40485b;
        C13956q qVar = this.f40747g4;
        if (qVar != null) {
            int i3 = this.f40744d4;
            if (i3 == 0 || i3 == 1) {
                this.f40747g4.f40696i.mo44131a(i, i2, (C13946g) null, (C13955p) null);
            } else if (i == 169) {
                qVar.f40689b |= 256;
                qVar.f40694g = this.f40748h4;
                m60097f();
            } else {
                int i4 = this.f40748h4 + C13952m.f40629G[i];
                if (i4 > this.f40749i4) {
                    this.f40749i4 = i4;
                }
                this.f40748h4 = i4;
            }
        }
        if (this.f40744d4 != 3) {
            int i5 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
            if (i5 > this.f40721G3) {
                this.f40721G3 = i5;
            }
        }
        if (i2 < 4 && i != 169) {
            this.f40719E3.mo44066a((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
        } else if (i2 >= 256) {
            this.f40719E3.mo44066a((int) JpegConst.DHT).mo44073b(i, i2);
        } else {
            this.f40719E3.mo44067a(i, i2);
        }
        if (i >= 54 && this.f40744d4 == 0 && this.f40728N3 > 0) {
            mo44180a(new C13956q());
        }
    }

    /* renamed from: a */
    public C13940a mo44171a(String str, boolean z) {
        C13943d dVar = new C13943d();
        dVar.mo44074c(this.f40750l3.mo44130f(str)).mo44074c(0);
        C13941b bVar = new C13941b(this.f40750l3, true, dVar, dVar, 2);
        if (z) {
            bVar.f40479i = this.f40761w3;
            this.f40761w3 = bVar;
        } else {
            bVar.f40479i = this.f40762x3;
            this.f40762x3 = bVar;
        }
        return bVar;
    }

    /* renamed from: b */
    public void mo44189b(int i) {
        C13943d dVar = this.f40719E3;
        this.f40739Y3 = dVar.f40485b;
        dVar.mo44066a(i);
        if (this.f40747g4 != null) {
            int i2 = this.f40744d4;
            if (i2 == 0 || i2 == 1) {
                this.f40747g4.f40696i.mo44131a(i, 0, (C13946g) null, (C13955p) null);
            } else {
                int i3 = this.f40748h4 + C13952m.f40629G[i];
                if (i3 > this.f40749i4) {
                    this.f40749i4 = i3;
                }
                this.f40748h4 = i3;
            }
            if ((i >= 172 && i <= 177) || i == 191) {
                m60097f();
            }
        }
    }

    /* renamed from: e */
    private void m60096e(int i, int i2) {
        while (i < i2) {
            int i3 = this.f40727M3[i];
            int i4 = -268435456 & i3;
            if (i4 == 0) {
                int i5 = i3 & 1048575;
                int i6 = i3 & 267386880;
                if (i6 == 24117248) {
                    C13943d a = this.f40724J3.mo44066a(7);
                    C13946g gVar = this.f40750l3;
                    a.mo44074c(gVar.mo44116b(gVar.f40571m[i5].f40671e));
                } else if (i6 != 25165824) {
                    this.f40724J3.mo44066a(i5);
                } else {
                    this.f40724J3.mo44066a(8).mo44074c(this.f40750l3.f40571m[i5].f40669c);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                int i7 = i4 >> 28;
                while (true) {
                    int i8 = i7 - 1;
                    if (i7 <= 0) {
                        break;
                    }
                    sb.append('[');
                    i7 = i8;
                }
                if ((i3 & 267386880) == 24117248) {
                    sb.append('L');
                    sb.append(this.f40750l3.f40571m[i3 & 1048575].f40671e);
                    sb.append(';');
                } else {
                    int i9 = i3 & 15;
                    if (i9 == 1) {
                        sb.append('I');
                    } else if (i9 == 2) {
                        sb.append('F');
                    } else if (i9 != 3) {
                        switch (i9) {
                            case 9:
                                sb.append('Z');
                                break;
                            case 10:
                                sb.append('B');
                                break;
                            case 11:
                                sb.append('C');
                                break;
                            case 12:
                                sb.append('S');
                                break;
                            default:
                                sb.append('J');
                                break;
                        }
                    } else {
                        sb.append('D');
                    }
                }
                this.f40724J3.mo44066a(7).mo44074c(this.f40750l3.mo44116b(sb.toString()));
            }
            i++;
        }
    }

    /* renamed from: c */
    public void mo44196c(int i, int i2) {
        String str;
        int i3 = this.f40744d4;
        int i4 = 0;
        if (i3 == 0) {
            C13954o oVar = this.f40729O3;
            while (true) {
                str = "java/lang/Throwable";
                if (oVar == null) {
                    break;
                }
                C13956q a = oVar.f40663c.mo44158a();
                C13956q a2 = oVar.f40662b.mo44158a();
                String str2 = oVar.f40664d;
                if (str2 != null) {
                    str = str2;
                }
                int a3 = 24117248 | this.f40750l3.mo44108a(str);
                a.f40689b |= 16;
                for (C13956q a4 = oVar.f40661a.mo44158a(); a4 != a2; a4 = a4.f40697j) {
                    C13949j jVar = new C13949j();
                    jVar.f40607a = a3;
                    jVar.f40608b = a;
                    jVar.f40609c = a4.f40698k;
                    a4.f40698k = jVar;
                }
                oVar = oVar.f40666f;
            }
            C13952m mVar = this.f40745e4.f40696i;
            mVar.mo44138a(this.f40750l3, this.f40751m3, C13960u.m60138a(this.f40754p3), this.f40721G3);
            m60091a(mVar);
            C13956q qVar = this.f40745e4;
            int i5 = 0;
            while (qVar != null) {
                C13956q qVar2 = qVar.f40699l;
                qVar.f40699l = null;
                C13952m mVar2 = qVar.f40696i;
                int i6 = qVar.f40689b;
                if ((i6 & 16) != 0) {
                    qVar.f40689b = i6 | 32;
                }
                qVar.f40689b |= 64;
                int length = mVar2.f40650c.length + qVar.f40695h;
                if (length > i5) {
                    i5 = length;
                }
                for (C13949j jVar2 = qVar.f40698k; jVar2 != null; jVar2 = jVar2.f40609c) {
                    C13956q a5 = jVar2.f40608b.mo44158a();
                    if (mVar2.mo44141a(this.f40750l3, a5.f40696i, jVar2.f40607a) && a5.f40699l == null) {
                        a5.f40699l = qVar2;
                        qVar2 = a5;
                    }
                }
                qVar = qVar2;
            }
            for (C13956q qVar3 = this.f40745e4; qVar3 != null; qVar3 = qVar3.f40697j) {
                C13952m mVar3 = qVar3.f40696i;
                if ((qVar3.f40689b & 32) != 0) {
                    m60091a(mVar3);
                }
                if ((qVar3.f40689b & 64) == 0) {
                    C13956q qVar4 = qVar3.f40697j;
                    int i7 = qVar3.f40691d;
                    int i8 = (qVar4 == null ? this.f40719E3.f40485b : qVar4.f40691d) - 1;
                    if (i8 >= i7) {
                        i5 = Math.max(i5, 1);
                        for (int i9 = i7; i9 < i8; i9++) {
                            this.f40719E3.f40484a[i9] = 0;
                        }
                        this.f40719E3.f40484a[i8] = -65;
                        this.f40727M3[m60090a(i7, 0, 1)] = this.f40750l3.mo44108a(str) | 24117248;
                        m60095e();
                        this.f40729O3 = C13954o.m60041a(this.f40729O3, qVar3, qVar4);
                    }
                }
            }
            this.f40728N3 = 0;
            for (C13954o oVar2 = this.f40729O3; oVar2 != null; oVar2 = oVar2.f40666f) {
                this.f40728N3++;
            }
            this.f40720F3 = i5;
        } else if (i3 == 2) {
            for (C13954o oVar3 = this.f40729O3; oVar3 != null; oVar3 = oVar3.f40666f) {
                C13956q qVar5 = oVar3.f40663c;
                C13956q qVar6 = oVar3.f40662b;
                for (C13956q qVar7 = oVar3.f40661a; qVar7 != qVar6; qVar7 = qVar7.f40697j) {
                    C13949j jVar3 = new C13949j();
                    jVar3.f40607a = Integer.MAX_VALUE;
                    jVar3.f40608b = qVar5;
                    if ((qVar7.f40689b & 128) == 0) {
                        jVar3.f40609c = qVar7.f40698k;
                        qVar7.f40698k = jVar3;
                    } else {
                        C13949j jVar4 = qVar7.f40698k;
                        jVar3.f40609c = jVar4.f40609c.f40609c;
                        jVar4.f40609c.f40609c = jVar3;
                    }
                }
            }
            int i10 = this.f40743c4;
            if (i10 > 0) {
                this.f40745e4.mo44160a((C13956q) null, 1, i10);
                int i11 = 0;
                for (C13956q qVar8 = this.f40745e4; qVar8 != null; qVar8 = qVar8.f40697j) {
                    if ((qVar8.f40689b & 128) != 0) {
                        C13956q qVar9 = qVar8.f40698k.f40609c.f40608b;
                        if ((qVar9.f40689b & 1024) == 0) {
                            i11++;
                            qVar9.mo44160a((C13956q) null, ((((long) i11) / 32) << 32) | (1 << (i11 % 32)), this.f40743c4);
                        }
                    }
                }
                for (C13956q qVar10 = this.f40745e4; qVar10 != null; qVar10 = qVar10.f40697j) {
                    if ((qVar10.f40689b & 128) != 0) {
                        C13956q qVar11 = this.f40745e4;
                        while (qVar11 != null) {
                            qVar11.f40689b &= -2049;
                            qVar11 = qVar11.f40697j;
                        }
                        qVar10.f40698k.f40609c.f40608b.mo44160a(qVar10, 0, this.f40743c4);
                    }
                }
            }
            C13956q qVar12 = this.f40745e4;
            while (qVar12 != null) {
                C13956q qVar13 = qVar12.f40699l;
                int i12 = qVar12.f40694g;
                int i13 = qVar12.f40695h + i12;
                if (i13 > i4) {
                    i4 = i13;
                }
                C13949j jVar5 = qVar12.f40698k;
                if ((qVar12.f40689b & 128) != 0) {
                    jVar5 = jVar5.f40609c;
                }
                qVar12 = qVar13;
                while (jVar5 != null) {
                    C13956q qVar14 = jVar5.f40608b;
                    if ((qVar14.f40689b & 8) == 0) {
                        int i14 = jVar5.f40607a;
                        qVar14.f40694g = i14 == Integer.MAX_VALUE ? 1 : i14 + i12;
                        qVar14.f40689b |= 8;
                        qVar14.f40699l = qVar12;
                        qVar12 = qVar14;
                    }
                    jVar5 = jVar5.f40609c;
                }
            }
            this.f40720F3 = Math.max(i, i4);
        } else {
            this.f40720F3 = i;
            this.f40721G3 = i2;
        }
    }

    /* renamed from: a */
    public C13940a mo44170a(int i, String str, boolean z) {
        C13943d dVar = new C13943d();
        if ("Ljava/lang/Synthetic;".equals(str)) {
            this.f40717C3 = Math.max(this.f40717C3, i + 1);
            C13941b bVar = new C13941b(this.f40750l3, false, dVar, null, 0);
            return bVar;
        }
        dVar.mo44074c(this.f40750l3.mo44130f(str)).mo44074c(0);
        C13941b bVar2 = new C13941b(this.f40750l3, true, dVar, dVar, 2);
        if (z) {
            if (this.f40715A3 == null) {
                this.f40715A3 = new C13941b[C13960u.m60138a(this.f40754p3).length];
            }
            C13941b[] bVarArr = this.f40715A3;
            bVar2.f40479i = bVarArr[i];
            bVarArr[i] = bVar2;
        } else {
            if (this.f40716B3 == null) {
                this.f40716B3 = new C13941b[C13960u.m60138a(this.f40754p3).length];
            }
            C13941b[] bVarArr2 = this.f40716B3;
            bVar2.f40479i = bVarArr2[i];
            bVarArr2[i] = bVar2;
        }
        return bVar2;
    }

    /* renamed from: b */
    public void mo44190b(int i, int i2) {
        this.f40739Y3 = this.f40719E3.f40485b;
        if (this.f40747g4 != null) {
            int i3 = this.f40744d4;
            if (i3 == 0 || i3 == 1) {
                this.f40747g4.f40696i.mo44131a(i, i2, (C13946g) null, (C13955p) null);
            } else if (i != 188) {
                int i4 = this.f40748h4 + 1;
                if (i4 > this.f40749i4) {
                    this.f40749i4 = i4;
                }
                this.f40748h4 = i4;
            }
        }
        if (i == 17) {
            this.f40719E3.mo44073b(i, i2);
        } else {
            this.f40719E3.mo44067a(i, i2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo44199d() {
        int i;
        if (this.f40756r3 != 0) {
            return this.f40757s3 + 6;
        }
        int i2 = this.f40719E3.f40485b;
        String str = "RuntimeInvisibleTypeAnnotations";
        String str2 = "RuntimeVisibleTypeAnnotations";
        if (i2 <= 0) {
            i = 8;
        } else if (i2 <= 65535) {
            this.f40750l3.mo44130f("Code");
            i = this.f40719E3.f40485b + 18 + (this.f40728N3 * 8) + 8;
            if (this.f40734T3 != null) {
                this.f40750l3.mo44130f("LocalVariableTable");
                i += this.f40734T3.f40485b + 8;
            }
            if (this.f40736V3 != null) {
                this.f40750l3.mo44130f("LocalVariableTypeTable");
                i += this.f40736V3.f40485b + 8;
            }
            if (this.f40738X3 != null) {
                this.f40750l3.mo44130f("LineNumberTable");
                i += this.f40738X3.f40485b + 8;
            }
            if (this.f40724J3 != null) {
                this.f40750l3.mo44130f((this.f40750l3.f40562d & 65535) >= 50 ? "StackMapTable" : "StackMap");
                i += this.f40724J3.f40485b + 8;
            }
            if (this.f40740Z3 != null) {
                this.f40750l3.mo44130f(str2);
                i += this.f40740Z3.mo44057b() + 8;
            }
            if (this.f40741a4 != null) {
                this.f40750l3.mo44130f(str);
                i += this.f40741a4.mo44057b() + 8;
            }
            C13942c cVar = this.f40742b4;
            if (cVar != null) {
                C13946g gVar = this.f40750l3;
                C13943d dVar = this.f40719E3;
                i += cVar.mo44059a(gVar, dVar.f40484a, dVar.f40485b, this.f40720F3, this.f40721G3);
            }
        } else {
            throw new RuntimeException("Method code too large!");
        }
        if (this.f40758t3 > 0) {
            this.f40750l3.mo44130f("Exceptions");
            i += (this.f40758t3 * 2) + 8;
        }
        int i3 = this.f40751m3;
        if ((i3 & 4096) != 0 && ((65535 & this.f40750l3.f40562d) < 49 || (262144 & i3) != 0)) {
            this.f40750l3.mo44130f("Synthetic");
            i += 6;
        }
        if ((this.f40751m3 & 131072) != 0) {
            this.f40750l3.mo44130f("Deprecated");
            i += 6;
        }
        if (this.f40755q3 != null) {
            this.f40750l3.mo44130f("Signature");
            this.f40750l3.mo44130f(this.f40755q3);
            i += 8;
        }
        if (this.f40732R3 != null) {
            this.f40750l3.mo44130f("MethodParameters");
            i += this.f40732R3.f40485b + 7;
        }
        if (this.f40760v3 != null) {
            this.f40750l3.mo44130f("AnnotationDefault");
            i += this.f40760v3.f40485b + 6;
        }
        if (this.f40761w3 != null) {
            this.f40750l3.mo44130f("RuntimeVisibleAnnotations");
            i += this.f40761w3.mo44057b() + 8;
        }
        if (this.f40762x3 != null) {
            this.f40750l3.mo44130f("RuntimeInvisibleAnnotations");
            i += this.f40762x3.mo44057b() + 8;
        }
        if (this.f40763y3 != null) {
            this.f40750l3.mo44130f(str2);
            i += this.f40763y3.mo44057b() + 8;
        }
        if (this.f40764z3 != null) {
            this.f40750l3.mo44130f(str);
            i += this.f40764z3.mo44057b() + 8;
        }
        if (this.f40715A3 != null) {
            this.f40750l3.mo44130f("RuntimeVisibleParameterAnnotations");
            C13941b[] bVarArr = this.f40715A3;
            int length = i + ((bVarArr.length - this.f40717C3) * 2) + 7;
            for (int length2 = bVarArr.length - 1; length2 >= this.f40717C3; length2--) {
                C13941b[] bVarArr2 = this.f40715A3;
                length = i + (bVarArr2[length2] == null ? 0 : bVarArr2[length2].mo44057b());
            }
        }
        if (this.f40716B3 != null) {
            this.f40750l3.mo44130f("RuntimeInvisibleParameterAnnotations");
            C13941b[] bVarArr3 = this.f40716B3;
            int length3 = i + ((bVarArr3.length - this.f40717C3) * 2) + 7;
            for (int length4 = bVarArr3.length - 1; length4 >= this.f40717C3; length4--) {
                C13941b[] bVarArr4 = this.f40716B3;
                length3 = i + (bVarArr4[length4] == null ? 0 : bVarArr4[length4].mo44057b());
            }
        }
        C13942c cVar2 = this.f40718D3;
        if (cVar2 != null) {
            i += cVar2.mo44059a(this.f40750l3, null, 0, -1, -1);
        }
        return i;
    }

    /* renamed from: a */
    public void mo44179a(C13942c cVar) {
        if (cVar.mo44064c()) {
            cVar.f40483c = this.f40742b4;
            this.f40742b4 = cVar;
            return;
        }
        cVar.f40483c = this.f40718D3;
        this.f40718D3 = cVar;
    }

    /* renamed from: b */
    public C13940a mo44187b(int i, C13961v vVar, String str, boolean z) {
        C13943d dVar = new C13943d();
        C13941b.m59893a(i, vVar, dVar);
        dVar.mo44074c(this.f40750l3.mo44130f(str)).mo44074c(0);
        C13941b bVar = new C13941b(this.f40750l3, true, dVar, dVar, dVar.f40485b - 2);
        if (z) {
            bVar.f40479i = this.f40740Z3;
            this.f40740Z3 = bVar;
        } else {
            bVar.f40479i = this.f40741a4;
            this.f40741a4 = bVar;
        }
        return bVar;
    }

    /* renamed from: a */
    public void mo44174a(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        int i4;
        String str;
        int i5;
        int i6;
        int i7 = this.f40744d4;
        if (i7 != 0) {
            if (i7 == 1) {
                C13956q qVar = this.f40747g4;
                C13952m mVar = qVar.f40696i;
                if (mVar == null) {
                    qVar.f40696i = new C13948i();
                    C13956q qVar2 = this.f40747g4;
                    C13952m mVar2 = qVar2.f40696i;
                    mVar2.f40648a = qVar2;
                    mVar2.mo44138a(this.f40750l3, this.f40751m3, C13960u.m60138a(this.f40754p3), i2);
                    m60098g();
                } else {
                    if (i == -1) {
                        mVar.mo44139a(this.f40750l3, i2, objArr, i3, objArr2);
                    }
                    m60091a(this.f40747g4.f40696i);
                }
            } else {
                int i8 = 0;
                if (i == -1) {
                    if (this.f40726L3 == null) {
                        m60098g();
                    }
                    this.f40722H3 = i2;
                    int a = m60090a(this.f40719E3.f40485b, i2, i3);
                    int i9 = 0;
                    while (true) {
                        str = "";
                        if (i9 >= i2) {
                            break;
                        }
                        if (objArr[i9] instanceof String) {
                            i6 = a + 1;
                            this.f40727M3[a] = 24117248 | this.f40750l3.mo44108a(objArr[i9]);
                        } else if (objArr[i9] instanceof Integer) {
                            i6 = a + 1;
                            this.f40727M3[a] = objArr[i9].intValue();
                        } else {
                            int i10 = a + 1;
                            this.f40727M3[a] = this.f40750l3.mo44109a(str, objArr[i9].f40691d) | 25165824;
                            a = i10;
                            i9++;
                        }
                        a = i6;
                        i9++;
                    }
                    while (i8 < i3) {
                        if (objArr2[i8] instanceof String) {
                            i5 = a + 1;
                            this.f40727M3[a] = this.f40750l3.mo44108a(objArr2[i8]) | 24117248;
                        } else if (objArr2[i8] instanceof Integer) {
                            i5 = a + 1;
                            this.f40727M3[a] = objArr2[i8].intValue();
                        } else {
                            i5 = a + 1;
                            this.f40727M3[a] = this.f40750l3.mo44109a(str, objArr2[i8].f40691d) | 25165824;
                        }
                        a = i5;
                        i8++;
                    }
                    m60095e();
                } else {
                    if (this.f40724J3 == null) {
                        this.f40724J3 = new C13943d();
                        i4 = this.f40719E3.f40485b;
                    } else {
                        i4 = (this.f40719E3.f40485b - this.f40725K3) - 1;
                        if (i4 < 0) {
                            if (i != 3) {
                                throw new IllegalStateException();
                            }
                            return;
                        }
                    }
                    if (i == 0) {
                        this.f40722H3 = i2;
                        this.f40724J3.mo44066a(255).mo44074c(i4).mo44074c(i2);
                        for (int i11 = 0; i11 < i2; i11++) {
                            m60093b(objArr[i11]);
                        }
                        this.f40724J3.mo44074c(i3);
                        while (i8 < i3) {
                            m60093b(objArr2[i8]);
                            i8++;
                        }
                    } else if (i == 1) {
                        this.f40722H3 += i2;
                        this.f40724J3.mo44066a(i2 + f40708p4).mo44074c(i4);
                        while (i8 < i2) {
                            m60093b(objArr[i8]);
                            i8++;
                        }
                    } else if (i == 2) {
                        this.f40722H3 -= i2;
                        this.f40724J3.mo44066a(f40708p4 - i2).mo44074c(i4);
                    } else if (i != 3) {
                        if (i == 4) {
                            if (i4 < 64) {
                                this.f40724J3.mo44066a(i4 + 64);
                            } else {
                                this.f40724J3.mo44066a((int) f40706n4).mo44074c(i4);
                            }
                            m60093b(objArr2[0]);
                        }
                    } else if (i4 < 64) {
                        this.f40724J3.mo44066a(i4);
                    } else {
                        this.f40724J3.mo44066a((int) f40708p4).mo44074c(i4);
                    }
                    this.f40725K3 = this.f40719E3.f40485b;
                    this.f40723I3++;
                }
            }
            this.f40720F3 = Math.max(this.f40720F3, i3);
            this.f40721G3 = Math.max(this.f40721G3, this.f40722H3);
        }
    }

    /* renamed from: b */
    public void mo44191b(int i, C13956q qVar) {
        if (this.f40738X3 == null) {
            this.f40738X3 = new C13943d();
        }
        this.f40737W3++;
        this.f40738X3.mo44074c(qVar.f40691d);
        this.f40738X3.mo44074c(i);
    }

    /* renamed from: b */
    private void m60093b(Object obj) {
        if (obj instanceof String) {
            this.f40724J3.mo44066a(7).mo44074c(this.f40750l3.mo44116b((String) obj));
        } else if (obj instanceof Integer) {
            this.f40724J3.mo44066a(((Integer) obj).intValue());
        } else {
            this.f40724J3.mo44066a(8).mo44074c(((C13956q) obj).f40691d);
        }
    }

    /* renamed from: a */
    public void mo44176a(int i, String str) {
        this.f40739Y3 = this.f40719E3.f40485b;
        C13955p c = this.f40750l3.mo44124c(str);
        if (this.f40747g4 != null) {
            int i2 = this.f40744d4;
            if (i2 == 0 || i2 == 1) {
                this.f40747g4.f40696i.mo44131a(i, this.f40719E3.f40485b, this.f40750l3, c);
            } else if (i == 187) {
                int i3 = this.f40748h4 + 1;
                if (i3 > this.f40749i4) {
                    this.f40749i4 = i3;
                }
                this.f40748h4 = i3;
            }
        }
        this.f40719E3.mo44073b(i, c.f40667a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        r8 = r8 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004b, code lost:
        if (r8 <= r4.f40749i4) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        r4.f40749i4 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
        r4.f40748h4 = r8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44177a(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            i.b.a.a.c.i.d r0 = r4.f40719E3
            int r0 = r0.f40485b
            r4.f40739Y3 = r0
            i.b.a.a.c.i.g r0 = r4.f40750l3
            i.b.a.a.c.i.p r6 = r0.mo44125c(r6, r7, r8)
            i.b.a.a.c.i.q r7 = r4.f40747g4
            if (r7 == 0) goto L_0x005b
            int r7 = r4.f40744d4
            r0 = 0
            if (r7 == 0) goto L_0x0052
            r1 = 1
            if (r7 != r1) goto L_0x0019
            goto L_0x0052
        L_0x0019:
            char r7 = r8.charAt(r0)
            r8 = -2
            r2 = 74
            r3 = 68
            switch(r5) {
                case 178: goto L_0x003e;
                case 179: goto L_0x0035;
                case 180: goto L_0x002c;
                default: goto L_0x0025;
            }
        L_0x0025:
            int r0 = r4.f40748h4
            if (r7 == r3) goto L_0x0047
            if (r7 != r2) goto L_0x0048
            goto L_0x0047
        L_0x002c:
            int r8 = r4.f40748h4
            if (r7 == r3) goto L_0x0032
            if (r7 != r2) goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            int r8 = r8 + r0
            goto L_0x0049
        L_0x0035:
            int r0 = r4.f40748h4
            if (r7 == r3) goto L_0x0048
            if (r7 != r2) goto L_0x003c
            goto L_0x0048
        L_0x003c:
            r8 = -1
            goto L_0x0048
        L_0x003e:
            int r8 = r4.f40748h4
            if (r7 == r3) goto L_0x0044
            if (r7 != r2) goto L_0x0045
        L_0x0044:
            r1 = 2
        L_0x0045:
            int r8 = r8 + r1
            goto L_0x0049
        L_0x0047:
            r8 = -3
        L_0x0048:
            int r8 = r8 + r0
        L_0x0049:
            int r7 = r4.f40749i4
            if (r8 <= r7) goto L_0x004f
            r4.f40749i4 = r8
        L_0x004f:
            r4.f40748h4 = r8
            goto L_0x005b
        L_0x0052:
            i.b.a.a.c.i.q r7 = r4.f40747g4
            i.b.a.a.c.i.m r7 = r7.f40696i
            i.b.a.a.c.i.g r8 = r4.f40750l3
            r7.mo44131a(r5, r0, r8, r6)
        L_0x005b:
            i.b.a.a.c.i.d r7 = r4.f40719E3
            int r6 = r6.f40667a
            r7.mo44073b(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p471b.p472a.p473a.p474c.p475i.C13958s.mo44177a(int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo44178a(int i, String str, String str2, String str3, boolean z) {
        int i2;
        this.f40739Y3 = this.f40719E3.f40485b;
        C13955p b = this.f40750l3.mo44121b(str, str2, str3, z);
        int i3 = b.f40669c;
        if (this.f40747g4 != null) {
            int i4 = this.f40744d4;
            if (i4 == 0 || i4 == 1) {
                this.f40747g4.f40696i.mo44131a(i, 0, this.f40750l3, b);
            } else {
                if (i3 == 0) {
                    i3 = C13960u.m60140b(str3);
                    b.f40669c = i3;
                }
                if (i == 184) {
                    i2 = (this.f40748h4 - (i3 >> 2)) + (i3 & 3) + 1;
                } else {
                    i2 = (this.f40748h4 - (i3 >> 2)) + (i3 & 3);
                }
                if (i2 > this.f40749i4) {
                    this.f40749i4 = i2;
                }
                this.f40748h4 = i2;
            }
        }
        if (i == 185) {
            if (i3 == 0) {
                i3 = C13960u.m60140b(str3);
                b.f40669c = i3;
            }
            this.f40719E3.mo44073b(C13959t.f40852V2, b.f40667a).mo44067a(i3 >> 2, 0);
            return;
        }
        this.f40719E3.mo44073b(i, b.f40667a);
    }

    /* renamed from: c */
    private void m60094c(int i, C13956q qVar) {
        C13949j jVar = new C13949j();
        jVar.f40607a = i;
        jVar.f40608b = qVar;
        C13956q qVar2 = this.f40747g4;
        jVar.f40609c = qVar2.f40698k;
        qVar2.f40698k = jVar;
    }

    /* renamed from: a */
    public void mo44185a(String str, String str2, C13953n nVar, Object... objArr) {
        this.f40739Y3 = this.f40719E3.f40485b;
        C13955p b = this.f40750l3.mo44120b(str, str2, nVar, objArr);
        int i = b.f40669c;
        if (this.f40747g4 != null) {
            int i2 = this.f40744d4;
            if (i2 == 0 || i2 == 1) {
                this.f40747g4.f40696i.mo44131a((int) C13959t.f40856W2, 0, this.f40750l3, b);
            } else {
                if (i == 0) {
                    i = C13960u.m60140b(str2);
                    b.f40669c = i;
                }
                int i3 = (this.f40748h4 - (i >> 2)) + (i & 3) + 1;
                if (i3 > this.f40749i4) {
                    this.f40749i4 = i3;
                }
                this.f40748h4 = i3;
            }
        }
        this.f40719E3.mo44073b(C13959t.f40856W2, b.f40667a);
        this.f40719E3.mo44074c(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44175a(int r11, p205i.p471b.p472a.p473a.p474c.p475i.C13956q r12) {
        /*
            r10 = this;
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 0
            r2 = 1
            if (r11 < r0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            if (r3 == 0) goto L_0x000d
            int r11 = r11 + -33
        L_0x000d:
            i.b.a.a.c.i.d r4 = r10.f40719E3
            int r4 = r4.f40485b
            r10.f40739Y3 = r4
            i.b.a.a.c.i.q r4 = r10.f40747g4
            r5 = 168(0xa8, float:2.35E-43)
            r6 = 167(0xa7, float:2.34E-43)
            r7 = 0
            if (r4 == 0) goto L_0x0075
            int r8 = r10.f40744d4
            if (r8 != 0) goto L_0x003a
            i.b.a.a.c.i.m r4 = r4.f40696i
            r4.mo44131a(r11, r1, r7, r7)
            i.b.a.a.c.i.q r4 = r12.mo44158a()
            int r8 = r4.f40689b
            r8 = r8 | 16
            r4.f40689b = r8
            r10.m60094c(r1, r12)
            if (r11 == r6) goto L_0x0075
            i.b.a.a.c.i.q r7 = new i.b.a.a.c.i.q
            r7.<init>()
            goto L_0x0075
        L_0x003a:
            if (r8 != r2) goto L_0x0042
            i.b.a.a.c.i.m r4 = r4.f40696i
            r4.mo44131a(r11, r1, r7, r7)
            goto L_0x0075
        L_0x0042:
            if (r11 != r5) goto L_0x0067
            int r4 = r12.f40689b
            r7 = r4 & 512(0x200, float:7.175E-43)
            if (r7 != 0) goto L_0x0053
            r4 = r4 | 512(0x200, float:7.175E-43)
            r12.f40689b = r4
            int r4 = r10.f40743c4
            int r4 = r4 + r2
            r10.f40743c4 = r4
        L_0x0053:
            i.b.a.a.c.i.q r4 = r10.f40747g4
            int r7 = r4.f40689b
            r7 = r7 | 128(0x80, float:1.794E-43)
            r4.f40689b = r7
            int r4 = r10.f40748h4
            int r4 = r4 + r2
            r10.m60094c(r4, r12)
            i.b.a.a.c.i.q r7 = new i.b.a.a.c.i.q
            r7.<init>()
            goto L_0x0075
        L_0x0067:
            int r4 = r10.f40748h4
            int[] r8 = p205i.p471b.p472a.p473a.p474c.p475i.C13952m.f40629G
            r8 = r8[r11]
            int r4 = r4 + r8
            r10.f40748h4 = r4
            int r4 = r10.f40748h4
            r10.m60094c(r4, r12)
        L_0x0075:
            int r4 = r12.f40689b
            r4 = r4 & 2
            if (r4 == 0) goto L_0x00c1
            int r4 = r12.f40691d
            i.b.a.a.c.i.d r8 = r10.f40719E3
            int r9 = r8.f40485b
            int r4 = r4 - r9
            r9 = -32768(0xffffffffffff8000, float:NaN)
            if (r4 >= r9) goto L_0x00c1
            if (r11 != r6) goto L_0x008c
            r8.mo44066a(r0)
            goto L_0x00b8
        L_0x008c:
            if (r11 != r5) goto L_0x0094
            r0 = 201(0xc9, float:2.82E-43)
            r8.mo44066a(r0)
            goto L_0x00b8
        L_0x0094:
            if (r7 == 0) goto L_0x009c
            int r1 = r7.f40689b
            r1 = r1 | 16
            r7.f40689b = r1
        L_0x009c:
            i.b.a.a.c.i.d r1 = r10.f40719E3
            r3 = 166(0xa6, float:2.33E-43)
            if (r11 > r3) goto L_0x00a7
            int r3 = r11 + 1
            r3 = r3 ^ r2
            int r3 = r3 - r2
            goto L_0x00a9
        L_0x00a7:
            r3 = r11 ^ 1
        L_0x00a9:
            r1.mo44066a(r3)
            i.b.a.a.c.i.d r1 = r10.f40719E3
            r3 = 8
            r1.mo44074c(r3)
            i.b.a.a.c.i.d r1 = r10.f40719E3
            r1.mo44066a(r0)
        L_0x00b8:
            i.b.a.a.c.i.d r0 = r10.f40719E3
            int r1 = r0.f40485b
            int r1 = r1 - r2
            r12.mo44161a(r10, r0, r1, r2)
            goto L_0x00e0
        L_0x00c1:
            if (r3 == 0) goto L_0x00d3
            i.b.a.a.c.i.d r0 = r10.f40719E3
            int r1 = r11 + 33
            r0.mo44066a(r1)
            i.b.a.a.c.i.d r0 = r10.f40719E3
            int r1 = r0.f40485b
            int r1 = r1 - r2
            r12.mo44161a(r10, r0, r1, r2)
            goto L_0x00e0
        L_0x00d3:
            i.b.a.a.c.i.d r0 = r10.f40719E3
            r0.mo44066a(r11)
            i.b.a.a.c.i.d r0 = r10.f40719E3
            int r3 = r0.f40485b
            int r3 = r3 - r2
            r12.mo44161a(r10, r0, r3, r1)
        L_0x00e0:
            i.b.a.a.c.i.q r12 = r10.f40747g4
            if (r12 == 0) goto L_0x00ee
            if (r7 == 0) goto L_0x00e9
            r10.mo44180a(r7)
        L_0x00e9:
            if (r11 != r6) goto L_0x00ee
            r10.m60097f()
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p471b.p472a.p473a.p474c.p475i.C13958s.mo44175a(int, i.b.a.a.c.i.q):void");
    }

    /* renamed from: a */
    public void mo44180a(C13956q qVar) {
        C13946g gVar = this.f40750l3;
        boolean z = gVar.f40560N;
        C13943d dVar = this.f40719E3;
        gVar.f40560N = z | qVar.mo44164a(this, dVar.f40485b, dVar.f40484a);
        int i = qVar.f40689b;
        if ((i & 1) == 0) {
            int i2 = this.f40744d4;
            if (i2 == 0) {
                C13956q qVar2 = this.f40747g4;
                if (qVar2 != null) {
                    if (qVar.f40691d == qVar2.f40691d) {
                        qVar2.f40689b = (i & 16) | qVar2.f40689b;
                        qVar.f40696i = qVar2.f40696i;
                        return;
                    }
                    m60094c(0, qVar);
                }
                this.f40747g4 = qVar;
                if (qVar.f40696i == null) {
                    qVar.f40696i = new C13952m();
                    qVar.f40696i.f40648a = qVar;
                }
                C13956q qVar3 = this.f40746f4;
                if (qVar3 != null) {
                    if (qVar.f40691d == qVar3.f40691d) {
                        qVar3.f40689b |= qVar.f40689b & 16;
                        qVar.f40696i = qVar3.f40696i;
                        this.f40747g4 = qVar3;
                        return;
                    }
                    qVar3.f40697j = qVar;
                }
                this.f40746f4 = qVar;
            } else if (i2 == 1) {
                C13956q qVar4 = this.f40747g4;
                if (qVar4 == null) {
                    this.f40747g4 = qVar;
                } else {
                    qVar4.f40696i.f40648a = qVar;
                }
            } else if (i2 == 2) {
                C13956q qVar5 = this.f40747g4;
                if (qVar5 != null) {
                    qVar5.f40695h = this.f40749i4;
                    m60094c(this.f40748h4, qVar);
                }
                this.f40747g4 = qVar;
                this.f40748h4 = 0;
                this.f40749i4 = 0;
                C13956q qVar6 = this.f40746f4;
                if (qVar6 != null) {
                    qVar6.f40697j = qVar;
                }
                this.f40746f4 = qVar;
            }
        }
    }

    /* renamed from: a */
    public void mo44183a(Object obj) {
        int i;
        this.f40739Y3 = this.f40719E3.f40485b;
        C13955p b = this.f40750l3.mo44119b(obj);
        if (this.f40747g4 != null) {
            int i2 = this.f40744d4;
            if (i2 == 0 || i2 == 1) {
                this.f40747g4.f40696i.mo44131a(18, 0, this.f40750l3, b);
            } else {
                int i3 = b.f40668b;
                if (i3 == 5 || i3 == 6) {
                    i = this.f40748h4 + 2;
                } else {
                    i = this.f40748h4 + 1;
                }
                if (i > this.f40749i4) {
                    this.f40749i4 = i;
                }
                this.f40748h4 = i;
            }
        }
        int i4 = b.f40667a;
        int i5 = b.f40668b;
        if (i5 == 5 || i5 == 6) {
            this.f40719E3.mo44073b(20, i4);
        } else if (i4 >= 256) {
            this.f40719E3.mo44073b(19, i4);
        } else {
            this.f40719E3.mo44067a(18, i4);
        }
    }

    /* renamed from: a */
    public void mo44172a(int i, int i2) {
        this.f40739Y3 = this.f40719E3.f40485b;
        if (this.f40747g4 != null) {
            int i3 = this.f40744d4;
            if (i3 == 0 || i3 == 1) {
                this.f40747g4.f40696i.mo44131a((int) C13959t.f40847U1, i, (C13946g) null, (C13955p) null);
            }
        }
        if (this.f40744d4 != 3) {
            int i4 = i + 1;
            if (i4 > this.f40721G3) {
                this.f40721G3 = i4;
            }
        }
        if (i > 255 || i2 > 127 || i2 < -128) {
            this.f40719E3.mo44066a((int) JpegConst.DHT).mo44073b(C13959t.f40847U1, i).mo44074c(i2);
        } else {
            this.f40719E3.mo44066a((int) C13959t.f40847U1).mo44067a(i, i2);
        }
    }

    /* renamed from: a */
    public void mo44173a(int i, int i2, C13956q qVar, C13956q... qVarArr) {
        C13943d dVar = this.f40719E3;
        int i3 = dVar.f40485b;
        this.f40739Y3 = i3;
        dVar.mo44066a((int) C13959t.f40792G2);
        C13943d dVar2 = this.f40719E3;
        dVar2.mo44071a((byte[]) null, 0, (4 - (dVar2.f40485b % 4)) % 4);
        qVar.mo44161a(this, this.f40719E3, i3, true);
        this.f40719E3.mo44072b(i).mo44072b(i2);
        for (C13956q a : qVarArr) {
            a.mo44161a(this, this.f40719E3, i3, true);
        }
        m60092a(qVar, qVarArr);
    }

    /* renamed from: a */
    public void mo44182a(C13956q qVar, int[] iArr, C13956q[] qVarArr) {
        C13943d dVar = this.f40719E3;
        int i = dVar.f40485b;
        this.f40739Y3 = i;
        dVar.mo44066a((int) C13959t.f40796H2);
        C13943d dVar2 = this.f40719E3;
        dVar2.mo44071a((byte[]) null, 0, (4 - (dVar2.f40485b % 4)) % 4);
        qVar.mo44161a(this, this.f40719E3, i, true);
        this.f40719E3.mo44072b(qVarArr.length);
        for (int i2 = 0; i2 < qVarArr.length; i2++) {
            this.f40719E3.mo44072b(iArr[i2]);
            qVarArr[i2].mo44161a(this, this.f40719E3, i, true);
        }
        m60092a(qVar, qVarArr);
    }

    /* renamed from: a */
    private void m60092a(C13956q qVar, C13956q[] qVarArr) {
        C13956q qVar2 = this.f40747g4;
        if (qVar2 != null) {
            if (this.f40744d4 == 0) {
                qVar2.f40696i.mo44131a((int) C13959t.f40796H2, 0, (C13946g) null, (C13955p) null);
                m60094c(0, qVar);
                C13956q a = qVar.mo44158a();
                a.f40689b |= 16;
                for (int i = 0; i < qVarArr.length; i++) {
                    m60094c(0, qVarArr[i]);
                    C13956q a2 = qVarArr[i].mo44158a();
                    a2.f40689b |= 16;
                }
            } else {
                this.f40748h4--;
                m60094c(this.f40748h4, qVar);
                for (C13956q c : qVarArr) {
                    m60094c(this.f40748h4, c);
                }
            }
            m60097f();
        }
    }

    /* renamed from: a */
    public void mo44184a(String str, int i) {
        this.f40739Y3 = this.f40719E3.f40485b;
        C13955p c = this.f40750l3.mo44124c(str);
        if (this.f40747g4 != null) {
            int i2 = this.f40744d4;
            if (i2 == 0 || i2 == 1) {
                this.f40747g4.f40696i.mo44131a((int) C13959t.f40903g3, i, this.f40750l3, c);
            } else {
                this.f40748h4 += 1 - i;
            }
        }
        this.f40719E3.mo44073b(C13959t.f40903g3, c.f40667a).mo44066a(i);
    }

    /* renamed from: a */
    public C13940a mo44168a(int i, C13961v vVar, String str, boolean z) {
        C13943d dVar = new C13943d();
        C13941b.m59893a((i & -16776961) | (this.f40739Y3 << 8), vVar, dVar);
        dVar.mo44074c(this.f40750l3.mo44130f(str)).mo44074c(0);
        C13941b bVar = new C13941b(this.f40750l3, true, dVar, dVar, dVar.f40485b - 2);
        if (z) {
            bVar.f40479i = this.f40740Z3;
            this.f40740Z3 = bVar;
        } else {
            bVar.f40479i = this.f40741a4;
            this.f40741a4 = bVar;
        }
        return bVar;
    }

    /* renamed from: a */
    public void mo44181a(C13956q qVar, C13956q qVar2, C13956q qVar3, String str) {
        this.f40728N3++;
        C13954o oVar = new C13954o();
        oVar.f40661a = qVar;
        oVar.f40662b = qVar2;
        oVar.f40663c = qVar3;
        oVar.f40664d = str;
        oVar.f40665e = str != null ? this.f40750l3.mo44116b(str) : 0;
        C13954o oVar2 = this.f40730P3;
        if (oVar2 == null) {
            this.f40729O3 = oVar;
        } else {
            oVar2.f40666f = oVar;
        }
        this.f40730P3 = oVar;
    }

    /* renamed from: a */
    public void mo44186a(String str, String str2, String str3, C13956q qVar, C13956q qVar2, int i) {
        int i2 = 1;
        if (str3 != null) {
            if (this.f40736V3 == null) {
                this.f40736V3 = new C13943d();
            }
            this.f40735U3++;
            this.f40736V3.mo44074c(qVar.f40691d).mo44074c(qVar2.f40691d - qVar.f40691d).mo44074c(this.f40750l3.mo44130f(str)).mo44074c(this.f40750l3.mo44130f(str3)).mo44074c(i);
        }
        if (this.f40734T3 == null) {
            this.f40734T3 = new C13943d();
        }
        this.f40733S3++;
        this.f40734T3.mo44074c(qVar.f40691d).mo44074c(qVar2.f40691d - qVar.f40691d).mo44074c(this.f40750l3.mo44130f(str)).mo44074c(this.f40750l3.mo44130f(str2)).mo44074c(i);
        if (this.f40744d4 != 3) {
            char charAt = str2.charAt(0);
            if (charAt == 'J' || charAt == 'D') {
                i2 = 2;
            }
            int i3 = i + i2;
            if (i3 > this.f40721G3) {
                this.f40721G3 = i3;
            }
        }
    }

    /* renamed from: a */
    public C13940a mo44169a(int i, C13961v vVar, C13956q[] qVarArr, C13956q[] qVarArr2, int[] iArr, String str, boolean z) {
        C13943d dVar = new C13943d();
        dVar.mo44066a(i >>> 24).mo44074c(qVarArr.length);
        for (int i2 = 0; i2 < qVarArr.length; i2++) {
            dVar.mo44074c(qVarArr[i2].f40691d).mo44074c(qVarArr2[i2].f40691d - qVarArr[i2].f40691d).mo44074c(iArr[i2]);
        }
        if (vVar == null) {
            dVar.mo44066a(0);
        } else {
            byte[] bArr = vVar.f41011a;
            int i3 = vVar.f41012b;
            dVar.mo44071a(bArr, i3, (bArr[i3] * 2) + 1);
        }
        dVar.mo44074c(this.f40750l3.mo44130f(str)).mo44074c(0);
        C13941b bVar = new C13941b(this.f40750l3, true, dVar, dVar, dVar.f40485b - 2);
        if (z) {
            bVar.f40479i = this.f40740Z3;
            this.f40740Z3 = bVar;
        } else {
            bVar.f40479i = this.f40741a4;
            this.f40741a4 = bVar;
        }
        return bVar;
    }

    /* renamed from: a */
    private void m60091a(C13952m mVar) {
        int[] iArr = mVar.f40649b;
        int[] iArr2 = mVar.f40650c;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < iArr.length) {
            int i5 = iArr[i2];
            if (i5 == 16777216) {
                i4++;
            } else {
                i3 += i4 + 1;
                i4 = 0;
            }
            if (i5 == 16777220 || i5 == 16777219) {
                i2++;
            }
            i2++;
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < iArr2.length) {
            int i8 = iArr2[i6];
            i7++;
            if (i8 == 16777220 || i8 == 16777219) {
                i6++;
            }
            i6++;
        }
        int a = m60090a(mVar.f40648a.f40691d, i3, i7);
        int i9 = 0;
        while (i3 > 0) {
            int i10 = iArr[i9];
            int i11 = a + 1;
            this.f40727M3[a] = i10;
            if (i10 == 16777220 || i10 == 16777219) {
                i9++;
            }
            i9++;
            i3--;
            a = i11;
        }
        while (i < iArr2.length) {
            int i12 = iArr2[i];
            int i13 = a + 1;
            this.f40727M3[a] = i12;
            if (i12 == 16777220 || i12 == 16777219) {
                i++;
            }
            i++;
            a = i13;
        }
        m60095e();
    }

    /* renamed from: a */
    private int m60090a(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        int[] iArr = this.f40727M3;
        if (iArr == null || iArr.length < i4) {
            this.f40727M3 = new int[i4];
        }
        int[] iArr2 = this.f40727M3;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
        return 3;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03c6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44198a(p205i.p471b.p472a.p473a.p474c.p475i.C13943d r23) {
        /*
            r22 = this;
            r0 = r22
            r8 = r23
            int r1 = r0.f40751m3
            r9 = 262144(0x40000, float:3.67342E-40)
            r2 = r1 & r9
            int r2 = r2 / 64
            r3 = 917504(0xe0000, float:1.285697E-39)
            r2 = r2 | r3
            r2 = r2 ^ -1
            r1 = r1 & r2
            i.b.a.a.c.i.d r1 = r8.mo44074c(r1)
            int r2 = r0.f40752n3
            i.b.a.a.c.i.d r1 = r1.mo44074c(r2)
            int r2 = r0.f40753o3
            r1.mo44074c(r2)
            int r1 = r0.f40756r3
            if (r1 == 0) goto L_0x0031
            i.b.a.a.c.i.g r2 = r0.f40750l3
            i.b.a.a.c.i.e r2 = r2.f40561c
            byte[] r2 = r2.f40496a
            int r3 = r0.f40757s3
            r8.mo44071a(r2, r1, r3)
            return
        L_0x0031:
            i.b.a.a.c.i.d r1 = r0.f40719E3
            int r1 = r1.f40485b
            r10 = 0
            if (r1 <= 0) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            int r2 = r0.f40758t3
            if (r2 <= 0) goto L_0x0041
            int r1 = r1 + 1
        L_0x0041:
            int r2 = r0.f40751m3
            r3 = r2 & 4096(0x1000, float:5.74E-42)
            r12 = 49
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r3 == 0) goto L_0x0058
            i.b.a.a.c.i.g r3 = r0.f40750l3
            int r3 = r3.f40562d
            r3 = r3 & r13
            if (r3 < r12) goto L_0x0056
            r2 = r2 & r9
            if (r2 == 0) goto L_0x0058
        L_0x0056:
            int r1 = r1 + 1
        L_0x0058:
            int r2 = r0.f40751m3
            r14 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r14
            if (r2 == 0) goto L_0x0061
            int r1 = r1 + 1
        L_0x0061:
            java.lang.String r2 = r0.f40755q3
            if (r2 == 0) goto L_0x0067
            int r1 = r1 + 1
        L_0x0067:
            i.b.a.a.c.i.d r2 = r0.f40732R3
            if (r2 == 0) goto L_0x006d
            int r1 = r1 + 1
        L_0x006d:
            i.b.a.a.c.i.d r2 = r0.f40760v3
            if (r2 == 0) goto L_0x0073
            int r1 = r1 + 1
        L_0x0073:
            i.b.a.a.c.i.b r2 = r0.f40761w3
            if (r2 == 0) goto L_0x0079
            int r1 = r1 + 1
        L_0x0079:
            i.b.a.a.c.i.b r2 = r0.f40762x3
            if (r2 == 0) goto L_0x007f
            int r1 = r1 + 1
        L_0x007f:
            i.b.a.a.c.i.b r2 = r0.f40763y3
            if (r2 == 0) goto L_0x0085
            int r1 = r1 + 1
        L_0x0085:
            i.b.a.a.c.i.b r2 = r0.f40764z3
            if (r2 == 0) goto L_0x008b
            int r1 = r1 + 1
        L_0x008b:
            i.b.a.a.c.i.b[] r2 = r0.f40715A3
            if (r2 == 0) goto L_0x0091
            int r1 = r1 + 1
        L_0x0091:
            i.b.a.a.c.i.b[] r2 = r0.f40716B3
            if (r2 == 0) goto L_0x0097
            int r1 = r1 + 1
        L_0x0097:
            i.b.a.a.c.i.c r2 = r0.f40718D3
            if (r2 == 0) goto L_0x00a0
            int r2 = r2.mo44058a()
            int r1 = r1 + r2
        L_0x00a0:
            r8.mo44074c(r1)
            i.b.a.a.c.i.d r1 = r0.f40719E3
            int r1 = r1.f40485b
            java.lang.String r15 = "RuntimeInvisibleTypeAnnotations"
            java.lang.String r7 = "RuntimeVisibleTypeAnnotations"
            r6 = 2
            if (r1 <= 0) goto L_0x0282
            int r1 = r1 + 12
            int r2 = r0.f40728N3
            int r2 = r2 * 8
            int r1 = r1 + r2
            i.b.a.a.c.i.d r2 = r0.f40734T3
            if (r2 == 0) goto L_0x00be
            int r2 = r2.f40485b
            int r2 = r2 + 8
            int r1 = r1 + r2
        L_0x00be:
            i.b.a.a.c.i.d r2 = r0.f40736V3
            if (r2 == 0) goto L_0x00c7
            int r2 = r2.f40485b
            int r2 = r2 + 8
            int r1 = r1 + r2
        L_0x00c7:
            i.b.a.a.c.i.d r2 = r0.f40738X3
            if (r2 == 0) goto L_0x00d0
            int r2 = r2.f40485b
            int r2 = r2 + 8
            int r1 = r1 + r2
        L_0x00d0:
            i.b.a.a.c.i.d r2 = r0.f40724J3
            if (r2 == 0) goto L_0x00d9
            int r2 = r2.f40485b
            int r2 = r2 + 8
            int r1 = r1 + r2
        L_0x00d9:
            i.b.a.a.c.i.b r2 = r0.f40740Z3
            if (r2 == 0) goto L_0x00e4
            int r2 = r2.mo44057b()
            int r2 = r2 + 8
            int r1 = r1 + r2
        L_0x00e4:
            i.b.a.a.c.i.b r2 = r0.f40741a4
            if (r2 == 0) goto L_0x00ef
            int r2 = r2.mo44057b()
            int r2 = r2 + 8
            int r1 = r1 + r2
        L_0x00ef:
            i.b.a.a.c.i.c r2 = r0.f40742b4
            if (r2 == 0) goto L_0x0110
            i.b.a.a.c.i.g r3 = r0.f40750l3
            i.b.a.a.c.i.d r4 = r0.f40719E3
            byte[] r5 = r4.f40484a
            int r4 = r4.f40485b
            int r11 = r0.f40720F3
            int r14 = r0.f40721G3
            r16 = r2
            r17 = r3
            r18 = r5
            r19 = r4
            r20 = r11
            r21 = r14
            int r2 = r16.mo44059a(r17, r18, r19, r20, r21)
            int r1 = r1 + r2
        L_0x0110:
            i.b.a.a.c.i.g r2 = r0.f40750l3
            java.lang.String r3 = "Code"
            int r2 = r2.mo44130f(r3)
            i.b.a.a.c.i.d r2 = r8.mo44074c(r2)
            r2.mo44072b(r1)
            int r1 = r0.f40720F3
            i.b.a.a.c.i.d r1 = r8.mo44074c(r1)
            int r2 = r0.f40721G3
            r1.mo44074c(r2)
            i.b.a.a.c.i.d r1 = r0.f40719E3
            int r1 = r1.f40485b
            i.b.a.a.c.i.d r1 = r8.mo44072b(r1)
            i.b.a.a.c.i.d r2 = r0.f40719E3
            byte[] r3 = r2.f40484a
            int r2 = r2.f40485b
            r1.mo44071a(r3, r10, r2)
            int r1 = r0.f40728N3
            r8.mo44074c(r1)
            int r1 = r0.f40728N3
            if (r1 <= 0) goto L_0x0168
            i.b.a.a.c.i.o r1 = r0.f40729O3
        L_0x0146:
            if (r1 == 0) goto L_0x0168
            i.b.a.a.c.i.q r2 = r1.f40661a
            int r2 = r2.f40691d
            i.b.a.a.c.i.d r2 = r8.mo44074c(r2)
            i.b.a.a.c.i.q r3 = r1.f40662b
            int r3 = r3.f40691d
            i.b.a.a.c.i.d r2 = r2.mo44074c(r3)
            i.b.a.a.c.i.q r3 = r1.f40663c
            int r3 = r3.f40691d
            i.b.a.a.c.i.d r2 = r2.mo44074c(r3)
            int r3 = r1.f40665e
            r2.mo44074c(r3)
            i.b.a.a.c.i.o r1 = r1.f40666f
            goto L_0x0146
        L_0x0168:
            i.b.a.a.c.i.d r1 = r0.f40734T3
            if (r1 == 0) goto L_0x016e
            r1 = 1
            goto L_0x016f
        L_0x016e:
            r1 = 0
        L_0x016f:
            i.b.a.a.c.i.d r2 = r0.f40736V3
            if (r2 == 0) goto L_0x0175
            int r1 = r1 + 1
        L_0x0175:
            i.b.a.a.c.i.d r2 = r0.f40738X3
            if (r2 == 0) goto L_0x017b
            int r1 = r1 + 1
        L_0x017b:
            i.b.a.a.c.i.d r2 = r0.f40724J3
            if (r2 == 0) goto L_0x0181
            int r1 = r1 + 1
        L_0x0181:
            i.b.a.a.c.i.b r2 = r0.f40740Z3
            if (r2 == 0) goto L_0x0187
            int r1 = r1 + 1
        L_0x0187:
            i.b.a.a.c.i.b r2 = r0.f40741a4
            if (r2 == 0) goto L_0x018d
            int r1 = r1 + 1
        L_0x018d:
            i.b.a.a.c.i.c r2 = r0.f40742b4
            if (r2 == 0) goto L_0x0196
            int r2 = r2.mo44058a()
            int r1 = r1 + r2
        L_0x0196:
            r8.mo44074c(r1)
            i.b.a.a.c.i.d r1 = r0.f40734T3
            if (r1 == 0) goto L_0x01bf
            i.b.a.a.c.i.g r1 = r0.f40750l3
            java.lang.String r2 = "LocalVariableTable"
            int r1 = r1.mo44130f(r2)
            r8.mo44074c(r1)
            i.b.a.a.c.i.d r1 = r0.f40734T3
            int r1 = r1.f40485b
            int r1 = r1 + r6
            i.b.a.a.c.i.d r1 = r8.mo44072b(r1)
            int r2 = r0.f40733S3
            r1.mo44074c(r2)
            i.b.a.a.c.i.d r1 = r0.f40734T3
            byte[] r2 = r1.f40484a
            int r1 = r1.f40485b
            r8.mo44071a(r2, r10, r1)
        L_0x01bf:
            i.b.a.a.c.i.d r1 = r0.f40736V3
            if (r1 == 0) goto L_0x01e5
            i.b.a.a.c.i.g r1 = r0.f40750l3
            java.lang.String r2 = "LocalVariableTypeTable"
            int r1 = r1.mo44130f(r2)
            r8.mo44074c(r1)
            i.b.a.a.c.i.d r1 = r0.f40736V3
            int r1 = r1.f40485b
            int r1 = r1 + r6
            i.b.a.a.c.i.d r1 = r8.mo44072b(r1)
            int r2 = r0.f40735U3
            r1.mo44074c(r2)
            i.b.a.a.c.i.d r1 = r0.f40736V3
            byte[] r2 = r1.f40484a
            int r1 = r1.f40485b
            r8.mo44071a(r2, r10, r1)
        L_0x01e5:
            i.b.a.a.c.i.d r1 = r0.f40738X3
            if (r1 == 0) goto L_0x020b
            i.b.a.a.c.i.g r1 = r0.f40750l3
            java.lang.String r2 = "LineNumberTable"
            int r1 = r1.mo44130f(r2)
            r8.mo44074c(r1)
            i.b.a.a.c.i.d r1 = r0.f40738X3
            int r1 = r1.f40485b
            int r1 = r1 + r6
            i.b.a.a.c.i.d r1 = r8.mo44072b(r1)
            int r2 = r0.f40737W3
            r1.mo44074c(r2)
            i.b.a.a.c.i.d r1 = r0.f40738X3
            byte[] r2 = r1.f40484a
            int r1 = r1.f40485b
            r8.mo44071a(r2, r10, r1)
        L_0x020b:
            i.b.a.a.c.i.d r1 = r0.f40724J3
            if (r1 == 0) goto L_0x0242
            i.b.a.a.c.i.g r1 = r0.f40750l3
            int r1 = r1.f40562d
            r1 = r1 & r13
            r2 = 50
            if (r1 < r2) goto L_0x021a
            r1 = 1
            goto L_0x021b
        L_0x021a:
            r1 = 0
        L_0x021b:
            i.b.a.a.c.i.g r2 = r0.f40750l3
            if (r1 == 0) goto L_0x0222
            java.lang.String r1 = "StackMapTable"
            goto L_0x0224
        L_0x0222:
            java.lang.String r1 = "StackMap"
        L_0x0224:
            int r1 = r2.mo44130f(r1)
            r8.mo44074c(r1)
            i.b.a.a.c.i.d r1 = r0.f40724J3
            int r1 = r1.f40485b
            int r1 = r1 + r6
            i.b.a.a.c.i.d r1 = r8.mo44072b(r1)
            int r2 = r0.f40723I3
            r1.mo44074c(r2)
            i.b.a.a.c.i.d r1 = r0.f40724J3
            byte[] r2 = r1.f40484a
            int r1 = r1.f40485b
            r8.mo44071a(r2, r10, r1)
        L_0x0242:
            i.b.a.a.c.i.b r1 = r0.f40740Z3
            if (r1 == 0) goto L_0x0254
            i.b.a.a.c.i.g r1 = r0.f40750l3
            int r1 = r1.mo44130f(r7)
            r8.mo44074c(r1)
            i.b.a.a.c.i.b r1 = r0.f40740Z3
            r1.mo44056a(r8)
        L_0x0254:
            i.b.a.a.c.i.b r1 = r0.f40741a4
            if (r1 == 0) goto L_0x0266
            i.b.a.a.c.i.g r1 = r0.f40750l3
            int r1 = r1.mo44130f(r15)
            r8.mo44074c(r1)
            i.b.a.a.c.i.b r1 = r0.f40741a4
            r1.mo44056a(r8)
        L_0x0266:
            i.b.a.a.c.i.c r1 = r0.f40742b4
            if (r1 == 0) goto L_0x0282
            i.b.a.a.c.i.g r2 = r0.f40750l3
            i.b.a.a.c.i.d r3 = r0.f40719E3
            byte[] r4 = r3.f40484a
            int r5 = r3.f40485b
            int r11 = r0.f40721G3
            int r14 = r0.f40720F3
            r3 = r4
            r4 = r5
            r5 = r11
            r11 = 2
            r6 = r14
            r14 = r7
            r7 = r23
            r1.mo44061a(r2, r3, r4, r5, r6, r7)
            goto L_0x0284
        L_0x0282:
            r14 = r7
            r11 = 2
        L_0x0284:
            int r1 = r0.f40758t3
            if (r1 <= 0) goto L_0x02b0
            i.b.a.a.c.i.g r1 = r0.f40750l3
            java.lang.String r2 = "Exceptions"
            int r1 = r1.mo44130f(r2)
            i.b.a.a.c.i.d r1 = r8.mo44074c(r1)
            int r2 = r0.f40758t3
            int r2 = r2 * 2
            int r2 = r2 + r11
            r1.mo44072b(r2)
            int r1 = r0.f40758t3
            r8.mo44074c(r1)
            r1 = 0
        L_0x02a2:
            int r2 = r0.f40758t3
            if (r1 >= r2) goto L_0x02b0
            int[] r2 = r0.f40759u3
            r2 = r2[r1]
            r8.mo44074c(r2)
            int r1 = r1 + 1
            goto L_0x02a2
        L_0x02b0:
            int r1 = r0.f40751m3
            r2 = r1 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x02cf
            i.b.a.a.c.i.g r2 = r0.f40750l3
            int r2 = r2.f40562d
            r2 = r2 & r13
            if (r2 < r12) goto L_0x02c0
            r1 = r1 & r9
            if (r1 == 0) goto L_0x02cf
        L_0x02c0:
            i.b.a.a.c.i.g r1 = r0.f40750l3
            java.lang.String r2 = "Synthetic"
            int r1 = r1.mo44130f(r2)
            i.b.a.a.c.i.d r1 = r8.mo44074c(r1)
            r1.mo44072b(r10)
        L_0x02cf:
            int r1 = r0.f40751m3
            r2 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x02e5
            i.b.a.a.c.i.g r1 = r0.f40750l3
            java.lang.String r2 = "Deprecated"
            int r1 = r1.mo44130f(r2)
            i.b.a.a.c.i.d r1 = r8.mo44074c(r1)
            r1.mo44072b(r10)
        L_0x02e5:
            java.lang.String r1 = r0.f40755q3
            if (r1 == 0) goto L_0x0304
            i.b.a.a.c.i.g r1 = r0.f40750l3
            java.lang.String r2 = "Signature"
            int r1 = r1.mo44130f(r2)
            i.b.a.a.c.i.d r1 = r8.mo44074c(r1)
            i.b.a.a.c.i.d r1 = r1.mo44072b(r11)
            i.b.a.a.c.i.g r2 = r0.f40750l3
            java.lang.String r3 = r0.f40755q3
            int r2 = r2.mo44130f(r3)
            r1.mo44074c(r2)
        L_0x0304:
            i.b.a.a.c.i.d r1 = r0.f40732R3
            if (r1 == 0) goto L_0x032b
            i.b.a.a.c.i.g r1 = r0.f40750l3
            java.lang.String r2 = "MethodParameters"
            int r1 = r1.mo44130f(r2)
            r8.mo44074c(r1)
            i.b.a.a.c.i.d r1 = r0.f40732R3
            int r1 = r1.f40485b
            r2 = 1
            int r1 = r1 + r2
            i.b.a.a.c.i.d r1 = r8.mo44072b(r1)
            int r2 = r0.f40731Q3
            r1.mo44066a(r2)
            i.b.a.a.c.i.d r1 = r0.f40732R3
            byte[] r2 = r1.f40484a
            int r1 = r1.f40485b
            r8.mo44071a(r2, r10, r1)
        L_0x032b:
            i.b.a.a.c.i.d r1 = r0.f40760v3
            if (r1 == 0) goto L_0x034a
            i.b.a.a.c.i.g r1 = r0.f40750l3
            java.lang.String r2 = "AnnotationDefault"
            int r1 = r1.mo44130f(r2)
            r8.mo44074c(r1)
            i.b.a.a.c.i.d r1 = r0.f40760v3
            int r1 = r1.f40485b
            r8.mo44072b(r1)
            i.b.a.a.c.i.d r1 = r0.f40760v3
            byte[] r2 = r1.f40484a
            int r1 = r1.f40485b
            r8.mo44071a(r2, r10, r1)
        L_0x034a:
            i.b.a.a.c.i.b r1 = r0.f40761w3
            if (r1 == 0) goto L_0x035e
            i.b.a.a.c.i.g r1 = r0.f40750l3
            java.lang.String r2 = "RuntimeVisibleAnnotations"
            int r1 = r1.mo44130f(r2)
            r8.mo44074c(r1)
            i.b.a.a.c.i.b r1 = r0.f40761w3
            r1.mo44056a(r8)
        L_0x035e:
            i.b.a.a.c.i.b r1 = r0.f40762x3
            if (r1 == 0) goto L_0x0372
            i.b.a.a.c.i.g r1 = r0.f40750l3
            java.lang.String r2 = "RuntimeInvisibleAnnotations"
            int r1 = r1.mo44130f(r2)
            r8.mo44074c(r1)
            i.b.a.a.c.i.b r1 = r0.f40762x3
            r1.mo44056a(r8)
        L_0x0372:
            i.b.a.a.c.i.b r1 = r0.f40763y3
            if (r1 == 0) goto L_0x0384
            i.b.a.a.c.i.g r1 = r0.f40750l3
            int r1 = r1.mo44130f(r14)
            r8.mo44074c(r1)
            i.b.a.a.c.i.b r1 = r0.f40763y3
            r1.mo44056a(r8)
        L_0x0384:
            i.b.a.a.c.i.b r1 = r0.f40764z3
            if (r1 == 0) goto L_0x0396
            i.b.a.a.c.i.g r1 = r0.f40750l3
            int r1 = r1.mo44130f(r15)
            r8.mo44074c(r1)
            i.b.a.a.c.i.b r1 = r0.f40764z3
            r1.mo44056a(r8)
        L_0x0396:
            i.b.a.a.c.i.b[] r1 = r0.f40715A3
            if (r1 == 0) goto L_0x03ac
            i.b.a.a.c.i.g r1 = r0.f40750l3
            java.lang.String r2 = "RuntimeVisibleParameterAnnotations"
            int r1 = r1.mo44130f(r2)
            r8.mo44074c(r1)
            i.b.a.a.c.i.b[] r1 = r0.f40715A3
            int r2 = r0.f40717C3
            p205i.p471b.p472a.p473a.p474c.p475i.C13941b.m59894a(r1, r2, r8)
        L_0x03ac:
            i.b.a.a.c.i.b[] r1 = r0.f40716B3
            if (r1 == 0) goto L_0x03c2
            i.b.a.a.c.i.g r1 = r0.f40750l3
            java.lang.String r2 = "RuntimeInvisibleParameterAnnotations"
            int r1 = r1.mo44130f(r2)
            r8.mo44074c(r1)
            i.b.a.a.c.i.b[] r1 = r0.f40716B3
            int r2 = r0.f40717C3
            p205i.p471b.p472a.p473a.p474c.p475i.C13941b.m59894a(r1, r2, r8)
        L_0x03c2:
            i.b.a.a.c.i.c r1 = r0.f40718D3
            if (r1 == 0) goto L_0x03d1
            i.b.a.a.c.i.g r2 = r0.f40750l3
            r3 = 0
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = r23
            r1.mo44061a(r2, r3, r4, r5, r6, r7)
        L_0x03d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p471b.p472a.p473a.p474c.p475i.C13958s.mo44198a(i.b.a.a.c.i.d):void");
    }
}
