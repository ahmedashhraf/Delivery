package com.google.zxing.p337v.p340e;

/* renamed from: com.google.zxing.v.e.c */
/* compiled from: C40Encoder */
class C9076c implements C9080g {
    C9076c() {
    }

    /* renamed from: b */
    static void m42445b(C9081h hVar, StringBuilder sb) {
        hVar.mo33080a(m42444a((CharSequence) sb, 0));
        sb.delete(0, 3);
    }

    /* renamed from: a */
    public int mo33064a() {
        return 1;
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
            int a = mo33066a(d, sb);
            int a2 = hVar.mo33075a() + ((sb.length() / 3) << 1);
            hVar.mo33084c(a2);
            int b = hVar.mo33089h().mo33095b() - a2;
            if (!hVar.mo33090i()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (b < 2 || b > 2)) {
                    a = m42443a(hVar, sb, sb2, a);
                }
                while (sb.length() % 3 == 1 && ((a <= 3 && b != 1) || a > 3)) {
                    a = m42443a(hVar, sb, sb2, a);
                }
            } else if (sb.length() % 3 == 0) {
                int a3 = C9083j.m42497a(hVar.mo33086e(), hVar.f23762f, mo33064a());
                if (a3 != mo33064a()) {
                    hVar.mo33082b(a3);
                    break;
                }
            }
        }
        mo33067a(hVar, sb);
    }

    /* renamed from: a */
    private int m42443a(C9081h hVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        hVar.f23762f--;
        int a = mo33066a(hVar.mo33085d(), sb2);
        hVar.mo33092k();
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33067a(C9081h hVar, StringBuilder sb) {
        int length = sb.length() % 3;
        int a = hVar.mo33075a() + ((sb.length() / 3) << 1);
        hVar.mo33084c(a);
        int b = hVar.mo33089h().mo33095b() - a;
        if (length == 2) {
            sb.append(0);
            while (sb.length() >= 3) {
                m42445b(hVar, sb);
            }
            if (hVar.mo33090i()) {
                hVar.mo33076a(254);
            }
        } else if (b == 1 && length == 1) {
            while (sb.length() >= 3) {
                m42445b(hVar, sb);
            }
            if (hVar.mo33090i()) {
                hVar.mo33076a(254);
            }
            hVar.f23762f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                m42445b(hVar, sb);
            }
            if (b > 0 || hVar.mo33090i()) {
                hVar.mo33076a(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        hVar.mo33082b(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo33066a(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append(3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c >= 0 && c <= 31) {
            sb.append(0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append(1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append(1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append(1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c >= '`' && c <= 127) {
            sb.append(2);
            sb.append((char) (c - '`'));
            return 2;
        } else if (c >= 128) {
            sb.append("\u0001\u001e");
            return mo33066a((char) (c - 128), sb) + 2;
        } else {
            StringBuilder sb2 = new StringBuilder("Illegal character: ");
            sb2.append(c);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    private static String m42444a(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }
}
