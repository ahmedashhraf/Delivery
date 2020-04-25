package p470h;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* renamed from: h.d */
/* compiled from: BufferedSink */
public interface C13892d extends C13924z, WritableByteChannel {
    /* renamed from: a */
    long mo43842a(C13883a0 a0Var) throws IOException;

    /* renamed from: a */
    C13892d mo43857a(C13883a0 a0Var, long j) throws IOException;

    /* renamed from: a */
    C13892d mo43847a(C13896f fVar) throws IOException;

    /* renamed from: a */
    C13892d mo43853a(String str) throws IOException;

    /* renamed from: a */
    C13892d mo43854a(String str, int i, int i2) throws IOException;

    /* renamed from: a */
    C13892d mo43855a(String str, int i, int i2, Charset charset) throws IOException;

    /* renamed from: a */
    C13892d mo43856a(String str, Charset charset) throws IOException;

    /* renamed from: b */
    C13887c mo43867b();

    /* renamed from: b */
    C13892d mo43868b(int i) throws IOException;

    /* renamed from: c */
    C13892d mo43873c(int i) throws IOException;

    /* renamed from: d */
    C13892d mo43876d(int i) throws IOException;

    /* renamed from: d */
    C13892d mo43877d(long j) throws IOException;

    /* renamed from: e */
    C13892d mo43881e(long j) throws IOException;

    /* renamed from: f */
    C13892d mo43885f(long j) throws IOException;

    void flush() throws IOException;

    /* renamed from: l */
    C13892d mo43900l() throws IOException;

    /* renamed from: m */
    C13892d mo43901m() throws IOException;

    /* renamed from: n */
    OutputStream mo43902n();

    C13892d write(byte[] bArr) throws IOException;

    C13892d write(byte[] bArr, int i, int i2) throws IOException;

    C13892d writeByte(int i) throws IOException;

    C13892d writeInt(int i) throws IOException;

    C13892d writeLong(long j) throws IOException;

    C13892d writeShort(int i) throws IOException;
}
