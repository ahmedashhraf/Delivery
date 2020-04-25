package com.google.zxing.p337v.p340e;

/* renamed from: com.google.zxing.v.e.f */
/* compiled from: EdifactEncoder */
final class C9079f implements C9080g {
    C9079f() {
    }

    /* renamed from: a */
    public int mo33064a() {
        return 4;
    }

    /* renamed from: a */
    public void mo33065a(C9081h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo33090i()) {
                break;
            }
            m42466a(hVar.mo33085d(), sb);
            hVar.f23762f++;
            if (sb.length() >= 4) {
                hVar.mo33080a(m42465a((CharSequence) sb, 0));
                sb.delete(0, 4);
                if (C9083j.m42497a(hVar.mo33086e(), hVar.f23762f, mo33064a()) != mo33064a()) {
                    hVar.mo33082b(0);
                    break;
                }
            }
        }
        sb.append(31);
        m42467a(hVar, (CharSequence) sb);
    }

    /* renamed from: a */
    private static void m42467a(C9081h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                boolean z = true;
                if (length == 1) {
                    hVar.mo33093l();
                    int b = hVar.mo33089h().mo33095b() - hVar.mo33075a();
                    if (hVar.mo33088g() == 0 && b <= 2) {
                        hVar.mo33082b(0);
                        return;
                    }
                }
                if (length <= 4) {
                    int i = length - 1;
                    String a = m42465a(charSequence, 0);
                    if (!(!hVar.mo33090i()) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        hVar.mo33084c(hVar.mo33075a() + i);
                        if (hVar.mo33089h().mo33095b() - hVar.mo33075a() >= 3) {
                            hVar.mo33084c(hVar.mo33075a() + a.length());
                            z = false;
                        }
                    }
                    if (z) {
                        hVar.mo33092k();
                        hVar.f23762f -= i;
                    } else {
                        hVar.mo33080a(a);
                    }
                    hVar.mo33082b(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            hVar.mo33082b(0);
        }
    }

    /* renamed from: a */
    private static void m42466a(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            C9083j.m42502a(c);
        } else {
            sb.append((char) (c - '@'));
        }
    }

    /* renamed from: a */
    private static String m42465a(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            char c = 0;
            char charAt2 = length >= 2 ? charSequence.charAt(i + 1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(i + 2) : 0;
            if (length >= 4) {
                c = charSequence.charAt(i + 3);
            }
            int i2 = (charAt << 18) + (charAt2 << 12) + (charAt3 << 6) + c;
            char c2 = (char) ((i2 >> 16) & 255);
            char c3 = (char) ((i2 >> 8) & 255);
            char c4 = (char) (i2 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append(c2);
            if (length >= 2) {
                sb.append(c3);
            }
            if (length >= 3) {
                sb.append(c4);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }
}
