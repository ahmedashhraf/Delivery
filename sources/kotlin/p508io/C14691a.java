package kotlin.p508io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.C6121u;
import kotlin.TypeCastException;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p217i1.C14664f;
import kotlin.p219v0.C14836r;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\b\u001a\u0017\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\b\u001a\u0017\u0010\u000b\u001a\u00020\f*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\b\u001a\u0017\u0010\r\u001a\u00020\u000e*\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\nH\b\u001a\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\r\u0010\u0013\u001a\u00020\u000e*\u00020\u0014H\b\u001a\u001d\u0010\u0013\u001a\u00020\u000e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\b\u001a\r\u0010\u0017\u001a\u00020\u0018*\u00020\u0001H\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u001a\u0017\u0010\u001b\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\b\u001a\u0017\u0010\u001d\u001a\u00020\u001e*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\b¨\u0006\u001f"}, mo24990d2 = {"buffered", "Ljava/io/BufferedInputStream;", "Ljava/io/InputStream;", "bufferSize", "", "Ljava/io/BufferedOutputStream;", "Ljava/io/OutputStream;", "bufferedReader", "Ljava/io/BufferedReader;", "charset", "Ljava/nio/charset/Charset;", "bufferedWriter", "Ljava/io/BufferedWriter;", "byteInputStream", "Ljava/io/ByteArrayInputStream;", "", "copyTo", "", "out", "inputStream", "", "offset", "length", "iterator", "Lkotlin/collections/ByteIterator;", "readBytes", "estimatedSize", "reader", "Ljava/io/InputStreamReader;", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, mo24991k = 2, mo24992mv = {1, 1, 10})
@C6055e(name = "ByteStreamsKt")
/* renamed from: kotlin.io.a */
/* compiled from: IOStreams.kt */
public final class C14691a {

    /* renamed from: kotlin.io.a$a */
    /* compiled from: IOStreams.kt */
    public static final class C14692a extends C14836r {

        /* renamed from: N */
        private boolean f42924N;

        /* renamed from: O */
        final /* synthetic */ BufferedInputStream f42925O;

        /* renamed from: a */
        private int f42926a = -1;

        /* renamed from: b */
        private boolean f42927b;

        C14692a(BufferedInputStream bufferedInputStream) {
            this.f42925O = bufferedInputStream;
        }

        /* renamed from: h */
        private final void m63690h() {
            if (!this.f42927b && !this.f42924N) {
                this.f42926a = this.f42925O.read();
                boolean z = true;
                this.f42927b = true;
                if (this.f42926a != -1) {
                    z = false;
                }
                this.f42924N = z;
            }
        }

        /* renamed from: a */
        public final void mo45942a(int i) {
            this.f42926a = i;
        }

        /* renamed from: b */
        public final void mo45944b(boolean z) {
            this.f42927b = z;
        }

        /* renamed from: c */
        public final boolean mo45945c() {
            return this.f42924N;
        }

        /* renamed from: d */
        public final int mo45946d() {
            return this.f42926a;
        }

        /* renamed from: g */
        public final boolean mo45947g() {
            return this.f42927b;
        }

        public boolean hasNext() {
            m63690h();
            return !this.f42924N;
        }

        /* renamed from: a */
        public final void mo45943a(boolean z) {
            this.f42924N = z;
        }

        /* renamed from: b */
        public byte mo45532b() {
            m63690h();
            if (!this.f42924N) {
                byte b = (byte) this.f42926a;
                this.f42927b = false;
                return b;
            }
            throw new NoSuchElementException("Input stream is over.");
        }
    }

    @C6003d
    /* renamed from: a */
    public static final C14836r m63683a(@C6003d BufferedInputStream bufferedInputStream) {
        C14445h0.m62478f(bufferedInputStream, "$receiver");
        return new C14692a(bufferedInputStream);
    }

    @C6041f
    /* renamed from: b */
    private static final InputStreamReader m63684b(@C6003d InputStream inputStream, Charset charset) {
        return new InputStreamReader(inputStream, charset);
    }

    @C6041f
    /* renamed from: a */
    private static final ByteArrayInputStream m63679a(@C6003d String str, Charset charset) {
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            C14445h0.m62453a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteArrayInputStream(bytes);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6041f
    /* renamed from: b */
    static /* synthetic */ InputStreamReader m63685b(InputStream inputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C14664f.f42876a;
        }
        return new InputStreamReader(inputStream, charset);
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ ByteArrayInputStream m63680a(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C14664f.f42876a;
        }
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            C14445h0.m62453a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteArrayInputStream(bytes);
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @C6041f
    /* renamed from: b */
    private static final OutputStreamWriter m63686b(@C6003d OutputStream outputStream, Charset charset) {
        return new OutputStreamWriter(outputStream, charset);
    }

    @C6041f
    /* renamed from: a */
    private static final ByteArrayInputStream m63681a(@C6003d byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    @C6041f
    /* renamed from: b */
    static /* synthetic */ OutputStreamWriter m63687b(OutputStream outputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C14664f.f42876a;
        }
        return new OutputStreamWriter(outputStream, charset);
    }

    @C6041f
    /* renamed from: a */
    private static final ByteArrayInputStream m63682a(@C6003d byte[] bArr, int i, int i2) {
        return new ByteArrayInputStream(bArr, i, i2);
    }

    @C6041f
    /* renamed from: a */
    private static final BufferedInputStream m63671a(@C6003d InputStream inputStream, int i) {
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i);
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ byte[] m63689b(InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return m63688b(inputStream, i);
    }

    @C6041f
    /* renamed from: a */
    private static final BufferedReader m63675a(@C6003d InputStream inputStream, Charset charset) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    @C6003d
    /* renamed from: b */
    public static final byte[] m63688b(@C6003d InputStream inputStream, int i) {
        C14445h0.m62478f(inputStream, "$receiver");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i, inputStream.available()));
        m63670a(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C14445h0.m62453a((Object) byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ BufferedReader m63676a(InputStream inputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C14664f.f42876a;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    @C6041f
    /* renamed from: a */
    private static final BufferedOutputStream m63673a(@C6003d OutputStream outputStream, int i) {
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i);
    }

    @C6041f
    /* renamed from: a */
    private static final BufferedWriter m63677a(@C6003d OutputStream outputStream, Charset charset) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ BufferedWriter m63678a(OutputStream outputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C14664f.f42876a;
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    /* renamed from: a */
    public static /* synthetic */ long m63670a(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m63669a(inputStream, outputStream, i);
    }

    /* renamed from: a */
    public static final long m63669a(@C6003d InputStream inputStream, @C6003d OutputStream outputStream, int i) {
        C14445h0.m62478f(inputStream, "$receiver");
        C14445h0.m62478f(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ BufferedInputStream m63672a(InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, i);
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ BufferedOutputStream m63674a(OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, i);
    }
}
