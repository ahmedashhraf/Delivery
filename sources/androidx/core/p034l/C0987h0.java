package androidx.core.p034l;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.l.h0 */
/* compiled from: ViewParentCompat */
public final class C0987h0 {

    /* renamed from: a */
    private static final String f4420a = "ViewParentCompat";

    /* renamed from: b */
    private static int[] f4421b;

    private C0987h0() {
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m5658a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public static void m5660b(ViewParent viewParent, View view, View view2, int i) {
        m5655a(viewParent, view, view2, i, 0);
    }

    /* renamed from: c */
    public static boolean m5662c(ViewParent viewParent, View view, View view2, int i) {
        return m5661b(viewParent, view, view2, i, 0);
    }

    /* renamed from: a */
    public static void m5647a(ViewParent viewParent, View view) {
        m5648a(viewParent, view, 0);
    }

    /* renamed from: b */
    public static boolean m5661b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C1050t) {
            return ((C1050t) viewParent).mo1890a(view, view2, i, i2);
        }
        if (i2 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    return viewParent.onStartNestedScroll(view, view2, i);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onStartNestedScroll");
                    sb.toString();
                }
            } else if (viewParent instanceof C1052v) {
                return ((C1052v) viewParent).onStartNestedScroll(view, view2, i);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m5649a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        m5651a(viewParent, view, i, i2, i3, i4, 0, m5659a());
    }

    /* renamed from: a */
    public static void m5650a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        m5651a(viewParent, view, i, i2, i3, i4, i5, m5659a());
    }

    /* renamed from: a */
    public static void m5652a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        m5653a(viewParent, view, i, i2, iArr, 0);
    }

    /* renamed from: a */
    public static void m5655a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C1050t) {
            ((C1050t) viewParent).mo1892b(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedScrollAccepted");
                    sb.toString();
                }
            } else if (viewParent instanceof C1052v) {
                ((C1052v) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    /* renamed from: a */
    public static void m5648a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C1050t) {
            ((C1050t) viewParent).mo1886a(view, i);
        } else if (i != 0) {
        } else {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onStopNestedScroll");
                    sb.toString();
                }
            } else if (viewParent instanceof C1052v) {
                ((C1052v) viewParent).onStopNestedScroll(view);
            }
        }
    }

    /* renamed from: a */
    public static void m5651a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, @C0193h0 int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof C1051u) {
            ((C1051u) viewParent2).mo1888a(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof C1050t) {
            ((C1050t) viewParent2).mo1887a(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedScroll");
                    sb.toString();
                }
            } else if (viewParent2 instanceof C1052v) {
                ((C1052v) viewParent2).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: a */
    public static void m5653a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C1050t) {
            ((C1050t) viewParent).mo1889a(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ViewParent ");
                    sb.append(viewParent);
                    sb.append(" does not implement interface method onNestedPreScroll");
                    sb.toString();
                }
            } else if (viewParent instanceof C1052v) {
                ((C1052v) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    /* renamed from: a */
    public static boolean m5657a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedFling");
                sb.toString();
            }
        } else {
            if (viewParent instanceof C1052v) {
                return ((C1052v) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m5656a(ViewParent viewParent, View view, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreFling");
                sb.toString();
            }
        } else {
            if (viewParent instanceof C1052v) {
                return ((C1052v) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m5654a(ViewParent viewParent, View view, View view2, int i) {
        if (VERSION.SDK_INT >= 19) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }
    }

    /* renamed from: a */
    private static int[] m5659a() {
        int[] iArr = f4421b;
        if (iArr == null) {
            f4421b = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f4421b;
    }
}
