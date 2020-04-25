package com.instabug.library.core.eventbus;

import com.instabug.library.model.Session.SessionState;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class SessionStateEventBus extends EventBus<SessionState> {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static SessionStateEventBus instance;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3688411396345040831L, "com/instabug/library/core/eventbus/SessionStateEventBus", 5);
        $jacocoData = a;
        return a;
    }

    public SessionStateEventBus() {
        $jacocoInit()[0] = true;
    }

    public static SessionStateEventBus getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (instance != null) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            instance = new SessionStateEventBus();
            $jacocoInit[3] = true;
        }
        SessionStateEventBus sessionStateEventBus = instance;
        $jacocoInit[4] = true;
        return sessionStateEventBus;
    }
}
