package com.google.zxing.p346y.p347c0.p348g.p349e;

import com.google.zxing.p335u.C9043a;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;

/* renamed from: com.google.zxing.y.c0.g.e.b */
/* compiled from: AI01320xDecoder */
final class C9118b extends C9122f {
    C9118b(C9043a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo33158a(int i) {
        return i < 10000 ? i : i - C14236a.DEFAULT_TIMEOUT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33159b(StringBuilder sb, int i) {
        if (i < 10000) {
            sb.append("(3202)");
        } else {
            sb.append("(3203)");
        }
    }
}
