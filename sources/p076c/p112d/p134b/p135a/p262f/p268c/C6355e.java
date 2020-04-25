package p076c.p112d.p134b.p135a.p262f.p268c;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C2766f;

@C2766f
/* renamed from: c.d.b.a.f.c.e */
/* compiled from: TestableByteArrayInputStream */
public class C6355e extends ByteArrayInputStream {

    /* renamed from: a */
    private boolean f17762a;

    public C6355e(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: c */
    public final byte[] mo25711c() {
        return this.buf;
    }

    public void close() throws IOException {
        this.f17762a = true;
    }

    public final boolean isClosed() {
        return this.f17762a;
    }

    public C6355e(byte[] bArr, int i, int i2) {
        super(bArr);
    }
}
