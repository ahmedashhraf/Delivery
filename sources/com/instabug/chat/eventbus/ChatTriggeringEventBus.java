package com.instabug.chat.eventbus;

import com.instabug.library.core.eventbus.EventBus;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ChatTriggeringEventBus extends EventBus<C9414a> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static ChatTriggeringEventBus instance;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1659582188428884084L, "com/instabug/chat/eventbus/ChatTriggeringEventBus", 5);
        $jacocoData = a;
        return a;
    }

    public ChatTriggeringEventBus() {
        $jacocoInit()[0] = true;
    }

    public static ChatTriggeringEventBus getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (instance != null) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            instance = new ChatTriggeringEventBus();
            $jacocoInit[3] = true;
        }
        ChatTriggeringEventBus chatTriggeringEventBus = instance;
        $jacocoInit[4] = true;
        return chatTriggeringEventBus;
    }
}
