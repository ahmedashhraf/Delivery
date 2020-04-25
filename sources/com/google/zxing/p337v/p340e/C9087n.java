package com.google.zxing.p337v.p340e;

/* renamed from: com.google.zxing.v.e.n */
/* compiled from: X12Encoder */
final class C9087n extends C9076c {
    C9087n() {
    }

    /* renamed from: a */
    public int mo33064a() {
        return 3;
    }

    /* renamed from: a */
    public void mo33065a(C9081h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo33090i()) {
                break;
            }
            char d = hVar.mo33085d();
            hVar.f23762f++;
            mo33066a(d, sb);
            if (sb.length() % 3 == 0) {
                C9076c.m42445b(hVar, sb);
                int a = C9083j.m42497a(hVar.mo33086e(), hVar.f23762f, mo33064a());
                if (a != mo33064a()) {
                    hVar.mo33082b(a);
                    break;
                }
            }
        }
        mo33067a(hVar, sb);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo33066a(char c, StringBuilder sb) {
        if (c == 13) {
            sb.append(0);
        } else if (c == '*') {
            sb.append(1);
        } else if (c == '>') {
            sb.append(2);
        } else if (c == ' ') {
            sb.append(3);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c < 'A' || c > 'Z') {
            C9083j.m42502a(c);
        } else {
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33067a(C9081h hVar, StringBuilder sb) {
        hVar.mo33093l();
        int b = hVar.mo33089h().mo33095b() - hVar.mo33075a();
        hVar.f23762f -= sb.length();
        if (hVar.mo33088g() > 1 || b > 1 || hVar.mo33088g() != b) {
            hVar.mo33076a(254);
        }
        if (hVar.mo33087f() < 0) {
            hVar.mo33082b(0);
        }
    }
}
