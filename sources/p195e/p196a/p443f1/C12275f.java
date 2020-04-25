package p195e.p196a.p443f1;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p076c.p112d.p134b.p135a.p235c.p246i.C6240c;
import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p467z0.C13775a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.f1.f */
/* compiled from: TestSubscriber */
public class C12275f<T> extends C13775a<T, C12275f<T>> implements C12297q<T>, C14063d, C12314c {

    /* renamed from: V */
    private final C14062c<? super T> f35463V;

    /* renamed from: W */
    private volatile boolean f35464W;

    /* renamed from: X */
    private final AtomicReference<C14063d> f35465X;

    /* renamed from: Y */
    private final AtomicLong f35466Y;

    /* renamed from: Z */
    private C12403l<T> f35467Z;

    /* renamed from: e.a.f1.f$a */
    /* compiled from: TestSubscriber */
    enum C12276a implements C12297q<Object> {
        INSTANCE;

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
        }

        /* renamed from: a */
        public void mo41789a(Object obj) {
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
        }
    }

    public C12275f() {
        this(C12276a.INSTANCE, Long.MAX_VALUE);
    }

    /* renamed from: D */
    public static <T> C12275f<T> m55311D() {
        return new C12275f<>();
    }

    /* renamed from: a */
    public static <T> C12275f<T> m55312a(C14062c<? super T> cVar) {
        return new C12275f<>(cVar);
    }

    /* renamed from: b */
    public static <T> C12275f<T> m55313b(long j) {
        return new C12275f<>(j);
    }

    /* renamed from: e */
    static String m55314e(int i) {
        if (i == 0) {
            return "NONE";
        }
        if (i == 1) {
            return C6240c.f17557a;
        }
        if (i == 2) {
            return "ASYNC";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: A */
    public final boolean mo42005A() {
        return this.f35465X.get() != null;
    }

    /* renamed from: B */
    public final boolean mo42006B() {
        return this.f35464W;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo42007C() {
    }

    /* renamed from: c */
    public final void mo41813c(long j) {
        C13742j.m58671a(this.f35465X, this.f35466Y, j);
    }

    public final void cancel() {
        if (!this.f35464W) {
            this.f35464W = true;
            C13742j.m58674a(this.f35465X);
        }
    }

    /* renamed from: d */
    public final boolean mo41878d() {
        return this.f35464W;
    }

    public final void dispose() {
        cancel();
    }

    public void onComplete() {
        if (!this.f39825Q) {
            this.f39825Q = true;
            if (this.f35465X.get() == null) {
                this.f39822N.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f39824P = Thread.currentThread();
            this.f39823O++;
            this.f35463V.onComplete();
        } finally {
            this.f39830a.countDown();
        }
    }

    public void onError(Throwable th) {
        if (!this.f39825Q) {
            this.f39825Q = true;
            if (this.f35465X.get() == null) {
                this.f39822N.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f39824P = Thread.currentThread();
            this.f39822N.add(th);
            if (th == null) {
                this.f39822N.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.f35463V.onError(th);
        } finally {
            this.f39830a.countDown();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final C12275f<T> mo42014y() {
        if (this.f35467Z != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final C12275f<T> mo42015z() {
        if (this.f35467Z == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    public C12275f(long j) {
        this(C12276a.INSTANCE, j);
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        this.f39824P = Thread.currentThread();
        if (dVar == null) {
            this.f39822N.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (!this.f35465X.compareAndSet(null, dVar)) {
            dVar.cancel();
            if (this.f35465X.get() != C13742j.CANCELLED) {
                List<Throwable> list = this.f39822N;
                StringBuilder sb = new StringBuilder();
                sb.append("onSubscribe received multiple subscriptions: ");
                sb.append(dVar);
                list.add(new IllegalStateException(sb.toString()));
            }
        } else {
            int i = this.f39826R;
            if (i != 0 && (dVar instanceof C12403l)) {
                this.f35467Z = (C12403l) dVar;
                int a = this.f35467Z.mo41855a(i);
                this.f39827S = a;
                if (a == 1) {
                    this.f39825Q = true;
                    this.f39824P = Thread.currentThread();
                    while (true) {
                        try {
                            Object poll = this.f35467Z.poll();
                            if (poll == null) {
                                break;
                            }
                            this.f39831b.add(poll);
                        } catch (Throwable th) {
                            this.f39822N.add(th);
                        }
                    }
                    this.f39823O++;
                    return;
                }
            }
            this.f35463V.mo41788a(dVar);
            long andSet = this.f35466Y.getAndSet(0);
            if (andSet != 0) {
                dVar.mo41813c(andSet);
            }
            mo42007C();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C12275f<T> mo42010c(int i) {
        int i2 = this.f39827S;
        if (i2 == i) {
            return this;
        }
        if (this.f35467Z != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fusion mode different. Expected: ");
            sb.append(m55314e(i));
            sb.append(", actual: ");
            sb.append(m55314e(i2));
            throw new AssertionError(sb.toString());
        }
        throw mo43223b("Upstream is not fuseable");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final C12275f<T> mo42011d(int i) {
        this.f39826R = i;
        return this;
    }

    /* renamed from: h */
    public final C12275f<T> m55327h() {
        if (this.f35465X.get() != null) {
            throw mo43223b("Subscribed!");
        } else if (this.f39822N.isEmpty()) {
            return this;
        } else {
            throw mo43223b("Not subscribed but errors found");
        }
    }

    /* renamed from: j */
    public final C12275f<T> m55329j() {
        if (this.f35465X.get() != null) {
            return this;
        }
        throw mo43223b("Not subscribed!");
    }

    public C12275f(C14062c<? super T> cVar) {
        this(cVar, Long.MAX_VALUE);
    }

    public C12275f(C14062c<? super T> cVar, long j) {
        if (j >= 0) {
            this.f35463V = cVar;
            this.f35465X = new AtomicReference<>();
            this.f35466Y = new AtomicLong(j);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        if (!this.f39825Q) {
            this.f39825Q = true;
            if (this.f35465X.get() == null) {
                this.f39822N.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f39824P = Thread.currentThread();
        if (this.f39827S == 2) {
            while (true) {
                try {
                    Object poll = this.f35467Z.poll();
                    if (poll == null) {
                        break;
                    }
                    this.f39831b.add(poll);
                } catch (Throwable th) {
                    this.f39822N.add(th);
                    this.f35467Z.cancel();
                }
            }
            return;
        }
        this.f39831b.add(t);
        if (t == null) {
            this.f39822N.add(new NullPointerException("onNext received a null value"));
        }
        this.f35463V.mo41789a(t);
    }

    /* renamed from: a */
    public final C12275f<T> mo42009a(C12331g<? super C12275f<T>> gVar) {
        try {
            gVar.mo33410c(this);
            return this;
        } catch (Throwable th) {
            throw C13754k.m58724c(th);
        }
    }

    /* renamed from: a */
    public final C12275f<T> mo42008a(long j) {
        mo41813c(j);
        return this;
    }
}
