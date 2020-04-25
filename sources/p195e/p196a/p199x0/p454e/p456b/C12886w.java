package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13753j;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p465i.C13741i;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.w */
/* compiled from: FlowableConcatMap */
public final class C12886w<T, R> extends C12511a<T, R> {

    /* renamed from: N */
    final C12339o<? super T, ? extends C6007b<? extends R>> f37112N;

    /* renamed from: O */
    final int f37113O;

    /* renamed from: P */
    final C13753j f37114P;

    /* renamed from: e.a.x0.e.b.w$a */
    /* compiled from: FlowableConcatMap */
    static /* synthetic */ class C12887a {

        /* renamed from: a */
        static final /* synthetic */ int[] f37115a = new int[C13753j.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                e.a.x0.j.j[] r0 = p195e.p196a.p199x0.p200j.C13753j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37115a = r0
                int[] r0 = f37115a     // Catch:{ NoSuchFieldError -> 0x0014 }
                e.a.x0.j.j r1 = p195e.p196a.p199x0.p200j.C13753j.BOUNDARY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f37115a     // Catch:{ NoSuchFieldError -> 0x001f }
                e.a.x0.j.j r1 = p195e.p196a.p199x0.p200j.C13753j.END     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12886w.C12887a.<clinit>():void");
        }
    }

    /* renamed from: e.a.x0.e.b.w$b */
    /* compiled from: FlowableConcatMap */
    static abstract class C12888b<T, R> extends AtomicInteger implements C12297q<T>, C12892f<R>, C14063d {
        private static final long serialVersionUID = -3511336836796789179L;

        /* renamed from: N */
        final int f37116N;

        /* renamed from: O */
        final int f37117O;

        /* renamed from: P */
        C14063d f37118P;

        /* renamed from: Q */
        int f37119Q;

        /* renamed from: R */
        C12406o<T> f37120R;

        /* renamed from: S */
        volatile boolean f37121S;

        /* renamed from: T */
        volatile boolean f37122T;

        /* renamed from: U */
        final C13746c f37123U = new C13746c();

        /* renamed from: V */
        volatile boolean f37124V;

        /* renamed from: W */
        int f37125W;

        /* renamed from: a */
        final C12891e<R> f37126a = new C12891e<>(this);

        /* renamed from: b */
        final C12339o<? super T, ? extends C6007b<? extends R>> f37127b;

        C12888b(C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i) {
            this.f37127b = oVar;
            this.f37116N = i;
            this.f37117O = i - (i >> 2);
        }

