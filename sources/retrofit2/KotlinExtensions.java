package retrofit2;

import kotlin.C6121u;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p216u.C14445h0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import p053b.p063d.p064b.C2108a;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 3}, mo24989d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003H@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a+\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003H@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u001a\u0010\b\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\tH\b¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\f*\u00060\rj\u0002`\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo24990d2 = {"await", "T", "", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitNullable", "awaitResponse", "Lretrofit2/Response;", "create", "Lretrofit2/Retrofit;", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "yieldAndThrow", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrofit"}, mo24991k = 2, mo24992mv = {1, 1, 13})
@C6055e(name = "KotlinExtensions")
/* compiled from: KotlinExtensions.kt */
public final class KotlinExtensions {
    @C6004e
    public static final <T> Object await(@C6003d Call<T> call, @C6003d Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        CancellableContinuation cancellableContinuation = (CancellableContinuation) cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new C15761x19835f10(call));
        call.enqueue(new KotlinExtensions$await$2$2(cancellableContinuation));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @C6004e
    @C6055e(name = "awaitNullable")
    public static final <T> Object awaitNullable(@C6003d Call<T> call, @C6003d Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        CancellableContinuation cancellableContinuation = (CancellableContinuation) cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new C15762x19835f11(call));
        call.enqueue(new KotlinExtensions$await$4$2(cancellableContinuation));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @C6004e
    public static final <T> Object awaitResponse(@C6003d Call<T> call, @C6003d Continuation<? super Response<T>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        CancellableContinuation cancellableContinuation = (CancellableContinuation) cancellableContinuationImpl;
        cancellableContinuation.invokeOnCancellation(new C15763xc95e9eb1(call));
        call.enqueue(new KotlinExtensions$awaitResponse$2$2(cancellableContinuation));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    private static final <T> T create(@C6003d Retrofit retrofit) {
        C14445h0.m62450a(4, C2108a.f8183X4);
        return retrofit.create(Object.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @p205i.p209c.p210a.C6004e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object yieldAndThrow(@p205i.p209c.p210a.C6003d java.lang.Exception r4, @p205i.p209c.p210a.C6003d kotlin.coroutines.Continuation<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$yieldAndThrow$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            retrofit2.KotlinExtensions$yieldAndThrow$1 r0 = (retrofit2.KotlinExtensions$yieldAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            retrofit2.KotlinExtensions$yieldAndThrow$1 r0 = new retrofit2.KotlinExtensions$yieldAndThrow$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            boolean r0 = r5 instanceof kotlin.Result.Failure
            if (r0 == 0) goto L_0x0049
            kotlin.Result$Failure r5 = (kotlin.Result.Failure) r5
            java.lang.Throwable r4 = r5.exception
            throw r4
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            boolean r2 = r5 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x004a
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.YieldKt.yield(r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            throw r4
        L_0x004a:
            kotlin.Result$Failure r5 = (kotlin.Result.Failure) r5
            java.lang.Throwable r4 = r5.exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.yieldAndThrow(java.lang.Exception, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
