package com.instabug.library.core.eventbus;

import p195e.p196a.C5923b0;
import p195e.p196a.p442e1.C12252e;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class EventBus<T> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private final C12252e<T> subject;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6088172130034698123L, "com/instabug/library/core/eventbus/EventBus", 6);
        $jacocoData = a;
        return a;
    }

    protected EventBus() {
        boolean[] $jacocoInit = $jacocoInit();
        this(C12252e.m55181U());
        $jacocoInit[0] = true;
    }

    public boolean hasObservers() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean R = this.subject.mo41899R();
        $jacocoInit[5] = true;
        return R;
    }

    public <E extends T> C5923b0<E> observeEvents(Class<E> cls) {
        boolean[] $jacocoInit = $jacocoInit();
        C5923b0<E> b = this.subject.mo23920b(cls);
        $jacocoInit[4] = true;
        return b;
    }

    public <E extends T> void post(E e) {
        boolean[] $jacocoInit = $jacocoInit();
        this.subject.mo33453a(e);
        $jacocoInit[2] = true;
    }

    public C12314c subscribe(C12331g<? super T> gVar) {
        boolean[] $jacocoInit = $jacocoInit();
        C12314c i = this.subject.mo24041i(gVar);
        $jacocoInit[3] = true;
        return i;
    }

    protected EventBus(C12252e<T> eVar) {
        boolean[] $jacocoInit = $jacocoInit();
        this.subject = eVar;
        $jacocoInit[1] = true;
    }
}
