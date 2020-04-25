package com.google.common.collect;

import com.google.common.collect.C7982k4.C7983a;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.b5 */
/* compiled from: RegularImmutableMultiset */
class C7579b5<E> extends C7793f3<E> {

    /* renamed from: O */
    private final transient C8302z2<E, Integer> f21144O;

    /* renamed from: P */
    private final transient int f21145P;

    C7579b5(C8302z2<E, Integer> z2Var, int i) {
        this.f21144O = z2Var;
        this.f21145P = i;
    }

    /* renamed from: b */
    public int mo29708b(@C5952h Object obj) {
        Integer num = (Integer) this.f21144O.get(obj);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public boolean contains(@C5952h Object obj) {
        return this.f21144O.containsKey(obj);
    }

    public int hashCode() {
        return this.f21144O.hashCode();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return this.f21144O.mo29643f();
    }

    public int size() {
        return this.f21145P;
    }

    /* renamed from: h */
    public C7859g3<E> m36370h() {
        return this.f21144O.keySet();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C7983a<E> mo29709b(int i) {
        Entry entry = (Entry) this.f21144O.entrySet().mo30933e().get(i);
        return C8003l4.m38354a(entry.getKey(), ((Integer) entry.getValue()).intValue());
    }
}
