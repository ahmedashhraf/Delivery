package com.google.zxing.p341w.p342b;

import com.google.common.base.C5785c;
import com.google.zxing.C8974d;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.C8970a;
import com.google.zxing.common.reedsolomon.C8972c;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.p335u.C9044b;
import com.google.zxing.p335u.C9047e;
import java.util.Map;

/* renamed from: com.google.zxing.w.b.c */
/* compiled from: Decoder */
public final class C9091c {

    /* renamed from: b */
    private static final int f23824b = 0;

    /* renamed from: c */
    private static final int f23825c = 1;

    /* renamed from: d */
    private static final int f23826d = 2;

    /* renamed from: a */
    private final C8972c f23827a = new C8972c(C8970a.f23461o);

    /* renamed from: a */
    public C9047e mo33104a(C9044b bVar) throws ChecksumException, FormatException {
        return mo33105a(bVar, null);
    }

    /* renamed from: a */
    public C9047e mo33105a(C9044b bVar, Map<C8974d, ?> map) throws FormatException, ChecksumException {
        byte[] bArr;
        byte[] a = new C9089a(bVar).mo33103a();
        m42548a(a, 0, 10, 10, 0);
        byte b = a[0] & C5785c.f16698q;
        if (b == 2 || b == 3 || b == 4) {
            byte[] bArr2 = a;
            m42548a(bArr2, 20, 84, 40, 1);
            m42548a(bArr2, 20, 84, 40, 2);
            bArr = new byte[94];
        } else if (b == 5) {
            byte[] bArr3 = a;
            m42548a(bArr3, 20, 68, 56, 1);
            m42548a(bArr3, 20, 68, 56, 2);
            bArr = new byte[78];
        } else {
            throw FormatException.m41710a();
        }
        System.arraycopy(a, 0, bArr, 0, 10);
        System.arraycopy(a, 20, bArr, 10, bArr.length - 10);
        return C9090b.m42542a(bArr, (int) b);
    }

    /* renamed from: a */
    private void m42548a(byte[] bArr, int i, int i2, int i3, int i4) throws ChecksumException {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[(i5 / i6)];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f23827a.mo32795a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.m41708a();
        }
    }
}
