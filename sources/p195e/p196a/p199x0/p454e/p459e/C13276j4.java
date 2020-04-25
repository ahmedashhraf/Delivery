package p195e.p196a.p199x0.p454e.p459e;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p195e.p196a.C12280i0;
import p195e.p196a.C5926g0;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13756l;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.j4 */
/* compiled from: ObservableWithLatestFromMany */
public final class C13276j4<T, R> extends C13131a<T, R> {
    @C5938g

    /* renamed from: N */
    final Iterable<? extends C5926g0<?>> f38354N;
    @C5937f

    /* renamed from: O */
    final C12339o<? super Object[], R> f38355O;
    @C5938g

    /* renamed from: b */
    final C5926g0<?>[] f38356b;

    /* renamed from: e.a.x0.e.e.j4$a */
    /* compiled from: ObservableWithLatestFromMany */
    final class C13277a implements C12339o<T, R> {
        C13277a() {
        }

        public R apply(T t) throws Exception {
            return C12390b.m55563a(C13276j4.this.f38355O.apply(new Object[]{t}), "The combiner returned a null value");
        }
    }

    /* renamed from: e.a.x0.e.e.j4$b */
    /* compiled from: ObservableWithLatestFromMany */
    static final class C13278b<T, R> extends AtomicInteger implements C12280i0<T>, C12314c {
        private static final long serialVersionUID = 1577321883966341961L;

        /* renamed from: N */
        final C13279c[] f38358N;

        /* renamed from: O */
        final AtomicReferenceArray<Object> f38359O;

        /* renamed from: P */
        final AtomicReference<C12314c> f38360P;

        /* renamed from: Q */
        final C13746c f38361Q;

        /* renamed from: R */
        volatile boolean f38362R;

        /* renamed from: a */
        final C12280i0<? super R> f38363a;

        /* renamed from: b */
        final C12339o<? super Object[], R> f38364b;

        C13278b(C12280i0<? super R> i0Var, C12339o<? super Object[], R> oVar, int i) {
            this.f38363a = i0Var;
            this.f38364b = oVar;
            C13279c[] cVarArr = new C13279c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C13279c(this, i2);
            }
            this.f38358N = cVarArr;
            this.f38359O = new AtomicReferenceArray<>(i);
            this.f38360P = new AtomicReference<>();
            this.f38361Q = new C13746c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42782a(C5926g0<?>[] g0VarArr, int i) {
            C13279c[] cVarArr = this.f38358N;
            AtomicReference<C12314c> atomicReference = this.f38360P;
            for (int i2 = 0; i2 < i && !C12347d.m55463a((C12314c) atomicReference.get()) && !this.f38362R; i2++) {
                g0VarArr[i2].mo23893a(cVarArr[i2]);
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return C12347d.m55463a((C12314c) this.f38360P.get());
        }

        public void dispose() {
            C12347d.m55465a(this.f38360P);
            for (C13279c a : this.f38358N) {
                a.mo42783a();
            }
        }

        public void onComplete() {
            if (!this.f38362R) {
                this.f38362R = true;
                mo42778a(-1);
                C13756l.m58727a(this.f38363a, (AtomicInteger) this, this.f38361Q);
            }
        }

        public void onError(Throwable th) {
            if (this.f38362R) {
                C12205a.m54894b(th);
                return;
            }
            this.f38362R = true;
            mo42778a(-1);
            C13756l.m58726a(this.f38363a, th, (AtomicInteger) this, this.f38361Q);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this.f38360P, cVar);
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38362R) {
                AtomicReferenceArray<Object> atomicReferenceArray = this.f38359O;
                int length = atomicReferenceArray.length();
                Object[] objArr = new Object[(length + 1)];
                int i = 0;
                objArr[0] = t;
                while (i < length) {
                    Object obj = atomicReferenceArray.get(i);
                    if (obj != null) {
                        i++;
                        objArr[i] = obj;
                    } else {
                        return;
                    }
                }
                try {
                    C13756l.m58725a(this.f38363a, C12390b.m55563a(this.f38364b.apply(objArr), "combiner returned a null value"), (AtomicInteger) this, this.f38361Q);
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    dispose();
                    onError(th);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42779a(int i, Object obj) {
            this.f38359O.set(i, obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42780a(int i, Throwable th) {
            this.f38362R = true;
            C12347d.m55465a(this.f38360P);
            mo42778a(i);
            C13756l.m58726a(this.f38363a, th, (AtomicInteger) this, this.f38361Q);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42781a(int i, boolean z) {
            if (!z) {
                this.f38362R = true;
                mo42778a(i);
                C13756l.m58727a(this.f38363a, (AtomicInteger) this, this.f38361Q);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42778a(int i) {
            C13279c[] cVarArr = this.f38358N;
            for (int i2 = 0; i2 < cVarArr.length; i2++) {
                if (i2 != i) {
                    cVarArr[i2].mo42783a();
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.e.j4$c */
    /* compiled from: ObservableWithLatestFromMany */
    static final class C13279c extends AtomicReference<C12314c> implements C12280i0<Object> {
        private static final long serialVersionUID = 3256684027868224024L;

        /* renamed from: N */
        boolean f38365N;

        /* renamed from: a */
        final C13278b<?, ?> f38366a;

        /* renamed from: b */
        final int f38367b;

        C13279c(C13278b<?, ?> bVar, int i) {
            this.f38366a = bVar;
            this.f38367b = i;
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        public void onComplete() {
            this.f38366a.mo42781a(this.f38367b, this.f38365N);
        }

        public void onError(Throwable th) {
            this.f38366a.mo42780a(this.f38367b, th);
        }

        /* renamed from: a */
        public void mo33453a(Object obj) {
            if (!this.f38365N) {
                this.f38365N = true;
            }
            this.f38366a.mo42779a(this.f38367b, obj);
        }

        /* renamed from: a */
        public void mo42783a() {
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }
    }

    public C13276j4(@C5937f C5926g0<T> g0Var, @C5937f C5926g0<?>[] g0VarArr, @C5937f C12339o<? super Object[], R> oVar) {
        super(g0Var);
        this.f38356b = g0VarArr;
        this.f38354N = null;
        this.f38355O = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super R> i0Var) {
        int i;
        C5926g0<?>[] g0VarArr = this.f38356b;
        if (g0VarArr == null) {
            g0VarArr = new C5926g0[8];
            try {
                i = 0;
                for (C5926g0<?> g0Var : this.f38354N) {
                    if (i == g0VarArr.length) {
                        g0VarArr = (C5926g0[]) Arrays.copyOf(g0VarArr, (i >> 1) + i);
                    }
                    int i2 = i + 1;
                    g0VarArr[i] = g0Var;
                    i = i2;
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12348e.m55476a(th, i0Var);
                return;
            }
        } else {
            i = g0VarArr.length;
        }
        if (i == 0) {
            new C13459w1(this.f37851a, new C13277a()).mo23995e(i0Var);
            return;
        }
        C13278b bVar = new C13278b(i0Var, this.f38355O, i);
        i0Var.mo34123a((C12314c) bVar);
        bVar.mo42782a(g0VarArr, i);
        this.f37851a.mo23893a(bVar);
    }

    public C13276j4(@C5937f C5926g0<T> g0Var, @C5937f Iterable<? extends C5926g0<?>> iterable, @C5937f C12339o<? super Object[], R> oVar) {
        super(g0Var);
        this.f38356b = null;
        this.f38354N = iterable;
        this.f38355O = oVar;
    }
}
