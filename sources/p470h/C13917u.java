package p470h;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.mrsool.utils.C11644i;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: h.u */
/* compiled from: RealBufferedSink */
final class C13917u implements C13892d {

    /* renamed from: N */
    boolean f40416N;

    /* renamed from: a */
    public final C13887c f40417a = new C13887c();

    /* renamed from: b */
    public final C13924z f40418b;

    /* renamed from: h.u$a */
    /* compiled from: RealBufferedSink */
    class C13918a extends OutputStream {
        C13918a() {
        }

        public void close() throws IOException {
            C13917u.this.close();
        }

        public void flush() throws IOException {
            C13917u uVar = C13917u.this;
            if (!uVar.f40416N) {
                uVar.flush();
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C13917u.this);
            sb.append(".outputStream()");
            return sb.toString();
        }

        public void write(int i) throws IOException {
            C13917u uVar = C13917u.this;
            if (!uVar.f40416N) {
                uVar.f40417a.writeByte((int) (byte) i);
                C13917u.this.mo43901m();
                return;
            }
            throw new IOException(C11644i.f33433v3);
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            C13917u uVar = C13917u.this;
            if (!uVar.f40416N) {
                uVar.f40417a.write(bArr, i, i2);
                C13917u.this.mo43901m();
                return;
            }
            throw new IOException(C11644i.f33433v3);
        }
    }

    C13917u(C13924z zVar) {
        if (zVar != null) {
            this.f40418b = zVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* renamed from: a */
    public C13892d mo43847a(C13896f fVar) throws IOException {
        if (!this.f40416N) {
            this.f40417a.m59514a(fVar);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    /* renamed from: b */
    public C13887c mo43867b() {
        return this.f40417a;
    }

    /* renamed from: c */
    public C13892d mo43873c(int i) throws IOException {
        if (!this.f40416N) {
            this.f40417a.m59537c(i);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    public void close() throws IOException {
        if (!this.f40416N) {
            Throwable th = null;
            try {
                if (this.f40417a.f40340b > 0) {
                    this.f40418b.mo43815b(this.f40417a, this.f40417a.f40340b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f40418b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f40416N = true;
            if (th != null) {
                C13893d0.m59607a(th);
            }
        }
    }

    /* renamed from: d */
    public C13892d mo43876d(int i) throws IOException {
        if (!this.f40416N) {
            this.f40417a.m59541d(i);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    /* renamed from: e */
    public C13892d mo43881e(long j) throws IOException {
        if (!this.f40416N) {
            this.f40417a.m59547e(j);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    /* renamed from: f */
    public C13892d mo43885f(long j) throws IOException {
        if (!this.f40416N) {
            this.f40417a.m59551f(j);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    public void flush() throws IOException {
        if (!this.f40416N) {
            C13887c cVar = this.f40417a;
            long j = cVar.f40340b;
            if (j > 0) {
                this.f40418b.mo43815b(cVar, j);
            }
            this.f40418b.flush();
            return;
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    public boolean isOpen() {
        return !this.f40416N;
    }

    /* renamed from: l */
    public C13892d mo43900l() throws IOException {
        if (!this.f40416N) {
            long size = this.f40417a.size();
            if (size > 0) {
                this.f40418b.mo43815b(this.f40417a, size);
            }
            return this;
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    /* renamed from: m */
    public C13892d mo43901m() throws IOException {
        if (!this.f40416N) {
            long e = this.f40417a.mo43880e();
            if (e > 0) {
                this.f40418b.mo43815b(this.f40417a, e);
            }
            return this;
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    /* renamed from: n */
    public OutputStream mo43902n() {
        return new C13918a();
    }

    public C13885b0 timeout() {
        return this.f40418b.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.f40418b);
        sb.append(")");
        return sb.toString();
    }

    public C13892d write(byte[] bArr) throws IOException {
        if (!this.f40416N) {
            this.f40417a.write(bArr);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    public C13892d writeByte(int i) throws IOException {
        if (!this.f40416N) {
            this.f40417a.writeByte(i);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    public C13892d writeInt(int i) throws IOException {
        if (!this.f40416N) {
            this.f40417a.writeInt(i);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    public C13892d writeLong(long j) throws IOException {
        if (!this.f40416N) {
            this.f40417a.writeLong(j);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    public C13892d writeShort(int i) throws IOException {
        if (!this.f40416N) {
            this.f40417a.writeShort(i);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    /* renamed from: b */
    public void mo43815b(C13887c cVar, long j) throws IOException {
        if (!this.f40416N) {
            this.f40417a.mo43815b(cVar, j);
            mo43901m();
            return;
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    /* renamed from: a */
    public C13892d mo43853a(String str) throws IOException {
        if (!this.f40416N) {
            this.f40417a.m59515a(str);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    /* renamed from: d */
    public C13892d mo43877d(long j) throws IOException {
        if (!this.f40416N) {
            this.f40417a.m59542d(j);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    public C13892d write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f40416N) {
            this.f40417a.write(bArr, i, i2);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    /* renamed from: b */
    public C13892d mo43868b(int i) throws IOException {
        if (!this.f40416N) {
            this.f40417a.m59531b(i);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    /* renamed from: a */
    public C13892d mo43854a(String str, int i, int i2) throws IOException {
        if (!this.f40416N) {
            this.f40417a.m59516a(str, i, i2);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f40416N) {
            int write = this.f40417a.write(byteBuffer);
            mo43901m();
            return write;
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    /* renamed from: a */
    public C13892d mo43856a(String str, Charset charset) throws IOException {
        if (!this.f40416N) {
            this.f40417a.m59518a(str, charset);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    /* renamed from: a */
    public C13892d mo43855a(String str, int i, int i2, Charset charset) throws IOException {
        if (!this.f40416N) {
            this.f40417a.m59517a(str, i, i2, charset);
            return mo43901m();
        }
        throw new IllegalStateException(C11644i.f33433v3);
    }

    /* renamed from: a */
    public long mo43842a(C13883a0 a0Var) throws IOException {
        if (a0Var != null) {
            long j = 0;
            while (true) {
                long read = a0Var.read(this.f40417a, PlaybackStateCompat.f476k0);
                if (read == -1) {
                    return j;
                }
                j += read;
                mo43901m();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: a */
    public C13892d mo43857a(C13883a0 a0Var, long j) throws IOException {
        while (j > 0) {
            long read = a0Var.read(this.f40417a, j);
            if (read != -1) {
                j -= read;
                mo43901m();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }
}
