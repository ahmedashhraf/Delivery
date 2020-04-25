package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.recyclerview.widget.RecyclerView.C1627a0.C1629b;
import androidx.recyclerview.widget.RecyclerView.C1651o;

/* renamed from: androidx.recyclerview.widget.r */
/* compiled from: LinearSnapHelper */
public class C1762r extends C1679b0 {

    /* renamed from: g */
    private static final float f6869g = 1.0f;
    @C0195i0

    /* renamed from: e */
    private C1775w f6870e;
    @C0195i0

    /* renamed from: f */
    private C1775w f6871f;

    @C0195i0
    /* renamed from: b */
    private View m9511b(C1651o oVar, C1775w wVar) {
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

    @C0193h0
    /* renamed from: d */
    private C1775w m9512d(@C0193h0 C1651o oVar) {
        C1775w wVar = this.f6871f;
        if (wVar == null || wVar.f6910a != oVar) {
            this.f6871f = C1775w.m9557a(oVar);
        }
        return this.f6871f;
    }

    @C0193h0
    /* renamed from: e */
    private C1775w m9513e(@C0193h0 C1651o oVar) {
        C1775w wVar = this.f6870e;
        if (wVar == null || wVar.f6910a != oVar) {
            this.f6870e = C1775w.m9559b(oVar);
        }
        return this.f6870e;
    }

    /* renamed from: a */
    public int[] mo7726a(@C0193h0 C1651o oVar, @C0193h0 View view) {
        int[] iArr = new int[2];
        if (oVar.mo6983a()) {
            iArr[0] = m9509a(oVar, view, m9512d(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo6987b()) {
            iArr[1] = m9509a(oVar, view, m9513e(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: c */
    public View mo7729c(C1651o oVar) {
        if (oVar.mo6987b()) {
            return m9511b(oVar, m9513e(oVar));
        }
        if (oVar.mo6983a()) {
            return m9511b(oVar, m9512d(oVar));
        }
        return null;
    }

    /* renamed from: a */
    public int mo7722a(C1651o oVar, int i, int i2) {
        int i3;
        int i4;
        if (!(oVar instanceof C1629b)) {
            return -1;
        }
        int j = oVar.mo7483j();
        if (j == 0) {
            return -1;
        }
        View c = mo7729c(oVar);
        if (c == null) {
            return -1;
        }
        int p = oVar.mo7496p(c);
        if (p == -1) {
            return -1;
        }
        int i5 = j - 1;
        PointF a = ((C1629b) oVar).mo6973a(i5);
        if (a == null) {
            return -1;
        }
        if (oVar.mo6983a()) {
            i3 = m9510a(oVar, m9512d(oVar), i, 0);
            if (a.x < 0.0f) {
                i3 = -i3;
            }
        } else {
            i3 = 0;
        }
        if (oVar.mo6987b()) {
            i4 = m9510a(oVar, m9513e(oVar), 0, i2);
            if (a.y < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (oVar.mo6987b()) {
            i3 = i4;
        }
        if (i3 == 0) {
            return -1;
        }
        int i6 = p + i3;
        if (i6 < 0) {
            i6 = 0;
        }
        if (i6 >= j) {
            i6 = i5;
        }
        return i6;
    }

    /* renamed from: a */
    private int m9509a(@C0193h0 C1651o oVar, @C0193h0 View view, C1775w wVar) {
        return (wVar.mo8019d(view) + (wVar.mo8016b(view) / 2)) - (wVar.mo8025g() + (wVar.mo8026h() / 2));
    }

    /* renamed from: a */
    private int m9510a(C1651o oVar, C1775w wVar, int i, int i2) {
        int[] b = mo7728b(i, i2);
        float a = m9508a(oVar, wVar);
        if (a <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(b[0]) > Math.abs(b[1]) ? b[0] : b[1])) / a);
    }

    /* renamed from: a */
    private float m9508a(C1651o oVar, C1775w wVar) {
        int e = oVar.mo7467e();
        if (e == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e; i3++) {
            View d = oVar.mo7462d(i3);
            int p = oVar.mo7496p(d);
            if (p != -1) {
                if (p < i) {
                    view = d;
                    i = p;
                }
                if (p > i2) {
                    view2 = d;
                    i2 = p;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(wVar.mo8012a(view), wVar.mo8012a(view2)) - Math.min(wVar.mo8019d(view), wVar.mo8019d(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }
}
