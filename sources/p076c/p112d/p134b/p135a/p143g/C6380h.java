package p076c.p112d.p134b.p135a.p143g;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: c.d.b.a.g.h */
/* compiled from: ByteCountingOutputStream */
final class C6380h extends OutputStream {

    /* renamed from: a */
    long f17800a;

    C6380h() {
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f17800a += (long) i2;
    }

    public void write(int i) throws IOException {
        this.f17800a++;
    }
}
