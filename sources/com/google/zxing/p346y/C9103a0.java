package com.google.zxing.p346y;

import com.google.zxing.C8929a;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;

/* renamed from: com.google.zxing.y.a0 */
/* compiled from: UPCEReader */
public final class C9103a0 extends C9159y {

    /* renamed from: l */
    static final int[] f23850l = {56, 52, 50, 49, 44, 38, 35, 42, 41, 37};

    /* renamed from: m */
    private static final int[] f23851m = {1, 1, 1, 1, 1, 1};

    /* renamed from: n */
    private static final int[][] f23852n = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: k */
    private final int[] f23853k = new int[4];

    /* renamed from: b */
    public static String m42576b(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        String str2 = "00000";
        String str3 = "0000";
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append(str3);
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append(str2);
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append(str2);
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append(str3);
                sb.append(c);
                break;
        }
        sb.append(str.charAt(7));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo33115a(C9043a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f23853k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d = aVar.mo32979d();
        int i = iArr[1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 6 && i < d) {
            int a = C9159y.m42795a(aVar, iArr2, i, C9159y.f24026j);
            sb.append((char) ((a % 10) + 48));
            int i4 = i;
            for (int i5 : iArr2) {
                i4 += i5;
            }
            if (a >= 10) {
                i3 = (1 << (5 - i2)) | i3;
            }
            i2++;
            i = i4;
        }
        m42575a(sb, i3);
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int[] mo33118a(C9043a aVar, int i) throws NotFoundException {
        return C9159y.m42798a(aVar, i, true, f23851m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo33117a(String str) throws FormatException {
        return super.mo33117a(m42576b(str));
    }

    /* renamed from: a */
    private static void m42575a(StringBuilder sb, int i) throws NotFoundException {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f23852n[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.m41712a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8929a mo33116a() {
        return C8929a.UPC_E;
    }
}
