package org.jivesoftware.smack.util;

import java.util.concurrent.ThreadFactory;

public final class SmackExecutorThreadFactory implements ThreadFactory {
    private final int connectionCounterValue;
    private int count = 0;
    private final String name;

    public SmackExecutorThreadFactory(int i, String str) {
        this.connectionCounterValue = i;
        this.name = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb = new StringBuilder();
        sb.append("Smack-");
        sb.append(this.name);
        sb.append(' ');
        int i = this.count;
        this.count = i + 1;
        sb.append(i);
        sb.append(" (");
        sb.append(this.connectionCounterValue);
        sb.append(")");
        thread.setName(sb.toString());
        thread.setDaemon(true);
        return thread;
    }
}
