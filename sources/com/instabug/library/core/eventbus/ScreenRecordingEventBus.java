package com.instabug.library.core.eventbus;

import com.instabug.library.internal.video.ScreenRecordEvent;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ScreenRecordingEventBus extends EventBus<ScreenRecordEvent> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static ScreenRecordingEventBus instance;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(389459159828033823L, "com/instabug/library/core/eventbus/ScreenRecordingEventBus", 5);
        $jacocoData = a;
        return a;
    }

    public ScreenRecordingEventBus() {
        $jacocoInit()[0] = true;
    }

    public static ScreenRecordingEventBus getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (instance != null) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            instance = new ScreenRecordingEventBus();
            $jacocoInit[3] = true;
        }
        ScreenRecordingEventBus screenRecordingEventBus = instance;
        $jacocoInit[4] = true;
        return screenRecordingEventBus;
    }
}
