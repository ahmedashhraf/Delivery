package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p200j.C13747d;
import p195e.p196a.p199x0.p200j.C13761q;
import p195e.p196a.p199x0.p452c.C12399h;
import p195e.p196a.p199x0.p452c.C12403l;
import p195e.p196a.p199x0.p452c.C12406o;
import p195e.p196a.p199x0.p462f.C13662b;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p448v0.C12322a;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.C14398a;
import p212io.reactivex.exceptions.MissingBackpressureException;

/* renamed from: e.a.x0.e.b.r2 */
/* compiled from: FlowablePublish */
public final class C12794r2<T> extends C12322a<T> implements C12399h<T> {

    /* renamed from: Q */
    static final long f36738Q = Long.MIN_VALUE;

    /* renamed from: N */
    final AtomicReference<C12797c<T>> f36739N;

    /* renamed from: O */
    final int f36740O;

    /* renamed from: P */
    final C6007b<T> f36741P;

    /* renamed from: b */
    final C5929l<T> f36742b;

    /* renamed from: e.a.x0.e.b.r2$a */
    /* compiled from: FlowablePublish */
    static final class C12795a<T> implements C6007b<T> {

        /* renamed from: a */
        private final AtomicReference<C12797c<T>> f36743a;

        /* renamed from: b */
        private final int f36744b;

        C12795a(AtomicReference<C12797c<T>> atomicReference, int i) {
            this.f36743a = atomicReference;
            this.f36744b = i;
        }

        /* renamed from: a */
        public void mo24397a(C14062c<? super T> cVar) {
            C12797c<T> cVar2;
            C12796b bVar = new C12796b(cVar);
            cVar.mo41788a((C14063d) bVar);
            while (true) {
                cVar2 = (C12797c) this.f36743a.get();
                if (cVar2 == null || cVar2.mo41878d()) {
                    C12797c<T> cVar3 = new C12797c<>(this.f36743a, this.f36744b);
                    if (!this.f36743a.compareAndSet(cVar2, cVar3)) {
                        continue;
                    } else {
                        cVar2 = cVar3;
                    }
                }
                if (cVar2.mo42435a(bVar)) {
                    break;
                }
            }
            if (bVar.get() == Long.MIN_VALUE) {
                cVar2.mo42437b(bVar);
            } else {
                bVar.f36747b = cVar2;
            }
            cVar2.mo42434a();
        }
    }

    /* renamed from: e.a.x0.e.b.r2$b */
    /* compiled from: FlowablePublish */
    static final class C12796b<T> extends AtomicLong implements C14063d {
        private static final long serialVersionUID = -4453897557930727610L;

        /* renamed from: N */
        long f36745N;

        /* renamed from: a */
        final C14062c<? super T> f36746a;

        /* renamed from: b */
        volatile C12797c<T> f36747b;

        C12796b(C14062c<? super T> cVar) {
            this.f36746a = cVar;
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            if (C13742j.m58678b(j)) {
                C13747d.m58698b((AtomicLong) this, j);
                C12797c<T> cVar = this.f36747b;
                if (cVar != null) {
                    cVar.mo42434a();
                }
            }
        }

