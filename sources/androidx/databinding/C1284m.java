package androidx.databinding;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.databinding.m */
/* compiled from: DataBindingUtil */
public class C1284m {

    /* renamed from: a */
    private static C1271j f5160a = new C1272k();

    /* renamed from: b */
    private static C1273l f5161b = null;

    private C1284m() {
    }

    /* renamed from: a */
    public static void m6875a(@C0195i0 C1273l lVar) {
        f5161b = lVar;
    }

    @C0195i0
    /* renamed from: b */
    public static <T extends ViewDataBinding> T m6876b(@C0193h0 View view) {
        while (view != null) {
            T b = ViewDataBinding.m6617b(view);
            if (b != null) {
                return b;
            }
            Object tag = view.getTag();
            if (tag instanceof String) {
                String str = (String) tag;
                if (str.startsWith("layout") && str.endsWith("_0")) {
                    char charAt = str.charAt(6);
                    int indexOf = str.indexOf(47, 7);
                    boolean z = false;
                    if (charAt != '/' ? charAt == '-' && indexOf != -1 && str.indexOf(47, indexOf + 1) == -1 : indexOf == -1) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                }
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @C0195i0
    /* renamed from: c */
    public static <T extends ViewDataBinding> T m6877c(@C0193h0 View view) {
        return ViewDataBinding.m6617b(view);
    }

    @C0195i0
    /* renamed from: a */
    public static C1273l m6873a() {
        return f5161b;
    }

    /* renamed from: a */
    public static <T extends ViewDataBinding> T m6866a(@C0193h0 LayoutInflater layoutInflater, int i, @C0195i0 ViewGroup viewGroup, boolean z) {
        return m6867a(layoutInflater, i, viewGroup, z, f5161b);
    }

    /* renamed from: a */
    public static <T extends ViewDataBinding> T m6867a(@C0193h0 LayoutInflater layoutInflater, int i, @C0195i0 ViewGroup viewGroup, boolean z, @C0195i0 C1273l lVar) {
        int i2 = 0;
        boolean z2 = viewGroup != null && z;
        if (z2) {
            i2 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        if (z2) {
            return m6871a(lVar, viewGroup, i2, i);
        }
        return m6870a(lVar, inflate, i);
    }

    @C0195i0
    /* renamed from: a */
    public static <T extends ViewDataBinding> T m6868a(@C0193h0 View view) {
        return m6869a(view, f5161b);
    }

    @C0195i0
    /* renamed from: a */
    public static <T extends ViewDataBinding> T m6869a(@C0193h0 View view, C1273l lVar) {
        T c = m6877c(view);
        if (c != null) {
            return c;
        }
        Object tag = view.getTag();
        if (tag instanceof String) {
            int a = f5160a.mo5673a((String) tag);
            if (a != 0) {
                return f5160a.mo5674a(lVar, view, a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("View is not a binding layout. Tag: ");
            sb.append(tag);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("View is not a binding layout");
    }

    /* renamed from: a */
    static <T extends ViewDataBinding> T m6872a(C1273l lVar, View[] viewArr, int i) {
        return f5160a.mo5675a(lVar, viewArr, i);
    }

    /* renamed from: a */
    static <T extends ViewDataBinding> T m6870a(C1273l lVar, View view, int i) {
        return f5160a.mo5674a(lVar, view, i);
    }

    /* renamed from: a */
    public static <T extends ViewDataBinding> T m6864a(@C0193h0 Activity activity, int i) {
        return m6865a(activity, i, f5161b);
    }

    /* renamed from: a */
    public static <T extends ViewDataBinding> T m6865a(@C0193h0 Activity activity, int i, @C0195i0 C1273l lVar) {
        activity.setContentView(i);
        return m6871a(lVar, (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290), 0, i);
    }

    @C0195i0
    /* renamed from: a */
    public static String m6874a(int i) {
        return f5160a.mo5676a(i);
    }

    /* renamed from: a */
    private static <T extends ViewDataBinding> T m6871a(C1273l lVar, ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return m6870a(lVar, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return m6872a(lVar, viewArr, i2);
    }
}
