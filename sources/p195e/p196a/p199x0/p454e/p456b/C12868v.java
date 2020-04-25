package p195e.p196a.p199x0.p454e.p456b;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13741i;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.e.b.v */
/* compiled from: FlowableConcatArray */
public final class C12868v<T> extends C5929l<T> {

    /* renamed from: N */
    final boolean f37018N;

    /* renamed from: b */
    final C6007b<? extends T>[] f37019b;

    /* renamed from: e.a.x0.e.b.v$a */
    /* compiled from: FlowableConcatArray */
    static final class C12869a<T> extends C13741i implements C12297q<T> {
        private static final long serialVersionUID = -8158322871608889516L;

        /* renamed from: S */
        final C14062c<? super T> f37020S;

        /* renamed from: T */
        final C6007b<? extends T>[] f37021T;

        /* renamed from: U */
        final boolean f37022U;

        /* renamed from: V */
        final AtomicInteger f37023V = new AtomicInteger();

        /* renamed from: W */
        int f37024W;

        /* renamed from: X */
        List<Throwable> f37025X;

        /* renamed from: Y */
        long f37026Y;

        C12869a(C6007b<? extends T>[] bVarArr, boolean z, C14062c<? super T> cVar) {
            this.f37020S = cVar;
            this.f37021T = bVarArr;
            this.f37022U = z;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            mo43130b(dVar);
        }

        public void onComplete() {
            if (this.f37023V.getAndIncrement() == 0) {
                C6007b<? extends T>[] bVarArr = this.f37021T;
                int length = bVarArr.length;
                int i = this.f37024W;
                while (i != length) {
                    C6007b<? extends T> bVar = bVarArr[i];
                    if (bVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (this.f37022U) {
                            List list = this.f37025X;
                            if (list == null) {
                                list = new ArrayList((length - i) + 1);
                                this.f37025X = list;
                            }
                            list.add(nullPointerException);
                            i++;
                        } else {
                            this.f37020S.onError(nullPointerException);
                            return;
                        }
                    } else {
                        long j = this.f37026Y;
                        if (j != 0) {
                            this.f37026Y = 0;
                            mo43129b(j);
                        }
                        bVar.mo24397a(this);
                        i++;
                        this.f37024W = i;
                        if (this.f37023V.decrementAndGet() == 0) {
                        }
                    }
                }
                List<Throwable> list2 = this.f37025X;
                if (list2 == null) {
                    this.f37020S.onComplete();
                } else if (list2.size() == 1) {
                    this.f37020S.onError((Throwable) list2.get(0));
                } else {
                    this.f37020S.onError(new CompositeException((Iterable<? extends Throwable>) list2));
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f37022U) {
                List list = this.f37025X;
                if (list == null) {
                    list = new ArrayList((this.f37021T.length - this.f37024W) + 1);
                    this.f37025X = list;
                }
                list.add(th);
                onComplete();
                return;
            }
            this.f37020S.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f37026Y++;
            this.f37020S.mo41789a(t);
        }
    }

    public C12868v(C6007b<? extends T>[] bVarArr, boolean z) {
        this.f37019b = bVarArr;
        this.f37018N = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12869a aVar = new C12869a(this.f37019b, this.f37018N, cVar);
        cVar.mo41788a((C14063d) aVar);
        aVar.onComplete();
    }
}