        /* renamed from: a */
        public final void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37118P, dVar)) {
                this.f37118P = dVar;
                if (dVar instanceof C12403l) {
                    C12403l lVar = (C12403l) dVar;
                    int a = lVar.mo41855a(3);
                    if (a == 1) {
                        this.f37125W = a;
                        this.f37120R = lVar;
                        this.f37121S = true;
                        mo42513e();
                        mo42512d();
                        return;
                    } else if (a == 2) {
                        this.f37125W = a;
                        this.f37120R = lVar;
                        mo42513e();
                        dVar.mo41813c((long) this.f37116N);
                        return;
                    }
                }
                this.f37120R = new C13662b(this.f37116N);
                mo42513e();
                dVar.mo41813c((long) this.f37116N);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract void mo42512d();

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public abstract void mo42513e();

        public final void onComplete() {
            this.f37121S = true;
            mo42512d();
        }

        /* renamed from: a */
        public final void mo41789a(T t) {
            if (this.f37125W == 2 || this.f37120R.offer(t)) {
                mo42512d();
                return;
            }
            this.f37118P.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }

        /* renamed from: a */
        public final void mo42511a() {
            this.f37124V = false;
            mo42512d();
        }
    }

    /* renamed from: e.a.x0.e.b.w$c */
    /* compiled from: FlowableConcatMap */
    static final class C12889c<T, R> extends C12888b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;

        /* renamed from: X */
        final C14062c<? super R> f37128X;

        /* renamed from: Y */
        final boolean f37129Y;

        C12889c(C14062c<? super R> cVar, C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i, boolean z) {
            super(oVar, i);
            this.f37128X = cVar;
            this.f37129Y = z;
        }

        /* renamed from: a */
        public void mo42514a(Throwable th) {
            if (this.f37123U.mo43142a(th)) {
                if (!this.f37129Y) {
                    this.f37118P.cancel();
                    this.f37121S = true;
                }
                this.f37124V = false;
                mo42512d();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: c */
        public void mo42515c(R r) {
            this.f37128X.mo41789a(r);
        }

        public void cancel() {
            if (!this.f37122T) {
                this.f37122T = true;
                this.f37126a.cancel();
                this.f37118P.cancel();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42512d() {
            if (getAndIncrement() == 0) {
                while (!this.f37122T) {
                    if (!this.f37124V) {
                        boolean z = this.f37121S;
                        if (!z || this.f37129Y || ((Throwable) this.f37123U.get()) == null) {
                            try {
                                Object poll = this.f37120R.poll();
                                boolean z2 = poll == null;
                                if (z && z2) {
                                    Throwable d = this.f37123U.mo43143d();
                                    if (d != null) {
                                        this.f37128X.onError(d);
                                    } else {
                                        this.f37128X.onComplete();
                                    }
                                    return;
                                } else if (!z2) {
                                    try {
                                        C6007b bVar = (C6007b) C12390b.m55563a(this.f37127b.apply(poll), "The mapper returned a null Publisher");
                                        if (this.f37125W != 1) {
                                            int i = this.f37119Q + 1;
                                            if (i == this.f37117O) {
                                                this.f37119Q = 0;
                                                this.f37118P.mo41813c((long) i);
                                            } else {
                                                this.f37119Q = i;
                                            }
                                        }
                                        if (bVar instanceof Callable) {
                                            try {
                                                Object call = ((Callable) bVar).call();
                                                if (call == null) {
                                                    continue;
                                                } else if (this.f37126a.mo43133f()) {
                                                    this.f37128X.mo41789a(call);
                                                } else {
                                                    this.f37124V = true;
                                                    C12891e<R> eVar = this.f37126a;
                                                    eVar.mo43130b((C14063d) new C12893g(call, eVar));
                                                }
                                            } catch (Throwable th) {
                                                C14398a.m62357b(th);
                                                this.f37118P.cancel();
                                                this.f37123U.mo43142a(th);
                                                this.f37128X.onError(this.f37123U.mo43143d());
                                                return;
                                            }
                                        } else {
                                            this.f37124V = true;
                                            bVar.mo24397a(this.f37126a);
                                        }
                                    } catch (Throwable th2) {
                                        C14398a.m62357b(th2);
                                        this.f37118P.cancel();
                                        this.f37123U.mo43142a(th2);
                                        this.f37128X.onError(this.f37123U.mo43143d());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                C14398a.m62357b(th3);
                                this.f37118P.cancel();
                                this.f37123U.mo43142a(th3);
                                this.f37128X.onError(this.f37123U.mo43143d());
                                return;
                            }
                        } else {
                            this.f37128X.onError(this.f37123U.mo43143d());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42513e() {
            this.f37128X.mo41788a((C14063d) this);
        }

        public void onError(Throwable th) {
            if (this.f37123U.mo43142a(th)) {
                this.f37121S = true;
                mo42512d();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f37126a.mo41813c(j);
        }
    }

    /* renamed from: e.a.x0.e.b.w$d */
    /* compiled from: FlowableConcatMap */
    static final class C12890d<T, R> extends C12888b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;

        /* renamed from: X */
        final C14062c<? super R> f37130X;

        /* renamed from: Y */
        final AtomicInteger f37131Y = new AtomicInteger();

        C12890d(C14062c<? super R> cVar, C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i) {
            super(oVar, i);
            this.f37130X = cVar;
        }

        /* renamed from: a */
        public void mo42514a(Throwable th) {
            if (this.f37123U.mo43142a(th)) {
                this.f37118P.cancel();
                if (getAndIncrement() == 0) {
                    this.f37130X.onError(this.f37123U.mo43143d());
                    return;
                }
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: c */
        public void mo42515c(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f37130X.mo41789a(r);
                if (!compareAndSet(1, 0)) {
                    this.f37130X.onError(this.f37123U.mo43143d());
                }
            }
        }

        public void cancel() {
            if (!this.f37122T) {
                this.f37122T = true;
                this.f37126a.cancel();
                this.f37118P.cancel();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42512d() {
            if (this.f37131Y.getAndIncrement() == 0) {
                while (!this.f37122T) {
                    if (!this.f37124V) {
                        boolean z = this.f37121S;
                        try {
                            Object poll = this.f37120R.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.f37130X.onComplete();
                                return;
                            } else if (!z2) {
                                try {
                                    C6007b bVar = (C6007b) C12390b.m55563a(this.f37127b.apply(poll), "The mapper returned a null Publisher");
                                    if (this.f37125W != 1) {
                                        int i = this.f37119Q + 1;
                                        if (i == this.f37117O) {
                                            this.f37119Q = 0;
                                            this.f37118P.mo41813c((long) i);
                                        } else {
                                            this.f37119Q = i;
                                        }
                                    }
                                    if (bVar instanceof Callable) {
                                        try {
                                            Object call = ((Callable) bVar).call();
                                            if (call == null) {
                                                continue;
                                            } else if (!this.f37126a.mo43133f()) {
                                                this.f37124V = true;
                                                C12891e<R> eVar = this.f37126a;
                                                eVar.mo43130b((C14063d) new C12893g(call, eVar));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.f37130X.mo41789a(call);
                                                if (!compareAndSet(1, 0)) {
                                                    this.f37130X.onError(this.f37123U.mo43143d());
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            C14398a.m62357b(th);
                                            this.f37118P.cancel();
                                            this.f37123U.mo43142a(th);
                                            this.f37130X.onError(this.f37123U.mo43143d());
                                            return;
                                        }
                                    } else {
                                        this.f37124V = true;
                                        bVar.mo24397a(this.f37126a);
                                    }
                                } catch (Throwable th2) {
                                    C14398a.m62357b(th2);
                                    this.f37118P.cancel();
                                    this.f37123U.mo43142a(th2);
                                    this.f37130X.onError(this.f37123U.mo43143d());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            C14398a.m62357b(th3);
                            this.f37118P.cancel();
                            this.f37123U.mo43142a(th3);
                            this.f37130X.onError(this.f37123U.mo43143d());
                            return;
                        }
                    }
                    if (this.f37131Y.decrementAndGet() == 0) {
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42513e() {
            this.f37130X.mo41788a((C14063d) this);
        }

        public void onError(Throwable th) {
            if (this.f37123U.mo43142a(th)) {
                this.f37126a.cancel();
                if (getAndIncrement() == 0) {
                    this.f37130X.onError(this.f37123U.mo43143d());
                    return;
                }
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f37126a.mo41813c(j);
        }
    }

    /* renamed from: e.a.x0.e.b.w$e */
    /* compiled from: FlowableConcatMap */
    static final class C12891e<R> extends C13741i implements C12297q<R> {
        private static final long serialVersionUID = 897683679971470653L;

        /* renamed from: S */
        final C12892f<R> f37132S;

        /* renamed from: T */
        long f37133T;

        C12891e(C12892f<R> fVar) {
            this.f37132S = fVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            mo43130b(dVar);
        }

        public void onComplete() {
            long j = this.f37133T;
            if (j != 0) {
                this.f37133T = 0;
                mo43129b(j);
            }
            this.f37132S.mo42511a();
        }

        public void onError(Throwable th) {
            long j = this.f37133T;
            if (j != 0) {
                this.f37133T = 0;
                mo43129b(j);
            }
            this.f37132S.mo42514a(th);
        }

        /* renamed from: a */
        public void mo41789a(R r) {
            this.f37133T++;
            this.f37132S.mo42515c(r);
        }
    }

    /* renamed from: e.a.x0.e.b.w$f */
    /* compiled from: FlowableConcatMap */
    interface C12892f<T> {
        /* renamed from: a */
        void mo42511a();

        /* renamed from: a */
        void mo42514a(Throwable th);

        /* renamed from: c */
        void mo42515c(T t);
    }

    /* renamed from: e.a.x0.e.b.w$g */
    /* compiled from: FlowableConcatMap */
    static final class C12893g<T> implements C14063d {

        /* renamed from: N */
        boolean f37134N;

        /* renamed from: a */
        final C14062c<? super T> f37135a;

        /* renamed from: b */
        final T f37136b;

        C12893g(T t, C14062c<? super T> cVar) {
            this.f37136b = t;
            this.f37135a = cVar;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (j > 0 && !this.f37134N) {
                this.f37134N = true;
                C14062c<? super T> cVar = this.f37135a;
                cVar.mo41789a(this.f37136b);
                cVar.onComplete();
            }
        }

        public void cancel() {
        }
    }

    public C12886w(C5929l<T> lVar, C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i, C13753j jVar) {
        super(lVar);
        this.f37112N = oVar;
        this.f37113O = i;
        this.f37114P = jVar;
    }

    /* renamed from: a */
    public static <T, R> C14062c<T> m56699a(C14062c<? super R> cVar, C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i, C13753j jVar) {
        int i2 = C12887a.f37115a[jVar.ordinal()];
        if (i2 == 1) {
            return new C12889c(cVar, oVar, i, false);
        }
        if (i2 != 2) {
            return new C12890d(cVar, oVar, i);
        }
        return new C12889c(cVar, oVar, i, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        if (!C12671j3.m56158a(this.f35814b, cVar, this.f37112N)) {
            this.f35814b.mo24397a(m56699a(cVar, this.f37112N, this.f37113O, this.f37114P));
        }
    }
}
