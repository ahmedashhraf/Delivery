package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13746c;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13753j;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p462f.C13663c;
import p195e.p196a.p199x0.p464h.C13721j;
import p195e.p196a.p199x0.p464h.C13722k;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.x */
/* compiled from: FlowableConcatMapEager */
public final class C12903x<T, R> extends C12511a<T, R> {

    /* renamed from: N */
    final C12339o<? super T, ? extends C6007b<? extends R>> f37160N;

    /* renamed from: O */
    final int f37161O;

    /* renamed from: P */
    final int f37162P;

    /* renamed from: Q */
    final C13753j f37163Q;

    /* renamed from: e.a.x0.e.b.x$a */
    /* compiled from: FlowableConcatMapEager */
    static final class C12904a<T, R> extends AtomicInteger implements C12297q<T>, C14063d, C13722k<R> {
        private static final long serialVersionUID = -4255299542215038287L;

        /* renamed from: N */
        final int f37164N;

        /* renamed from: O */
        final int f37165O;

        /* renamed from: P */
        final C13753j f37166P;

        /* renamed from: Q */
        final C13746c f37167Q = new C13746c();

        /* renamed from: R */
        final AtomicLong f37168R = new AtomicLong();

        /* renamed from: S */
        final C13663c<C13721j<R>> f37169S;

        /* renamed from: T */
        C14063d f37170T;

        /* renamed from: U */
        volatile boolean f37171U;

        /* renamed from: V */
        volatile boolean f37172V;

        /* renamed from: W */
        volatile C13721j<R> f37173W;

        /* renamed from: a */
        final C14062c<? super R> f37174a;

        /* renamed from: b */
        final C12339o<? super T, ? extends C6007b<? extends R>> f37175b;

