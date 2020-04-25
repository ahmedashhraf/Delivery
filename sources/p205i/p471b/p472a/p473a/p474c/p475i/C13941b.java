package p205i.p471b.p472a.p473a.p474c.p475i;

/* renamed from: i.b.a.a.c.i.b */
/* compiled from: AnnotationWriter */
final class C13941b extends C13940a {

    /* renamed from: c */
    private final C13946g f40473c;

    /* renamed from: d */
    private int f40474d;

    /* renamed from: e */
    private final boolean f40475e;

    /* renamed from: f */
    private final C13943d f40476f;

    /* renamed from: g */
    private final C13943d f40477g;

    /* renamed from: h */
    private final int f40478h;

    /* renamed from: i */
    C13941b f40479i;

    /* renamed from: j */
    C13941b f40480j;

    C13941b(C13946g gVar, boolean z, C13943d dVar, C13943d dVar2, int i) {
        super(327680);
        this.f40473c = gVar;
        this.f40475e = z;
        this.f40476f = dVar;
        this.f40477g = dVar2;
        this.f40478h = i;
    }

    /* renamed from: a */
    public void mo44054a(String str, Object obj) {
        this.f40474d++;
        if (this.f40475e) {
            this.f40476f.mo44074c(this.f40473c.mo44130f(str));
        }
        if (obj instanceof String) {
            this.f40476f.mo44073b(115, this.f40473c.mo44130f((String) obj));
        } else if (obj instanceof Byte) {
            this.f40476f.mo44073b(66, this.f40473c.mo44114a((int) ((Byte) obj).byteValue()).f40667a);
        } else if (obj instanceof Boolean) {
            this.f40476f.mo44073b(90, this.f40473c.mo44114a(((Boolean) obj).booleanValue() ? 1 : 0).f40667a);
        } else if (obj instanceof Character) {
            this.f40476f.mo44073b(67, this.f40473c.mo44114a((int) ((Character) obj).charValue()).f40667a);
        } else if (obj instanceof Short) {
            this.f40476f.mo44073b(83, this.f40473c.mo44114a((int) ((Short) obj).shortValue()).f40667a);
        } else if (obj instanceof C13960u) {
            this.f40476f.mo44073b(99, this.f40473c.mo44130f(((C13960u) obj).mo44204d()));
        } else {
            int i = 0;
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f40476f.mo44073b(91, bArr.length);
                while (i < bArr.length) {
                    this.f40476f.mo44073b(66, this.f40473c.mo44114a((int) bArr[i]).f40667a);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                this.f40476f.mo44073b(91, zArr.length);
                while (i < zArr.length) {
                    this.f40476f.mo44073b(90, this.f40473c.mo44114a(zArr[i] ? 1 : 0).f40667a);
                    i++;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                this.f40476f.mo44073b(91, sArr.length);
                while (i < sArr.length) {
                    this.f40476f.mo44073b(83, this.f40473c.mo44114a((int) sArr[i]).f40667a);
                    i++;
                }
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                this.f40476f.mo44073b(91, cArr.length);
                while (i < cArr.length) {
                    this.f40476f.mo44073b(67, this.f40473c.mo44114a((int) cArr[i]).f40667a);
                    i++;
                }
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                this.f40476f.mo44073b(91, iArr.length);
                while (i < iArr.length) {
                    this.f40476f.mo44073b(73, this.f40473c.mo44114a(iArr[i]).f40667a);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                this.f40476f.mo44073b(91, jArr.length);
                while (i < jArr.length) {
                    this.f40476f.mo44073b(74, this.f40473c.mo44115a(jArr[i]).f40667a);
                    i++;
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                this.f40476f.mo44073b(91, fArr.length);
                while (i < fArr.length) {
                    this.f40476f.mo44073b(70, this.f40473c.mo44113a(fArr[i]).f40667a);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                this.f40476f.mo44073b(91, dArr.length);
                while (i < dArr.length) {
                    this.f40476f.mo44073b(68, this.f40473c.mo44112a(dArr[i]).f40667a);
                    i++;
                }
            } else {
                C13955p b = this.f40473c.mo44119b(obj);
                this.f40476f.mo44073b(".s.IFJDCS".charAt(b.f40668b), b.f40667a);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo44057b() {
        int i = 0;
        for (C13941b bVar = this; bVar != null; bVar = bVar.f40479i) {
            i += bVar.f40476f.f40485b;
        }
        return i;
    }

    /* renamed from: a */
    public void mo44055a(String str, String str2, String str3) {
        this.f40474d++;
        if (this.f40475e) {
            this.f40476f.mo44074c(this.f40473c.mo44130f(str));
        }
        this.f40476f.mo44073b(101, this.f40473c.mo44130f(str2)).mo44074c(this.f40473c.mo44130f(str3));
    }

    /* renamed from: a */
    public C13940a mo44052a(String str, String str2) {
        this.f40474d++;
        if (this.f40475e) {
            this.f40476f.mo44074c(this.f40473c.mo44130f(str));
        }
        this.f40476f.mo44073b(64, this.f40473c.mo44130f(str2)).mo44074c(0);
        C13946g gVar = this.f40473c;
        C13943d dVar = this.f40476f;
        C13941b bVar = new C13941b(gVar, true, dVar, dVar, dVar.f40485b - 2);
        return bVar;
    }

    /* renamed from: a */
    public C13940a mo44051a(String str) {
        this.f40474d++;
        if (this.f40475e) {
            this.f40476f.mo44074c(this.f40473c.mo44130f(str));
        }
        this.f40476f.mo44073b(91, 0);
        C13946g gVar = this.f40473c;
        C13943d dVar = this.f40476f;
        C13941b bVar = new C13941b(gVar, false, dVar, dVar, dVar.f40485b - 2);
        return bVar;
    }

    /* renamed from: a */
    public void mo44053a() {
        C13943d dVar = this.f40477g;
        if (dVar != null) {
            byte[] bArr = dVar.f40484a;
            int i = this.f40478h;
            int i2 = this.f40474d;
            bArr[i] = (byte) (i2 >>> 8);
            bArr[i + 1] = (byte) i2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44056a(C13943d dVar) {
        int i = 2;
        int i2 = 0;
        C13941b bVar = null;
        for (C13941b bVar2 = this; bVar2 != null; bVar2 = bVar2.f40479i) {
            i2++;
            i += bVar2.f40476f.f40485b;
            bVar2.mo44053a();
            bVar2.f40480j = bVar;
            bVar = bVar2;
        }
        dVar.mo44072b(i);
        dVar.mo44074c(i2);
        while (bVar != null) {
            C13943d dVar2 = bVar.f40476f;
            dVar.mo44071a(dVar2.f40484a, 0, dVar2.f40485b);
            bVar = bVar.f40480j;
        }
    }

    /* renamed from: a */
    static void m59894a(C13941b[] bVarArr, int i, C13943d dVar) {
        int length = ((bVarArr.length - i) * 2) + 1;
        int i2 = i;
        while (true) {
            int i3 = 0;
            if (i2 >= bVarArr.length) {
                break;
            }
            if (bVarArr[i2] != null) {
                i3 = bVarArr[i2].mo44057b();
            }
            length += i3;
            i2++;
        }
        dVar.mo44072b(length).mo44066a(bVarArr.length - i);
        while (i < bVarArr.length) {
            C13941b bVar = null;
            int i4 = 0;
            for (C13941b bVar2 = bVarArr[i]; bVar2 != null; bVar2 = bVar2.f40479i) {
                i4++;
                bVar2.mo44053a();
                bVar2.f40480j = bVar;
                bVar = bVar2;
            }
            dVar.mo44074c(i4);
            while (bVar != null) {
                C13943d dVar2 = bVar.f40476f;
                dVar.mo44071a(dVar2.f40484a, 0, dVar2.f40485b);
                bVar = bVar.f40480j;
            }
            i++;
        }
    }

    /* renamed from: a */
    static void m59893a(int i, C13961v vVar, C13943d dVar) {
        int i2 = i >>> 24;
        if (!(i2 == 0 || i2 == 1)) {
            switch (i2) {
                case 19:
                case 20:
                case 21:
                    dVar.mo44066a(i2);
                    break;
                case 22:
                    break;
                default:
                    switch (i2) {
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            dVar.mo44072b(i);
                            break;
                        default:
                            dVar.mo44073b(i2, (i & 16776960) >> 8);
                            break;
                    }
            }
        }
        dVar.mo44074c(i >>> 16);
        if (vVar == null) {
            dVar.mo44066a(0);
            return;
        }
        byte[] bArr = vVar.f41011a;
        int i3 = vVar.f41012b;
        dVar.mo44071a(bArr, i3, (bArr[i3] * 2) + 1);
    }
}
