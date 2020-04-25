package okhttp3.internal.p521l;

import javax.security.auth.x500.X500Principal;

/* renamed from: okhttp3.internal.l.d */
/* compiled from: DistinguishedNameParser */
final class C15016d {

    /* renamed from: a */
    private final String f43644a;

    /* renamed from: b */
    private final int f43645b = this.f43644a.length();

    /* renamed from: c */
    private int f43646c;

    /* renamed from: d */
    private int f43647d;

    /* renamed from: e */
    private int f43648e;

    /* renamed from: f */
    private int f43649f;

    /* renamed from: g */
    private char[] f43650g;

    C15016d(X500Principal x500Principal) {
        this.f43644a = x500Principal.getName("RFC2253");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        r1 = r8.f43650g;
        r2 = r8.f43647d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        return new java.lang.String(r1, r2, r8.f43649f - r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m66595a() {
        /*
            r8 = this;
            int r0 = r8.f43646c
            r8.f43647d = r0
            r8.f43648e = r0
        L_0x0006:
            int r0 = r8.f43646c
            int r1 = r8.f43645b
            if (r0 < r1) goto L_0x0019
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f43650g
            int r2 = r8.f43647d
            int r3 = r8.f43648e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0019:
            char[] r1 = r8.f43650g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L_0x0060
            if (r2 == r5) goto L_0x0053
            r5 = 92
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0053
            if (r2 == r3) goto L_0x0053
            int r2 = r8.f43648e
            int r3 = r2 + 1
            r8.f43648e = r3
            char r3 = r1[r0]
            r1[r2] = r3
            int r0 = r0 + 1
            r8.f43646c = r0
            goto L_0x0006
        L_0x0040:
            int r0 = r8.f43648e
            int r2 = r0 + 1
            r8.f43648e = r2
            char r2 = r8.m66596b()
            r1[r0] = r2
            int r0 = r8.f43646c
            int r0 = r0 + 1
            r8.f43646c = r0
            goto L_0x0006
        L_0x0053:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f43650g
            int r2 = r8.f43647d
            int r3 = r8.f43648e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0060:
            int r2 = r8.f43648e
            r8.f43649f = r2
            int r0 = r0 + 1
            r8.f43646c = r0
            int r0 = r2 + 1
            r8.f43648e = r0
            r1[r2] = r6
        L_0x006e:
            int r0 = r8.f43646c
            int r1 = r8.f43645b
            if (r0 >= r1) goto L_0x0087
            char[] r1 = r8.f43650g
            char r2 = r1[r0]
            if (r2 != r6) goto L_0x0087
            int r2 = r8.f43648e
            int r7 = r2 + 1
            r8.f43648e = r7
            r1[r2] = r6
            int r0 = r0 + 1
            r8.f43646c = r0
            goto L_0x006e
        L_0x0087:
            int r0 = r8.f43646c
            int r1 = r8.f43645b
            if (r0 == r1) goto L_0x009b
            char[] r1 = r8.f43650g
            char r2 = r1[r0]
            if (r2 == r3) goto L_0x009b
            char r2 = r1[r0]
            if (r2 == r4) goto L_0x009b
            char r0 = r1[r0]
            if (r0 != r5) goto L_0x0006
        L_0x009b:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f43650g
            int r2 = r8.f43647d
            int r3 = r8.f43649f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p521l.C15016d.m66595a():java.lang.String");
    }

    /* renamed from: b */
    private char m66596b() {
        this.f43646c++;
        int i = this.f43646c;
        if (i != this.f43645b) {
            char c = this.f43650g[i];
            if (!(c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#')) {
                switch (c) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return m66597c();
                        }
                }
            }
            return this.f43650g[this.f43646c];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected end of DN: ");
        sb.append(this.f43644a);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    private char m66597c() {
        int i;
        int i2;
        int a = m66594a(this.f43646c);
        this.f43646c++;
        if (a < 128) {
            return (char) a;
        }
        if (a < 192 || a > 247) {
            return '?';
        }
        if (a <= 223) {
            i2 = a & 31;
            i = 1;
        } else if (a <= 239) {
            i = 2;
            i2 = a & 15;
        } else {
            i = 3;
            i2 = a & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.f43646c++;
            int i4 = this.f43646c;
            if (i4 == this.f43645b || this.f43650g[i4] != '\\') {
                return '?';
            }
            this.f43646c = i4 + 1;
            int a2 = m66594a(this.f43646c);
            this.f43646c++;
            if ((a2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (a2 & 63);
        }
        return (char) i2;
    }

    /* renamed from: d */
    private String m66598d() {
        int i = this.f43646c;
        String str = "Unexpected end of DN: ";
        if (i + 4 < this.f43645b) {
            this.f43647d = i;
            this.f43646c = i + 1;
            while (true) {
                int i2 = this.f43646c;
                if (i2 == this.f43645b) {
                    break;
                }
                char[] cArr = this.f43650g;
                if (cArr[i2] == '+' || cArr[i2] == ',' || cArr[i2] == ';') {
                    break;
                } else if (cArr[i2] == ' ') {
                    this.f43648e = i2;
                    this.f43646c = i2 + 1;
                    while (true) {
                        int i3 = this.f43646c;
                        if (i3 >= this.f43645b || this.f43650g[i3] != ' ') {
                            break;
                        }
                        this.f43646c = i3 + 1;
                    }
                } else {
                    if (cArr[i2] >= 'A' && cArr[i2] <= 'F') {
                        cArr[i2] = (char) (cArr[i2] + ' ');
                    }
                    this.f43646c++;
                }
            }
            this.f43648e = this.f43646c;
            int i4 = this.f43648e;
            int i5 = this.f43647d;
            int i6 = i4 - i5;
            if (i6 < 5 || (i6 & 1) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f43644a);
                throw new IllegalStateException(sb.toString());
            }
            byte[] bArr = new byte[(i6 / 2)];
            int i7 = i5 + 1;
            for (int i8 = 0; i8 < bArr.length; i8++) {
                bArr[i8] = (byte) m66594a(i7);
                i7 += 2;
            }
            return new String(this.f43650g, this.f43647d, i6);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f43644a);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: e */
    private String m66599e() {
        while (true) {
            int i = this.f43646c;
            if (i >= this.f43645b || this.f43650g[i] != ' ') {
                int i2 = this.f43646c;
            } else {
                this.f43646c = i + 1;
            }
        }
        int i22 = this.f43646c;
        if (i22 == this.f43645b) {
            return null;
        }
        this.f43647d = i22;
        this.f43646c = i22 + 1;
        while (true) {
            int i3 = this.f43646c;
            if (i3 >= this.f43645b) {
                break;
            }
            char[] cArr = this.f43650g;
            if (cArr[i3] == '=' || cArr[i3] == ' ') {
                break;
            }
            this.f43646c = i3 + 1;
        }
        int i4 = this.f43646c;
        String str = "Unexpected end of DN: ";
        if (i4 < this.f43645b) {
            this.f43648e = i4;
            if (this.f43650g[i4] == ' ') {
                while (true) {
                    int i5 = this.f43646c;
                    if (i5 >= this.f43645b) {
                        break;
                    }
                    char[] cArr2 = this.f43650g;
                    if (cArr2[i5] == '=' || cArr2[i5] != ' ') {
                        break;
                    }
                    this.f43646c = i5 + 1;
                }
                char[] cArr3 = this.f43650g;
                int i6 = this.f43646c;
                if (cArr3[i6] != '=' || i6 == this.f43645b) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(this.f43644a);
                    throw new IllegalStateException(sb.toString());
                }
            }
            this.f43646c++;
            while (true) {
                int i7 = this.f43646c;
                if (i7 >= this.f43645b || this.f43650g[i7] != ' ') {
                    int i8 = this.f43648e;
                    int i9 = this.f43647d;
                } else {
                    this.f43646c = i7 + 1;
                }
            }
            int i82 = this.f43648e;
            int i92 = this.f43647d;
            if (i82 - i92 > 4) {
                char[] cArr4 = this.f43650g;
                if (cArr4[i92 + 3] == '.' && (cArr4[i92] == 'O' || cArr4[i92] == 'o')) {
                    char[] cArr5 = this.f43650g;
                    int i10 = this.f43647d;
                    if (cArr5[i10 + 1] == 'I' || cArr5[i10 + 1] == 'i') {
                        char[] cArr6 = this.f43650g;
                        int i11 = this.f43647d;
                        if (cArr6[i11 + 2] == 'D' || cArr6[i11 + 2] == 'd') {
                            this.f43647d += 4;
                        }
                    }
                }
            }
            char[] cArr7 = this.f43650g;
            int i12 = this.f43647d;
            return new String(cArr7, i12, this.f43648e - i12);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f43644a);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: f */
    private String m66600f() {
        this.f43646c++;
        this.f43647d = this.f43646c;
        this.f43648e = this.f43647d;
        while (true) {
            int i = this.f43646c;
            if (i != this.f43645b) {
                char[] cArr = this.f43650g;
                if (cArr[i] == '\"') {
                    this.f43646c = i + 1;
                    while (true) {
                        int i2 = this.f43646c;
                        if (i2 >= this.f43645b || this.f43650g[i2] != ' ') {
                            char[] cArr2 = this.f43650g;
                            int i3 = this.f43647d;
                        } else {
                            this.f43646c = i2 + 1;
                        }
                    }
                    char[] cArr22 = this.f43650g;
                    int i32 = this.f43647d;
                    return new String(cArr22, i32, this.f43648e - i32);
                }
                if (cArr[i] == '\\') {
                    cArr[this.f43648e] = m66596b();
                } else {
                    cArr[this.f43648e] = cArr[i];
                }
                this.f43646c++;
                this.f43648e++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected end of DN: ");
                sb.append(this.f43644a);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    private int m66594a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        String str = "Malformed DN: ";
        if (i4 < this.f43645b) {
            char c = this.f43650g[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f43644a);
                throw new IllegalStateException(sb.toString());
            } else {
                i2 = c - '7';
            }
            char c2 = this.f43650g[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(this.f43644a);
                throw new IllegalStateException(sb2.toString());
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(this.f43644a);
        throw new IllegalStateException(sb3.toString());
    }

    /* renamed from: a */
    public String mo46649a(String str) {
        String str2;
        this.f43646c = 0;
        this.f43647d = 0;
        this.f43648e = 0;
        this.f43649f = 0;
        this.f43650g = this.f43644a.toCharArray();
        String e = m66599e();
        if (e == null) {
            return null;
        }
        do {
            int i = this.f43646c;
            if (i == this.f43645b) {
                return null;
            }
            char c = this.f43650g[i];
            String str3 = c != '\"' ? c != '#' ? (c == '+' || c == ',' || c == ';') ? "" : m66595a() : m66598d() : m66600f();
            if (str.equalsIgnoreCase(e)) {
                return str3;
            }
            int i2 = this.f43646c;
            if (i2 >= this.f43645b) {
                return null;
            }
            char[] cArr = this.f43650g;
            str2 = "Malformed DN: ";
            if (cArr[i2] == ',' || cArr[i2] == ';' || cArr[i2] == '+') {
                this.f43646c++;
                e = m66599e();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f43644a);
                throw new IllegalStateException(sb.toString());
            }
        } while (e != null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(this.f43644a);
        throw new IllegalStateException(sb2.toString());
    }
}
