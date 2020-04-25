package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(21)
/* renamed from: androidx.transition.q */
/* compiled from: GhostViewPlatform */
class C1934q implements C1929o {

    /* renamed from: N */
    private static Class<?> f7435N = null;

    /* renamed from: O */
    private static boolean f7436O = false;

    /* renamed from: P */
    private static Method f7437P = null;

    /* renamed from: Q */
    private static boolean f7438Q = false;

    /* renamed from: R */
    private static Method f7439R = null;

    /* renamed from: S */
    private static boolean f7440S = false;

    /* renamed from: b */
    private static final String f7441b = "GhostViewApi21";

    /* renamed from: a */
    private final View f7442a;

    private C1934q(@C0193h0 View view) {
        this.f7442a = view;
    }

    /* renamed from: a */
    static C1929o m10210a(View view, ViewGroup viewGroup, Matrix matrix) {
        m10211a();
        Method method = f7437P;
        if (method != null) {
            try {
                return new C1934q((View) method.invoke(null, new Object[]{view, viewGroup, matrix}));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    /* renamed from: b */
    private static void m10213b() {
        if (!f7436O) {
            try {
                f7435N = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException unused) {
            }
            f7436O = true;
        }
    }

    /* renamed from: c */
    private static void m10214c() {
        if (!f7440S) {
            try {
                m10213b();
                f7439R = f7435N.getDeclaredMethod("removeGhost", new Class[]{View.class});
                f7439R.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f7440S = true;
        }
    }

    /* renamed from: a */
    public void mo8437a(ViewGroup viewGroup, View view) {
    }

    public void setVisibility(int i) {
        this.f7442a.setVisibility(i);
    }

    /* renamed from: a */
    static void m10212a(View view) {
        m10214c();
        Method method = f7439R;
        if (method != null) {
            try {
                method.invoke(null, new Object[]{view});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: a */
    private static void m10211a() {
        if (!f7438Q) {
            try {
                m10213b();
                f7437P = f7435N.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});
                f7437P.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f7438Q = true;
        }
    }
}
