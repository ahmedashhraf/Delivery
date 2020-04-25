package com.fasterxml.jackson.core.p160u;

import androidx.core.p034l.C0986h;
import com.fasterxml.jackson.core.p162w.C3864e;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.fasterxml.jackson.core.u.a */
/* compiled from: BytesToNameCanonicalizer */
public final class C3842a {

    /* renamed from: A */
    private static final int f12147A = 31;

    /* renamed from: q */
    protected static final int f12148q = 64;

    /* renamed from: r */
    protected static final int f12149r = 65536;

    /* renamed from: s */
    static final int f12150s = 6000;

    /* renamed from: t */
    static final int f12151t = 255;

    /* renamed from: u */
    static final int f12152u = 63;

    /* renamed from: v */
    static final int f12153v = 16;

    /* renamed from: w */
    static final int f12154w = 32;

    /* renamed from: x */
    static final int f12155x = 254;

    /* renamed from: y */
    private static final int f12156y = 33;

    /* renamed from: z */
    private static final int f12157z = 65599;

    /* renamed from: a */
    protected final C3842a f12158a;

    /* renamed from: b */
    protected final AtomicReference<C3844b> f12159b;

    /* renamed from: c */
    private final int f12160c;

    /* renamed from: d */
    protected final boolean f12161d;

    /* renamed from: e */
    protected int f12162e;

    /* renamed from: f */
    protected int f12163f;

    /* renamed from: g */
    protected int f12164g;

    /* renamed from: h */
    protected int[] f12165h;

    /* renamed from: i */
    protected C3850f[] f12166i;

    /* renamed from: j */
    protected C3843a[] f12167j;

    /* renamed from: k */
    protected int f12168k;

    /* renamed from: l */
    protected int f12169l;

    /* renamed from: m */
    private transient boolean f12170m;

    /* renamed from: n */
    private boolean f12171n;

    /* renamed from: o */
    private boolean f12172o;

    /* renamed from: p */
    private boolean f12173p;

    /* renamed from: com.fasterxml.jackson.core.u.a$a */
    /* compiled from: BytesToNameCanonicalizer */
    static final class C3843a {

        /* renamed from: a */
        protected final C3850f f12174a;

        /* renamed from: b */
        protected final C3843a f12175b;

        /* renamed from: c */
        private final int f12176c;

        C3843a(C3850f fVar, C3843a aVar) {
            this.f12174a = fVar;
            this.f12175b = aVar;
            int i = 1;
            if (aVar != null) {
                i = 1 + aVar.f12176c;
            }
            this.f12176c = i;
        }

        /* renamed from: a */
        public int mo17028a() {
            return this.f12176c;
        }

        /* renamed from: a */
        public C3850f mo17029a(int i, int i2, int i3) {
            if (this.f12174a.hashCode() == i && this.f12174a.mo17049a(i2, i3)) {
                return this.f12174a;
            }
            for (C3843a aVar = this.f12175b; aVar != null; aVar = aVar.f12175b) {
                C3850f fVar = aVar.f12174a;
                if (fVar.hashCode() == i && fVar.mo17049a(i2, i3)) {
                    return fVar;
                }
            }
            return null;
        }

        /* renamed from: a */
        public C3850f mo17030a(int i, int[] iArr, int i2) {
            if (this.f12174a.hashCode() == i && this.f12174a.mo17050a(iArr, i2)) {
                return this.f12174a;
            }
            for (C3843a aVar = this.f12175b; aVar != null; aVar = aVar.f12175b) {
                C3850f fVar = aVar.f12174a;
                if (fVar.hashCode() == i && fVar.mo17050a(iArr, i2)) {
                    return fVar;
                }
            }
            return null;
        }
    }

    /* renamed from: com.fasterxml.jackson.core.u.a$b */
    /* compiled from: BytesToNameCanonicalizer */
    private static final class C3844b {

        /* renamed from: a */
        public final int f12177a;

        /* renamed from: b */
        public final int f12178b;

        /* renamed from: c */
        public final int[] f12179c;

        /* renamed from: d */
        public final C3850f[] f12180d;

