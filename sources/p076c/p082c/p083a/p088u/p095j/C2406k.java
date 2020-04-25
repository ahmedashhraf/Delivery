package p076c.p082c.p083a.p088u.p095j;

import java.util.Queue;
import p076c.p082c.p083a.p084a0.C2213f;
import p076c.p082c.p083a.p084a0.C2216i;

/* renamed from: c.c.a.u.j.k */
/* compiled from: ModelCache */
public class C2406k<A, B> {

    /* renamed from: b */
    private static final int f9384b = 250;

    /* renamed from: a */
    private final C2213f<C2408b<A>, B> f9385a;

    /* renamed from: c.c.a.u.j.k$a */
    /* compiled from: ModelCache */
    class C2407a extends C2213f<C2408b<A>, B> {
        C2407a(int i) {
            super(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9383a(C2408b<A> bVar, B b) {
            bVar.mo9844a();
        }
    }

    /* renamed from: c.c.a.u.j.k$b */
    /* compiled from: ModelCache */
    static final class C2408b<A> {

        /* renamed from: d */
        private static final Queue<C2408b<?>> f9387d = C2216i.m11342a(0);

        /* renamed from: a */
        private int f9388a;

        /* renamed from: b */
        private int f9389b;

        /* renamed from: c */
        private A f9390c;

        private C2408b() {
        }

        /* renamed from: a */
        static <A> C2408b<A> m12262a(A a, int i, int i2) {
            C2408b<A> bVar = (C2408b) f9387d.poll();
            if (bVar == null) {
                bVar = new C2408b<>();
            }
            bVar.m12263b(a, i, i2);
            return bVar;
        }

        /* renamed from: b */
        private void m12263b(A a, int i, int i2) {
            this.f9390c = a;
            this.f9389b = i;
            this.f9388a = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2408b)) {
                return false;
            }
            C2408b bVar = (C2408b) obj;
            if (this.f9389b == bVar.f9389b && this.f9388a == bVar.f9388a && this.f9390c.equals(bVar.f9390c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f9388a * 31) + this.f9389b) * 31) + this.f9390c.hashCode();
        }

        /* renamed from: a */
        public void mo9844a() {
            f9387d.offer(this);
        }
    }

    public C2406k() {
        this(250);
    }

    /* renamed from: a */
    public B mo9841a(A a, int i, int i2) {
        C2408b a2 = C2408b.m12262a(a, i, i2);
        B b = this.f9385a.mo9385b(a2);
        a2.mo9844a();
        return b;
    }

    public C2406k(int i) {
        this.f9385a = new C2407a(i);
    }

    /* renamed from: a */
    public void mo9842a(A a, int i, int i2, B b) {
        this.f9385a.mo9386b(C2408b.m12262a(a, i, i2), b);
    }
}
