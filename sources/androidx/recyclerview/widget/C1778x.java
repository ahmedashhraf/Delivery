package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.recyclerview.widget.RecyclerView.C1627a0.C1628a;
import androidx.recyclerview.widget.RecyclerView.C1627a0.C1629b;
import androidx.recyclerview.widget.RecyclerView.C1651o;
import androidx.recyclerview.widget.RecyclerView.State;

/* renamed from: androidx.recyclerview.widget.x */
/* compiled from: PagerSnapHelper */
public class C1778x extends C1679b0 {

    /* renamed from: g */
    private static final int f6913g = 100;
    @C0195i0

    /* renamed from: e */
    private C1775w f6914e;
    @C0195i0

    /* renamed from: f */
    private C1775w f6915f;

    /* renamed from: androidx.recyclerview.widget.x$a */
    /* compiled from: PagerSnapHelper */
    class C1779a extends C1761q {
        C1779a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo7218a(View view, State state, C1628a aVar) {
            C1778x xVar = C1778x.this;
            int[] a = xVar.mo7726a(xVar.f6454a.getLayoutManager(), view);
            int i = a[0];
            int i2 = a[1];
            int e = mo7992e(Math.max(Math.abs(i), Math.abs(i2)));
            if (e > 0) {
                aVar.mo7233a(i, i2, e, this.f6862j);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo7993f(int i) {
            return Math.min(100, super.mo7993f(i));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo7730a(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: b */
    private boolean m9610b(C1651o oVar, int i, int i2) {
        boolean z = true;
        if (oVar.mo6983a()) {
            if (i <= 0) {
                z = false;
            }
            return z;
        }
        if (i2 <= 0) {
            z = false;
        }
        return z;
    }

    @C0193h0
    /* renamed from: d */
    private C1775w m9611d(@C0193h0 C1651o oVar) {
        C1775w wVar = this.f6915f;
        if (wVar == null || wVar.f6910a != oVar) {
            this.f6915f = C1775w.m9557a(oVar);
        }
        return this.f6915f;
    }

    @C0195i0
    /* renamed from: e */
    private C1775w m9612e(C1651o oVar) {
        if (oVar.mo6987b()) {
            return m9613f(oVar);
        }
        if (oVar.mo6983a()) {
            return m9611d(oVar);
        }
        return null;
    }

    @C0193h0
    /* renamed from: f */
    private C1775w m9613f(@C0193h0 C1651o oVar) {
        C1775w wVar = this.f6914e;
        if (wVar == null || wVar.f6910a != oVar) {
            this.f6914e = C1775w.m9559b(oVar);
        }
        return this.f6914e;
    }

    /* renamed from: g */
    private boolean m9614g(C1651o oVar) {
        int j = oVar.mo7483j();
        if (oVar instanceof C1629b) {
            boolean z = true;
            PointF a = ((C1629b) oVar).mo6973a(j - 1);
            if (a != null) {
                if (a.x >= 0.0f && a.y >= 0.0f) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    @C0195i0
    /* renamed from: a */
    public int[] mo7726a(@C0193h0 C1651o oVar, @C0193h0 View view) {
        int[] iArr = new int[2];
        if (oVar.mo6983a()) {
            iArr[0] = m9608a(oVar, view, m9611d(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo6987b()) {
            iArr[1] = m9608a(oVar, view, m9613f(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @C0195i0
    /* renamed from: c */
    public View mo7729c(C1651o oVar) {
        if (oVar.mo6987b()) {
            return m9609a(oVar, m9613f(oVar));
        }
        if (oVar.mo6983a()) {
            return m9609a(oVar, m9611d(oVar));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1761q mo7727b(C1651o oVar) {
        if (!(oVar instanceof C1629b)) {
            return null;
        }
        return new C1779a(this.f6454a.getContext());
    }

    /* renamed from: a */
    public int mo7722a(C1651o oVar, int i, int i2) {
        int j = oVar.mo7483j();
        if (j == 0) {
            return -1;
        }
        C1775w e = m9612e(oVar);
        if (e == null) {
            return -1;
        }
        int e2 = oVar.mo7467e();
        View view = null;
        View view2 = null;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < e2; i5++) {
            View d = oVar.mo7462d(i5);
            if (d != null) {
                int a = m9608a(oVar, d, e);
                if (a <= 0 && a > i3) {
                    view2 = d;
                    i3 = a;
                }
                if (a >= 0 && a < i4) {
                    view = d;
                    i4 = a;
                }
            }
        }
        boolean b = m9610b(oVar, i, i2);
        if (b && view != null) {
            return oVar.mo7496p(view);
        }
        if (!b && view2 != null) {
            return oVar.mo7496p(view2);
        }
        if (!b) {
            view2 = view;
        }
        if (view2 == null) {
            return -1;
        }
        int p = oVar.mo7496p(view2) + (m9614g(oVar) == b ? -1 : 1);
        if (p < 0 || p >= j) {
            return -1;
        }
        return p;
    }

    /* renamed from: a */
    private int m9608a(@C0193h0 C1651o oVar, @C0193h0 View view, C1775w wVar) {
        return (wVar.mo8019d(view) + (wVar.mo8016b(view) / 2)) - (wVar.mo8025g() + (wVar.mo8026h() / 2));
    }

    @C0195i0
    /* renamed from: a */
    private View m9609a(C1651o oVar, C1775w wVar) {
        int e = oVar.mo7467e();
        View view = null;
        if (e == 0) {
            return null;
        }
        int g = wVar.mo8025g() + (wVar.mo8026h() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < e; i2++) {
            View d = oVar.mo7462d(i2);
            int abs = Math.abs((wVar.mo8019d(d) + (wVar.mo8016b(d) / 2)) - g);
            if (abs < i) {
                view = d;
                i = abs;
            }
        }
        return view;
    }
}