        /* renamed from: e */
        public final C3843a[] f12181e;

        /* renamed from: f */
        public final int f12182f;

        /* renamed from: g */
        public final int f12183g;

        /* renamed from: h */
        public final int f12184h;

        public C3844b(int i, int i2, int[] iArr, C3850f[] fVarArr, C3843a[] aVarArr, int i3, int i4, int i5) {
            this.f12177a = i;
            this.f12178b = i2;
            this.f12179c = iArr;
            this.f12180d = fVarArr;
            this.f12181e = aVarArr;
            this.f12182f = i3;
            this.f12183g = i4;
            this.f12184h = i5;
        }

        public C3844b(C3842a aVar) {
            this.f12177a = aVar.f12162e;
            this.f12178b = aVar.f12164g;
            this.f12179c = aVar.f12165h;
            this.f12180d = aVar.f12166i;
            this.f12181e = aVar.f12167j;
            this.f12182f = aVar.f12168k;
            this.f12183g = aVar.f12169l;
            this.f12184h = aVar.f12163f;
        }
    }

    private C3842a(int i, boolean z, int i2) {
        this.f12158a = null;
        this.f12160c = i2;
        this.f12161d = z;
        int i3 = 16;
        if (i >= 16) {
            if (((i - 1) & i) != 0) {
                while (i3 < i) {
                    i3 += i3;
                }
            } else {
                i3 = i;
            }
        }
        this.f12159b = new AtomicReference<>(m16641e(i3));
    }

    /* renamed from: d */
    protected static C3842a m16640d(int i) {
        return new C3842a(64, true, i);
    }

    /* renamed from: e */
    private C3844b m16641e(int i) {
        C3844b bVar = new C3844b(0, i - 1, new int[i], new C3850f[i], null, 0, 0, 0);
        return bVar;
    }

