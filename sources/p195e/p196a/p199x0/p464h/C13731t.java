package p195e.p196a.p199x0.p464h;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13756l;
import p195e.p196a.p199x0.p465i.C13742j;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.h.t */
/* compiled from: StrictSubscriber */
public class C13731t<T> extends AtomicInteger implements C12297q<T>, C14063d {
    private static final long serialVersionUID = -4945028590049415624L;

    /* renamed from: N */
    final AtomicLong f39763N = new AtomicLong();

    /* renamed from: O */
    final AtomicReference<C14063d> f39764O = new AtomicReference<>();

    /* renamed from: P */
    final AtomicBoolean f39765P = new AtomicBoolean();

    /* renamed from: Q */
    volatile boolean f39766Q;

    /* renamed from: a */
    final C14062c<? super T> f39767a;

    /* renamed from: b */
    final C13746c f39768b = new C13746c();

    public C13731t(C14062c<? super T> cVar) {
        this.f39767a = cVar;
    }

    /* renamed from: a */
    public void mo41788a(C14063d dVar) {
        if (this.f39765P.compareAndSet(false, true)) {
            this.f39767a.mo41788a((C14063d) this);
            C13742j.m58677a(this.f39764O, this.f39763N, dVar);
            return;
        }
        dVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    /* renamed from: c */
    public void mo41813c(long j) {
        if (j <= 0) {
            cancel();
            StringBuilder sb = new StringBuilder();
            sb.append("§3.9 violated: positive request amount required but it was ");
            sb.append(j);
            onError(new IllegalArgumentException(sb.toString()));
            return;
        }
        C13742j.m58671a(this.f39764O, this.f39763N, j);
    }

    public void cancel() {
        if (!this.f39766Q) {
            C13742j.m58674a(this.f39764O);
        }
    }

    public void onComplete() {
        this.f39766Q = true;
        C13756l.m58730a(this.f39767a, (AtomicInteger) this, this.f39768b);
    }

    public void onError(Throwable th) {
        this.f39766Q = true;
        C13756l.m58729a(this.f39767a, th, (AtomicInteger) this, this.f39768b);
    }

    /* renamed from: a */
    public void mo41789a(T t) {
        C13756l.m58728a(this.f39767a, t, (AtomicInteger) this, this.f39768b);
    }
}
