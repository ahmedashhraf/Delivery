package p195e.p196a.p199x0.p453d;

/* renamed from: e.a.x0.d.g */
/* compiled from: BlockingLastObserver */
public final class C12414g<T> extends C12412e<T> {
    /* renamed from: a */
    public void mo33453a(T t) {
        this.f35557a = t;
    }

    public void onError(Throwable th) {
        this.f35557a = null;
        this.f35558b = th;
        countDown();
    }
}
