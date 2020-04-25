package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.C5928k0;
import p195e.p196a.p199x0.p450a.C12344a;
import p195e.p196a.p199x0.p452c.C12395d;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12328d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.b3 */
/* compiled from: ObservableSequenceEqualSingle */
public final class C13154b3<T> extends C5928k0<Boolean> implements C12395d<Boolean> {

    /* renamed from: N */
    final C12328d<? super T, ? super T> f37931N;

    /* renamed from: O */
    final int f37932O;

    /* renamed from: a */
    final C5926g0<? extends T> f37933a;

    /* renamed from: b */
    final C5926g0<? extends T> f37934b;

    /* renamed from: e.a.x0.e.e.b3$a */
    /* compiled from: ObservableSequenceEqualSingle */
    static final class C13155a<T> extends AtomicInteger implements C12314c {
        private static final long serialVersionUID = -6178010334400373240L;

        /* renamed from: N */
        final C12344a f37935N = new C12344a(2);

        /* renamed from: O */
        final C5926g0<? extends T> f37936O;

        /* renamed from: P */
        final C5926g0<? extends T> f37937P;

        /* renamed from: Q */
        final C13156b<T>[] f37938Q;

        /* renamed from: R */
        volatile boolean f37939R;

        /* renamed from: S */
        T f37940S;

        /* renamed from: T */
        T f37941T;

        /* renamed from: a */
        final C12292n0<? super Boolean> f37942a;

        /* renamed from: b */
        final C12328d<? super T, ? super T> f37943b;

        C13155a(C12292n0<? super Boolean> n0Var, int i, C5926g0<? extends T> g0Var, C5926g0<? extends T> g0Var2, C12328d<? super T, ? super T> dVar) {
            this.f37942a = n0Var;
            this.f37936O = g0Var;
            this.f37937P = g0Var2;
            this.f37943b = dVar;
            C13156b<T>[] bVarArr = new C13156b[2];
            this.f37938Q = bVarArr;
            bVarArr[0] = new C13156b<>(this, 0, i);
            bVarArr[1] = new C13156b<>(this, 1, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42687a(C12314c cVar, int i) {
            return this.f37935N.mo42103b(i, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37939R;
        }

        public void dispose() {
            if (!this.f37939R) {
                this.f37939R = true;
                this.f37935N.dispose();
                if (getAndIncrement() == 0) {
                    C13156b<T>[] bVarArr = this.f37938Q;
                    bVarArr[0].f37948b.clear();
                    bVarArr[1].f37948b.clear();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42688e() {
            C13156b<T>[] bVarArr = this.f37938Q;
            this.f37936O.mo23893a(bVarArr[0]);
            this.f37937P.mo23893a(bVarArr[1]);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42686a(C13663c<T> cVar, C13663c<T> cVar2) {
            this.f37939R = true;
            cVar.clear();
            cVar2.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42685a() {
            if (getAndIncrement() == 0) {
                C13156b<T>[] bVarArr = this.f37938Q;
                C13156b<T> bVar = bVarArr[0];
                C13663c<T> cVar = bVar.f37948b;
                C13156b<T> bVar2 = bVarArr[1];
                C13663c<T> cVar2 = bVar2.f37948b;
                int i = 1;
                while (!this.f37939R) {
                    boolean z = bVar.f37945O;
                    if (z) {
                        Throwable th = bVar.f37946P;
                        if (th != null) {
                            mo42686a(cVar, cVar2);
                            this.f37942a.onError(th);
                            return;
                        }
                    }
                    boolean z2 = bVar2.f37945O;
                    if (z2) {
                        Throwable th2 = bVar2.f37946P;
                        if (th2 != null) {
                            mo42686a(cVar, cVar2);
                            this.f37942a.onError(th2);
                            return;
                        }
                    }
                    if (this.f37940S == null) {
                        this.f37940S = cVar.poll();
                    }
                    boolean z3 = this.f37940S == null;
                    if (this.f37941T == null) {
                        this.f37941T = cVar2.poll();
                    }
                    boolean z4 = this.f37941T == null;
                    if (z && z2 && z3 && z4) {
                        this.f37942a.onSuccess(Boolean.valueOf(true));
                        return;
                    } else if (!z || !z2 || z3 == z4) {
                        if (!z3 && !z4) {
                            try {
                                if (!this.f37943b.mo42089a(this.f37940S, this.f37941T)) {
                                    mo42686a(cVar, cVar2);
                                    this.f37942a.onSuccess(Boolean.valueOf(false));
                                    return;
                                }
                                this.f37940S = null;
                                this.f37941T = null;
                            } catch (Throwable th3) {
                                C14398a.m62357b(th3);
                                mo42686a(cVar, cVar2);
                                this.f37942a.onError(th3);
                                return;
                            }
                        }
                        if (z3 || z4) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        }
                    } else {
                        mo42686a(cVar, cVar2);
                        this.f37942a.onSuccess(Boolean.valueOf(false));
                        return;
                    }
                }
                cVar.clear();
                cVar2.clear();
            }
        }
    }

    /* renamed from: e.a.x0.e.e.b3$b */
    /* compiled from: ObservableSequenceEqualSingle */
    static final class C13156b<T> implements C12280i0<T> {

        /* renamed from: N */
        final int f37944N;

        /* renamed from: O */
        volatile boolean f37945O;

        /* renamed from: P */
        Throwable f37946P;

        /* renamed from: a */
        final C13155a<T> f37947a;

        /* renamed from: b */
        final C13663c<T> f37948b;

        C13156b(C13155a<T> aVar, int i, int i2) {
            this.f37947a = aVar;
            this.f37944N = i;
            this.f37948b = new C13663c<>(i2);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f37947a.mo42687a(cVar, this.f37944N);
        }

        public void onComplete() {
            this.f37945O = true;
            this.f37947a.mo42685a();
        }

        public void onError(Throwable th) {
            this.f37946P = th;
            this.f37945O = true;
            this.f37947a.mo42685a();
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f37948b.offer(t);
            this.f37947a.mo42685a();
        }
    }

    public C13154b3(C5926g0<? extends T> g0Var, C5926g0<? extends T> g0Var2, C12328d<? super T, ? super T> dVar, int i) {
        this.f37933a = g0Var;
        this.f37934b = g0Var2;
        this.f37931N = dVar;
        this.f37932O = i;
    }

    /* renamed from: a */
    public C5923b0<Boolean> mo42141a() {
        return C12205a.m54862a((C5923b0<T>) new C13140a3<T>(this.f37933a, this.f37934b, this.f37931N, this.f37932O));
    }

    /* renamed from: b */
    public void mo24206b(C12292n0<? super Boolean> n0Var) {
        C13155a aVar = new C13155a(n0Var, this.f37932O, this.f37933a, this.f37934b, this.f37931N);
        n0Var.mo41974a(aVar);
        aVar.mo42688e();
    }
}
