package com.instabug.chat.eventbus;

import com.instabug.library.core.eventbus.EventBus;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ChatTimeUpdatedEventBus extends EventBus<Long> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static ChatTimeUpdatedEventBus instance;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1352421702768416246L, "com/instabug/chat/eventbus/ChatTimeUpdatedEventBus", 5);
        $jacocoData = a;
        return a;
    }

    public ChatTimeUpdatedEventBus() {
        $jacocoInit()[0] = true;
    }

    public static ChatTimeUpdatedEventBus getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (instance != null) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            instance = new ChatTimeUpdatedEventBus();
            $jacocoInit[3] = true;
        }
        ChatTimeUpdatedEventBus chatTimeUpdatedEventBus = instance;
        $jacocoInit[4] = true;
        return chatTimeUpdatedEventBus;
    }
}
