package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.h */
/* compiled from: FlowableAmb */
public final class C12628h<T> extends C5929l<T> {

    /* renamed from: N */
    final Iterable<? extends C6007b<? extends T>> f36153N;

    /* renamed from: b */
    final C6007b<? extends T>[] f36154b;

    /* renamed from: e.a.x0.e.b.h$a */
    /* compiled from: FlowableAmb */
    static final class C12629a<T> implements C14063d {

        /* renamed from: N */
        final AtomicInteger f36155N = new AtomicInteger();

        /* renamed from: a */
        final C14062c<? super T> f36156a;

        /* renamed from: b */
        final C12630b<T>[] f36157b;

        C12629a(C14062c<? super T> cVar, int i) {
            this.f36156a = cVar;
            this.f36157b = new C12630b[i];
        }

        /* renamed from: a */
        public void mo42317a(C6007b<? extends T>[] bVarArr) {
            C12630b<T>[] bVarArr2 = this.f36157b;
            int length = bVarArr2.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                bVarArr2[i] = new C12630b<>(this, i2, this.f36156a);
                i = i2;
            }
            this.f36155N.lazySet(0);
            this.f36156a.mo41788a((C14063d) this);
            for (int i3 = 0; i3 < length && this.f36155N.get() == 0; i3++) {
                bVarArr[i3].mo24397a(bVarArr2[i3]);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                int i = this.f36155N.get();
                if (i > 0) {
                    this.f36157b[i - 1].mo41813c(j);
                } else if (i == 0) {
                    for (C12630b<T> c : this.f36157b) {
                        c.mo41813c(j);
                    }
                }
            }
        }

        public void cancel() {
            if (this.f36155N.get() != -1) {
                this.f36155N.lazySet(-1);
                for (C12630b<T> cancel : this.f36157b) {
                    cancel.cancel();
                }
            }
        }

        /* renamed from: a */
        public boolean mo42318a(int i) {
            int i2 = 0;
            if (this.f36155N.get() != 0 || !this.f36155N.compareAndSet(0, i)) {
                return false;
            }
            C12630b<T>[] bVarArr = this.f36157b;
            int length = bVarArr.length;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (i3 != i) {
                    bVarArr[i2].cancel();
                }
                i2 = i3;
            }
            return true;
        }
    }

    /* renamed from: e.a.x0.e.b.h$b */
    /* compiled from: FlowableAmb */
    static final class C12630b<T> extends AtomicReference<C14063d> implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -1185974347409665484L;

        /* renamed from: N */
        final C14062c<? super T> f36158N;

        /* renamed from: O */
        boolean f36159O;

        /* renamed from: P */
        final AtomicLong f36160P = new AtomicLong();

        /* renamed from: a */
        final C12629a<T> f36161a;

        /* renamed from: b */
        final int f36162b;

        C12630b(C12629a<T> aVar, int i, C14062c<? super T> cVar) {
            this.f36161a = aVar;
            this.f36162b = i;
            this.f36158N = cVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58677a((AtomicReference<C14063d>) this, this.f36160P, dVar);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13742j.m58671a((AtomicReference<C14063d>) this, this.f36160P, j);
        }

        public void cancel() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }

        public void onComplete() {
            if (this.f36159O) {
                this.f36158N.onComplete();
            } else if (this.f36161a.mo42318a(this.f36162b)) {
                this.f36159O = true;
                this.f36158N.onComplete();
            } else {
                ((C14063d) get()).cancel();
            }
        }

        public void onError(Throwable th) {
            if (this.f36159O) {
                this.f36158N.onError(th);
            } else if (this.f36161a.mo42318a(this.f36162b)) {
                this.f36159O = true;
                this.f36158N.onError(th);
            } else {
                ((C14063d) get()).cancel();
                C12205a.m54894b(th);
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (this.f36159O) {
                this.f36158N.mo41789a(t);
            } else if (this.f36161a.mo42318a(this.f36162b)) {
                this.f36159O = true;
                this.f36158N.mo41789a(t);
            } else {
                ((C14063d) get()).cancel();
            }
        }
    }

    public C12628h(C6007b<? extends T>[] bVarArr, Iterable<? extends C6007b<? extends T>> iterable) {
        this.f36154b = bVarArr;
        this.f36153N = iterable;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        int i;
        C6007b<? extends T>[] bVarArr = this.f36154b;
        if (bVarArr == null) {
            bVarArr = new C6007b[8];
            try {
                i = 0;
                for (C6007b<? extends T> bVar : this.f36153N) {
                    if (bVar == null) {
                        C13739g.m58655a((Throwable) new NullPointerException("One of the sources is null"), cVar);
                        return;
                    }
                    if (i == bVarArr.length) {
                        C6007b<? extends T>[] bVarArr2 = new C6007b[((i >> 2) + i)];
                        System.arraycopy(bVarArr, 0, bVarArr2, 0, i);
                        bVarArr = bVarArr2;
                    }
                    int i2 = i + 1;
                    bVarArr[i] = bVar;
                    i = i2;
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C13739g.m58655a(th, cVar);
                return;
            }
        } else {
            i = bVarArr.length;
        }
        if (i == 0) {
            C13739g.m58654a(cVar);
        } else if (i == 1) {
            bVarArr[0].mo24397a(cVar);
        } else {
            new C12629a(cVar, i).mo42317a(bVarArr);
        }
    }
}