    /* renamed from: h */
    public static C3842a m16642h() {
        long currentTimeMillis = System.currentTimeMillis();
        return m16640d((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: i */
    private void m16643i() {
        C3843a[] aVarArr = this.f12167j;
        int length = aVarArr.length;
        this.f12167j = new C3843a[(length + length)];
        System.arraycopy(aVarArr, 0, this.f12167j, 0, length);
    }

    /* renamed from: j */
    private int m16644j() {
        C3843a[] aVarArr = this.f12167j;
        int i = this.f12169l;
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int a = aVarArr[i4].mo17028a();
            if (a < i2) {
                if (a == 1) {
                    return i4;
                }
                i3 = i4;
                i2 = a;
            }
        }
        return i3;
    }

    /* renamed from: k */
    public static C3850f m16645k() {
        return C3847c.m16696b();
    }

    /* renamed from: l */
    private void m16646l() {
        this.f12162e = 0;
        this.f12163f = 0;
        Arrays.fill(this.f12165h, 0);
        Arrays.fill(this.f12166i, null);
        Arrays.fill(this.f12167j, null);
        this.f12168k = 0;
        this.f12169l = 0;
    }

    /* renamed from: m */
    private void m16647m() {
        int i;
        this.f12170m = false;
        this.f12172o = false;
        int length = this.f12165h.length;
        int i2 = length + length;
        if (i2 > 65536) {
            m16646l();
            return;
        }
        this.f12165h = new int[i2];
        this.f12164g = i2 - 1;
        C3850f[] fVarArr = this.f12166i;
        this.f12166i = new C3850f[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            C3850f fVar = fVarArr[i4];
            if (fVar != null) {
                i3++;
                int hashCode = fVar.hashCode();
                int i5 = this.f12164g & hashCode;
                this.f12166i[i5] = fVar;
                this.f12165h[i5] = hashCode << 8;
            }
        }
        int i6 = this.f12169l;
        if (i6 == 0) {
            this.f12163f = 0;
            return;
        }
        this.f12168k = 0;
        this.f12169l = 0;
        this.f12173p = false;
        C3843a[] aVarArr = this.f12167j;
        this.f12167j = new C3843a[aVarArr.length];
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            for (C3843a aVar = aVarArr[i8]; aVar != null; aVar = aVar.f12175b) {
                i3++;
                C3850f fVar2 = aVar.f12174a;
                int hashCode2 = fVar2.hashCode();
                int i9 = this.f12164g & hashCode2;
                int[] iArr = this.f12165h;
                int i10 = iArr[i9];
                C3850f[] fVarArr2 = this.f12166i;
                if (fVarArr2[i9] == null) {
                    iArr[i9] = hashCode2 << 8;
                    fVarArr2[i9] = fVar2;
                } else {
                    this.f12168k++;
                    int i11 = i10 & 255;
                    if (i11 == 0) {
                        i = this.f12169l;
                        if (i <= 254) {
                            this.f12169l = i + 1;
                            if (i >= this.f12167j.length) {
                                m16643i();
                            }
                        } else {
                            i = m16644j();
                        }
                        this.f12165h[i9] = (i10 & C0986h.f4419u) | (i + 1);
                    } else {
                        i = i11 - 1;
                    }
                    C3843a aVar2 = new C3843a(fVar2, this.f12167j[i]);
                    this.f12167j[i] = aVar2;
                    i7 = Math.max(i7, aVar2.mo17028a());
                }
            }
        }
        this.f12163f = i7;
        if (i3 != this.f12162e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Internal error: count after rehash ");
            sb.append(i3);
            sb.append("; should be ");
            sb.append(this.f12162e);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: n */
    private void m16648n() {
        C3843a[] aVarArr = this.f12167j;
        if (aVarArr == null) {
            this.f12167j = new C3843a[32];
        } else {
            int length = aVarArr.length;
            this.f12167j = new C3843a[length];
            System.arraycopy(aVarArr, 0, this.f12167j, 0, length);
        }
        this.f12173p = false;
    }

    /* renamed from: o */
    private void m16649o() {
        int[] iArr = this.f12165h;
        int length = iArr.length;
        this.f12165h = new int[length];
        System.arraycopy(iArr, 0, this.f12165h, 0, length);
        this.f12171n = false;
    }

    /* renamed from: p */
    private void m16650p() {
        C3850f[] fVarArr = this.f12166i;
        int length = fVarArr.length;
        this.f12166i = new C3850f[length];
        System.arraycopy(fVarArr, 0, this.f12166i, 0, length);
        this.f12172o = false;
    }

    /* renamed from: a */
    public C3842a mo17015a(boolean z, boolean z2) {
        return new C3842a(this, z2, this.f12160c, (C3844b) this.f12159b.get());
    }

    /* renamed from: b */
    public int mo17018b() {
        return this.f12168k;
    }

    /* renamed from: c */
    public int mo17022c() {
        return this.f12160c;
    }

    /* renamed from: f */
    public void mo17026f() {
        if (this.f12158a != null && mo17025e()) {
            this.f12158a.m16638a(new C3844b(this));
            this.f12171n = true;
            this.f12172o = true;
            this.f12173p = true;
        }
    }

    /* renamed from: g */
    public int mo17027g() {
        AtomicReference<C3844b> atomicReference = this.f12159b;
        if (atomicReference != null) {
            return ((C3844b) atomicReference.get()).f12177a;
        }
        return this.f12162e;
    }

    /* renamed from: a */
    private void m16638a(C3844b bVar) {
        int i = bVar.f12177a;
        C3844b bVar2 = (C3844b) this.f12159b.get();
        if (i > bVar2.f12177a) {
            if (i > f12150s || bVar.f12184h > 63) {
                bVar = m16641e(64);
            }
            this.f12159b.compareAndSet(bVar2, bVar);
        }
    }

    /* renamed from: b */
    public C3850f mo17019b(int i) {
        int a = mo17012a(i);
        int i2 = this.f12164g & a;
        int i3 = this.f12165h[i2];
        if ((((i3 >> 8) ^ a) << 8) == 0) {
            C3850f fVar = this.f12166i[i2];
            if (fVar == null) {
                return null;
            }
            if (fVar.mo17048a(i)) {
                return fVar;
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = i3 & 255;
        if (i4 > 0) {
            C3843a aVar = this.f12167j[i4 - 1];
            if (aVar != null) {
                return aVar.mo17029a(a, i, 0);
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17023c(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Longest collision chain in symbol table (of size ");
        sb.append(this.f12162e);
        sb.append(") now exceeds maximum, ");
        sb.append(i);
        sb.append(" -- suspect a DoS attack based on hash collisions");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public int mo17024d() {
        return this.f12163f;
    }

    /* renamed from: e */
    public boolean mo17025e() {
        return !this.f12171n;
    }

    private C3842a(C3842a aVar, boolean z, int i, C3844b bVar) {
        this.f12158a = aVar;
        this.f12160c = i;
        this.f12161d = z;
        this.f12159b = null;
        this.f12162e = bVar.f12177a;
        this.f12164g = bVar.f12178b;
        this.f12165h = bVar.f12179c;
        this.f12166i = bVar.f12180d;
        this.f12167j = bVar.f12181e;
        this.f12168k = bVar.f12182f;
        this.f12169l = bVar.f12183g;
        this.f12163f = bVar.f12184h;
        this.f12170m = false;
        this.f12171n = true;
        this.f12172o = true;
        this.f12173p = true;
    }

    /* renamed from: a */
    public int mo17011a() {
        return this.f12165h.length;
    }

    /* renamed from: a */
    public C3850f mo17016a(String str, int i, int i2) {
        if (this.f12161d) {
            str = C3864e.f12243b.mo17107b(str);
        }
        int a = i2 == 0 ? mo17012a(i) : mo17013a(i, i2);
        C3850f a2 = m16635a(a, str, i, i2);
        m16637a(a, a2);
        return a2;
    }

    /* renamed from: b */
    public C3850f mo17020b(int i, int i2) {
        int a = i2 == 0 ? mo17012a(i) : mo17013a(i, i2);
        int i3 = this.f12164g & a;
        int i4 = this.f12165h[i3];
        if ((((i4 >> 8) ^ a) << 8) == 0) {
            C3850f fVar = this.f12166i[i3];
            if (fVar == null) {
                return null;
            }
            if (fVar.mo17049a(i, i2)) {
                return fVar;
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = i4 & 255;
        if (i5 > 0) {
            C3843a aVar = this.f12167j[i5 - 1];
            if (aVar != null) {
                return aVar.mo17029a(a, i, i2);
            }
        }
        return null;
    }

    /* renamed from: a */
    public C3850f mo17017a(String str, int[] iArr, int i) {
        if (this.f12161d) {
            str = C3864e.f12243b.mo17107b(str);
        }
        int i2 = i < 3 ? i == 1 ? mo17012a(iArr[0]) : mo17013a(iArr[0], iArr[1]) : mo17014a(iArr, i);
        C3850f a = m16636a(i2, str, iArr, i);
        m16637a(i2, a);
        return a;
    }

    /* renamed from: b */
    public C3850f mo17021b(int[] iArr, int i) {
        if (i < 3) {
            int i2 = 0;
            int i3 = iArr[0];
            if (i >= 2) {
                i2 = iArr[1];
            }
            return mo17020b(i3, i2);
        }
        int a = mo17014a(iArr, i);
        int i4 = this.f12164g & a;
        int i5 = this.f12165h[i4];
        if ((((i5 >> 8) ^ a) << 8) == 0) {
            C3850f fVar = this.f12166i[i4];
            if (fVar == null || fVar.mo17050a(iArr, i)) {
                return fVar;
            }
        } else if (i5 == 0) {
            return null;
        }
        int i6 = i5 & 255;
        if (i6 > 0) {
            C3843a aVar = this.f12167j[i6 - 1];
            if (aVar != null) {
                return aVar.mo17030a(a, iArr, i);
            }
        }
        return null;
    }

    /* renamed from: a */
    public int mo17012a(int i) {
        int i2 = i ^ this.f12160c;
        int i3 = i2 + (i2 >>> 15);
        return i3 ^ (i3 >>> 9);
    }

    /* renamed from: a */
    public int mo17013a(int i, int i2) {
        int i3 = ((i ^ (i >>> 15)) + (i2 * 33)) ^ this.f12160c;
        return i3 + (i3 >>> 7);
    }

    /* renamed from: a */
    public int mo17014a(int[] iArr, int i) {
        if (i >= 3) {
            int i2 = iArr[0] ^ this.f12160c;
            int i3 = (((i2 + (i2 >>> 9)) * 33) + iArr[1]) * f12157z;
            int i4 = (i3 + (i3 >>> 15)) ^ iArr[2];
            int i5 = i4 + (i4 >>> 17);
            for (int i6 = 3; i6 < i; i6++) {
                int i7 = (i5 * 31) ^ iArr[i6];
                int i8 = i7 + (i7 >>> 3);
                i5 = i8 ^ (i8 << 7);
            }
            int i9 = i5 + (i5 >>> 15);
            return (i9 << 9) ^ i9;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    protected static int[] m16639a(byte[] bArr) {
        int length = bArr.length;
        int[] iArr = new int[((length + 3) / 4)];
        int i = 0;
        while (i < length) {
            int i2 = bArr[i] & 255;
            int i3 = i + 1;
            if (i3 < length) {
                i2 = (i2 << 8) | (bArr[i3] & 255);
                i3++;
                if (i3 < length) {
                    i2 = (i2 << 8) | (bArr[i3] & 255);
                    i3++;
                    if (i3 < length) {
                        i2 = (i2 << 8) | (bArr[i3] & 255);
                    }
                }
            }
            iArr[i3 >> 2] = i2;
            i = i3 + 1;
        }
        return iArr;
    }

    /* renamed from: a */
    private void m16637a(int i, C3850f fVar) {
        int i2;
        if (this.f12171n) {
            m16649o();
        }
        if (this.f12170m) {
            m16647m();
        }
        this.f12162e++;
        int i3 = this.f12164g & i;
        if (this.f12166i[i3] == null) {
            this.f12165h[i3] = i << 8;
            if (this.f12172o) {
                m16650p();
            }
            this.f12166i[i3] = fVar;
        } else {
            if (this.f12173p) {
                m16648n();
            }
            this.f12168k++;
            int i4 = this.f12165h[i3];
            int i5 = i4 & 255;
            if (i5 == 0) {
                i2 = this.f12169l;
                if (i2 <= 254) {
                    this.f12169l = i2 + 1;
                    if (i2 >= this.f12167j.length) {
                        m16643i();
                    }
                } else {
                    i2 = m16644j();
                }
                this.f12165h[i3] = (i4 & C0986h.f4419u) | (i2 + 1);
            } else {
                i2 = i5 - 1;
            }
            C3843a aVar = new C3843a(fVar, this.f12167j[i2]);
            this.f12167j[i2] = aVar;
            this.f12163f = Math.max(aVar.mo17028a(), this.f12163f);
            if (this.f12163f > 255) {
                mo17023c(255);
            }
        }
        int length = this.f12165h.length;
        int i6 = this.f12162e;
        if (i6 > (length >> 1)) {
            int i7 = length >> 2;
            if (i6 > length - i7) {
                this.f12170m = true;
            } else if (this.f12168k >= i7) {
                this.f12170m = true;
            }
        }
    }

    /* renamed from: a */
    private static C3850f m16635a(int i, String str, int i2, int i3) {
        if (i3 == 0) {
            return new C3847c(str, i, i2);
        }
        return new C3848d(str, i, i2, i3);
    }

    /* renamed from: a */
    private static C3850f m16636a(int i, String str, int[] iArr, int i2) {
        if (i2 < 4) {
            if (i2 == 1) {
                return new C3847c(str, i, iArr[0]);
            }
            if (i2 == 2) {
                return new C3848d(str, i, iArr[0], iArr[1]);
            }
            if (i2 == 3) {
                C3849e eVar = new C3849e(str, i, iArr[0], iArr[1], iArr[2]);
                return eVar;
            }
        }
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr2[i3] = iArr[i3];
        }
        return new C3851g(str, i, iArr2, i2);
    }
}
