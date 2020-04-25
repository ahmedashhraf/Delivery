package p195e.p196a.p199x0.p454e.p456b;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13756l;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12392a;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.x4 */
/* compiled from: FlowableWithLatestFromMany */
public final class C12913x4<T, R> extends C12511a<T, R> {
    @C5938g

    /* renamed from: N */
    final C6007b<?>[] f37198N;
    @C5938g

    /* renamed from: O */
    final Iterable<? extends C6007b<?>> f37199O;

    /* renamed from: P */
    final C12339o<? super Object[], R> f37200P;

    /* renamed from: e.a.x0.e.b.x4$a */
    /* compiled from: FlowableWithLatestFromMany */
    final class C12914a implements C12339o<T, R> {
        C12914a() {
        }

        public R apply(T t) throws Exception {
            return C12390b.m55563a(C12913x4.this.f37200P.apply(new Object[]{t}), "The combiner returned a null value");
        }
    }

    /* renamed from: e.a.x0.e.b.x4$b */
    /* compiled from: FlowableWithLatestFromMany */
    static final class C12915b<T, R> extends AtomicInteger implements C12392a<T>, C14063d {
        private static final long serialVersionUID = 1577321883966341961L;

        /* renamed from: N */
        final C12916c[] f37202N;

        /* renamed from: O */
        final AtomicReferenceArray<Object> f37203O;

        /* renamed from: P */
        final AtomicReference<C14063d> f37204P;

        /* renamed from: Q */
        final AtomicLong f37205Q;

        /* renamed from: R */
        final C13746c f37206R;

        /* renamed from: S */
        volatile boolean f37207S;

        /* renamed from: a */
        final C14062c<? super R> f37208a;

        /* renamed from: b */
        final C12339o<? super Object[], R> f37209b;

        C12915b(C14062c<? super R> cVar, C12339o<? super Object[], R> oVar, int i) {
            this.f37208a = cVar;
            this.f37209b = oVar;
            C12916c[] cVarArr = new C12916c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C12916c(this, i2);
            }
            this.f37202N = cVarArr;
            this.f37203O = new AtomicReferenceArray<>(i);
            this.f37204P = new AtomicReference<>();
            this.f37205Q = new AtomicLong();
            this.f37206R = new C13746c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42531a(C6007b<?>[] bVarArr, int i) {
            C12916c[] cVarArr = this.f37202N;
            AtomicReference<C14063d> atomicReference = this.f37204P;
            for (int i2 = 0; i2 < i && !C13742j.m58672a((C14063d) atomicReference.get()); i2++) {
                bVarArr[i2].mo24397a(cVarArr[i2]);
            }
        }

        /* renamed from: b */
        public boolean mo42138b(T t) {
            if (this.f37207S) {
                return false;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f37203O;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[(length + 1)];
            objArr[0] = t;
            int i = 0;
            while (i < length) {
                Object obj = atomicReferenceArray.get(i);
                if (obj == null) {
                    return false;
                }
                i++;
                objArr[i] = obj;
            }
            try {
                C13756l.m58728a(this.f37208a, C12390b.m55563a(this.f37209b.apply(objArr), "The combiner returned a null value"), (AtomicInteger) this, this.f37206R);
                return true;
            } catch (Throwable th) {
                C14398a.m62357b(th);
                cancel();
                onError(th);
                return false;
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            C13742j.m58671a(this.f37204P, this.f37205Q, j);
        }

        public void cancel() {
            C13742j.m58674a(this.f37204P);
            for (C12916c a : this.f37202N) {
                a.mo42532a();
            }
        }

        public void onComplete() {
            if (!this.f37207S) {
                this.f37207S = true;
                mo42527a(-1);
                C13756l.m58730a(this.f37208a, (AtomicInteger) this, this.f37206R);
            }
        }

        public void onError(Throwable th) {
            if (this.f37207S) {
                C12205a.m54894b(th);
                return;
            }
            this.f37207S = true;
            mo42527a(-1);
            C13756l.m58729a(this.f37208a, th, (AtomicInteger) this, this.f37206R);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58677a(this.f37204P, this.f37205Q, dVar);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!mo42138b(t) && !this.f37207S) {
                ((C14063d) this.f37204P.get()).mo41813c(1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42528a(int i, Object obj) {
            this.f37203O.set(i, obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42529a(int i, Throwable th) {
            this.f37207S = true;
            C13742j.m58674a(this.f37204P);
            mo42527a(i);
            C13756l.m58729a(this.f37208a, th, (AtomicInteger) this, this.f37206R);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42530a(int i, boolean z) {
            if (!z) {
                this.f37207S = true;
                C13742j.m58674a(this.f37204P);
                mo42527a(i);
                C13756l.m58730a(this.f37208a, (AtomicInteger) this, this.f37206R);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42527a(int i) {
            C12916c[] cVarArr = this.f37202N;
            for (int i2 = 0; i2 < cVarArr.length; i2++) {
                if (i2 != i) {
                    cVarArr[i2].mo42532a();
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.b.x4$c */
    /* compiled from: FlowableWithLatestFromMany */
    static final class C12916c extends AtomicReference<C14063d> implements C12297q<Object> {
        private static final long serialVersionUID = 3256684027868224024L;

        /* renamed from: N */
        boolean f37210N;

        /* renamed from: a */
        final C12915b<?, ?> f37211a;

        /* renamed from: b */
        final int f37212b;

        C12916c(C12915b<?, ?> bVar, int i) {
            this.f37211a = bVar;
            this.f37212b = i;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            C13742j.m58676a((AtomicReference<C14063d>) this, dVar, Long.MAX_VALUE);
        }

        public void onComplete() {
            this.f37211a.mo42530a(this.f37212b, this.f37210N);
        }

        public void onError(Throwable th) {
            this.f37211a.mo42529a(this.f37212b, th);
        }

        /* renamed from: a */
        public void mo41789a(Object obj) {
            if (!this.f37210N) {
                this.f37210N = true;
            }
            this.f37211a.mo42528a(this.f37212b, obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42532a() {
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }
    }

    public C12913x4(@C5937f C5929l<T> lVar, @C5937f C6007b<?>[] bVarArr, C12339o<? super Object[], R> oVar) {
        super(lVar);
        this.f37198N = bVarArr;
        this.f37199O = null;
        this.f37200P = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        int i;
        C6007b<?>[] bVarArr = this.f37198N;
        if (bVarArr == null) {
            bVarArr = new C6007b[8];
            try {
                i = 0;
                for (C6007b<?> bVar : this.f37199O) {
                    if (i == bVarArr.length) {
                        bVarArr = (C6007b[]) Arrays.copyOf(bVarArr, (i >> 1) + i);
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
            new C12530b2(this.f35814b, new C12914a()).mo24499e(cVar);
            return;
        }
        C12915b bVar2 = new C12915b(cVar, this.f37200P, i);
        cVar.mo41788a((C14063d) bVar2);
        bVar2.mo42531a(bVarArr, i);
        this.f35814b.mo24393a((C12297q<? super T>) bVar2);
    }

    public C12913x4(@C5937f C5929l<T> lVar, @C5937f Iterable<? extends C6007b<?>> iterable, @C5937f C12339o<? super Object[], R> oVar) {
        super(lVar);
        this.f37198N = null;
        this.f37199O = iterable;
        this.f37200P = oVar;
    }
}
