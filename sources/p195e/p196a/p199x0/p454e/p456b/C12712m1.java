package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12287k;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p465i.C13739g;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12331g;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.m1 */
/* compiled from: FlowableGenerate */
public final class C12712m1<T, S> extends C5929l<T> {

    /* renamed from: N */
    final C12327c<S, C12287k<T>, S> f36440N;

    /* renamed from: O */
    final C12331g<? super S> f36441O;

    /* renamed from: b */
    final Callable<S> f36442b;

    /* renamed from: e.a.x0.e.b.m1$a */
    /* compiled from: FlowableGenerate */
    static final class C12713a<T, S> extends AtomicLong implements C12287k<T>, C14063d {
        private static final long serialVersionUID = 7565982551505011832L;

        /* renamed from: N */
        final C12331g<? super S> f36443N;

        /* renamed from: O */
        S f36444O;

        /* renamed from: P */
        volatile boolean f36445P;

        /* renamed from: Q */
        boolean f36446Q;

        /* renamed from: R */
        boolean f36447R;

        /* renamed from: a */
        final C14062c<? super T> f36448a;

        /* renamed from: b */
        final C12327c<S, ? super C12287k<T>, S> f36449b;

        C12713a(C14062c<? super T> cVar, C12327c<S, ? super C12287k<T>, S> cVar2, C12331g<? super S> gVar, S s) {
            this.f36448a = cVar;
            this.f36449b = cVar2;
            this.f36443N = gVar;
            this.f36444O = s;
        }

        /* renamed from: b */
        private void m56251b(S s) {
            try {
                this.f36443N.mo33410c(s);
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12205a.m54894b(th);
            }
        }

        /* renamed from: a */
        public void mo42030a(T t) {
            if (this.f36446Q) {
                return;
            }
            if (this.f36447R) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f36447R = true;
                this.f36448a.mo41789a(t);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j) && C13747d.m58696a((AtomicLong) this, j) == 0) {
                S s = this.f36444O;
                C12327c<S, ? super C12287k<T>, S> cVar = this.f36449b;
                long j2 = j;
                do {
                    long j3 = 0;
                    while (true) {
                        if (j3 == j2) {
                            j2 = get();
                            if (j3 == j2) {
                                this.f36444O = s;
                                j2 = addAndGet(-j3);
                            }
                        } else if (this.f36445P) {
                            this.f36444O = null;
                            m56251b(s);
                            return;
                        } else {
                            this.f36447R = false;
                            try {
                                s = cVar.mo35569a(s, this);
                                if (this.f36446Q) {
                                    this.f36445P = true;
                                    this.f36444O = null;
                                    m56251b(s);
                                    return;
                                }
                                j3++;
                            } catch (Throwable th) {
                                C14398a.m62357b(th);
                                this.f36445P = true;
                                this.f36444O = null;
                                onError(th);
                                m56251b(s);
                                return;
                            }
                        }
                    }
                } while (j2 != 0);
            }
        }

        public void cancel() {
            if (!this.f36445P) {
                this.f36445P = true;
                if (C13747d.m58696a((AtomicLong) this, 1) == 0) {
                    S s = this.f36444O;
                    this.f36444O = null;
                    m56251b(s);
                }
            }
        }

        public void onComplete() {
            if (!this.f36446Q) {
                this.f36446Q = true;
                this.f36448a.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f36446Q) {
                C12205a.m54894b(th);
                return;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f36446Q = true;
            this.f36448a.onError(th);
        }
    }

    public C12712m1(Callable<S> callable, C12327c<S, C12287k<T>, S> cVar, C12331g<? super S> gVar) {
        this.f36442b = callable;
        this.f36440N = cVar;
        this.f36441O = gVar;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        try {
            cVar.mo41788a((C14063d) new C12713a(cVar, this.f36440N, this.f36441O, this.f36442b.call()));
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C13739g.m58655a(th, cVar);
        }
    }
}
