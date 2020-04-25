package p212io.fabric.sdk.android.services.concurrency.internal;

/* renamed from: io.fabric.sdk.android.services.concurrency.internal.c */
/* compiled from: DefaultRetryPolicy */
public class C14358c implements C14361f {

    /* renamed from: a */
    private final int f42421a;

    public C14358c() {
        this(1);
    }

    /* renamed from: a */
    public boolean mo45357a(int i, Throwable th) {
        return i < this.f42421a;
    }

    public C14358c(int i) {
        this.f42421a = i;
    }
}
