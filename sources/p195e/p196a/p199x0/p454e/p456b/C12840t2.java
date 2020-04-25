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

/* renamed from: e.a.x0.e.b.t2 */
/* compiled from: FlowableRange */
public final class C12840t2 extends C5929l<Integer> {

    /* renamed from: N */
    final int f36907N;

    /* renamed from: b */
    final int f36908b;

    /* renamed from: e.a.x0.e.b.t2$a */
    /* compiled from: FlowableRange */
    static abstract class C12841a extends C13736d<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: N */
        volatile boolean f36909N;

        /* renamed from: a */
        final int f36910a;

        /* renamed from: b */
        int f36911b;

        C12841a(int i, int i2) {
            this.f36911b = i;
            this.f36910a = i2;
        }

        /* renamed from: a */
        public final int mo41855a(int i) {
            return i & 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo42466a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo42467a(long j);

        /* renamed from: c */
        public final void mo41813c(long j) {
            if (C13742j.m58678b(j) && C13747d.m58696a((AtomicLong) this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo42466a();
                } else {
                    mo42467a(j);
                }
            }
        }

        public final void cancel() {
            this.f36909N = true;
        }

        public final void clear() {
            this.f36911b = this.f36910a;
        }

        public final boolean isEmpty() {
            return this.f36911b == this.f36910a;
        }

        @C5938g
        public final Integer poll() {
            int i = this.f36911b;
            if (i == this.f36910a) {
                return null;
            }
            this.f36911b = i + 1;
            return Integer.valueOf(i);
        }
    }

    /* renamed from: e.a.x0.e.b.t2$b */
    /* compiled from: FlowableRange */
    static final class C12842b extends C12841a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: O */
        final C12392a<? super Integer> f36912O;

        C12842b(C12392a<? super Integer> aVar, int i, int i2) {
            super(i, i2);
            this.f36912O = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42466a() {
            int i = this.f36910a;
            C12392a<? super Integer> aVar = this.f36912O;
            int i2 = this.f36911b;
            while (i2 != i) {
                if (!this.f36909N) {
                    aVar.mo42138b(Integer.valueOf(i2));
                    i2++;
                } else {
                    return;
                }
            }
            if (!this.f36909N) {
                aVar.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42467a(long j) {
            int i = this.f36910a;
            int i2 = this.f36911b;
            C12392a<? super Integer> aVar = this.f36912O;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i2 == i) {
                        if (i2 == i) {
                            if (!this.f36909N) {
                                aVar.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.f36911b = i2;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.f36909N) {
                        if (aVar.mo42138b(Integer.valueOf(i2))) {
                            j3++;
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    /* renamed from: e.a.x0.e.b.t2$c */
    /* compiled from: FlowableRange */
    static final class C12843c extends C12841a {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: O */
        final C14062c<? super Integer> f36913O;

        C12843c(C14062c<? super Integer> cVar, int i, int i2) {
            super(i, i2);
            this.f36913O = cVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42466a() {
            int i = this.f36910a;
            C14062c<? super Integer> cVar = this.f36913O;
            int i2 = this.f36911b;
            while (i2 != i) {
                if (!this.f36909N) {
                    cVar.mo41789a(Integer.valueOf(i2));
                    i2++;
                } else {
                    return;
                }
            }
            if (!this.f36909N) {
                cVar.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42467a(long j) {
            int i = this.f36910a;
            int i2 = this.f36911b;
            C14062c<? super Integer> cVar = this.f36913O;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i2 == i) {
                        if (i2 == i) {
                            if (!this.f36909N) {
                                cVar.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.f36911b = i2;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.f36909N) {
                        cVar.mo41789a(Integer.valueOf(i2));
                        j3++;
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    public C12840t2(int i, int i2) {
        this.f36908b = i;
        this.f36907N = i + i2;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super Integer> cVar) {
        if (cVar instanceof C12392a) {
            cVar.mo41788a((C14063d) new C12842b((C12392a) cVar, this.f36908b, this.f36907N));
        } else {
            cVar.mo41788a((C14063d) new C12843c(cVar, this.f36908b, this.f36907N));
        }
    }
}
