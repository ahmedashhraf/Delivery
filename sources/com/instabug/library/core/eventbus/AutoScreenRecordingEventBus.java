package com.instabug.library.core.eventbus;

import com.instabug.library.internal.video.AutoScreenRecordingService.Action;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class AutoScreenRecordingEventBus extends EventBus<Action> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static AutoScreenRecordingEventBus instance;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3890390423020789938L, "com/instabug/library/core/eventbus/AutoScreenRecordingEventBus", 5);
        $jacocoData = a;
        return a;
    }

    public AutoScreenRecordingEventBus() {
        $jacocoInit()[0] = true;
    }

    public static AutoScreenRecordingEventBus getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (instance != null) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            instance = new AutoScreenRecordingEventBus();
            $jacocoInit[3] = true;
        }
        AutoScreenRecordingEventBus autoScreenRecordingEventBus = instance;
        $jacocoInit[4] = true;
        return autoScreenRecordingEventBus;
    }
}
