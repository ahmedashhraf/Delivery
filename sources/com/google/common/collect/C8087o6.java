package com.google.common.collect;

import java.io.Serializable;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.o6 */
/* compiled from: UsingToStringOrdering */
final class C8087o6 extends C8133r4<Object> implements Serializable {

    /* renamed from: N */
    static final C8087o6 f21888N = new C8087o6();
    private static final long serialVersionUID = 0;

    private C8087o6() {
    }

    private Object readResolve() {
        return f21888N;
    }

    public int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
