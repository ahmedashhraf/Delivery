package androidx.transition;

import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.transition.s */
/* compiled from: GhostViewUtils */
class C1939s {
    private C1939s() {
    }

    @C0195i0
    /* renamed from: a */
    static C1929o m10230a(@C0193h0 View view, @C0193h0 ViewGroup viewGroup, @C0195i0 Matrix matrix) {
        if (VERSION.SDK_INT == 28) {
            return C1934q.m10210a(view, viewGroup, matrix);
        }
        return C1936r.m10221a(view, viewGroup, matrix);
    }

    /* renamed from: a */
    static void m10231a(View view) {
        if (VERSION.SDK_INT == 28) {
            C1934q.m10212a(view);
        } else {
            C1936r.m10224b(view);
        }
    }
}
