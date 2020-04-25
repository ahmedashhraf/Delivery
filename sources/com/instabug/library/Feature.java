package com.instabug.library;

import p205i.p471b.p472a.p473a.p474c.C13938g;

public enum Feature {
    INSTABUG,
    CRASH_REPORTING,
    PUSH_NOTIFICATION,
    WHITE_LABELING,
    IN_APP_MESSAGING,
    TRACK_USER_STEPS,
    REPRO_STEPS,
    MULTIPLE_ATTACHMENTS,
    INSTABUG_LOGS,
    USER_DATA,
    CONSOLE_LOGS,
    SURVEYS,
    VIEW_HIERARCHY,
    USER_EVENTS,
    DISCLAIMER,
    SESSION_PROFILER,
    FEATURE_REQUESTS,
    VP_CUSTOMIZATION;

    public enum State {
        private static final /* synthetic */ State[] $VALUES = null;
        private static transient /* synthetic */ boolean[] $jacocoData;
        public static final State DISABLED = null;
        public static final State ENABLED = null;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6060326337862521389L, "com/instabug/library/Feature$State", 5);
            $jacocoData = a;
            return a;
        }

        static {
            boolean[] $jacocoInit = $jacocoInit();
            ENABLED = new State("ENABLED", 0);
            $jacocoInit[3] = true;
            DISABLED = new State("DISABLED", 1);
            $VALUES = new State[]{ENABLED, DISABLED};
            $jacocoInit[4] = true;
        }

        private State(String str, int i) {
            $jacocoInit()[2] = true;
        }

        public static State valueOf(String str) {
            State state = (State) Enum.valueOf(State.class, str);
            $jacocoInit()[1] = true;
            return state;
        }

        public static State[] values() {
            State[] stateArr = (State[]) $VALUES.clone();
            $jacocoInit()[0] = true;
            return stateArr;
        }
    }

    static {
        boolean[] d;
        d[20] = true;
    }
}
