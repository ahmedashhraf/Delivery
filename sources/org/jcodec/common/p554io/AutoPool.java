package org.jcodec.common.p554io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: org.jcodec.common.io.AutoPool */
public class AutoPool {
    private static AutoPool instance = new AutoPool();
    /* access modifiers changed from: private */
    public List<AutoResource> resources = Collections.synchronizedList(new ArrayList());
    private ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    /* renamed from: org.jcodec.common.io.AutoPool$a */
    class C15541a implements Runnable {
        C15541a() {
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            for (AutoResource curTime : AutoPool.this.resources) {
                curTime.setCurTime(currentTimeMillis);
            }
        }
    }

    private AutoPool() {
        this.scheduler.scheduleAtFixedRate(new C15541a(), 0, 100, TimeUnit.MILLISECONDS);
    }

    public static AutoPool getInstance() {
        return instance;
    }

    public void add(AutoResource autoResource) {
        this.resources.add(autoResource);
    }
}
