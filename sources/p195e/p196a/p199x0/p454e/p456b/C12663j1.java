package p195e.p196a.p199x0.p454e.p456b;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p465i.C13736d;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.j1 */
/* compiled from: FlowableFromIterable */
public final class C12663j1<T> extends C5929l<T> {

    /* renamed from: b */
    final Iterable<? extends T> f36266b;

    /* renamed from: e.a.x0.e.b.j1$a */
    /* compiled from: FlowableFromIterable */
    static abstract class C12664a<T> extends C13736d<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: N */
        boolean f36267N;

        /* renamed from: a */
        Iterator<? extends T> f36268a;

        /* renamed from: b */
        volatile boolean f36269b;

        C12664a(Iterator<? extends T> it) {
            this.f36268a = it;
        }

        /* renamed from: a */
        public final int mo41855a(int i) {
            return i & 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo42345a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo42346a(long j);

        /* renamed from: c */
        public final void mo41813c(long j) {
            if (C13742j.m58678b(j) && C13747d.m58696a((AtomicLong) this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo42345a();
                } else {
                    mo42346a(j);
                }
            }
        }

        public final void cancel() {
            this.f36269b = true;
        }

        public final void clear() {
            this.f36268a = null;
        }

        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f36268a;
            return it == null || !it.hasNext();
        }

        @C5938g
        public final T poll() {
            Iterator<? extends T> it = this.f36268a;
            if (it == null) {
                return null;
            }
            if (!this.f36267N) {
                this.f36267N = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return C12390b.m55563a(this.f36268a.next(), "Iterator.next() returned a null value");
        }
    }

    /* renamed from: e.a.x0.e.b.j1$b */
    /* compiled from: FlowableFromIterable */
    static final class C12665b<T> extends C12664a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* renamed from: O */
        final C12392a<? super T> f36270O;

        C12665b(C12392a<? super T> aVar, Iterator<? extends T> it) {
            super(it);
            this.f36270O = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42345a() {
            Iterator<? extends T> it = this.f36268a;
            C12392a<? super T> aVar = this.f36270O;
            while (!this.f36269b) {
                try {
                    Object next = it.next();
                    if (!this.f36269b) {
                        if (next == null) {
                            aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        aVar.mo42138b(next);
                        if (!this.f36269b) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.f36269b) {
                                        aVar.onComplete();
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                C14398a.m62357b(th);
                                aVar.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    aVar.onError(th2);
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42346a(long j) {
            Iterator<? extends T> it = this.f36268a;
            C12392a<? super T> aVar = this.f36270O;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2) {
                        j2 = get();
                        if (j3 == j2) {
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.f36269b) {
                        try {
                            Object next = it.next();
                            if (!this.f36269b) {
                                if (next == null) {
                                    aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                boolean b = aVar.mo42138b(next);
                                if (!this.f36269b) {
                                    try {
                                        if (!it.hasNext()) {
                                            if (!this.f36269b) {
                                                aVar.onComplete();
                                            }
                                            return;
                                        } else if (b) {
                                            j3++;
                                        }
                                    } catch (Throwable th) {
                                        C14398a.m62357b(th);
                                        aVar.onError(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            C14398a.m62357b(th2);
                            aVar.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    /* renamed from: e.a.x0.e.b.j1$c */
    /* compiled from: FlowableFromIterable */
    static final class C12666c<T> extends C12664a<T> {
        private static final long serialVersionUID = -6022804456014692607L;

        /* renamed from: O */
        final C14062c<? super T> f36271O;

        C12666c(C14062c<? super T> cVar, Iterator<? extends T> it) {
            super(it);
            this.f36271O = cVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42345a() {
            Iterator<? extends T> it = this.f36268a;
            C14062c<? super T> cVar = this.f36271O;
            while (!this.f36269b) {
                try {
                    Object next = it.next();
                    if (!this.f36269b) {
                        if (next == null) {
                            cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                            return;
                        }
                        cVar.mo41789a(next);
                        if (!this.f36269b) {
                            try {
                                if (!it.hasNext()) {
                                    if (!this.f36269b) {
                                        cVar.onComplete();
                                    }
                                    return;
                                }
                            } catch (Throwable th) {
                                C14398a.m62357b(th);
                                cVar.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C14398a.m62357b(th2);
                    cVar.onError(th2);
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42346a(long j) {
            Iterator<? extends T> it = this.f36268a;
            C14062c<? super T> cVar = this.f36271O;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2) {
                        j2 = get();
                        if (j3 == j2) {
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.f36269b) {
                        try {
                            Object next = it.next();
                            if (!this.f36269b) {
                                if (next == null) {
                                    cVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    return;
                                }
                                cVar.mo41789a(next);
                                if (!this.f36269b) {
                                    try {
                                        if (!it.hasNext()) {
                                            if (!this.f36269b) {
                                                cVar.onComplete();
                                            }
                                            return;
                                        }
                                        j3++;
                                    } catch (Throwable th) {
                                        C14398a.m62357b(th);
                                        cVar.onError(th);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            C14398a.m62357b(th2);
                            cVar.onError(th2);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    public C12663j1(Iterable<? extends T> iterable) {
        this.f36266b = iterable;
    }

    /* renamed from: a */
    public static <T> void m56130a(C14062c<? super T> cVar, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                C13739g.m58654a(cVar);
                return;
            }
            if (cVar instanceof C12392a) {
                cVar.mo41788a((C14063d) new C12665b((C12392a) cVar, it));
            } else {
                cVar.mo41788a((C14063d) new C12666c(cVar, it));
            }
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C13739g.m58655a(th, cVar);
        }
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        try {
            m56130a(cVar, this.f36266b.iterator());
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C13739g.m58655a(th, cVar);
        }
    }
}
