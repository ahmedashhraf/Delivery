package org.jivesoftware.smack.util;

public class Async {
    public static Thread daemonThreadFrom(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        return thread;
    }

    /* renamed from: go */
    public static Thread m68710go(Runnable runnable) {
        Thread daemonThreadFrom = daemonThreadFrom(runnable);
        daemonThreadFrom.start();
        return daemonThreadFrom;
    }

    /* renamed from: go */
    public static Thread m68711go(Runnable runnable, String str) {
        Thread daemonThreadFrom = daemonThreadFrom(runnable);
        daemonThreadFrom.setName(str);
        daemonThreadFrom.start();
        return daemonThreadFrom;
    }
}
