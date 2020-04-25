package kotlin.p503d1;

import kotlin.C14737p0;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6085q;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p505f1.C14557l;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0000\u0010\u0005*\u00020\u0001J}\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052Q\b\u0004\u0010\b\u001aK\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tH\b¢\u0006\u0002\u0010\u0011J}\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052Q\b\u0004\u0010\b\u001aK\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00130\tH\b¢\u0006\u0002\u0010\u0011¨\u0006\u0014"}, mo24990d2 = {"Lkotlin/properties/Delegates;", "", "()V", "notNull", "Lkotlin/properties/ReadWriteProperty;", "T", "observable", "initialValue", "onChange", "Lkotlin/Function3;", "Lkotlin/reflect/KProperty;", "Lkotlin/ParameterName;", "name", "property", "oldValue", "newValue", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlin/properties/ReadWriteProperty;", "vetoable", "", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.d1.a */
/* compiled from: Delegates.kt */
public final class C14502a {

    /* renamed from: a */
    public static final C14502a f42654a = new C14502a();

    /* renamed from: kotlin.d1.a$a */
    /* compiled from: Delegates.kt */
    public static final class C14503a extends C14506c<T> {

        /* renamed from: b */
        final /* synthetic */ C6085q f42655b;

        /* renamed from: c */
        final /* synthetic */ Object f42656c;

        public C14503a(C6085q qVar, Object obj, Object obj2) {
            this.f42655b = qVar;
            this.f42656c = obj;
            super(obj2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo45677a(@C6003d C14557l<?> lVar, T t, T t2) {
            C14445h0.m62478f(lVar, "property");
            this.f42655b.mo24963b(lVar, t, t2);
        }
    }

    /* renamed from: kotlin.d1.a$b */
    /* compiled from: Delegates.kt */
    public static final class C14504b extends C14506c<T> {

        /* renamed from: b */
        final /* synthetic */ C6085q f42657b;

        /* renamed from: c */
        final /* synthetic */ Object f42658c;

        public C14504b(C6085q qVar, Object obj, Object obj2) {
            this.f42657b = qVar;
            this.f42658c = obj;
            super(obj2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo45678b(@C6003d C14557l<?> lVar, T t, T t2) {
            C14445h0.m62478f(lVar, "property");
            return ((Boolean) this.f42657b.mo24963b(lVar, t, t2)).booleanValue();
        }
    }

    private C14502a() {
    }

    @C6003d
    /* renamed from: a */
    public final <T> C14508e<Object, T> mo45674a() {
        return new C14505b();
    }

    @C6003d
    /* renamed from: b */
    public final <T> C14508e<Object, T> mo45676b(T t, @C6003d C6085q<? super C14557l<?>, ? super T, ? super T, Boolean> qVar) {
        C14445h0.m62478f(qVar, "onChange");
        return new C14504b(qVar, t, t);
    }

    @C6003d
    /* renamed from: a */
    public final <T> C14508e<Object, T> mo45675a(T t, @C6003d C6085q<? super C14557l<?>, ? super T, ? super T, C14737p0> qVar) {
        C14445h0.m62478f(qVar, "onChange");
        return new C14503a(qVar, t, t);
    }
}
