package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView.C1627a0;
import androidx.recyclerview.widget.RecyclerView.C1627a0.C1628a;
import androidx.recyclerview.widget.RecyclerView.C1651o;
import androidx.recyclerview.widget.RecyclerView.C1656p;
import androidx.recyclerview.widget.RecyclerView.State;

/* renamed from: androidx.recyclerview.widget.q */
/* compiled from: LinearSmoothScroller */
public class C1761q extends C1627a0 {

    /* renamed from: q */
    private static final boolean f6854q = false;

    /* renamed from: r */
    private static final float f6855r = 25.0f;

    /* renamed from: s */
    private static final int f6856s = 10000;

    /* renamed from: t */
    public static final int f6857t = -1;

    /* renamed from: u */
    public static final int f6858u = 1;

    /* renamed from: v */
    public static final int f6859v = 0;

    /* renamed from: w */
    private static final float f6860w = 1.2f;

    /* renamed from: i */
    protected final LinearInterpolator f6861i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f6862j = new DecelerateInterpolator();

    /* renamed from: k */
    protected PointF f6863k;

    /* renamed from: l */
    private final DisplayMetrics f6864l;

    /* renamed from: m */
    private boolean f6865m = false;

    /* renamed from: n */
    private float f6866n;

    /* renamed from: o */
    protected int f6867o = 0;

    /* renamed from: p */
    protected int f6868p = 0;

    public C1761q(Context context) {
        this.f6864l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: b */
    private int m9493b(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* renamed from: k */
    private float m9494k() {
        if (!this.f6865m) {
            this.f6866n = mo7730a(this.f6864l);
            this.f6865m = true;
        }
        return this.f6866n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7218a(View view, State state, C1628a aVar) {
        int a = mo7989a(view, mo7994i());
        int b = mo7991b(view, mo7995j());
        int e = mo7992e((int) Math.sqrt((double) ((a * a) + (b * b))));
        if (e > 0) {
            aVar.mo7233a(-a, -b, e, this.f6862j);
        }
    }

    /* renamed from: b */
    public int mo7991b(View view, int i) {
        C1651o b = mo7221b();
        if (b == null || !b.mo6987b()) {
            return 0;
        }
        C1656p pVar = (C1656p) view.getLayoutParams();
        return mo7988a(b.mo7490m(view) - pVar.topMargin, b.mo7479h(view) + pVar.bottomMargin, b.mo7501s(), b.mo7478h() - b.mo7491n(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo7992e(int i) {
        double f = (double) mo7993f(i);
        Double.isNaN(f);
        return (int) Math.ceil(f / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo7993f(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * m9494k()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo7228f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7229g() {
        this.f6868p = 0;
        this.f6867o = 0;
        this.f6863k = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo7994i() {
        PointF pointF = this.f6863k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo7995j() {
        PointF pointF = this.f6863k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7216a(int i, int i2, State state, C1628a aVar) {
        if (mo7212a() == 0) {
            mo7230h();
            return;
        }
        this.f6867o = m9493b(this.f6867o, i);
        this.f6868p = m9493b(this.f6868p, i2);
        if (this.f6867o == 0 && this.f6868p == 0) {
            mo7990a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo7730a(DisplayMetrics displayMetrics) {
        return f6855r / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7990a(C1628a aVar) {
        PointF a = mo7214a(mo7223c());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.mo7232a(mo7223c());
            mo7230h();
            return;
        }
        mo7217a(a);
        this.f6863k = a;
        this.f6867o = (int) (a.x * 10000.0f);
        this.f6868p = (int) (a.y * 10000.0f);
        aVar.mo7233a((int) (((float) this.f6867o) * f6860w), (int) (((float) this.f6868p) * f6860w), (int) (((float) mo7993f(10000)) * f6860w), this.f6861i);
    }

    /* renamed from: a */
    public int mo7988a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: a */
    public int mo7989a(View view, int i) {
        C1651o b = mo7221b();
        if (b == null || !b.mo6983a()) {
            return 0;
        }
        C1656p pVar = (C1656p) view.getLayoutParams();
        return mo7988a(b.mo7482i(view) - pVar.leftMargin, b.mo7488l(view) + pVar.rightMargin, b.mo7495p(), b.mo7503t() - b.mo7497q(), i);
    }
}
