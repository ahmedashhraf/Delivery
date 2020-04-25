package p076c.p112d.p148d.p150g;

import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: c.d.d.g.h */
/* compiled from: ParseRequest */
final class C6645h {

    /* renamed from: a */
    final String f18617a;

    /* renamed from: b */
    final int f18618b;

    private C6645h(String str, int i) {
        this.f18617a = str;
        this.f18618b = i;
    }

    /* renamed from: a */
    static C6645h m31721a(String str) {
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            int i = 16;
            if (str.startsWith("0x") || str.startsWith("0X")) {
                str = str.substring(2);
            } else if (charAt == '#') {
                str = str.substring(1);
            } else if (charAt != '0' || str.length() <= 1) {
                i = 10;
            } else {
                str = str.substring(1);
                i = 8;
            }
            return new C6645h(str, i);
        }
        throw new NumberFormatException("empty string");
    }
}
