package p195e.p196a.p467z0;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p076c.p112d.p134b.p135a.p235c.p246i.C6240c;
import p195e.p196a.C12268f;
import p195e.p196a.C12280i0;
import p195e.p196a.C12292n0;
import p195e.p196a.C12321v;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p452c.C12401j;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;

/* renamed from: e.a.z0.n */
/* compiled from: TestObserver */
public class C13796n<T> extends C13775a<T, C13796n<T>> implements C12280i0<T>, C12314c, C12321v<T>, C12292n0<T>, C12268f {

    /* renamed from: V */
    private final C12280i0<? super T> f39855V;

    /* renamed from: W */
    private final AtomicReference<C12314c> f39856W;

    /* renamed from: X */
    private C12401j<T> f39857X;

    /* renamed from: e.a.z0.n$a */
    /* compiled from: TestObserver */
    enum C13797a implements C12280i0<Object> {
        INSTANCE;

        /* renamed from: a */
        public void mo34123a(C12314c cVar) {
        }

        /* renamed from: a */
        public void mo33453a(Object obj) {
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
        }
    }

    public C13796n() {
        this(C13797a.INSTANCE);
    }

    /* renamed from: C */
    public static <T> C13796n<T> m58892C() {
        return new C13796n<>();
    }

    /* renamed from: a */
    public static <T> C13796n<T> m58893a(C12280i0<? super T> i0Var) {
        return new C13796n<>(i0Var);
    }

    /* renamed from: e */
    static String m58894e(int i) {
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
    public final boolean mo43265A() {
        return this.f39856W.get() != null;
    }

    /* renamed from: B */
    public final boolean mo43266B() {
        return mo41878d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C13796n<T> mo43268c(int i) {
        int i2 = this.f39827S;
        if (i2 == i) {
            return this;
        }
        if (this.f39857X != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fusion mode different. Expected: ");
            sb.append(m58894e(i));
            sb.append(", actual: ");
            sb.append(m58894e(i2));
            throw new AssertionError(sb.toString());
        }
        throw mo43223b("Upstream is not fuseable");
    }

    public final void cancel() {
        dispose();
    }

    /* renamed from: d */
    public final boolean mo41878d() {
        return C12347d.m55463a((C12314c) this.f39856W.get());
    }

    public final void dispose() {
        C12347d.m55465a(this.f39856W);
    }

    public void onComplete() {
        if (!this.f39825Q) {
            this.f39825Q = true;
            if (this.f39856W.get() == null) {
                this.f39822N.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f39824P = Thread.currentThread();
            this.f39823O++;
            this.f39855V.onComplete();
        } finally {
            this.f39830a.countDown();
        }
    }

    public void onError(Throwable th) {
        if (!this.f39825Q) {
            this.f39825Q = true;
            if (this.f39856W.get() == null) {
                this.f39822N.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f39824P = Thread.currentThread();
            if (th == null) {
                this.f39822N.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f39822N.add(th);
            }
            this.f39855V.onError(th);
        } finally {
            this.f39830a.countDown();
        }
    }

    public void onSuccess(T t) {
        mo33453a(t);
        onComplete();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final C13796n<T> mo43271y() {
        if (this.f39857X != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public final C13796n<T> mo43272z() {
        if (this.f39857X == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    public C13796n(C12280i0<? super T> i0Var) {
        this.f39856W = new AtomicReference<>();
        this.f39855V = i0Var;
    }

    /* renamed from: a */
    public void mo34123a(C12314c cVar) {
        this.f39824P = Thread.currentThread();
        if (cVar == null) {
            this.f39822N.add(new NullPointerException("onSubscribe received a null Subscription"));
        } else if (!this.f39856W.compareAndSet(null, cVar)) {
            cVar.dispose();
            if (this.f39856W.get() != C12347d.DISPOSED) {
                List<Throwable> list = this.f39822N;
                StringBuilder sb = new StringBuilder();
                sb.append("onSubscribe received multiple subscriptions: ");
                sb.append(cVar);
                list.add(new IllegalStateException(sb.toString()));
            }
        } else {
            int i = this.f39826R;
            if (i != 0 && (cVar instanceof C12401j)) {
                this.f39857X = (C12401j) cVar;
                int a = this.f39857X.mo41855a(i);
                this.f39827S = a;
                if (a == 1) {
                    this.f39825Q = true;
                    this.f39824P = Thread.currentThread();
                    while (true) {
                        try {
                            Object poll = this.f39857X.poll();
                            if (poll == null) {
                                break;
                            }
                            this.f39831b.add(poll);
                        } catch (Throwable th) {
                            this.f39822N.add(th);
                        }
                    }
                    this.f39823O++;
                    this.f39856W.lazySet(C12347d.DISPOSED);
                    return;
                }
            }
            this.f39855V.mo34123a(cVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final C13796n<T> mo43270d(int i) {
        this.f39826R = i;
        return this;
    }

    /* renamed from: h */
    public final C13796n<T> m58904h() {
        if (this.f39856W.get() != null) {
            throw mo43223b("Subscribed!");
        } else if (this.f39822N.isEmpty()) {
            return this;
        } else {
            throw mo43223b("Not subscribed but errors found");
        }
    }

    /* renamed from: j */
    public final C13796n<T> m58906j() {
        if (this.f39856W.get() != null) {
            return this;
        }
        throw mo43223b("Not subscribed!");
    }

    /* renamed from: a */
    public void mo33453a(T t) {
        if (!this.f39825Q) {
            this.f39825Q = true;
            if (this.f39856W.get() == null) {
                this.f39822N.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f39824P = Thread.currentThread();
        if (this.f39827S == 2) {
            while (true) {
                try {
                    Object poll = this.f39857X.poll();
                    if (poll == null) {
                        break;
                    }
                    this.f39831b.add(poll);
                } catch (Throwable th) {
                    this.f39822N.add(th);
                    this.f39857X.dispose();
                }
            }
            return;
        }
        this.f39831b.add(t);
        if (t == null) {
            this.f39822N.add(new NullPointerException("onNext received a null value"));
        }
        this.f39855V.mo33453a(t);
    }

    /* renamed from: a */
    public final C13796n<T> mo43267a(C12331g<? super C13796n<T>> gVar) {
        try {
            gVar.mo33410c(this);
            return this;
        } catch (Throwable th) {
            throw C13754k.m58724c(th);
        }
    }
}
