package p076c.p112d.p148d.p276c;

import com.google.common.base.C7397x;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: c.d.d.c.j */
/* compiled from: Funnels */
public final class C6549j {

    /* renamed from: c.d.d.c.j$a */
    /* compiled from: Funnels */
    private enum C6550a implements C6548i<byte[]> {
        INSTANCE;

        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }

        /* renamed from: a */
        public void mo26470a(byte[] bArr, C6590t tVar) {
            tVar.mo26422a(bArr);
        }
    }

    /* renamed from: c.d.d.c.j$b */
    /* compiled from: Funnels */
    private enum C6551b implements C6548i<Integer> {
        INSTANCE;

        public String toString() {
            return "Funnels.integerFunnel()";
        }

        /* renamed from: a */
        public void mo26470a(Integer num, C6590t tVar) {
            tVar.mo26418a(num.intValue());
        }
    }

    /* renamed from: c.d.d.c.j$c */
    /* compiled from: Funnels */
    private enum C6552c implements C6548i<Long> {
        INSTANCE;

        public String toString() {
            return "Funnels.longFunnel()";
        }

        /* renamed from: a */
        public void mo26470a(Long l, C6590t tVar) {
            tVar.mo26419a(l.longValue());
        }
    }

    /* renamed from: c.d.d.c.j$d */
    /* compiled from: Funnels */
    private static class C6553d<E> implements C6548i<Iterable<? extends E>>, Serializable {

        /* renamed from: a */
        private final C6548i<E> f18269a;

        C6553d(C6548i<E> iVar) {
            this.f18269a = (C6548i) C7397x.m35664a(iVar);
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C6553d)) {
                return false;
            }
            return this.f18269a.equals(((C6553d) obj).f18269a);
        }

        public int hashCode() {
            return C6553d.class.hashCode() ^ this.f18269a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Funnels.sequentialFunnel(");
            sb.append(this.f18269a);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: a */
        public void mo26470a(Iterable<? extends E> iterable, C6590t tVar) {
            for (Object a : iterable) {
                this.f18269a.mo26470a(a, tVar);
            }
        }
    }

    /* renamed from: c.d.d.c.j$e */
    /* compiled from: Funnels */
    private static class C6554e extends OutputStream {

        /* renamed from: a */
        final C6590t f18270a;

        C6554e(C6590t tVar) {
            this.f18270a = (C6590t) C7397x.m35664a(tVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Funnels.asOutputStream(");
            sb.append(this.f18270a);
            sb.append(")");
            return sb.toString();
        }

        public void write(int i) {
            this.f18270a.mo26416a((byte) i);
        }

        public void write(byte[] bArr) {
            this.f18270a.mo26422a(bArr);
        }

        public void write(byte[] bArr, int i, int i2) {
            this.f18270a.mo26423a(bArr, i, i2);
        }
    }

    /* renamed from: c.d.d.c.j$f */
    /* compiled from: Funnels */
    private static class C6555f implements C6548i<CharSequence>, Serializable {

        /* renamed from: a */
        private final Charset f18271a;

        /* renamed from: c.d.d.c.j$f$a */
        /* compiled from: Funnels */
        private static class C6556a implements Serializable {
            private static final long serialVersionUID = 0;

            /* renamed from: a */
            private final String f18272a;

            C6556a(Charset charset) {
                this.f18272a = charset.name();
            }

            private Object readResolve() {
                return C6549j.m31177a(Charset.forName(this.f18272a));
            }
        }

        C6555f(Charset charset) {
            this.f18271a = (Charset) C7397x.m35664a(charset);
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C6555f)) {
                return false;
            }
            return this.f18271a.equals(((C6555f) obj).f18271a);
        }

        public int hashCode() {
            return C6555f.class.hashCode() ^ this.f18271a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Funnels.stringFunnel(");
            sb.append(this.f18271a.name());
            sb.append(")");
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        public Object writeReplace() {
            return new C6556a(this.f18271a);
        }

        /* renamed from: a */
        public void mo26470a(CharSequence charSequence, C6590t tVar) {
            tVar.mo26433a(charSequence, this.f18271a);
        }
    }

    /* renamed from: c.d.d.c.j$g */
    /* compiled from: Funnels */
    private enum C6557g implements C6548i<CharSequence> {
        INSTANCE;

        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }

        /* renamed from: a */
        public void mo26470a(CharSequence charSequence, C6590t tVar) {
            tVar.mo26432a(charSequence);
        }
    }

    private C6549j() {
    }

    /* renamed from: a */
    public static C6548i<byte[]> m31175a() {
        return C6550a.INSTANCE;
    }

    /* renamed from: b */
    public static C6548i<Integer> m31179b() {
        return C6551b.INSTANCE;
    }

    /* renamed from: c */
    public static C6548i<Long> m31180c() {
        return C6552c.INSTANCE;
    }

    /* renamed from: d */
    public static C6548i<CharSequence> m31181d() {
        return C6557g.INSTANCE;
    }

    /* renamed from: a */
    public static C6548i<CharSequence> m31177a(Charset charset) {
        return new C6555f(charset);
    }

    /* renamed from: a */
    public static <E> C6548i<Iterable<? extends E>> m31176a(C6548i<E> iVar) {
        return new C6553d(iVar);
    }

    /* renamed from: a */
    public static OutputStream m31178a(C6590t tVar) {
        return new C6554e(tVar);
    }
}
