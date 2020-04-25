package p195e.p196a.p199x0.p463g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: e.a.x0.g.k */
/* compiled from: RxThreadFactory */
public final class C13686k extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: N */
    final boolean f39610N;

    /* renamed from: a */
    final String f39611a;

    /* renamed from: b */
    final int f39612b;

    /* renamed from: e.a.x0.g.k$a */
    /* compiled from: RxThreadFactory */
    static final class C13687a extends Thread implements C13685j {
        C13687a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public C13686k(String str) {
        this(str, 5, false);
    }

    public Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder(this.f39611a);
        sb.append('-');
        sb.append(incrementAndGet());
        String sb2 = sb.toString();
        Thread aVar = this.f39610N ? new C13687a(runnable, sb2) : new Thread(runnable, sb2);
        aVar.setPriority(this.f39612b);
        aVar.setDaemon(true);
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RxThreadFactory[");
        sb.append(this.f39611a);
        sb.append("]");
        return sb.toString();
    }

    public C13686k(String str, int i) {
        this(str, i, false);
    }

    public C13686k(String str, int i, boolean z) {
        this.f39611a = str;
        this.f39612b = i;
        this.f39610N = z;
    }
}
