package p205i.p471b.p472a.p473a.p474c.p478j.p480c;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;

/* renamed from: i.b.a.a.c.j.c.c */
/* compiled from: Pack200Streams */
public final class C13997c {

    /* renamed from: i.b.a.a.c.j.c.c$a */
    /* compiled from: Pack200Streams */
    private static class C13998a extends FilterInputStream {
        protected C13998a(InputStream inputStream) {
            super(inputStream);
        }

        public void close() throws IOException {
        }
    }

    private C13997c() {
    }

    /* renamed from: a */
    public static InputStream m60369a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        JarOutputStream jarOutputStream = new JarOutputStream(byteArrayOutputStream);
        Pack200.newUnpacker().unpack(new C13998a(inputStream), jarOutputStream);
        jarOutputStream.finish();
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    /* renamed from: a */
    public static void m60370a(byte[] bArr, OutputStream outputStream) throws IOException {
        Pack200.newPacker().pack(new JarInputStream(new ByteArrayInputStream(bArr)), outputStream);
    }
}
