package p470h;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import p201f.p202a.C5952h;

/* renamed from: h.e */
/* compiled from: BufferedSource */
public interface C13894e extends C13883a0, ReadableByteChannel {
    /* renamed from: A */
    InputStream mo43833A();

    /* renamed from: a */
    int mo43837a(C13911q qVar) throws IOException;

    /* renamed from: a */
    long mo43839a(byte b) throws IOException;

    /* renamed from: a */
    long mo43840a(byte b, long j) throws IOException;

    /* renamed from: a */
    long mo43841a(byte b, long j, long j2) throws IOException;

    /* renamed from: a */
    long mo43843a(C13896f fVar, long j) throws IOException;

    /* renamed from: a */
    long mo43844a(C13924z zVar) throws IOException;

    /* renamed from: a */
    String mo43859a(long j, Charset charset) throws IOException;

    /* renamed from: a */
    String mo43860a(Charset charset) throws IOException;

    /* renamed from: a */
    void mo43861a(C13887c cVar, long j) throws IOException;

    /* renamed from: a */
    boolean mo43862a(long j, C13896f fVar) throws IOException;

    /* renamed from: a */
    boolean mo43863a(long j, C13896f fVar, int i, int i2) throws IOException;

    /* renamed from: b */
    long mo43864b(C13896f fVar) throws IOException;

    /* renamed from: b */
    long mo43865b(C13896f fVar, long j) throws IOException;

    @Deprecated
    /* renamed from: b */
    C13887c mo43867b();

    /* renamed from: c */
    long mo43871c(C13896f fVar) throws IOException;

    /* renamed from: c */
    C13887c mo43872c();

    /* renamed from: c */
    boolean mo43874c(long j) throws IOException;

    /* renamed from: g */
    String mo43889g(long j) throws IOException;

    /* renamed from: h */
    C13896f mo43891h(long j) throws IOException;

    /* renamed from: i */
    String mo43893i(long j) throws IOException;

    /* renamed from: j */
    byte[] mo43897j(long j) throws IOException;

    /* renamed from: k */
    void mo43899k(long j) throws IOException;

    /* renamed from: o */
    byte[] mo43903o() throws IOException;

    /* renamed from: p */
    boolean mo43904p() throws IOException;

    C13894e peek();

    @C5952h
    /* renamed from: q */
    String mo43906q() throws IOException;

    /* renamed from: r */
    long mo43907r() throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    /* renamed from: s */
    int mo43916s() throws IOException;

    void skip(long j) throws IOException;

    /* renamed from: t */
    C13896f mo43919t() throws IOException;

    /* renamed from: u */
    String mo43921u() throws IOException;

    /* renamed from: v */
    int mo43922v() throws IOException;

    /* renamed from: w */
    String mo43923w() throws IOException;

    /* renamed from: x */
    short mo43931x() throws IOException;

    /* renamed from: y */
    long mo43932y() throws IOException;

    /* renamed from: z */
    long mo43933z() throws IOException;
}
