package com.fasterxml.jackson.core.p159t;

import com.fasterxml.jackson.core.C3788d;
import com.fasterxml.jackson.core.C3794h;
import com.fasterxml.jackson.core.C3800k;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.p157r.C3813c;
import com.fasterxml.jackson.core.p157r.C3815d;
import com.fasterxml.jackson.core.p158s.C3819d;
import com.fasterxml.jackson.core.p158s.C3822g;
import com.fasterxml.jackson.core.p158s.C3828m;
import com.fasterxml.jackson.core.p160u.C3842a;
import com.fasterxml.jackson.core.p160u.C3845b;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* renamed from: com.fasterxml.jackson.core.t.a */
/* compiled from: ByteSourceJsonBootstrapper */
public final class C3830a {

    /* renamed from: j */
    static final byte f12057j = -17;

    /* renamed from: k */
    static final byte f12058k = -69;

    /* renamed from: l */
    static final byte f12059l = -65;

    /* renamed from: a */
    protected final C3819d f12060a;

    /* renamed from: b */
    protected final InputStream f12061b;

    /* renamed from: c */
    protected final byte[] f12062c;

    /* renamed from: d */
    private int f12063d;

    /* renamed from: e */
    private int f12064e;

    /* renamed from: f */
    private final boolean f12065f;

    /* renamed from: g */
    protected int f12066g;

    /* renamed from: h */
    protected boolean f12067h = true;

    /* renamed from: i */
    protected int f12068i = 0;

