package org.apache.commons.logging.p527j;

import java.util.Enumeration;

/* renamed from: org.apache.commons.logging.j.n */
/* compiled from: WeakHashtable */
class C15111n implements Enumeration {

    /* renamed from: a */
    private final /* synthetic */ Enumeration f43969a;

    /* renamed from: b */
    private final /* synthetic */ C15112o f43970b;

    C15111n(C15112o oVar, Enumeration enumeration) {
        this.f43970b = oVar;
        this.f43969a = enumeration;
    }

    public boolean hasMoreElements() {
        return this.f43969a.hasMoreElements();
    }

    public Object nextElement() {
        return ((C15114b) this.f43969a.nextElement()).m67158a();
    }
}
