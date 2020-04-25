package p195e.p196a.p199x0.p454e.p460f;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p197a1.C5922b;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.f.p */
/* compiled from: ParallelSortedJoin */
public final class C13556p<T> extends C5929l<T> {

    /* renamed from: N */
    final Comparator<? super T> f39283N;

    /* renamed from: b */
    final C5922b<List<T>> f39284b;

    /* renamed from: e.a.x0.e.f.p$a */
    /* compiled from: ParallelSortedJoin */
    static final class C13557a<T> extends AtomicReference<C14063d> implements C12297q<List<T>> {
        private static final long serialVersionUID = 6751017204873808094L;

        /* renamed from: a */
        final C13558b<T> f39285a;

        /* renamed from: b */
        final int f39286b;

        C13557a(C13558b<T> bVar, int i) {
            this.f39285a = bVar;
            this.f39286b = i;
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            this.f39285a.mo42988a(th);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a((AtomicReference<C14063d>) this, dVar, Long.MAX_VALUE);
        }

        /* renamed from: a */
        public void mo41789a(List<T> list) {
            this.f39285a.mo42989a(list, this.f39286b);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42985a() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }
    }

    /* renamed from: e.a.x0.e.f.p$b */
    /* compiled from: ParallelSortedJoin */
    static final class C13558b<T> extends AtomicInteger implements C14063d {
        private static final long serialVersionUID = 3481980673745556697L;

        /* renamed from: N */
        final List<T>[] f39287N;

        /* renamed from: O */
        final int[] f39288O;

        /* renamed from: P */
        final Comparator<? super T> f39289P;

        /* renamed from: Q */
        final AtomicLong f39290Q = new AtomicLong();

        /* renamed from: R */
        volatile boolean f39291R;

        /* renamed from: S */
        final AtomicInteger f39292S = new AtomicInteger();

        /* renamed from: T */
        final AtomicReference<Throwable> f39293T = new AtomicReference<>();

        /* renamed from: a */
        final C14062c<? super T> f39294a;

        /* renamed from: b */
        final C13557a<T>[] f39295b;

        C13558b(C14062c<? super T> cVar, int i, Comparator<? super T> comparator) {
            this.f39294a = cVar;
            this.f39289P = comparator;
            C13557a<T>[] aVarArr = new C13557a[i];
            for (int i2 = 0; i2 < i; i2++) {
                aVarArr[i2] = new C13557a<>(this, i2);
            }
            this.f39295b = aVarArr;
            this.f39287N = new List[i];
            this.f39288O = new int[i];
            this.f39292S.lazySet(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42987a() {
            for (C13557a<T> a : this.f39295b) {
                a.mo42985a();
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f39290Q, j);
                if (this.f39292S.get() == 0) {
                    mo42990d();
                }
            }
        }

        public void cancel() {
            if (!this.f39291R) {
                this.f39291R = true;
                mo42987a();
                if (getAndIncrement() == 0) {
                    Arrays.fill(this.f39287N, null);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42990d() {
            boolean z;
            Object obj;
            if (getAndIncrement() == 0) {
                C14062c<? super T> cVar = this.f39294a;
                List<T>[] listArr = this.f39287N;
                int[] iArr = this.f39288O;
                int length = iArr.length;
                int i = 1;
                while (true) {
                    long j = this.f39290Q.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.f39291R) {
                            Arrays.fill(listArr, null);
                            return;
                        }
                        Throwable th = (Throwable) this.f39293T.get();
                        if (th != null) {
                            mo42987a();
                            Arrays.fill(listArr, null);
                            cVar.onError(th);
                            return;
                        }
                        Object obj2 = null;
                        int i2 = -1;
                        for (int i3 = 0; i3 < length; i3++) {
                            List<T> list = listArr[i3];
                            int i4 = iArr[i3];
                            if (list.size() != i4) {
                                if (obj2 == null) {
                                    obj = list.get(i4);
                                } else {
                                    obj = list.get(i4);
                                    try {
                                        if (!(this.f39289P.compare(obj2, obj) > 0)) {
                                        }
                                    } catch (Throwable th2) {
                                        C14398a.m62357b(th2);
                                        mo42987a();
                                        Arrays.fill(listArr, null);
                                        if (!this.f39293T.compareAndSet(null, th2)) {
                                            C12205a.m54894b(th2);
                                        }
                                        cVar.onError((Throwable) this.f39293T.get());
                                        return;
                                    }
                                }
                                obj2 = obj;
                                i2 = i3;
                            }
                        }
                        if (obj2 == null) {
                            Arrays.fill(listArr, null);
                            cVar.onComplete();
                            return;
                        }
                        cVar.mo41789a(obj2);
                        iArr[i2] = iArr[i2] + 1;
                        j2++;
                    }
                    if (j2 == j) {
                        if (this.f39291R) {
                            Arrays.fill(listArr, null);
                            return;
                        }
                        Throwable th3 = (Throwable) this.f39293T.get();
                        if (th3 != null) {
                            mo42987a();
                            Arrays.fill(listArr, null);
                            cVar.onError(th3);
                            return;
                        }
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                z = true;
                                break;
                            } else if (iArr[i5] != listArr[i5].size()) {
                                z = false;
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (z) {
                            Arrays.fill(listArr, null);
                            cVar.onComplete();
                            return;
                        }
                    }
                    if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                        this.f39290Q.addAndGet(-j2);
                    }
                    int i6 = get();
                    if (i6 == i) {
                        i6 = addAndGet(-i);
                        if (i6 == 0) {
                            return;
                        }
                    }
                    i = i6;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42989a(List<T> list, int i) {
            this.f39287N[i] = list;
            if (this.f39292S.decrementAndGet() == 0) {
                mo42990d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42988a(Throwable th) {
            if (this.f39293T.compareAndSet(null, th)) {
                mo42990d();
            } else if (th != this.f39293T.get()) {
                C12205a.m54894b(th);
            }
        }
    }

    public C13556p(C5922b<List<T>> bVar, Comparator<? super T> comparator) {
        this.f39284b = bVar;
        this.f39283N = comparator;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C13558b bVar = new C13558b(cVar, this.f39284b.mo23713a(), this.f39283N);
        cVar.mo41788a((C14063d) bVar);
        this.f39284b.mo23740a((C14062c<? super T>[]) bVar.f39295b);
    }
}
