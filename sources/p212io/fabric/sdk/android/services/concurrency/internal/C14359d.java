package p212io.fabric.sdk.android.services.concurrency.internal;

/* renamed from: io.fabric.sdk.android.services.concurrency.internal.d */
/* compiled from: ExponentialBackoff */
public class C14359d implements C14357b {

    /* renamed from: c */
    private static final int f42422c = 2;

    /* renamed from: a */
    private final long f42423a;

    /* renamed from: b */
    private final int f42424b;

    public C14359d(long j) {
        this(j, 2);
    }

    public long getDelayMillis(int i) {
        double d = (double) this.f42423a;
        double pow = Math.pow((double) this.f42424b, (double) i);
        Double.isNaN(d);
        return (long) (d * pow);
    }

    public C14359d(long j, int i) {
        this.f42423a = j;
        this.f42424b = i;
    }
}
