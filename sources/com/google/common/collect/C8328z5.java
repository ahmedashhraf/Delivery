package com.google.common.collect;

import com.google.common.collect.C7677d6.C7678a;
import com.google.common.collect.C8302z2.C8303a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.p203u.C5967b;

@C2776b
@C5967b
/* renamed from: com.google.common.collect.z5 */
/* compiled from: SparseImmutableTable */
final class C8328z5<R, C, V> extends C7868g5<R, C, V> {

    /* renamed from: O */
    private final C8302z2<R, Map<C, V>> f22217O;

    /* renamed from: P */
    private final C8302z2<C, Map<R, V>> f22218P;

    /* renamed from: Q */
    private final int[] f22219Q;

    /* renamed from: R */
    private final int[] f22220R;

    C8328z5(C8257x2<C7678a<R, C, V>> x2Var, C7859g3<R> g3Var, C7859g3<C> g3Var2) {
        HashMap c = C7800f4.m37335c();
        LinkedHashMap e = C7800f4.m37347e();
        Iterator it = g3Var.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            c.put(next, Integer.valueOf(e.size()));
            e.put(next, new LinkedHashMap());
        }
        LinkedHashMap e2 = C7800f4.m37347e();
        Iterator it2 = g3Var2.iterator();
        while (it2.hasNext()) {
            e2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[x2Var.size()];
        int[] iArr2 = new int[x2Var.size()];
        int i = 0;
        while (i < x2Var.size()) {
            C7678a aVar = (C7678a) x2Var.get(i);
            Object d = aVar.mo29993d();
            Object a = aVar.mo29992a();
            Object value = aVar.getValue();
            iArr[i] = ((Integer) c.get(d)).intValue();
            Map map = (Map) e.get(d);
            iArr2[i] = map.size();
            Object put = map.put(a, value);
            if (put == null) {
                ((Map) e2.get(a)).put(d, value);
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Duplicate value for row=");
                sb.append(d);
                sb.append(", column=");
                sb.append(a);
                sb.append(": ");
                sb.append(value);
                sb.append(", ");
                sb.append(put);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.f22219Q = iArr;
        this.f22220R = iArr2;
        C8303a g = C8302z2.m39628g();
        for (Entry entry : e.entrySet()) {
            g.mo30687a(entry.getKey(), C8302z2.m39622a((Map) entry.getValue()));
        }
        this.f22217O = g.mo30690a();
        C8303a g2 = C8302z2.m39628g();
        for (Entry entry2 : e2.entrySet()) {
            g2.mo30687a(entry2.getKey(), C8302z2.m39622a((Map) entry2.getValue()));
        }
        this.f22218P = g2.mo30690a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7678a<R, C, V> mo30512a(int i) {
        Entry entry = (Entry) this.f22217O.entrySet().mo30933e().get(this.f22219Q[i]);
        C8302z2 z2Var = (C8302z2) entry.getValue();
        Entry entry2 = (Entry) z2Var.entrySet().mo30933e().get(this.f22220R[i]);
        return C8094p3.m38754b(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public V mo30513b(int i) {
        C8302z2 z2Var = (C8302z2) this.f22217O.values().mo30933e().get(this.f22219Q[i]);
        return z2Var.values().mo30933e().get(this.f22220R[i]);
    }

    public int size() {
        return this.f22219Q.length;
    }

    /* renamed from: v */
    public C8302z2<R, Map<C, V>> m39687v() {
        return this.f22217O;
    }

    /* renamed from: w */
    public C8302z2<C, Map<R, V>> m39689w() {
        return this.f22218P;
    }
}
