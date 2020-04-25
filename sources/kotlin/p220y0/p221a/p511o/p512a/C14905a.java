package kotlin.p220y0.p221a.p511o.p512a;

import kotlin.C14737p0;
import kotlin.TypeCastException;
import kotlin.p214b1.C6053c;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import kotlin.p220y0.p221a.C14884c;
import kotlin.p220y0.p221a.C14888e;
import kotlin.p220y0.p221a.p222n.C6138b;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.y0.a.o.a.a */
/* compiled from: CoroutineImpl.kt */
public abstract class C14905a extends C14448i0 implements C14884c<Object> {

    /* renamed from: N */
    private C14884c<Object> f43153N;
    @C6053c
    @C6004e

    /* renamed from: O */
    protected C14884c<Object> f43154O;
    @C6053c

    /* renamed from: a */
    protected int f43155a;

    /* renamed from: b */
    private final C14888e f43156b;

    public C14905a(int i, @C6004e C14884c<Object> cVar) {
        super(i);
        this.f43154O = cVar;
        this.f43155a = this.f43154O != null ? 0 : -1;
        C14884c<Object> cVar2 = this.f43154O;
        this.f43156b = cVar2 != null ? cVar2.mo25006c() : null;
    }

    /* access modifiers changed from: protected */
    @C6004e
    /* renamed from: a */
    public abstract Object mo45823a(@C6004e Object obj, @C6004e Throwable th);

    @C6003d
    /* renamed from: a */
    public final C14884c<Object> mo46364a() {
        if (this.f43153N == null) {
            C14888e eVar = this.f43156b;
            if (eVar == null) {
                C14445h0.m62474e();
            }
            this.f43153N = C14906b.m66025a(eVar, this);
        }
        C14884c<Object> cVar = this.f43153N;
        if (cVar == null) {
            C14445h0.m62474e();
        }
        return cVar;
    }

    /* renamed from: b */
    public void mo25005b(@C6004e Object obj) {
        C14884c<Object> cVar = this.f43154O;
        if (cVar == null) {
            C14445h0.m62474e();
        }
        try {
            Object a = mo45823a(obj, (Throwable) null);
            if (a == C6138b.m28215c()) {
                return;
            }
            if (cVar != null) {
                cVar.mo25005b(a);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
        } catch (Throwable th) {
            cVar.mo25003a(th);
        }
    }

    @C6003d
    /* renamed from: c */
    public C14888e mo25006c() {
        C14888e eVar = this.f43156b;
        if (eVar == null) {
            C14445h0.m62474e();
        }
        return eVar;
    }

    /* renamed from: a */
    public void mo25003a(@C6003d Throwable th) {
        C14445h0.m62478f(th, "exception");
        C14884c<Object> cVar = this.f43154O;
        if (cVar == null) {
            C14445h0.m62474e();
        }
        try {
            Object a = mo45823a((Object) null, th);
            if (a == C6138b.m28215c()) {
                return;
            }
            if (cVar != null) {
                cVar.mo25005b(a);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
        } catch (Throwable th2) {
            cVar.mo25003a(th2);
        }
    }

    @C6003d
    /* renamed from: a */
    public C14884c<C14737p0> mo46365a(@C6003d C14884c<?> cVar) {
        C14445h0.m62478f(cVar, "completion");
        throw new IllegalStateException("create(Continuation) has not been overridden");
    }

    @C6003d
    /* renamed from: a */
    public C14884c<C14737p0> mo45824a(@C6004e Object obj, @C6003d C14884c<?> cVar) {
        C14445h0.m62478f(cVar, "completion");
        throw new IllegalStateException("create(Any?;Continuation) has not been overridden");
    }
}
