package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p465i.C13736d;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.g1 */
/* compiled from: FlowableFromArray */
public final class C12617g1<T> extends C5929l<T> {

    /* renamed from: b */
    final T[] f36123b;

    /* renamed from: e.a.x0.e.b.g1$a */
    /* compiled from: FlowableFromArray */
    static final class C12618a<T> extends C12620c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: O */
        final C12392a<? super T> f36124O;

        C12618a(C12392a<? super T> aVar, T[] tArr) {
            super(tArr);
            this.f36124O = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42309a() {
            T[] tArr = this.f36127a;
            int length = tArr.length;
            C12392a<? super T> aVar = this.f36124O;
            int i = this.f36128b;
            while (i != length) {
                if (!this.f36126N) {
                    T t = tArr[i];
                    if (t == null) {
                        aVar.onError(new NullPointerException("array element is null"));
                        return;
                    } else {
                        aVar.mo42138b(t);
                        i++;
                    }
                } else {
                    return;
                }
            }
            if (!this.f36126N) {
                aVar.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42310a(long j) {
            T[] tArr = this.f36127a;
            int length = tArr.length;
            int i = this.f36128b;
            C12392a<? super T> aVar = this.f36124O;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i == length) {
                        if (i == length) {
                            if (!this.f36126N) {
                                aVar.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.f36128b = i;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.f36126N) {
                        T t = tArr[i];
                        if (t == null) {
                            aVar.onError(new NullPointerException("array element is null"));
                            return;
                        }
                        if (aVar.mo42138b(t)) {
                            j3++;
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    /* renamed from: e.a.x0.e.b.g1$b */
    /* compiled from: FlowableFromArray */
    static final class C12619b<T> extends C12620c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: O */
        final C14062c<? super T> f36125O;

        C12619b(C14062c<? super T> cVar, T[] tArr) {
            super(tArr);
            this.f36125O = cVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42309a() {
            T[] tArr = this.f36127a;
            int length = tArr.length;
            C14062c<? super T> cVar = this.f36125O;
            int i = this.f36128b;
            while (i != length) {
                if (!this.f36126N) {
                    T t = tArr[i];
                    if (t == null) {
                        cVar.onError(new NullPointerException("array element is null"));
                        return;
                    } else {
                        cVar.mo41789a(t);
                        i++;
                    }
                } else {
                    return;
                }
            }
            if (!this.f36126N) {
                cVar.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42310a(long j) {
            T[] tArr = this.f36127a;
            int length = tArr.length;
            int i = this.f36128b;
            C14062c<? super T> cVar = this.f36125O;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i == length) {
                        if (i == length) {
                            if (!this.f36126N) {
                                cVar.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.f36128b = i;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.f36126N) {
                        T t = tArr[i];
                        if (t == null) {
                            cVar.onError(new NullPointerException("array element is null"));
                            return;
                        }
                        cVar.mo41789a(t);
                        j3++;
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    /* renamed from: e.a.x0.e.b.g1$c */
    /* compiled from: FlowableFromArray */
    static abstract class C12620c<T> extends C13736d<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: N */
        volatile boolean f36126N;

        /* renamed from: a */
        final T[] f36127a;

        /* renamed from: b */
        int f36128b;

        C12620c(T[] tArr) {
            this.f36127a = tArr;
        }

        /* renamed from: a */
        public final int mo41855a(int i) {
            return i & 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo42309a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo42310a(long j);

        /* renamed from: c */
        public final void mo41813c(long j) {
            if (C13742j.m58678b(j) && C13747d.m58696a((AtomicLong) this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo42309a();
                } else {
                    mo42310a(j);
                }
            }
        }

        public final void cancel() {
            this.f36126N = true;
        }

        public final void clear() {
            this.f36128b = this.f36127a.length;
        }

        public final boolean isEmpty() {
            return this.f36128b == this.f36127a.length;
        }

        @C5938g
        public final T poll() {
            int i = this.f36128b;
            T[] tArr = this.f36127a;
            if (i == tArr.length) {
                return null;
            }
            this.f36128b = i + 1;
            return C12390b.m55563a(tArr[i], "array element is null");
        }
    }

    public C12617g1(T[] tArr) {
        this.f36123b = tArr;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        if (cVar instanceof C12392a) {
            cVar.mo41788a((C14063d) new C12618a((C12392a) cVar, this.f36123b));
        } else {
            cVar.mo41788a((C14063d) new C12619b(cVar, this.f36123b));
        }
    }
}
