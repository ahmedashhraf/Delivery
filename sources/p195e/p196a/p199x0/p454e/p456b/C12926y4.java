package p195e.p196a.p199x0.p454e.p456b;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.y4 */
/* compiled from: FlowableZip */
public final class C12926y4<T, R> extends C5929l<R> {

    /* renamed from: N */
    final Iterable<? extends C6007b<? extends T>> f37235N;

    /* renamed from: O */
    final C12339o<? super Object[], ? extends R> f37236O;

    /* renamed from: P */
    final int f37237P;

    /* renamed from: Q */
    final boolean f37238Q;

    /* renamed from: b */
    final C6007b<? extends T>[] f37239b;

    /* renamed from: e.a.x0.e.b.y4$a */
    /* compiled from: FlowableZip */
    static final class C12927a<T, R> extends AtomicInteger implements C14063d {
        private static final long serialVersionUID = -2434867452883857743L;

        /* renamed from: N */
        final C12339o<? super Object[], ? extends R> f37240N;

        /* renamed from: O */
        final AtomicLong f37241O;

        /* renamed from: P */
        final C13746c f37242P;

        /* renamed from: Q */
        final boolean f37243Q;

        /* renamed from: R */
        volatile boolean f37244R;

        /* renamed from: S */
        final Object[] f37245S;

        /* renamed from: a */
        final C14062c<? super R> f37246a;

        /* renamed from: b */
        final C12928b<T, R>[] f37247b;

