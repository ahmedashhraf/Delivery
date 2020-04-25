package kotlin.p220y0.p221a.p222n;

import kotlin.C6096e0;
import kotlin.TypeCastException;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14461m1;
import kotlin.p220y0.p221a.C14884c;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.y0.a.n.a */
/* compiled from: IntrinsicsJvm.kt */
public final class C14904a {
    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final <T> Object m66015a(@C6003d C6080l<? super C14884c<? super T>, ? extends Object> lVar, C14884c<? super T> cVar) {
        if (lVar != null) {
            return ((C6080l) C14461m1.m62528a((Object) lVar, 1)).invoke(cVar);
        }
        throw new TypeCastException("null cannot be cast to non-null type (kotlin.coroutines.experimental.Continuation<T>) -> kotlin.Any?");
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final <R, T> Object m66016a(@C6003d C6084p<? super R, ? super C14884c<? super T>, ? extends Object> pVar, R r, C14884c<? super T> cVar) {
        if (pVar != null) {
            return ((C6084p) C14461m1.m62528a((Object) pVar, 2)).mo24962d(r, cVar);
        }
        throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.experimental.Continuation<T>) -> kotlin.Any?");
    }
}
