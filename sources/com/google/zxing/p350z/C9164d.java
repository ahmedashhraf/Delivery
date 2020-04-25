package com.google.zxing.p350z;

import com.google.zxing.C8929a;
import com.google.zxing.C8976f;
import com.google.zxing.C8989r;
import com.google.zxing.WriterException;
import com.google.zxing.p335u.C9044b;
import com.google.zxing.p350z.p354g.C9184c;
import com.google.zxing.p350z.p354g.C9185d;
import com.google.zxing.p350z.p354g.C9186e;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: com.google.zxing.z.d */
/* compiled from: PDF417Writer */
public final class C9164d implements C8989r {

    /* renamed from: a */
    static final int f24044a = 30;

    /* renamed from: b */
    static final int f24045b = 2;

    /* renamed from: a */
    public C9044b mo32674a(String str, C8929a aVar, int i, int i2, Map<C8976f, ?> map) throws WriterException {
        int i3;
        int i4;
        if (aVar == C8929a.PDF_417) {
            C9186e eVar = new C9186e();
            int i5 = 30;
            int i6 = 2;
            if (map != null) {
                if (map.containsKey(C8976f.PDF417_COMPACT)) {
                    eVar.mo33296a(Boolean.valueOf(map.get(C8976f.PDF417_COMPACT).toString()).booleanValue());
                }
                if (map.containsKey(C8976f.PDF417_COMPACTION)) {
                    eVar.mo33293a(C9184c.valueOf(map.get(C8976f.PDF417_COMPACTION).toString()));
                }
                if (map.containsKey(C8976f.PDF417_DIMENSIONS)) {
                    C9185d dVar = (C9185d) map.get(C8976f.PDF417_DIMENSIONS);
                    eVar.mo33292a(dVar.mo33287a(), dVar.mo33289c(), dVar.mo33288b(), dVar.mo33290d());
                }
                if (map.containsKey(C8976f.MARGIN)) {
                    i5 = Integer.parseInt(map.get(C8976f.MARGIN).toString());
                }
                if (map.containsKey(C8976f.ERROR_CORRECTION)) {
                    i6 = Integer.parseInt(map.get(C8976f.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(C8976f.CHARACTER_SET)) {
                    eVar.mo33295a(Charset.forName(map.get(C8976f.CHARACTER_SET).toString()));
                }
                i3 = i5;
                i4 = i6;
            } else {
                i4 = 2;
                i3 = 30;
            }
            return m42827a(eVar, str, i4, i, i2, i3);
        }
        StringBuilder sb = new StringBuilder("Can only encode PDF_417, but got ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public C9044b mo32673a(String str, C8929a aVar, int i, int i2) throws WriterException {
        return mo32674a(str, aVar, i, i2, null);
    }

    /* renamed from: a */
    private static C9044b m42827a(C9186e eVar, String str, int i, int i2, int i3, int i4) throws WriterException {
        boolean z;
        eVar.mo33294a(str, i);
        byte[][] a = eVar.mo33291a().mo33281a(1, 4);
        if ((i3 > i2) ^ (a[0].length < a.length)) {
            a = m42829a(a);
            z = true;
        } else {
            z = false;
        }
        int length = i2 / a[0].length;
        int length2 = i3 / a.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return m42828a(a, i4);
        }
        byte[][] a2 = eVar.mo33291a().mo33281a(length, length << 2);
        if (z) {
            a2 = m42829a(a2);
        }
        return m42828a(a2, i4);
    }

    /* renamed from: a */
    private static C9044b m42828a(byte[][] bArr, int i) {
        int i2 = i * 2;
        C9044b bVar = new C9044b(bArr[0].length + i2, bArr.length + i2);
        bVar.mo32993b();
        int e = (bVar.mo33001e() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr[i3][i4] == 1) {
                    bVar.mo32996c(i4 + i, e);
                }
            }
            i3++;
            e--;
        }
        return bVar;
    }

    /* renamed from: a */
    private static byte[][] m42829a(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, new int[]{bArr[0].length, bArr.length});
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }
}
