package p076c.p112d.p148d.p276c;

import com.google.common.base.C7397x;
import java.nio.charset.Charset;

/* renamed from: c.d.d.c.b */
/* compiled from: AbstractCompositeHashFunction */
abstract class C6529b extends C6535e {

    /* renamed from: b */
    private static final long f18242b = 0;

    /* renamed from: a */
    final C6562l[] f18243a;

    /* renamed from: c.d.d.c.b$a */
    /* compiled from: AbstractCompositeHashFunction */
    class C6530a implements C6563m {

        /* renamed from: a */
        final /* synthetic */ C6563m[] f18244a;

        C6530a(C6563m[] mVarArr) {
            this.f18244a = mVarArr;
        }

        /* renamed from: a */
        public C6563m m31057a(byte b) {
            for (C6563m a : this.f18244a) {
                a.mo26416a(b);
            }
            return this;
        }

        /* renamed from: a */
        public C6563m m31067a(byte[] bArr) {
            for (C6563m a : this.f18244a) {
                a.mo26422a(bArr);
            }
            return this;
        }

        /* renamed from: a */
        public C6563m m31068a(byte[] bArr, int i, int i2) {
            for (C6563m a : this.f18244a) {
                a.mo26423a(bArr, i, i2);
            }
            return this;
        }

        /* renamed from: a */
        public C6563m m31065a(short s) {
            for (C6563m a : this.f18244a) {
                a.mo26421a(s);
            }
            return this;
        }

        /* renamed from: a */
        public C6563m m31061a(int i) {
            for (C6563m a : this.f18244a) {
                a.mo26418a(i);
            }
            return this;
        }

        /* renamed from: a */
        public C6563m m31062a(long j) {
            for (C6563m a : this.f18244a) {
                a.mo26419a(j);
            }
            return this;
        }

        /* renamed from: a */
        public C6563m m31060a(float f) {
            for (C6563m a : this.f18244a) {
                a.mo26431a(f);
            }
            return this;
        }

        /* renamed from: a */
        public C6563m m31059a(double d) {
            for (C6563m a : this.f18244a) {
                a.mo26430a(d);
            }
            return this;
        }

        /* renamed from: a */
        public C6563m m31066a(boolean z) {
            for (C6563m a : this.f18244a) {
                a.mo26434a(z);
            }
            return this;
        }

        /* renamed from: a */
        public C6563m m31058a(char c) {
            for (C6563m a : this.f18244a) {
                a.mo26417a(c);
            }
            return this;
        }

        /* renamed from: a */
        public C6563m m31063a(CharSequence charSequence) {
            for (C6563m a : this.f18244a) {
                a.mo26432a(charSequence);
            }
            return this;
        }

        /* renamed from: a */
        public C6563m m31064a(CharSequence charSequence, Charset charset) {
            for (C6563m a : this.f18244a) {
                a.mo26433a(charSequence, charset);
            }
            return this;
        }

        /* renamed from: a */
        public <T> C6563m mo26420a(T t, C6548i<? super T> iVar) {
            for (C6563m a : this.f18244a) {
                a.mo26420a(t, iVar);
            }
            return this;
        }

        /* renamed from: a */
        public C6558k mo26429a() {
            return C6529b.this.mo26427a(this.f18244a);
        }
    }

    C6529b(C6562l... lVarArr) {
        for (C6562l a : lVarArr) {
            C7397x.m35664a(a);
        }
        this.f18243a = lVarArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C6558k mo26427a(C6563m[] mVarArr);

    /* renamed from: a */
    public C6563m mo26428a() {
        C6563m[] mVarArr = new C6563m[this.f18243a.length];
        for (int i = 0; i < mVarArr.length; i++) {
            mVarArr[i] = this.f18243a[i].mo26428a();
        }
        return new C6530a(mVarArr);
    }
}
