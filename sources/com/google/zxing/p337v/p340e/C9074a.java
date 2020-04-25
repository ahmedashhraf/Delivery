package com.google.zxing.p337v.p340e;

import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.zxing.v.e.a */
/* compiled from: ASCIIEncoder */
final class C9074a implements C9080g {
    C9074a() {
    }

    /* renamed from: a */
    public int mo33064a() {
        return 0;
    }

    /* renamed from: a */
    public void mo33065a(C9081h hVar) {
        if (C9083j.m42496a((CharSequence) hVar.mo33086e(), hVar.f23762f) >= 2) {
            hVar.mo33076a(m42437a(hVar.mo33086e().charAt(hVar.f23762f), hVar.mo33086e().charAt(hVar.f23762f + 1)));
            hVar.f23762f += 2;
            return;
        }
        char d = hVar.mo33085d();
        int a = C9083j.m42497a(hVar.mo33086e(), hVar.f23762f, mo33064a());
        if (a != mo33064a()) {
            if (a == 1) {
                hVar.mo33076a(230);
                hVar.mo33082b(1);
            } else if (a == 2) {
                hVar.mo33076a(239);
                hVar.mo33082b(2);
            } else if (a == 3) {
                hVar.mo33076a(238);
                hVar.mo33082b(3);
            } else if (a == 4) {
                hVar.mo33076a(240);
                hVar.mo33082b(4);
            } else if (a == 5) {
                hVar.mo33076a(231);
                hVar.mo33082b(5);
            } else {
                StringBuilder sb = new StringBuilder("Illegal mode: ");
                sb.append(a);
                throw new IllegalStateException(sb.toString());
            }
        } else if (C9083j.m42504c(d)) {
            hVar.mo33076a(235);
            hVar.mo33076a((char) ((d - 128) + 1));
            hVar.f23762f++;
        } else {
            hVar.mo33076a((char) (d + 1));
            hVar.f23762f++;
        }
    }

    /* renamed from: a */
    private static char m42437a(char c, char c2) {
        if (C9083j.m42503b(c) && C9083j.m42503b(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + C13959t.f40839S1);
        }
        StringBuilder sb = new StringBuilder("not digits: ");
        sb.append(c);
        sb.append(c2);
        throw new IllegalArgumentException(sb.toString());
    }
}
