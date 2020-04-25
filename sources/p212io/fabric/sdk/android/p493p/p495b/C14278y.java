package p212io.fabric.sdk.android.p493p.p495b;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: io.fabric.sdk.android.p.b.y */
/* compiled from: TimingMetric */
public class C14278y {

    /* renamed from: a */
    private final String f42120a;

    /* renamed from: b */
    private final String f42121b;

    /* renamed from: c */
    private final boolean f42122c;

    /* renamed from: d */
    private long f42123d;

    /* renamed from: e */
    private long f42124e;

    public C14278y(String str, String str2) {
        this.f42120a = str;
        this.f42121b = str2;
        this.f42122c = !Log.isLoggable(str2, 2);
    }

    /* renamed from: d */
    private void m61934d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f42120a);
        sb.append(": ");
        sb.append(this.f42124e);
        sb.append("ms");
        sb.toString();
    }

    /* renamed from: a */
    public long mo45197a() {
        return this.f42124e;
    }

    /* renamed from: b */
    public synchronized void mo45198b() {
        if (!this.f42122c) {
            this.f42123d = SystemClock.elapsedRealtime();
            this.f42124e = 0;
        }
    }

    /* renamed from: c */
    public synchronized void mo45199c() {
        if (!this.f42122c) {
            if (this.f42124e == 0) {
                this.f42124e = SystemClock.elapsedRealtime() - this.f42123d;
                m61934d();
            }
        }
    }
}
