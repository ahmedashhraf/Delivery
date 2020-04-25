package com.google.zxing.p325a0.p327d;

import com.google.zxing.C8974d;
import com.google.zxing.C8987p;
import com.google.zxing.C8988q;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9044b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.jcodec.codecs.mjpeg.JpegConst;

/* renamed from: com.google.zxing.a0.d.e */
/* compiled from: FinderPatternFinder */
public class C8956e {

    /* renamed from: f */
    private static final int f23413f = 2;

    /* renamed from: g */
    protected static final int f23414g = 3;

    /* renamed from: h */
    protected static final int f23415h = 57;

    /* renamed from: a */
    private final C9044b f23416a;

    /* renamed from: b */
    private final List<C8955d> f23417b;

    /* renamed from: c */
    private boolean f23418c;

    /* renamed from: d */
    private final int[] f23419d;

    /* renamed from: e */
    private final C8988q f23420e;

    /* renamed from: com.google.zxing.a0.d.e$b */
    /* compiled from: FinderPatternFinder */
    private static final class C8958b implements Serializable, Comparator<C8955d> {

        /* renamed from: a */
        private final float f23421a;

        /* renamed from: a */
        public int compare(C8955d dVar, C8955d dVar2) {
            if (dVar2.mo32723c() != dVar.mo32723c()) {
                return dVar2.mo32723c() - dVar.mo32723c();
            }
            float abs = Math.abs(dVar2.mo32724d() - this.f23421a);
            float abs2 = Math.abs(dVar.mo32724d() - this.f23421a);
            if (abs < abs2) {
                return 1;
            }
            return abs == abs2 ? 0 : -1;
        }

        private C8958b(float f) {
            this.f23421a = f;
        }
    }

    /* renamed from: com.google.zxing.a0.d.e$c */
    /* compiled from: FinderPatternFinder */
    private static final class C8959c implements Serializable, Comparator<C8955d> {

        /* renamed from: a */
        private final float f23422a;

        /* renamed from: a */
        public int compare(C8955d dVar, C8955d dVar2) {
            float abs = Math.abs(dVar2.mo32724d() - this.f23422a);
            float abs2 = Math.abs(dVar.mo32724d() - this.f23422a);
            if (abs < abs2) {
                return -1;
            }
            return abs == abs2 ? 0 : 1;
        }

        private C8959c(float f) {
            this.f23422a = f;
        }
    }

    public C8956e(C9044b bVar) {
        this(bVar, null);
    }