        C12904a(C14062c<? super R> cVar, C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i, int i2, C13753j jVar) {
            this.f37174a = cVar;
            this.f37175b = oVar;
            this.f37164N = i;
            this.f37165O = i2;
            this.f37166P = jVar;
            this.f37169S = new C13663c<>(Math.min(i2, i));
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f37170T, dVar)) {
                this.f37170T = dVar;
                this.f37174a.mo41788a((C14063d) this);
                int i = this.f37164N;
                dVar.mo41813c(i == Integer.MAX_VALUE ? Long.MAX_VALUE : (long) i);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58696a(this.f37168R, j);
                mo42518a();
            }
        }

        public void cancel() {
            if (!this.f37171U) {
                this.f37171U = true;
                this.f37170T.cancel();
                mo42523e();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo42522d() {
            while (true) {
                C13721j jVar = (C13721j) this.f37169S.poll();
                if (jVar != null) {
                    jVar.cancel();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo42523e() {
            if (getAndIncrement() == 0) {
                do {
                    mo42522d();
                } while (decrementAndGet() != 0);
            }
        }

        public void onComplete() {
            this.f37172V = true;
            mo42518a();
        }

        public void onError(Throwable th) {
            if (this.f37167Q.mo43142a(th)) {
                this.f37172V = true;
                mo42518a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            try {
                C6007b bVar = (C6007b) C12390b.m55563a(this.f37175b.apply(t), "The mapper returned a null Publisher");
                C13721j jVar = new C13721j(this, this.f37165O);
                if (!this.f37171U) {
                    this.f37169S.offer(jVar);
                    bVar.mo24397a(jVar);
                    if (this.f37171U) {
                        jVar.cancel();
                        mo42523e();
                    }
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f37170T.cancel();
                onError(th);
            }
        }

        /* renamed from: a */
        public void mo42520a(C13721j<R> jVar, R r) {
            if (jVar.mo43100d().offer(r)) {
                mo42518a();
                return;
            }
            jVar.cancel();
            mo42521a(jVar, (Throwable) new MissingBackpressureException());
        }

        /* renamed from: a */
        public void mo42521a(C13721j<R> jVar, Throwable th) {
            if (this.f37167Q.mo43142a(th)) {
                jVar.mo43102f();
                if (this.f37166P != C13753j.END) {
                    this.f37170T.cancel();
                }
                mo42518a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo42519a(C13721j<R> jVar) {
            jVar.mo43102f();
            mo42518a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:79:0x012f  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0133  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo42518a() {
            /*
                r19 = this;
                r1 = r19
                int r0 = r19.getAndIncrement()
                if (r0 == 0) goto L_0x0009
                return
            L_0x0009:
                e.a.x0.h.j<R> r0 = r1.f37173W
                i.e.c<? super R> r2 = r1.f37174a
                e.a.x0.j.j r3 = r1.f37166P
                r5 = 1
            L_0x0010:
                java.util.concurrent.atomic.AtomicLong r6 = r1.f37168R
                long r6 = r6.get()
                if (r0 != 0) goto L_0x0056
                e.a.x0.j.j r0 = p195e.p196a.p199x0.p200j.C13753j.END
                if (r3 == r0) goto L_0x0033
                e.a.x0.j.c r0 = r1.f37167Q
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x0033
                r19.mo42522d()
                e.a.x0.j.c r0 = r1.f37167Q
                java.lang.Throwable r0 = r0.mo43143d()
                r2.onError(r0)
                return
            L_0x0033:
                boolean r0 = r1.f37172V
                e.a.x0.f.c<e.a.x0.h.j<R>> r8 = r1.f37169S
                java.lang.Object r8 = r8.poll()
                e.a.x0.h.j r8 = (p195e.p196a.p199x0.p464h.C13721j) r8
                if (r0 == 0) goto L_0x0051
                if (r8 != 0) goto L_0x0051
                e.a.x0.j.c r0 = r1.f37167Q
                java.lang.Throwable r0 = r0.mo43143d()
                if (r0 == 0) goto L_0x004d
                r2.onError(r0)
                goto L_0x0050
            L_0x004d:
                r2.onComplete()
            L_0x0050:
                return
            L_0x0051:
                if (r8 == 0) goto L_0x0057
                r1.f37173W = r8
                goto L_0x0057
            L_0x0056:
                r8 = r0
            L_0x0057:
                r9 = 0
                r11 = 0
                if (r8 == 0) goto L_0x0114
                e.a.x0.c.o r12 = r8.mo43100d()
                if (r12 == 0) goto L_0x0114
                r16 = r5
                r13 = r9
            L_0x0065:
                r4 = 1
                int r17 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r17 == 0) goto L_0x00cd
                boolean r0 = r1.f37171U
                if (r0 == 0) goto L_0x0073
                r19.mo42522d()
                return
            L_0x0073:
                e.a.x0.j.j r0 = p195e.p196a.p199x0.p200j.C13753j.IMMEDIATE
                if (r3 != r0) goto L_0x0093
                e.a.x0.j.c r0 = r1.f37167Q
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x0093
                r1.f37173W = r11
                r8.cancel()
                r19.mo42522d()
                e.a.x0.j.c r0 = r1.f37167Q
                java.lang.Throwable r0 = r0.mo43143d()
                r2.onError(r0)
                return
            L_0x0093:
                boolean r0 = r8.mo43099a()
                java.lang.Object r15 = r12.poll()     // Catch:{ all -> 0x00bc }
                if (r15 != 0) goto L_0x00a0
                r18 = 1
                goto L_0x00a2
            L_0x00a0:
                r18 = 0
            L_0x00a2:
                if (r0 == 0) goto L_0x00b1
                if (r18 == 0) goto L_0x00b1
                r1.f37173W = r11
                i.e.d r0 = r1.f37170T
                r0.mo41813c(r4)
                r8 = r11
                r17 = 1
                goto L_0x00cf
            L_0x00b1:
                if (r18 == 0) goto L_0x00b4
                goto L_0x00cd
            L_0x00b4:
                r2.mo41789a(r15)
                long r13 = r13 + r4
                r8.mo43101e()
                goto L_0x0065
            L_0x00bc:
                r0 = move-exception
                r3 = r0
                p212io.reactivex.exceptions.C14398a.m62357b(r3)
                r1.f37173W = r11
                r8.cancel()
                r19.mo42522d()
                r2.onError(r3)
                return
            L_0x00cd:
                r17 = 0
            L_0x00cf:
                int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
                if (r0 != 0) goto L_0x0112
                boolean r0 = r1.f37171U
                if (r0 == 0) goto L_0x00db
                r19.mo42522d()
                return
            L_0x00db:
                e.a.x0.j.j r0 = p195e.p196a.p199x0.p200j.C13753j.IMMEDIATE
                if (r3 != r0) goto L_0x00fb
                e.a.x0.j.c r0 = r1.f37167Q
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L_0x00fb
                r1.f37173W = r11
                r8.cancel()
                r19.mo42522d()
                e.a.x0.j.c r0 = r1.f37167Q
                java.lang.Throwable r0 = r0.mo43143d()
                r2.onError(r0)
                return
            L_0x00fb:
                boolean r0 = r8.mo43099a()
                boolean r12 = r12.isEmpty()
                if (r0 == 0) goto L_0x0112
                if (r12 == 0) goto L_0x0112
                r1.f37173W = r11
                i.e.d r0 = r1.f37170T
                r0.mo41813c(r4)
                r0 = r11
                r17 = 1
                goto L_0x011a
            L_0x0112:
                r0 = r8
                goto L_0x011a
            L_0x0114:
                r16 = r5
                r0 = r8
                r13 = r9
                r17 = 0
            L_0x011a:
                int r4 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r4 == 0) goto L_0x012d
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r8 == 0) goto L_0x012d
                java.util.concurrent.atomic.AtomicLong r4 = r1.f37168R
                long r5 = -r13
                r4.addAndGet(r5)
            L_0x012d:
                if (r17 == 0) goto L_0x0133
                r5 = r16
                goto L_0x0010
            L_0x0133:
                r4 = r16
                int r4 = -r4
                int r5 = r1.addAndGet(r4)
                if (r5 != 0) goto L_0x0010
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12903x.C12904a.mo42518a():void");
        }
    }

    public C12903x(C5929l<T> lVar, C12339o<? super T, ? extends C6007b<? extends R>> oVar, int i, int i2, C13753j jVar) {
        super(lVar);
        this.f37160N = oVar;
        this.f37161O = i;
        this.f37162P = i2;
        this.f37163Q = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        C5929l<T> lVar = this.f35814b;
        C12904a aVar = new C12904a(cVar, this.f37160N, this.f37161O, this.f37162P, this.f37163Q);
        lVar.mo24393a((C12297q<? super T>) aVar);
    }
}
