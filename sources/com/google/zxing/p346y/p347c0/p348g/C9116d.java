package com.google.zxing.p346y.p347c0.p348g;

import com.google.zxing.C8929a;
import com.google.zxing.C8974d;
import com.google.zxing.C8985n;
import com.google.zxing.C8987p;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;
import com.google.zxing.p335u.p336m.C9055a;
import com.google.zxing.p346y.C9152r;
import com.google.zxing.p346y.p347c0.C9107a;
import com.google.zxing.p346y.p347c0.C9108b;
import com.google.zxing.p346y.p347c0.C9109c;
import com.google.zxing.p346y.p347c0.C9112f;
import com.google.zxing.p346y.p347c0.p348g.p349e.C9126j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.C15470v;
import org.jcodec.codecs.mjpeg.JpegConst;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.y.c0.g.d */
/* compiled from: RSSExpandedReader */
public final class C9116d extends C9107a {

    /* renamed from: A */
    private static final int f23908A = 11;

    /* renamed from: o */
    private static final int[] f23909o = {7, 5, 4, 3, 1};

    /* renamed from: p */
    private static final int[] f23910p = {4, 20, 52, 104, 204};

    /* renamed from: q */
    private static final int[] f23911q = {0, 348, 1388, 2948, 3988};

    /* renamed from: r */
    private static final int[][] f23912r = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: s */
    private static final int[][] f23913s = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, C13959t.f40897f2, 7, 21, 63}, new int[]{C13959t.f40868Z2, C13959t.f40907h2, 13, 39, 117, C13959t.f40882c2, JpegConst.RST1, C15470v.f44668i}, new int[]{193, C13959t.f40957t2, 49, C13959t.f40917j2, 19, 57, C13959t.f40796H2, 91}, new int[]{62, C13959t.f40856W2, C13959t.f40863Y1, C13959t.f40903g3, C13959t.f40788F2, 85, 44, C13959t.f40847U1}, new int[]{C13959t.f40852V2, C13959t.f40851V1, C13959t.f40864Y2, C13959t.f40892e2, 4, 12, 36, 108}, new int[]{113, 128, C13959t.f40804J2, 97, 80, 29, 87, 50}, new int[]{C13959t.f40929m2, 28, 84, 41, 123, C13959t.f40961u2, 52, C13959t.f40953s2}, new int[]{46, C13959t.f40872a2, 203, C13959t.f40860X2, C13959t.f40877b2, C15470v.f44669j, JpegConst.DHT, C13959t.f40776C2}, new int[]{76, 17, 51, C13959t.f40941p2, 37, 111, 122, C13959t.f40949r2}, new int[]{43, C13959t.f40835R1, C13959t.f40816M2, 106, 107, 110, 119, C13959t.f40912i2}, new int[]{16, 48, C13959t.f40902g2, 10, 30, 90, 59, C13959t.f40820N2}, new int[]{109, 116, C13959t.f40867Z1, 200, 178, 112, C13959t.f40819N1, C13959t.f40768A2}, new int[]{70, JpegConst.RST2, 208, C15470v.f44665f, 184, C13959t.f40839S1, 179, 115}, new int[]{C13959t.f40855W1, C13959t.f40878b3, C13959t.f40933n2, 31, 93, 68, 204, 190}, new int[]{C13959t.f40921k2, 22, 66, C13959t.f40908h3, C13959t.f40800I2, 94, 71, 2}, new int[]{6, 18, 54, C13959t.f40977y2, 64, 192, C13959t.f40945q2, 40}, new int[]{120, C13959t.f40925l2, 25, 75, 14, 42, C13959t.f40823O1, C13959t.f40780D2}, new int[]{79, 26, 78, 23, 69, C15470v.f44670k, C13959t.f40913i3, 175}, new int[]{103, 98, 83, 38, 114, C13959t.f40843T1, C13959t.f40840S2, 124}, new int[]{C13959t.f40973x2, 61, 183, C13959t.f40827P1, C13959t.f40792G2, 88, 53, C13959t.f40965v2}, new int[]{55, C13959t.f40772B2, 73, 8, 24, 72, 5, 15}, new int[]{45, C13959t.f40859X1, 194, C13959t.f40969w2, 58, C13959t.f40808K2, 100, 89}};

    /* renamed from: t */
    private static final int f23914t = 0;

    /* renamed from: u */
    private static final int f23915u = 1;

    /* renamed from: v */
    private static final int f23916v = 2;

    /* renamed from: w */
    private static final int f23917w = 3;

    /* renamed from: x */
    private static final int f23918x = 4;

    /* renamed from: y */
    private static final int f23919y = 5;

    /* renamed from: z */
    private static final int[][] f23920z = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: k */
    private final List<C9114b> f23921k = new ArrayList(11);

    /* renamed from: l */
    private final List<C9115c> f23922l = new ArrayList();

    /* renamed from: m */
    private final int[] f23923m = new int[2];

    /* renamed from: n */
    private boolean f23924n;

    /* renamed from: b */
    private static boolean m42640b(List<C9114b> list) {
        int[][] iArr;
        boolean z;
        for (int[] iArr2 : f23920z) {
            if (list.size() <= iArr2.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    } else if (((C9114b) list.get(i)).mo33139a().mo33133c() != iArr2[i]) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private static void m42641c(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: h */
    private boolean m42642h() {
        C9114b bVar = (C9114b) this.f23921k.get(0);
        C9108b b = bVar.mo33140b();
        C9108b c = bVar.mo33141c();
        if (c == null) {
            return false;
        }
        int a = c.mo33126a();
        int i = 2;
        for (int i2 = 1; i2 < this.f23921k.size(); i2++) {
            C9114b bVar2 = (C9114b) this.f23921k.get(i2);
            a += bVar2.mo33140b().mo33126a();
            i++;
            C9108b c2 = bVar2.mo33141c();
            if (c2 != null) {
                a += c2.mo33126a();
                i++;
            }
        }
        if (((i - 4) * JpegConst.RST3) + (a % JpegConst.RST3) == b.mo33127b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C8985n mo33114a(int i, C9043a aVar, Map<C8974d, ?> map) throws NotFoundException, FormatException {
        this.f23921k.clear();
        this.f23924n = false;
        try {
            return m42630a(mo33156a(i, aVar));
        } catch (NotFoundException unused) {
            this.f23921k.clear();
            this.f23924n = true;
            return m42630a(mo33156a(i, aVar));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public List<C9115c> mo33157g() {
        return this.f23922l;
    }

    public void reset() {
        this.f23921k.clear();
        this.f23922l.clear();
    }

    /* renamed from: b */
    private void m42639b(C9043a aVar, List<C9114b> list, int i) throws NotFoundException {
        int[] b = mo33121b();
        b[0] = 0;
        b[1] = 0;
        b[2] = 0;
        b[3] = 0;
        int d = aVar.mo32979d();
        if (i < 0) {
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = ((C9114b) list.get(list.size() - 1)).mo33139a().mo33132b()[1];
            }
        }
        boolean z = list.size() % 2 != 0;
        if (this.f23924n) {
            z = !z;
        }
        boolean z2 = false;
        while (i < d) {
            z2 = !aVar.mo32974b(i);
            if (!z2) {
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
                if (i3 == 3) {
                    if (z) {
                        m42641c(b);
                    }
                    if (C9107a.m42591b(b)) {
                        int[] iArr = this.f23923m;
                        iArr[0] = i2;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m42641c(b);
                    }
                    i2 += b[0] + b[1];
                    b[0] = b[2];
                    b[1] = b[3];
                    b[2] = 0;
                    b[3] = 0;
                    i3--;
                } else {
                    i3++;
                }
                b[i3] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw NotFoundException.m41712a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C9114b> mo33156a(int i, C9043a aVar) throws NotFoundException {
        while (true) {
            try {
                this.f23921k.add(mo33155a(aVar, this.f23921k, i));
            } catch (NotFoundException e) {
                if (this.f23921k.isEmpty()) {
                    throw e;
                } else if (m42642h()) {
                    return this.f23921k;
                } else {
                    boolean z = !this.f23922l.isEmpty();
                    m42635a(i, false);
                    if (z) {
                        List<C9114b> a = m42633a(false);
                        if (a != null) {
                            return a;
                        }
                        List<C9114b> a2 = m42633a(true);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                    throw NotFoundException.m41712a();
                }
            }
        }
    }

    /* renamed from: a */
    private List<C9114b> m42633a(boolean z) {
        List<C9114b> list = null;
        if (this.f23922l.size() > 25) {
            this.f23922l.clear();
            return null;
        }
        this.f23921k.clear();
        if (z) {
            Collections.reverse(this.f23922l);
        }
        try {
            list = m42632a((List<C9115c>) new ArrayList<C9115c>(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.f23922l);
        }
        return list;
    }

    /* renamed from: a */
    private List<C9114b> m42632a(List<C9115c> list, int i) throws NotFoundException {
        while (i < this.f23922l.size()) {
            C9115c cVar = (C9115c) this.f23922l.get(i);
            this.f23921k.clear();
            for (C9115c a : list) {
                this.f23921k.addAll(a.mo33147a());
            }
            this.f23921k.addAll(cVar.mo33147a());
            if (!m42640b(this.f23921k)) {
                i++;
            } else if (m42642h()) {
                return this.f23921k;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.add(cVar);
                try {
                    return m42632a((List<C9115c>) arrayList, i + 1);
                } catch (NotFoundException unused) {
                }
            }
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private void m42635a(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f23922l.size()) {
                break;
            }
            C9115c cVar = (C9115c) this.f23922l.get(i2);
            if (cVar.mo33149b() > i) {
                z2 = cVar.mo33148a(this.f23921k);
                break;
            } else {
                z3 = cVar.mo33148a(this.f23921k);
                i2++;
            }
        }
        if (!z2 && !z3 && !m42638a((Iterable<C9114b>) this.f23921k, (Iterable<C9115c>) this.f23922l)) {
            this.f23922l.add(i2, new C9115c(this.f23921k, i, z));
            m42636a(this.f23921k, this.f23922l);
        }
    }

    /* renamed from: a */
    private static void m42636a(List<C9114b> list, List<C9115c> list2) {
        boolean z;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C9115c cVar = (C9115c) it.next();
            if (cVar.mo33147a().size() != list.size()) {
                Iterator it2 = cVar.mo33147a().iterator();
                while (true) {
                    z = false;
                    boolean z2 = true;
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                    C9114b bVar = (C9114b) it2.next();
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (bVar.equals((C9114b) it3.next())) {
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m42638a(Iterable<C9114b> iterable, Iterable<C9115c> iterable2) {
        boolean z;
        boolean z2;
        Iterator it = iterable2.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                C9115c cVar = (C9115c) it.next();
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        continue;
                        break;
                    }
                    C9114b bVar = (C9114b) it2.next();
                    Iterator it3 = cVar.mo33147a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (bVar.equals((C9114b) it3.next())) {
                                z2 = true;
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    /* renamed from: a */
    static C8985n m42630a(List<C9114b> list) throws NotFoundException, FormatException {
        String c = C9126j.m42666a(C9113a.m42617a(list)).mo33160c();
        C8987p[] a = ((C9114b) list.get(0)).mo33139a().mo33131a();
        C8987p[] a2 = ((C9114b) list.get(list.size() - 1)).mo33139a().mo33131a();
        return new C8985n(c, null, new C8987p[]{a[0], a[1], a2[0], a2[1]}, C8929a.RSS_EXPANDED);
    }

    /* renamed from: a */
    private static int m42629a(C9043a aVar, int i) {
        if (aVar.mo32974b(i)) {
            return aVar.mo32975c(aVar.mo32980d(i));
        }
        return aVar.mo32980d(aVar.mo32975c(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9114b mo33155a(C9043a aVar, List<C9114b> list, int i) throws NotFoundException {
        C9109c a;
        C9108b bVar;
        boolean z = list.size() % 2 == 0;
        if (this.f23924n) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m42639b(aVar, list, i2);
            a = m42631a(aVar, i, z);
            if (a == null) {
                i2 = m42629a(aVar, this.f23923m[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        C9108b a2 = mo33154a(aVar, a, z, true);
        if (list.isEmpty() || !((C9114b) list.get(list.size() - 1)).mo33143e()) {
            try {
                bVar = mo33154a(aVar, a, z, false);
            } catch (NotFoundException unused) {
                bVar = null;
            }
            return new C9114b(a2, bVar, a, true);
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private C9109c m42631a(C9043a aVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f23923m[0] - 1;
            while (i5 >= 0 && !aVar.mo32974b(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f23923m;
            int i7 = iArr[0] - i6;
            i3 = iArr[1];
            i4 = i6;
            i2 = i7;
        } else {
            int[] iArr2 = this.f23923m;
            int i8 = iArr2[0];
            int d = aVar.mo32980d(iArr2[1] + 1);
            i2 = d - this.f23923m[1];
            i3 = d;
            i4 = i8;
        }
        int[] b = mo33121b();
        System.arraycopy(b, 0, b, 1, b.length - 1);
        b[0] = i2;
        try {
            C9109c cVar = new C9109c(C9107a.m42588a(b, f23912r), new int[]{i4, i3}, i4, i3, i);
            return cVar;
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9108b mo33154a(C9043a aVar, C9109c cVar, boolean z, boolean z2) throws NotFoundException {
        C9043a aVar2 = aVar;
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
            C9152r.m42763a(aVar2, cVar.mo33132b()[1], a);
            int i = 0;
            for (int length = a.length - 1; i < length; length--) {
                int i2 = a[i];
                a[i] = a[length];
                a[length] = i2;
                i++;
            }
        }
        float a2 = ((float) C9055a.m42371a(a)) / 17.0f;
        float f = ((float) (cVar.mo33132b()[1] - cVar.mo33132b()[0])) / 15.0f;
        if (Math.abs(a2 - f) / f <= 0.3f) {
            int[] e = mo33124e();
            int[] c = mo33122c();
            float[] f2 = mo33125f();
            float[] d = mo33123d();
            for (int i3 = 0; i3 < a.length; i3++) {
                float f3 = (((float) a[i3]) * 1.0f) / a2;
                int i4 = (int) (0.5f + f3);
                if (i4 <= 0) {
                    if (f3 >= 0.3f) {
                        i4 = 1;
                    } else {
                        throw NotFoundException.m41712a();
                    }
                } else if (i4 > 8) {
                    if (f3 <= 8.7f) {
                        i4 = 8;
                    } else {
                        throw NotFoundException.m41712a();
                    }
                }
                int i5 = i3 / 2;
                if ((i3 & 1) == 0) {
                    e[i5] = i4;
                    f2[i5] = f3 - ((float) i4);
                } else {
                    c[i5] = i4;
                    d[i5] = f3 - ((float) i4);
                }
            }
            m42634a(17);
            int c2 = (((cVar.mo33133c() * 4) + (z ? 0 : 2)) + (z2 ^ true ? 1 : 0)) - 1;
            int i6 = 0;
            int i7 = 0;
            for (int length2 = e.length - 1; length2 >= 0; length2--) {
                if (m42637a(cVar, z, z2)) {
                    i6 += e[length2] * f23913s[c2][length2 * 2];
                }
                i7 += e[length2];
            }
            int i8 = 0;
            for (int length3 = c.length - 1; length3 >= 0; length3--) {
                if (m42637a(cVar, z, z2)) {
                    i8 += c[length3] * f23913s[c2][(length3 * 2) + 1];
                }
            }
            int i9 = i6 + i8;
            if ((i7 & 1) != 0 || i7 > 13 || i7 < 4) {
                throw NotFoundException.m41712a();
            }
            int i10 = (13 - i7) / 2;
            int i11 = f23909o[i10];
            int i12 = 9 - i11;
            return new C9108b((C9112f.m42616a(e, i11, true) * f23910p[i10]) + C9112f.m42616a(c, i12, false) + f23911q[i10], i9);
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private static boolean m42637a(C9109c cVar, boolean z, boolean z2) {
        return cVar.mo33133c() != 0 || !z || !z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m42634a(int r11) throws com.google.zxing.NotFoundException {
        /*
            r10 = this;
            int[] r0 = r10.mo33124e()
            int r0 = com.google.zxing.p335u.p336m.C9055a.m42371a(r0)
            int[] r1 = r10.mo33122c()
            int r1 = com.google.zxing.p335u.p336m.C9055a.m42371a(r1)
            r2 = 4
            r3 = 13
            r4 = 0
            r5 = 1
            if (r0 <= r3) goto L_0x0019
            r6 = 1
            goto L_0x001e
        L_0x0019:
            r6 = 0
            if (r0 >= r2) goto L_0x001e
            r7 = 1
            goto L_0x001f
        L_0x001e:
            r7 = 0
        L_0x001f:
            if (r1 <= r3) goto L_0x0024
            r2 = 0
            r3 = 1
            goto L_0x002a
        L_0x0024:
            if (r1 >= r2) goto L_0x0028
            r2 = 1
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            r3 = 0
        L_0x002a:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r5) goto L_0x0033
            r11 = 1
            goto L_0x0034
        L_0x0033:
            r11 = 0
        L_0x0034:
            r9 = r1 & 1
            if (r9 != 0) goto L_0x0039
            r4 = 1
        L_0x0039:
            if (r8 != r5) goto L_0x004f
            if (r11 == 0) goto L_0x0046
            if (r4 != 0) goto L_0x0041
        L_0x003f:
            r6 = 1
            goto L_0x0079
        L_0x0041:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m41712a()
            throw r11
        L_0x0046:
            if (r4 == 0) goto L_0x004a
            r3 = 1
            goto L_0x0079
        L_0x004a:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m41712a()
            throw r11
        L_0x004f:
            r9 = -1
            if (r8 != r9) goto L_0x0066
            if (r11 == 0) goto L_0x005d
            if (r4 != 0) goto L_0x0058
        L_0x0056:
            r7 = 1
            goto L_0x0079
        L_0x0058:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m41712a()
            throw r11
        L_0x005d:
            if (r4 == 0) goto L_0x0061
            r2 = 1
            goto L_0x0079
        L_0x0061:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m41712a()
            throw r11
        L_0x0066:
            if (r8 != 0) goto L_0x00c3
            if (r11 == 0) goto L_0x0077
            if (r4 == 0) goto L_0x0072
            if (r0 >= r1) goto L_0x0070
            r3 = 1
            goto L_0x0056
        L_0x0070:
            r2 = 1
            goto L_0x003f
        L_0x0072:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m41712a()
            throw r11
        L_0x0077:
            if (r4 != 0) goto L_0x00be
        L_0x0079:
            if (r7 == 0) goto L_0x008e
            if (r6 != 0) goto L_0x0089
            int[] r11 = r10.mo33124e()
            float[] r0 = r10.mo33125f()
            com.google.zxing.p346y.p347c0.C9107a.m42590b(r11, r0)
            goto L_0x008e
        L_0x0089:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m41712a()
            throw r11
        L_0x008e:
            if (r6 == 0) goto L_0x009b
            int[] r11 = r10.mo33124e()
            float[] r0 = r10.mo33125f()
            com.google.zxing.p346y.p347c0.C9107a.m42589a(r11, r0)
        L_0x009b:
            if (r2 == 0) goto L_0x00b0
            if (r3 != 0) goto L_0x00ab
            int[] r11 = r10.mo33122c()
            float[] r0 = r10.mo33125f()
            com.google.zxing.p346y.p347c0.C9107a.m42590b(r11, r0)
            goto L_0x00b0
        L_0x00ab:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m41712a()
            throw r11
        L_0x00b0:
            if (r3 == 0) goto L_0x00bd
            int[] r11 = r10.mo33122c()
            float[] r0 = r10.mo33123d()
            com.google.zxing.p346y.p347c0.C9107a.m42589a(r11, r0)
        L_0x00bd:
            return
        L_0x00be:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m41712a()
            throw r11
        L_0x00c3:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m41712a()
            goto L_0x00c9
        L_0x00c8:
            throw r11
        L_0x00c9:
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p346y.p347c0.p348g.C9116d.m42634a(int):void");
    }
}
