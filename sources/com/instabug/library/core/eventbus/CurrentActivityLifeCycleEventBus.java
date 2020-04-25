package com.instabug.library.core.eventbus;

import com.instabug.library.tracking.ActivityLifeCycleEvent;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class CurrentActivityLifeCycleEventBus extends EventBus<ActivityLifeCycleEvent> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static CurrentActivityLifeCycleEventBus instance;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2024599781282919137L, "com/instabug/library/core/eventbus/CurrentActivityLifeCycleEventBus", 5);
        $jacocoData = a;
        return a;
    }

    public CurrentActivityLifeCycleEventBus() {
        $jacocoInit()[0] = true;
    }

    public static CurrentActivityLifeCycleEventBus getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (instance != null) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            instance = new CurrentActivityLifeCycleEventBus();
            $jacocoInit[3] = true;
        }
        CurrentActivityLifeCycleEventBus currentActivityLifeCycleEventBus = instance;
        $jacocoInit[4] = true;
        return currentActivityLifeCycleEventBus;
    }
}
