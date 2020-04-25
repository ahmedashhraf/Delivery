package p195e.p196a.p199x0.p454e.p459e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12398g;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p441d1.C12241d;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12339o;
import p195e.p196a.p466y0.C13772a;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.e.r2 */
/* compiled from: ObservableReplay */
public final class C13391r2<T> extends C13772a<T> implements C12398g<T>, C12314c {

    /* renamed from: P */
    static final C13393b f38751P = new C13406o();

    /* renamed from: N */
    final C13393b<T> f38752N;

    /* renamed from: O */
    final C5926g0<T> f38753O;

    /* renamed from: a */
    final C5926g0<T> f38754a;

    /* renamed from: b */
    final AtomicReference<C13401j<T>> f38755b;

    /* renamed from: e.a.x0.e.e.r2$a */
    /* compiled from: ObservableReplay */
    static abstract class C13392a<T> extends AtomicReference<C13397f> implements C13399h<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* renamed from: a */
        C13397f f38756a;

        /* renamed from: b */
        int f38757b;

        C13392a() {
            C13397f fVar = new C13397f(null);
            this.f38756a = fVar;
            set(fVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo42868a(C13397f fVar) {
            this.f38756a.set(fVar);
            this.f38756a = fVar;
            this.f38757b++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Object mo42872b(Object obj) {
            return obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo42873b(C13397f fVar) {
            set(fVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Object mo42874c(Object obj) {
            return obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo42875d() {
            Object obj = this.f38756a.f38765a;
            return obj != null && C13761q.m58752e(mo42874c(obj));
        }

        /* renamed from: e */
        public final void mo42876e() {
            mo42868a(new C13397f(mo42872b(C13761q.m58750d())));
            mo42881j();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo42877f() {
            Object obj = this.f38756a.f38765a;
            return obj != null && C13761q.m58754g(mo42874c(obj));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public final void mo42878g() {
            C13397f fVar = (C13397f) ((C13397f) get()).get();
            this.f38757b--;
            mo42873b(fVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public final void mo42879h() {
            C13397f fVar = (C13397f) get();
            if (fVar.f38765a != null) {
                C13397f fVar2 = new C13397f(null);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public abstract void mo42880i();

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo42881j() {
            mo42879h();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo42866a(int i) {
            C13397f fVar = (C13397f) get();
            while (i > 0) {
                fVar = (C13397f) fVar.get();
                i--;
                this.f38757b--;
            }
            mo42873b(fVar);
        }

        /* renamed from: a */
        public final void mo42869a(T t) {
            mo42868a(new C13397f(mo42872b(C13761q.m58756i(t))));
            mo42880i();
        }

        /* renamed from: a */
        public final void mo42870a(Throwable th) {
            mo42868a(new C13397f(mo42872b(C13761q.m58743a(th))));
            mo42881j();
        }

        /* renamed from: a */
        public final void mo42867a(C13395d<T> dVar) {
            if (dVar.getAndIncrement() == 0) {
                int i = 1;
                do {
                    C13397f fVar = (C13397f) dVar.mo42884a();
                    if (fVar == null) {
                        fVar = mo42865a();
                        dVar.f38759N = fVar;
                    }
                    while (!dVar.mo41878d()) {
                        C13397f fVar2 = (C13397f) fVar.get();
                        if (fVar2 == null) {
                            dVar.f38759N = fVar;
                            i = dVar.addAndGet(-i);
                        } else if (C13761q.m58744a(mo42874c(fVar2.f38765a), dVar.f38762b)) {
                            dVar.f38759N = null;
                            return;
                        } else {
                            fVar = fVar2;
                        }
                    }
                    return;
                } while (i != 0);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo42871a(Collection<? super T> collection) {
            C13397f a = mo42865a();
            while (true) {
                a = (C13397f) a.get();
                if (a != null) {
                    Object c = mo42874c(a.f38765a);
                    if (!C13761q.m58752e(c) && !C13761q.m58754g(c)) {
                        collection.add(C13761q.m58751d(c));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C13397f mo42865a() {
            return (C13397f) get();
        }
    }

    /* renamed from: e.a.x0.e.e.r2$b */
    /* compiled from: ObservableReplay */
    interface C13393b<T> {
        C13399h<T> call();
    }

    /* renamed from: e.a.x0.e.e.r2$c */
    /* compiled from: ObservableReplay */
    static final class C13394c<R> implements C12331g<C12314c> {

        /* renamed from: a */
        private final C13318m4<R> f38758a;

        C13394c(C13318m4<R> m4Var) {
            this.f38758a = m4Var;
        }

        /* renamed from: a */
        public void mo33410c(C12314c cVar) {
            this.f38758a.mo42808b(cVar);
        }
    }

    /* renamed from: e.a.x0.e.e.r2$d */
    /* compiled from: ObservableReplay */
    static final class C13395d<T> extends AtomicInteger implements C12314c {
        private static final long serialVersionUID = 2728361546769921047L;

        /* renamed from: N */
        Object f38759N;

        /* renamed from: O */
        volatile boolean f38760O;

        /* renamed from: a */
        final C13401j<T> f38761a;

        /* renamed from: b */
        final C12280i0<? super T> f38762b;

        C13395d(C13401j<T> jVar, C12280i0<? super T> i0Var) {
            this.f38761a = jVar;
            this.f38762b = i0Var;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <U> U mo42884a() {
            return this.f38759N;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38760O;
        }

        public void dispose() {
            if (!this.f38760O) {
                this.f38760O = true;
                this.f38761a.mo42887b(this);
            }
        }
    }

    /* renamed from: e.a.x0.e.e.r2$e */
    /* compiled from: ObservableReplay */
    static final class C13396e<R, U> extends C5923b0<R> {

        /* renamed from: a */
        private final Callable<? extends C13772a<U>> f38763a;

        /* renamed from: b */
        private final C12339o<? super C5923b0<U>, ? extends C5926g0<R>> f38764b;

        C13396e(Callable<? extends C13772a<U>> callable, C12339o<? super C5923b0<U>, ? extends C5926g0<R>> oVar) {
            this.f38763a = callable;
            this.f38764b = oVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo23995e(C12280i0<? super R> i0Var) {
            try {
                C13772a aVar = (C13772a) C12390b.m55563a(this.f38763a.call(), "The connectableFactory returned a null ConnectableObservable");
                C5926g0 g0Var = (C5926g0) C12390b.m55563a(this.f38764b.apply(aVar), "The selector returned a null ObservableSource");
                C13318m4 m4Var = new C13318m4(i0Var);
                g0Var.mo23893a(m4Var);
                aVar.mo42738k(new C13394c(m4Var));
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12348e.m55476a(th, i0Var);
            }
        }
    }

    /* renamed from: e.a.x0.e.e.r2$f */
    /* compiled from: ObservableReplay */
    static final class C13397f extends AtomicReference<C13397f> {
        private static final long serialVersionUID = 245354315435971818L;

        /* renamed from: a */
        final Object f38765a;

        C13397f(Object obj) {
            this.f38765a = obj;
        }
    }

    /* renamed from: e.a.x0.e.e.r2$g */
    /* compiled from: ObservableReplay */
    static final class C13398g<T> extends C13772a<T> {

        /* renamed from: a */
        private final C13772a<T> f38766a;

        /* renamed from: b */
        private final C5923b0<T> f38767b;

        C13398g(C13772a<T> aVar, C5923b0<T> b0Var) {
            this.f38766a = aVar;
            this.f38767b = b0Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo23995e(C12280i0<? super T> i0Var) {
            this.f38767b.mo23893a(i0Var);
        }

        /* renamed from: k */
        public void mo42738k(C12331g<? super C12314c> gVar) {
            this.f38766a.mo42738k(gVar);
        }
    }

    /* renamed from: e.a.x0.e.e.r2$h */
    /* compiled from: ObservableReplay */
    interface C13399h<T> {
        /* renamed from: a */
        void mo42867a(C13395d<T> dVar);

        /* renamed from: a */
        void mo42869a(T t);

        /* renamed from: a */
        void mo42870a(Throwable th);

        /* renamed from: e */
        void mo42876e();
    }

    /* renamed from: e.a.x0.e.e.r2$i */
    /* compiled from: ObservableReplay */
    static final class C13400i<T> implements C13393b<T> {

        /* renamed from: a */
        private final int f38768a;

        C13400i(int i) {
            this.f38768a = i;
        }

        public C13399h<T> call() {
            return new C13405n(this.f38768a);
        }
    }

    /* renamed from: e.a.x0.e.e.r2$j */
    /* compiled from: ObservableReplay */
    static final class C13401j<T> extends AtomicReference<C12314c> implements C12280i0<T>, C12314c {

        /* renamed from: P */
        static final C13395d[] f38769P = new C13395d[0];

        /* renamed from: Q */
        static final C13395d[] f38770Q = new C13395d[0];
        private static final long serialVersionUID = -533785617179540163L;

        /* renamed from: N */
        final AtomicReference<C13395d[]> f38771N = new AtomicReference<>(f38769P);

        /* renamed from: O */
        final AtomicBoolean f38772O = new AtomicBoolean();

        /* renamed from: a */
        final C13399h<T> f38773a;

        /* renamed from: b */
        boolean f38774b;

        C13401j(C13399h<T> hVar) {
            this.f38773a = hVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42886a(C13395d<T> dVar) {
            C13395d[] dVarArr;
            C13395d[] dVarArr2;
            do {
                dVarArr = (C13395d[]) this.f38771N.get();
                if (dVarArr == f38770Q) {
                    return false;
                }
                int length = dVarArr.length;
                dVarArr2 = new C13395d[(length + 1)];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                dVarArr2[length] = dVar;
            } while (!this.f38771N.compareAndSet(dVarArr, dVarArr2));
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42887b(C13395d<T> dVar) {
            C13395d[] dVarArr;
            C13395d[] dVarArr2;
            do {
                dVarArr = (C13395d[]) this.f38771N.get();
                int length = dVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (dVarArr[i2].equals(dVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            dVarArr2 = f38769P;
                        } else {
                            C13395d[] dVarArr3 = new C13395d[(length - 1)];
                            System.arraycopy(dVarArr, 0, dVarArr3, 0, i);
                            System.arraycopy(dVarArr, i + 1, dVarArr3, i, (length - i) - 1);
                            dVarArr2 = dVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f38771N.compareAndSet(dVarArr, dVarArr2));
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f38771N.get() == f38770Q;
        }

        public void dispose() {
            this.f38771N.set(f38770Q);
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42888e() {
            for (C13395d a : (C13395d[]) this.f38771N.getAndSet(f38770Q)) {
                this.f38773a.mo42867a(a);
            }
        }

        public void onComplete() {
            if (!this.f38774b) {
                this.f38774b = true;
                this.f38773a.mo42876e();
                mo42888e();
            }
        }

        public void onError(Throwable th) {
            if (!this.f38774b) {
                this.f38774b = true;
                this.f38773a.mo42870a(th);
                mo42888e();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
            if (C12347d.m55468c(this, cVar)) {
                mo42885a();
            }
        }

        /* renamed from: a */
        public void mo33453a(T t) {
            if (!this.f38774b) {
                this.f38773a.mo42869a(t);
                mo42885a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42885a() {
            for (C13395d a : (C13395d[]) this.f38771N.get()) {
                this.f38773a.mo42867a(a);
            }
        }
    }

    /* renamed from: e.a.x0.e.e.r2$k */
    /* compiled from: ObservableReplay */
    static final class C13402k<T> implements C5926g0<T> {

        /* renamed from: a */
        private final AtomicReference<C13401j<T>> f38775a;

        /* renamed from: b */
        private final C13393b<T> f38776b;

        C13402k(AtomicReference<C13401j<T>> atomicReference, C13393b<T> bVar) {
            this.f38775a = atomicReference;
            this.f38776b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo23893a(p195e.p196a.C12280i0<? super T> r4) {
            /*
                r3 = this;
            L_0x0000:
                java.util.concurrent.atomic.AtomicReference<e.a.x0.e.e.r2$j<T>> r0 = r3.f38775a
                java.lang.Object r0 = r0.get()
                e.a.x0.e.e.r2$j r0 = (p195e.p196a.p199x0.p454e.p459e.C13391r2.C13401j) r0
                if (r0 != 0) goto L_0x0020
                e.a.x0.e.e.r2$b<T> r0 = r3.f38776b
                e.a.x0.e.e.r2$h r0 = r0.call()
                e.a.x0.e.e.r2$j r1 = new e.a.x0.e.e.r2$j
                r1.<init>(r0)
                java.util.concurrent.atomic.AtomicReference<e.a.x0.e.e.r2$j<T>> r0 = r3.f38775a
                r2 = 0
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 != 0) goto L_0x001f
                goto L_0x0000
            L_0x001f:
                r0 = r1
            L_0x0020:
                e.a.x0.e.e.r2$d r1 = new e.a.x0.e.e.r2$d
                r1.<init>(r0, r4)
                r4.mo34123a(r1)
                r0.mo42886a(r1)
                boolean r4 = r1.mo41878d()
                if (r4 == 0) goto L_0x0035
                r0.mo42887b(r1)
                return
            L_0x0035:
                e.a.x0.e.e.r2$h<T> r4 = r0.f38773a
                r4.mo42867a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p459e.C13391r2.C13402k.mo23893a(e.a.i0):void");
        }
    }

    /* renamed from: e.a.x0.e.e.r2$l */
    /* compiled from: ObservableReplay */
    static final class C13403l<T> implements C13393b<T> {

        /* renamed from: a */
        private final int f38777a;

        /* renamed from: b */
        private final long f38778b;

        /* renamed from: c */
        private final TimeUnit f38779c;

        /* renamed from: d */
        private final C12282j0 f38780d;

        C13403l(int i, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            this.f38777a = i;
            this.f38778b = j;
            this.f38779c = timeUnit;
            this.f38780d = j0Var;
        }

        public C13399h<T> call() {
            C13404m mVar = new C13404m(this.f38777a, this.f38778b, this.f38779c, this.f38780d);
            return mVar;
        }
    }

    /* renamed from: e.a.x0.e.e.r2$m */
    /* compiled from: ObservableReplay */
    static final class C13404m<T> extends C13392a<T> {
        private static final long serialVersionUID = 3457957419649567404L;

        /* renamed from: N */
        final C12282j0 f38781N;

        /* renamed from: O */
        final long f38782O;

        /* renamed from: P */
        final TimeUnit f38783P;

        /* renamed from: Q */
        final int f38784Q;

        C13404m(int i, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            this.f38781N = j0Var;
            this.f38784Q = i;
            this.f38782O = j;
            this.f38783P = timeUnit;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C13397f mo42865a() {
            C13397f fVar;
            long a = this.f38781N.mo41870a(this.f38783P) - this.f38782O;
            C13397f fVar2 = (C13397f) get();
            Object obj = fVar2.get();
            while (true) {
                C13397f fVar3 = (C13397f) obj;
                fVar = fVar2;
                fVar2 = fVar3;
                if (fVar2 != null) {
                    C12241d dVar = (C12241d) fVar2.f38765a;
                    if (C13761q.m58752e(dVar.mo41887c()) || C13761q.m58754g(dVar.mo41887c()) || dVar.mo41884a() > a) {
                        break;
                    }
                    obj = fVar2.get();
                } else {
                    break;
                }
            }
            return fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Object mo42872b(Object obj) {
            return new C12241d(obj, this.f38781N.mo41870a(this.f38783P), this.f38783P);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Object mo42874c(Object obj) {
            return ((C12241d) obj).mo41887c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo42880i() {
            C13397f fVar;
            long a = this.f38781N.mo41870a(this.f38783P) - this.f38782O;
            C13397f fVar2 = (C13397f) get();
            C13397f fVar3 = (C13397f) fVar2.get();
            int i = 0;
            while (true) {
                C13397f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                int i2 = this.f38757b;
                if (i2 <= this.f38784Q) {
                    if (((C12241d) fVar2.f38765a).mo41884a() > a) {
                        break;
                    }
                    i++;
                    this.f38757b--;
                    fVar3 = (C13397f) fVar2.get();
                } else {
                    i++;
                    this.f38757b = i2 - 1;
                    fVar3 = (C13397f) fVar2.get();
                }
            }
            if (i != 0) {
                mo42873b(fVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42881j() {
            /*
                r10 = this;
                e.a.j0 r0 = r10.f38781N
                java.util.concurrent.TimeUnit r1 = r10.f38783P
                long r0 = r0.mo41870a(r1)
                long r2 = r10.f38782O
                long r0 = r0 - r2
                java.lang.Object r2 = r10.get()
                e.a.x0.e.e.r2$f r2 = (p195e.p196a.p199x0.p454e.p459e.C13391r2.C13397f) r2
                java.lang.Object r3 = r2.get()
                e.a.x0.e.e.r2$f r3 = (p195e.p196a.p199x0.p454e.p459e.C13391r2.C13397f) r3
                r4 = 0
            L_0x0018:
                r9 = r3
                r3 = r2
                r2 = r9
                if (r2 == 0) goto L_0x003c
                int r5 = r10.f38757b
                r6 = 1
                if (r5 <= r6) goto L_0x003c
                java.lang.Object r5 = r2.f38765a
                e.a.d1.d r5 = (p195e.p196a.p441d1.C12241d) r5
                long r7 = r5.mo41884a()
                int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r5 > 0) goto L_0x003c
                int r4 = r4 + 1
                int r3 = r10.f38757b
                int r3 = r3 - r6
                r10.f38757b = r3
                java.lang.Object r3 = r2.get()
                e.a.x0.e.e.r2$f r3 = (p195e.p196a.p199x0.p454e.p459e.C13391r2.C13397f) r3
                goto L_0x0018
            L_0x003c:
                if (r4 == 0) goto L_0x0041
                r10.mo42873b(r3)
            L_0x0041:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p459e.C13391r2.C13404m.mo42881j():void");
        }
    }

    /* renamed from: e.a.x0.e.e.r2$n */
    /* compiled from: ObservableReplay */
    static final class C13405n<T> extends C13392a<T> {
        private static final long serialVersionUID = -5898283885385201806L;

        /* renamed from: N */
        final int f38785N;

        C13405n(int i) {
            this.f38785N = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo42880i() {
            if (this.f38757b > this.f38785N) {
                mo42878g();
            }
        }
    }

    /* renamed from: e.a.x0.e.e.r2$o */
    /* compiled from: ObservableReplay */
    static final class C13406o implements C13393b<Object> {
        C13406o() {
        }

        public C13399h<Object> call() {
            return new C13407p(16);
        }
    }

    /* renamed from: e.a.x0.e.e.r2$p */
    /* compiled from: ObservableReplay */
    static final class C13407p<T> extends ArrayList<Object> implements C13399h<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* renamed from: a */
        volatile int f38786a;

        C13407p(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo42869a(T t) {
            add(C13761q.m58756i(t));
            this.f38786a++;
        }

        /* renamed from: e */
        public void mo42876e() {
            add(C13761q.m58750d());
            this.f38786a++;
        }

        /* renamed from: a */
        public void mo42870a(Throwable th) {
            add(C13761q.m58743a(th));
            this.f38786a++;
        }

        /* renamed from: a */
        public void mo42867a(C13395d<T> dVar) {
            if (dVar.getAndIncrement() == 0) {
                C12280i0<? super T> i0Var = dVar.f38762b;
                int i = 1;
                while (!dVar.mo41878d()) {
                    int i2 = this.f38786a;
                    Integer num = (Integer) dVar.mo42884a();
                    int intValue = num != null ? num.intValue() : 0;
                    while (intValue < i2) {
                        if (!C13761q.m58744a(get(intValue), i0Var) && !dVar.mo41878d()) {
                            intValue++;
                        } else {
                            return;
                        }
                    }
                    dVar.f38759N = Integer.valueOf(intValue);
                    i = dVar.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    private C13391r2(C5926g0<T> g0Var, C5926g0<T> g0Var2, AtomicReference<C13401j<T>> atomicReference, C13393b<T> bVar) {
        this.f38753O = g0Var;
        this.f38754a = g0Var2;
        this.f38755b = atomicReference;
        this.f38752N = bVar;
    }

    /* renamed from: a */
    public static <U, R> C5923b0<R> m57839a(Callable<? extends C13772a<U>> callable, C12339o<? super C5923b0<U>, ? extends C5926g0<R>> oVar) {
        return C12205a.m54862a((C5923b0<T>) new C13396e<T>(callable, oVar));
    }

    /* renamed from: h */
    public static <T> C13772a<T> m57844h(C5926g0<T> g0Var, int i) {
        if (i == Integer.MAX_VALUE) {
            return m57845w(g0Var);
        }
        return m57842a(g0Var, (C13393b<T>) new C13400i<T>(i));
    }

    /* renamed from: w */
    public static <T> C13772a<T> m57845w(C5926g0<? extends T> g0Var) {
        return m57842a(g0Var, f38751P);
    }

    /* renamed from: d */
    public boolean mo41878d() {
        C12314c cVar = (C12314c) this.f38755b.get();
        return cVar == null || cVar.mo41878d();
    }

    public void dispose() {
        this.f38755b.lazySet(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo23995e(C12280i0<? super T> i0Var) {
        this.f38753O.mo23893a(i0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42738k(p195e.p196a.p449w0.C12331g<? super p195e.p196a.p447u0.C12314c> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<e.a.x0.e.e.r2$j<T>> r0 = r4.f38755b
            java.lang.Object r0 = r0.get()
            e.a.x0.e.e.r2$j r0 = (p195e.p196a.p199x0.p454e.p459e.C13391r2.C13401j) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.mo41878d()
            if (r1 == 0) goto L_0x0025
        L_0x0010:
            e.a.x0.e.e.r2$b<T> r1 = r4.f38752N
            e.a.x0.e.e.r2$h r1 = r1.call()
            e.a.x0.e.e.r2$j r2 = new e.a.x0.e.e.r2$j
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<e.a.x0.e.e.r2$j<T>> r1 = r4.f38755b
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 != 0) goto L_0x0024
            goto L_0x0000
        L_0x0024:
            r0 = r2
        L_0x0025:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f38772O
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0039
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f38772O
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0039
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            r5.mo33410c(r0)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0044
            e.a.g0<T> r5 = r4.f38754a
            r5.mo23893a(r0)
        L_0x0044:
            return
        L_0x0045:
            r5 = move-exception
            if (r1 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f38772O
            r0.compareAndSet(r2, r3)
        L_0x004d:
            p212io.reactivex.exceptions.C14398a.m62357b(r5)
            java.lang.RuntimeException r5 = p195e.p196a.p199x0.p200j.C13754k.m58724c(r5)
            goto L_0x0056
        L_0x0055:
            throw r5
        L_0x0056:
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p459e.C13391r2.mo42738k(e.a.w0.g):void");
    }

    public C5926g0<T> source() {
        return this.f38754a;
    }

    /* renamed from: a */
    public static <T> C13772a<T> m57843a(C13772a<T> aVar, C12282j0 j0Var) {
        return C12205a.m54877a((C13772a<T>) new C13398g<T>(aVar, aVar.mo23825a(j0Var)));
    }

    /* renamed from: a */
    public static <T> C13772a<T> m57840a(C5926g0<T> g0Var, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return m57841a(g0Var, j, timeUnit, j0Var, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static <T> C13772a<T> m57841a(C5926g0<T> g0Var, long j, TimeUnit timeUnit, C12282j0 j0Var, int i) {
        C13403l lVar = new C13403l(i, j, timeUnit, j0Var);
        return m57842a(g0Var, (C13393b<T>) lVar);
    }

    /* renamed from: a */
    static <T> C13772a<T> m57842a(C5926g0<T> g0Var, C13393b<T> bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return C12205a.m54877a((C13772a<T>) new C13391r2<T>(new C13402k(atomicReference, bVar), g0Var, atomicReference, bVar));
    }
}
