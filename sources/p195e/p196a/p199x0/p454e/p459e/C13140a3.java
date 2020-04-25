package p195e.p196a.p199x0.p454e.p459e;

import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p450a.C12344a;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12328d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.a3 */
/* compiled from: ObservableSequenceEqual */
public final class C13140a3<T> extends C5923b0<Boolean> {

    /* renamed from: N */
    final C12328d<? super T, ? super T> f37880N;

    /* renamed from: O */
    final int f37881O;

    /* renamed from: a */
    final C5926g0<? extends T> f37882a;

    /* renamed from: b */
    final C5926g0<? extends T> f37883b;

    /* renamed from: e.a.x0.e.e.a3$a */
    /* compiled from: ObservableSequenceEqual */
    static final class C13141a<T> extends AtomicInteger implements C12314c {
        private static final long serialVersionUID = -6178010334400373240L;

        /* renamed from: N */
        final C12344a f37884N = new C12344a(2);

        /* renamed from: O */
        final C5926g0<? extends T> f37885O;

        /* renamed from: P */
        final C5926g0<? extends T> f37886P;

        /* renamed from: Q */
        final C13142b<T>[] f37887Q;

        /* renamed from: R */
        volatile boolean f37888R;

        /* renamed from: S */
        T f37889S;

        /* renamed from: T */
        T f37890T;

        /* renamed from: a */
        final C12280i0<? super Boolean> f37891a;

        /* renamed from: b */
        final C12328d<? super T, ? super T> f37892b;

        C13141a(C12280i0<? super Boolean> i0Var, int i, C5926g0<? extends T> g0Var, C5926g0<? extends T> g0Var2, C12328d<? super T, ? super T> dVar) {
            this.f37891a = i0Var;
            this.f37885O = g0Var;
            this.f37886P = g0Var2;
            this.f37892b = dVar;
            C13142b<T>[] bVarArr = new C13142b[2];
            this.f37887Q = bVarArr;
            bVarArr[0] = new C13142b<>(this, 0, i);
            bVarArr[1] = new C13142b<>(this, 1, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42673a(C12314c cVar, int i) {
            return this.f37884N.mo42103b(i, cVar);
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f37888R;
        }

        public void dispose() {
            if (!this.f37888R) {
                this.f37888R = true;
                this.f37884N.dispose();
                if (getAndIncrement() == 0) {
                    C13142b<T>[] bVarArr = this.f37887Q;
                    bVarArr[0].f37897b.clear();
                    bVarArr[1].f37897b.clear();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42674e() {
            C13142b<T>[] bVarArr = this.f37887Q;
            this.f37885O.mo23893a(bVarArr[0]);
            this.f37886P.mo23893a(bVarArr[1]);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42672a(C13663c<T> cVar, C13663c<T> cVar2) {
            this.f37888R = true;
            cVar.clear();
            cVar2.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42671a() {
            if (getAndIncrement() == 0) {
                C13142b<T>[] bVarArr = this.f37887Q;
                C13142b<T> bVar = bVarArr[0];
                C13663c<T> cVar = bVar.f37897b;
                C13142b<T> bVar2 = bVarArr[1];
                C13663c<T> cVar2 = bVar2.f37897b;
                int i = 1;
                while (!this.f37888R) {
                    boolean z = bVar.f37894O;
                    if (z) {
                        Throwable th = bVar.f37895P;
                        if (th != null) {
                            mo42672a(cVar, cVar2);
                            this.f37891a.onError(th);
                            return;
                        }
                    }
                    boolean z2 = bVar2.f37894O;
                    if (z2) {
                        Throwable th2 = bVar2.f37895P;
                        if (th2 != null) {
                            mo42672a(cVar, cVar2);
                            this.f37891a.onError(th2);
                            return;
                        }
                    }
                    if (this.f37889S == null) {
                        this.f37889S = cVar.poll();
                    }
                    boolean z3 = this.f37889S == null;
                    if (this.f37890T == null) {
                        this.f37890T = cVar2.poll();
                    }
                    boolean z4 = this.f37890T == null;
                    if (z && z2 && z3 && z4) {
                        this.f37891a.mo33453a(Boolean.valueOf(true));
                        this.f37891a.onComplete();
                        return;
                    } else if (!z || !z2 || z3 == z4) {
                        if (!z3 && !z4) {
                            try {
                                if (!this.f37892b.mo42089a(this.f37889S, this.f37890T)) {
                                    mo42672a(cVar, cVar2);
                                    this.f37891a.mo33453a(Boolean.valueOf(false));
                                    this.f37891a.onComplete();
                                    return;
                                }
                                this.f37889S = null;
                                this.f37890T = null;
                            } catch (Throwable th3) {
                                C14398a.m62357b(th3);
                                mo42672a(cVar, cVar2);
                                this.f37891a.onError(th3);
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
                        mo42672a(cVar, cVar2);
                        this.f37891a.mo33453a(Boolean.valueOf(false));
                        this.f37891a.onComplete();
                        return;
                    }
                }
                cVar.clear();
                cVar2.clear();
            }
        }
    }

    /* renamed from: e.a.x0.e.e.a3$b */
    /* compiled from: ObservableSequenceEqual */
    static final class C13142b<T> implements C12280i0<T> {

        /* renamed from: N */
        final int f37893N;

        /* renamed from: O */
        volatile boolean f37894O;

        /* renamed from: P */
        Throwable f37895P;

        /* renamed from: a */
        final C13141a<T> f37896a;

        /* renamed from: b */
        final C13663c<T> f37897b;

        C13142b(C13141a<T> aVar, int i, int i2) {
            this.f37896a = aVar;
            this.f37893N = i;
            this.f37897b = new C13663c<>(i2);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            this.f37896a.mo42673a(cVar, this.f37893N);
        }

        public void onComplete() {
            this.f37894O = true;
            this.f37896a.mo42671a();
        }

        public void onError(Throwable th) {
            this.f37895P = th;
            this.f37894O = true;
            this.f37896a.mo42671a();
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            this.f37897b.offer(t);
            this.f37896a.mo42671a();
        }
    }

    public C13140a3(C5926g0<? extends T> g0Var, C5926g0<? extends T> g0Var2, C12328d<? super T, ? super T> dVar, int i) {
        this.f37882a = g0Var;
        this.f37883b = g0Var2;
        this.f37880N = dVar;
        this.f37881O = i;
    }

    /* renamed from: e */
    public void mo23995e(C12280i0<? super Boolean> i0Var) {
        C13141a aVar = new C13141a(i0Var, this.f37881O, this.f37882a, this.f37883b, this.f37880N);
        i0Var.mo34123a((C12314c) aVar);
        aVar.mo42674e();
    }
}
