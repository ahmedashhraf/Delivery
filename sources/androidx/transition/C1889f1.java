package androidx.transition;

import android.view.View;

/* renamed from: androidx.transition.f1 */
/* compiled from: VisibilityPropagation */
public abstract class C1889f1 extends C1911j0 {

    /* renamed from: a */
    private static final String f7305a = "android:visibilityPropagation:visibility";

    /* renamed from: b */
    private static final String f7306b = "android:visibilityPropagation:center";

    /* renamed from: c */
    private static final String[] f7307c = {f7305a, f7306b};

    /* renamed from: a */
    public void mo8379a(C1922m0 m0Var) {
        View view = m0Var.f7404b;
        Integer num = (Integer) m0Var.f7403a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        m0Var.f7403a.put(f7305a, num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iArr[0] + (view.getWidth() / 2);
        iArr[1] = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iArr[1] + (view.getHeight() / 2);
        m0Var.f7403a.put(f7306b, iArr);
    }

    /* renamed from: b */
    public int mo8381b(C1922m0 m0Var) {
        if (m0Var == null) {
            return 8;
        }
        Integer num = (Integer) m0Var.f7403a.get(f7305a);
        if (num == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: c */
    public int mo8382c(C1922m0 m0Var) {
        return m10006a(m0Var, 0);
    }

    /* renamed from: d */
    public int mo8383d(C1922m0 m0Var) {
        return m10006a(m0Var, 1);
    }

    /* renamed from: a */
    public String[] mo8380a() {
        return f7307c;
    }

    /* renamed from: a */
    private static int m10006a(C1922m0 m0Var, int i) {
        if (m0Var == null) {
            return -1;
        }
        int[] iArr = (int[]) m0Var.f7403a.get(f7306b);
        if (iArr == null) {
            return -1;
        }
        return iArr[i];
    }
}
