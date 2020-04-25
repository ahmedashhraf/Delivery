package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: androidx.transition.z0 */
/* compiled from: ViewUtilsApi21 */
class C1959z0 extends C1957y0 {

    /* renamed from: i */
    private static boolean f7487i = true;

    /* renamed from: j */
    private static boolean f7488j = true;

    /* renamed from: k */
    private static boolean f7489k = true;

    C1959z0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo8256a(@C0193h0 View view, @C0195i0 Matrix matrix) {
        if (f7487i) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f7487i = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public void mo8258b(@C0193h0 View view, @C0193h0 Matrix matrix) {
        if (f7488j) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f7488j = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public void mo8259c(@C0193h0 View view, @C0193h0 Matrix matrix) {
        if (f7489k) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f7489k = false;
            }
        }
    }
}
