package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12204b;
import p195e.p196a.C12291n;
import p195e.p196a.C12293o;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p450a.C12345b;
import p195e.p196a.p199x0.p450a.C12350g;
import p195e.p196a.p199x0.p452c.C12405n;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12330f;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.f0 */
/* compiled from: FlowableCreate */
public final class C12592f0<T> extends C5929l<T> {

    /* renamed from: N */
    final C12204b f36049N;

    /* renamed from: b */
    final C12293o<T> f36050b;

    /* renamed from: e.a.x0.e.b.f0$a */
    /* compiled from: FlowableCreate */
    static /* synthetic */ class C12593a {

        /* renamed from: a */
        static final /* synthetic */ int[] f36051a = new int[C12204b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                e.a.b[] r0 = p195e.p196a.C12204b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36051a = r0
                int[] r0 = f36051a     // Catch:{ NoSuchFieldError -> 0x0014 }
                e.a.b r1 = p195e.p196a.C12204b.MISSING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f36051a     // Catch:{ NoSuchFieldError -> 0x001f }
                e.a.b r1 = p195e.p196a.C12204b.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f36051a     // Catch:{ NoSuchFieldError -> 0x002a }
                e.a.b r1 = p195e.p196a.C12204b.DROP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f36051a     // Catch:{ NoSuchFieldError -> 0x0035 }
                e.a.b r1 = p195e.p196a.C12204b.LATEST     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12592f0.C12593a.<clinit>():void");
        }
    }

    /* renamed from: e.a.x0.e.b.f0$b */
    /* compiled from: FlowableCreate */
    static abstract class C12594b<T> extends AtomicLong implements C12291n<T>, C14063d {
        private static final long serialVersionUID = 7326289992464377023L;

        /* renamed from: a */
        final C14062c<? super T> f36052a;

        /* renamed from: b */
        final C12350g f36053b = new C12350g();

        C12594b(C14062c<? super T> cVar) {
            this.f36052a = cVar;
        }

        /* renamed from: a */
        public boolean mo42044a(Throwable th) {
            return mo42292b(th);
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo42292b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.f36052a.onError(th);
                this.f36053b.dispose();
                return true;
            } catch (Throwable th2) {
                this.f36053b.dispose();
                throw th2;
            }
        }

