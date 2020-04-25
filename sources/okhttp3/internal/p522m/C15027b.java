package okhttp3.internal.p522m;

import p470h.C13887c.C13890c;
import p470h.C13896f;

/* renamed from: okhttp3.internal.m.b */
/* compiled from: WebSocketProtocol */
public final class C15027b {

    /* renamed from: a */
    static final String f43694a = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    /* renamed from: b */
    static final int f43695b = 128;

    /* renamed from: c */
    static final int f43696c = 64;

    /* renamed from: d */
    static final int f43697d = 32;

    /* renamed from: e */
    static final int f43698e = 16;

    /* renamed from: f */
    static final int f43699f = 15;

    /* renamed from: g */
    static final int f43700g = 8;

    /* renamed from: h */
    static final int f43701h = 128;

    /* renamed from: i */
    static final int f43702i = 127;

    /* renamed from: j */
    static final int f43703j = 0;

    /* renamed from: k */
    static final int f43704k = 1;

    /* renamed from: l */
    static final int f43705l = 2;

    /* renamed from: m */
    static final int f43706m = 8;

    /* renamed from: n */
    static final int f43707n = 9;

    /* renamed from: o */
    static final int f43708o = 10;

    /* renamed from: p */
    static final long f43709p = 125;

    /* renamed from: q */
    static final long f43710q = 123;

    /* renamed from: r */
    static final int f43711r = 126;

    /* renamed from: s */
    static final long f43712s = 65535;

    /* renamed from: t */
    static final int f43713t = 127;

    /* renamed from: u */
    static final int f43714u = 1001;

    /* renamed from: v */
    static final int f43715v = 1005;

    private C15027b() {
        throw new AssertionError("No instances.");
    }

    /* renamed from: a */
    static void m66637a(C13890c cVar, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = cVar.f40345P;
            int i2 = cVar.f40346Q;
            int i3 = cVar.f40347R;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
        } while (cVar.mo43944a() != -1);
    }

    /* renamed from: b */
    static void m66638b(int i) {
        String a = m66635a(i);
        if (a != null) {
            throw new IllegalArgumentException(a);
        }
    }

    /* renamed from: a */
    static String m66635a(int i) {
        if (i < 1000 || i >= 5000) {
            StringBuilder sb = new StringBuilder();
            sb.append("Code must be in range [1000,5000): ");
            sb.append(i);
            return sb.toString();
        } else if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Code ");
            sb2.append(i);
            sb2.append(" is reserved and may not be used.");
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static String m66636a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(f43694a);
        return C13896f.m59655e(sb.toString()).mo43982k().mo43972e();
    }
}
