package okhttp3.internal;

/* renamed from: okhttp3.internal.a */
/* compiled from: NamedRunnable */
public abstract class C14909a implements Runnable {

    /* renamed from: a */
    protected final String f43157a;

    public C14909a(String str, Object... objArr) {
        this.f43157a = C14910b.m66045a(str, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo43305b();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f43157a);
        try {
            mo43305b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
