package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* renamed from: androidx.transition.c1 */
/* compiled from: ViewUtilsApi29 */
class C1835c1 extends C1832b1 {
    C1835c1() {
    }

    /* renamed from: a */
    public void mo8255a(@C0193h0 View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: b */
    public float mo8257b(@C0193h0 View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: c */
    public void mo8259c(@C0193h0 View view, @C0193h0 Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    /* renamed from: a */
    public void mo8251a(@C0193h0 View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: b */
    public void mo8258b(@C0193h0 View view, @C0193h0 Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: a */
    public void mo8237a(@C0193h0 View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo8256a(@C0193h0 View view, @C0195i0 Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }
}
