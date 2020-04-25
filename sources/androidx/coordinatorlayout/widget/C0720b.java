package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

@C0207n0({C0208a.LIBRARY})
/* renamed from: androidx.coordinatorlayout.widget.b */
/* compiled from: ViewGroupUtils */
public class C0720b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f3370a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f3371b = new ThreadLocal<>();

    private C0720b() {
    }

    /* renamed from: a */
    public static void m4216a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m4218b(viewGroup, view, rect);
    }

    /* renamed from: b */
    static void m4218b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = (Matrix) f3370a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f3370a.set(matrix);
        } else {
            matrix.reset();
        }
        m4217a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f3371b.get();
        if (rectF == null) {
            rectF = new RectF();
            f3371b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a */
    private static void m4217a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m4217a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
