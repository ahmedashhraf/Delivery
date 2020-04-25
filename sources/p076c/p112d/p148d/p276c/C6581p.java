package p076c.p112d.p148d.p276c;

import com.google.common.base.C7397x;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: c.d.d.c.p */
/* compiled from: HashingOutputStream */
public final class C6581p extends FilterOutputStream {

    /* renamed from: a */
    private final C6563m f18292a;

    public C6581p(C6562l lVar, OutputStream outputStream) {
        super((OutputStream) C7397x.m35664a(outputStream));
        this.f18292a = (C6563m) C7397x.m35664a(lVar.mo26428a());
    }

    /* renamed from: a */
    public C6558k mo26512a() {
        return this.f18292a.mo26429a();
    }

    public void close() throws IOException {
        this.out.close();
    }

    public void write(int i) throws IOException {
        this.f18292a.mo26416a((byte) i);
        this.out.write(i);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f18292a.mo26423a(bArr, i, i2);
        this.out.write(bArr, i, i2);
    }
}
