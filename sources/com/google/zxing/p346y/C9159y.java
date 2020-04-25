package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.C8974d;
import com.google.zxing.C8985n;
import com.google.zxing.C8986o;
import com.google.zxing.C8987p;
import com.google.zxing.C8988q;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.p335u.C9043a;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.zxing.y.y */
/* compiled from: UPCEANReader */
public abstract class C9159y extends C9152r {

    /* renamed from: d */
    private static final float f24020d = 0.48f;

    /* renamed from: e */
    private static final float f24021e = 0.7f;

    /* renamed from: f */
    static final int[] f24022f = {1, 1, 1};

    /* renamed from: g */
    static final int[] f24023g = {1, 1, 1, 1, 1};

    /* renamed from: h */
    static final int[] f24024h = {1, 1, 1, 1, 1, 1};

    /* renamed from: i */
    static final int[][] f24025i = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};

    /* renamed from: j */
    static final int[][] f24026j = new int[20][];

    /* renamed from: a */
    private final StringBuilder f24027a = new StringBuilder(20);

    /* renamed from: b */
    private final C9158x f24028b = new C9158x();

    /* renamed from: c */
    private final C9147m f24029c = new C9147m();

    static {
        System.arraycopy(f24025i, 0, f24026j, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr = f24025i[i - 10];
            int[] iArr2 = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr2[i2] = iArr[(iArr.length - i2) - 1];
            }
            f24026j[i] = iArr2;
        }
    }

    protected C9159y() {
    }

    /* renamed from: a */
    static int[] m42797a(C9043a aVar) throws NotFoundException {
        int[] iArr = new int[f24022f.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            Arrays.fill(iArr, 0, f24022f.length, 0);
            iArr2 = m42799a(aVar, i, false, f24022f, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = aVar.mo32970a(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo33115a(C9043a aVar, int[] iArr, StringBuilder sb) throws NotFoundException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C8929a mo33116a();

    /* renamed from: a */
    public C8985n mo33114a(int i, C9043a aVar, Map<C8974d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return mo33194a(i, aVar, m42797a(aVar), map);
    }

    /* renamed from: a */
    public C8985n mo33194a(int i, C9043a aVar, int[] iArr, Map<C8974d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        C8988q qVar;
        int i2;
        int[] iArr2 = null;
        if (map == null) {
            qVar = null;
        } else {
            qVar = (C8988q) map.get(C8974d.NEED_RESULT_POINT_CALLBACK);
        }
        boolean z = true;
        if (qVar != null) {
            qVar.mo32835a(new C8987p(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.f24027a;
        sb.setLength(0);
        int a = mo33115a(aVar, iArr, sb);
        if (qVar != null) {
            qVar.mo32835a(new C8987p((float) a, (float) i));
        }
        int[] a2 = mo33118a(aVar, a);
        if (qVar != null) {
            qVar.mo32835a(new C8987p(((float) (a2[0] + a2[1])) / 2.0f, (float) i));
        }
        int i3 = a2[1];
        int i4 = (i3 - a2[0]) + i3;
        if (i4 >= aVar.mo32979d() || !aVar.mo32970a(i3, i4, false)) {
            throw NotFoundException.m41712a();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw FormatException.m41710a();
        } else if (mo33117a(sb2)) {
            float f = ((float) (iArr[1] + iArr[0])) / 2.0f;
            float f2 = ((float) (a2[1] + a2[0])) / 2.0f;
            C8929a a3 = mo33116a();
            float f3 = (float) i;
            C8985n nVar = new C8985n(sb2, null, new C8987p[]{new C8987p(f, f3), new C8987p(f2, f3)}, a3);
            try {
                C8985n a4 = this.f24028b.mo33197a(i, aVar, a2[1]);
                nVar.mo32820a(C8986o.UPC_EAN_EXTENSION, a4.mo32827f());
                nVar.mo32821a(a4.mo32825d());
                nVar.mo32822a(a4.mo32826e());
                i2 = a4.mo32827f().length();
            } catch (ReaderException unused) {
                i2 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(C8974d.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw NotFoundException.m41712a();
                }
            }
            if (a3 == C8929a.EAN_13 || a3 == C8929a.UPC_A) {
                String a5 = this.f24029c.mo33192a(sb2);
                if (a5 != null) {
                    nVar.mo32820a(C8986o.POSSIBLE_COUNTRY, a5);
                }
            }
            return nVar;
        } else {
            throw ChecksumException.m41708a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo33117a(String str) throws FormatException {
        return m42796a((CharSequence) str);
    }

    /* renamed from: a */
    static boolean m42796a(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.m41710a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.m41710a();
            }
            i3 += charAt2;
        }
        if (i3 % 10 == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int[] mo33118a(C9043a aVar, int i) throws NotFoundException {
        return m42798a(aVar, i, false, f24022f);
    }

    /* renamed from: a */
    static int[] m42798a(C9043a aVar, int i, boolean z, int[] iArr) throws NotFoundException {
        return m42799a(aVar, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: a */
    private static int[] m42799a(C9043a aVar, int i, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
        int d = aVar.mo32979d();
        int d2 = z ? aVar.mo32980d(i) : aVar.mo32975c(i);
        int length = iArr.length;
        int i2 = d2;
        int i3 = 0;
        while (d2 < d) {
            if (aVar.mo32974b(d2) ^ z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                int i4 = length - 1;
                if (i3 != i4) {
                    i3++;
                } else if (C9152r.m42762a(iArr2, iArr, (float) f24021e) < f24020d) {
                    return new int[]{i2, d2};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            d2++;
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    static int m42795a(C9043a aVar, int[] iArr, int i, int[][] iArr2) throws NotFoundException {
        C9152r.m42763a(aVar, i, iArr);
        int length = iArr2.length;
        float f = f24020d;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float a = C9152r.m42762a(iArr, iArr2[i3], (float) f24021e);
            if (a < f) {
                i2 = i3;
                f = a;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.m41712a();
    }
}
