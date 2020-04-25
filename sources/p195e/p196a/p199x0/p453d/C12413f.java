package p195e.p196a.p199x0.p453d;

/* renamed from: e.a.x0.d.f */
/* compiled from: BlockingFirstObserver */
public final class C12413f<T> extends C12412e<T> {
    /* renamed from: a */
    public void mo33453a(T t) {
        if (this.f35557a == null) {
            this.f35557a = t;
            this.f35555N.dispose();
            countDown();
        }
    }

    public void onError(Throwable th) {
        if (this.f35557a == null) {
            this.f35558b = th;
        }
        countDown();
    }
}
