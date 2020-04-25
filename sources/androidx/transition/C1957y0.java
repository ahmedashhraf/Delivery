package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* renamed from: androidx.transition.y0 */
/* compiled from: ViewUtilsApi19 */
class C1957y0 extends C1848d1 {

    /* renamed from: h */
    private static boolean f7486h = true;

    C1957y0() {
    }

    /* renamed from: a */
    public void mo8268a(@C0193h0 View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo8255a(@C0193h0 View view, float f) {
        if (f7486h) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f7486h = false;
            }
        }
        view.setAlpha(f);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public float mo8257b(@C0193h0 View view) {
        if (f7486h) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f7486h = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: c */
    public void mo8269c(@C0193h0 View view) {
    }
}
