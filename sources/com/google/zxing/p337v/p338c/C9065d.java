package com.google.zxing.p337v.p338c;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.C8970a;
import com.google.zxing.common.reedsolomon.C8972c;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.p335u.C9044b;
import com.google.zxing.p335u.C9047e;

/* renamed from: com.google.zxing.v.c.d */
/* compiled from: Decoder */
public final class C9065d {

    /* renamed from: a */
    private final C8972c f23735a = new C8972c(C8970a.f23459m);

    /* renamed from: a */
    public C9047e mo33044a(boolean[][] zArr) throws FormatException, ChecksumException {
        int length = zArr.length;
        C9044b bVar = new C9044b(length);
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i][i2]) {
                    bVar.mo32996c(i2, i);
                }
            }
        }
        return mo33043a(bVar);
    }

    /* renamed from: a */
    public C9047e mo33043a(C9044b bVar) throws FormatException, ChecksumException {
        C9060a aVar = new C9060a(bVar);
        C9061b[] a = C9061b.m42397a(aVar.mo33040b(), aVar.mo33039a());
        int i = 0;
        for (C9061b b : a) {
            i += b.mo33042b();
        }
        byte[] bArr = new byte[i];
        int length = a.length;
        for (int i2 = 0; i2 < length; i2++) {
            C9061b bVar2 = a[i2];
            byte[] a2 = bVar2.mo33041a();
            int b2 = bVar2.mo33042b();
            m42409a(a2, b2);
            for (int i3 = 0; i3 < b2; i3++) {
                bArr[(i3 * length) + i2] = a2[i3];
            }
        }
        return C9062c.m42401a(bArr);
    }

    /* renamed from: a */
    private void m42409a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f23735a.mo32795a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.m41708a();
        }
    }
}
