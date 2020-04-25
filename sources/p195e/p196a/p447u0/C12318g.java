package p195e.p196a.p447u0;

import p195e.p196a.p198t0.C5937f;

/* renamed from: e.a.u0.g */
/* compiled from: RunnableDisposable */
final class C12318g extends C12317f<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    C12318g(Runnable runnable) {
        super(runnable);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RunnableDisposable(disposed=");
        sb.append(mo41878d());
        sb.append(", ");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42066a(@C5937f Runnable runnable) {
        runnable.run();
    }
}
