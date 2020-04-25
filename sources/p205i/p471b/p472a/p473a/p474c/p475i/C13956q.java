package p205i.p471b.p472a.p473a.p474c.p475i;

import com.google.common.base.C5785c;

/* renamed from: i.b.a.a.c.i.q */
/* compiled from: Label */
public class C13956q {

    /* renamed from: m */
    static final int f40676m = 1;

    /* renamed from: n */
    static final int f40677n = 2;

    /* renamed from: o */
    static final int f40678o = 4;

    /* renamed from: p */
    static final int f40679p = 8;

    /* renamed from: q */
    static final int f40680q = 16;

    /* renamed from: r */
    static final int f40681r = 32;

    /* renamed from: s */
    static final int f40682s = 64;

    /* renamed from: t */
    static final int f40683t = 128;

    /* renamed from: u */
    static final int f40684u = 256;

    /* renamed from: v */
    static final int f40685v = 512;

    /* renamed from: w */
    static final int f40686w = 1024;

    /* renamed from: x */
    static final int f40687x = 2048;

    /* renamed from: a */
    public Object f40688a;

    /* renamed from: b */
    int f40689b;

    /* renamed from: c */
    int f40690c;

    /* renamed from: d */
    int f40691d;

    /* renamed from: e */
    private int f40692e;

    /* renamed from: f */
    private int[] f40693f;

    /* renamed from: g */
    int f40694g;

    /* renamed from: h */
    int f40695h;

    /* renamed from: i */
    C13952m f40696i;

    /* renamed from: j */
    C13956q f40697j;

    /* renamed from: k */
    C13949j f40698k;

    /* renamed from: l */
    C13956q f40699l;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44161a(C13958s sVar, C13943d dVar, int i, boolean z) {
        if ((this.f40689b & 2) == 0) {
            if (z) {
                m60050a(-1 - i, dVar.f40485b);
                dVar.mo44072b(-1);
                return;
            }
            m60050a(i, dVar.f40485b);
            dVar.mo44074c(-1);
        } else if (z) {
            dVar.mo44072b(this.f40691d - i);
        } else {
            dVar.mo44074c(this.f40691d - i);
        }
    }

    /* renamed from: b */
    public int mo44165b() {
        if ((this.f40689b & 2) != 0) {
            return this.f40691d;
        }
        throw new IllegalStateException("Label offset position has not been resolved yet");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("L");
        sb.append(System.identityHashCode(this));
        return sb.toString();
    }

    /* renamed from: a */
    private void m60050a(int i, int i2) {
        if (this.f40693f == null) {
            this.f40693f = new int[6];
        }
        int i3 = this.f40692e;
        int[] iArr = this.f40693f;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[(iArr.length + 6)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f40693f = iArr2;
        }
        int[] iArr3 = this.f40693f;
        int i4 = this.f40692e;
        this.f40692e = i4 + 1;
        iArr3[i4] = i;
        int i5 = this.f40692e;
        this.f40692e = i5 + 1;
        iArr3[i5] = i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo44164a(C13958s sVar, int i, byte[] bArr) {
        this.f40689b |= 2;
        this.f40691d = i;
        int i2 = 0;
        boolean z = false;
        while (i2 < this.f40692e) {
            int[] iArr = this.f40693f;
            int i3 = i2 + 1;
            int i4 = iArr[i2];
            int i5 = i3 + 1;
            int i6 = iArr[i3];
            if (i4 >= 0) {
                int i7 = i - i4;
                if (i7 < -32768 || i7 > 32767) {
                    int i8 = i6 - 1;
                    byte b = bArr[i8] & 255;
                    if (b <= 168) {
                        bArr[i8] = (byte) (b + 49);
                    } else {
                        bArr[i8] = (byte) (b + C5785c.f16705x);
                    }
                    z = true;
                }
                int i9 = i6 + 1;
                bArr[i6] = (byte) (i7 >>> 8);
                bArr[i9] = (byte) i7;
            } else {
                int i10 = i4 + i + 1;
                int i11 = i6 + 1;
                bArr[i6] = (byte) (i10 >>> 24);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i10 >>> 16);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (i10 >>> 8);
                bArr[i13] = (byte) i10;
            }
            i2 = i5;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13956q mo44158a() {
        C13952m mVar = this.f40696i;
        return mVar == null ? this : mVar.f40648a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo44162a(long j) {
        if ((this.f40689b & 1024) == 0 || (this.f40693f[(int) (j >>> 32)] & ((int) j)) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo44163a(C13956q qVar) {
        if ((this.f40689b & 1024) != 0 && (qVar.f40689b & 1024) != 0) {
            int i = 0;
            while (true) {
                int[] iArr = this.f40693f;
                if (i >= iArr.length) {
                    break;
                } else if ((iArr[i] & qVar.f40693f[i]) != 0) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44159a(long j, int i) {
        int i2 = this.f40689b;
        if ((i2 & 1024) == 0) {
            this.f40689b = i2 | 1024;
            this.f40693f = new int[((i / 32) + 1)];
        }
        int[] iArr = this.f40693f;
        int i3 = (int) (j >>> 32);
        iArr[i3] = iArr[i3] | ((int) j);
    }

    /* access modifiers changed from: 0000 */
    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:29)
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
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* renamed from: a */
    public void mo44160a(p205i.p471b.p472a.p473a.p474c.p475i.C13956q r6, long r7, int r9) {
        /*
            r5 = this;
            r0 = r5
        L_0x0001:
            if (r0 == 0) goto L_0x005e
            i.b.a.a.c.i.q r1 = r0.f40699l
            r2 = 0
            r0.f40699l = r2
            if (r6 == 0) goto L_0x0037
            int r2 = r0.f40689b
            r3 = r2 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0011
            goto L_0x003d
        L_0x0011:
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r0.f40689b = r2
            int r2 = r0.f40689b
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x0042
            boolean r2 = r0.mo44163a(r6)
            if (r2 != 0) goto L_0x0042
            i.b.a.a.c.i.j r2 = new i.b.a.a.c.i.j
            r2.<init>()
            int r3 = r0.f40694g
            r2.f40607a = r3
            i.b.a.a.c.i.j r3 = r6.f40698k
            i.b.a.a.c.i.q r3 = r3.f40608b
            r2.f40608b = r3
            i.b.a.a.c.i.j r3 = r0.f40698k
            r2.f40609c = r3
            r0.f40698k = r2
            goto L_0x0042
        L_0x0037:
            boolean r2 = r0.mo44162a(r7)
            if (r2 == 0) goto L_0x003f
        L_0x003d:
            r0 = r1
            goto L_0x0001
        L_0x003f:
            r0.mo44159a(r7, r9)
        L_0x0042:
            i.b.a.a.c.i.j r2 = r0.f40698k
        L_0x0044:
            if (r2 == 0) goto L_0x003d
            int r3 = r0.f40689b
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0052
            i.b.a.a.c.i.j r3 = r0.f40698k
            i.b.a.a.c.i.j r3 = r3.f40609c
            if (r2 == r3) goto L_0x005b
        L_0x0052:
            i.b.a.a.c.i.q r3 = r2.f40608b
            i.b.a.a.c.i.q r4 = r3.f40699l
            if (r4 != 0) goto L_0x005b
            r3.f40699l = r1
            r1 = r3
        L_0x005b:
            i.b.a.a.c.i.j r2 = r2.f40609c
            goto L_0x0044
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p471b.p472a.p473a.p474c.p475i.C13956q.mo44160a(i.b.a.a.c.i.q, long, int):void");
    }
}
