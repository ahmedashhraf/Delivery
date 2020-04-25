package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.c */
/* compiled from: DescendantOffsetUtils */
public class C6897c {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f19303a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f19304b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m33153a(@C0193h0 ViewGroup viewGroup, @C0193h0 View view, @C0193h0 Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m33155b(viewGroup, view, rect);
    }

    /* renamed from: b */
    public static void m33155b(@C0193h0 ViewGroup viewGroup, @C0193h0 View view, @C0193h0 Rect rect) {
        Matrix matrix = (Matrix) f19303a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f19303a.set(matrix);
        } else {
            matrix.reset();
        }
        m33154a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f19304b.get();
        if (rectF == null) {
            rectF = new RectF();
            f19304b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a */
    private static void m33154a(ViewParent viewParent, @C0193h0 View view, @C0193h0 Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m33154a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
