package p076c.p112d.p134b.p135a.p143g;

import com.fasterxml.jackson.core.p162w.C3868i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: c.d.b.a.g.x */
/* compiled from: LoggingByteArrayOutputStream */
public class C6437x extends ByteArrayOutputStream {

    /* renamed from: N */
    private boolean f17910N;

    /* renamed from: O */
    private final Level f17911O;

    /* renamed from: P */
    private final Logger f17912P;

    /* renamed from: a */
    private int f17913a;

    /* renamed from: b */
    private final int f17914b;

    public C6437x(Logger logger, Level level, int i) {
        this.f17912P = (Logger) C6381h0.m29663a(logger);
        this.f17911O = (Level) C6381h0.m29663a(level);
        C6381h0.m29666a(i >= 0);
        this.f17914b = i;
    }

    /* renamed from: a */
    public final synchronized int mo25876a() {
        return this.f17913a;
    }

    public synchronized void close() throws IOException {
        if (!this.f17910N) {
            if (this.f17913a != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Total: ");
                m29857a(sb, this.f17913a);
                if (this.count != 0 && this.count < this.f17913a) {
                    sb.append(" (logging first ");
                    m29857a(sb, this.count);
                    sb.append(")");
                }
                this.f17912P.config(sb.toString());
                if (this.count != 0) {
                    this.f17912P.log(this.f17911O, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", C3868i.f12248b));
                }
            }
            this.f17910N = true;
        }
    }

    /* renamed from: d */
    public final int mo25878d() {
        return this.f17914b;
    }

    public synchronized void write(int i) {
        C6381h0.m29666a(!this.f17910N);
        this.f17913a++;
        if (this.count < this.f17914b) {
            super.write(i);
        }
    }

    /* renamed from: a */
    private static void m29857a(StringBuilder sb, int i) {
        if (i == 1) {
            sb.append("1 byte");
            return;
        }
        sb.append(NumberFormat.getInstance().format((long) i));
        sb.append(" bytes");
    }

    public synchronized void write(byte[] bArr, int i, int i2) {
        C6381h0.m29666a(!this.f17910N);
        this.f17913a += i2;
        if (this.count < this.f17914b) {
            int i3 = this.count + i2;
            if (i3 > this.f17914b) {
                i2 += this.f17914b - i3;
            }
            super.write(bArr, i, i2);
        }
    }
}
