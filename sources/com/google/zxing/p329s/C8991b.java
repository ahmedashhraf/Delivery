package com.google.zxing.p329s;

import com.google.zxing.C8969c;
import com.google.zxing.C8984m;
import com.google.zxing.C8985n;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* renamed from: com.google.zxing.s.b */
/* compiled from: AztecReader */
public final class C8991b implements C8984m {
    /* renamed from: a */
    public C8985n mo32670a(C8969c cVar) throws NotFoundException, FormatException {
        return mo32671a(cVar, null);
    }

    public void reset() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.C8985n mo32671a(com.google.zxing.C8969c r13, java.util.Map<com.google.zxing.C8974d, ?> r14) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        /*
            r12 = this;
            com.google.zxing.s.e.a r0 = new com.google.zxing.s.e.a
            com.google.zxing.u.b r13 = r13.mo32766a()
            r0.<init>(r13)
            r13 = 0
            r1 = 0
            com.google.zxing.s.a r2 = r0.mo32841a(r13)     // Catch:{ NotFoundException -> 0x002b, FormatException -> 0x0025 }
            com.google.zxing.p[] r3 = r2.mo33032b()     // Catch:{ NotFoundException -> 0x002b, FormatException -> 0x0025 }
            com.google.zxing.s.d.a r4 = new com.google.zxing.s.d.a     // Catch:{ NotFoundException -> 0x0023, FormatException -> 0x0021 }
            r4.<init>()     // Catch:{ NotFoundException -> 0x0023, FormatException -> 0x0021 }
            com.google.zxing.u.e r2 = r4.mo32839a(r2)     // Catch:{ NotFoundException -> 0x0023, FormatException -> 0x0021 }
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L_0x002f
        L_0x0021:
            r2 = move-exception
            goto L_0x0027
        L_0x0023:
            r2 = move-exception
            goto L_0x002d
        L_0x0025:
            r2 = move-exception
            r3 = r1
        L_0x0027:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L_0x002f
        L_0x002b:
            r2 = move-exception
            r3 = r1
        L_0x002d:
            r4 = r3
            r3 = r1
        L_0x002f:
            if (r1 != 0) goto L_0x004e
            r1 = 1
            com.google.zxing.s.a r0 = r0.mo32841a(r1)     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            com.google.zxing.p[] r4 = r0.mo33032b()     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            com.google.zxing.s.d.a r1 = new com.google.zxing.s.d.a     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            r1.<init>()     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            com.google.zxing.u.e r1 = r1.mo32839a(r0)     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            goto L_0x004e
        L_0x0044:
            r13 = move-exception
            goto L_0x0047
        L_0x0046:
            r13 = move-exception
        L_0x0047:
            if (r2 != 0) goto L_0x004d
            if (r3 == 0) goto L_0x004c
            throw r3
        L_0x004c:
            throw r13
        L_0x004d:
            throw r2
        L_0x004e:
            r8 = r4
            if (r14 == 0) goto L_0x0066
            com.google.zxing.d r0 = com.google.zxing.C8974d.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r14 = r14.get(r0)
            com.google.zxing.q r14 = (com.google.zxing.C8988q) r14
            if (r14 == 0) goto L_0x0066
            int r0 = r8.length
        L_0x005c:
            if (r13 >= r0) goto L_0x0066
            r2 = r8[r13]
            r14.mo32835a(r2)
            int r13 = r13 + 1
            goto L_0x005c
        L_0x0066:
            com.google.zxing.n r13 = new com.google.zxing.n
            java.lang.String r5 = r1.mo33027j()
            byte[] r6 = r1.mo33024g()
            int r7 = r1.mo33022e()
            com.google.zxing.a r9 = com.google.zxing.C8929a.AZTEC
            long r10 = java.lang.System.currentTimeMillis()
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.util.List r14 = r1.mo33014a()
            if (r14 == 0) goto L_0x0089
            com.google.zxing.o r0 = com.google.zxing.C8986o.BYTE_SEGMENTS
            r13.mo32820a(r0, r14)
        L_0x0089:
            java.lang.String r14 = r1.mo33018b()
            if (r14 == 0) goto L_0x0094
            com.google.zxing.o r0 = com.google.zxing.C8986o.ERROR_CORRECTION_LEVEL
            r13.mo32820a(r0, r14)
        L_0x0094:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p329s.C8991b.mo32671a(com.google.zxing.c, java.util.Map):com.google.zxing.n");
    }
}
