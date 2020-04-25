package p212io.fabric.sdk.android.p493p.p494a;

import android.content.Context;

/* renamed from: io.fabric.sdk.android.p.a.a */
/* compiled from: AbstractValueCache */
public abstract class C14232a<T> implements C14234c<T> {

    /* renamed from: a */
    private final C14234c<T> f41978a;

    public C14232a() {
        this(null);
    }

    /* renamed from: b */
    private void m61755b(Context context, T t) {
        if (t != null) {
            mo45114a(context, t);
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public final synchronized T mo45112a(Context context, C14235d<T> dVar) throws Exception {
        T c;
        c = mo45116c(context);
        if (c == null) {
            c = this.f41978a != null ? this.f41978a.mo45112a(context, dVar) : dVar.load(context);
            m61755b(context, c);
        }
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo45114a(Context context, T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo45115b(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract T mo45116c(Context context);

    public C14232a(C14234c<T> cVar) {
        this.f41978a = cVar;
    }

    /* renamed from: a */
    public final synchronized void mo45113a(Context context) {
        mo45115b(context);
    }
}
