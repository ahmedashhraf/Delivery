package p076c.p112d.p113a.p114a.p118d.p123e;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: c.d.a.a.d.e.j */
/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
public final class C2629j {

    /* renamed from: a */
    private static final OutputStream f9738a = new C2628i();

    /* renamed from: a */
    private static byte[] m12739a(Deque<byte[]> deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) deque.removeFirst();
            int min = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m12738a(InputStream inputStream) throws IOException {
        int i;
        C2626g.m12736a(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i2 = 8192;
        for (int i3 = 0; i3 < 2147483639; i3 = i) {
            byte[] bArr = new byte[Math.min(i2, 2147483639 - i3)];
            arrayDeque.add(bArr);
            i = i3;
            int i4 = 0;
            while (i4 < bArr.length) {
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                if (read == -1) {
                    return m12739a((Deque<byte[]>) arrayDeque, i);
                }
                i4 += read;
                i += read;
            }
            i2 = C2634n.m12744a(i2, 2);
        }
        if (inputStream.read() == -1) {
            return m12739a((Deque<byte[]>) arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: a */
    public static InputStream m12737a(InputStream inputStream, long j) {
        return new C2631l(inputStream, 1048577);
    }
}
