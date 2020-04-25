package p470h;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: h.b0 */
/* compiled from: Timeout */
public class C13885b0 {

    /* renamed from: d */
    public static final C13885b0 f40333d = new C13886a();

    /* renamed from: a */
    private boolean f40334a;

    /* renamed from: b */
    private long f40335b;

    /* renamed from: c */
    private long f40336c;

    /* renamed from: h.b0$a */
    /* compiled from: Timeout */
    class C13886a extends C13885b0 {
        C13886a() {
        }

        /* renamed from: a */
        public C13885b0 mo43824a(long j) {
            return this;
        }

        /* renamed from: b */
        public C13885b0 mo43828b(long j, TimeUnit timeUnit) {
            return this;
        }

        /* renamed from: e */
        public void mo43831e() throws IOException {
        }
    }

    /* renamed from: a */
    static long m59471a(long j, long j2) {
        return j == 0 ? j2 : (j2 != 0 && j >= j2) ? j2 : j;
    }

    /* renamed from: a */
    public C13885b0 mo43824a(long j) {
        this.f40334a = true;
        this.f40335b = j;
        return this;
    }

    /* renamed from: b */
    public C13885b0 mo43828b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("timeout < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            this.f40336c = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: c */
    public long mo43829c() {
        if (this.f40334a) {
            return this.f40335b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public boolean mo43830d() {
        return this.f40334a;
    }

    /* renamed from: e */
    public void mo43831e() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f40334a && this.f40335b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: f */
    public long mo43832f() {
        return this.f40336c;
    }

    /* renamed from: a */
    public final C13885b0 mo43825a(long j, TimeUnit timeUnit) {
        if (j <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("duration <= 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            return mo43824a(System.nanoTime() + timeUnit.toNanos(j));
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: b */
    public C13885b0 mo43827b() {
        this.f40336c = 0;
        return this;
    }

    /* renamed from: a */
    public C13885b0 mo43823a() {
        this.f40334a = false;
        return this;
    }

    /* renamed from: a */
    public final void mo43826a(Object obj) throws InterruptedIOException {
        try {
            boolean d = mo43830d();
            long f = mo43832f();
            long j = 0;
            if (d || f != 0) {
                long nanoTime = System.nanoTime();
                if (d && f != 0) {
                    f = Math.min(f, mo43829c() - nanoTime);
                } else if (d) {
                    f = mo43829c() - nanoTime;
                }
                if (f > 0) {
                    long j2 = f / 1000000;
                    Long.signum(j2);
                    obj.wait(j2, (int) (f - (1000000 * j2)));
                    j = System.nanoTime() - nanoTime;
                }
                if (j >= f) {
                    throw new InterruptedIOException("timeout");
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
