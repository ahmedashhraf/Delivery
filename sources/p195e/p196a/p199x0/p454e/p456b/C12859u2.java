package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p465i.C13736d;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.u2 */
/* compiled from: FlowableRangeLong */
public final class C12859u2 extends C5929l<Long> {

    /* renamed from: N */
    final long f36976N;

    /* renamed from: b */
    final long f36977b;

    /* renamed from: e.a.x0.e.b.u2$a */
    /* compiled from: FlowableRangeLong */
    static abstract class C12860a extends C13736d<Long> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: N */
        volatile boolean f36978N;

        /* renamed from: a */
        final long f36979a;

        /* renamed from: b */
        long f36980b;

        C12860a(long j, long j2) {
            this.f36980b = j;
            this.f36979a = j2;
        }

        /* renamed from: a */
        public final int mo41855a(int i) {
            return i & 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo42486a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo42487a(long j);

        /* renamed from: c */
        public final void mo41813c(long j) {
            if (C13742j.m58678b(j) && C13747d.m58696a((AtomicLong) this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo42486a();
                } else {
                    mo42487a(j);
                }
            }
        }

        public final void cancel() {
            this.f36978N = true;
        }

        public final void clear() {
            this.f36980b = this.f36979a;
        }

        public final boolean isEmpty() {
            return this.f36980b == this.f36979a;
        }

        @C5938g
        public final Long poll() {
            long j = this.f36980b;
            if (j == this.f36979a) {
                return null;
            }
            this.f36980b = 1 + j;
            return Long.valueOf(j);
        }
    }

    /* renamed from: e.a.x0.e.b.u2$b */
    /* compiled from: FlowableRangeLong */
    static final class C12861b extends C12860a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: O */
        final C12392a<? super Long> f36981O;

        C12861b(C12392a<? super Long> aVar, long j, long j2) {
            super(j, j2);
            this.f36981O = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42486a() {
            long j = this.f36979a;
            C12392a<? super Long> aVar = this.f36981O;
            long j2 = this.f36980b;
            while (j2 != j) {
                if (!this.f36978N) {
                    aVar.mo42138b(Long.valueOf(j2));
                    j2++;
                } else {
                    return;
                }
            }
            if (!this.f36978N) {
                aVar.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42487a(long j) {
            long j2 = this.f36979a;
            long j3 = this.f36980b;
            C12392a<? super Long> aVar = this.f36981O;
            long j4 = j3;
            long j5 = j;
            do {
                long j6 = 0;
                while (true) {
                    if (j6 == j5 || j4 == j2) {
                        if (j4 == j2) {
                            if (!this.f36978N) {
                                aVar.onComplete();
                            }
                            return;
                        }
                        j5 = get();
                        if (j6 == j5) {
                            this.f36980b = j4;
                            j5 = addAndGet(-j6);
                        }
                    } else if (!this.f36978N) {
                        if (aVar.mo42138b(Long.valueOf(j4))) {
                            j6++;
                        }
                        j4++;
                    } else {
                        return;
                    }
                }
            } while (j5 != 0);
        }
    }

    /* renamed from: e.a.x0.e.b.u2$c */
    /* compiled from: FlowableRangeLong */
    static final class C12862c extends C12860a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: O */
        final C14062c<? super Long> f36982O;

        C12862c(C14062c<? super Long> cVar, long j, long j2) {
            super(j, j2);
            this.f36982O = cVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42486a() {
            long j = this.f36979a;
            C14062c<? super Long> cVar = this.f36982O;
            long j2 = this.f36980b;
            while (j2 != j) {
                if (!this.f36978N) {
                    cVar.mo41789a(Long.valueOf(j2));
                    j2++;
                } else {
                    return;
                }
            }
            if (!this.f36978N) {
                cVar.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42487a(long j) {
            long j2 = this.f36979a;
            long j3 = this.f36980b;
            C14062c<? super Long> cVar = this.f36982O;
            long j4 = j3;
            long j5 = j;
            do {
                long j6 = 0;
                while (true) {
                    if (j6 == j5 || j4 == j2) {
                        if (j4 == j2) {
                            if (!this.f36978N) {
                                cVar.onComplete();
                            }
                            return;
                        }
                        j5 = get();
                        if (j6 == j5) {
                            this.f36980b = j4;
                            j5 = addAndGet(-j6);
                        }
                    } else if (!this.f36978N) {
                        cVar.mo41789a(Long.valueOf(j4));
                        j6++;
                        j4++;
                    } else {
                        return;
                    }
                }
            } while (j5 != 0);
        }
    }

    public C12859u2(long j, long j2) {
        this.f36977b = j;
        this.f36976N = j + j2;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super Long> cVar) {
        if (cVar instanceof C12392a) {
            C12861b bVar = new C12861b((C12392a) cVar, this.f36977b, this.f36976N);
            cVar.mo41788a((C14063d) bVar);
            return;
        }
        C12862c cVar2 = new C12862c(cVar, this.f36977b, this.f36976N);
        cVar.mo41788a((C14063d) cVar2);
    }
}
