package p076c.p112d.p148d.p150g;

import com.google.common.base.C7397x;
import java.util.Comparator;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: c.d.d.g.k */
/* compiled from: SignedBytes */
public final class C6651k {

    /* renamed from: a */
    public static final byte f18627a = 64;

    /* renamed from: c.d.d.g.k$a */
    /* compiled from: SignedBytes */
    private enum C6652a implements Comparator<byte[]> {
        INSTANCE;

        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int min = Math.min(bArr.length, bArr2.length);
            for (int i = 0; i < min; i++) {
                int a = C6651k.m31762a(bArr[i], bArr2[i]);
                if (a != 0) {
                    return a;
                }
            }
            return bArr.length - bArr2.length;
        }
    }

    private C6651k() {
    }

    /* renamed from: a */
    public static byte m31760a(long j) {
        byte b = (byte) ((int) j);
        if (((long) b) == j) {
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Out of range: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static int m31762a(byte b, byte b2) {
        return b - b2;
    }

    /* renamed from: b */
    public static byte m31765b(long j) {
        if (j > 127) {
            return Byte.MAX_VALUE;
        }
        if (j < -128) {
            return Byte.MIN_VALUE;
        }
        return (byte) ((int) j);
    }

    /* renamed from: b */
    public static byte m31766b(byte... bArr) {
        C7397x.m35670a(bArr.length > 0);
        byte b = bArr[0];
        for (int i = 1; i < bArr.length; i++) {
            if (bArr[i] < b) {
                b = bArr[i];
            }
        }
        return b;
    }

    /* renamed from: a */
    public static byte m31761a(byte... bArr) {
        C7397x.m35670a(bArr.length > 0);
        byte b = bArr[0];
        for (int i = 1; i < bArr.length; i++) {
            if (bArr[i] > b) {
                b = bArr[i];
            }
        }
        return b;
    }

    /* renamed from: a */
    public static String m31763a(String str, byte... bArr) {
        C7397x.m35664a(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 5);
        sb.append(bArr[0]);
        for (int i = 1; i < bArr.length; i++) {
            sb.append(str);
            sb.append(bArr[i]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Comparator<byte[]> m31764a() {
        return C6652a.INSTANCE;
    }
}
