package org.jivesoftware.smack.util;

import java.lang.Exception;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EventManger<K, R, E extends Exception> {
    private final Map<K, Reference<R>> events = new ConcurrentHashMap();

    public interface Callback<E extends Exception> {
        void action() throws Exception;
    }

    private static class Reference<V> {
        volatile V eventResult;

        private Reference() {
        }
    }

    public R performActionAndWaitForEvent(K k, long j, Callback<E> callback) throws InterruptedException, Exception {
        Reference reference = new Reference();
        this.events.put(k, reference);
        try {
            synchronized (reference) {
                callback.action();
                reference.wait(j);
            }
            Object obj = reference.eventResult;
            this.events.remove(k);
            return obj;
        } catch (Throwable th) {
            this.events.remove(k);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [R, V] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=R, code=null, for r3v0, types: [R, V] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean signalEvent(K r2, R r3) {
        /*
            r1 = this;
            java.util.Map<K, org.jivesoftware.smack.util.EventManger$Reference<R>> r0 = r1.events
            java.lang.Object r2 = r0.get(r2)
            org.jivesoftware.smack.util.EventManger$Reference r2 = (org.jivesoftware.smack.util.EventManger.Reference) r2
            if (r2 != 0) goto L_0x000c
            r2 = 0
            return r2
        L_0x000c:
            r2.eventResult = r3
            monitor-enter(r2)
            r2.notifyAll()     // Catch:{ all -> 0x0015 }
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            r2 = 1
            return r2
        L_0x0015:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0015 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.util.EventManger.signalEvent(java.lang.Object, java.lang.Object):boolean");
    }
}
