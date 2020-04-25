package p076c.p112d.p113a.p130b.p131a.p133d;

import java.util.concurrent.ThreadFactory;

/* renamed from: c.d.a.b.a.d.d */
final class C2696d implements ThreadFactory {
    C2696d() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
