package p076c.p082c.p083a.p084a0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c.c.a.a0.g */
/* compiled from: MarkEnforcingInputStream */
public class C2214g extends FilterInputStream {

    /* renamed from: N */
    private static final int f8768N = -1;

    /* renamed from: b */
    private static final int f8769b = Integer.MIN_VALUE;

    /* renamed from: a */
    private int f8770a = Integer.MIN_VALUE;

    public C2214g(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    private long m11333a(long j) {
        int i = this.f8770a;
        if (i == 0) {
            return -1;
        }
        if (i != Integer.MIN_VALUE && j > ((long) i)) {
            j = (long) i;
        }
        return j;
    }

    /* renamed from: b */
    private void m11334b(long j) {
        int i = this.f8770a;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f8770a = (int) (((long) i) - j);
        }
    }

    public int available() throws IOException {
        int i = this.f8770a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public void mark(int i) {
        super.mark(i);
        this.f8770a = i;
    }

    public int read() throws IOException {
        if (m11333a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m11334b(1);
        return read;
    }

    public void reset() throws IOException {
        super.reset();
        this.f8770a = Integer.MIN_VALUE;
    }

    public long skip(long j) throws IOException {
        long a = m11333a(j);
        if (a == -1) {
            return -1;
        }
        long skip = super.skip(a);
        m11334b(skip);
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int a = (int) m11333a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m11334b((long) read);
        return read;
    }
}
