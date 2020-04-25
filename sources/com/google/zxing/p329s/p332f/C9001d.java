package com.google.zxing.p329s.p332f;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.s.f.d */
/* compiled from: HighLevelEncoder */
public final class C9001d {

    /* renamed from: b */
    static final String[] f23534b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: c */
    static final int f23535c = 0;

    /* renamed from: d */
    static final int f23536d = 1;

    /* renamed from: e */
    static final int f23537e = 2;

    /* renamed from: f */
    static final int f23538f = 3;

    /* renamed from: g */
    static final int f23539g = 4;

    /* renamed from: h */
    static final int[][] f23540h = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: i */
    private static final int[][] f23541i;

    /* renamed from: j */
    static final int[][] f23542j;

    /* renamed from: a */
    private final byte[] f23543a;

    /* renamed from: com.google.zxing.s.f.d$a */
    /* compiled from: HighLevelEncoder */
    class C9002a implements Comparator<C9004f> {
        C9002a() {
        }

        /* renamed from: a */
        public int compare(C9004f fVar, C9004f fVar2) {
            return fVar.mo32867b() - fVar2.mo32867b();
        }
    }

    static {
        Class<int> cls = int.class;
        int[][] iArr = (int[][]) Array.newInstance(cls, new int[]{5, 256});
        f23541i = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f23541i[0][i] = (i - 65) + 2;
        }
        f23541i[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f23541i[1][i2] = (i2 - 97) + 2;
        }
        f23541i[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f23541i[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = f23541i;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, C13959t.f40823O1, C13959t.f40827P1};
        for (int i4 = 0; i4 < 28; i4++) {
            f23541i[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, C13959t.f40819N1};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                f23541i[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(cls, new int[]{6, 6});
        f23542j = iArr5;
        for (int[] fill : iArr5) {
            Arrays.fill(fill, -1);
        }
        int[][] iArr6 = f23542j;
        iArr6[0][4] = 0;
        iArr6[1][4] = 0;
        iArr6[1][0] = 28;
        iArr6[3][4] = 0;
        iArr6[2][4] = 0;
        iArr6[2][0] = 15;
    }

    public C9001d(byte[] bArr) {
        this.f23543a = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.p335u.C9043a mo32858a() {
        /*
            r8 = this;
            com.google.zxing.s.f.f r0 = com.google.zxing.p329s.p332f.C9004f.f23547e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r0
            r0 = 0
        L_0x0009:
            byte[] r3 = r8.f23543a
            int r4 = r3.length
            if (r0 >= r4) goto L_0x0050
            int r4 = r0 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L_0x0016
            byte r3 = r3[r4]
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            byte[] r5 = r8.f23543a
            byte r5 = r5[r0]
            r6 = 13
            if (r5 == r6) goto L_0x003b
            r6 = 44
            r7 = 32
            if (r5 == r6) goto L_0x0037
            r6 = 46
            if (r5 == r6) goto L_0x0033
            r6 = 58
            if (r5 == r6) goto L_0x002f
        L_0x002d:
            r3 = 0
            goto L_0x0040
        L_0x002f:
            if (r3 != r7) goto L_0x002d
            r3 = 5
            goto L_0x0040
        L_0x0033:
            if (r3 != r7) goto L_0x002d
            r3 = 3
            goto L_0x0040
        L_0x0037:
            if (r3 != r7) goto L_0x002d
            r3 = 4
            goto L_0x0040
        L_0x003b:
            r5 = 10
            if (r3 != r5) goto L_0x002d
            r3 = 2
        L_0x0040:
            if (r3 <= 0) goto L_0x0049
            java.util.Collection r0 = m42063a(r2, r0, r3)
            r2 = r0
            r0 = r4
            goto L_0x004d
        L_0x0049:
            java.util.Collection r2 = r8.m42062a(r2, r0)
        L_0x004d:
            int r0 = r0 + 1
            goto L_0x0009
        L_0x0050:
            com.google.zxing.s.f.d$a r0 = new com.google.zxing.s.f.d$a
            r0.<init>()
            java.lang.Object r0 = java.util.Collections.min(r2, r0)
            com.google.zxing.s.f.f r0 = (com.google.zxing.p329s.p332f.C9004f) r0
            byte[] r1 = r8.f23543a
            com.google.zxing.u.a r0 = r0.mo32865a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p329s.p332f.C9001d.mo32858a():com.google.zxing.u.a");
    }

    /* renamed from: a */
    private Collection<C9004f> m42062a(Iterable<C9004f> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        for (C9004f a : iterable) {
            m42065a(a, i, (Collection<C9004f>) linkedList);
        }
        return m42061a(linkedList);
    }

    /* renamed from: a */
    private void m42065a(C9004f fVar, int i, Collection<C9004f> collection) {
        char c = (char) (this.f23543a[i] & 255);
        boolean z = f23541i[fVar.mo32870c()][c] > 0;
        C9004f fVar2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f23541i[i2][c];
            if (i3 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.mo32868b(i);
                }
                if (!z || i2 == fVar.mo32870c() || i2 == 2) {
                    collection.add(fVar2.mo32864a(i2, i3));
                }
                if (!z && f23542j[fVar.mo32870c()][i2] >= 0) {
                    collection.add(fVar2.mo32869b(i2, i3));
                }
            }
        }
        if (fVar.mo32862a() > 0 || f23541i[fVar.mo32870c()][c] == 0) {
            collection.add(fVar.mo32863a(i));
        }
    }

    /* renamed from: a */
    private static Collection<C9004f> m42063a(Iterable<C9004f> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (C9004f a : iterable) {
            m42064a(a, i, i2, linkedList);
        }
        return m42061a(linkedList);
    }

    /* renamed from: a */
    private static void m42064a(C9004f fVar, int i, int i2, Collection<C9004f> collection) {
        C9004f b = fVar.mo32868b(i);
        collection.add(b.mo32864a(4, i2));
        if (fVar.mo32870c() != 4) {
            collection.add(b.mo32869b(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(b.mo32864a(2, 16 - i2).mo32864a(2, 1));
        }
        if (fVar.mo32862a() > 0) {
            collection.add(fVar.mo32863a(i).mo32863a(i + 1));
        }
    }

    /* renamed from: a */
    private static Collection<C9004f> m42061a(Iterable<C9004f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (C9004f fVar : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9004f fVar2 = (C9004f) it.next();
                if (fVar2.mo32866a(fVar)) {
                    z = false;
                    break;
                } else if (fVar.mo32866a(fVar2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(fVar);
            }
        }
        return linkedList;
    }
}
