package androidx.core.p034l;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.core.l.s */
/* compiled from: NestedScrollingChildHelper */
public class C1049s {

    /* renamed from: a */
    private ViewParent f4690a;

    /* renamed from: b */
    private ViewParent f4691b;

    /* renamed from: c */
    private final View f4692c;

    /* renamed from: d */
    private boolean f4693d;

    /* renamed from: e */
    private int[] f4694e;

    public C1049s(@C0193h0 View view) {
        this.f4692c = view;
    }

    /* renamed from: e */
    private int[] m6106e() {
        if (this.f4694e == null) {
            this.f4694e = new int[2];
        }
        return this.f4694e;
    }

    /* renamed from: a */
    public void mo5174a(boolean z) {
        if (this.f4693d) {
            C0962e0.m5567x0(this.f4692c);
        }
        this.f4693d = z;
    }

    /* renamed from: b */
    public boolean mo5184b() {
        return this.f4693d;
    }

    /* renamed from: c */
    public void mo5187c(int i) {
        ViewParent d = m6105d(i);
        if (d != null) {
            C0987h0.m5648a(d, this.f4692c, i);
            m6103a(i, (ViewParent) null);
        }
    }

    /* renamed from: d */
    public void mo5188d() {
        mo5187c(0);
    }

    /* renamed from: d */
    private ViewParent m6105d(int i) {
        if (i == 0) {
            return this.f4690a;
        }
        if (i != 1) {
            return null;
        }
        return this.f4691b;
    }

    /* renamed from: b */
    public boolean mo5185b(int i) {
        return mo5179a(i, 0);
    }

    /* renamed from: b */
    private boolean m6104b(int i, int i2, int i3, int i4, @C0195i0 int[] iArr, int i5, @C0195i0 int[] iArr2) {
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (mo5184b()) {
            ViewParent d = m6105d(i5);
            if (d == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr4 != null) {
                    this.f4692c.getLocationInWindow(iArr4);
                    i7 = iArr4[0];
                    i6 = iArr4[1];
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                if (iArr2 == null) {
                    int[] e = m6106e();
                    e[0] = 0;
                    e[1] = 0;
                    iArr3 = e;
                } else {
                    iArr3 = iArr2;
                }
                C0987h0.m5651a(d, this.f4692c, i, i2, i3, i4, i5, iArr3);
                if (iArr4 != null) {
                    this.f4692c.getLocationInWindow(iArr4);
                    iArr4[0] = iArr4[0] - i7;
                    iArr4[1] = iArr4[1] - i6;
                }
                return true;
            } else if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5175a() {
        return mo5178a(0);
    }

    /* renamed from: c */
    public void mo5186c() {
        C0962e0.m5567x0(this.f4692c);
    }

    /* renamed from: a */
    public boolean mo5178a(int i) {
        return m6105d(i) != null;
    }

    /* renamed from: a */
    public boolean mo5179a(int i, int i2) {
        if (mo5178a(i2)) {
            return true;
        }
        if (mo5184b()) {
            View view = this.f4692c;
            for (ViewParent parent = this.f4692c.getParent(); parent != null; parent = parent.getParent()) {
                if (C0987h0.m5661b(parent, view, this.f4692c, i, i2)) {
                    m6103a(i2, parent);
                    C0987h0.m5655a(parent, view, this.f4692c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5180a(int i, int i2, int i3, int i4, @C0195i0 int[] iArr) {
        return m6104b(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: a */
    public boolean mo5181a(int i, int i2, int i3, int i4, @C0195i0 int[] iArr, int i5) {
        return m6104b(i, i2, i3, i4, iArr, i5, null);
    }

    /* renamed from: a */
    public void mo5172a(int i, int i2, int i3, int i4, @C0195i0 int[] iArr, int i5, @C0195i0 int[] iArr2) {
        m6104b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: a */
    public boolean mo5182a(int i, int i2, @C0195i0 int[] iArr, @C0195i0 int[] iArr2) {
        return mo5183a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean mo5183a(int i, int i2, @C0195i0 int[] iArr, @C0195i0 int[] iArr2, int i3) {
        int i4;
        int i5;
        if (mo5184b()) {
            ViewParent d = m6105d(i3);
            if (d == null) {
                return false;
            }
            boolean z = true;
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.f4692c.getLocationInWindow(iArr2);
                    i5 = iArr2[0];
                    i4 = iArr2[1];
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    iArr = m6106e();
                }
                iArr[0] = 0;
                iArr[1] = 0;
                C0987h0.m5653a(d, this.f4692c, i, i2, iArr, i3);
                if (iArr2 != null) {
                    this.f4692c.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                if (iArr[0] == 0 && iArr[1] == 0) {
                    z = false;
                }
                return z;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5177a(float f, float f2, boolean z) {
        if (mo5184b()) {
            ViewParent d = m6105d(0);
            if (d != null) {
                return C0987h0.m5657a(d, this.f4692c, f, f2, z);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5176a(float f, float f2) {
        if (mo5184b()) {
            ViewParent d = m6105d(0);
            if (d != null) {
                return C0987h0.m5656a(d, this.f4692c, f, f2);
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo5173a(@C0193h0 View view) {
        C0962e0.m5567x0(this.f4692c);
    }

    /* renamed from: a */
    private void m6103a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f4690a = viewParent;
        } else if (i == 1) {
            this.f4691b = viewParent;
        }
    }
}
