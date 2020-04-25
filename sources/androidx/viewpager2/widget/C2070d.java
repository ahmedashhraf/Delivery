package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.C0222u0;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.viewpager2.widget.d */
/* compiled from: FakeDrag */
final class C2070d {

    /* renamed from: a */
    private final ViewPager2 f7904a;

    /* renamed from: b */
    private final C2073g f7905b;

    /* renamed from: c */
    private final RecyclerView f7906c;

    /* renamed from: d */
    private VelocityTracker f7907d;

    /* renamed from: e */
    private int f7908e;

    /* renamed from: f */
    private float f7909f;

    /* renamed from: g */
    private int f7910g;

    /* renamed from: h */
    private long f7911h;

    C2070d(ViewPager2 viewPager2, C2073g gVar, RecyclerView recyclerView) {
        this.f7904a = viewPager2;
        this.f7905b = gVar;
        this.f7906c = recyclerView;
    }

    /* renamed from: d */
    private void m10782d() {
        VelocityTracker velocityTracker = this.f7907d;
        if (velocityTracker == null) {
            this.f7907d = VelocityTracker.obtain();
            this.f7908e = ViewConfiguration.get(this.f7904a.getContext()).getScaledMaximumFlingVelocity();
            return;
        }
        velocityTracker.clear();
    }

    /* access modifiers changed from: 0000 */
    @C0222u0
    /* renamed from: a */
    public boolean mo9029a() {
        if (this.f7905b.mo9039c()) {
            return false;
        }
        this.f7910g = 0;
        this.f7909f = (float) 0;
        this.f7911h = SystemClock.uptimeMillis();
        m10782d();
        this.f7905b.mo9042f();
        if (!this.f7905b.mo9041e()) {
            this.f7906c.stopScroll();
        }
        m10781a(this.f7911h, 0, 0.0f, 0.0f);
        return true;
    }

    /* access modifiers changed from: 0000 */
    @C0222u0
    /* renamed from: b */
    public boolean mo9031b() {
        if (!this.f7905b.mo9040d()) {
            return false;
        }
        this.f7905b.mo9044h();
        VelocityTracker velocityTracker = this.f7907d;
        velocityTracker.computeCurrentVelocity(1000, (float) this.f7908e);
        if (!this.f7906c.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            this.f7904a.mo8977h();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo9032c() {
        return this.f7905b.mo9040d();
    }

    /* access modifiers changed from: 0000 */
    @C0222u0
    /* renamed from: a */
    public boolean mo9030a(float f) {
        float f2;
        if (!this.f7905b.mo9040d()) {
            return false;
        }
        this.f7909f -= f;
        int round = Math.round(this.f7909f - ((float) this.f7910g));
        this.f7910g += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = this.f7904a.getOrientation() == 0;
        int i = z ? round : 0;
        if (z) {
            round = 0;
        }
        float f3 = z ? this.f7909f : 0.0f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = this.f7909f;
        }
        this.f7906c.scrollBy(i, round);
        m10781a(uptimeMillis, 2, f3, f2);
        return true;
    }

    /* renamed from: a */
    private void m10781a(long j, int i, float f, float f2) {
        MotionEvent obtain = MotionEvent.obtain(this.f7911h, j, i, f, f2, 0);
        this.f7907d.addMovement(obtain);
        obtain.recycle();
    }
}
