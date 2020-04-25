package com.google.zxing.p346y.p347c0.p348g.p349e;

import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;

/* renamed from: com.google.zxing.y.c0.g.e.f */
/* compiled from: AI013x0xDecoder */
abstract class C9122f extends C9125i {

    /* renamed from: d */
    private static final int f23935d = 5;

    /* renamed from: e */
    private static final int f23936e = 15;

    C9122f(C9043a aVar) {
        super(aVar);
    }

    /* renamed from: c */
    public String mo33160c() throws NotFoundException {
        if (mo33165b().mo32979d() == 60) {
            StringBuilder sb = new StringBuilder();
            mo33161a(sb, 5);
            mo33163b(sb, 45, 15);
            return sb.toString();
        }
        throw NotFoundException.m41712a();
    }
}
