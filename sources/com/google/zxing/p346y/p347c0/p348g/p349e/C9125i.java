package com.google.zxing.p346y.p347c0.p348g.p349e;

import com.google.zxing.p335u.C9043a;

/* renamed from: com.google.zxing.y.c0.g.e.i */
/* compiled from: AI01weightDecoder */
abstract class C9125i extends C9124h {
    C9125i(C9043a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo33158a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo33159b(StringBuilder sb, int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33163b(StringBuilder sb, int i, int i2) {
        int a = mo33164a().mo33189a(i, i2);
        mo33159b(sb, a);
        int a2 = mo33158a(a);
        int i3 = 100000;
        for (int i4 = 0; i4 < 5; i4++) {
            if (a2 / i3 == 0) {
                sb.append('0');
            }
            i3 /= 10;
        }
        sb.append(a2);
    }
}