        public void cancel() {
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                C12797c<T> cVar = this.f36747b;
                if (cVar != null) {
                    cVar.mo42437b(this);
                    cVar.mo42434a();
                }
            }
        }
    }

    /* renamed from: e.a.x0.e.b.r2$c */
    /* compiled from: FlowablePublish */
    static final class C12797c<T> extends AtomicInteger implements C12297q<T>, C12314c {

        /* renamed from: T */
        static final C12796b[] f36748T = new C12796b[0];

        /* renamed from: U */
        static final C12796b[] f36749U = new C12796b[0];
        private static final long serialVersionUID = -202316842419149694L;

        /* renamed from: N */
        final AtomicReference<C12796b<T>[]> f36750N = new AtomicReference<>(f36748T);

        /* renamed from: O */
        final AtomicBoolean f36751O;

        /* renamed from: P */
        final AtomicReference<C14063d> f36752P = new AtomicReference<>();

        /* renamed from: Q */
        volatile Object f36753Q;

        /* renamed from: R */
        int f36754R;

        /* renamed from: S */
        volatile C12406o<T> f36755S;

        /* renamed from: a */
        final AtomicReference<C12797c<T>> f36756a;

        /* renamed from: b */
        final int f36757b;

        C12797c(AtomicReference<C12797c<T>> atomicReference, int i) {
            this.f36756a = atomicReference;
            this.f36751O = new AtomicBoolean();
            this.f36757b = i;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58680c(this.f36752P, dVar)) {
                if (dVar instanceof C12403l) {
                    C12403l lVar = (C12403l) dVar;
                    int a = lVar.mo41855a(3);
                    if (a == 1) {
                        this.f36754R = a;
                        this.f36755S = lVar;
                        this.f36753Q = C13761q.m58750d();
                        mo42434a();
                        return;
                    } else if (a == 2) {
                        this.f36754R = a;
                        this.f36755S = lVar;
                        dVar.mo41813c((long) this.f36757b);
                        return;
                    }
                }
                this.f36755S = new C13662b(this.f36757b);
                dVar.mo41813c((long) this.f36757b);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo42437b(C12796b<T> bVar) {
            C12796b[] bVarArr;
            C12796b[] bVarArr2;
            do {
                bVarArr = (C12796b[]) this.f36750N.get();
                int length = bVarArr.length;
                if (length == 0) {
                    break;
                }
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (bVarArr[i2].equals(bVar)) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        bVarArr2 = f36748T;
                    } else {
                        C12796b[] bVarArr3 = new C12796b[(length - 1)];
                        System.arraycopy(bVarArr, 0, bVarArr3, 0, i);
                        System.arraycopy(bVarArr, i + 1, bVarArr3, i, (length - i) - 1);
                        bVarArr2 = bVarArr3;
                    }
                } else {
                    return;
                }
            } while (!this.f36750N.compareAndSet(bVarArr, bVarArr2));
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f36750N.get() == f36749U;
        }

        public void dispose() {
            Object obj = this.f36750N.get();
            Object obj2 = f36749U;
            if (obj != obj2 && ((C12796b[]) this.f36750N.getAndSet(obj2)) != f36749U) {
                this.f36756a.compareAndSet(this, null);
                C13742j.m58674a(this.f36752P);
            }
        }

        public void onComplete() {
            if (this.f36753Q == null) {
                this.f36753Q = C13761q.m58750d();
                mo42434a();
            }
        }

        public void onError(Throwable th) {
            if (this.f36753Q == null) {
                this.f36753Q = C13761q.m58743a(th);
                mo42434a();
                return;
            }
            C12205a.m54894b(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (this.f36754R != 0 || this.f36755S.offer(t)) {
                mo42434a();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42435a(C12796b<T> bVar) {
            C12796b[] bVarArr;
            C12796b[] bVarArr2;
            do {
                bVarArr = (C12796b[]) this.f36750N.get();
                if (bVarArr == f36749U) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new C12796b[(length + 1)];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!this.f36750N.compareAndSet(bVarArr, bVarArr2));
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo42436a(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!C13761q.m58752e(obj)) {
                    Throwable b = C13761q.m58746b(obj);
                    this.f36756a.compareAndSet(this, null);
                    C12796b[] bVarArr = (C12796b[]) this.f36750N.getAndSet(f36749U);
                    if (bVarArr.length != 0) {
                        int length = bVarArr.length;
                        while (i < length) {
                            bVarArr[i].f36746a.onError(b);
                            i++;
                        }
                    } else {
                        C12205a.m54894b(b);
                    }
                    return true;
                } else if (z) {
                    this.f36756a.compareAndSet(this, null);
                    C12796b[] bVarArr2 = (C12796b[]) this.f36750N.getAndSet(f36749U);
                    int length2 = bVarArr2.length;
                    while (i < length2) {
                        bVarArr2[i].f36746a.onComplete();
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo42434a() {
            long j;
            Object obj;
            boolean z;
            C12406o<T> oVar;
            Object obj2;
            if (getAndIncrement() == 0) {
                AtomicReference<C12796b<T>[]> atomicReference = this.f36750N;
                int i = 1;
                C12796b[] bVarArr = (C12796b[]) atomicReference.get();
                int i2 = 1;
                while (true) {
                    Object obj3 = this.f36753Q;
                    C12406o<T> oVar2 = this.f36755S;
                    boolean z2 = oVar2 == null || oVar2.isEmpty();
                    if (!mo42436a(obj3, z2)) {
                        if (!z2) {
                            int length = bVarArr.length;
                            int i3 = 0;
                            long j2 = Long.MAX_VALUE;
                            for (C12796b bVar : bVarArr) {
                                long j3 = bVar.get();
                                if (j3 != Long.MIN_VALUE) {
                                    j2 = Math.min(j2, j3 - bVar.f36745N);
                                } else {
                                    i3++;
                                }
                            }
                            if (length == i3) {
                                Object obj4 = this.f36753Q;
                                try {
                                    obj2 = oVar2.poll();
                                } catch (Throwable th) {
                                    Throwable th2 = th;
                                    C14398a.m62357b(th2);
                                    ((C14063d) this.f36752P.get()).cancel();
                                    obj4 = C13761q.m58743a(th2);
                                    this.f36753Q = obj4;
                                    obj2 = null;
                                }
                                if (!mo42436a(obj4, obj2 == null)) {
                                    if (this.f36754R != i) {
                                        ((C14063d) this.f36752P.get()).mo41813c(1);
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                boolean z3 = z2;
                                int i4 = 0;
                                while (true) {
                                    j = (long) i4;
                                    if (j >= j2) {
                                        break;
                                    }
                                    Object obj5 = this.f36753Q;
                                    try {
                                        obj = oVar2.poll();
                                    } catch (Throwable th3) {
                                        Throwable th4 = th3;
                                        C14398a.m62357b(th4);
                                        ((C14063d) this.f36752P.get()).cancel();
                                        obj5 = C13761q.m58743a(th4);
                                        this.f36753Q = obj5;
                                        obj = null;
                                    }
                                    boolean z4 = obj == null;
                                    if (!mo42436a(obj5, z4)) {
                                        if (z4) {
                                            z3 = z4;
                                            break;
                                        }
                                        Object d = C13761q.m58751d(obj);
                                        int length2 = bVarArr.length;
                                        int i5 = 0;
                                        boolean z5 = false;
                                        while (i5 < length2) {
                                            C12796b bVar2 = bVarArr[i5];
                                            long j4 = bVar2.get();
                                            if (j4 != Long.MIN_VALUE) {
                                                int i6 = (j4 > Long.MAX_VALUE ? 1 : (j4 == Long.MAX_VALUE ? 0 : -1));
                                                oVar = oVar2;
                                                z = z4;
                                                if (i6 != 0) {
                                                    bVar2.f36745N++;
                                                }
                                                bVar2.f36746a.mo41789a(d);
                                            } else {
                                                oVar = oVar2;
                                                z = z4;
                                                z5 = true;
                                            }
                                            i5++;
                                            oVar2 = oVar;
                                            z4 = z;
                                        }
                                        C12406o<T> oVar3 = oVar2;
                                        boolean z6 = z4;
                                        i4++;
                                        C12796b[] bVarArr2 = (C12796b[]) atomicReference.get();
                                        if (z5 || bVarArr2 != bVarArr) {
                                            bVarArr = bVarArr2;
                                        } else {
                                            oVar2 = oVar3;
                                            z3 = z6;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                if (i4 > 0) {
                                    if (this.f36754R != 1) {
                                        ((C14063d) this.f36752P.get()).mo41813c(j);
                                    }
                                }
                                if (j2 != 0 && !z3) {
                                }
                            }
                            i = 1;
                        }
                        i2 = addAndGet(-i2);
                        if (i2 != 0) {
                            bVarArr = (C12796b[]) atomicReference.get();
                            i = 1;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private C12794r2(C6007b<T> bVar, C5929l<T> lVar, AtomicReference<C12797c<T>> atomicReference, int i) {
        this.f36741P = bVar;
        this.f36742b = lVar;
        this.f36739N = atomicReference;
        this.f36740O = i;
    }

    /* renamed from: a */
    public static <T> C12322a<T> m56481a(C5929l<T> lVar, int i) {
        AtomicReference atomicReference = new AtomicReference();
        return C12205a.m54874a((C12322a<T>) new C12794r2<T>(new C12795a(atomicReference, i), lVar, atomicReference, i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f36741P.mo24397a(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42084l(p195e.p196a.p449w0.C12331g<? super p195e.p196a.p447u0.C12314c> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.r2$c<T>> r0 = r4.f36739N
            java.lang.Object r0 = r0.get()
            e.a.x0.e.b.r2$c r0 = (p195e.p196a.p199x0.p454e.p456b.C12794r2.C12797c) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.mo41878d()
            if (r1 == 0) goto L_0x0023
        L_0x0010:
            e.a.x0.e.b.r2$c r1 = new e.a.x0.e.b.r2$c
            java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.r2$c<T>> r2 = r4.f36739N
            int r3 = r4.f36740O
            r1.<init>(r2, r3)
            java.util.concurrent.atomic.AtomicReference<e.a.x0.e.b.r2$c<T>> r2 = r4.f36739N
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L_0x0022
            goto L_0x0000
        L_0x0022:
            r0 = r1
        L_0x0023:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f36751O
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0036
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f36751O
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            r5.mo33410c(r0)     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x0041
            e.a.l<T> r5 = r4.f36742b
            r5.mo24393a(r0)
        L_0x0041:
            return
        L_0x0042:
            r5 = move-exception
            p212io.reactivex.exceptions.C14398a.m62357b(r5)
            java.lang.RuntimeException r5 = p195e.p196a.p199x0.p200j.C13754k.m58724c(r5)
            goto L_0x004c
        L_0x004b:
            throw r5
        L_0x004c:
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: p195e.p196a.p199x0.p454e.p456b.C12794r2.mo42084l(e.a.w0.g):void");
    }

    public C6007b<T> source() {
        return this.f36742b;
    }
}
