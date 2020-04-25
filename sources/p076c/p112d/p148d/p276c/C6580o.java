package p076c.p112d.p148d.p276c;

import com.google.common.base.C7397x;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: c.d.d.c.o */
/* compiled from: HashingInputStream */
public final class C6580o extends FilterInputStream {

    /* renamed from: a */
    private final C6563m f18291a;

    public C6580o(C6562l lVar, InputStream inputStream) {
        super((InputStream) C7397x.m35664a(inputStream));
        this.f18291a = (C6563m) C7397x.m35664a(lVar.mo26428a());
    }

    /* renamed from: a */
    public C6558k mo26506a() {
        return this.f18291a.mo26429a();
    }

    public void mark(int i) {
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        int read = this.in.read();
        if (read != -1) {
            this.f18291a.mo26416a((byte) read);
        }
        return read;
    }

    public void reset() throws IOException {
        throw new IOException("reset not supported");
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.f18291a.mo26423a(bArr, i, read);
        }
        return read;
    }
}
