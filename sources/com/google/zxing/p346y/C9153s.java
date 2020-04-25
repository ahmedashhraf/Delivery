package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.C8976f;
import com.google.zxing.C8989r;
import com.google.zxing.WriterException;
import com.google.zxing.p335u.C9044b;
import java.util.Map;

/* renamed from: com.google.zxing.y.s */
/* compiled from: OneDimensionalCodeWriter */
public abstract class C9153s implements C8989r {
    /* renamed from: a */
    public int mo33193a() {
        return 10;
    }

    /* renamed from: a */
    public final C9044b mo32673a(String str, C8929a aVar, int i, int i2) throws WriterException {
        return mo32674a(str, aVar, i, i2, null);
    }

    /* renamed from: a */
    public abstract boolean[] mo33119a(String str);

    /* renamed from: a */
    public C9044b mo32674a(String str, C8929a aVar, int i, int i2, Map<C8976f, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Negative size is not allowed. Input: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            int a = mo33193a();
            if (map != null && map.containsKey(C8976f.MARGIN)) {
                a = Integer.parseInt(map.get(C8976f.MARGIN).toString());
            }
            return m42770a(mo33119a(str), i, i2, a);
        }
    }

    /* renamed from: a */
    private static C9044b m42770a(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        C9044b bVar = new C9044b(max, max2);
        int i7 = i6;
        int i8 = 0;
        while (i8 < length) {
            if (zArr[i8]) {
                bVar.mo32991a(i7, 0, i5, max2);
            }
            i8++;
            i7 += i5;
        }
        return bVar;
    }

    /* renamed from: a */
    protected static int m42769a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int length = iArr.length;
        int i2 = i;
        boolean z2 = z;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            int i6 = i2;
            int i7 = 0;
            while (i7 < i5) {
                int i8 = i6 + 1;
                zArr[i6] = z2;
                i7++;
                i6 = i8;
            }
            i4 += i5;
            z2 = !z2;
            i3++;
            i2 = i6;
        }
        return i4;
    }
}
