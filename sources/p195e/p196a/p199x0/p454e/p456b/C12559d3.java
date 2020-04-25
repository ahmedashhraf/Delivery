package p195e.p196a.p199x0.p454e.p456b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12282j0;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p452c.C12399h;
import p195e.p196a.p199x0.p464h.C13732u;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p441d1.C12241d;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p448v0.C12322a;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.d3 */
/* compiled from: FlowableReplay */
public final class C12559d3<T> extends C12322a<T> implements C12399h<T>, C12314c {

    /* renamed from: Q */
    static final Callable f35944Q = new C12562c();

    /* renamed from: N */
    final AtomicReference<C12570j<T>> f35945N;

    /* renamed from: O */
    final Callable<? extends C12567g<T>> f35946O;

    /* renamed from: P */
    final C6007b<T> f35947P;

    /* renamed from: b */
    final C5929l<T> f35948b;

    /* renamed from: e.a.x0.e.b.d3$a */
    /* compiled from: FlowableReplay */
    static class C12560a<T> extends AtomicReference<C12566f> implements C12567g<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* renamed from: N */
        long f35949N;

        /* renamed from: a */
        C12566f f35950a;

        /* renamed from: b */
        int f35951b;

        C12560a() {
            C12566f fVar = new C12566f(null, 0);
            this.f35950a = fVar;
            set(fVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo42250a(C12566f fVar) {
            this.f35950a.set(fVar);
            this.f35950a = fVar;
            this.f35951b++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Object mo42254b(Object obj) {
            return obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo42255b(C12566f fVar) {
            set(fVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Object mo42256c(Object obj) {
            return obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo42257d() {
            Object obj = this.f35950a.f35965a;
            return obj != null && C13761q.m58752e(mo42256c(obj));
        }

        /* renamed from: e */
        public final void mo42258e() {
            Object b = mo42254b(C13761q.m58750d());
            long j = this.f35949N + 1;
            this.f35949N = j;
            mo42250a(new C12566f(b, j));
            mo42263j();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo42259f() {
            Object obj = this.f35950a.f35965a;
            return obj != null && C13761q.m58754g(mo42256c(obj));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public final void mo42260g() {
            C12566f fVar = (C12566f) ((C12566f) get()).get();
            if (fVar != null) {
                this.f35951b--;
                mo42255b(fVar);
                return;
            }
            throw new IllegalStateException("Empty list!");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public final void mo42261h() {
            C12566f fVar = (C12566f) get();
            if (fVar.f35965a != null) {
                C12566f fVar2 = new C12566f(null, 0);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo42262i() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo42263j() {
            mo42261h();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo42248a(int i) {
            C12566f fVar = (C12566f) get();
            while (i > 0) {
                fVar = (C12566f) fVar.get();
                i--;
                this.f35951b--;
            }
            mo42255b(fVar);
        }

        /* renamed from: a */
        public final void mo42251a(T t) {
            Object b = mo42254b(C13761q.m58756i(t));
            long j = this.f35949N + 1;
            this.f35949N = j;
            mo42250a(new C12566f(b, j));
            mo42262i();
        }

        /* renamed from: a */
        public final void mo42252a(Throwable th) {
            Object b = mo42254b(C13761q.m58743a(th));
            long j = this.f35949N + 1;
            this.f35949N = j;
            mo42250a(new C12566f(b, j));
            mo42263j();
        }

        /* JADX INFO: used method not loaded: e.a.x0.j.d.a(java.util.concurrent.atomic.AtomicLong, long):null, types can be incorrect */
        /* JADX INFO: used method not loaded: e.a.x0.j.q.a(java.lang.Object, i.e.c):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            if (r14.mo41878d() == false) goto L_0x0014;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
            r2 = r14.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
            if (r2 != Long.MAX_VALUE) goto L_0x0024;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
            r5 = (p195e.p196a.p199x0.p454e.p456b.C12559d3.C12566f) r14.mo42266a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
            if (r5 != null) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
            r5 = mo42247a();
            r14.f35955N = r5;
            p195e.p196a.p199x0.p200j.C13747d.m58696a(r14.f35956O, r5.f35966b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
            if (r2 == 0) goto L_0x0083;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
            r10 = (p195e.p196a.p199x0.p454e.p456b.C12559d3.C12566f) r5.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
            if (r10 == null) goto L_0x0083;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
            r5 = mo42256c(r10.f35965a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
            if (p195e.p196a.p199x0.p200j.C13761q.m58745a(r5, (p205i.p211e.C14062c) r14.f35960b) == false) goto L_0x005b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
            r14.f35955N = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x005b, code lost:
            r8 = r8 + 1;
            r2 = r2 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
            if (r14.mo41878d() == false) goto L_0x0066;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0066, code lost:
            r5 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0069, code lost:
            p212io.reactivex.exceptions.C14398a.m62357b(r0);
            r14.f35955N = null;
            r14.dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x007d, code lost:
            r14.f35960b.onError(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0082, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0085, code lost:
            if (r8 == 0) goto L_0x008e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0087, code lost:
            r14.f35955N = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0089, code lost:
            if (r4 != false) goto L_0x008e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x008b, code lost:
            r14.mo42265a(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x008e, code lost:
            monitor-enter(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0091, code lost:
            if (r14.f35958Q != false) goto L_0x0097;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0093, code lost:
            r14.f35957P = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0095, code lost:
            monitor-exit(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0096, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0097, code lost:
            r14.f35958Q = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0099, code lost:
            monitor-exit(r14);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo42249a(p195e.p196a.p199x0.p454e.p456b.C12559d3.C12563d<T> r14) {
            /*
                r13 = this;
                monitor-enter(r14)
                boolean r0 = r14.f35957P     // Catch:{ all -> 0x009f }
                r1 = 1
                if (r0 == 0) goto L_0x000a
                r14.f35958Q = r1     // Catch:{ all -> 0x009f }
                monitor-exit(r14)     // Catch:{ all -> 0x009f }
                return
            L_0x000a:
                r14.f35957P = r1     // Catch:{ all -> 0x009f }
                monitor-exit(r14)     // Catch:{ all -> 0x009f }
            L_0x000d:
                boolean r0 = r14.mo41878d()
                if (r0 == 0) goto L_0x0014
                return
            L_0x0014:
                long r2 = r14.get()
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x0024
                r4 = 1
                goto L_0x0025
            L_0x0024:
                r4 = 0
            L_0x0025:
                java.lang.Object r5 = r14.mo42266a()
                e.a.x0.e.b.d3$f r5 = (p195e.p196a.p199x0.p454e.p456b.C12559d3.C12566f) r5
                r6 = 0
                if (r5 != 0) goto L_0x003c
                e.a.x0.e.b.d3$f r5 = r13.mo42247a()
                r14.f35955N = r5
                java.util.concurrent.atomic.AtomicLong r8 = r14.f35956O
                long r9 = r5.f35966b
                p195e.p196a.p199x0.p200j.C13747d.m58696a(r8, r9)
            L_0x003c:
                r8 = r6
            L_0x003d:
                int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r10 == 0) goto L_0x0083
                java.lang.Object r10 = r5.get()
                e.a.x0.e.b.d3$f r10 = (p195e.p196a.p199x0.p454e.p456b.C12559d3.C12566f) r10
                if (r10 == 0) goto L_0x0083
                java.lang.Object r5 = r10.f35965a
                java.lang.Object r5 = r13.mo42256c(r5)
                r11 = 0
                i.e.c<? super T> r12 = r14.f35960b     // Catch:{ all -> 0x0068 }
                boolean r12 = p195e.p196a.p199x0.p200j.C13761q.m58745a(r5, r12)     // Catch:{ all -> 0x0068 }
                if (r12 == 0) goto L_0x005b
                r14.f35955N = r11     // Catch:{ all -> 0x0068 }
                return
            L_0x005b:
                r11 = 1
                long r8 = r8 + r11
                long r2 = r2 - r11
                boolean r5 = r14.mo41878d()
                if (r5 == 0) goto L_0x0066
                return
            L_0x0066:
                r5 = r10
                goto L_0x003d
            L_0x0068:
                r0 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r0)
                r14.f35955N = r11
                r14.dispose()
                boolean r1 = p195e.p196a.p199x0.p200j.C13761q.m58754g(r5)
                if (r1 != 0) goto L_0x0082
                boolean r1 = p195e.p196a.p199x0.p200j.C13761q.m58752e(r5)
                if (r1 != 0) goto L_0x0082
                i.e.c<? super T> r14 = r14.f35960b
                r14.onError(r0)
            L_0x0082:
                return
            L_0x0083:
                int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r2 == 0) goto L_0x008e
                r14.f35955N = r5
                if (r4 != 0) goto L_0x008e
                r14.mo42265a(r8)
            L_0x008e:
                monitor-enter(r14)
                boolean r2 = r14.f35958Q     // Catch:{ all -> 0x009c }
                if (r2 != 0) goto L_0x0097
                r14.f35957P = r0     // Catch:{ all -> 0x009c }
                monitor-exit(r14)     // Catch:{ all -> 0x009c }
                return
            L_0x0097:
                r14.f35958Q = r0     // Catch:{ all -> 0x009c }
                monitor-exit(r14)     // Catch:{ all -> 0x009c }
                goto L_0x000d
            L_0x009c:
                r0 = move-exception
                monitor-exit(r14)     // Catch:{ all -> 0x009c }
                throw r0
            L_0x009f:
                r0 = move-exception
                monitor-exit(r14)     // Catch:{ all -> 0x009f }
                goto L_0x00a3
            L_0x00a2:
                throw r0
            L_0x00a3:
                goto L_0x00a2
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12559d3.C12560a.mo42249a(e.a.x0.e.b.d3$d):void");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo42253a(Collection<? super T> collection) {
            C12566f a = mo42247a();
            while (true) {
                a = (C12566f) a.get();
                if (a != null) {
                    Object c = mo42256c(a.f35965a);
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
        public C12566f mo42247a() {
            return (C12566f) get();
        }
    }

    /* renamed from: e.a.x0.e.b.d3$b */
    /* compiled from: FlowableReplay */
    static final class C12561b<T> extends C12322a<T> {

        /* renamed from: N */
        private final C5929l<T> f35952N;

        /* renamed from: b */
        private final C12322a<T> f35953b;

        C12561b(C12322a<T> aVar, C5929l<T> lVar) {
            this.f35953b = aVar;
            this.f35952N = lVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo24499e(C14062c<? super T> cVar) {
            this.f35952N.mo24397a(cVar);
        }

        /* renamed from: l */
        public void mo42084l(C12331g<? super C12314c> gVar) {
            this.f35953b.mo42084l(gVar);
        }
    }

    /* renamed from: e.a.x0.e.b.d3$c */
    /* compiled from: FlowableReplay */
    static final class C12562c implements Callable<Object> {
        C12562c() {
        }

        public Object call() {
            return new C12574n(16);
        }
    }

    /* renamed from: e.a.x0.e.b.d3$d */
    /* compiled from: FlowableReplay */
    static final class C12563d<T> extends AtomicLong implements C14063d, C12314c {

        /* renamed from: R */
        static final long f35954R = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;

        /* renamed from: N */
        Object f35955N;

        /* renamed from: O */
        final AtomicLong f35956O = new AtomicLong();

        /* renamed from: P */
        boolean f35957P;

        /* renamed from: Q */
        boolean f35958Q;

        /* renamed from: a */
        final C12570j<T> f35959a;

        /* renamed from: b */
        final C14062c<? super T> f35960b;

        C12563d(C12570j<T> jVar, C14062c<? super T> cVar) {
            this.f35959a = jVar;
            this.f35960b = cVar;
        }

        /* renamed from: a */
        public long mo42265a(long j) {
            return C13747d.m58700d(this, j);
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j) && C13747d.m58698b((AtomicLong) this, j) != Long.MIN_VALUE) {
                C13747d.m58696a(this.f35956O, j);
                this.f35959a.mo42269a();
                this.f35959a.f35977a.mo42249a(this);
            }
        }

        public void cancel() {
            dispose();
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return get() == Long.MIN_VALUE;
        }

        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f35959a.mo42271b(this);
                this.f35959a.mo42269a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <U> U mo42266a() {
            return this.f35955N;
        }
    }

    /* renamed from: e.a.x0.e.b.d3$e */
    /* compiled from: FlowableReplay */
    static final class C12564e<R, U> extends C5929l<R> {

        /* renamed from: N */
        private final C12339o<? super C5929l<U>, ? extends C6007b<R>> f35961N;

        /* renamed from: b */
        private final Callable<? extends C12322a<U>> f35962b;

        /* renamed from: e.a.x0.e.b.d3$e$a */
        /* compiled from: FlowableReplay */
        final class C12565a implements C12331g<C12314c> {

            /* renamed from: a */
            private final C13732u<R> f35963a;

            C12565a(C13732u<R> uVar) {
                this.f35963a = uVar;
            }

            /* renamed from: a */
            public void mo33410c(C12314c cVar) {
                this.f35963a.mo43115a(cVar);
            }
        }

        C12564e(Callable<? extends C12322a<U>> callable, C12339o<? super C5929l<U>, ? extends C6007b<R>> oVar) {
            this.f35962b = callable;
            this.f35961N = oVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo24499e(C14062c<? super R> cVar) {
            try {
                C12322a aVar = (C12322a) C12390b.m55563a(this.f35962b.call(), "The connectableFactory returned null");
                try {
                    C6007b bVar = (C6007b) C12390b.m55563a(this.f35961N.apply(aVar), "The selector returned a null Publisher");
                    C13732u uVar = new C13732u(cVar);
                    bVar.mo24397a(uVar);
                    aVar.mo42084l(new C12565a(uVar));
                } catch (Throwable th) {
                    C14398a.m62357b(th);
                    C13739g.m58655a(th, cVar);
                }
            } catch (Throwable th2) {
                C14398a.m62357b(th2);
                C13739g.m58655a(th2, cVar);
            }
        }
    }

    /* renamed from: e.a.x0.e.b.d3$f */
    /* compiled from: FlowableReplay */
    static final class C12566f extends AtomicReference<C12566f> {
        private static final long serialVersionUID = 245354315435971818L;

        /* renamed from: a */
        final Object f35965a;

        /* renamed from: b */
        final long f35966b;

        C12566f(Object obj, long j) {
            this.f35965a = obj;
            this.f35966b = j;
        }
    }

    /* renamed from: e.a.x0.e.b.d3$g */
    /* compiled from: FlowableReplay */
    interface C12567g<T> {
        /* renamed from: a */
        void mo42249a(C12563d<T> dVar);

        /* renamed from: a */
        void mo42251a(T t);

        /* renamed from: a */
        void mo42252a(Throwable th);

        /* renamed from: e */
        void mo42258e();
    }

    /* renamed from: e.a.x0.e.b.d3$h */
    /* compiled from: FlowableReplay */
    static final class C12568h<T> implements Callable<C12567g<T>> {

        /* renamed from: a */
        private final int f35967a;

        C12568h(int i) {
            this.f35967a = i;
        }

        public C12567g<T> call() {
            return new C12573m(this.f35967a);
        }
    }

    /* renamed from: e.a.x0.e.b.d3$i */
    /* compiled from: FlowableReplay */
    static final class C12569i<T> implements C6007b<T> {

        /* renamed from: a */
        private final AtomicReference<C12570j<T>> f35968a;

        /* renamed from: b */
        private final Callable<? extends C12567g<T>> f35969b;

        C12569i(AtomicReference<C12570j<T>> atomicReference, Callable<? extends C12567g<T>> callable) {
            this.f35968a = atomicReference;
            this.f35969b = callable;
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo24397a(p205i.p211e.C14062c<? super T> r4) {
            /*
                r3 = this;
            L_0x0000:
                java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.d3$j<T>> r0 = r3.f35968a
                java.lang.Object r0 = r0.get()
                e.a.x0.e.b.d3$j r0 = (p195e.p196a.p199x0.p454e.p456b.C12559d3.C12570j) r0
                if (r0 != 0) goto L_0x002b
                java.util.concurrent.Callable<? extends e.a.x0.e.b.d3$g<T>> r0 = r3.f35969b     // Catch:{ all -> 0x0023 }
                java.lang.Object r0 = r0.call()     // Catch:{ all -> 0x0023 }
                e.a.x0.e.b.d3$g r0 = (p195e.p196a.p199x0.p454e.p456b.C12559d3.C12567g) r0     // Catch:{ all -> 0x0023 }
                e.a.x0.e.b.d3$j r1 = new e.a.x0.e.b.d3$j
                r1.<init>(r0)
                java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.d3$j<T>> r0 = r3.f35968a
                r2 = 0
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 != 0) goto L_0x0021
                goto L_0x0000
            L_0x0021:
                r0 = r1
                goto L_0x002b
            L_0x0023:
                r0 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r0)
                p195e.p196a.p199x0.p465i.C13739g.m58655a(r0, r4)
                return
            L_0x002b:
                e.a.x0.e.b.d3$d r1 = new e.a.x0.e.b.d3$d
                r1.<init>(r0, r4)
                r4.mo41788a(r1)
                r0.mo42270a(r1)
                boolean r4 = r1.mo41878d()
                if (r4 == 0) goto L_0x0040
                r0.mo42271b(r1)
                return
            L_0x0040:
                r0.mo42269a()
                e.a.x0.e.b.d3$g<T> r4 = r0.f35977a
                r4.mo42249a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12559d3.C12569i.mo24397a(i.e.c):void");
        }
    }

    /* renamed from: e.a.x0.e.b.d3$j */
    /* compiled from: FlowableReplay */
    static final class C12570j<T> extends AtomicReference<C14063d> implements C12297q<T>, C12314c {

        /* renamed from: S */
        static final C12563d[] f35970S = new C12563d[0];

        /* renamed from: T */
        static final C12563d[] f35971T = new C12563d[0];
        private static final long serialVersionUID = 7224554242710036740L;

        /* renamed from: N */
        final AtomicReference<C12563d<T>[]> f35972N = new AtomicReference<>(f35970S);

        /* renamed from: O */
        final AtomicBoolean f35973O = new AtomicBoolean();

        /* renamed from: P */
        final AtomicInteger f35974P = new AtomicInteger();

        /* renamed from: Q */
        long f35975Q;

        /* renamed from: R */
        long f35976R;

        /* renamed from: a */
        final C12567g<T> f35977a;

        /* renamed from: b */
        boolean f35978b;

        C12570j(C12567g<T> gVar) {
            this.f35977a = gVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42270a(C12563d<T> dVar) {
            C12563d[] dVarArr;
            C12563d[] dVarArr2;
            if (dVar != null) {
                do {
                    dVarArr = (C12563d[]) this.f35972N.get();
                    if (dVarArr == f35971T) {
                        return false;
                    }
                    int length = dVarArr.length;
                    dVarArr2 = new C12563d[(length + 1)];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                    dVarArr2[length] = dVar;
                } while (!this.f35972N.compareAndSet(dVarArr, dVarArr2));
                return true;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42271b(C12563d<T> dVar) {
            C12563d[] dVarArr;
            C12563d[] dVarArr2;
            do {
                dVarArr = (C12563d[]) this.f35972N.get();
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
                            dVarArr2 = f35970S;
                        } else {
                            C12563d[] dVarArr3 = new C12563d[(length - 1)];
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
            } while (!this.f35972N.compareAndSet(dVarArr, dVarArr2));
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35972N.get() == f35971T;
        }

        public void dispose() {
            this.f35972N.set(f35971T);
            C13742j.m58674a((AtomicReference<C14063d>) this);
        }

        public void onComplete() {
            if (!this.f35978b) {
                this.f35978b = true;
                this.f35977a.mo42258e();
                for (C12563d a : (C12563d[]) this.f35972N.getAndSet(f35971T)) {
                    this.f35977a.mo42249a(a);
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f35978b) {
                this.f35978b = true;
                this.f35977a.mo42252a(th);
                for (C12563d a : (C12563d[]) this.f35972N.getAndSet(f35971T)) {
                    this.f35977a.mo42249a(a);
                }
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58680c(this, dVar)) {
                mo42269a();
                for (C12563d a : (C12563d[]) this.f35972N.get()) {
                    this.f35977a.mo42249a(a);
                }
            }
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (!this.f35978b) {
                this.f35977a.mo42251a(t);
                for (C12563d a : (C12563d[]) this.f35972N.get()) {
                    this.f35977a.mo42249a(a);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42269a() {
            if (this.f35974P.getAndIncrement() == 0) {
                int i = 1;
                while (!mo41878d()) {
                    C12563d[] dVarArr = (C12563d[]) this.f35972N.get();
                    long j = this.f35975Q;
                    long j2 = j;
                    for (C12563d dVar : dVarArr) {
                        j2 = Math.max(j2, dVar.f35956O.get());
                    }
                    long j3 = this.f35976R;
                    C14063d dVar2 = (C14063d) get();
                    long j4 = j2 - j;
                    if (j4 != 0) {
                        this.f35975Q = j2;
                        if (dVar2 == null) {
                            long j5 = j3 + j4;
                            if (j5 < 0) {
                                j5 = Long.MAX_VALUE;
                            }
                            this.f35976R = j5;
                        } else if (j3 != 0) {
                            this.f35976R = 0;
                            dVar2.mo41813c(j3 + j4);
                        } else {
                            dVar2.mo41813c(j4);
                        }
                    } else if (!(j3 == 0 || dVar2 == null)) {
                        this.f35976R = 0;
                        dVar2.mo41813c(j3);
                    }
                    i = this.f35974P.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.b.d3$k */
    /* compiled from: FlowableReplay */
    static final class C12571k<T> implements Callable<C12567g<T>> {

        /* renamed from: N */
        private final TimeUnit f35979N;

        /* renamed from: O */
        private final C12282j0 f35980O;

        /* renamed from: a */
        private final int f35981a;

        /* renamed from: b */
        private final long f35982b;

        C12571k(int i, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            this.f35981a = i;
            this.f35982b = j;
            this.f35979N = timeUnit;
            this.f35980O = j0Var;
        }

        public C12567g<T> call() {
            C12572l lVar = new C12572l(this.f35981a, this.f35982b, this.f35979N, this.f35980O);
            return lVar;
        }
    }

    /* renamed from: e.a.x0.e.b.d3$l */
    /* compiled from: FlowableReplay */
    static final class C12572l<T> extends C12560a<T> {
        private static final long serialVersionUID = 3457957419649567404L;

        /* renamed from: O */
        final C12282j0 f35983O;

        /* renamed from: P */
        final long f35984P;

        /* renamed from: Q */
        final TimeUnit f35985Q;

        /* renamed from: R */
        final int f35986R;

        C12572l(int i, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            this.f35983O = j0Var;
            this.f35986R = i;
            this.f35984P = j;
            this.f35985Q = timeUnit;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C12566f mo42247a() {
            C12566f fVar;
            long a = this.f35983O.mo41870a(this.f35985Q) - this.f35984P;
            C12566f fVar2 = (C12566f) get();
            Object obj = fVar2.get();
            while (true) {
                C12566f fVar3 = (C12566f) obj;
                fVar = fVar2;
                fVar2 = fVar3;
                if (fVar2 != null) {
                    C12241d dVar = (C12241d) fVar2.f35965a;
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
        public Object mo42254b(Object obj) {
            return new C12241d(obj, this.f35983O.mo41870a(this.f35985Q), this.f35985Q);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Object mo42256c(Object obj) {
            return ((C12241d) obj).mo41887c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo42262i() {
            C12566f fVar;
            long a = this.f35983O.mo41870a(this.f35985Q) - this.f35984P;
            C12566f fVar2 = (C12566f) get();
            C12566f fVar3 = (C12566f) fVar2.get();
            int i = 0;
            while (true) {
                C12566f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                int i2 = this.f35951b;
                if (i2 <= this.f35986R) {
                    if (((C12241d) fVar2.f35965a).mo41884a() > a) {
                        break;
                    }
                    i++;
                    this.f35951b--;
                    fVar3 = (C12566f) fVar2.get();
                } else {
                    i++;
                    this.f35951b = i2 - 1;
                    fVar3 = (C12566f) fVar2.get();
                }
            }
            if (i != 0) {
                mo42255b(fVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42263j() {
            /*
                r10 = this;
                e.a.j0 r0 = r10.f35983O
                java.util.concurrent.TimeUnit r1 = r10.f35985Q
                long r0 = r0.mo41870a(r1)
                long r2 = r10.f35984P
                long r0 = r0 - r2
                java.lang.Object r2 = r10.get()
                e.a.x0.e.b.d3$f r2 = (p195e.p196a.p199x0.p454e.p456b.C12559d3.C12566f) r2
                java.lang.Object r3 = r2.get()
                e.a.x0.e.b.d3$f r3 = (p195e.p196a.p199x0.p454e.p456b.C12559d3.C12566f) r3
                r4 = 0
            L_0x0018:
                r9 = r3
                r3 = r2
                r2 = r9
                if (r2 == 0) goto L_0x003c
                int r5 = r10.f35951b
                r6 = 1
                if (r5 <= r6) goto L_0x003c
                java.lang.Object r5 = r2.f35965a
                e.a.d1.d r5 = (p195e.p196a.p441d1.C12241d) r5
                long r7 = r5.mo41884a()
                int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r5 > 0) goto L_0x003c
                int r4 = r4 + 1
                int r3 = r10.f35951b
                int r3 = r3 - r6
                r10.f35951b = r3
                java.lang.Object r3 = r2.get()
                e.a.x0.e.b.d3$f r3 = (p195e.p196a.p199x0.p454e.p456b.C12559d3.C12566f) r3
                goto L_0x0018
            L_0x003c:
                if (r4 == 0) goto L_0x0041
                r10.mo42255b(r3)
            L_0x0041:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12559d3.C12572l.mo42263j():void");
        }
    }

    /* renamed from: e.a.x0.e.b.d3$m */
    /* compiled from: FlowableReplay */
    static final class C12573m<T> extends C12560a<T> {
        private static final long serialVersionUID = -5898283885385201806L;

        /* renamed from: O */
        final int f35987O;

        C12573m(int i) {
            this.f35987O = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo42262i() {
            if (this.f35951b > this.f35987O) {
                mo42260g();
            }
        }
    }

    /* renamed from: e.a.x0.e.b.d3$n */
    /* compiled from: FlowableReplay */
    static final class C12574n<T> extends ArrayList<Object> implements C12567g<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* renamed from: a */
        volatile int f35988a;

        C12574n(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo42251a(T t) {
            add(C13761q.m58756i(t));
            this.f35988a++;
        }

        /* renamed from: e */
        public void mo42258e() {
            add(C13761q.m58750d());
            this.f35988a++;
        }

        /* renamed from: a */
        public void mo42252a(Throwable th) {
            add(C13761q.m58743a(th));
            this.f35988a++;
        }

        /* JADX INFO: used method not loaded: e.a.x0.j.q.a(java.lang.Object, i.e.c):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
            if (r15.mo41878d() == false) goto L_0x0016;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
            r1 = r14.f35988a;
            r2 = (java.lang.Integer) r15.mo42266a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
            if (r2 == null) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
            r2 = r2.intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
            r2 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
            r4 = r15.get();
            r8 = r4;
            r10 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
            if (r8 == 0) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
            if (r2 >= r1) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
            r12 = get(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
            if (p195e.p196a.p199x0.p200j.C13761q.m58745a(r12, (p205i.p211e.C14062c) r0) == false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
            if (r15.mo41878d() == false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0047, code lost:
            r2 = r2 + 1;
            r8 = r8 - 1;
            r10 = r10 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
            p212io.reactivex.exceptions.C14398a.m62357b(r1);
            r15.dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0061, code lost:
            r0.onError(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0064, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0067, code lost:
            if (r10 == 0) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0069, code lost:
            r15.f35955N = java.lang.Integer.valueOf(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0076, code lost:
            if (r4 == Long.MAX_VALUE) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0078, code lost:
            r15.mo42265a(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
            monitor-enter(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x007e, code lost:
            if (r15.f35958Q != false) goto L_0x0084;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0080, code lost:
            r15.f35957P = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0082, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0083, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0084, code lost:
            r15.f35958Q = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0086, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
            r0 = r15.f35960b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42249a(p195e.p196a.p199x0.p454e.p456b.C12559d3.C12563d<T> r15) {
            /*
                r14 = this;
                monitor-enter(r15)
                boolean r0 = r15.f35957P     // Catch:{ all -> 0x008b }
                r1 = 1
                if (r0 == 0) goto L_0x000a
                r15.f35958Q = r1     // Catch:{ all -> 0x008b }
                monitor-exit(r15)     // Catch:{ all -> 0x008b }
                return
            L_0x000a:
                r15.f35957P = r1     // Catch:{ all -> 0x008b }
                monitor-exit(r15)     // Catch:{ all -> 0x008b }
                i.e.c<? super T> r0 = r15.f35960b
            L_0x000f:
                boolean r1 = r15.mo41878d()
                if (r1 == 0) goto L_0x0016
                return
            L_0x0016:
                int r1 = r14.f35988a
                java.lang.Object r2 = r15.mo42266a()
                java.lang.Integer r2 = (java.lang.Integer) r2
                r3 = 0
                if (r2 == 0) goto L_0x0026
                int r2 = r2.intValue()
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                long r4 = r15.get()
                r6 = 0
                r8 = r4
                r10 = r6
            L_0x002f:
                int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r12 == 0) goto L_0x0065
                if (r2 >= r1) goto L_0x0065
                java.lang.Object r12 = r14.get(r2)
                boolean r12 = p195e.p196a.p199x0.p200j.C13761q.m58745a(r12, r0)     // Catch:{ all -> 0x004e }
                if (r12 == 0) goto L_0x0040
                return
            L_0x0040:
                boolean r12 = r15.mo41878d()
                if (r12 == 0) goto L_0x0047
                return
            L_0x0047:
                int r2 = r2 + 1
                r12 = 1
                long r8 = r8 - r12
                long r10 = r10 + r12
                goto L_0x002f
            L_0x004e:
                r1 = move-exception
                p212io.reactivex.exceptions.C14398a.m62357b(r1)
                r15.dispose()
                boolean r15 = p195e.p196a.p199x0.p200j.C13761q.m58754g(r12)
                if (r15 != 0) goto L_0x0064
                boolean r15 = p195e.p196a.p199x0.p200j.C13761q.m58752e(r12)
                if (r15 != 0) goto L_0x0064
                r0.onError(r1)
            L_0x0064:
                return
            L_0x0065:
                int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r1 == 0) goto L_0x007b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r15.f35955N = r1
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r6 == 0) goto L_0x007b
                r15.mo42265a(r10)
            L_0x007b:
                monitor-enter(r15)
                boolean r1 = r15.f35958Q     // Catch:{ all -> 0x0088 }
                if (r1 != 0) goto L_0x0084
                r15.f35957P = r3     // Catch:{ all -> 0x0088 }
                monitor-exit(r15)     // Catch:{ all -> 0x0088 }
                return
            L_0x0084:
                r15.f35958Q = r3     // Catch:{ all -> 0x0088 }
                monitor-exit(r15)     // Catch:{ all -> 0x0088 }
                goto L_0x000f
            L_0x0088:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x0088 }
                throw r0
            L_0x008b:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x008b }
                goto L_0x008f
            L_0x008e:
                throw r0
            L_0x008f:
                goto L_0x008e
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12559d3.C12574n.mo42249a(e.a.x0.e.b.d3$d):void");
        }
    }

    private C12559d3(C6007b<T> bVar, C5929l<T> lVar, AtomicReference<C12570j<T>> atomicReference, Callable<? extends C12567g<T>> callable) {
        this.f35947P = bVar;
        this.f35948b = lVar;
        this.f35945N = atomicReference;
        this.f35946O = callable;
    }

    /* renamed from: a */
    public static <U, R> C5929l<R> m55861a(Callable<? extends C12322a<U>> callable, C12339o<? super C5929l<U>, ? extends C6007b<R>> oVar) {
        return new C12564e(callable, oVar);
    }

    /* renamed from: d */
    public boolean mo41878d() {
        C12314c cVar = (C12314c) this.f35945N.get();
        return cVar == null || cVar.mo41878d();
    }

    public void dispose() {
        this.f35945N.lazySet(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35947P.mo24397a(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42084l(p195e.p196a.p449w0.C12331g<? super p195e.p196a.p447u0.C12314c> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.d3$j<T>> r0 = r4.f35945N
            java.lang.Object r0 = r0.get()
            e.a.x0.e.b.d3$j r0 = (p195e.p196a.p199x0.p454e.p456b.C12559d3.C12570j) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.mo41878d()
            if (r1 == 0) goto L_0x0027
        L_0x0010:
            java.util.concurrent.Callable<? extends e.a.x0.e.b.d3$g<T>> r1 = r4.f35946O     // Catch:{ all -> 0x0057 }
            java.lang.Object r1 = r1.call()     // Catch:{ all -> 0x0057 }
            e.a.x0.e.b.d3$g r1 = (p195e.p196a.p199x0.p454e.p456b.C12559d3.C12567g) r1     // Catch:{ all -> 0x0057 }
            e.a.x0.e.b.d3$j r2 = new e.a.x0.e.b.d3$j
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.d3$j<T>> r1 = r4.f35945N
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 != 0) goto L_0x0026
            goto L_0x0000
        L_0x0026:
            r0 = r2
        L_0x0027:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f35973O
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x003b
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f35973O
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x003b
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            r5.mo33410c(r0)     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0046
            e.a.l<T> r5 = r4.f35948b
            r5.mo24393a(r0)
        L_0x0046:
            return
        L_0x0047:
            r5 = move-exception
            if (r1 == 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f35973O
            r0.compareAndSet(r2, r3)
        L_0x004f:
            p212io.reactivex.exceptions.C14398a.m62357b(r5)
            java.lang.RuntimeException r5 = p195e.p196a.p199x0.p200j.C13754k.m58724c(r5)
            throw r5
        L_0x0057:
            r5 = move-exception
            p212io.reactivex.exceptions.C14398a.m62357b(r5)
            java.lang.RuntimeException r5 = p195e.p196a.p199x0.p200j.C13754k.m58724c(r5)
            goto L_0x0061
        L_0x0060:
            throw r5
        L_0x0061:
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12559d3.mo42084l(e.a.w0.g):void");
    }

    public C6007b<T> source() {
        return this.f35948b;
    }

    /* renamed from: a */
    public static <T> C12322a<T> m55867a(C12322a<T> aVar, C12282j0 j0Var) {
        return C12205a.m54874a((C12322a<T>) new C12561b<T>(aVar, aVar.mo24316a(j0Var)));
    }

    /* renamed from: a */
    public static <T> C12322a<T> m55862a(C5929l<? extends T> lVar) {
        return m55866a(lVar, f35944Q);
    }

    /* renamed from: a */
    public static <T> C12322a<T> m55863a(C5929l<T> lVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return m55862a(lVar);
        }
        return m55866a(lVar, (Callable<? extends C12567g<T>>) new C12568h<Object>(i));
    }

    /* renamed from: a */
    public static <T> C12322a<T> m55864a(C5929l<T> lVar, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        return m55865a(lVar, j, timeUnit, j0Var, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static <T> C12322a<T> m55865a(C5929l<T> lVar, long j, TimeUnit timeUnit, C12282j0 j0Var, int i) {
        C12571k kVar = new C12571k(i, j, timeUnit, j0Var);
        return m55866a(lVar, (Callable<? extends C12567g<T>>) kVar);
    }

    /* renamed from: a */
    static <T> C12322a<T> m55866a(C5929l<T> lVar, Callable<? extends C12567g<T>> callable) {
        AtomicReference atomicReference = new AtomicReference();
        return C12205a.m54874a((C12322a<T>) new C12559d3<T>(new C12569i(atomicReference, callable), lVar, atomicReference, callable));
    }
}
