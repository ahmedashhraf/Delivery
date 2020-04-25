package p076c.p082c.p083a.p088u.p090i.p094q;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.C2963d;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.C2272c;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p090i.p092o.C2367i;

/* renamed from: c.c.a.u.i.q.a */
/* compiled from: BitmapPreFillRunner */
final class C2383a implements Runnable {

    /* renamed from: T */
    private static final String f9314T = "PreFillRunner";

    /* renamed from: U */
    private static final C2385b f9315U = new C2385b();

    /* renamed from: V */
    static final long f9316V = 32;

    /* renamed from: W */
    static final long f9317W = 40;

    /* renamed from: X */
    static final int f9318X = 4;

    /* renamed from: Y */
    static final long f9319Y = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: N */
    private final C2388c f9320N;

    /* renamed from: O */
    private final C2385b f9321O;

    /* renamed from: P */
    private final Set<C2389d> f9322P;

    /* renamed from: Q */
    private final Handler f9323Q;

    /* renamed from: R */
    private long f9324R;

    /* renamed from: S */
    private boolean f9325S;

    /* renamed from: a */
    private final C2330c f9326a;

    /* renamed from: b */
    private final C2367i f9327b;

    /* renamed from: c.c.a.u.i.q.a$b */
    /* compiled from: BitmapPreFillRunner */
    static class C2385b {
        C2385b() {
        }

        /* renamed from: a */
        public long mo9794a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* renamed from: c.c.a.u.i.q.a$c */
    /* compiled from: BitmapPreFillRunner */
    private static class C2386c implements C2272c {
        private C2386c() {
        }

        /* renamed from: a */
        public void mo9636a(MessageDigest messageDigest) throws UnsupportedEncodingException {
        }
    }

    public C2383a(C2330c cVar, C2367i iVar, C2388c cVar2) {
        this(cVar, iVar, cVar2, f9315U, new Handler(Looper.getMainLooper()));
    }

    /* renamed from: b */
    private boolean m12197b() {
        long a = this.f9321O.mo9794a();
        while (!this.f9320N.mo9798b() && !m12196a(a)) {
            C2389d c = this.f9320N.mo9799c();
            Bitmap createBitmap = Bitmap.createBitmap(c.mo9803d(), c.mo9801b(), c.mo9800a());
            if (m12198c() >= C2216i.m11338a(createBitmap)) {
                this.f9327b.mo9770a(new C2386c(), C2963d.m14190a(createBitmap, this.f9326a));
            } else {
                m12195a(c, createBitmap);
            }
            if (Log.isLoggable(f9314T, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("allocated [");
                sb.append(c.mo9803d());
                sb.append("x");
                sb.append(c.mo9801b());
                sb.append("] ");
                sb.append(c.mo9800a());
                sb.append(" size: ");
                sb.append(C2216i.m11338a(createBitmap));
                sb.toString();
            }
        }
        return !this.f9325S && !this.f9320N.mo9798b();
    }

    /* renamed from: c */
    private int m12198c() {
        return this.f9327b.mo9774a() - this.f9327b.mo9777c();
    }

    /* renamed from: d */
    private long m12199d() {
        long j = this.f9324R;
        this.f9324R = Math.min(4 * j, f9319Y);
        return j;
    }

    /* renamed from: a */
    public void mo9792a() {
        this.f9325S = true;
    }

    public void run() {
        if (m12197b()) {
            this.f9323Q.postDelayed(this, m12199d());
        }
    }

    C2383a(C2330c cVar, C2367i iVar, C2388c cVar2, C2385b bVar, Handler handler) {
        this.f9322P = new HashSet();
        this.f9324R = f9317W;
        this.f9326a = cVar;
        this.f9327b = iVar;
        this.f9320N = cVar2;
        this.f9321O = bVar;
        this.f9323Q = handler;
    }

    /* renamed from: a */
    private boolean m12196a(long j) {
        return this.f9321O.mo9794a() - j >= 32;
    }

    /* renamed from: a */
    private void m12195a(C2389d dVar, Bitmap bitmap) {
        if (this.f9322P.add(dVar)) {
            Bitmap a = this.f9326a.mo9731a(dVar.mo9803d(), dVar.mo9801b(), dVar.mo9800a());
            if (a != null) {
                this.f9326a.mo9734a(a);
            }
        }
        this.f9326a.mo9734a(bitmap);
    }
}
