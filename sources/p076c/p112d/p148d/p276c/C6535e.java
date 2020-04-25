package p076c.p112d.p148d.p276c;

import com.google.common.base.C7397x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: c.d.d.c.e */
/* compiled from: AbstractStreamingHashFunction */
abstract class C6535e implements C6562l {

    /* renamed from: c.d.d.c.e$a */
    /* compiled from: AbstractStreamingHashFunction */
    protected static abstract class C6536a extends C6531c {

        /* renamed from: a */
        private final ByteBuffer f18249a;

        /* renamed from: b */
        private final int f18250b;

        /* renamed from: c */
        private final int f18251c;

        protected C6536a(int i) {
            this(i, i);
        }

        /* renamed from: c */
        private C6563m m31113c(ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() <= this.f18249a.remaining()) {
                this.f18249a.put(byteBuffer);
                m31115d();
                return this;
            }
            int position = this.f18250b - this.f18249a.position();
            for (int i = 0; i < position; i++) {
                this.f18249a.put(byteBuffer.get());
            }
            m31114c();
            while (byteBuffer.remaining() >= this.f18251c) {
                mo26445a(byteBuffer);
            }
            this.f18249a.put(byteBuffer);
            return this;
        }

        /* renamed from: d */
        private void m31115d() {
            if (this.f18249a.remaining() < 8) {
                m31114c();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo26445a(ByteBuffer byteBuffer);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract C6558k mo26446b();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo26447b(ByteBuffer byteBuffer) {
            byteBuffer.position(byteBuffer.limit());
            byteBuffer.limit(this.f18251c + 7);
            while (true) {
                int position = byteBuffer.position();
                int i = this.f18251c;
                if (position < i) {
                    byteBuffer.putLong(0);
                } else {
                    byteBuffer.limit(i);
                    byteBuffer.flip();
                    mo26445a(byteBuffer);
                    return;
                }
            }
        }

        protected C6536a(int i, int i2) {
            C7397x.m35670a(i2 % i == 0);
            this.f18249a = ByteBuffer.allocate(i2 + 7).order(ByteOrder.LITTLE_ENDIAN);
            this.f18250b = i2;
            this.f18251c = i;
        }

        /* renamed from: a */
        public final C6563m m31132a(byte[] bArr) {
            return m31133a(bArr, 0, bArr.length);
        }

        /* renamed from: c */
        private void m31114c() {
            this.f18249a.flip();
            while (this.f18249a.remaining() >= this.f18251c) {
                mo26445a(this.f18249a);
            }
            this.f18249a.compact();
        }

        /* renamed from: a */
        public final C6563m m31133a(byte[] bArr, int i, int i2) {
            return m31113c(ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN));
        }

        /* renamed from: a */
        public final C6563m m31130a(CharSequence charSequence) {
            for (int i = 0; i < charSequence.length(); i++) {
                m31127a(charSequence.charAt(i));
            }
            return this;
        }

        /* renamed from: a */
        public final C6563m m31126a(byte b) {
            this.f18249a.put(b);
            m31115d();
            return this;
        }

        /* renamed from: a */
        public final C6563m m31131a(short s) {
            this.f18249a.putShort(s);
            m31115d();
            return this;
        }

        /* renamed from: a */
        public final C6563m m31127a(char c) {
            this.f18249a.putChar(c);
            m31115d();
            return this;
        }

        /* renamed from: a */
        public final C6563m m31128a(int i) {
            this.f18249a.putInt(i);
            m31115d();
            return this;
        }

        /* renamed from: a */
        public final C6563m m31129a(long j) {
            this.f18249a.putLong(j);
            m31115d();
            return this;
        }

        /* renamed from: a */
        public final <T> C6563m mo26420a(T t, C6548i<? super T> iVar) {
            iVar.mo26470a(t, this);
            return this;
        }

        /* renamed from: a */
        public final C6558k mo26429a() {
            m31114c();
            this.f18249a.flip();
            if (this.f18249a.remaining() > 0) {
                mo26447b(this.f18249a);
            }
            return mo26446b();
        }
    }

    C6535e() {
    }

    /* renamed from: a */
    public <T> C6558k mo26439a(T t, C6548i<? super T> iVar) {
        return mo26428a().mo26420a(t, iVar).mo26429a();
    }

    /* renamed from: b */
    public C6563m mo26441b(int i) {
        C7397x.m35670a(i >= 0);
        return mo26428a();
    }

    /* renamed from: a */
    public C6558k mo26437a(CharSequence charSequence) {
        return mo26428a().mo26432a(charSequence).mo26429a();
    }

    /* renamed from: a */
    public C6558k mo26438a(CharSequence charSequence, Charset charset) {
        return mo26428a().mo26433a(charSequence, charset).mo26429a();
    }

    /* renamed from: a */
    public C6558k mo26435a(int i) {
        return mo26428a().mo26418a(i).mo26429a();
    }

    /* renamed from: a */
    public C6558k mo26436a(long j) {
        return mo26428a().mo26419a(j).mo26429a();
    }

    /* renamed from: a */
    public C6558k mo26440a(byte[] bArr) {
        return mo26428a().mo26422a(bArr).mo26429a();
    }

    /* renamed from: a */
    public C6558k mo26444a(byte[] bArr, int i, int i2) {
        return mo26428a().mo26423a(bArr, i, i2).mo26429a();
    }
}
