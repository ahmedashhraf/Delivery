package com.google.zxing.p346y.p347c0;

import com.google.zxing.C8929a;
import com.google.zxing.C8974d;
import com.google.zxing.C8985n;
import com.google.zxing.C8987p;
import com.google.zxing.C8988q;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;
import com.google.zxing.p335u.p336m.C9055a;
import com.google.zxing.p346y.C9152r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.y.c0.e */
/* compiled from: RSS14Reader */
public final class C9111e extends C9107a {

    /* renamed from: m */
    private static final int[] f23892m = {1, 10, 34, 70, C13959t.f40823O1};

    /* renamed from: n */
    private static final int[] f23893n = {4, 20, 48, 81};

    /* renamed from: o */
    private static final int[] f23894o = {0, C13959t.f40973x2, 961, 2015, 2715};

    /* renamed from: p */
    private static final int[] f23895p = {0, 336, 1036, 1516};

    /* renamed from: q */
    private static final int[] f23896q = {8, 6, 4, 3, 1};

    /* renamed from: r */
    private static final int[] f23897r = {2, 4, 6, 8};

    /* renamed from: s */
    private static final int[][] f23898s = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: k */
    private final List<C9110d> f23899k = new ArrayList();

    /* renamed from: l */
    private final List<C9110d> f23900l = new ArrayList();

