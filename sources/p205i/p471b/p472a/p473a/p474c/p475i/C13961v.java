package p205i.p471b.p472a.p473a.p474c.p475i;

/* renamed from: i.b.a.a.c.i.v */
/* compiled from: TypePath */
public class C13961v {

    /* renamed from: c */
    public static final int f41007c = 0;

    /* renamed from: d */
    public static final int f41008d = 1;

    /* renamed from: e */
    public static final int f41009e = 2;

    /* renamed from: f */
    public static final int f41010f = 3;

    /* renamed from: a */
    byte[] f41011a;

    /* renamed from: b */
    int f41012b;

    C13961v(byte[] bArr, int i) {
        this.f41011a = bArr;
        this.f41012b = i;
    }

    /* renamed from: a */
    public int mo44214a() {
        return this.f41011a[this.f41012b];
    }

    /* renamed from: b */
    public int mo44216b(int i) {
        return this.f41011a[this.f41012b + (i * 2) + 2];
    }

    public String toString() {
        int a = mo44214a();
        StringBuilder sb = new StringBuilder(a * 2);
        for (int i = 0; i < a; i++) {
            int a2 = mo44215a(i);
            if (a2 == 0) {
                sb.append('[');
            } else if (a2 == 1) {
                sb.append('.');
            } else if (a2 == 2) {
                sb.append('*');
            } else if (a2 != 3) {
                sb.append('_');
            } else {
                sb.append(mo44216b(i));
                sb.append(';');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public int mo44215a(int i) {
        return this.f41011a[this.f41012b + (i * 2) + 1];
    }

    /* renamed from: a */
    public static C13961v m60163a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length();
        C13943d dVar = new C13943d(length);
        dVar.mo44066a(0);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt == '[') {
                dVar.mo44067a(0, 0);
            } else if (charAt == '.') {
                dVar.mo44067a(1, 0);
            } else if (charAt == '*') {
                dVar.mo44067a(2, 0);
            } else if (charAt >= '0' && charAt <= '9') {
                int i3 = charAt - '0';
                while (i2 < length) {
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < '0' || charAt2 > '9') {
                        break;
                    }
                    i3 = ((i3 * 10) + charAt2) - 48;
                    i2++;
                }
                if (i2 < length && str.charAt(i2) == ';') {
                    i2++;
                }
                dVar.mo44067a(3, i3);
            }
            i = i2;
        }
        byte[] bArr = dVar.f40484a;
        bArr[0] = (byte) (dVar.f40485b / 2);
        return new C13961v(bArr, 0);
    }
}
