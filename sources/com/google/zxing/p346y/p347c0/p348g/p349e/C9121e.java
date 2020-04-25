package com.google.zxing.p346y.p347c0.p348g.p349e;

import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9043a;

/* renamed from: com.google.zxing.y.c0.g.e.e */
/* compiled from: AI013x0x1xDecoder */
final class C9121e extends C9125i {

    /* renamed from: f */
    private static final int f23930f = 8;

    /* renamed from: g */
    private static final int f23931g = 20;

    /* renamed from: h */
    private static final int f23932h = 16;

    /* renamed from: d */
    private final String f23933d;

    /* renamed from: e */
    private final String f23934e;

    C9121e(C9043a aVar, String str, String str2) {
        super(aVar);
        this.f23933d = str2;
        this.f23934e = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo33158a(int i) {
        return i % 100000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo33159b(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f23934e);
        sb.append(i / 100000);
        sb.append(')');
    }

    /* renamed from: c */
    public String mo33160c() throws NotFoundException {
        if (mo33165b().mo32979d() == 84) {
            StringBuilder sb = new StringBuilder();
            mo33161a(sb, 8);
            mo33163b(sb, 48, 20);
            m42654c(sb, 68);
            return sb.toString();
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: c */
    private void m42654c(StringBuilder sb, int i) {
        int a = mo33164a().mo33189a(i, 16);
        if (a != 38400) {
            sb.append('(');
            sb.append(this.f23933d);
            sb.append(')');
            int i2 = a % 32;
            int i3 = a / 32;
            int i4 = (i3 % 12) + 1;
            int i5 = i3 / 12;
            if (i5 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i5);
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i2);
        }
    }
}
