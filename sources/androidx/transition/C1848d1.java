package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.d1 */
/* compiled from: ViewUtilsBase */
class C1848d1 {

    /* renamed from: b */
    private static final String f7137b = "ViewUtilsBase";

    /* renamed from: c */
    private static Method f7138c = null;

    /* renamed from: d */
    private static boolean f7139d = false;

    /* renamed from: e */
    private static Field f7140e = null;

    /* renamed from: f */
    private static boolean f7141f = false;

    /* renamed from: g */
    private static final int f7142g = 12;

    /* renamed from: a */
    private float[] f7143a;

    C1848d1() {
    }

    /* renamed from: a */
    public void mo8255a(@C0193h0 View view, float f) {
        Float f2 = (Float) view.getTag(C1822R.C1825id.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: b */
    public float mo8257b(@C0193h0 View view) {
        Float f = (Float) view.getTag(C1822R.C1825id.save_non_transition_alpha);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: c */
    public void mo8269c(@C0193h0 View view) {
        if (view.getTag(C1822R.C1825id.save_non_transition_alpha) == null) {
            view.setTag(C1822R.C1825id.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: c */
    public void mo8259c(@C0193h0 View view, @C0193h0 Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo8259c(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    /* renamed from: a */
    public void mo8268a(@C0193h0 View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C1822R.C1825id.save_non_transition_alpha, null);
        }
    }

    /* renamed from: b */
    public void mo8258b(@C0193h0 View view, @C0193h0 Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo8258b(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: a */
    public void mo8256a(@C0193h0 View view, @C0195i0 Matrix matrix) {
        if (matrix == null || matrix.isIdentity()) {
            view.setPivotX((float) (view.getWidth() / 2));
            view.setPivotY((float) (view.getHeight() / 2));
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
            return;
        }
        float[] fArr = this.f7143a;
        if (fArr == null) {
            fArr = new float[9];
            this.f7143a = fArr;
        }
        matrix.getValues(fArr);
        float f = fArr[3];
        float sqrt = ((float) Math.sqrt((double) (1.0f - (f * f)))) * ((float) (fArr[0] < 0.0f ? -1 : 1));
        float degrees = (float) Math.toDegrees(Math.atan2((double) f, (double) sqrt));
        float f2 = fArr[0] / sqrt;
        float f3 = fArr[4] / sqrt;
        float f4 = fArr[2];
        float f5 = fArr[5];
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(f4);
        view.setTranslationY(f5);
        view.setRotation(degrees);
        view.setScaleX(f2);
        view.setScaleY(f3);
    }

    /* renamed from: a */
    public void mo8237a(@C0193h0 View view, int i, int i2, int i3, int i4) {
        m9854a();
        Method method = f7138c;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: a */
    public void mo8251a(@C0193h0 View view, int i) {
        if (!f7141f) {
            try {
                f7140e = View.class.getDeclaredField("mViewFlags");
                f7140e.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f7141f = true;
        }
        Field field = f7140e;
        if (field != null) {
            try {
                f7140e.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private void m9854a() {
        if (!f7139d) {
            try {
                f7138c = View.class.getDeclaredMethod("setFrame", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                f7138c.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f7139d = true;
        }
    }
}
