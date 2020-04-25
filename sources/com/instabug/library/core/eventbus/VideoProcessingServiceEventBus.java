package com.instabug.library.core.eventbus;

import com.instabug.library.internal.video.VideoProcessingService.Action;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class VideoProcessingServiceEventBus extends EventBus<Action> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static VideoProcessingServiceEventBus instance;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5927688437869104645L, "com/instabug/library/core/eventbus/VideoProcessingServiceEventBus", 5);
        $jacocoData = a;
        return a;
    }

    public VideoProcessingServiceEventBus() {
        $jacocoInit()[0] = true;
    }

    public static VideoProcessingServiceEventBus getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (instance != null) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            instance = new VideoProcessingServiceEventBus();
            $jacocoInit[3] = true;
        }
        VideoProcessingServiceEventBus videoProcessingServiceEventBus = instance;
        $jacocoInit[4] = true;
        return videoProcessingServiceEventBus;
    }
}
