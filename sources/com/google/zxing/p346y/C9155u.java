package com.google.zxing.p346y;

import com.facebook.appevents.AppEventsConstants;
import com.google.zxing.C8929a;
import com.google.zxing.C8976f;
import com.google.zxing.C8989r;
import com.google.zxing.WriterException;
import com.google.zxing.p335u.C9044b;
import java.util.Map;

/* renamed from: com.google.zxing.y.u */
/* compiled from: UPCAWriter */
public final class C9155u implements C8989r {

    /* renamed from: a */
    private final C9144j f24011a = new C9144j();

    /* renamed from: a */
    public C9044b mo32673a(String str, C8929a aVar, int i, int i2) throws WriterException {
        return mo32674a(str, aVar, i, i2, null);
    }

    /* renamed from: a */
    public C9044b mo32674a(String str, C8929a aVar, int i, int i2, Map<C8976f, ?> map) throws WriterException {
        if (aVar == C8929a.UPC_A) {
            return this.f24011a.mo32674a(m42782a(str), C8929a.EAN_13, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode UPC-A, but got ");
        sb.append(aVar);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private static String m42782a(String str) {
        int length = str.length();
        if (length == 11) {
            int i = 0;
            for (int i2 = 0; i2 < 11; i2++) {
                i += (str.charAt(i2) - '0') * (i2 % 2 == 0 ? 3 : 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append((1000 - i) % 10);
            str = sb.toString();
        } else if (length != 12) {
            StringBuilder sb2 = new StringBuilder("Requested contents should be 11 or 12 digits long, but got ");
            sb2.append(str.length());
            throw new IllegalArgumentException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        sb3.append(str);
        return sb3.toString();
    }
}
