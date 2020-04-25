package com.google.zxing.p346y.p347c0.p348g.p349e;

import com.google.zxing.p335u.C9043a;

/* renamed from: com.google.zxing.y.c0.g.e.h */
/* compiled from: AI01decoder */
abstract class C9124h extends C9126j {

    /* renamed from: c */
    static final int f23938c = 40;

    C9124h(C9043a aVar) {
        super(aVar);
    }

    /* renamed from: b */
    private static void mo33159b(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb.append(i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33161a(StringBuilder sb, int i) {
        sb.append("(01)");
        int length = sb.length();
        sb.append('9');
        mo33162a(sb, i, length);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33162a(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int a = mo33164a().mo33189a((i3 * 10) + i, 10);
            if (a / 100 == 0) {
                sb.append('0');
            }
            if (a / 10 == 0) {
                sb.append('0');
            }
            sb.append(a);
        }
        mo33159b(sb, i2);
    }
}
