package kotlin.p220y0.p221a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C6050b0;
import kotlin.C6121u;
import kotlin.p214b1.C6058h;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p220y0.p221a.p222n.C6138b;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6050b0
@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0001\u0018\u0000 \u0015*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u0015\u0016B\u0015\b\u0011\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0004B\u001f\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0001J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo24990d2 = {"Lkotlin/coroutines/experimental/SafeContinuation;", "T", "Lkotlin/coroutines/experimental/Continuation;", "delegate", "(Lkotlin/coroutines/experimental/Continuation;)V", "initialResult", "", "(Lkotlin/coroutines/experimental/Continuation;Ljava/lang/Object;)V", "context", "Lkotlin/coroutines/experimental/CoroutineContext;", "getContext", "()Lkotlin/coroutines/experimental/CoroutineContext;", "result", "getResult", "resume", "", "value", "(Ljava/lang/Object;)V", "resumeWithException", "exception", "", "Companion", "Fail", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.y0.a.i */
/* compiled from: SafeContinuationJvm.kt */
public final class C14896i<T> implements C14884c<T> {

    /* renamed from: N */
    private static final Object f43135N = new Object();

    /* renamed from: O */
    private static final Object f43136O = new Object();

    /* renamed from: P */
    private static final AtomicReferenceFieldUpdater<C14896i<?>, Object> f43137P = AtomicReferenceFieldUpdater.newUpdater(C14896i.class, Object.class, "a");

    /* renamed from: Q */
    public static final C14897a f43138Q = new C14897a(null);

    /* renamed from: a */
    private volatile Object f43139a;

    /* renamed from: b */
    private final C14884c<T> f43140b;

    /* renamed from: kotlin.y0.a.i$a */
    /* compiled from: SafeContinuationJvm.kt */
    public static final class C14897a {
        private C14897a() {
        }

        @C6058h
        /* renamed from: a */
        private static /* synthetic */ void m65995a() {
        }

        public /* synthetic */ C14897a(C14487u uVar) {
            this();
        }
    }

    /* renamed from: kotlin.y0.a.i$b */
    /* compiled from: SafeContinuationJvm.kt */
    private static final class C14898b {
        @C6003d

        /* renamed from: a */
        private final Throwable f43141a;

        public C14898b(@C6003d Throwable th) {
            C14445h0.m62478f(th, "exception");
            this.f43141a = th;
        }

        @C6003d
        /* renamed from: a */
        public final Throwable mo46353a() {
            return this.f43141a;
        }
    }

    public C14896i(@C6003d C14884c<? super T> cVar, @C6004e Object obj) {
        C14445h0.m62478f(cVar, "delegate");
        this.f43140b = cVar;
        this.f43139a = obj;
    }

    /* renamed from: a */
    public void mo25003a(@C6003d Throwable th) {
        C14445h0.m62478f(th, "exception");
        while (true) {
            Object obj = this.f43139a;
            Object obj2 = f43135N;
            if (obj == obj2) {
                if (f43137P.compareAndSet(this, obj2, new C14898b(th))) {
                    return;
                }
            } else if (obj != C6138b.m28215c()) {
                throw new IllegalStateException("Already resumed");
            } else if (f43137P.compareAndSet(this, C6138b.m28215c(), f43136O)) {
                this.f43140b.mo25003a(th);
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo25005b(T t) {
        while (true) {
            Object obj = this.f43139a;
            Object obj2 = f43135N;
            if (obj == obj2) {
                if (f43137P.compareAndSet(this, obj2, t)) {
                    return;
                }
            } else if (obj != C6138b.m28215c()) {
                throw new IllegalStateException("Already resumed");
            } else if (f43137P.compareAndSet(this, C6138b.m28215c(), f43136O)) {
                this.f43140b.mo25005b(t);
                return;
            }
        }
    }

    @C6003d
    /* renamed from: c */
    public C14888e mo25006c() {
        return this.f43140b.mo25006c();
    }

    @C6050b0
    public C14896i(@C6003d C14884c<? super T> cVar) {
        C14445h0.m62478f(cVar, "delegate");
        this(cVar, f43135N);
    }

    @C6004e
    @C6050b0
    /* renamed from: a */
    public final Object mo46352a() {
        Object obj = this.f43139a;
        Object obj2 = f43135N;
        if (obj == obj2) {
            if (f43137P.compareAndSet(this, obj2, C6138b.m28215c())) {
                return C6138b.m28215c();
            }
            obj = this.f43139a;
        }
        if (obj == f43136O) {
            return C6138b.m28215c();
        }
        if (!(obj instanceof C14898b)) {
            return obj;
        }
        throw ((C14898b) obj).mo46353a();
    }
}
