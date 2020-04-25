package com.google.zxing.p325a0.p326c;

import com.google.zxing.C8974d;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.C8970a;
import com.google.zxing.common.reedsolomon.C8972c;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.p335u.C9044b;
import com.google.zxing.p335u.C9047e;
import java.util.Map;

/* renamed from: com.google.zxing.a0.c.e */
/* compiled from: Decoder */
public final class C8944e {

    /* renamed from: a */
    private final C8972c f23379a = new C8972c(C8970a.f23458l);

    /* renamed from: a */
    public C9047e mo32687a(boolean[][] zArr) throws ChecksumException, FormatException {
        return mo32688a(zArr, null);
    }

    /* renamed from: a */
    public C9047e mo32688a(boolean[][] zArr, Map<C8974d, ?> map) throws ChecksumException, FormatException {
        int length = zArr.length;
        C9044b bVar = new C9044b(length);
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i][i2]) {
                    bVar.mo32996c(i2, i);
                }
            }
        }
        return mo32686a(bVar, map);
    }

    /* renamed from: a */
    public C9047e mo32685a(C9044b bVar) throws ChecksumException, FormatException {
        return mo32686a(bVar, null);
    }

    /* renamed from: a */
    public C9047e mo32686a(C9044b bVar, Map<C8974d, ?> map) throws FormatException, ChecksumException {
        Throwable e;
        C8932a aVar = new C8932a(bVar);
        Throwable th = null;
        try {
            return m41749a(aVar, map);
        } catch (FormatException e2) {
            Throwable th2 = e2;
            e = null;
            th = th2;
            try {
                aVar.mo32680e();
                aVar.mo32676a(true);
                aVar.mo32679d();
                aVar.mo32678c();
                aVar.mo32675a();
                C9047e a = m41749a(aVar, map);
                a.mo33017a((Object) new C8948i(true));
                return a;
            } catch (ChecksumException | FormatException e3) {
                if (th != null) {
                    throw th;
                } else if (e != null) {
                    throw e;
                } else {
                    throw e3;
                }
            }
        } catch (ChecksumException e4) {
            e = e4;
            aVar.mo32680e();
            aVar.mo32676a(true);
            aVar.mo32679d();
            aVar.mo32678c();
            aVar.mo32675a();
            C9047e a2 = m41749a(aVar, map);
            a2.mo33017a((Object) new C8948i(true));
            return a2;
        }
    }

    /* renamed from: a */
    private C9047e m41749a(C8932a aVar, Map<C8974d, ?> map) throws FormatException, ChecksumException {
        C8949j d = aVar.mo32679d();
        C8945f b = aVar.mo32678c().mo32691b();
        C8933b[] a = C8933b.m41728a(aVar.mo32677b(), d, b);
        int i = 0;
        for (C8933b b2 : a) {
            i += b2.mo32682b();
        }
        byte[] bArr = new byte[i];
        int length = a.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C8933b bVar = a[i2];
            byte[] a2 = bVar.mo32681a();
            int b3 = bVar.mo32682b();
            m41750a(a2, b3);
            int i4 = i3;
            int i5 = 0;
            while (i5 < b3) {
                int i6 = i4 + 1;
                bArr[i4] = a2[i5];
                i5++;
                i4 = i6;
            }
            i2++;
            i3 = i4;
        }
        return C8943d.m41743a(bArr, d, b, map);
    }

    /* renamed from: a */
    private void m41750a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f23379a.mo32795a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.m41708a();
        }
    }
}
