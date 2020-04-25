package retrofit2;

import kotlin.C14737p0;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14448i0;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 3}, mo24989d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo24990d2 = {"<anonymous>", "", "T", "", "it", "", "invoke", "retrofit2/KotlinExtensions$awaitResponse$2$1"}, mo24991k = 3, mo24992mv = {1, 1, 13})
/* renamed from: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1 */
/* compiled from: KotlinExtensions.kt */
final class C15763xc95e9eb1 extends C14448i0 implements C6080l<Throwable, C14737p0> {
    final /* synthetic */ Call $this_awaitResponse$inlined;

    C15763xc95e9eb1(Call call) {
        this.$this_awaitResponse$inlined = call;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C14737p0.f42983a;
    }

    public final void invoke(@C6004e Throwable th) {
        this.$this_awaitResponse$inlined.cancel();
    }
}
