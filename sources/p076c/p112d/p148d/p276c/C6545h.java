package p076c.p112d.p148d.p276c;

import com.google.common.base.C7344g0;
import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.zip.Checksum;

/* renamed from: c.d.d.c.h */
/* compiled from: ChecksumHashFunction */
final class C6545h extends C6535e implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: N */
    private final String f18264N;

    /* renamed from: a */
    private final C7344g0<? extends Checksum> f18265a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f18266b;

    /* renamed from: c.d.d.c.h$b */
    /* compiled from: ChecksumHashFunction */
    private final class C6547b extends C6528a {

        /* renamed from: b */
        private final Checksum f18267b;

        /* renamed from: a */
        public C6558k mo26429a() {
            long value = this.f18267b.getValue();
            if (C6545h.this.f18266b == 32) {
                return C6558k.m31195a((int) value);
            }
            return C6558k.m31196a(value);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo26424b(byte b) {
            this.f18267b.update(b);
        }

        private C6547b(Checksum checksum) {
            this.f18267b = (Checksum) C7397x.m35664a(checksum);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo26426b(byte[] bArr, int i, int i2) {
            this.f18267b.update(bArr, i, i2);
        }
    }

    C6545h(C7344g0<? extends Checksum> g0Var, int i, String str) {
        this.f18265a = (C7344g0) C7397x.m35664a(g0Var);
        C7397x.m35672a(i == 32 || i == 64, "bits (%s) must be either 32 or 64", Integer.valueOf(i));
        this.f18266b = i;
        this.f18264N = (String) C7397x.m35664a(str);
    }

    /* renamed from: d */
    public int mo26468d() {
        return this.f18266b;
    }

    public String toString() {
        return this.f18264N;
    }

    /* renamed from: a */
    public C6563m mo26428a() {
        return new C6547b((Checksum) this.f18265a.get());
    }
}
