package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.annotation.C0193h0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: androidx.viewpager2.widget.a */
/* compiled from: AnimateLayoutChangeDetector */
final class C2066a {

    /* renamed from: b */
    private static final MarginLayoutParams f7899b = new MarginLayoutParams(-1, -1);

    /* renamed from: a */
    private LinearLayoutManager f7900a;

    /* renamed from: androidx.viewpager2.widget.a$a */
    /* compiled from: AnimateLayoutChangeDetector */
    class C2067a implements Comparator<int[]> {
        C2067a() {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        f7899b.setMargins(0, 0, 0, 0);
    }

    C2066a(@C0193h0 LinearLayoutManager linearLayoutManager) {
        this.f7900a = linearLayoutManager;
    }

    /* renamed from: b */
    private boolean m10768b() {
        MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int e = this.f7900a.mo7467e();
        if (e == 0) {
            return true;
        }
        boolean z = this.f7900a.mo6963R() == 0;
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{e, 2});
        int i5 = 0;
        while (i5 < e) {
            View d = this.f7900a.mo7462d(i5);
            if (d != null) {
                LayoutParams layoutParams = d.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    marginLayoutParams = (MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f7899b;
                }
                int[] iArr2 = iArr[i5];
                if (z) {
                    i2 = d.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    i2 = d.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr2[0] = i2 - i;
                int[] iArr3 = iArr[i5];
                if (z) {
                    i4 = d.getRight();
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i4 = d.getBottom();
                    i3 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = i4 + i3;
                i5++;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr, new C2067a());
        for (int i6 = 1; i6 < e; i6++) {
            if (iArr[i6 - 1][1] != iArr[i6][0]) {
                return false;
            }
        }
        int i7 = iArr[0][1] - iArr[0][0];
        if (iArr[0][0] > 0 || iArr[e - 1][1] < i7) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private boolean m10769c() {
        int e = this.f7900a.mo7467e();
        for (int i = 0; i < e; i++) {
            if (m10767a(this.f7900a.mo7462d(i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9022a() {
        if ((!m10768b() || this.f7900a.mo7467e() <= 1) && m10769c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m10767a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m10767a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
