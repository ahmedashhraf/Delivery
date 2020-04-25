package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4312d0;
import com.google.common.base.C5785c;

@C4056a
@C4312d0
/* renamed from: com.google.android.gms.common.util.n */
public class C4495n {

    /* renamed from: a */
    private static final char[] f13758a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    private static final char[] f13759b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @C4056a
    /* renamed from: a */
    public static String m19386a(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        int i = 0;
        while (i < length && (!z || i != length - 1 || (bArr[i] & 255) != 0)) {
            sb.append(f13758a[(bArr[i] & 240) >>> 4]);
            sb.append(f13758a[bArr[i] & C5785c.f16698q]);
            i++;
        }
        return sb.toString();
    }

    @C4056a
    /* renamed from: b */
    public static String m19388b(byte[] bArr) {
        return m19386a(bArr, false);
    }

    @C4056a
    /* renamed from: a */
    public static String m19385a(byte[] bArr) {
        char[] cArr = new char[(bArr.length << 1)];
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            int i2 = i + 1;
            char[] cArr2 = f13759b;
            cArr[i] = cArr2[b2 >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & C5785c.f16698q];
        }
        return new String(cArr);
    }

    @C4056a
    /* renamed from: a */
    public static byte[] m19387a(String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length / 2)];
            int i = 0;
            while (i < length) {
                int i2 = i + 2;
                bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i2), 16);
                i = i2;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }
}
