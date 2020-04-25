package p053b.p054a.p055a.p056b;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: b.a.a.b.b */
/* compiled from: DefaultTaskExecutor */
public class C2079b extends C2081c {

    /* renamed from: a */
    private final Object f7942a = new Object();

    /* renamed from: b */
    private final ExecutorService f7943b = Executors.newFixedThreadPool(2, new C2080a());
    @C0195i0

    /* renamed from: c */
    private volatile Handler f7944c;

    /* renamed from: b.a.a.b.b$a */
    /* compiled from: DefaultTaskExecutor */
    class C2080a implements ThreadFactory {

        /* renamed from: N */
        private static final String f7945N = "arch_disk_io_%d";

        /* renamed from: a */
        private final AtomicInteger f7946a = new AtomicInteger(0);

        C2080a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(f7945N, new Object[]{Integer.valueOf(this.f7946a.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: a */
    public void mo9047a(Runnable runnable) {
        this.f7943b.execute(runnable);
    }

    /* renamed from: c */
    public void mo9049c(Runnable runnable) {
        if (this.f7944c == null) {
            synchronized (this.f7942a) {
                if (this.f7944c == null) {
                    this.f7944c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f7944c.post(runnable);
    }

    /* renamed from: a */
    public boolean mo9048a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