    /* renamed from: c */
    private float m41811c(int i, int i2, int i3, int i4) {
        C9044b bVar = this.f23416a;
        int e = bVar.mo33001e();
        int[] d = m41813d();
        int i5 = i;
        while (i5 >= 0 && bVar.mo32995b(i2, i5)) {
            d[2] = d[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo32995b(i2, i5) && d[1] <= i3) {
            d[1] = d[1] + 1;
            i5--;
        }
        if (i5 >= 0 && d[1] <= i3) {
            while (i5 >= 0 && bVar.mo32995b(i2, i5) && d[0] <= i3) {
                d[0] = d[0] + 1;
                i5--;
            }
            if (d[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < e && bVar.mo32995b(i2, i6)) {
                d[2] = d[2] + 1;
                i6++;
            }
            if (i6 == e) {
                return Float.NaN;
            }
            while (i6 < e && !bVar.mo32995b(i2, i6) && d[3] < i3) {
                d[3] = d[3] + 1;
                i6++;
            }
            if (i6 != e && d[3] < i3) {
                while (i6 < e && bVar.mo32995b(i2, i6) && d[4] < i3) {
                    d[4] = d[4] + 1;
                    i6++;
                }
                if (d[4] < i3 && Math.abs(((((d[0] + d[1]) + d[2]) + d[3]) + d[4]) - i4) * 5 < i4 * 2 && m41809a(d)) {
                    return m41807a(d, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private int[] m41813d() {
        int[] iArr = this.f23419d;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        return iArr;
    }

    /* renamed from: e */
    private boolean m41814e() {
        int size = this.f23417b.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (C8955d dVar : this.f23417b) {
            if (dVar.mo32723c() >= 2) {
                i++;
                f2 += dVar.mo32724d();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (C8955d d : this.f23417b) {
            f += Math.abs(d.mo32724d() - f3);
        }
        if (f <= f2 * 0.05f) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private C8955d[] m41815f() throws NotFoundException {
        int size = this.f23417b.size();
        if (size >= 3) {
            float f = 0.0f;
            if (size > 3) {
                float f2 = 0.0f;
                float f3 = 0.0f;
                for (C8955d d : this.f23417b) {
                    float d2 = d.mo32724d();
                    f2 += d2;
                    f3 += d2 * d2;
                }
                float f4 = (float) size;
                float f5 = f2 / f4;
                float sqrt = (float) Math.sqrt((double) ((f3 / f4) - (f5 * f5)));
                Collections.sort(this.f23417b, new C8959c(f5));
                float max = Math.max(0.2f * f5, sqrt);
                int i = 0;
                while (i < this.f23417b.size() && this.f23417b.size() > 3) {
                    if (Math.abs(((C8955d) this.f23417b.get(i)).mo32724d() - f5) > max) {
                        this.f23417b.remove(i);
                        i--;
                    }
                    i++;
                }
            }
            if (this.f23417b.size() > 3) {
                for (C8955d d3 : this.f23417b) {
                    f += d3.mo32724d();
                }
                Collections.sort(this.f23417b, new C8958b(f / ((float) this.f23417b.size())));
                List<C8955d> list = this.f23417b;
                list.subList(3, list.size()).clear();
            }
            return new C8955d[]{(C8955d) this.f23417b.get(0), (C8955d) this.f23417b.get(1), (C8955d) this.f23417b.get(2)};
        }
        throw NotFoundException.m41712a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C9044b mo32726a() {
        return this.f23416a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List<C8955d> mo32728b() {
        return this.f23417b;
    }

    public C8956e(C9044b bVar, C8988q qVar) {
        this.f23416a = bVar;
        this.f23417b = new ArrayList();
        this.f23419d = new int[5];
        this.f23420e = qVar;
    }

    /* renamed from: b */
    private float m41810b(int i, int i2, int i3, int i4) {
        C9044b bVar = this.f23416a;
        int h = bVar.mo33005h();
        int[] d = m41813d();
        int i5 = i;
        while (i5 >= 0 && bVar.mo32995b(i5, i2)) {
            d[2] = d[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo32995b(i5, i2) && d[1] <= i3) {
            d[1] = d[1] + 1;
            i5--;
        }
        if (i5 >= 0 && d[1] <= i3) {
            while (i5 >= 0 && bVar.mo32995b(i5, i2) && d[0] <= i3) {
                d[0] = d[0] + 1;
                i5--;
            }
            if (d[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < h && bVar.mo32995b(i6, i2)) {
                d[2] = d[2] + 1;
                i6++;
            }
            if (i6 == h) {
                return Float.NaN;
            }
            while (i6 < h && !bVar.mo32995b(i6, i2) && d[3] < i3) {
                d[3] = d[3] + 1;
                i6++;
            }
            if (i6 != h && d[3] < i3) {
                while (i6 < h && bVar.mo32995b(i6, i2) && d[4] < i3) {
                    d[4] = d[4] + 1;
                    i6++;
                }
                if (d[4] < i3 && Math.abs(((((d[0] + d[1]) + d[2]) + d[3]) + d[4]) - i4) * 5 < i4 && m41809a(d)) {
                    return m41807a(d, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C8960f mo32725a(Map<C8974d, ?> map) throws NotFoundException {
        Map<C8974d, ?> map2 = map;
        boolean z = map2 != null && map2.containsKey(C8974d.TRY_HARDER);
        boolean z2 = map2 != null && map2.containsKey(C8974d.PURE_BARCODE);
        int e = this.f23416a.mo33001e();
        int h = this.f23416a.mo33005h();
        int i = (e * 3) / JpegConst.APP4;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        int i3 = i;
        boolean z3 = false;
        while (i2 < e && !z3) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            boolean z4 = z3;
            int i4 = i3;
            int i5 = 0;
            int i6 = 0;
            while (i5 < h) {
                if (this.f23416a.mo32995b(i5, i2)) {
                    if ((i6 & 1) == 1) {
                        i6++;
                    }
                    iArr[i6] = iArr[i6] + 1;
                } else if ((i6 & 1) != 0) {
                    iArr[i6] = iArr[i6] + 1;
                } else if (i6 == 4) {
                    if (!m41809a(iArr)) {
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = 1;
                        iArr[4] = 0;
                    } else if (mo32727a(iArr, i2, i5, z2)) {
                        if (this.f23418c) {
                            z4 = m41814e();
                        } else {
                            int c = m41812c();
                            if (c > iArr[2]) {
                                i2 += (c - iArr[2]) - 2;
                                i5 = h - 1;
                            }
                        }
                        iArr[0] = 0;
                        iArr[1] = 0;
                        iArr[2] = 0;
                        iArr[3] = 0;
                        iArr[4] = 0;
                        i6 = 0;
                        i4 = 2;
                    } else {
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = 1;
                        iArr[4] = 0;
                    }
                    i6 = 3;
                } else {
                    i6++;
                    iArr[i6] = iArr[i6] + 1;
                }
                i5++;
            }
            if (!m41809a(iArr) || !mo32727a(iArr, i2, h, z2)) {
                i3 = i4;
            } else {
                int i7 = iArr[0];
                if (this.f23418c) {
                    i3 = i7;
                    z3 = m41814e();
                    i2 += i3;
                } else {
                    i3 = i7;
                }
            }
            z3 = z4;
            i2 += i3;
        }
        C8955d[] f = m41815f();
        C8987p.m41992a(f);
        return new C8960f(f);
    }

    /* renamed from: c */
    private int m41812c() {
        if (this.f23417b.size() <= 1) {
            return 0;
        }
        C8955d dVar = null;
        for (C8955d dVar2 : this.f23417b) {
            if (dVar2.mo32723c() >= 2) {
                if (dVar == null) {
                    dVar = dVar2;
                } else {
                    this.f23418c = true;
                    return ((int) (Math.abs(dVar.mo32830a() - dVar2.mo32830a()) - Math.abs(dVar.mo32831b() - dVar2.mo32831b()))) / 2;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static float m41807a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    /* renamed from: a */
    protected static boolean m41809a(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - ((float) iArr[0])) >= f2 || Math.abs(f - ((float) iArr[1])) >= f2 || Math.abs((f * 3.0f) - ((float) iArr[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr[3])) >= f2 || Math.abs(f - ((float) iArr[4])) >= f2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m41808a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int[] d = m41813d();
        int i10 = 0;
        while (i7 >= i10 && i8 >= i10 && this.f23416a.mo32995b(i8 - i10, i7 - i10)) {
            d[2] = d[2] + 1;
            i10++;
        }
        if (i7 >= i10 && i8 >= i10) {
            while (i7 >= i10 && i8 >= i10 && !this.f23416a.mo32995b(i8 - i10, i7 - i10) && d[1] <= i9) {
                d[1] = d[1] + 1;
                i10++;
            }
            if (i7 >= i10 && i8 >= i10 && d[1] <= i9) {
                while (i7 >= i10 && i8 >= i10 && this.f23416a.mo32995b(i8 - i10, i7 - i10) && d[0] <= i9) {
                    d[0] = d[0] + 1;
                    i10++;
                }
                if (d[0] > i9) {
                    return false;
                }
                int e = this.f23416a.mo33001e();
                int h = this.f23416a.mo33005h();
                int i11 = 1;
                while (true) {
                    i5 = i7 + i11;
                    if (i5 >= e) {
                        break;
                    }
                    int i12 = i8 + i11;
                    if (i12 >= h || !this.f23416a.mo32995b(i12, i5)) {
                        break;
                    }
                    d[2] = d[2] + 1;
                    i11++;
                }
                if (i5 < e && i8 + i11 < h) {
                    while (true) {
                        i6 = i7 + i11;
                        if (i6 >= e) {
                            break;
                        }
                        int i13 = i8 + i11;
                        if (i13 >= h || this.f23416a.mo32995b(i13, i6) || d[3] >= i9) {
                            break;
                        }
                        d[3] = d[3] + 1;
                        i11++;
                    }
                    if (i6 < e && i8 + i11 < h && d[3] < i9) {
                        while (true) {
                            int i14 = i7 + i11;
                            if (i14 >= e) {
                                break;
                            }
                            int i15 = i8 + i11;
                            if (i15 >= h || !this.f23416a.mo32995b(i15, i14) || d[4] >= i9) {
                                break;
                            }
                            d[4] = d[4] + 1;
                            i11++;
                        }
                        if (d[4] < i9 && Math.abs(((((d[0] + d[1]) + d[2]) + d[3]) + d[4]) - i4) < i4 * 2 && m41809a(d)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo32727a(int[] iArr, int i, int i2, boolean z) {
        boolean z2 = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a = (int) m41807a(iArr, i2);
        float c = m41811c(i, a, iArr[2], i3);
        if (!Float.isNaN(c)) {
            int i4 = (int) c;
            float b = m41810b(a, i4, iArr[2], i3);
            if (!Float.isNaN(b) && (!z || m41808a(i4, (int) b, iArr[2], i3))) {
                float f = ((float) i3) / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f23417b.size()) {
                        break;
                    }
                    C8955d dVar = (C8955d) this.f23417b.get(i5);
                    if (dVar.mo32721a(f, c, b)) {
                        this.f23417b.set(i5, dVar.mo32722b(c, b, f));
                        z2 = true;
                        break;
                    }
                    i5++;
                }
                if (!z2) {
                    C8955d dVar2 = new C8955d(b, c, f);
                    this.f23417b.add(dVar2);
                    C8988q qVar = this.f23420e;
                    if (qVar != null) {
                        qVar.mo32835a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
