package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u0000 \u0013*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0013B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0002R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\b@\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, mo24990d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "final", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "Companion", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.d0 */
/* compiled from: Lazy.kt */
final class C14500d0<T> implements C14730m<T>, Serializable {

    /* renamed from: O */
    private static final AtomicReferenceFieldUpdater<C14500d0<?>, Object> f42649O = AtomicReferenceFieldUpdater.newUpdater(C14500d0.class, Object.class, "b");

    /* renamed from: P */
    public static final C14501a f42650P = new C14501a(null);

    /* renamed from: N */
    private final Object f42651N;

    /* renamed from: a */
    private volatile C6069a<? extends T> f42652a;

    /* renamed from: b */
    private volatile Object f42653b;

    /* renamed from: kotlin.d0$a */
    /* compiled from: Lazy.kt */
    public static final class C14501a {
        private C14501a() {
        }

        public /* synthetic */ C14501a(C14487u uVar) {
            this();
        }
    }

    public C14500d0(@C6003d C6069a<? extends T> aVar) {
        C14445h0.m62478f(aVar, "initializer");
        this.f42652a = aVar;
        C14735o0 o0Var = C14735o0.f42982a;
        this.f42653b = o0Var;
        this.f42651N = o0Var;
    }

    private final Object writeReplace() {
        return new C14723j(getValue());
    }

    /* renamed from: a */
    public boolean mo45671a() {
        return this.f42653b != C14735o0.f42982a;
    }

    public T getValue() {
        T t = this.f42653b;
        if (t != C14735o0.f42982a) {
            return t;
        }
        C6069a<? extends T> aVar = this.f42652a;
        if (aVar != null) {
            T p = aVar.mo24947p();
            if (f42649O.compareAndSet(this, C14735o0.f42982a, p)) {
                this.f42652a = null;
                return p;
            }
        }
        return this.f42653b;
    }

    @C6003d
    public String toString() {
        return mo45671a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
