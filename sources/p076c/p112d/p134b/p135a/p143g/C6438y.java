package p076c.p112d.p134b.p135a.p143g;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: c.d.b.a.g.y */
/* compiled from: LoggingInputStream */
public class C6438y extends FilterInputStream {

    /* renamed from: a */
    private final C6437x f17915a;

    public C6438y(InputStream inputStream, Logger logger, Level level, int i) {
        super(inputStream);
        this.f17915a = new C6437x(logger, level, i);
    }

    /* renamed from: a */
    public final C6437x mo25881a() {
        return this.f17915a;
    }

    public void close() throws IOException {
        this.f17915a.close();
        super.close();
    }

    public int read() throws IOException {
        int read = super.read();
        this.f17915a.write(read);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.f17915a.write(bArr, i, read);
        }
        return read;
    }
}
