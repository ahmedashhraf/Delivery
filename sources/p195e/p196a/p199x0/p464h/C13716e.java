package p195e.p196a.p199x0.p464h;

/* renamed from: e.a.x0.h.e */
/* compiled from: BlockingLastSubscriber */
public final class C13716e<T> extends C13714c<T> {
    /* renamed from: a */
    public void mo41789a(T t) {
        this.f39681a = t;
    }

    public void onError(Throwable th) {
        this.f39681a = null;
        this.f39682b = th;
        countDown();
    }
}
