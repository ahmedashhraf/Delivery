package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4801i4.C4805d;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.b7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public final class C4699b7 {

    /* renamed from: f */
    private static final C4699b7 f13998f = new C4699b7(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f13999a;

    /* renamed from: b */
    private int[] f14000b;

    /* renamed from: c */
    private Object[] f14001c;

    /* renamed from: d */
    private int f14002d;

    /* renamed from: e */
    private boolean f14003e;

    private C4699b7() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    static C4699b7 m19960a(C4699b7 b7Var, C4699b7 b7Var2) {
        int i = b7Var.f13999a + b7Var2.f13999a;
        int[] copyOf = Arrays.copyOf(b7Var.f14000b, i);
        System.arraycopy(b7Var2.f14000b, 0, copyOf, b7Var.f13999a, b7Var2.f13999a);
        Object[] copyOf2 = Arrays.copyOf(b7Var.f14001c, i);
        System.arraycopy(b7Var2.f14001c, 0, copyOf2, b7Var.f13999a, b7Var2.f13999a);
        return new C4699b7(i, copyOf, copyOf2, true);
    }

    /* renamed from: d */
    public static C4699b7 m19962d() {
        return f13998f;
    }

    /* renamed from: e */
    static C4699b7 m19963e() {
        return new C4699b7();
    }

    /* renamed from: b */
    public final void mo18869b(C5036w7 w7Var) throws IOException {
        if (this.f13999a != 0) {
            if (w7Var.mo19400a() == C4805d.f14198l) {
                for (int i = 0; i < this.f13999a; i++) {
                    m19961a(this.f14000b[i], this.f14001c[i], w7Var);
                }
                return;
            }
            for (int i2 = this.f13999a - 1; i2 >= 0; i2--) {
                m19961a(this.f14000b[i2], this.f14001c[i2], w7Var);
            }
        }
    }

    /* renamed from: c */
    public final int mo18870c() {
        int i;
        int i2 = this.f14002d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f13999a; i4++) {
            int i5 = this.f14000b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zzek.m21946e(i6, ((Long) this.f14001c[i4]).longValue());
            } else if (i7 == 1) {
                i = zzek.m21954g(i6, ((Long) this.f14001c[i4]).longValue());
            } else if (i7 == 2) {
                i = zzek.m21939c(i6, (C5070z2) this.f14001c[i4]);
            } else if (i7 == 3) {
                i = (zzek.m21945e(i6) << 1) + ((C4699b7) this.f14001c[i4]).mo18870c();
            } else if (i7 == 5) {
                i = zzek.m21961i(i6, ((Integer) this.f14001c[i4]).intValue());
            } else {
                throw new IllegalStateException(zzfn.m22033h());
            }
            i3 += i;
        }
        this.f14002d = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4699b7)) {
            return false;
        }
        C4699b7 b7Var = (C4699b7) obj;
        int i = this.f13999a;
        if (i == b7Var.f13999a) {
            int[] iArr = this.f14000b;
            int[] iArr2 = b7Var.f14000b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f14001c;
                Object[] objArr2 = b7Var.f14001c;
                int i3 = this.f13999a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.f13999a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f14000b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f14001c;
        for (int i7 = 0; i7 < this.f13999a; i7++) {
            i3 = (i3 * 31) + objArr[i7].hashCode();
        }
        return i6 + i3;
    }

    private C4699b7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f14002d = -1;
        this.f13999a = i;
        this.f14000b = iArr;
        this.f14001c = objArr;
        this.f14003e = z;
    }

    /* renamed from: a */
    public final void mo18864a() {
        this.f14003e = false;
    }

    /* renamed from: b */
    public final int mo18868b() {
        int i = this.f14002d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13999a; i3++) {
            i2 += zzek.m21943d(this.f14000b[i3] >>> 3, (C5070z2) this.f14001c[i3]);
        }
        this.f14002d = i2;
        return i2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18866a(C5036w7 w7Var) throws IOException {
        if (w7Var.mo19400a() == C4805d.f14199m) {
            for (int i = this.f13999a - 1; i >= 0; i--) {
                w7Var.mo19408a(this.f14000b[i] >>> 3, this.f14001c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f13999a; i2++) {
            w7Var.mo19408a(this.f14000b[i2] >>> 3, this.f14001c[i2]);
        }
    }

    /* renamed from: a */
    private static void m19961a(int i, Object obj, C5036w7 w7Var) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            w7Var.mo19422c(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            w7Var.mo19425d(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            w7Var.mo19407a(i2, (C5070z2) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                w7Var.mo19428e(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzfn.m22033h());
        } else if (w7Var.mo19400a() == C4805d.f14198l) {
            w7Var.mo19401a(i2);
            ((C4699b7) obj).mo18869b(w7Var);
            w7Var.mo19427e(i2);
        } else {
            w7Var.mo19427e(i2);
            ((C4699b7) obj).mo18869b(w7Var);
            w7Var.mo19401a(i2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18867a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f13999a; i2++) {
            C4958s5.m21106a(sb, i, String.valueOf(this.f14000b[i2] >>> 3), this.f14001c[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo18865a(int i, Object obj) {
        if (this.f14003e) {
            int i2 = this.f13999a;
            if (i2 == this.f14000b.length) {
                int i3 = this.f13999a + (i2 < 4 ? 8 : i2 >> 1);
                this.f14000b = Arrays.copyOf(this.f14000b, i3);
                this.f14001c = Arrays.copyOf(this.f14001c, i3);
            }
            int[] iArr = this.f14000b;
            int i4 = this.f13999a;
            iArr[i4] = i;
            this.f14001c[i4] = obj;
            this.f13999a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
