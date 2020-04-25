package p076c.p291f.p292a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: c.f.a.d */
/* compiled from: Utils */
final class C6792d {
    private C6792d() {
    }

    /* renamed from: a */
    static void m32465a(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    static void m32468b(Object obj, String str) {
        if (obj != null) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    static void m32466a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: a */
    static void m32467a(String str, String str2) {
        m32466a((Object) str, str2);
        if ("".equals(str.trim())) {
            throw new IllegalStateException(str2);
        }
    }

    /* renamed from: a */
    static void m32464a(int i, String str) {
        if (i != 0) {
            throw new IllegalStateException(str);
        }
    }
}
