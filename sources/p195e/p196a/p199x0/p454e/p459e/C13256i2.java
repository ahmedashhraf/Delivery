package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p453d.C12409b;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.i2 */
/* compiled from: ObservableRange */
public final class C13256i2 extends C5923b0<Integer> {

    /* renamed from: a */
    private final int f38287a;

    /* renamed from: b */
    private final long f38288b;

    /* renamed from: e.a.x0.e.e.i2$a */
    /* compiled from: ObservableRange */
    static final class C13257a extends C12409b<Integer> {
        private static final long serialVersionUID = 396518478098735504L;

        /* renamed from: N */
        long f38289N;

        /* renamed from: O */
        boolean f38290O;

        /* renamed from: a */
        final C12280i0<? super Integer> f38291a;

        /* renamed from: b */
        final long f38292b;

        C13257a(C12280i0<? super Integer> i0Var, long j, long j2) {
            this.f38291a = i0Var;
            this.f38289N = j;
            this.f38292b = j2;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f38290O = true;
            return 1;
        }

        public void clear() {
            this.f38289N = this.f38292b;
            lazySet(1);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() != 0;
        }

        public void dispose() {
            set(1);
        }

        public boolean isEmpty() {
            return this.f38289N == this.f38292b;
        }

        /* access modifiers changed from: 0000 */
        public void run() {
            if (!this.f38290O) {
                C12280i0<? super Integer> i0Var = this.f38291a;
                long j = this.f38292b;
                for (long j2 = this.f38289N; j2 != j && get() == 0; j2++) {
                    i0Var.mo33453a(Integer.valueOf((int) j2));
                }
                if (get() == 0) {
                    lazySet(1);
                    i0Var.onComplete();
                }
            }
        }

        @C5938g
        public Integer poll() throws Exception {
            long j = this.f38289N;
            if (j != this.f38292b) {
                this.f38289N = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }
    }

    public C13256i2(int i, int i2) {
        this.f38287a = i;
        this.f38288b = ((long) i) + ((long) i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super Integer> i0Var) {
        C13257a aVar = new C13257a(i0Var, (long) this.f38287a, this.f38288b);
        i0Var.mo34123a((C12314c) aVar);
        aVar.run();
    }
}