    /* renamed from: b */
    private static C8985n m42613b(C9110d dVar, C9110d dVar2) {
        String valueOf = String.valueOf((((long) dVar.mo33127b()) * 4537077) + ((long) dVar2.mo33127b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        C8987p[] a = dVar.mo33137d().mo33131a();
        C8987p[] a2 = dVar2.mo33137d().mo33131a();
        return new C8985n(String.valueOf(sb.toString()), null, new C8987p[]{a[0], a[1], a2[0], a2[1]}, C8929a.RSS_14);
    }

    /* renamed from: a */
    public C8985n mo33114a(int i, C9043a aVar, Map<C8974d, ?> map) throws NotFoundException {
        m42609a((Collection<C9110d>) this.f23899k, m42608a(aVar, false, i, map));
        aVar.mo32984f();
        m42609a((Collection<C9110d>) this.f23900l, m42608a(aVar, true, i, map));
        aVar.mo32984f();
        for (C9110d dVar : this.f23899k) {
            if (dVar.mo33136c() > 1) {
                for (C9110d dVar2 : this.f23900l) {
                    if (dVar2.mo33136c() > 1 && m42611a(dVar, dVar2)) {
                        return m42613b(dVar, dVar2);
                    }
                }
                continue;
            }
        }
        throw NotFoundException.m41712a();
    }

    public void reset() {
        this.f23899k.clear();
        this.f23900l.clear();
    }

    /* renamed from: a */
    private static void m42609a(Collection<C9110d> collection, C9110d dVar) {
        if (dVar != null) {
            boolean z = false;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9110d dVar2 = (C9110d) it.next();
                if (dVar2.mo33127b() == dVar.mo33127b()) {
                    dVar2.mo33138e();
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(dVar);
            }
        }
    }

    /* renamed from: a */
    private static boolean m42611a(C9110d dVar, C9110d dVar2) {
        int a = (dVar.mo33126a() + (dVar2.mo33126a() * 16)) % 79;
        int c = (dVar.mo33137d().mo33133c() * 9) + dVar2.mo33137d().mo33133c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        return a == c;
    }

    /* renamed from: a */
    private C9110d m42608a(C9043a aVar, boolean z, int i, Map<C8974d, ?> map) {
        C8988q qVar;
        try {
            int[] a = m42612a(aVar, 0, z);
            C9109c a2 = m42607a(aVar, i, z, a);
            if (map == null) {
                qVar = null;
            } else {
                qVar = (C8988q) map.get(C8974d.NEED_RESULT_POINT_CALLBACK);
            }
            if (qVar != null) {
                float f = ((float) (a[0] + a[1])) / 2.0f;
                if (z) {
                    f = ((float) (aVar.mo32979d() - 1)) - f;
                }
                qVar.mo32835a(new C8987p(f, (float) i));
            }
            C9108b a3 = m42606a(aVar, a2, true);
            C9108b a4 = m42606a(aVar, a2, false);
            return new C9110d((a3.mo33127b() * 1597) + a4.mo33127b(), a3.mo33126a() + (a4.mo33126a() * 4), a2);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private C9108b m42606a(C9043a aVar, C9109c cVar, boolean z) throws NotFoundException {
        C9043a aVar2 = aVar;
        boolean z2 = z;
        int[] a = mo33120a();
        a[0] = 0;
        a[1] = 0;
        a[2] = 0;
        a[3] = 0;
        a[4] = 0;
        a[5] = 0;
        a[6] = 0;
        a[7] = 0;
        if (z2) {
            C9152r.m42765b(aVar2, cVar.mo33132b()[0], a);
        } else {
            C9152r.m42763a(aVar2, cVar.mo33132b()[1] + 1, a);
            int i = 0;
            for (int length = a.length - 1; i < length; length--) {
                int i2 = a[i];
                a[i] = a[length];
                a[length] = i2;
                i++;
            }
        }
        int i3 = z2 ? 16 : 15;
        float a2 = ((float) C9055a.m42371a(a)) / ((float) i3);
        int[] e = mo33124e();
        int[] c = mo33122c();
        float[] f = mo33125f();
        float[] d = mo33123d();
        for (int i4 = 0; i4 < a.length; i4++) {
            float f2 = ((float) a[i4]) / a2;
            int i5 = (int) (0.5f + f2);
            if (i5 <= 0) {
                i5 = 1;
            } else if (i5 > 8) {
                i5 = 8;
            }
            int i6 = i4 / 2;
            if ((i4 & 1) == 0) {
                e[i6] = i5;
                f[i6] = f2 - ((float) i5);
            } else {
                c[i6] = i5;
                d[i6] = f2 - ((float) i5);
            }
        }
        m42610a(z2, i3);
        int i7 = 0;
        int i8 = 0;
        for (int length2 = e.length - 1; length2 >= 0; length2--) {
            i7 = (i7 * 9) + e[length2];
            i8 += e[length2];
        }
        int i9 = 0;
        int i10 = 0;
        for (int length3 = c.length - 1; length3 >= 0; length3--) {
            i9 = (i9 * 9) + c[length3];
            i10 += c[length3];
        }
        int i11 = i7 + (i9 * 3);
        if (z2) {
            if ((i8 & 1) != 0 || i8 > 12 || i8 < 4) {
                throw NotFoundException.m41712a();
            }
            int i12 = (12 - i8) / 2;
            int i13 = f23896q[i12];
            int i14 = 9 - i13;
            return new C9108b((C9112f.m42616a(e, i13, false) * f23892m[i12]) + C9112f.m42616a(c, i14, true) + f23894o[i12], i11);
        } else if ((i10 & 1) != 0 || i10 > 10 || i10 < 4) {
            throw NotFoundException.m41712a();
        } else {
            int i15 = (10 - i10) / 2;
            int i16 = f23897r[i15];
            return new C9108b((C9112f.m42616a(c, 9 - i16, false) * f23893n[i15]) + C9112f.m42616a(e, i16, true) + f23895p[i15], i11);
        }
    }

    /* renamed from: a */
    private int[] m42612a(C9043a aVar, int i, boolean z) throws NotFoundException {
        int[] b = mo33121b();
        b[0] = 0;
        b[1] = 0;
        b[2] = 0;
        b[3] = 0;
        int d = aVar.mo32979d();
        boolean z2 = false;
        while (i < d) {
            z2 = !aVar.mo32974b(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = i;
        int i3 = 0;
        while (i < d) {
            if (aVar.mo32974b(i) ^ z2) {
                b[i3] = b[i3] + 1;
            } else {
                if (i3 != 3) {
                    i3++;
                } else if (C9107a.m42591b(b)) {
                    return new int[]{i2, i};
                } else {
                    i2 += b[0] + b[1];
                    b[0] = b[2];
                    b[1] = b[3];
                    b[2] = 0;
                    b[3] = 0;
                    i3--;
                }
                b[i3] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private C9109c m42607a(C9043a aVar, int i, boolean z, int[] iArr) throws NotFoundException {
        int i2;
        int i3;
        boolean b = aVar.mo32974b(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && (aVar.mo32974b(i4) ^ b)) {
            i4--;
        }
        int i5 = i4 + 1;
        int i6 = iArr[0] - i5;
        int[] b2 = mo33121b();
        System.arraycopy(b2, 0, b2, 1, b2.length - 1);
        b2[0] = i6;
        int a = C9107a.m42588a(b2, f23898s);
        int i7 = iArr[1];
        if (z) {
            i2 = (aVar.mo32979d() - 1) - i7;
            i3 = (aVar.mo32979d() - 1) - i5;
        } else {
            i2 = i7;
            i3 = i5;
        }
        C9109c cVar = new C9109c(a, new int[]{i5, iArr[1]}, i3, i2, i);
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r1 < 4) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        if (r1 < 4) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        r7 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m42610a(boolean r10, int r11) throws com.google.zxing.NotFoundException {
        /*
            r9 = this;
            int[] r0 = r9.mo33124e()
            int r0 = com.google.zxing.p335u.p336m.C9055a.m42371a(r0)
            int[] r1 = r9.mo33122c()
            int r1 = com.google.zxing.p335u.p336m.C9055a.m42371a(r1)
            r2 = 4
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x002c
            r5 = 12
            if (r0 <= r5) goto L_0x001c
            r6 = 0
            r7 = 1
            goto L_0x0022
        L_0x001c:
            if (r0 >= r2) goto L_0x0020
            r6 = 1
            goto L_0x0021
        L_0x0020:
            r6 = 0
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r1 <= r5) goto L_0x0027
            r5 = r6
            r6 = r7
            goto L_0x003e
        L_0x0027:
            r5 = r6
            r6 = r7
            if (r1 >= r2) goto L_0x0045
            goto L_0x0043
        L_0x002c:
            r5 = 11
            if (r0 <= r5) goto L_0x0033
            r5 = 0
            r6 = 1
            goto L_0x003a
        L_0x0033:
            r5 = 5
            if (r0 >= r5) goto L_0x0038
            r5 = 1
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            r6 = 0
        L_0x003a:
            r7 = 10
            if (r1 <= r7) goto L_0x0041
        L_0x003e:
            r2 = 0
            r7 = 1
            goto L_0x0047
        L_0x0041:
            if (r1 >= r2) goto L_0x0045
        L_0x0043:
            r2 = 1
            goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            r7 = 0
        L_0x0047:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r10) goto L_0x0050
            r10 = 1
            goto L_0x0051
        L_0x0050:
            r10 = 0
        L_0x0051:
            r11 = r1 & 1
            if (r11 != r4) goto L_0x0056
            r3 = 1
        L_0x0056:
            if (r8 != r4) goto L_0x006c
            if (r10 == 0) goto L_0x0063
            if (r3 != 0) goto L_0x005e
        L_0x005c:
            r6 = 1
            goto L_0x0096
        L_0x005e:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m41712a()
            throw r10
        L_0x0063:
            if (r3 == 0) goto L_0x0067
        L_0x0065:
            r7 = 1
            goto L_0x0096
        L_0x0067:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m41712a()
            throw r10
        L_0x006c:
            r11 = -1
            if (r8 != r11) goto L_0x0083
            if (r10 == 0) goto L_0x007a
            if (r3 != 0) goto L_0x0075
            r5 = 1
            goto L_0x0096
        L_0x0075:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m41712a()
            throw r10
        L_0x007a:
            if (r3 == 0) goto L_0x007e
            r2 = 1
            goto L_0x0096
        L_0x007e:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m41712a()
            throw r10
        L_0x0083:
            if (r8 != 0) goto L_0x00e0
            if (r10 == 0) goto L_0x0094
            if (r3 == 0) goto L_0x008f
            if (r0 >= r1) goto L_0x008d
            r5 = 1
            goto L_0x0065
        L_0x008d:
            r2 = 1
            goto L_0x005c
        L_0x008f:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m41712a()
            throw r10
        L_0x0094:
            if (r3 != 0) goto L_0x00db
        L_0x0096:
            if (r5 == 0) goto L_0x00ab
            if (r6 != 0) goto L_0x00a6
            int[] r10 = r9.mo33124e()
            float[] r11 = r9.mo33125f()
            com.google.zxing.p346y.p347c0.C9107a.m42590b(r10, r11)
            goto L_0x00ab
        L_0x00a6:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m41712a()
            throw r10
        L_0x00ab:
            if (r6 == 0) goto L_0x00b8
            int[] r10 = r9.mo33124e()
            float[] r11 = r9.mo33125f()
            com.google.zxing.p346y.p347c0.C9107a.m42589a(r10, r11)
        L_0x00b8:
            if (r2 == 0) goto L_0x00cd
            if (r7 != 0) goto L_0x00c8
            int[] r10 = r9.mo33122c()
            float[] r11 = r9.mo33125f()
            com.google.zxing.p346y.p347c0.C9107a.m42590b(r10, r11)
            goto L_0x00cd
        L_0x00c8:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m41712a()
            throw r10
        L_0x00cd:
            if (r7 == 0) goto L_0x00da
            int[] r10 = r9.mo33122c()
            float[] r11 = r9.mo33123d()
            com.google.zxing.p346y.p347c0.C9107a.m42589a(r10, r11)
        L_0x00da:
            return
        L_0x00db:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m41712a()
            throw r10
        L_0x00e0:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m41712a()
            goto L_0x00e6
        L_0x00e5:
            throw r10
        L_0x00e6:
            goto L_0x00e5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p346y.p347c0.C9111e.m42610a(boolean, int):void");
    }
}
