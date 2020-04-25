package com.google.zxing.p337v.p340e;

import androidx.core.p034l.C0986h;
import androidx.recyclerview.widget.C1744m.C1750f;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.v.e.b */
/* compiled from: Base256Encoder */
final class C9075b implements C9080g {
    C9075b() {
    }

    /* renamed from: a */
    public int mo33064a() {
        return 5;
    }

    /* renamed from: a */
    public void mo33065a(C9081h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!hVar.mo33090i()) {
                break;
            }
            sb.append(hVar.mo33085d());
            hVar.f23762f++;
            int a = C9083j.m42497a(hVar.mo33086e(), hVar.f23762f, mo33064a());
            if (a != mo33064a()) {
                hVar.mo33082b(a);
                break;
            }
        }
        int length = sb.length() - 1;
        int a2 = hVar.mo33075a() + length + 1;
        hVar.mo33084c(a2);
        boolean z = hVar.mo33089h().mo33095b() - a2 > 0;
        if (hVar.mo33090i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / C1750f.f6813c) + 249));
                sb.insert(1, (char) (length % C1750f.f6813c));
            } else {
                StringBuilder sb2 = new StringBuilder("Message length not in valid ranges: ");
                sb2.append(length);
                throw new IllegalStateException(sb2.toString());
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            hVar.mo33076a(m42440a(sb.charAt(i), hVar.mo33075a() + 1));
        }
    }

    /* renamed from: a */
    private static char m42440a(char c, int i) {
        int i2 = c + ((i * C13959t.f40925l2) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 + C0986h.f4419u);
    }
}
