package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* renamed from: androidx.transition.b1 */
/* compiled from: ViewUtilsApi23 */
class C1832b1 extends C1829a1 {

    /* renamed from: m */
    private static boolean f7120m = true;

    C1832b1() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo8251a(@C0193h0 View view, int i) {
        if (VERSION.SDK_INT == 28) {
            super.mo8251a(view, i);
        } else if (f7120m) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f7120m = false;
            }
        }
    }
}
