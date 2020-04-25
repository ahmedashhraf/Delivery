package com.google.zxing.p343x;

import com.google.zxing.C8969c;
import com.google.zxing.C8984m;
import com.google.zxing.C8985n;
import com.google.zxing.C8987p;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* renamed from: com.google.zxing.x.a */
/* compiled from: ByQuadrantReader */
public final class C9092a implements C8984m {

    /* renamed from: a */
    private final C8984m f23828a;

    public C9092a(C8984m mVar) {
        this.f23828a = mVar;
    }

    /* renamed from: a */
    public C8985n mo32670a(C8969c cVar) throws NotFoundException, ChecksumException, FormatException {
        return mo32671a(cVar, null);
    }

    public void reset() {
        this.f23828a.reset();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|12) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = r5.f23828a.mo32671a(r6.mo32764a(r0, r1, r0, r1), r7);
        m42551a(r2.mo32826e(), r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        r2 = r0 / 2;
        r3 = r1 / 2;
        r6 = r5.f23828a.mo32671a(r6.mo32764a(r2, r3, r0, r1), r7);
        m42551a(r6.mo32826e(), r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
        return r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        r3 = r5.f23828a.mo32671a(r6.mo32764a(r0, 0, r0, r1), r7);
        m42551a(r3.mo32826e(), r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3 = r5.f23828a.mo32671a(r6.mo32764a(0, r1, r0, r1), r7);
        m42551a(r3.mo32826e(), 0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        return r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0018 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.C8985n mo32671a(com.google.zxing.C8969c r6, java.util.Map<com.google.zxing.C8974d, ?> r7) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        /*
            r5 = this;
            int r0 = r6.mo32768c()
            int r1 = r6.mo32767b()
            int r0 = r0 / 2
            int r1 = r1 / 2
            r2 = 0
            com.google.zxing.m r3 = r5.f23828a     // Catch:{ NotFoundException -> 0x0018 }
            com.google.zxing.c r4 = r6.mo32764a(r2, r2, r0, r1)     // Catch:{ NotFoundException -> 0x0018 }
            com.google.zxing.n r6 = r3.mo32671a(r4, r7)     // Catch:{ NotFoundException -> 0x0018 }
            return r6
        L_0x0018:
            com.google.zxing.m r3 = r5.f23828a     // Catch:{ NotFoundException -> 0x002a }
            com.google.zxing.c r4 = r6.mo32764a(r0, r2, r0, r1)     // Catch:{ NotFoundException -> 0x002a }
            com.google.zxing.n r3 = r3.mo32671a(r4, r7)     // Catch:{ NotFoundException -> 0x002a }
            com.google.zxing.p[] r4 = r3.mo32826e()     // Catch:{ NotFoundException -> 0x002a }
            m42551a(r4, r0, r2)     // Catch:{ NotFoundException -> 0x002a }
            return r3
        L_0x002a:
            com.google.zxing.m r3 = r5.f23828a     // Catch:{ NotFoundException -> 0x003c }
            com.google.zxing.c r4 = r6.mo32764a(r2, r1, r0, r1)     // Catch:{ NotFoundException -> 0x003c }
            com.google.zxing.n r3 = r3.mo32671a(r4, r7)     // Catch:{ NotFoundException -> 0x003c }
            com.google.zxing.p[] r4 = r3.mo32826e()     // Catch:{ NotFoundException -> 0x003c }
            m42551a(r4, r2, r1)     // Catch:{ NotFoundException -> 0x003c }
            return r3
        L_0x003c:
            com.google.zxing.m r2 = r5.f23828a     // Catch:{ NotFoundException -> 0x004e }
            com.google.zxing.c r3 = r6.mo32764a(r0, r1, r0, r1)     // Catch:{ NotFoundException -> 0x004e }
            com.google.zxing.n r2 = r2.mo32671a(r3, r7)     // Catch:{ NotFoundException -> 0x004e }
            com.google.zxing.p[] r3 = r2.mo32826e()     // Catch:{ NotFoundException -> 0x004e }
            m42551a(r3, r0, r1)     // Catch:{ NotFoundException -> 0x004e }
            return r2
        L_0x004e:
            int r2 = r0 / 2
            int r3 = r1 / 2
            com.google.zxing.c r6 = r6.mo32764a(r2, r3, r0, r1)
            com.google.zxing.m r0 = r5.f23828a
            com.google.zxing.n r6 = r0.mo32671a(r6, r7)
            com.google.zxing.p[] r7 = r6.mo32826e()
            m42551a(r7, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p343x.C9092a.mo32671a(com.google.zxing.c, java.util.Map):com.google.zxing.n");
    }

    /* renamed from: a */
    private static void m42551a(C8987p[] pVarArr, int i, int i2) {
        if (pVarArr != null) {
            for (int i3 = 0; i3 < pVarArr.length; i3++) {
                C8987p pVar = pVarArr[i3];
                pVarArr[i3] = new C8987p(pVar.mo32830a() + ((float) i), pVar.mo32831b() + ((float) i2));
            }
        }
    }
}
