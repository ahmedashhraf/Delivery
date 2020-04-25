package p205i.p471b.p472a.p473a.p474c.p478j.p480c;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: i.b.a.a.c.j.c.b */
/* compiled from: Java9Support */
public final class C13996b {

    /* renamed from: a */
    public static final int f41150a = 53;

    private C13996b() {
    }

    /* renamed from: a */
    public static byte[] m60364a(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static byte[] m60366b(byte[] bArr) {
        return m60367c(bArr) ? m60365a(bArr) : bArr;
    }

    /* renamed from: c */
    public static boolean m60367c(byte[] bArr) {
        return m60362a(bArr, 6) == 53;
    }

    /* renamed from: d */
    public static void m60368d(byte[] bArr) {
        m60363a(bArr, 6, 53);
    }

    /* renamed from: a */
    private static void m60363a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >>> 8);
        bArr[i + 1] = (byte) i2;
    }

    /* renamed from: a */
    private static short m60362a(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: a */
    public static byte[] m60365a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        m60363a(bArr2, 6, 52);
        return bArr2;
    }
}
