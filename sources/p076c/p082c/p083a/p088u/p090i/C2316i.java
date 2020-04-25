package p076c.p082c.p083a.p088u.p090i;

import android.os.Looper;
import p076c.p082c.p083a.p088u.C2272c;

/* renamed from: c.c.a.u.i.i */
/* compiled from: EngineResource */
class C2316i<Z> implements C2322l<Z> {

    /* renamed from: a */
    private final C2322l<Z> f9206a;

    /* renamed from: b */
    private final boolean f9207b;

    /* renamed from: c */
    private C2317a f9208c;

    /* renamed from: d */
    private C2272c f9209d;

    /* renamed from: e */
    private int f9210e;

    /* renamed from: f */
    private boolean f9211f;

    /* renamed from: c.c.a.u.i.i$a */
    /* compiled from: EngineResource */
    interface C2317a {
        /* renamed from: b */
        void mo9684b(C2272c cVar, C2316i<?> iVar);
    }

    C2316i(C2322l<Z> lVar, boolean z) {
        if (lVar != null) {
            this.f9206a = lVar;
            this.f9207b = z;
            return;
        }
        throw new NullPointerException("Wrapped resource must not be null");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9703a(C2272c cVar, C2317a aVar) {
        this.f9209d = cVar;
        this.f9208c = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9704b() {
        if (this.f9211f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f9210e++;
        } else {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo9705c() {
        return this.f9207b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo9706d() {
        if (this.f9210e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            int i = this.f9210e - 1;
            this.f9210e = i;
            if (i == 0) {
                this.f9208c.mo9684b(this.f9209d, this);
            }
        } else {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
    }

    public Z get() {
        return this.f9206a.get();
    }

    public int getSize() {
        return this.f9206a.getSize();
    }

    /* renamed from: a */
    public void mo9702a() {
        if (this.f9210e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f9211f) {
            this.f9211f = true;
            this.f9206a.mo9702a();
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }
}