    /* renamed from: com.fasterxml.jackson.core.t.a$a */
    /* compiled from: ByteSourceJsonBootstrapper */
    static /* synthetic */ class C3831a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12069a = new int[C3788d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.fasterxml.jackson.core.d[] r0 = com.fasterxml.jackson.core.C3788d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12069a = r0
                int[] r0 = f12069a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.fasterxml.jackson.core.d r1 = com.fasterxml.jackson.core.C3788d.UTF32_BE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f12069a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.fasterxml.jackson.core.d r1 = com.fasterxml.jackson.core.C3788d.UTF32_LE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f12069a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.fasterxml.jackson.core.d r1 = com.fasterxml.jackson.core.C3788d.UTF16_BE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f12069a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.fasterxml.jackson.core.d r1 = com.fasterxml.jackson.core.C3788d.UTF16_LE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f12069a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.fasterxml.jackson.core.d r1 = com.fasterxml.jackson.core.C3788d.UTF8     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3830a.C3831a.<clinit>():void");
        }
    }

    public C3830a(C3819d dVar, InputStream inputStream) {
        this.f12060a = dVar;
        this.f12061b = inputStream;
        this.f12062c = dVar.mo16885c();
        this.f12063d = 0;
        this.f12064e = 0;
        this.f12066g = 0;
        this.f12065f = true;
    }

    /* renamed from: c */
    private boolean m16349c(int i) throws IOException {
        if ((i >> 8) == 0) {
            this.f12067h = true;
        } else if ((16777215 & i) == 0) {
            this.f12067h = false;
        } else if ((-16711681 & i) == 0) {
            m16346a("3412");
        } else if ((i & -65281) != 0) {
            return false;
        } else {
            m16346a("2143");
        }
        this.f12068i = 4;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m16350d(int r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = -16842752(0xfffffffffeff0000, float:-1.6947657E38)
            r1 = 65534(0xfffe, float:9.1833E-41)
            r2 = 65279(0xfeff, float:9.1475E-41)
            r3 = 0
            r4 = 1
            if (r7 == r0) goto L_0x0030
            r0 = -131072(0xfffffffffffe0000, float:NaN)
            r5 = 4
            if (r7 == r0) goto L_0x0026
            if (r7 == r2) goto L_0x001c
            if (r7 == r1) goto L_0x0016
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "2143"
            r6.m16346a(r0)
            goto L_0x0030
        L_0x001c:
            r6.f12067h = r4
            int r7 = r6.f12063d
            int r7 = r7 + r5
            r6.f12063d = r7
            r6.f12068i = r5
            return r4
        L_0x0026:
            int r7 = r6.f12063d
            int r7 = r7 + r5
            r6.f12063d = r7
            r6.f12068i = r5
            r6.f12067h = r3
            return r4
        L_0x0030:
            java.lang.String r0 = "3412"
            r6.m16346a(r0)
        L_0x0035:
            int r0 = r7 >>> 16
            r5 = 2
            if (r0 != r2) goto L_0x0044
            int r7 = r6.f12063d
            int r7 = r7 + r5
            r6.f12063d = r7
            r6.f12068i = r5
            r6.f12067h = r4
            return r4
        L_0x0044:
            if (r0 != r1) goto L_0x0050
            int r7 = r6.f12063d
            int r7 = r7 + r5
            r6.f12063d = r7
            r6.f12068i = r5
            r6.f12067h = r3
            return r4
        L_0x0050:
            int r7 = r7 >>> 8
            r0 = 15711167(0xefbbbf, float:2.2016034E-38)
            if (r7 != r0) goto L_0x0062
            int r7 = r6.f12063d
            int r7 = r7 + 3
            r6.f12063d = r7
            r6.f12068i = r4
            r6.f12067h = r4
            return r4
        L_0x0062:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3830a.m16350d(int):boolean");
    }

    /* renamed from: a */
    public Reader mo16934a() throws IOException {
        C3788d g = this.f12060a.mo16889g();
        int i = C3831a.f12069a[g.ordinal()];
        if (i == 1 || i == 2) {
            C3819d dVar = this.f12060a;
            C3828m mVar = new C3828m(dVar, this.f12061b, this.f12062c, this.f12063d, this.f12064e, dVar.mo16889g().mo16510e());
            return mVar;
        } else if (i == 3 || i == 4 || i == 5) {
            InputStream inputStream = this.f12061b;
            if (inputStream == 0) {
                inputStream = new ByteArrayInputStream(this.f12062c, this.f12063d, this.f12064e);
            } else {
                int i2 = this.f12063d;
                int i3 = this.f12064e;
                if (i2 < i3) {
                    C3822g gVar = new C3822g(this.f12060a, inputStream, this.f12062c, i2, i3);
                    inputStream = gVar;
                }
            }
            return new InputStreamReader(inputStream, g.mo16509d());
        } else {
            throw new RuntimeException("Internal error");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        if (m16348b((int) (r1[r5 + 1] & 255) | ((r1[r5] & 255) << 8)) != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        if (m16348b(r1 >>> 16) != false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.C3788d mo16936b() throws java.io.IOException, com.fasterxml.jackson.core.JsonParseException {
        /*
            r8 = this;
            r0 = 4
            boolean r1 = r8.mo16935a(r0)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0042
            byte[] r1 = r8.f12062c
            int r5 = r8.f12063d
            byte r6 = r1[r5]
            int r6 = r6 << 24
            int r7 = r5 + 1
            byte r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            r6 = r6 | r7
            int r7 = r5 + 2
            byte r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r6 = r6 | r7
            int r5 = r5 + 3
            byte r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r5 = r8.m16350d(r1)
            if (r5 == 0) goto L_0x0032
            goto L_0x005e
        L_0x0032:
            boolean r5 = r8.m16349c(r1)
            if (r5 == 0) goto L_0x0039
            goto L_0x005e
        L_0x0039:
            int r1 = r1 >>> 16
            boolean r1 = r8.m16348b(r1)
            if (r1 == 0) goto L_0x005f
            goto L_0x005e
        L_0x0042:
            boolean r1 = r8.mo16935a(r2)
            if (r1 == 0) goto L_0x005f
            byte[] r1 = r8.f12062c
            int r5 = r8.f12063d
            byte r6 = r1[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            int r5 = r5 + r3
            byte r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r1 = r8.m16348b(r1)
            if (r1 == 0) goto L_0x005f
        L_0x005e:
            r4 = 1
        L_0x005f:
            if (r4 != 0) goto L_0x0064
            com.fasterxml.jackson.core.d r0 = com.fasterxml.jackson.core.C3788d.UTF8
            goto L_0x008a
        L_0x0064:
            int r1 = r8.f12068i
            if (r1 == r3) goto L_0x0088
            if (r1 == r2) goto L_0x007e
            if (r1 != r0) goto L_0x0076
            boolean r0 = r8.f12067h
            if (r0 == 0) goto L_0x0073
            com.fasterxml.jackson.core.d r0 = com.fasterxml.jackson.core.C3788d.UTF32_BE
            goto L_0x008a
        L_0x0073:
            com.fasterxml.jackson.core.d r0 = com.fasterxml.jackson.core.C3788d.UTF32_LE
            goto L_0x008a
        L_0x0076:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Internal error"
            r0.<init>(r1)
            throw r0
        L_0x007e:
            boolean r0 = r8.f12067h
            if (r0 == 0) goto L_0x0085
            com.fasterxml.jackson.core.d r0 = com.fasterxml.jackson.core.C3788d.UTF16_BE
            goto L_0x008a
        L_0x0085:
            com.fasterxml.jackson.core.d r0 = com.fasterxml.jackson.core.C3788d.UTF16_LE
            goto L_0x008a
        L_0x0088:
            com.fasterxml.jackson.core.d r0 = com.fasterxml.jackson.core.C3788d.UTF8
        L_0x008a:
            com.fasterxml.jackson.core.s.d r1 = r8.f12060a
            r1.mo16875a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3830a.mo16936b():com.fasterxml.jackson.core.d");
    }

    public C3830a(C3819d dVar, byte[] bArr, int i, int i2) {
        this.f12060a = dVar;
        this.f12061b = null;
        this.f12062c = bArr;
        this.f12063d = i;
        this.f12064e = i2 + i;
        this.f12066g = -i;
        this.f12065f = false;
    }

    /* renamed from: a */
    public C3794h mo16933a(int i, C3800k kVar, C3842a aVar, C3845b bVar, boolean z, boolean z2) throws IOException, JsonParseException {
        boolean z3 = z;
        if (mo16936b() != C3788d.UTF8 || !z3) {
            boolean z4 = z2;
            C3836f fVar = new C3836f(this.f12060a, i, mo16934a(), kVar, bVar.mo17035a(z, z2));
            return fVar;
        }
        int i2 = i;
        C3800k kVar2 = kVar;
        C3839h hVar = new C3839h(this.f12060a, i2, this.f12061b, kVar2, aVar.mo17015a(z3, z2), this.f12062c, this.f12063d, this.f12064e, this.f12065f);
        return hVar;
    }

    /* renamed from: a */
    public static C3815d m16344a(C3813c cVar) throws IOException {
        if (!cVar.mo16865b()) {
            return C3815d.INCONCLUSIVE;
        }
        byte a = cVar.mo16864a();
        if (a == -17) {
            if (!cVar.mo16865b()) {
                return C3815d.INCONCLUSIVE;
            }
            if (cVar.mo16864a() != -69) {
                return C3815d.NO_MATCH;
            }
            if (!cVar.mo16865b()) {
                return C3815d.INCONCLUSIVE;
            }
            if (cVar.mo16864a() != -65) {
                return C3815d.NO_MATCH;
            }
            if (!cVar.mo16865b()) {
                return C3815d.INCONCLUSIVE;
            }
            a = cVar.mo16864a();
        }
        int a2 = m16343a(cVar, a);
        if (a2 < 0) {
            return C3815d.INCONCLUSIVE;
        }
        if (a2 == 123) {
            int b = m16347b(cVar);
            if (b < 0) {
                return C3815d.INCONCLUSIVE;
            }
            if (b == 34 || b == 125) {
                return C3815d.SOLID_MATCH;
            }
            return C3815d.NO_MATCH;
        } else if (a2 == 91) {
            int b2 = m16347b(cVar);
            if (b2 < 0) {
                return C3815d.INCONCLUSIVE;
            }
            if (b2 == 93 || b2 == 91) {
                return C3815d.SOLID_MATCH;
            }
            return C3815d.SOLID_MATCH;
        } else {
            C3815d dVar = C3815d.WEAK_MATCH;
            if (a2 == 34) {
                return dVar;
            }
            if (a2 <= 57 && a2 >= 48) {
                return dVar;
            }
            if (a2 == 45) {
                int b3 = m16347b(cVar);
                if (b3 < 0) {
                    return C3815d.INCONCLUSIVE;
                }
                if (b3 > 57 || b3 < 48) {
                    dVar = C3815d.NO_MATCH;
                }
                return dVar;
            } else if (a2 == 110) {
                return m16345a(cVar, "ull", dVar);
            } else {
                if (a2 == 116) {
                    return m16345a(cVar, "rue", dVar);
                }
                if (a2 == 102) {
                    return m16345a(cVar, "alse", dVar);
                }
                return C3815d.NO_MATCH;
            }
        }
    }

    /* renamed from: b */
    private static int m16347b(C3813c cVar) throws IOException {
        if (!cVar.mo16865b()) {
            return -1;
        }
        return m16343a(cVar, cVar.mo16864a());
    }

    /* renamed from: b */
    private boolean m16348b(int i) {
        if ((65280 & i) == 0) {
            this.f12067h = true;
        } else if ((i & 255) != 0) {
            return false;
        } else {
            this.f12067h = false;
        }
        this.f12068i = 2;
        return true;
    }

    /* renamed from: a */
    private static C3815d m16345a(C3813c cVar, String str, C3815d dVar) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!cVar.mo16865b()) {
                return C3815d.INCONCLUSIVE;
            }
            if (cVar.mo16864a() != str.charAt(i)) {
                return C3815d.NO_MATCH;
            }
        }
        return dVar;
    }

    /* renamed from: a */
    private static int m16343a(C3813c cVar, byte b) throws IOException {
        while (true) {
            byte b2 = b & 255;
            if (b2 != 32 && b2 != 13 && b2 != 10 && b2 != 9) {
                return b2;
            }
            if (!cVar.mo16865b()) {
                return -1;
            }
            b = cVar.mo16864a();
        }
    }

    /* renamed from: a */
    private void m16346a(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported UCS-4 endianness (");
        sb.append(str);
        sb.append(") detected");
        throw new CharConversionException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo16935a(int i) throws IOException {
        int i2;
        int i3 = this.f12064e - this.f12063d;
        while (i3 < i) {
            InputStream inputStream = this.f12061b;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = this.f12062c;
                int i4 = this.f12064e;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this.f12064e += i2;
            i3 += i2;
        }
        return true;
    }
}
