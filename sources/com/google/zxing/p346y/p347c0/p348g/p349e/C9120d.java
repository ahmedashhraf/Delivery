package com.google.zxing.p346y.p347c0.p348g.p349e;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;

/* renamed from: com.google.zxing.y.c0.g.e.d */
/* compiled from: AI01393xDecoder */
final class C9120d extends C9124h {

    /* renamed from: d */
    private static final int f23927d = 8;

    /* renamed from: e */
    private static final int f23928e = 2;

    /* renamed from: f */
    private static final int f23929f = 10;

    C9120d(C9043a aVar) {
        super(aVar);
    }

    /* renamed from: c */
    public String mo33160c() throws NotFoundException, FormatException {
        if (mo33165b().mo32979d() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo33161a(sb, 8);
            int a = mo33164a().mo33189a(48, 2);
            sb.append("(393");
            sb.append(a);
            sb.append(')');
            int a2 = mo33164a().mo33189a(50, 10);
            if (a2 / 100 == 0) {
                sb.append('0');
            }
            if (a2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(a2);
            sb.append(mo33164a().mo33190a(60, (String) null).mo33179b());
            return sb.toString();
        }
        throw NotFoundException.m41712a();
    }
}
