package com.instabug.library.core.eventbus.coreeventbus;

import p205i.p471b.p472a.p473a.p474c.C13938g;

public class SDKCoreEvent {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private String type;
    private String value;

    public static class Feature {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String TYPE_FEATURES = "features";
        public static final String VALUE_FETCHED = "fetched";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2898600038073157038L, "com/instabug/library/core/eventbus/coreeventbus/SDKCoreEvent$Feature", 1);
            $jacocoData = a;
            return a;
        }

        public Feature() {
            $jacocoInit()[0] = true;
        }
    }

    public static class ForegroundStatus {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String TYPE_FOREGROUNDS_STATUS = "foreground_status";
        public static final String VALUE_AVAILABLE = "available";
        public static final String VALUE_BUSY = "busy";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4394130589518702571L, "com/instabug/library/core/eventbus/coreeventbus/SDKCoreEvent$ForegroundStatus", 1);
            $jacocoData = a;
            return a;
        }

        public ForegroundStatus() {
            $jacocoInit()[0] = true;
        }
    }

    public static class Invocation {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String TYPE_INVOCATION = "invocation";
        public static final String VALUE_DISMISSED = "dismissed";
        public static final String VALUE_INVOKED = "invoked";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3507749182140809943L, "com/instabug/library/core/eventbus/coreeventbus/SDKCoreEvent$Invocation", 1);
            $jacocoData = a;
            return a;
        }

        public Invocation() {
            $jacocoInit()[0] = true;
        }
    }

    public static class Network {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String TYPE_NETWORK = "network";
        public static final String VALUE_ACTIVATED = "activated";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5336261141440724328L, "com/instabug/library/core/eventbus/coreeventbus/SDKCoreEvent$Network", 1);
            $jacocoData = a;
            return a;
        }

        public Network() {
            $jacocoInit()[0] = true;
        }
    }

    public static class Session {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String TYPE_SESSION = "session";
        public static final String VALUE_FINISHED = "finished";
        public static final String VALUE_STARTED = "started";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4344076338704111944L, "com/instabug/library/core/eventbus/coreeventbus/SDKCoreEvent$Session", 1);
            $jacocoData = a;
            return a;
        }

        public Session() {
            $jacocoInit()[0] = true;
        }
    }

    public static class User {
        private static transient /* synthetic */ boolean[] $jacocoData = null;
        public static final String TYPE_USER = "user";
        public static final String VALUE_LOGGED_IN = "logged_in";
        public static final String VALUE_LOGGED_OUT = "logged_out";

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7282986489174530344L, "com/instabug/library/core/eventbus/coreeventbus/SDKCoreEvent$User", 1);
            $jacocoData = a;
            return a;
        }

        public User() {
            $jacocoInit()[0] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3823800688001086135L, "com/instabug/library/core/eventbus/coreeventbus/SDKCoreEvent", 4);
        $jacocoData = a;
        return a;
    }

    public SDKCoreEvent(String str, String str2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.type = str;
        this.value = str2;
        $jacocoInit[0] = true;
    }

    public String getType() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.type;
        $jacocoInit[1] = true;
        return str;
    }

    public String getValue() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.value;
        $jacocoInit[2] = true;
        return str;
    }

    public String toString() {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append("type: ");
        sb.append(this.type);
        sb.append(", value: ");
        sb.append(this.value);
        String sb2 = sb.toString();
        $jacocoInit[3] = true;
        return sb2;
    }
}
