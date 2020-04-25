package p076c.p112d.p134b.p135a.p143g;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: c.d.b.a.g.g */
/* compiled from: ByteArrayStreamingContent */
public class C6377g implements C6397m0 {

    /* renamed from: a */
    private final byte[] f17792a;

    /* renamed from: b */
    private final int f17793b;

    /* renamed from: c */
    private final int f17794c;

    public C6377g(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f17792a, this.f17793b, this.f17794c);
        outputStream.flush();
    }

    public C6377g(byte[] bArr, int i, int i2) {
        this.f17792a = (byte[]) C6381h0.m29663a(bArr);
        C6381h0.m29666a(i >= 0 && i2 >= 0 && i + i2 <= bArr.length);
        this.f17793b = i;
        this.f17794c = i2;
    }
}
