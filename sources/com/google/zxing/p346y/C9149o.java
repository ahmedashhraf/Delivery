package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.C8976f;
import com.google.zxing.WriterException;
import com.google.zxing.p335u.C9044b;
import java.util.Map;

/* renamed from: com.google.zxing.y.o */
/* compiled from: ITFWriter */
public final class C9149o extends C9153s {

    /* renamed from: a */
    private static final int[] f24006a = {1, 1, 1, 1};

    /* renamed from: b */
    private static final int[] f24007b = {3, 1, 1};

    /* renamed from: a */
    public C9044b mo32674a(String str, C8929a aVar, int i, int i2, Map<C8976f, ?> map) throws WriterException {
        if (aVar == C8929a.ITF) {
            return super.mo32674a(str, aVar, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode ITF, but got ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean[] mo33119a(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        } else if (length <= 80) {
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int a = C9153s.m42769a(zArr, 0, f24006a, true);
            for (int i = 0; i < length; i += 2) {
                int digit = Character.digit(str.charAt(i), 10);
                int digit2 = Character.digit(str.charAt(i + 1), 10);
                int[] iArr = new int[18];
                for (int i2 = 0; i2 < 5; i2++) {
                    int i3 = i2 * 2;
                    int[][] iArr2 = C9148n.f24004i;
                    iArr[i3] = iArr2[digit][i2];
                    iArr[i3 + 1] = iArr2[digit2][i2];
                }
                a += C9153s.m42769a(zArr, a, iArr, true);
            }
            C9153s.m42769a(zArr, a, f24007b, true);
            return zArr;
        } else {
            StringBuilder sb = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