        C12927a(C14062c<? super R> cVar, C12339o<? super Object[], ? extends R> oVar, int i, int i2, boolean z) {
            this.f37246a = cVar;
            this.f37240N = oVar;
            this.f37243Q = z;
            C12928b<T, R>[] bVarArr = new C12928b[i];
            for (int i3 = 0; i3 < i; i3++) {
                bVarArr[i3] = new C12928b<>(this, i2);
            }
            this.f37245S = new Object[i];
            this.f37247b = bVarArr;
            this.f37241O = new AtomicLong();
            this.f37242P = new C13746c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42535a(C6007b<? extends T>[] bVarArr, int i) {
            C12928b<T, R>[] bVarArr2 = this.f37247b;
            int i2 = 0;
            while (i2 < i && !this.f37244R) {
                if (this.f37243Q || this.f37242P.get() == null) {
                    bVarArr[i2].mo24397a(bVarArr2[i2]);
                    i2++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f37241O, j);
                mo42536d();
            }
        }

        public void cancel() {
            if (!this.f37244R) {
                this.f37244R = true;
                mo42533a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42536d() {
            if (getAndIncrement() == 0) {
                C14062c<? super R> cVar = this.f37246a;
                C12928b<T, R>[] bVarArr = this.f37247b;
                int length = bVarArr.length;
                Object[] objArr = this.f37245S;
                int i = 1;
                do {
                    long j = this.f37241O.get();
                    long j2 = 0;
                    while (j != j2) {
                        if (!this.f37244R) {
                            if (this.f37243Q || this.f37242P.get() == null) {
                                boolean z = false;
                                for (int i2 = 0; i2 < length; i2++) {
                                    C12928b<T, R> bVar = bVarArr[i2];
                                    if (objArr[i2] == null) {
                                        try {
                                            boolean z2 = bVar.f37251Q;
                                            C12406o<T> oVar = bVar.f37249O;
                                            Object poll = oVar != null ? oVar.poll() : null;
                                            boolean z3 = poll == null;
                                            if (!z2 || !z3) {
                                                if (!z3) {
                                                    objArr[i2] = poll;
                                                }
                                                z = true;
                                            } else {
                                                mo42533a();
                                                if (((Throwable) this.f37242P.get()) != null) {
                                                    cVar.onError(this.f37242P.mo43143d());
                                                } else {
                                                    cVar.onComplete();
                                                }
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            C14398a.m62357b(th);
                                            this.f37242P.mo43142a(th);
                                            if (!this.f37243Q) {
                                                mo42533a();
                                                cVar.onError(this.f37242P.mo43143d());
                                                return;
                                            }
                                        }
                                    }
                                }
                                if (z) {
                                    break;
                                }
                                try {
                                    cVar.mo41789a(C12390b.m55563a(this.f37240N.apply(objArr.clone()), "The zipper returned a null value"));
                                    j2++;
                                    Arrays.fill(objArr, null);
                                } catch (Throwable th2) {
                                    C14398a.m62357b(th2);
                                    mo42533a();
                                    this.f37242P.mo43142a(th2);
                                    cVar.onError(this.f37242P.mo43143d());
                                    return;
                                }
                            } else {
                                mo42533a();
                                cVar.onError(this.f37242P.mo43143d());
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (j == j2) {
                        if (!this.f37244R) {
                            if (this.f37243Q || this.f37242P.get() == null) {
                                for (int i3 = 0; i3 < length; i3++) {
                                    C12928b<T, R> bVar2 = bVarArr[i3];
                                    if (objArr[i3] == null) {
                                        try {
                                            boolean z4 = bVar2.f37251Q;
                                            C12406o<T> oVar2 = bVar2.f37249O;
                                            Object poll2 = oVar2 != null ? oVar2.poll() : null;
                                            boolean z5 = poll2 == null;
                                            if (z4 && z5) {
                                                mo42533a();
                                                if (((Throwable) this.f37242P.get()) != null) {
                                                    cVar.onError(this.f37242P.mo43143d());
                                                } else {
                                                    cVar.onComplete();
                                                }
                                                return;
                                            } else if (!z5) {
                                                objArr[i3] = poll2;
                                            }
                                        } catch (Throwable th3) {
                                            C14398a.m62357b(th3);
                                            this.f37242P.mo43142a(th3);
                                            if (!this.f37243Q) {
                                                mo42533a();
                                                cVar.onError(this.f37242P.mo43143d());
                                                return;
                                            }
                                        }
                                    }
                                }
                            } else {
                                mo42533a();
                                cVar.onError(this.f37242P.mo43143d());
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (j2 != 0) {
                        for (C12928b<T, R> c : bVarArr) {
                            c.mo41813c(j2);
                        }
                        if (j != Long.MAX_VALUE) {
                            this.f37241O.addAndGet(-j2);
                        }
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42534a(C12928b<T, R> bVar, Throwable th) {
            if (this.f37242P.mo43142a(th)) {
                bVar.f37251Q = true;
                mo42536d();
                return;
            }
            C12205a.m54894b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42533a() {
            for (C12928b<T, R> cancel : this.f37247b) {
                cancel.cancel();
            }
        }
    }

    /* renamed from: e.a.x0.e.b.y4$b */
    /* compiled from: FlowableZip */
    static final class C12928b<T, R> extends AtomicReference<C14063d> implements C12297q<T>, C14063d {
        private static final long serialVersionUID = -4627193790118206028L;

        /* renamed from: N */
        final int f37248N;

        /* renamed from: O */
        C12406o<T> f37249O;

        /* renamed from: P */
        long f37250P;

        /* renamed from: Q */
        volatile boolean f37251Q;

        /* renamed from: R */
        int f37252R;

        /* renamed from: a */
        final C12927a<T, R> f37253a;

        /* renamed from: b */
        final int f37254b;

        C12928b(C12927a<T, R> aVar, int i) {
            this.f37253a = aVar;
            this.f37254b = i;
            this.f37248N = i - (i >> 2);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58680c(this, dVar)) {
                if (dVar instanceof C12403l) {
                    C12403l lVar = (C12403l) dVar;
                    int a = lVar.mo41855a(7);
                    if (a == 1) {
                        this.f37252R = a;
                        this.f37249O = lVar;
                        this.f37251Q = true;
                        this.f37253a.mo42536d();
                        return;
                    } else if (a == 2) {
                        this.f37252R = a;
                        this.f37249O = lVar;
                        dVar.mo41813c((long) this.f37254b);
                        return;
                    }
                }
                this.f37249O = new C13662b(this.f37254b);
                dVar.mo41813c((long) this.f37254b);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (this.f37252R != 1) {
                long j2 = this.f37250P + j;
                if (j2 >= ((long) this.f37248N)) {
                    this.f37250P = 0;
                    ((C14063d) get()).mo41813c(j2);
                    return;
                }
                this.f37250P = j2;
            }
        }

        public void cancel() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }

        public void onComplete() {
            this.f37251Q = true;
            this.f37253a.mo42536d();
        }

        public void onError(Throwable th) {
            this.f37253a.mo42534a(this, th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (this.f37252R != 2) {
                this.f37249O.offer(t);
            }
            this.f37253a.mo42536d();
        }
    }

    public C12926y4(C6007b<? extends T>[] bVarArr, Iterable<? extends C6007b<? extends T>> iterable, C12339o<? super Object[], ? extends R> oVar, int i, boolean z) {
        this.f37239b = bVarArr;
        this.f37235N = iterable;
        this.f37236O = oVar;
        this.f37237P = i;
        this.f37238Q = z;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        int i;
        C6007b<? extends T>[] bVarArr = this.f37239b;
        if (bVarArr == null) {
            bVarArr = new C6007b[8];
            i = 0;
            for (C6007b<? extends T> bVar : this.f37235N) {
                if (i == bVarArr.length) {
                    C6007b<? extends T>[] bVarArr2 = new C6007b[((i >> 2) + i)];
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, i);
                    bVarArr = bVarArr2;
                }
                int i2 = i + 1;
                bVarArr[i] = bVar;
                i = i2;
            }
        } else {
            i = bVarArr.length;
        }
        if (i == 0) {
            C13739g.m58654a(cVar);
            return;
        }
        C12927a aVar = new C12927a(cVar, this.f37236O, i, this.f37237P, this.f37238Q);
        cVar.mo41788a((C14063d) aVar);
        aVar.mo42535a(bVarArr, i);
    }
}
