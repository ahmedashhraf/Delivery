package com.instabug.library.core.eventbus.coreeventbus;

import com.instabug.library.core.eventbus.EventBus;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class SDKCoreEventBus extends EventBus<SDKCoreEvent> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static SDKCoreEventBus instance;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3171165277819466826L, "com/instabug/library/core/eventbus/coreeventbus/SDKCoreEventBus", 5);
        $jacocoData = a;
        return a;
    }

    public SDKCoreEventBus() {
        $jacocoInit()[0] = true;
    }

    static SDKCoreEventBus getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (instance != null) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            instance = new SDKCoreEventBus();
            $jacocoInit[3] = true;
        }
        SDKCoreEventBus sDKCoreEventBus = instance;
        $jacocoInit[4] = true;
        return sDKCoreEventBus;
    }
}
