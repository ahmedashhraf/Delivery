package com.google.common.p190io;

import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import com.google.common.collect.C8145s3;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p276c.C6558k;
import p076c.p112d.p148d.p276c.C6562l;

@C2775a
/* renamed from: com.google.common.io.g */
/* compiled from: ByteStreams */
public final class C8366g {

    /* renamed from: a */
    private static final int f22261a = 4096;

    /* renamed from: b */
    private static final OutputStream f22262b = new C8367a();

    /* renamed from: com.google.common.io.g$a */
    /* compiled from: ByteStreams */
    static class C8367a extends OutputStream {
        C8367a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        public void write(int i) {
        }

        public void write(byte[] bArr) {
            C7397x.m35664a(bArr);
        }

        public void write(byte[] bArr, int i, int i2) {
            C7397x.m35664a(bArr);
        }
    }

    /* renamed from: com.google.common.io.g$b */
    /* compiled from: ByteStreams */
    static class C8368b implements C7380p<C8421u<? extends InputStream>, C8358f> {
        C8368b() {
        }

        /* renamed from: a */
        public C8358f apply(C8421u<? extends InputStream> uVar) {
            return C8366g.m39798a(uVar);
        }
    }

    /* renamed from: com.google.common.io.g$c */
    /* compiled from: ByteStreams */
    static class C8369c extends C8358f {

        /* renamed from: c */
        final /* synthetic */ C8421u f22263c;

        C8369c(C8421u uVar) {
            this.f22263c = uVar;
        }

