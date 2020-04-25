package com.google.common.collect;

import com.google.common.base.C5827t;
import com.google.common.base.C7397x;
import com.google.common.collect.C7982k4.C7983a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import org.jivesoftware.smackx.shim.packet.Header;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.RangeValidateElement;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p076c.p112d.p148d.p150g.C6637f;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.j6 */
/* compiled from: TreeMultiset */
public final class C7961j6<E> extends C8024m<E> implements Serializable {
    @C2777c("not needed in emulated source")
    private static final long serialVersionUID = 1;

    /* renamed from: P */
    private final transient C7970g<C7969f<E>> f21702P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final transient C7898i2<E> f21703Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final transient C7969f<E> f21704R;

    /* renamed from: com.google.common.collect.j6$a */
    /* compiled from: TreeMultiset */
    class C7962a extends C8013f<E> {

        /* renamed from: a */
        final /* synthetic */ C7969f f21705a;

        C7962a(C7969f fVar) {
            this.f21705a = fVar;
        }

        public int getCount() {
            int count = this.f21705a.getCount();
            return count == 0 ? C7961j6.this.mo29708b(getElement()) : count;
        }

        public E getElement() {
            return this.f21705a.getElement();
        }
    }

    /* renamed from: com.google.common.collect.j6$b */
    /* compiled from: TreeMultiset */
    class C7963b implements Iterator<C7983a<E>> {

        /* renamed from: a */
        C7969f<E> f21708a = C7961j6.this.m38123o();

        /* renamed from: b */
        C7983a<E> f21709b;

        C7963b() {
        }

        public boolean hasNext() {
            if (this.f21708a == null) {
                return false;
            }
            if (!C7961j6.this.f21703Q.mo30605b(this.f21708a.getElement())) {
                return true;
            }
            this.f21708a = null;
            return false;
        }

        public void remove() {
            C8277y.m39486a(this.f21709b != null);
            C7961j6.this.mo29894c(this.f21709b.getElement(), 0);
            this.f21709b = null;
        }

