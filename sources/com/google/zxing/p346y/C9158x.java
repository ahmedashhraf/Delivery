package com.google.zxing.p346y;

import com.google.zxing.C8985n;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.p335u.C9043a;

/* renamed from: com.google.zxing.y.x */
/* compiled from: UPCEANExtensionSupport */
final class C9158x {

    /* renamed from: c */
    private static final int[] f24017c = {1, 1, 2};

    /* renamed from: a */
    private final C9156v f24018a = new C9156v();

    /* renamed from: b */
    private final C9157w f24019b = new C9157w();

    C9158x() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8985n mo33197a(int i, C9043a aVar, int i2) throws NotFoundException {
        int[] a = C9159y.m42798a(aVar, i2, false, f24017c);
        try {
            return this.f24019b.mo33196a(i, aVar, a);
        } catch (ReaderException unused) {
            return this.f24018a.mo33195a(i, aVar, a);
        }
    }
}
