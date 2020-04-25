package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.recyclerview.widget.RecyclerView.C1627a0;
import androidx.recyclerview.widget.RecyclerView.C1627a0.C1628a;
import androidx.recyclerview.widget.RecyclerView.C1627a0.C1629b;
import androidx.recyclerview.widget.RecyclerView.C1651o;
import androidx.recyclerview.widget.RecyclerView.C1658r;
import androidx.recyclerview.widget.RecyclerView.C1660t;
import androidx.recyclerview.widget.RecyclerView.State;

/* renamed from: androidx.recyclerview.widget.b0 */
/* compiled from: SnapHelper */
public abstract class C1679b0 extends C1658r {

    /* renamed from: d */
    static final float f6453d = 100.0f;

    /* renamed from: a */
    RecyclerView f6454a;

    /* renamed from: b */
    private Scroller f6455b;

    /* renamed from: c */
    private final C1660t f6456c = new C1680a();

    /* renamed from: androidx.recyclerview.widget.b0$a */
    /* compiled from: SnapHelper */
    class C1680a extends C1660t {

        /* renamed from: a */
        boolean f6457a = false;

        C1680a() {
        }

        /* renamed from: a */
        public void mo7531a(RecyclerView recyclerView, int i) {
            super.mo7531a(recyclerView, i);
            if (i == 0 && this.f6457a) {
                this.f6457a = false;
                C1679b0.this.mo7724a();
            }
        }

        /* renamed from: a */
        public void mo7532a(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f6457a = true;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.b0$b */
    /* compiled from: SnapHelper */
    class C1681b extends C1761q {
        C1681b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo7218a(View view, State state, C1628a aVar) {
            C1679b0 b0Var = C1679b0.this;
            RecyclerView recyclerView = b0Var.f6454a;
            if (recyclerView != null) {
                int[] a = b0Var.mo7726a(recyclerView.getLayoutManager(), view);
                int i = a[0];
                int i2 = a[1];
                int e = mo7992e(Math.max(Math.abs(i), Math.abs(i2)));
                if (e > 0) {
                    aVar.mo7233a(i, i2, e, this.f6862j);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo7730a(DisplayMetrics displayMetrics) {
            return C1679b0.f6453d / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: b */
    private void m9089b() {
        this.f6454a.removeOnScrollListener(this.f6456c);
        this.f6454a.setOnFlingListener(null);
    }

    /* renamed from: c */
    private void m9091c() throws IllegalStateException {
        if (this.f6454a.getOnFlingListener() == null) {
            this.f6454a.addOnScrollListener(this.f6456c);
            this.f6454a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: a */
    public abstract int mo7722a(C1651o oVar, int i, int i2);

    /* renamed from: a */
    public boolean mo7527a(int i, int i2) {
        C1651o layoutManager = this.f6454a.getLayoutManager();
        boolean z = false;
        if (layoutManager == null || this.f6454a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f6454a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m9090b(layoutManager, i, i2)) {
            z = true;
        }
        return z;
    }

    @C0195i0
    /* renamed from: a */
    public abstract int[] mo7726a(@C0193h0 C1651o oVar, @C0193h0 View view);

    @C0195i0
    /* renamed from: c */
    public abstract View mo7729c(C1651o oVar);

    /* renamed from: b */
    public int[] mo7728b(int i, int i2) {
        this.f6455b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f6455b.getFinalX(), this.f6455b.getFinalY()};
    }

    /* renamed from: b */
    private boolean m9090b(@C0193h0 C1651o oVar, int i, int i2) {
        if (!(oVar instanceof C1629b)) {
            return false;
        }
        C1627a0 a = mo7723a(oVar);
        if (a == null) {
            return false;
        }
        int a2 = mo7722a(oVar, i, i2);
        if (a2 == -1) {
            return false;
        }
        a.mo7225d(a2);
        oVar.mo7447b(a);
        return true;
    }

    /* renamed from: a */
    public void mo7725a(@C0195i0 RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f6454a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m9089b();
            }
            this.f6454a = recyclerView;
            if (this.f6454a != null) {
                m9091c();
                this.f6455b = new Scroller(this.f6454a.getContext(), new DecelerateInterpolator());
                mo7724a();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    @C0195i0
    /* renamed from: b */
    public C1761q mo7727b(C1651o oVar) {
        if (!(oVar instanceof C1629b)) {
            return null;
        }
        return new C1681b(this.f6454a.getContext());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7724a() {
        RecyclerView recyclerView = this.f6454a;
        if (recyclerView != null) {
            C1651o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                View c = mo7729c(layoutManager);
                if (c != null) {
                    int[] a = mo7726a(layoutManager, c);
                    if (!(a[0] == 0 && a[1] == 0)) {
                        this.f6454a.smoothScrollBy(a[0], a[1]);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @C0195i0
    /* renamed from: a */
    public C1627a0 mo7723a(C1651o oVar) {
        return mo7727b(oVar);
    }
}
