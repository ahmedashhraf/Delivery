package retrofit2;

import androidx.core.app.C0770p;
import kotlin.C6121u;
import kotlin.Result;
import kotlin.Result.Companion;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.p214b1.p216u.C14445h0;
import kotlinx.coroutines.CancellableContinuation;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 3}, mo24989d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J \u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J(\u0010\b\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nH\u0016¨\u0006\u000b"}, mo24990d2 = {"retrofit2/KotlinExtensions$await$4$2", "Lretrofit2/Callback;", "onFailure", "", "call", "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "retrofit"}, mo24991k = 1, mo24992mv = {1, 1, 13})
/* compiled from: KotlinExtensions.kt */
public final class KotlinExtensions$await$4$2 implements Callback<T> {
    final /* synthetic */ CancellableContinuation $continuation;

    KotlinExtensions$await$4$2(CancellableContinuation cancellableContinuation) {
        this.$continuation = cancellableContinuation;
    }

    public void onFailure(@C6003d Call<T> call, @C6003d Throwable th) {
        C14445h0.m62478f(call, C0770p.f3516c0);
        C14445h0.m62478f(th, "t");
        Continuation continuation = this.$continuation;
        Companion companion = Result.Companion;
        continuation.resumeWith(Result.constructor-impl(ResultKt.createFailure(th)));
    }

    public void onResponse(@C6003d Call<T> call, @C6003d Response<T> response) {
        C14445h0.m62478f(call, C0770p.f3516c0);
        C14445h0.m62478f(response, "response");
        if (response.isSuccessful()) {
            Continuation continuation = this.$continuation;
            Object body = response.body();
            Companion companion = Result.Companion;
            continuation.resumeWith(Result.constructor-impl(body));
            return;
        }
        Continuation continuation2 = this.$continuation;
        HttpException httpException = new HttpException(response);
        Companion companion2 = Result.Companion;
        continuation2.resumeWith(Result.constructor-impl(ResultKt.createFailure(httpException)));
    }
}