        /* renamed from: d */
        public InputStream mo23252d() throws IOException {
            return (InputStream) this.f22263c.mo31455a();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ByteStreams.asByteSource(");
            sb.append(this.f22263c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.io.g$d */
    /* compiled from: ByteStreams */
    static class C8370d extends C8352e {

        /* renamed from: a */
        final /* synthetic */ C8349c0 f22264a;

        C8370d(C8349c0 c0Var) {
            this.f22264a = c0Var;
        }

        /* renamed from: c */
        public OutputStream mo23251c() throws IOException {
            return (OutputStream) this.f22264a.mo31437a();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ByteStreams.asByteSink(");
            sb.append(this.f22264a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.io.g$e */
    /* compiled from: ByteStreams */
    private static class C8371e implements C8346b {

        /* renamed from: a */
        final DataInput f22265a;

        C8371e(ByteArrayInputStream byteArrayInputStream) {
            this.f22265a = new DataInputStream(byteArrayInputStream);
        }

        public boolean readBoolean() {
            try {
                return this.f22265a.readBoolean();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public byte readByte() {
            try {
                return this.f22265a.readByte();
            } catch (EOFException e) {
                throw new IllegalStateException(e);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        public char readChar() {
            try {
                return this.f22265a.readChar();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public double readDouble() {
            try {
                return this.f22265a.readDouble();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public float readFloat() {
            try {
                return this.f22265a.readFloat();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public void readFully(byte[] bArr) {
            try {
                this.f22265a.readFully(bArr);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public int readInt() {
            try {
                return this.f22265a.readInt();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public String readLine() {
            try {
                return this.f22265a.readLine();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public long readLong() {
            try {
                return this.f22265a.readLong();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public short readShort() {
            try {
                return this.f22265a.readShort();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public String readUTF() {
            try {
                return this.f22265a.readUTF();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public int readUnsignedByte() {
            try {
                return this.f22265a.readUnsignedByte();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public int readUnsignedShort() {
            try {
                return this.f22265a.readUnsignedShort();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public int skipBytes(int i) {
            try {
                return this.f22265a.skipBytes(i);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public void readFully(byte[] bArr, int i, int i2) {
            try {
                this.f22265a.readFully(bArr, i, i2);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: com.google.common.io.g$f */
    /* compiled from: ByteStreams */
    private static class C8372f implements C8348c {

        /* renamed from: a */
        final DataOutput f22266a;

        /* renamed from: b */
        final ByteArrayOutputStream f22267b;

        C8372f(ByteArrayOutputStream byteArrayOutputStream) {
            this.f22267b = byteArrayOutputStream;
            this.f22266a = new DataOutputStream(byteArrayOutputStream);
        }

        /* renamed from: a */
        public byte[] mo31422a() {
            return this.f22267b.toByteArray();
        }

        public void write(int i) {
            try {
                this.f22266a.write(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeBoolean(boolean z) {
            try {
                this.f22266a.writeBoolean(z);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeByte(int i) {
            try {
                this.f22266a.writeByte(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeBytes(String str) {
            try {
                this.f22266a.writeBytes(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeChar(int i) {
            try {
                this.f22266a.writeChar(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeChars(String str) {
            try {
                this.f22266a.writeChars(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeDouble(double d) {
            try {
                this.f22266a.writeDouble(d);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeFloat(float f) {
            try {
                this.f22266a.writeFloat(f);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeInt(int i) {
            try {
                this.f22266a.writeInt(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeLong(long j) {
            try {
                this.f22266a.writeLong(j);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeShort(int i) {
            try {
                this.f22266a.writeShort(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void writeUTF(String str) {
            try {
                this.f22266a.writeUTF(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void write(byte[] bArr) {
            try {
                this.f22266a.write(bArr);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        public void write(byte[] bArr, int i, int i2) {
            try {
                this.f22266a.write(bArr, i, i2);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.common.io.g$g */
    /* compiled from: ByteStreams */
    private static final class C8373g extends ByteArrayOutputStream {
        private C8373g() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31474a(byte[] bArr, int i) {
            System.arraycopy(this.buf, 0, bArr, i, this.count);
        }

        /* synthetic */ C8373g(C8367a aVar) {
            this();
        }
    }

    /* renamed from: com.google.common.io.g$h */
    /* compiled from: ByteStreams */
    private static final class C8374h extends FilterInputStream {

        /* renamed from: a */
        private long f22268a;

        /* renamed from: b */
        private long f22269b = -1;

        C8374h(InputStream inputStream, long j) {
            super(inputStream);
            C7397x.m35664a(inputStream);
            C7397x.m35671a(j >= 0, (Object) "limit must be non-negative");
            this.f22268a = j;
        }

        public int available() throws IOException {
            return (int) Math.min((long) this.in.available(), this.f22268a);
        }

        public synchronized void mark(int i) {
            this.in.mark(i);
            this.f22269b = this.f22268a;
        }

        public int read() throws IOException {
            if (this.f22268a == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f22268a--;
            }
            return read;
        }

        public synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f22269b != -1) {
                this.in.reset();
                this.f22268a = this.f22269b;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j) throws IOException {
            long skip = this.in.skip(Math.min(j, this.f22268a));
            this.f22268a -= skip;
            return skip;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.f22268a;
            if (j == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
            if (read != -1) {
                this.f22268a -= (long) read;
            }
            return read;
        }
    }

    private C8366g() {
    }

    @Deprecated
    /* renamed from: a */
    public static C8421u<ByteArrayInputStream> m39802a(byte[] bArr, int i, int i2) {
        return m39799a(C8358f.m39743a(bArr).mo31453a((long) i, (long) i2));
    }

    @Deprecated
    /* renamed from: b */
    public static C8421u<ByteArrayInputStream> m39815b(byte[] bArr) {
        return m39799a(C8358f.m39743a(bArr));
    }

    @Deprecated
    /* renamed from: c */
    public static byte[] m39819c(C8421u<? extends InputStream> uVar) throws IOException {
        return m39798a(uVar).mo31460e();
    }

    @Deprecated
    /* renamed from: a */
    public static void m39808a(byte[] bArr, C8349c0<? extends OutputStream> c0Var) throws IOException {
        m39797a(c0Var).mo31443a(bArr);
    }

    /* renamed from: b */
    public static C8346b m39814b(byte[] bArr, int i) {
        C7397x.m35673b(i, bArr.length);
        return m39791a(new ByteArrayInputStream(bArr, i, bArr.length - i));
    }

    @Deprecated
    /* renamed from: a */
    public static long m39785a(C8421u<? extends InputStream> uVar, C8349c0<? extends OutputStream> c0Var) throws IOException {
        return m39798a(uVar).mo31450a(m39797a(c0Var));
    }

    @Deprecated
    /* renamed from: a */
    public static long m39786a(C8421u<? extends InputStream> uVar, OutputStream outputStream) throws IOException {
        return m39798a(uVar).mo31451a(outputStream);
    }

    /* renamed from: b */
    public static OutputStream m39816b() {
        return f22262b;
    }

    @Deprecated
    /* renamed from: a */
    public static long m39787a(InputStream inputStream, C8349c0<? extends OutputStream> c0Var) throws IOException {
        return m39797a(c0Var).mo31441a(inputStream);
    }

    @Deprecated
    /* renamed from: b */
    public static long m39813b(C8421u<? extends InputStream> uVar) throws IOException {
        return m39798a(uVar).mo31461f();
    }

    /* renamed from: a */
    public static long m39788a(InputStream inputStream, OutputStream outputStream) throws IOException {
        C7397x.m35664a(inputStream);
        C7397x.m35664a(outputStream);
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: b */
    public static void m39818b(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int a = m39784a(inputStream, bArr, i, i2);
        if (a != i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("reached end of stream after reading ");
            sb.append(a);
            sb.append(" bytes; ");
            sb.append(i2);
            sb.append(" bytes expected");
            throw new EOFException(sb.toString());
        }
    }

    /* renamed from: b */
    public static void m39817b(InputStream inputStream, long j) throws IOException {
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip != 0) {
                j2 -= skip;
            } else if (inputStream.read() != -1) {
                j2--;
            } else {
                long j3 = j - j2;
                StringBuilder sb = new StringBuilder();
                sb.append("reached end of stream after skipping ");
                sb.append(j3);
                sb.append(" bytes; ");
                sb.append(j);
                sb.append(" bytes expected");
                throw new EOFException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static long m39789a(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        C7397x.m35664a(readableByteChannel);
        C7397x.m35664a(writableByteChannel);
        ByteBuffer allocate = ByteBuffer.allocate(4096);
        long j = 0;
        while (readableByteChannel.read(allocate) != -1) {
            allocate.flip();
            while (allocate.hasRemaining()) {
                j += (long) writableByteChannel.write(allocate);
            }
            allocate.clear();
        }
        return j;
    }

    /* renamed from: a */
    public static byte[] m39810a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m39788a(inputStream, (OutputStream) byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    static byte[] m39811a(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            int i3 = i - i2;
            int read = inputStream.read(bArr, i3, i2);
            if (read == -1) {
                return m39812a(bArr, i3);
            }
            i2 -= read;
        }
        int read2 = inputStream.read();
        if (read2 == -1) {
            return bArr;
        }
        C8373g gVar = new C8373g(null);
        gVar.write(read2);
        m39788a(inputStream, (OutputStream) gVar);
        byte[] bArr2 = new byte[(bArr.length + gVar.size())];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        gVar.mo31474a(bArr2, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    private static byte[] m39812a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    /* renamed from: a */
    public static C8346b m39792a(byte[] bArr) {
        return m39791a(new ByteArrayInputStream(bArr));
    }

    /* renamed from: a */
    public static C8346b m39791a(ByteArrayInputStream byteArrayInputStream) {
        return new C8371e((ByteArrayInputStream) C7397x.m35664a(byteArrayInputStream));
    }

    /* renamed from: a */
    public static C8348c m39794a() {
        return m39796a(new ByteArrayOutputStream());
    }

    /* renamed from: a */
    public static C8348c m39795a(int i) {
        C7397x.m35672a(i >= 0, "Invalid size: %s", Integer.valueOf(i));
        return m39796a(new ByteArrayOutputStream(i));
    }

    /* renamed from: a */
    public static C8348c m39796a(ByteArrayOutputStream byteArrayOutputStream) {
        return new C8372f((ByteArrayOutputStream) C7397x.m35664a(byteArrayOutputStream));
    }

    /* renamed from: a */
    public static InputStream m39804a(InputStream inputStream, long j) {
        return new C8374h(inputStream, j);
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m39809a(C8421u<? extends InputStream> uVar, C8421u<? extends InputStream> uVar2) throws IOException {
        return m39798a(uVar).mo31457a(m39798a(uVar2));
    }

    /* renamed from: a */
    public static void m39807a(InputStream inputStream, byte[] bArr) throws IOException {
        m39818b(inputStream, bArr, 0, bArr.length);
    }

    @Deprecated
    /* renamed from: a */
    public static <T> T m39805a(C8421u<? extends InputStream> uVar, C8350d<T> dVar) throws IOException {
        C7397x.m35664a(uVar);
        C7397x.m35664a(dVar);
        C8390m a = C8390m.m39900a();
        try {
            T a2 = m39806a((InputStream) a.mo31523a((Closeable) uVar.mo31455a()), dVar);
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static <T> T m39806a(InputStream inputStream, C8350d<T> dVar) throws IOException {
        int read;
        C7397x.m35664a(inputStream);
        C7397x.m35664a(dVar);
        byte[] bArr = new byte[4096];
        do {
            read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
        } while (dVar.mo31438a(bArr, 0, read));
        return dVar.getResult();
    }

    @Deprecated
    /* renamed from: a */
    public static C6558k m39790a(C8421u<? extends InputStream> uVar, C6562l lVar) throws IOException {
        return m39798a(uVar).mo31452a(lVar);
    }

    /* renamed from: a */
    public static int m39784a(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        C7397x.m35664a(inputStream);
        C7397x.m35664a(bArr);
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }

    @Deprecated
    /* renamed from: a */
    public static C8421u<InputStream> m39800a(C8421u<? extends InputStream> uVar, long j, long j2) {
        return m39799a(m39798a(uVar).mo31453a(j, j2));
    }

    @Deprecated
    /* renamed from: a */
    public static C8421u<InputStream> m39801a(Iterable<? extends C8421u<? extends InputStream>> iterable) {
        C7397x.m35664a(iterable);
        return m39799a(C8358f.m39741a(C8145s3.m39001a(iterable, (C7380p<? super F, ? extends T>) new C8368b<Object,Object>())));
    }

    @Deprecated
    /* renamed from: a */
    public static C8421u<InputStream> m39803a(C8421u<? extends InputStream>... uVarArr) {
        return m39801a((Iterable<? extends C8421u<? extends InputStream>>) Arrays.asList(uVarArr));
    }

    @Deprecated
    /* renamed from: a */
    public static C8358f m39798a(C8421u<? extends InputStream> uVar) {
        C7397x.m35664a(uVar);
        return new C8369c(uVar);
    }

    @Deprecated
    /* renamed from: a */
    public static C8352e m39797a(C8349c0<? extends OutputStream> c0Var) {
        C7397x.m35664a(c0Var);
        return new C8370d(c0Var);
    }

    /* renamed from: a */
    static <S extends InputStream> C8421u<S> m39799a(C8358f fVar) {
        return (C8421u) C7397x.m35664a(fVar);
    }

    /* renamed from: a */
    static <S extends OutputStream> C8349c0<S> m39793a(C8352e eVar) {
        return (C8349c0) C7397x.m35664a(eVar);
    }
}
