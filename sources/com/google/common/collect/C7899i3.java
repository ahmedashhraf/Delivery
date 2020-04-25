package com.google.common.collect;

import java.util.Comparator;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.i3 */
/* compiled from: ImmutableSortedAsList */
final class C7899i3<E> extends C8274x4<E> implements C8138r5<E> {
    C7899i3(C8068n3<E> n3Var, C8257x2<E> x2Var) {
        super((C8175t2<E>) n3Var, x2Var);
    }

    /* access modifiers changed from: 0000 */
    @C2777c("super.subListUnchecked does not exist; inherited subList is valid if slow")
    /* renamed from: a */
    public C8257x2<E> mo30618a(int i, int i2) {
        return new C7846f5(super.mo30618a(i, i2), comparator()).mo30933e();
    }

    public Comparator<? super E> comparator() {
        return m37782n().comparator();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @C2777c("ImmutableSortedSet.indexOf")
    public int indexOf(@C5952h Object obj) {
        int indexOf = m37782n().indexOf(obj);
        if (indexOf < 0 || !get(indexOf).equals(obj)) {
            return -1;
        }
        return indexOf;
    }

    @C2777c("ImmutableSortedSet.indexOf")
    public int lastIndexOf(@C5952h Object obj) {
        return indexOf(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public C8068n3<E> m37782n() {
        return (C8068n3) super.mo29826n();
    }
}
