package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13758n;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.r */
/* compiled from: FlowableCache */
public final class C12786r<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C12787a<T> f36706N;

    /* renamed from: O */
    final AtomicBoolean f36707O = new AtomicBoolean();

    /* renamed from: e.a.x0.e.b.r$a */
    /* compiled from: FlowableCache */
    static final class C12787a<T> extends C13758n implements C12297q<T> {

        /* renamed from: V */
        static final C12788b[] f36708V = new C12788b[0];

        /* renamed from: W */
        static final C12788b[] f36709W = new C12788b[0];

        /* renamed from: Q */
        final C5929l<T> f36710Q;

        /* renamed from: R */
        final AtomicReference<C14063d> f36711R = new AtomicReference<>();

        /* renamed from: S */
        final AtomicReference<C12788b<T>[]> f36712S;

        /* renamed from: T */
        volatile boolean f36713T;

        /* renamed from: U */
        boolean f36714U;

        C12787a(C5929l<T> lVar, int i) {
            super(i);
            this.f36710Q = lVar;
            this.f36712S = new AtomicReference<>(f36708V);
        }

        /* renamed from: a */
        public boolean mo42430a(C12788b<T> bVar) {
            C12788b[] bVarArr;
            C12788b[] bVarArr2;
            do {
                bVarArr = (C12788b[]) this.f36712S.get();
                if (bVarArr == f36709W) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new C12788b[(length + 1)];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!this.f36712S.compareAndSet(bVarArr, bVarArr2));
            return true;
        }

        /* renamed from: b */
        public void mo42431b(C12788b<T> bVar) {
            C12788b[] bVarArr;
            C12788b[] bVarArr2;
            do {
                bVarArr = (C12788b[]) this.f36712S.get();
                int length = bVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (bVarArr[i2].equals(bVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            bVarArr2 = f36708V;
                        } else {
                            C12788b[] bVarArr3 = new C12788b[(length - 1)];
                            System.arraycopy(bVarArr, 0, bVarArr3, 0, i);
                            System.arraycopy(bVarArr, i + 1, bVarArr3, i, (length - i) - 1);
                            bVarArr2 = bVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f36712S.compareAndSet(bVarArr, bVarArr2));
        }

        /* renamed from: c */
        public void mo42432c() {
            this.f36710Q.mo24393a((C12297q<? super T>) this);
            this.f36713T = true;
        }

        public void onComplete() {
            if (!this.f36714U) {
                this.f36714U = true;
                mo43150c(C13761q.m58750d());
                C13742j.m58674a(this.f36711R);
                for (C12788b a : (C12788b[]) this.f36712S.getAndSet(f36709W)) {
                    a.mo42433a();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f36714U) {
                this.f36714U = true;
                mo43150c(C13761q.m58743a(th));
                C13742j.m58674a(this.f36711R);
                for (C12788b a : (C12788b[]) this.f36712S.getAndSet(f36709W)) {
                    a.mo42433a();
                }
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a(this.f36711R, dVar, Long.MAX_VALUE);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f36714U) {
                mo43150c(C13761q.m58756i(t));
                for (C12788b a : (C12788b[]) this.f36712S.get()) {
                    a.mo42433a();
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.b.r$b */
    /* compiled from: FlowableCache */
    static final class C12788b<T> extends AtomicInteger implements C14063d {

        /* renamed from: S */
        private static final long f36715S = Long.MIN_VALUE;
        private static final long serialVersionUID = -2557562030197141021L;

        /* renamed from: N */
        final AtomicLong f36716N = new AtomicLong();

        /* renamed from: O */
        Object[] f36717O;

        /* renamed from: P */
        int f36718P;

        /* renamed from: Q */
        int f36719Q;

        /* renamed from: R */
        long f36720R;

        /* renamed from: a */
        final C14062c<? super T> f36721a;

        /* renamed from: b */
        final C12787a<T> f36722b;

        C12788b(C14062c<? super T> cVar, C12787a<T> aVar) {
            this.f36721a = cVar;
            this.f36722b = aVar;
        }

        /* renamed from: a */
        public void mo42433a() {
            if (getAndIncrement() == 0) {
                C14062c<? super T> cVar = this.f36721a;
                AtomicLong atomicLong = this.f36716N;
                long j = this.f36720R;
                int i = 1;
                int i2 = 1;
                while (true) {
                    long j2 = atomicLong.get();
                    if (j2 != Long.MIN_VALUE) {
                        int b = this.f36722b.mo43149b();
                        if (b != 0) {
                            Object[] objArr = this.f36717O;
                            if (objArr == null) {
                                objArr = this.f36722b.mo43148a();
                                this.f36717O = objArr;
                            }
                            int length = objArr.length - i;
                            int i3 = this.f36719Q;
                            int i4 = this.f36718P;
                            while (i3 < b && j != j2) {
                                if (atomicLong.get() != Long.MIN_VALUE) {
                                    if (i4 == length) {
                                        objArr = (Object[]) objArr[length];
                                        i4 = 0;
                                    }
                                    if (!C13761q.m58745a(objArr[i4], cVar)) {
                                        i4++;
                                        i3++;
                                        j++;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            if (atomicLong.get() != Long.MIN_VALUE) {
                                if (j2 == j) {
                                    Object obj = objArr[i4];
                                    if (C13761q.m58752e(obj)) {
                                        cVar.onComplete();
                                        return;
                                    } else if (C13761q.m58754g(obj)) {
                                        cVar.onError(C13761q.m58746b(obj));
                                        return;
                                    }
                                }
                                this.f36719Q = i3;
                                this.f36718P = i4;
                                this.f36717O = objArr;
                            } else {
                                return;
                            }
                        }
                        this.f36720R = j;
                        i2 = addAndGet(-i2);
                        if (i2 != 0) {
                            i = 1;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58698b(this.f36716N, j);
                mo42433a();
            }
        }

        public void cancel() {
            if (this.f36716N.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f36722b.mo42431b(this);
            }
        }
    }

    public C12786r(C5929l<T> lVar, int i) {
        super(lVar);
        this.f36706N = new C12787a<>(lVar, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: U */
    public int mo42427U() {
        return this.f36706N.mo43149b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V */
    public boolean mo42428V() {
        return ((C12788b[]) this.f36706N.f36712S.get()).length != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: W */
    public boolean mo42429W() {
        return this.f36706N.f36713T;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        boolean z;
        C12788b bVar = new C12788b(cVar, this.f36706N);
        cVar.mo41788a((C14063d) bVar);
        if (!this.f36706N.mo42430a(bVar) || bVar.f36716N.get() != Long.MIN_VALUE) {
            z = true;
        } else {
            this.f36706N.mo42431b(bVar);
            z = false;
        }
        if (!this.f36707O.get() && this.f36707O.compareAndSet(false, true)) {
            this.f36706N.mo42432c();
        }
        if (z) {
            bVar.mo42433a();
        }
    }
}