        public C7983a<E> next() {
            if (hasNext()) {
                C7983a<E> a = C7961j6.this.m38117b(this.f21708a);
                this.f21709b = a;
                if (this.f21708a.f21720T == C7961j6.this.f21704R) {
                    this.f21708a = null;
                } else {
                    this.f21708a = this.f21708a.f21720T;
                }
                return a;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.google.common.collect.j6$c */
    /* compiled from: TreeMultiset */
    class C7964c implements Iterator<C7983a<E>> {

        /* renamed from: a */
        C7969f<E> f21711a = C7961j6.this.m38124p();

        /* renamed from: b */
        C7983a<E> f21712b = null;

        C7964c() {
        }

        public boolean hasNext() {
            if (this.f21711a == null) {
                return false;
            }
            if (!C7961j6.this.f21703Q.mo30606c(this.f21711a.getElement())) {
                return true;
            }
            this.f21711a = null;
            return false;
        }

        public void remove() {
            C8277y.m39486a(this.f21712b != null);
            C7961j6.this.mo29894c(this.f21712b.getElement(), 0);
            this.f21712b = null;
        }

        public C7983a<E> next() {
            if (hasNext()) {
                C7983a<E> a = C7961j6.this.m38117b(this.f21711a);
                this.f21712b = a;
                if (this.f21711a.f21719S == C7961j6.this.f21704R) {
                    this.f21711a = null;
                } else {
                    this.f21711a = this.f21711a.f21719S;
                }
                return a;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.google.common.collect.j6$d */
    /* compiled from: TreeMultiset */
    static /* synthetic */ class C7965d {

        /* renamed from: a */
        static final /* synthetic */ int[] f21713a = new int[C8209u.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.google.common.collect.u[] r0 = com.google.common.collect.C8209u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21713a = r0
                int[] r0 = f21713a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.common.collect.u r1 = com.google.common.collect.C8209u.OPEN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f21713a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.common.collect.u r1 = com.google.common.collect.C8209u.CLOSED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C7961j6.C7965d.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.collect.j6$e */
    /* compiled from: TreeMultiset */
    private enum C7966e {
        SIZE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public int mo30725a(C7969f<?> fVar) {
                return fVar.f21722b;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public long mo30726b(@C5952h C7969f<?> fVar) {
                if (fVar == null) {
                    return 0;
                }
                return fVar.f21715O;
            }
        },
        DISTINCT {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public int mo30725a(C7969f<?> fVar) {
                return 1;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public long mo30726b(@C5952h C7969f<?> fVar) {
                if (fVar == null) {
                    return 0;
                }
                return (long) fVar.f21714N;
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract int mo30725a(C7969f<?> fVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract long mo30726b(@C5952h C7969f<?> fVar);
    }

    /* renamed from: com.google.common.collect.j6$f */
    /* compiled from: TreeMultiset */
    private static final class C7969f<E> extends C8013f<E> {
        /* access modifiers changed from: private */

        /* renamed from: N */
        public int f21714N;
        /* access modifiers changed from: private */

        /* renamed from: O */
        public long f21715O;

        /* renamed from: P */
        private int f21716P;
        /* access modifiers changed from: private */

        /* renamed from: Q */
        public C7969f<E> f21717Q;
        /* access modifiers changed from: private */

        /* renamed from: R */
        public C7969f<E> f21718R;
        /* access modifiers changed from: private */

        /* renamed from: S */
        public C7969f<E> f21719S;
        /* access modifiers changed from: private */

        /* renamed from: T */
        public C7969f<E> f21720T;
        /* access modifiers changed from: private */
        @C5952h

        /* renamed from: a */
        public final E f21721a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f21722b;

        C7969f(@C5952h E e, int i) {
            C7397x.m35670a(i > 0);
            this.f21721a = e;
            this.f21722b = i;
            this.f21715O = (long) i;
            this.f21714N = 1;
            this.f21716P = 1;
            this.f21717Q = null;
            this.f21718R = null;
        }

        /* renamed from: i */
        private C7969f<E> m38167i() {
            C7397x.m35676b(this.f21718R != null);
            C7969f<E> fVar = this.f21718R;
            this.f21718R = fVar.f21717Q;
            fVar.f21717Q = this;
            fVar.f21715O = this.f21715O;
            fVar.f21714N = this.f21714N;
            m38161f();
            fVar.m38163g();
            return fVar;
        }

        /* renamed from: j */
        private C7969f<E> m38169j(C7969f<E> fVar) {
            C7969f<E> fVar2 = this.f21718R;
            if (fVar2 == null) {
                return this.f21717Q;
            }
            this.f21718R = fVar2.m38169j(fVar);
            this.f21714N--;
            this.f21715O -= (long) fVar.f21722b;
            return m38158e();
        }

        /* renamed from: k */
        private C7969f<E> m38170k(C7969f<E> fVar) {
            C7969f<E> fVar2 = this.f21717Q;
            if (fVar2 == null) {
                return this.f21718R;
            }
            this.f21717Q = fVar2.m38170k(fVar);
            this.f21714N--;
            this.f21715O -= (long) fVar.f21722b;
            return m38158e();
        }

        /* renamed from: l */
        private static long m38171l(@C5952h C7969f<?> fVar) {
            if (fVar == null) {
                return 0;
            }
            return fVar.f21715O;
        }

        public int getCount() {
            return this.f21722b;
        }

        public E getElement() {
            return this.f21721a;
        }

        public String toString() {
            return C8003l4.m38354a(getElement(), getCount()).toString();
        }

        /* renamed from: d */
        private C7969f<E> m38157d() {
            int i = this.f21722b;
            this.f21722b = 0;
            C7961j6.m38118b(this.f21719S, this.f21720T);
            C7969f<E> fVar = this.f21717Q;
            if (fVar == null) {
                return this.f21718R;
            }
            C7969f<E> fVar2 = this.f21718R;
            if (fVar2 == null) {
                return fVar;
            }
            if (fVar.f21716P >= fVar2.f21716P) {
                C7969f<E> fVar3 = this.f21719S;
                fVar3.f21717Q = fVar.m38169j(fVar3);
                fVar3.f21718R = this.f21718R;
                fVar3.f21714N = this.f21714N - 1;
                fVar3.f21715O = this.f21715O - ((long) i);
                return fVar3.m38158e();
            }
            C7969f<E> fVar4 = this.f21720T;
            fVar4.f21718R = fVar2.m38170k(fVar4);
            fVar4.f21717Q = this.f21717Q;
            fVar4.f21714N = this.f21714N - 1;
            fVar4.f21715O = this.f21715O - ((long) i);
            return fVar4.m38158e();
        }

        /* renamed from: e */
        private C7969f<E> m38158e() {
            int a = m38144a();
            if (a == -2) {
                if (this.f21718R.m38144a() > 0) {
                    this.f21718R = this.f21718R.m38168j();
                }
                return m38167i();
            } else if (a != 2) {
                m38163g();
                return this;
            } else {
                if (this.f21717Q.m38144a() < 0) {
                    this.f21717Q = this.f21717Q.m38167i();
                }
                return m38168j();
            }
        }

        /* renamed from: f */
        private void m38161f() {
            m38165h();
            m38163g();
        }

        /* renamed from: g */
        private void m38163g() {
            this.f21716P = Math.max(m38166i(this.f21717Q), m38166i(this.f21718R)) + 1;
        }

        /* renamed from: h */
        private void m38165h() {
            this.f21714N = C7961j6.m38106a(this.f21717Q) + 1 + C7961j6.m38106a(this.f21718R);
            this.f21715O = ((long) this.f21722b) + m38171l(this.f21717Q) + m38171l(this.f21718R);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C7969f<E> mo30731c(Comparator<? super E> comparator, @C5952h E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.f21721a);
            if (compare < 0) {
                C7969f<E> fVar = this.f21717Q;
                if (fVar == null) {
                    iArr[0] = 0;
                    return i > 0 ? m38148a(e, i) : this;
                }
                this.f21717Q = fVar.mo30731c(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f21714N--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f21714N++;
                }
                this.f21715O += (long) (i - iArr[0]);
                return m38158e();
            } else if (compare > 0) {
                C7969f<E> fVar2 = this.f21718R;
                if (fVar2 == null) {
                    iArr[0] = 0;
                    return i > 0 ? m38152b(e, i) : this;
                }
                this.f21718R = fVar2.mo30731c(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f21714N--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f21714N++;
                }
                this.f21715O += (long) (i - iArr[0]);
                return m38158e();
            } else {
                int i2 = this.f21722b;
                iArr[0] = i2;
                if (i == 0) {
                    return m38157d();
                }
                this.f21715O += (long) (i - i2);
                this.f21722b = i;
                return this;
            }
        }

        /* renamed from: b */
        private C7969f<E> m38152b(E e, int i) {
            this.f21718R = new C7969f<>(e, i);
            C7961j6.m38119b(this, this.f21718R, this.f21720T);
            this.f21716P = Math.max(2, this.f21716P);
            this.f21714N++;
            this.f21715O += (long) i;
            return this;
        }

        /* renamed from: a */
        public int mo30727a(Comparator<? super E> comparator, E e) {
            int compare = comparator.compare(e, this.f21721a);
            int i = 0;
            if (compare < 0) {
                C7969f<E> fVar = this.f21717Q;
                if (fVar != null) {
                    i = fVar.mo30727a(comparator, e);
                }
                return i;
            } else if (compare <= 0) {
                return this.f21722b;
            } else {
                C7969f<E> fVar2 = this.f21718R;
                if (fVar2 != null) {
                    i = fVar2.mo30727a(comparator, e);
                }
                return i;
            }
        }

        /* renamed from: j */
        private C7969f<E> m38168j() {
            C7397x.m35676b(this.f21717Q != null);
            C7969f<E> fVar = this.f21717Q;
            this.f21717Q = fVar.f21718R;
            fVar.f21718R = this;
            fVar.f21715O = this.f21715O;
            fVar.f21714N = this.f21714N;
            m38161f();
            fVar.m38163g();
            return fVar;
        }

        /* renamed from: a */
        private C7969f<E> m38148a(E e, int i) {
            this.f21717Q = new C7969f<>(e, i);
            C7961j6.m38119b(this.f21719S, this.f21717Q, this);
            this.f21716P = Math.max(2, this.f21716P);
            this.f21714N++;
            this.f21715O += (long) i;
            return this;
        }

        /* renamed from: i */
        private static int m38166i(@C5952h C7969f<?> fVar) {
            if (fVar == null) {
                return 0;
            }
            return fVar.f21716P;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7969f<E> mo30730b(Comparator<? super E> comparator, @C5952h E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.f21721a);
            if (compare < 0) {
                C7969f<E> fVar = this.f21717Q;
                if (fVar == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f21717Q = fVar.mo30730b(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.f21714N--;
                        this.f21715O -= (long) iArr[0];
                    } else {
                        this.f21715O -= (long) i;
                    }
                }
                return iArr[0] == 0 ? this : m38158e();
            } else if (compare > 0) {
                C7969f<E> fVar2 = this.f21718R;
                if (fVar2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f21718R = fVar2.mo30730b(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.f21714N--;
                        this.f21715O -= (long) iArr[0];
                    } else {
                        this.f21715O -= (long) i;
                    }
                }
                return m38158e();
            } else {
                int i2 = this.f21722b;
                iArr[0] = i2;
                if (i >= i2) {
                    return m38157d();
                }
                this.f21722b = i2 - i;
                this.f21715O -= (long) i;
                return this;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C7969f<E> mo30729a(Comparator<? super E> comparator, @C5952h E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.f21721a);
            boolean z = true;
            if (compare < 0) {
                C7969f<E> fVar = this.f21717Q;
                if (fVar == null) {
                    iArr[0] = 0;
                    return m38148a(e, i);
                }
                int i2 = fVar.f21716P;
                this.f21717Q = fVar.mo30729a(comparator, e, i, iArr);
                if (iArr[0] == 0) {
                    this.f21714N++;
                }
                this.f21715O += (long) i;
                return this.f21717Q.f21716P == i2 ? this : m38158e();
            } else if (compare > 0) {
                C7969f<E> fVar2 = this.f21718R;
                if (fVar2 == null) {
                    iArr[0] = 0;
                    return m38152b(e, i);
                }
                int i3 = fVar2.f21716P;
                this.f21718R = fVar2.mo30729a(comparator, e, i, iArr);
                if (iArr[0] == 0) {
                    this.f21714N++;
                }
                this.f21715O += (long) i;
                return this.f21718R.f21716P == i3 ? this : m38158e();
            } else {
                int i4 = this.f21722b;
                iArr[0] = i4;
                long j = (long) i;
                if (((long) i4) + j > 2147483647L) {
                    z = false;
                }
                C7397x.m35670a(z);
                this.f21722b += i;
                this.f21715O += j;
                return this;
            }
        }

        /* access modifiers changed from: private */
        @C5952h
        /* renamed from: c */
        public C7969f<E> m38155c(Comparator<? super E> comparator, E e) {
            int compare = comparator.compare(e, this.f21721a);
            if (compare > 0) {
                C7969f<E> fVar = this.f21718R;
                return fVar == null ? this : (C7969f) C5827t.m25564b(fVar.m38155c(comparator, e), this);
            } else if (compare == 0) {
                return this;
            } else {
                C7969f<E> fVar2 = this.f21717Q;
                return fVar2 == null ? null : fVar2.m38155c(comparator, e);
            }
        }

        /* access modifiers changed from: private */
        @C5952h
        /* renamed from: b */
        public C7969f<E> m38153b(Comparator<? super E> comparator, E e) {
            int compare = comparator.compare(e, this.f21721a);
            if (compare < 0) {
                C7969f<E> fVar = this.f21717Q;
                return fVar == null ? this : (C7969f) C5827t.m25564b(fVar.m38153b(comparator, e), this);
            } else if (compare == 0) {
                return this;
            } else {
                C7969f<E> fVar2 = this.f21718R;
                return fVar2 == null ? null : fVar2.m38153b(comparator, e);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C7969f<E> mo30728a(Comparator<? super E> comparator, @C5952h E e, int i, int i2, int[] iArr) {
            int compare = comparator.compare(e, this.f21721a);
            if (compare < 0) {
                C7969f<E> fVar = this.f21717Q;
                if (fVar == null) {
                    iArr[0] = 0;
                    return (i != 0 || i2 <= 0) ? this : m38148a(e, i2);
                }
                this.f21717Q = fVar.mo30728a(comparator, e, i, i2, iArr);
                if (iArr[0] == i) {
                    if (i2 == 0 && iArr[0] != 0) {
                        this.f21714N--;
                    } else if (i2 > 0 && iArr[0] == 0) {
                        this.f21714N++;
                    }
                    this.f21715O += (long) (i2 - iArr[0]);
                }
                return m38158e();
            } else if (compare > 0) {
                C7969f<E> fVar2 = this.f21718R;
                if (fVar2 == null) {
                    iArr[0] = 0;
                    return (i != 0 || i2 <= 0) ? this : m38152b(e, i2);
                }
                this.f21718R = fVar2.mo30728a(comparator, e, i, i2, iArr);
                if (iArr[0] == i) {
                    if (i2 == 0 && iArr[0] != 0) {
                        this.f21714N--;
                    } else if (i2 > 0 && iArr[0] == 0) {
                        this.f21714N++;
                    }
                    this.f21715O += (long) (i2 - iArr[0]);
                }
                return m38158e();
            } else {
                int i3 = this.f21722b;
                iArr[0] = i3;
                if (i == i3) {
                    if (i2 == 0) {
                        return m38157d();
                    }
                    this.f21715O += (long) (i2 - i3);
                    this.f21722b = i2;
                }
                return this;
            }
        }

        /* renamed from: a */
        private int m38144a() {
            return m38166i(this.f21717Q) - m38166i(this.f21718R);
        }
    }

    /* renamed from: com.google.common.collect.j6$g */
    /* compiled from: TreeMultiset */
    private static final class C7970g<T> {
        @C5952h

        /* renamed from: a */
        private T f21723a;

        private C7970g() {
        }

        @C5952h
        /* renamed from: a */
        public T mo30733a() {
            return this.f21723a;
        }

        /* synthetic */ C7970g(C7962a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo30734a(@C5952h T t, T t2) {
            if (this.f21723a == t) {
                this.f21723a = t2;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    C7961j6(C7970g<C7969f<E>> gVar, C7898i2<E> i2Var, C7969f<E> fVar) {
        super(i2Var.mo30603a());
        this.f21702P = gVar;
        this.f21703Q = i2Var;
        this.f21704R = fVar;
    }

    /* renamed from: n */
    public static <E extends Comparable> C7961j6<E> m38122n() {
        return new C7961j6<>(C8133r4.m38943j());
    }

    /* access modifiers changed from: private */
    @C5952h
    /* renamed from: o */
    public C7969f<E> m38123o() {
        C7969f<E> fVar;
        if (((C7969f) this.f21702P.mo30733a()) == null) {
            return null;
        }
        if (this.f21703Q.mo30612h()) {
            Object e = this.f21703Q.mo30608e();
            C7969f<E> b = ((C7969f) this.f21702P.mo30733a()).m38153b(comparator(), e);
            if (b == null) {
                return null;
            }
            if (this.f21703Q.mo30607d() == C8209u.OPEN && comparator().compare(e, b.getElement()) == 0) {
                b = b.f21720T;
            }
            fVar = b;
        } else {
            fVar = this.f21704R.f21720T;
        }
        if (fVar == this.f21704R || !this.f21703Q.mo30604a(fVar.getElement())) {
            fVar = null;
        }
        return fVar;
    }

    /* access modifiers changed from: private */
    @C5952h
    /* renamed from: p */
    public C7969f<E> m38124p() {
        C7969f<E> fVar;
        if (((C7969f) this.f21702P.mo30733a()) == null) {
            return null;
        }
        if (this.f21703Q.mo30614i()) {
            Object g = this.f21703Q.mo30611g();
            C7969f<E> a = ((C7969f) this.f21702P.mo30733a()).m38155c(comparator(), g);
            if (a == null) {
                return null;
            }
            if (this.f21703Q.mo30610f() == C8209u.OPEN && comparator().compare(g, a.getElement()) == 0) {
                a = a.f21719S;
            }
            fVar = a;
        } else {
            fVar = this.f21704R.f21719S;
        }
        if (fVar == this.f21704R || !this.f21703Q.mo30604a(fVar.getElement())) {
            fVar = null;
        }
        return fVar;
    }

    @C2777c("java.io.ObjectInputStream")
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        C7984k5.m38239a(C8024m.class, "comparator").mo30742a(this, (Object) comparator);
        C7984k5.m38239a(C7961j6.class, RangeValidateElement.METHOD).mo30742a(this, (Object) C7898i2.m37763a(comparator));
        C7984k5.m38239a(C7961j6.class, "rootReference").mo30742a(this, (Object) new C7970g(null));
        C7969f fVar = new C7969f(null, 1);
        C7984k5.m38239a(C7961j6.class, Header.ELEMENT).mo30742a(this, (Object) fVar);
        m38118b(fVar, fVar);
        C7984k5.m38243a((C7982k4<E>) this, objectInputStream);
    }

    @C2777c("java.io.ObjectOutputStream")
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(mo29710h().comparator());
        C7984k5.m38245a((C7982k4<E>) this, objectOutputStream);
    }

    /* renamed from: B */
    public /* bridge */ /* synthetic */ C8240v5 mo30112B() {
        return super.mo30112B();
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C8240v5 mo30118a(Object obj, C8209u uVar, Object obj2, C8209u uVar2) {
        return super.mo30118a(obj, uVar, obj2, uVar2);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return super.addAll(collection);
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ C7983a firstEntry() {
        return super.firstEntry();
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ SortedSet mo29710h() {
        return super.mo29710h();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo30100j() {
        return C6637f.m31672b(m38107a(C7966e.DISTINCT));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public Iterator<C7983a<E>> mo30101k() {
        return new C7963b();
    }

    public /* bridge */ /* synthetic */ C7983a lastEntry() {
        return super.lastEntry();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public Iterator<C7983a<E>> mo30718m() {
        return new C7964c();
    }

    public /* bridge */ /* synthetic */ C7983a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    public /* bridge */ /* synthetic */ C7983a pollLastEntry() {
        return super.pollLastEntry();
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public int size() {
        return C6637f.m31672b(m38107a(C7966e.SIZE));
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: b */
    private long m38115b(C7966e eVar, @C5952h C7969f<E> fVar) {
        long b;
        long b2;
        if (fVar == null) {
            return 0;
        }
        int compare = comparator().compare(this.f21703Q.mo30608e(), fVar.f21721a);
        if (compare < 0) {
            return m38115b(eVar, fVar.f21717Q);
        }
        if (compare == 0) {
            int i = C7965d.f21713a[this.f21703Q.mo30607d().ordinal()];
            if (i == 1) {
                b = (long) eVar.mo30725a(fVar);
                b2 = eVar.mo30726b(fVar.f21717Q);
            } else if (i == 2) {
                return eVar.mo30726b(fVar.f21717Q);
            } else {
                throw new AssertionError();
            }
        } else {
            b = eVar.mo30726b(fVar.f21717Q) + ((long) eVar.mo30725a(fVar));
            b2 = m38115b(eVar, fVar.f21718R);
        }
        return b + b2;
    }

    /* renamed from: c */
    public int mo29894c(@C5952h E e, int i) {
        C8277y.m39484a(i, "count");
        boolean z = true;
        if (!this.f21703Q.mo30604a(e)) {
            if (i != 0) {
                z = false;
            }
            C7397x.m35670a(z);
            return 0;
        }
        C7969f fVar = (C7969f) this.f21702P.mo30733a();
        if (fVar == null) {
            if (i > 0) {
                mo29893b(e, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.f21702P.mo30734a(fVar, fVar.mo30731c(comparator(), e, i, iArr));
        return iArr[0];
    }

    C7961j6(Comparator<? super E> comparator) {
        super(comparator);
        this.f21703Q = C7898i2.m37763a(comparator);
        this.f21704R = new C7969f<>(null, 1);
        C7969f<E> fVar = this.f21704R;
        m38118b(fVar, fVar);
        this.f21702P = new C7970g<>(null);
    }

    /* renamed from: a */
    public static <E> C7961j6<E> m38111a(@C5952h Comparator<? super E> comparator) {
        return comparator == null ? new C7961j6<>(C8133r4.m38943j()) : new C7961j6(comparator);
    }

    /* renamed from: a */
    public static <E extends Comparable> C7961j6<E> m38110a(Iterable<? extends E> iterable) {
        C7961j6<E> n = m38122n();
        C8145s3.m39018a((Collection<T>) n, iterable);
        return n;
    }

    /* renamed from: a */
    private long m38107a(C7966e eVar) {
        C7969f fVar = (C7969f) this.f21702P.mo30733a();
        long b = eVar.mo30726b(fVar);
        if (this.f21703Q.mo30612h()) {
            b -= m38115b(eVar, fVar);
        }
        return this.f21703Q.mo30614i() ? b - m38108a(eVar, fVar) : b;
    }

    /* renamed from: b */
    public int mo29708b(@C5952h Object obj) {
        try {
            C7969f fVar = (C7969f) this.f21702P.mo30733a();
            if (this.f21703Q.mo30604a(obj)) {
                if (fVar != null) {
                    return fVar.mo30727a(comparator(), obj);
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    /* renamed from: b */
    public int mo29893b(@C5952h E e, int i) {
        C8277y.m39484a(i, "occurrences");
        if (i == 0) {
            return mo29708b((Object) e);
        }
        C7397x.m35670a(this.f21703Q.mo30604a(e));
        C7969f fVar = (C7969f) this.f21702P.mo30733a();
        if (fVar == null) {
            comparator().compare(e, e);
            C7969f fVar2 = new C7969f(e, i);
            C7969f<E> fVar3 = this.f21704R;
            m38119b(fVar3, fVar2, fVar3);
            this.f21702P.mo30734a(fVar, fVar2);
            return 0;
        }
        int[] iArr = new int[1];
        this.f21702P.mo30734a(fVar, fVar.mo30729a(comparator(), e, i, iArr));
        return iArr[0];
    }

    /* renamed from: a */
    private long m38108a(C7966e eVar, @C5952h C7969f<E> fVar) {
        long b;
        long a;
        if (fVar == null) {
            return 0;
        }
        int compare = comparator().compare(this.f21703Q.mo30611g(), fVar.f21721a);
        if (compare > 0) {
            return m38108a(eVar, fVar.f21718R);
        }
        if (compare == 0) {
            int i = C7965d.f21713a[this.f21703Q.mo30610f().ordinal()];
            if (i == 1) {
                b = (long) eVar.mo30725a(fVar);
                a = eVar.mo30726b(fVar.f21718R);
            } else if (i == 2) {
                return eVar.mo30726b(fVar.f21718R);
            } else {
                throw new AssertionError();
            }
        } else {
            b = eVar.mo30726b(fVar.f21718R) + ((long) eVar.mo30725a(fVar));
            a = m38108a(eVar, fVar.f21717Q);
        }
        return b + a;
    }

    /* renamed from: a */
    public int mo29818a(@C5952h Object obj, int i) {
        C8277y.m39484a(i, "occurrences");
        if (i == 0) {
            return mo29708b(obj);
        }
        C7969f fVar = (C7969f) this.f21702P.mo30733a();
        int[] iArr = new int[1];
        try {
            if (this.f21703Q.mo30604a(obj)) {
                if (fVar != null) {
                    this.f21702P.mo30734a(fVar, fVar.mo30730b(comparator(), obj, i, iArr));
                    return iArr[0];
                }
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C7983a<E> m38117b(C7969f<E> fVar) {
        return new C7962a(fVar);
    }

    /* renamed from: b */
    public C8240v5<E> mo30119b(@C5952h E e, C8209u uVar) {
        return new C7961j6(this.f21702P, this.f21703Q.mo30602a(C7898i2.m37764a(comparator(), e, uVar)), this.f21704R);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <T> void m38118b(C7969f<T> fVar, C7969f<T> fVar2) {
        fVar.f21720T = fVar2;
        fVar2.f21719S = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <T> void m38119b(C7969f<T> fVar, C7969f<T> fVar2, C7969f<T> fVar3) {
        m38118b(fVar, fVar2);
        m38118b(fVar2, fVar3);
    }

    /* renamed from: a */
    public boolean mo29892a(@C5952h E e, int i, int i2) {
        C8277y.m39484a(i2, "newCount");
        C8277y.m39484a(i, "oldCount");
        C7397x.m35670a(this.f21703Q.mo30604a(e));
        C7969f fVar = (C7969f) this.f21702P.mo30733a();
        boolean z = false;
        if (fVar != null) {
            int[] iArr = new int[1];
            this.f21702P.mo30734a(fVar, fVar.mo30728a(comparator(), e, i, i2, iArr));
            if (iArr[0] == i) {
                z = true;
            }
            return z;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 > 0) {
                mo29893b(e, i2);
            }
            return true;
        }
    }

    /* renamed from: a */
    public C8240v5<E> mo30117a(@C5952h E e, C8209u uVar) {
        return new C7961j6(this.f21702P, this.f21703Q.mo30602a(C7898i2.m37766b(comparator(), e, uVar)), this.f21704R);
    }

    /* renamed from: a */
    static int m38106a(@C5952h C7969f<?> fVar) {
        if (fVar == null) {
            return 0;
        }
        return fVar.f21714N;
    }
}
