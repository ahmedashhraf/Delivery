package com.google.zxing.p346y;

import com.facebook.imagepipeline.common.RotationOptions;
import com.google.zxing.C8969c;
import com.google.zxing.C8974d;
import com.google.zxing.C8984m;
import com.google.zxing.C8985n;
import com.google.zxing.C8986o;
import com.google.zxing.C8987p;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.p335u.C9043a;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.zxing.y.r */
/* compiled from: OneDReader */
public abstract class C9152r implements C8984m {
    /* renamed from: b */
    private C8985n m42764b(C8969c cVar, Map<C8974d, ?> map) throws NotFoundException {
        int i;
        int i2;
        Map<C8974d, ?> map2 = map;
        int c = cVar.mo32768c();
        int b = cVar.mo32767b();
        C9043a aVar = new C9043a(c);
        int i3 = b >> 1;
        char c2 = 0;
        int i4 = 1;
        boolean z = map2 != null && map2.containsKey(C8974d.TRY_HARDER);
        int max = Math.max(1, b >> (z ? 8 : 5));
        int i5 = z ? b : 15;
        Map<C8974d, ?> map3 = map2;
        int i6 = 0;
        while (i6 < i5) {
            int i7 = i6 + 1;
            int i8 = i7 / 2;
            if (!((i6 & 1) == 0)) {
                i8 = -i8;
            }
            int i9 = (i8 * max) + i3;
            if (i9 < 0 || i9 >= b) {
                break;
            }
            try {
                aVar = cVar.mo32765a(i9, aVar);
                Map<C8974d, ?> map4 = map3;
                int i10 = 0;
                while (i10 < 2) {
                    if (i10 == i4) {
                        aVar.mo32984f();
                        if (map4 != null && map4.containsKey(C8974d.NEED_RESULT_POINT_CALLBACK)) {
                            EnumMap enumMap = new EnumMap(C8974d.class);
                            enumMap.putAll(map4);
                            enumMap.remove(C8974d.NEED_RESULT_POINT_CALLBACK);
                            map4 = enumMap;
                        }
                    }
                    try {
                        C8985n a = mo33114a(i9, aVar, map4);
                        if (i10 == i4) {
                            a.mo32820a(C8986o.ORIENTATION, Integer.valueOf(180));
                            C8987p[] e = a.mo32826e();
                            if (e != null) {
                                float f = (float) c;
                                i2 = c;
                                try {
                                    e[0] = new C8987p((f - e[c2].mo32830a()) - 1.0f, e[c2].mo32831b());
                                    try {
                                        e[1] = new C8987p((f - e[1].mo32830a()) - 1.0f, e[1].mo32831b());
                                    } catch (ReaderException unused) {
                                        continue;
                                    }
                                } catch (ReaderException unused2) {
                                    i10++;
                                    C8969c cVar2 = cVar;
                                    c = i2;
                                    c2 = 0;
                                    i4 = 1;
                                }
                            }
                        }
                        return a;
                    } catch (ReaderException unused3) {
                        i2 = c;
                        i10++;
                        C8969c cVar22 = cVar;
                        c = i2;
                        c2 = 0;
                        i4 = 1;
                    }
                }
                i = c;
                map3 = map4;
            } catch (NotFoundException unused4) {
                i = c;
            }
            i6 = i7;
            c = i;
            c2 = 0;
            i4 = 1;
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    public abstract C8985n mo33114a(int i, C9043a aVar, Map<C8974d, ?> map) throws NotFoundException, ChecksumException, FormatException;

    /* renamed from: a */
    public C8985n mo32670a(C8969c cVar) throws NotFoundException, FormatException {
        return mo32671a(cVar, null);
    }

    public void reset() {
    }

    /* renamed from: a */
    public C8985n mo32671a(C8969c cVar, Map<C8974d, ?> map) throws NotFoundException, FormatException {
        try {
            return m42764b(cVar, map);
        } catch (NotFoundException e) {
            if (!(map != null && map.containsKey(C8974d.TRY_HARDER)) || !cVar.mo32770e()) {
                throw e;
            }
            C8969c f = cVar.mo32771f();
            C8985n b = m42764b(f, map);
            Map d = b.mo32825d();
            int i = RotationOptions.ROTATE_270;
            if (d != null && d.containsKey(C8986o.ORIENTATION)) {
                i = (((Integer) d.get(C8986o.ORIENTATION)).intValue() + RotationOptions.ROTATE_270) % 360;
            }
            b.mo32820a(C8986o.ORIENTATION, Integer.valueOf(i));
            C8987p[] e2 = b.mo32826e();
            if (e2 != null) {
                int b2 = f.mo32767b();
                for (int i2 = 0; i2 < e2.length; i2++) {
                    e2[i2] = new C8987p((((float) b2) - e2[i2].mo32831b()) - 1.0f, e2[i2].mo32830a());
                }
            }
            return b;
        }
    }

    /* renamed from: a */
    protected static void m42763a(C9043a aVar, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int d = aVar.mo32979d();
        if (i < d) {
            boolean z = !aVar.mo32974b(i);
            while (i < d) {
                if (!(aVar.mo32974b(i) ^ z)) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != d) {
                throw NotFoundException.m41712a();
            }
            return;
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: b */
    protected static void m42765b(C9043a aVar, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean b = aVar.mo32974b(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.mo32974b(i) != b) {
                length--;
                b = !b;
            }
        }
        if (length < 0) {
            m42763a(aVar, i + 1, iArr);
            return;
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    protected static float m42762a(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) iArr[i4];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
