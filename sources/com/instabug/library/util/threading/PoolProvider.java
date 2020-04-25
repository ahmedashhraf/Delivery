package com.instabug.library.util.threading;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class PoolProvider {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static PoolProvider INSTANCE;
    public static final int NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();
    private final ThreadPoolExecutor forBitmapTasks;
    private final ThreadPoolExecutor forIOTasks;
    private final Executor mainThreadExecutor = new C10026a();

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-6509632737226244592L, "com/instabug/library/util/threading/PoolProvider", 14);
        $jacocoData = a;
        return a;
    }

    static {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[13] = true;
    }

    private PoolProvider() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[5] = true;
        C10027b bVar = new C10027b(10);
        $jacocoInit[6] = true;
        int i = NUMBER_OF_CORES;
        C10027b bVar2 = bVar;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i * 2, i * 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), bVar2);
        this.forBitmapTasks = threadPoolExecutor;
        $jacocoInit[7] = true;
        int i2 = NUMBER_OF_CORES;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(i2 * 2, i2 * 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), bVar2);
        this.forIOTasks = threadPoolExecutor2;
        $jacocoInit[8] = true;
        $jacocoInit[9] = true;
    }

    public static synchronized PoolProvider getInstance() {
        PoolProvider poolProvider;
        Class<PoolProvider> cls = PoolProvider.class;
        synchronized (cls) {
            boolean[] $jacocoInit = $jacocoInit();
            if (INSTANCE != null) {
                $jacocoInit[0] = true;
            } else {
                synchronized (cls) {
                    try {
                        $jacocoInit[1] = true;
                        INSTANCE = new PoolProvider();
                    } finally {
                        while (true) {
                            $jacocoInit[3] = true;
                        }
                    }
                }
                $jacocoInit[2] = true;
            }
            poolProvider = INSTANCE;
            $jacocoInit[4] = true;
        }
        return poolProvider;
    }

    public static void postBitmapTask(Runnable runnable) {
        boolean[] $jacocoInit = $jacocoInit();
        getInstance().forBitmapTasks.execute(runnable);
        $jacocoInit[10] = true;
    }

    public static void postIOTask(Runnable runnable) {
        boolean[] $jacocoInit = $jacocoInit();
        getInstance().forIOTasks.execute(runnable);
        $jacocoInit[11] = true;
    }

    public static void postMainThreadTask(Runnable runnable) {
        boolean[] $jacocoInit = $jacocoInit();
        getInstance().mainThreadExecutor.execute(runnable);
        $jacocoInit[12] = true;
    }
}
