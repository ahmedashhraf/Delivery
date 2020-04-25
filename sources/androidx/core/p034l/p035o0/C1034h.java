package androidx.core.p034l.p035o0;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityWindowInfo;

/* renamed from: androidx.core.l.o0.h */
/* compiled from: AccessibilityWindowInfoCompat */
public class C1034h {

    /* renamed from: b */
    private static final int f4653b = -1;

    /* renamed from: c */
    public static final int f4654c = 1;

    /* renamed from: d */
    public static final int f4655d = 2;

    /* renamed from: e */
    public static final int f4656e = 3;

    /* renamed from: f */
    public static final int f4657f = 4;

    /* renamed from: g */
    public static final int f4658g = 5;

    /* renamed from: a */
    private Object f4659a;

    private C1034h(Object obj) {
        this.f4659a = obj;
    }

    /* renamed from: a */
    static C1034h m6049a(Object obj) {
        if (obj != null) {
            return new C1034h(obj);
        }
        return null;
    }

    /* renamed from: b */
    private static String m6050b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    /* renamed from: m */
    public static C1034h m6051m() {
        if (VERSION.SDK_INT >= 21) {
            return m6049a((Object) AccessibilityWindowInfo.obtain());
        }
        return null;
    }

    /* renamed from: b */
    public int mo5127b() {
        if (VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f4659a).getChildCount();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo5128c() {
        if (VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f4659a).getId();
        }
        return -1;
    }

    /* renamed from: d */
    public int mo5129d() {
        if (VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f4659a).getLayer();
        }
        return -1;
    }

    /* renamed from: e */
    public C1034h mo5130e() {
        if (VERSION.SDK_INT >= 21) {
            return m6049a((Object) ((AccessibilityWindowInfo) this.f4659a).getParent());
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1034h.class != obj.getClass()) {
            return false;
        }
        C1034h hVar = (C1034h) obj;
        Object obj2 = this.f4659a;
        if (obj2 == null) {
            if (hVar.f4659a != null) {
                return false;
            }
        } else if (!obj2.equals(hVar.f4659a)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C1016d mo5132f() {
        if (VERSION.SDK_INT >= 21) {
            return C1016d.m5810c((Object) ((AccessibilityWindowInfo) this.f4659a).getRoot());
        }
        return null;
    }

    /* renamed from: g */
    public CharSequence mo5133g() {
        if (VERSION.SDK_INT >= 24) {
            return ((AccessibilityWindowInfo) this.f4659a).getTitle();
        }
        return null;
    }

    /* renamed from: h */
    public int mo5134h() {
        if (VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f4659a).getType();
        }
        return -1;
    }

    public int hashCode() {
        Object obj = this.f4659a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: i */
    public boolean mo5136i() {
        if (VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f4659a).isAccessibilityFocused();
        }
        return true;
    }

    /* renamed from: j */
    public boolean mo5137j() {
        if (VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f4659a).isActive();
        }
        return true;
    }

    /* renamed from: k */
    public boolean mo5138k() {
        if (VERSION.SDK_INT >= 21) {
            return ((AccessibilityWindowInfo) this.f4659a).isFocused();
        }
        return true;
    }

    /* renamed from: l */
    public void mo5139l() {
        if (VERSION.SDK_INT >= 21) {
            ((AccessibilityWindowInfo) this.f4659a).recycle();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        mo5126a(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(mo5128c());
        sb.append(", type=");
        sb.append(m6050b(mo5134h()));
        sb.append(", layer=");
        sb.append(mo5129d());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(mo5138k());
        sb.append(", active=");
        sb.append(mo5137j());
        sb.append(", hasParent=");
        boolean z = true;
        sb.append(mo5130e() != null);
        sb.append(", hasChildren=");
        if (mo5127b() <= 0) {
            z = false;
        }
        sb.append(z);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public void mo5126a(Rect rect) {
        if (VERSION.SDK_INT >= 21) {
            ((AccessibilityWindowInfo) this.f4659a).getBoundsInScreen(rect);
        }
    }

    /* renamed from: a */
    public C1034h mo5125a(int i) {
        if (VERSION.SDK_INT >= 21) {
            return m6049a((Object) ((AccessibilityWindowInfo) this.f4659a).getChild(i));
        }
        return null;
    }

    /* renamed from: a */
    public C1016d mo5124a() {
        if (VERSION.SDK_INT >= 24) {
            return C1016d.m5810c((Object) ((AccessibilityWindowInfo) this.f4659a).getAnchor());
        }
        return null;
    }

    /* renamed from: a */
    public static C1034h m6048a(C1034h hVar) {
        if (VERSION.SDK_INT < 21 || hVar == null) {
            return null;
        }
        return m6049a((Object) AccessibilityWindowInfo.obtain((AccessibilityWindowInfo) hVar.f4659a));
    }
}
