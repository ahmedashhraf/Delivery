package p195e.p196a;

import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p198t0.C5937f;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12330f;

/* renamed from: e.a.u */
/* compiled from: MaybeEmitter */
public interface C12311u<T> {
    /* renamed from: a */
    void mo42058a(@C5938g C12314c cVar);

    /* renamed from: a */
    void mo42059a(@C5938g C12330f fVar);

    @C5936e
    /* renamed from: a */
    boolean mo42060a(@C5937f Throwable th);

    /* renamed from: d */
    boolean mo42061d();

    void onComplete();

    void onError(@C5937f Throwable th);

    void onSuccess(@C5937f T t);
}
