package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p034l.C0962e0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.t */
/* compiled from: ViewOverlayApi14 */
class C6932t implements C6935v {

    /* renamed from: a */
    protected C6933a f19398a;

    @SuppressLint({"ViewConstructor", "PrivateApi"})
    /* renamed from: com.google.android.material.internal.t$a */
    /* compiled from: ViewOverlayApi14 */
    static class C6933a extends ViewGroup {

        /* renamed from: Q */
        static Method f19399Q;

        /* renamed from: N */
        ArrayList<Drawable> f19400N = null;

        /* renamed from: O */
        C6932t f19401O;

        /* renamed from: P */
        private boolean f19402P;

        /* renamed from: a */
        ViewGroup f19403a;

        /* renamed from: b */
        View f19404b;

        static {
            try {
                f19399Q = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }

        C6933a(Context context, ViewGroup viewGroup, View view, C6932t tVar) {
            super(context);
            this.f19403a = viewGroup;
            this.f19404b = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f19401O = tVar;
        }

        /* renamed from: a */
        public void mo27662a(Drawable drawable) {
            m33280a();
            if (this.f19400N == null) {
                this.f19400N = new ArrayList<>();
            }
            if (!this.f19400N.contains(drawable)) {
                this.f19400N.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo27664b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f19400N;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                m33282b();
            }
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f19403a.getLocationOnScreen(iArr);
            this.f19404b.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f19404b.getWidth(), this.f19404b.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f19400N;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Drawable) this.f19400N.get(i)).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f19403a != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f19403a != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    m33281a(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
            }
            return null;
        }

        public void invalidateDrawable(@C0193h0 Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        public boolean verifyDrawable(@C0193h0 Drawable drawable) {
            if (!super.verifyDrawable(drawable)) {
                ArrayList<Drawable> arrayList = this.f19400N;
                if (arrayList == null || !arrayList.contains(drawable)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void mo27665b(View view) {
            super.removeView(view);
            m33282b();
        }

        /* renamed from: b */
        private void m33282b() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f19400N;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f19402P = true;
                    this.f19403a.removeView(this);
                }
            }
        }

        /* renamed from: a */
        public void mo27663a(View view) {
            m33280a();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f19403a || viewGroup.getParent() == null || !C0962e0.m5515h0(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f19403a.getLocationOnScreen(iArr2);
                    C0962e0.m5508g(view, iArr[0] - iArr2[0]);
                    C0962e0.m5513h(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* renamed from: a */
        private void m33280a() {
            if (this.f19402P) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: a */
        private void m33281a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f19403a.getLocationOnScreen(iArr2);
            this.f19404b.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* access modifiers changed from: protected */
        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public ViewParent mo27661a(int i, int i2, Rect rect) {
            if (!(this.f19403a == null || f19399Q == null)) {
                try {
                    m33281a(new int[2]);
                    f19399Q.invoke(this.f19403a, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), rect});
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }
            return null;
        }
    }

    C6932t(Context context, ViewGroup viewGroup, View view) {
        this.f19398a = new C6933a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    static C6932t m33277c(View view) {
        ViewGroup a = C6936w.m33294a(view);
        if (a == null) {
            return null;
        }
        int childCount = a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = a.getChildAt(i);
            if (childAt instanceof C6933a) {
                return ((C6933a) childAt).f19401O;
            }
        }
        return new C6929q(a.getContext(), a, view);
    }

    /* renamed from: a */
    public void mo27659a(@C0193h0 Drawable drawable) {
        this.f19398a.mo27662a(drawable);
    }

    /* renamed from: b */
    public void mo27660b(@C0193h0 Drawable drawable) {
        this.f19398a.mo27664b(drawable);
    }
}
