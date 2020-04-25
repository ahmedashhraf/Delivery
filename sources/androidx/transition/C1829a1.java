package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;

@RequiresApi(22)
/* renamed from: androidx.transition.a1 */
/* compiled from: ViewUtilsApi22 */
class C1829a1 extends C1959z0 {

    /* renamed from: l */
    private static boolean f7104l = true;

    C1829a1() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo8237a(@C0193h0 View view, int i, int i2, int i3, int i4) {
        if (f7104l) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f7104l = false;
            }
        }
    }
}
