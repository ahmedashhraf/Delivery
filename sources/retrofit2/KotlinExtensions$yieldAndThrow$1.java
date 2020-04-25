package retrofit2;

import kotlin.C6121u;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 3}, mo24989d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00060\u0002j\u0002`\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@ø\u0001\u0000"}, mo24990d2 = {"yieldAndThrow", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo24991k = 3, mo24992mv = {1, 1, 13})
@DebugMetadata(c = "retrofit2/KotlinExtensions", f = "KotlinExtensions.kt", i = {0}, l = {100, 102}, m = "yieldAndThrow", n = {"$receiver"}, s = {"L$0"})
/* compiled from: KotlinExtensions.kt */
final class KotlinExtensions$yieldAndThrow$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    KotlinExtensions$yieldAndThrow$1(Continuation continuation) {
        super(continuation);
    }

    @C6004e
    public final Object invokeSuspend(@C6003d Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KotlinExtensions.yieldAndThrow(null, this);
    }
}
