package p195e.p196a.p199x0.p454e.p459e;

import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p453d.C12409b;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.e.e.j2 */
/* compiled from: ObservableRangeLong */
public final class C13272j2 extends C5923b0<Long> {

    /* renamed from: a */
    private final long f38343a;

    /* renamed from: b */
    private final long f38344b;

    /* renamed from: e.a.x0.e.e.j2$a */
    /* compiled from: ObservableRangeLong */
    static final class C13273a extends C12409b<Long> {
        private static final long serialVersionUID = 396518478098735504L;

        /* renamed from: N */
        long f38345N;

        /* renamed from: O */
        boolean f38346O;

        /* renamed from: a */
        final C12280i0<? super Long> f38347a;

        /* renamed from: b */
        final long f38348b;

        C13273a(C12280i0<? super Long> i0Var, long j, long j2) {
            this.f38347a = i0Var;
            this.f38345N = j;
            this.f38348b = j2;
        }

        /* renamed from: a */
        public int mo41855a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f38346O = true;
            return 1;
        }

        public void clear() {
            this.f38345N = this.f38348b;
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
            return this.f38345N == this.f38348b;
        }

        /* access modifiers changed from: 0000 */
        public void run() {
            if (!this.f38346O) {
                C12280i0<? super Long> i0Var = this.f38347a;
                long j = this.f38348b;
                for (long j2 = this.f38345N; j2 != j && get() == 0; j2++) {
                    i0Var.mo33453a(Long.valueOf(j2));
                }
                if (get() == 0) {
                    lazySet(1);
                    i0Var.onComplete();
                }
            }
        }

        @C5938g
        public Long poll() throws Exception {
            long j = this.f38345N;
            if (j != this.f38348b) {
                this.f38345N = 1 + j;
                return Long.valueOf(j);
            }
            lazySet(1);
            return null;
        }
    }

    public C13272j2(long j, long j2) {
        this.f38343a = j;
        this.f38344b = j2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super Long> i0Var) {
        long j = this.f38343a;
        C13273a aVar = new C13273a(i0Var, j, j + this.f38344b);
        i0Var.mo34123a((C12314c) aVar);
        aVar.run();
    }
}
