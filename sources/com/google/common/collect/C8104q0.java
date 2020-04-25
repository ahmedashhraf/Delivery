package com.google.common.collect;

import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.q0 */
/* compiled from: EmptyImmutableBiMap */
final class C8104q0 extends C8125r2<Object, Object> {

    /* renamed from: R */
    static final C8104q0 f21909R = new C8104q0();

    private C8104q0() {
    }

    /* renamed from: a */
    public C7882h3<Object, Object> mo30950a() {
        return C7882h3.m37652s();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C7859g3<Entry<Object, Object>> mo29642d() {
        throw new AssertionError("should never be called");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo29643f() {
        return false;
    }

    public Object get(@C5952h Object obj) {
        return null;
    }

    public boolean isEmpty() {
        return true;
    }

    /* renamed from: k */
    public C8125r2<Object, Object> m38822k() {
        return this;
    }

    /* access modifiers changed from: 0000 */
    public Object readResolve() {
        return f21909R;
    }

    public int size() {
        return 0;
    }

    public C7859g3<Entry<Object, Object>> entrySet() {
        return C7859g3.m37512m();
    }

    public C7859g3<Object> keySet() {
        return C7859g3.m37512m();
    }
}
