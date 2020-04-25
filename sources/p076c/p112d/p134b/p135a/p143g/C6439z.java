package p076c.p112d.p134b.p135a.p143g;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: c.d.b.a.g.z */
/* compiled from: LoggingOutputStream */
public class C6439z extends FilterOutputStream {

    /* renamed from: a */
    private final C6437x f17916a;

    public C6439z(OutputStream outputStream, Logger logger, Level level, int i) {
        super(outputStream);
        this.f17916a = new C6437x(logger, level, i);
    }

    /* renamed from: a */
    public final C6437x mo25885a() {
        return this.f17916a;
    }

    public void close() throws IOException {
        this.f17916a.close();
        super.close();
    }

    public void write(int i) throws IOException {
        this.out.write(i);
        this.f17916a.write(i);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.f17916a.write(bArr, i, i2);
    }
}
