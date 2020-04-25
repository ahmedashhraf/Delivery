package com.instabug.library.core.eventbus.coreeventbus;

import p205i.p471b.p472a.p473a.p474c.C13938g;

public class SDKCoreEventPublisher {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8817748422884111195L, "com/instabug/library/core/eventbus/coreeventbus/SDKCoreEventPublisher", 2);
        $jacocoData = a;
        return a;
    }

    public SDKCoreEventPublisher() {
        $jacocoInit()[0] = true;
    }

    public static void post(SDKCoreEvent sDKCoreEvent) {
        boolean[] $jacocoInit = $jacocoInit();
        SDKCoreEventBus.getInstance().post(sDKCoreEvent);
        $jacocoInit[1] = true;
    }
}
