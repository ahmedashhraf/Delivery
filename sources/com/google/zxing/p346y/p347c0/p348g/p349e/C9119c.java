package com.google.zxing.p346y.p347c0.p348g.p349e;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;

/* renamed from: com.google.zxing.y.c0.g.e.c */
/* compiled from: AI01392xDecoder */
final class C9119c extends C9124h {

    /* renamed from: d */
    private static final int f23925d = 8;

    /* renamed from: e */
    private static final int f23926e = 2;

    C9119c(C9043a aVar) {
        super(aVar);
    }

    /* renamed from: c */
    public String mo33160c() throws NotFoundException, FormatException {
        if (mo33165b().mo32979d() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo33161a(sb, 8);
            int a = mo33164a().mo33189a(48, 2);
            sb.append("(392");
            sb.append(a);
            sb.append(')');
            sb.append(mo33164a().mo33190a(50, (String) null).mo33179b());
            return sb.toString();
        }
        throw NotFoundException.m41712a();
    }
}
