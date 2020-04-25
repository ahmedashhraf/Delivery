package p076c.p112d.p148d.p276c;

import com.google.common.base.C7397x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: c.d.d.c.d */
/* compiled from: AbstractNonStreamingHashFunction */
abstract class C6532d implements C6562l {

    /* renamed from: c.d.d.c.d$a */
    /* compiled from: AbstractNonStreamingHashFunction */
    private final class C6533a extends C6531c {

        /* renamed from: c */
        static final int f18246c = 255;

        /* renamed from: a */
        final C6534b f18247a;

        C6533a(int i) {
            this.f18247a = new C6534b(i);
        }

        /* renamed from: a */
        public C6563m m31096a(byte b) {
            this.f18247a.write(b);
            return this;
        }

        /* renamed from: a */
        public C6563m m31101a(byte[] bArr) {
            try {
                this.f18247a.write(bArr);
                return this;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: a */
        public C6563m m31102a(byte[] bArr, int i, int i2) {
            this.f18247a.write(bArr, i, i2);
            return this;
        }

        /* renamed from: a */
        public C6563m m31100a(short s) {
            this.f18247a.write(s & 255);
            this.f18247a.write((s >>> 8) & 255);
            return this;
        }

        /* renamed from: a */
        public C6563m m31098a(int i) {
            this.f18247a.write(i & 255);
            this.f18247a.write((i >>> 8) & 255);
            this.f18247a.write((i >>> 16) & 255);
            this.f18247a.write((i >>> 24) & 255);
            return this;
        }

        /* renamed from: a */
        public C6563m m31099a(long j) {
            for (int i = 0; i < 64; i += 8) {
                this.f18247a.write((byte) ((int) ((j >>> i) & 255)));
            }
            return this;
        }

        /* renamed from: a */
        public C6563m m31097a(char c) {
            this.f18247a.write(c & 255);
            this.f18247a.write((c >>> 8) & 255);
            return this;
        }

        /* renamed from: a */
        public <T> C6563m mo26420a(T t, C6548i<? super T> iVar) {
            iVar.mo26470a(t, this);
            return this;
        }

        /* renamed from: a */
        public C6558k mo26429a() {
            return C6532d.this.mo26444a(this.f18247a.mo26442a(), 0, this.f18247a.mo26443d());
        }
    }

    /* renamed from: c.d.d.c.d$b */
    /* compiled from: AbstractNonStreamingHashFunction */
    private static final class C6534b extends ByteArrayOutputStream {
        C6534b(int i) {
            super(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public byte[] mo26442a() {
            return this.buf;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo26443d() {
            return this.count;
        }
    }

    C6532d() {
    }

    /* renamed from: a */
    public C6563m mo26428a() {
        return new C6533a(32);
    }

    /* renamed from: b */
    public C6563m mo26441b(int i) {
        C7397x.m35670a(i >= 0);
        return new C6533a(i);
    }

    /* renamed from: a */
    public <T> C6558k mo26439a(T t, C6548i<? super T> iVar) {
        return mo26428a().mo26420a(t, iVar).mo26429a();
    }

    /* renamed from: a */
    public C6558k mo26437a(CharSequence charSequence) {
        int length = charSequence.length();
        C6563m b = mo26441b(length * 2);
        for (int i = 0; i < length; i++) {
            b.mo26417a(charSequence.charAt(i));
        }
        return b.mo26429a();
    }

    /* renamed from: a */
    public C6558k mo26438a(CharSequence charSequence, Charset charset) {
        try {
            return mo26440a(charSequence.toString().getBytes(charset.name()));
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public C6558k mo26435a(int i) {
        return mo26441b(4).mo26418a(i).mo26429a();
    }

    /* renamed from: a */
    public C6558k mo26436a(long j) {
        return mo26441b(8).mo26419a(j).mo26429a();
    }

    /* renamed from: a */
    public C6558k mo26440a(byte[] bArr) {
        return mo26444a(bArr, 0, bArr.length);
    }
}