        /* renamed from: c */
        public final void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a((AtomicLong) this, j);
                mo42294e();
            }
        }

        public final void cancel() {
            this.f36053b.dispose();
            mo42295f();
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo42293d() {
            if (!isCancelled()) {
                try {
                    this.f36052a.onComplete();
                } finally {
                    this.f36053b.dispose();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42294e() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42295f() {
        }

        public final boolean isCancelled() {
            return this.f36053b.mo41878d();
        }

        public void onComplete() {
            mo42293d();
        }

        public final void onError(Throwable th) {
            if (!mo42044a(th)) {
                C12205a.m54894b(th);
            }
        }

        public final C12291n<T> serialize() {
            return new C12601i(this);
        }

        /* renamed from: a */
        public final void mo42042a(C12314c cVar) {
            this.f36053b.mo42110b(cVar);
        }

        /* renamed from: a */
        public final void mo42043a(C12330f fVar) {
            mo42042a((C12314c) new C12345b(fVar));
        }

        /* renamed from: a */
        public final long mo42041a() {
            return get();
        }
    }

    /* renamed from: e.a.x0.e.b.f0$c */
    /* compiled from: FlowableCreate */
    static final class C12595c<T> extends C12594b<T> {
        private static final long serialVersionUID = 2427151001689639875L;

        /* renamed from: N */
        final C13663c<T> f36054N;

        /* renamed from: O */
        Throwable f36055O;

        /* renamed from: P */
        volatile boolean f36056P;

        /* renamed from: Q */
        final AtomicInteger f36057Q = new AtomicInteger();

        C12595c(C14062c<? super T> cVar, int i) {
            super(cVar);
            this.f36054N = new C13663c<>(i);
        }

        /* renamed from: a */
        public void mo42030a(T t) {
            if (!this.f36056P && !isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f36054N.offer(t);
                    mo42296g();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42294e() {
            mo42296g();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42295f() {
            if (this.f36057Q.getAndIncrement() == 0) {
                this.f36054N.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42296g() {
            if (this.f36057Q.getAndIncrement() == 0) {
                C14062c<? super T> cVar = this.f36052a;
                C13663c<T> cVar2 = this.f36054N;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (isCancelled()) {
                            cVar2.clear();
                            return;
                        }
                        boolean z = this.f36056P;
                        Object poll = cVar2.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            Throwable th = this.f36055O;
                            if (th != null) {
                                mo42292b(th);
                            } else {
                                mo42293d();
                            }
                            return;
                        } else if (z2) {
                            break;
                        } else {
                            cVar.mo41789a(poll);
                            j2++;
                        }
                    }
                    if (j2 == j) {
                        if (isCancelled()) {
                            cVar2.clear();
                            return;
                        }
                        boolean z3 = this.f36056P;
                        boolean isEmpty = cVar2.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.f36055O;
                            if (th2 != null) {
                                mo42292b(th2);
                            } else {
                                mo42293d();
                            }
                            return;
                        }
                    }
                    if (j2 != 0) {
                        C13747d.m58699c(this, j2);
                    }
                    i = this.f36057Q.addAndGet(-i);
                } while (i != 0);
            }
        }

        public void onComplete() {
            this.f36056P = true;
            mo42296g();
        }

        /* renamed from: a */
        public boolean mo42044a(Throwable th) {
            if (this.f36056P || isCancelled()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f36055O = th;
            this.f36056P = true;
            mo42296g();
            return true;
        }
    }

    /* renamed from: e.a.x0.e.b.f0$d */
    /* compiled from: FlowableCreate */
    static final class C12596d<T> extends C12600h<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        C12596d(C14062c<? super T> cVar) {
            super(cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42297g() {
        }
    }

    /* renamed from: e.a.x0.e.b.f0$e */
    /* compiled from: FlowableCreate */
    static final class C12597e<T> extends C12600h<T> {
        private static final long serialVersionUID = 338953216916120960L;

        C12597e(C14062c<? super T> cVar) {
            super(cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42297g() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    /* renamed from: e.a.x0.e.b.f0$f */
    /* compiled from: FlowableCreate */
    static final class C12598f<T> extends C12594b<T> {
        private static final long serialVersionUID = 4023437720691792495L;

        /* renamed from: N */
        final AtomicReference<T> f36058N = new AtomicReference<>();

        /* renamed from: O */
        Throwable f36059O;

        /* renamed from: P */
        volatile boolean f36060P;

        /* renamed from: Q */
        final AtomicInteger f36061Q = new AtomicInteger();

        C12598f(C14062c<? super T> cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public void mo42030a(T t) {
            if (!this.f36060P && !isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f36058N.set(t);
                    mo42298g();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42294e() {
            mo42298g();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo42295f() {
            if (this.f36061Q.getAndIncrement() == 0) {
                this.f36058N.lazySet(null);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo42298g() {
            boolean z;
            if (this.f36061Q.getAndIncrement() == 0) {
                C14062c<? super T> cVar = this.f36052a;
                AtomicReference<T> atomicReference = this.f36058N;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 == j) {
                            break;
                        } else if (isCancelled()) {
                            atomicReference.lazySet(null);
                            return;
                        } else {
                            boolean z2 = this.f36060P;
                            Object andSet = atomicReference.getAndSet(null);
                            boolean z3 = andSet == null;
                            if (z2 && z3) {
                                Throwable th = this.f36059O;
                                if (th != null) {
                                    mo42292b(th);
                                } else {
                                    mo42293d();
                                }
                                return;
                            } else if (z3) {
                                break;
                            } else {
                                cVar.mo41789a(andSet);
                                j2++;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (isCancelled()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z4 = this.f36060P;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.f36059O;
                            if (th2 != null) {
                                mo42292b(th2);
                            } else {
                                mo42293d();
                            }
                            return;
                        }
                    }
                    if (j2 != 0) {
                        C13747d.m58699c(this, j2);
                    }
                    i = this.f36061Q.addAndGet(-i);
                } while (i != 0);
            }
        }

        public void onComplete() {
            this.f36060P = true;
            mo42298g();
        }

        /* renamed from: a */
        public boolean mo42044a(Throwable th) {
            if (this.f36060P || isCancelled()) {
                return false;
            }
            if (th == null) {
                onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f36059O = th;
            this.f36060P = true;
            mo42298g();
            return true;
        }
    }

    /* renamed from: e.a.x0.e.b.f0$g */
    /* compiled from: FlowableCreate */
    static final class C12599g<T> extends C12594b<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        C12599g(C14062c<? super T> cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public void mo42030a(T t) {
            long j;
            if (!isCancelled()) {
                if (t != null) {
                    this.f36052a.mo41789a(t);
                    do {
                        j = get();
                        if (j == 0) {
                            break;
                        }
                    } while (!compareAndSet(j, j - 1));
                    return;
                }
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    /* renamed from: e.a.x0.e.b.f0$h */
    /* compiled from: FlowableCreate */
    static abstract class C12600h<T> extends C12594b<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        C12600h(C14062c<? super T> cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public final void mo42030a(T t) {
            if (!isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                if (get() != 0) {
                    this.f36052a.mo41789a(t);
                    C13747d.m58699c(this, 1);
                } else {
                    mo42297g();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public abstract void mo42297g();
    }

    /* renamed from: e.a.x0.e.b.f0$i */
    /* compiled from: FlowableCreate */
    static final class C12601i<T> extends AtomicInteger implements C12291n<T> {
        private static final long serialVersionUID = 4883307006032401862L;

        /* renamed from: N */
        final C12405n<T> f36062N = new C13663c(16);

        /* renamed from: O */
        volatile boolean f36063O;

        /* renamed from: a */
        final C12594b<T> f36064a;

        /* renamed from: b */
        final C13746c f36065b = new C13746c();

        C12601i(C12594b<T> bVar) {
            this.f36064a = bVar;
        }

        /* renamed from: a */
        public void mo42030a(T t) {
            if (!this.f36064a.isCancelled() && !this.f36063O) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    C12405n<T> nVar = this.f36062N;
                    synchronized (nVar) {
                        nVar.offer(t);
                    }
                    if (getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    this.f36064a.mo42030a(t);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                mo42300e();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42299d() {
            if (getAndIncrement() == 0) {
                mo42300e();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42300e() {
            C12594b<T> bVar = this.f36064a;
            C12405n<T> nVar = this.f36062N;
            C13746c cVar = this.f36065b;
            int i = 1;
            while (!bVar.isCancelled()) {
                if (cVar.get() != null) {
                    nVar.clear();
                    bVar.onError(cVar.mo43143d());
                    return;
                }
                boolean z = this.f36063O;
                Object poll = nVar.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    bVar.onComplete();
                    return;
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    bVar.mo42030a(poll);
                }
            }
            nVar.clear();
        }

        public boolean isCancelled() {
            return this.f36064a.isCancelled();
        }

        public void onComplete() {
            if (!this.f36064a.isCancelled() && !this.f36063O) {
                this.f36063O = true;
                mo42299d();
            }
        }

        public void onError(Throwable th) {
            if (!mo42044a(th)) {
                C12205a.m54894b(th);
            }
        }

        public C12291n<T> serialize() {
            return this;
        }

        /* renamed from: a */
        public boolean mo42044a(Throwable th) {
            if (!this.f36064a.isCancelled() && !this.f36063O) {
                if (th == null) {
                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.f36065b.mo43142a(th)) {
                    this.f36063O = true;
                    mo42299d();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public void mo42042a(C12314c cVar) {
            this.f36064a.mo42042a(cVar);
        }

        /* renamed from: a */
        public void mo42043a(C12330f fVar) {
            this.f36064a.mo42043a(fVar);
        }

        /* renamed from: a */
        public long mo42041a() {
            return this.f36064a.mo42041a();
        }
    }

    public C12592f0(C12293o<T> oVar, C12204b bVar) {
        this.f36050b = oVar;
        this.f36049N = bVar;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12594b bVar;
        int i = C12593a.f36051a[this.f36049N.ordinal()];
        if (i == 1) {
            bVar = new C12599g(cVar);
        } else if (i == 2) {
            bVar = new C12597e(cVar);
        } else if (i == 3) {
            bVar = new C12596d(cVar);
        } else if (i != 4) {
            bVar = new C12595c(cVar, C5929l.m26793R());
        } else {
            bVar = new C12598f(cVar);
        }
        cVar.mo41788a((C14063d) bVar);
        try {
            this.f36050b.mo42047a(bVar);
        } catch (Throwable th) {
            C14398a.m62357b(th);
            bVar.onError(th);
        }
    }
}
