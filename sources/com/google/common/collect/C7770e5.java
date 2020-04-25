package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C7982k4.C7983a;
import p076c.p112d.p148d.p150g.C6637f;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.collect.e5 */
/* compiled from: RegularImmutableSortedMultiset */
final class C7770e5<E> extends C8000l3<E> {

    /* renamed from: R */
    private final transient C7846f5<E> f21454R;

    /* renamed from: S */
    private final transient int[] f21455S;

    /* renamed from: T */
    private final transient long[] f21456T;

    /* renamed from: U */
    private final transient int f21457U;

    /* renamed from: V */
    private final transient int f21458V;

    C7770e5(C7846f5<E> f5Var, int[] iArr, long[] jArr, int i, int i2) {
        this.f21454R = f5Var;
        this.f21455S = iArr;
        this.f21456T = jArr;
        this.f21457U = i;
        this.f21458V = i2;
    }

    public C7983a<E> firstEntry() {
        return mo29709b(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return this.f21457U > 0 || this.f21458V < this.f21455S.length;
    }

    public C7983a<E> lastEntry() {
        return mo29709b(this.f21458V - 1);
    }

    public int size() {
        long[] jArr = this.f21456T;
        int i = this.f21457U;
        return C6637f.m31672b(jArr[this.f21458V + i] - jArr[i]);
    }

    /* renamed from: a */
    public C8000l3<E> m37127a(E e, C8209u uVar) {
        return mo30306a(0, this.f21454R.mo30447e(e, C7397x.m35664a(uVar) == C8209u.CLOSED));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C7983a<E> mo29709b(int i) {
        return C8003l4.m38354a(this.f21454R.mo30933e().get(i), this.f21455S[this.f21457U + i]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8000l3<E> mo30306a(int i, int i2) {
        C7397x.m35675b(i, i2, this.f21458V);
        if (i == i2) {
            return C8000l3.m38312a(comparator());
        }
        if (i == 0 && i2 == this.f21458V) {
            return this;
        }
        C7770e5 e5Var = new C7770e5((C7846f5) this.f21454R.mo30439a(i, i2), this.f21455S, this.f21456T, this.f21457U + i, i2 - i);
        return e5Var;
    }

    /* renamed from: b */
    public int mo29708b(@C5952h Object obj) {
        int indexOf = this.f21454R.indexOf(obj);
        if (indexOf == -1) {
            return 0;
        }
        return this.f21455S[indexOf + this.f21457U];
    }

    /* renamed from: h */
    public C8068n3<E> m37134h() {
        return this.f21454R;
    }

    /* renamed from: b */
    public C8000l3<E> m37131b(E e, C8209u uVar) {
        return mo30306a(this.f21454R.mo30450f(e, C7397x.m35664a(uVar) == C8209u.CLOSED), this.f21458V);
    }
}
