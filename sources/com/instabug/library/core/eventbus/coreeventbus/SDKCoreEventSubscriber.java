package com.instabug.library.core.eventbus.coreeventbus;

import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class SDKCoreEventSubscriber {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-6027131211716368152L, "com/instabug/library/core/eventbus/coreeventbus/SDKCoreEventSubscriber", 2);
        $jacocoData = a;
        return a;
    }

    public SDKCoreEventSubscriber() {
        $jacocoInit()[0] = true;
    }

    public static C12314c subscribe(C12331g<SDKCoreEvent> gVar) {
        boolean[] $jacocoInit = $jacocoInit();
        C12314c subscribe = SDKCoreEventBus.getInstance().subscribe(gVar);
        $jacocoInit[1] = true;
        return subscribe;
    }
}
