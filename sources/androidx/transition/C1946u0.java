package androidx.transition;

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

/* renamed from: androidx.transition.u0 */
/* compiled from: ViewOverlayApi14 */
class C1946u0 implements C1951w0 {

    /* renamed from: a */
    protected C1947a f7465a;

    /* renamed from: androidx.transition.u0$a */
    /* compiled from: ViewOverlayApi14 */
    static class C1947a extends ViewGroup {

        /* renamed from: Q */
        static Method f7466Q;

        /* renamed from: N */
        ArrayList<Drawable> f7467N = null;

        /* renamed from: O */
        C1946u0 f7468O;

        /* renamed from: P */
        private boolean f7469P;

        /* renamed from: a */
        ViewGroup f7470a;

        /* renamed from: b */
        View f7471b;

        static {
            try {
                f7466Q = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C1947a(Context context, ViewGroup viewGroup, View view, C1946u0 u0Var) {
            super(context);
            this.f7470a = viewGroup;
            this.f7471b = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f7468O = u0Var;
        }

        /* renamed from: a */
        public void mo8490a(Drawable drawable) {
            m10246a();
            if (this.f7467N == null) {
                this.f7467N = new ArrayList<>();
            }
            if (!this.f7467N.contains(drawable)) {
                this.f7467N.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo8492b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f7467N;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                m10248b();
            }
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f7470a.getLocationOnScreen(iArr);
            this.f7471b.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f7471b.getWidth(), this.f7471b.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f7467N;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Drawable) this.f7467N.get(i)).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f7470a != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f7470a instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    m10247a(iArr2);
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
                ArrayList<Drawable> arrayList = this.f7467N;
                if (arrayList == null || !arrayList.contains(drawable)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void mo8493b(View view) {
            super.removeView(view);
            m10248b();
        }

        /* renamed from: b */
        private void m10248b() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f7467N;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f7469P = true;
                    this.f7470a.removeView(this);
                }
            }
        }

        /* renamed from: a */
        public void mo8491a(View view) {
            m10246a();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f7470a || viewGroup.getParent() == null || !C0962e0.m5515h0(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f7470a.getLocationOnScreen(iArr2);
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
        private void m10246a() {
            if (this.f7469P) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: a */
        private void m10247a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f7470a.getLocationOnScreen(iArr2);
            this.f7471b.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* access modifiers changed from: protected */
        @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public ViewParent mo8489a(int i, int i2, Rect rect) {
            if ((this.f7470a instanceof ViewGroup) && f7466Q != null) {
                try {
                    m10247a(new int[2]);
                    f7466Q.invoke(this.f7470a, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), rect});
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
            }
            return null;
        }
    }

    C1946u0(Context context, ViewGroup viewGroup, View view) {
        this.f7465a = new C1947a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    static C1946u0 m10242c(View view) {
        ViewGroup d = m10243d(view);
        if (d == null) {
            return null;
        }
        int childCount = d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = d.getChildAt(i);
            if (childAt instanceof C1947a) {
                return ((C1947a) childAt).f7468O;
            }
        }
        return new C1933p0(d.getContext(), d, view);
    }

    /* renamed from: d */
    static ViewGroup m10243d(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo8448a(@C0193h0 Drawable drawable) {
        this.f7465a.mo8490a(drawable);
    }

    /* renamed from: b */
    public void mo8449b(@C0193h0 Drawable drawable) {
        this.f7465a.mo8492b(drawable);
    }
}
