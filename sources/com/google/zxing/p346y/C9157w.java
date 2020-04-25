package com.google.zxing.p346y;

import com.facebook.appevents.AppEventsConstants;
import com.google.zxing.C8929a;
import com.google.zxing.C8985n;
import com.google.zxing.C8986o;
import com.google.zxing.C8987p;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.zxing.y.w */
/* compiled from: UPCEANExtension5Support */
final class C9157w {

    /* renamed from: c */
    private static final int[] f24014c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    private final int[] f24015a = new int[4];

    /* renamed from: b */
    private final StringBuilder f24016b = new StringBuilder();

    C9157w() {
    }

    /* renamed from: b */
    private static Map<C8986o, Object> m42792b(String str) {
        if (str.length() != 5) {
            return null;
        }
        String a = m42791a(str);
        if (a == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C8986o.class);
        enumMap.put(C8986o.SUGGESTED_PRICE, a);
        return enumMap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8985n mo33196a(int i, C9043a aVar, int[] iArr) throws NotFoundException {
        StringBuilder sb = this.f24016b;
        sb.setLength(0);
        int a = m42789a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map b = m42792b(sb2);
        float f = (float) i;
        C8985n nVar = new C8985n(sb2, null, new C8987p[]{new C8987p(((float) (iArr[0] + iArr[1])) / 2.0f, f), new C8987p((float) a, f)}, C8929a.UPC_EAN_EXTENSION);
        if (b != null) {
            nVar.mo32821a(b);
        }
        return nVar;
    }

    /* renamed from: a */
    private int m42789a(C9043a aVar, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.f24015a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int d = aVar.mo32979d();
        int i = iArr[1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5 && i < d) {
            int a = C9159y.m42795a(aVar, iArr2, i, C9159y.f24026j);
            sb.append((char) ((a % 10) + 48));
            int i4 = i;
            for (int i5 : iArr2) {
                i4 += i5;
            }
            if (a >= 10) {
                i3 |= 1 << (4 - i2);
            }
            i = i2 != 4 ? aVar.mo32980d(aVar.mo32975c(i4)) : i4;
            i2++;
        }
        if (sb.length() == 5) {
            if (m42790a((CharSequence) sb.toString()) == m42788a(i3)) {
                return i;
            }
            throw NotFoundException.m41712a();
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private static int m42790a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* renamed from: a */
    private static int m42788a(int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f24014c[i2]) {
                return i2;
            }
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: a */
    private static String m42791a(String str) {
        String str2;
        char charAt = str.charAt(0);
        String str3 = "";
        if (charAt == '0') {
            str3 = "£";
        } else if (charAt == '5') {
            str3 = "$";
        } else if (charAt == '9') {
            if ("90000".equals(str)) {
                return null;
            }
            if ("99991".equals(str)) {
                return "0.00";
            }
            if ("99990".equals(str)) {
                return "Used";
            }
        }
        int parseInt = Integer.parseInt(str.substring(1));
        String valueOf = String.valueOf(parseInt / 100);
        int i = parseInt % 100;
        if (i < 10) {
            StringBuilder sb = new StringBuilder(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            sb.append(i);
            str2 = sb.toString();
        } else {
            str2 = String.valueOf(i);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(valueOf);
        sb2.append('.');
        sb2.append(str2);
        return sb2.toString();
    }
}
