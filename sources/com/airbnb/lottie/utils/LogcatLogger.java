package com.airbnb.lottie.utils;

import com.airbnb.lottie.C2801L;
import com.airbnb.lottie.LottieLogger;
import java.util.HashSet;
import java.util.Set;

public class LogcatLogger implements LottieLogger {
    private static final Set<String> loggedMessages = new HashSet();

    public void debug(String str) {
        debug(str, null);
    }

    public void warning(String str) {
        warning(str, null);
    }

    public void debug(String str, Throwable th) {
        boolean z = C2801L.DBG;
    }

    public void warning(String str, Throwable th) {
        if (!loggedMessages.contains(str)) {
            loggedMessages.add(str);
        }
    }
}
