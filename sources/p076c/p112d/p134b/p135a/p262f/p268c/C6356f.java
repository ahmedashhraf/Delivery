package p076c.p112d.p134b.p135a.p262f.p268c;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C2766f;

@C2766f
/* renamed from: c.d.b.a.f.c.f */
/* compiled from: TestableByteArrayOutputStream */
public class C6356f extends ByteArrayOutputStream {

    /* renamed from: a */
    private boolean f17763a;

    /* renamed from: c */
    public final byte[] mo25714c() {
        return this.buf;
    }

    public void close() throws IOException {
        this.f17763a = true;
    }

    public final boolean isClosed() {
        return this.f17763a;
    }
}
