package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.C14910b;
import p470h.C13896f;

/* renamed from: okhttp3.internal.http2.d */
/* compiled from: Http2 */
public final class C14969d {

    /* renamed from: a */
    static final C13896f f43441a = C13896f.m59655e("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    static final int f43442b = 16384;

    /* renamed from: c */
    static final byte f43443c = 0;

    /* renamed from: d */
    static final byte f43444d = 1;

    /* renamed from: e */
    static final byte f43445e = 2;

    /* renamed from: f */
    static final byte f43446f = 3;

    /* renamed from: g */
    static final byte f43447g = 4;

    /* renamed from: h */
    static final byte f43448h = 5;

    /* renamed from: i */
    static final byte f43449i = 6;

    /* renamed from: j */
    static final byte f43450j = 7;

    /* renamed from: k */
    static final byte f43451k = 8;

    /* renamed from: l */
    static final byte f43452l = 9;

    /* renamed from: m */
    static final byte f43453m = 0;

    /* renamed from: n */
    static final byte f43454n = 1;

    /* renamed from: o */
    static final byte f43455o = 1;

    /* renamed from: p */
    static final byte f43456p = 4;

    /* renamed from: q */
    static final byte f43457q = 4;

    /* renamed from: r */
    static final byte f43458r = 8;

    /* renamed from: s */
    static final byte f43459s = 32;

    /* renamed from: t */
    static final byte f43460t = 32;

    /* renamed from: u */
    private static final String[] f43461u;

    /* renamed from: v */
    static final String[] f43462v = new String[64];

    /* renamed from: w */
    static final String[] f43463w = new String[256];

    static {
        String str;
        int[] iArr;
        int i = 0;
        String str2 = "PRIORITY";
        f43461u = new String[]{"DATA", "HEADERS", str2, "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        int i2 = 0;
        while (true) {
            String[] strArr = f43463w;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C14910b.m66045a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f43462v;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr2 = {1};
        strArr2[8] = "PADDED";
        int length = iArr2.length;
        int i3 = 0;
        while (true) {
            str = "|PADDED";
            if (i3 >= length) {
                break;
            }
            int i4 = iArr2[i3];
            String[] strArr3 = f43462v;
            int i5 = i4 | 8;
            StringBuilder sb = new StringBuilder();
            sb.append(f43462v[i4]);
            sb.append(str);
            strArr3[i5] = sb.toString();
            i3++;
        }
        String[] strArr4 = f43462v;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = str2;
        strArr4[36] = "END_HEADERS|PRIORITY";
        for (int i6 : new int[]{4, 32, 36}) {
            for (int i7 : iArr2) {
                String[] strArr5 = f43462v;
                int i8 = i7 | i6;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f43462v[i7]);
                sb2.append('|');
                sb2.append(f43462v[i6]);
                strArr5[i8] = sb2.toString();
                String[] strArr6 = f43462v;
                int i9 = i8 | 8;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(f43462v[i7]);
                sb3.append('|');
                sb3.append(f43462v[i6]);
                sb3.append(str);
                strArr6[i9] = sb3.toString();
            }
        }
        while (true) {
            String[] strArr7 = f43462v;
            if (i < strArr7.length) {
                if (strArr7[i] == null) {
                    strArr7[i] = f43463w[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private C14969d() {
    }

    /* renamed from: a */
    static IllegalArgumentException m66327a(String str, Object... objArr) {
        throw new IllegalArgumentException(C14910b.m66045a(str, objArr));
    }

    /* renamed from: b */
    static IOException m66330b(String str, Object... objArr) throws IOException {
        throw new IOException(C14910b.m66045a(str, objArr));
    }

    /* renamed from: a */
    static String m66329a(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f43461u;
        String a = b < strArr.length ? strArr[b] : C14910b.m66045a("0x%02x", Byte.valueOf(b));
        String a2 = m66328a(b, b2);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = a;
        objArr[4] = a2;
        return C14910b.m66045a("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* renamed from: a */
    static String m66328a(byte b, byte b2) {
        String str;
        if (b2 == 0) {
            return "";
        }
        if (!(b == 2 || b == 3)) {
            if (b == 4 || b == 6) {
                if (b2 == 1) {
                    str = "ACK";
                } else {
                    str = f43463w[b2];
                }
                return str;
            } else if (!(b == 7 || b == 8)) {
                String[] strArr = f43462v;
                String str2 = b2 < strArr.length ? strArr[b2] : f43463w[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    return (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                }
                return str2.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f43463w[b2];
    }
}
