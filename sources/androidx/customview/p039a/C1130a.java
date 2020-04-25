package androidx.customview.p039a;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.collection.C0650i;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0987h0;
import androidx.core.p034l.p035o0.C1009b;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.p034l.p035o0.C1021e;
import androidx.core.p034l.p035o0.C1024f;
import androidx.customview.p039a.C1134b.C1135a;
import androidx.customview.p039a.C1134b.C1136b;
import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: androidx.customview.a.a */
/* compiled from: ExploreByTouchHelper */
public abstract class C1130a extends C0947a {

    /* renamed from: n */
    public static final int f4949n = Integer.MIN_VALUE;

    /* renamed from: o */
    public static final int f4950o = -1;

    /* renamed from: p */
    private static final String f4951p = "android.view.View";

    /* renamed from: q */
    private static final Rect f4952q = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: r */
    private static final C1135a<C1016d> f4953r = new C1131a();

    /* renamed from: s */
    private static final C1136b<C0650i<C1016d>, C1016d> f4954s = new C1132b();

    /* renamed from: d */
    private final Rect f4955d = new Rect();

    /* renamed from: e */
    private final Rect f4956e = new Rect();

    /* renamed from: f */
    private final Rect f4957f = new Rect();

    /* renamed from: g */
    private final int[] f4958g = new int[2];

    /* renamed from: h */
    private final AccessibilityManager f4959h;

    /* renamed from: i */
    private final View f4960i;

    /* renamed from: j */
    private C1133c f4961j;

    /* renamed from: k */
    int f4962k = Integer.MIN_VALUE;

    /* renamed from: l */
    int f4963l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f4964m = Integer.MIN_VALUE;

    /* renamed from: androidx.customview.a.a$a */
    /* compiled from: ExploreByTouchHelper */
    static class C1131a implements C1135a<C1016d> {
        C1131a() {
        }

        /* renamed from: a */
        public void mo5412a(C1016d dVar, Rect rect) {
            dVar.mo4932a(rect);
        }
    }

    /* renamed from: androidx.customview.a.a$b */
    /* compiled from: ExploreByTouchHelper */
    static class C1132b implements C1136b<C0650i<C1016d>, C1016d> {
        C1132b() {
        }

        /* renamed from: a */
        public C1016d mo5416a(C0650i<C1016d> iVar, int i) {
            return (C1016d) iVar.mo3404h(i);
        }

        /* renamed from: a */
        public int mo5414a(C0650i<C1016d> iVar) {
            return iVar.mo3395d();
        }
    }

    /* renamed from: androidx.customview.a.a$c */
    /* compiled from: ExploreByTouchHelper */
    private class C1133c extends C1021e {
        C1133c() {
        }

        /* renamed from: a */
        public C1016d mo5055a(int i) {
            return C1016d.m5807a(C1130a.this.mo5407c(i));
        }

        /* renamed from: b */
        public C1016d mo5059b(int i) {
            int i2 = i == 2 ? C1130a.this.f4962k : C1130a.this.f4963l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo5055a(i2);
        }

        /* renamed from: a */
        public boolean mo5058a(int i, int i2, Bundle bundle) {
            return C1130a.this.mo5405b(i, i2, bundle);
        }
    }

    public C1130a(@C0193h0 View view) {
        if (view != null) {
            this.f4960i = view;
            this.f4959h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C0962e0.m5557t(view) == 0) {
                C0962e0.m5531l(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: f */
    private boolean m6417f() {
        int i = this.f4963l;
        return i != Integer.MIN_VALUE && mo5399a(i, 16, (Bundle) null);
    }

    @C0193h0
    /* renamed from: g */
    private C1016d m6418g() {
        C1016d k = C1016d.m5820k(this.f4960i);
        C0962e0.m5447a(this.f4960i, k);
        ArrayList arrayList = new ArrayList();
        mo5396a((List<Integer>) arrayList);
        if (k.mo4964d() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                k.mo4934a(this.f4960i, ((Integer) arrayList.get(i)).intValue());
            }
            return k;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: h */
    private static int m6420h(int i) {
        if (i == 19) {
            return 33;
        }
        if (i == 21) {
            return 17;
        }
        if (i != 22) {
            return C13959t.f40839S1;
        }
        return 66;
    }

    /* renamed from: h */
    private C0650i<C1016d> m6421h() {
        ArrayList arrayList = new ArrayList();
        mo5396a((List<Integer>) arrayList);
        C0650i<C1016d> iVar = new C0650i<>();
        for (int i = 0; i < arrayList.size(); i++) {
            iVar.mo3392c(i, m6419g(i));
        }
        return iVar;
    }

    /* renamed from: i */
    private boolean m6422i(int i) {
        if (this.f4959h.isEnabled() && this.f4959h.isTouchExplorationEnabled()) {
            int i2 = this.f4962k;
            if (i2 != i) {
                if (i2 != Integer.MIN_VALUE) {
                    m6415e(i2);
                }
                this.f4962k = i;
                this.f4960i.invalidate();
                mo5404b(i, 32768);
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    private void m6423j(int i) {
        int i2 = this.f4964m;
        if (i2 != i) {
            this.f4964m = i;
            mo5404b(i, 128);
            mo5404b(i2, 256);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo5389a(float f, float f2);

    /* renamed from: a */
    public C1021e mo4747a(View view) {
        if (this.f4961j == null) {
            this.f4961j = new C1133c();
        }
        return this.f4961j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5391a(int i, @C0193h0 AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5392a(int i, @C0193h0 C1016d dVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5393a(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5394a(@C0193h0 AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5395a(@C0193h0 C1016d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5396a(List<Integer> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo5399a(int i, int i2, @C0195i0 Bundle bundle);

    /* renamed from: b */
    public final int mo5402b() {
        return this.f4962k;
    }

    @Deprecated
    /* renamed from: c */
    public int mo5406c() {
        return mo5402b();
    }

    /* renamed from: d */
    public final int mo5408d() {
        return this.f4963l;
    }

    /* renamed from: e */
    public final void mo5410e() {
        mo5390a(-1, 1);
    }

    /* renamed from: b */
    private boolean m6411b(int i, @C0195i0 Rect rect) {
        C1016d dVar;
        C1016d dVar2;
        C0650i h = m6421h();
        int i2 = this.f4963l;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            dVar = null;
        } else {
            dVar = (C1016d) h.mo3391c(i2);
        }
        Object obj = dVar;
        if (i == 1 || i == 2) {
            dVar2 = (C1016d) C1134b.m6459a(h, f4954s, f4953r, obj, i, C0962e0.m5566x(this.f4960i) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f4963l;
            if (i4 != Integer.MIN_VALUE) {
                m6408a(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m6407a(this.f4960i, i, rect2);
            }
            dVar2 = (C1016d) C1134b.m6460a(h, f4954s, f4953r, obj, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (dVar2 != null) {
            i3 = h.mo3398e(h.mo3387b(dVar2));
        }
        return mo5409d(i3);
    }

    /* renamed from: c */
    private AccessibilityEvent m6412c(int i, int i2) {
        if (i != -1) {
            return m6414d(i, i2);
        }
        return m6416f(i2);
    }

    /* renamed from: d */
    private AccessibilityEvent m6414d(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C1016d c = mo5407c(i);
        obtain.getText().add(c.mo5035y());
        obtain.setContentDescription(c.mo4993h());
        obtain.setScrollable(c.mo4927Y());
        obtain.setPassword(c.mo4925W());
        obtain.setEnabled(c.mo4918P());
        obtain.setChecked(c.mo4912J());
        mo5391a(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(c.mo4972e());
            C1024f.m5986a(obtain, this.f4960i, i);
            obtain.setPackageName(this.f4960i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: e */
    private boolean m6415e(int i) {
        if (this.f4962k != i) {
            return false;
        }
        this.f4962k = Integer.MIN_VALUE;
        this.f4960i.invalidate();
        mo5404b(i, 65536);
        return true;
    }

    /* renamed from: f */
    private AccessibilityEvent m6416f(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f4960i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: a */
    public final boolean mo5401a(@C0193h0 MotionEvent motionEvent) {
        boolean z = false;
        if (this.f4959h.isEnabled() && this.f4959h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int a = mo5389a(motionEvent.getX(), motionEvent.getY());
                m6423j(a);
                if (a != Integer.MIN_VALUE) {
                    z = true;
                }
            } else if (action != 10 || this.f4964m == Integer.MIN_VALUE) {
                return false;
            } else {
                m6423j(Integer.MIN_VALUE);
                return true;
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: c */
    public C1016d mo5407c(int i) {
        if (i == -1) {
            return m6418g();
        }
        return m6419g(i);
    }

    /* renamed from: c */
    private boolean m6413c(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return mo5409d(i);
        }
        if (i2 == 2) {
            return mo5398a(i);
        }
        if (i2 == 64) {
            return m6422i(i);
        }
        if (i2 != 128) {
            return mo5399a(i, i2, bundle);
        }
        return m6415e(i);
    }

    @C0193h0
    /* renamed from: g */
    private C1016d m6419g(int i) {
        C1016d i0 = C1016d.m5817i0();
        i0.mo5006j(true);
        i0.mo5008k(true);
        i0.mo4937a((CharSequence) f4951p);
        i0.mo4957c(f4952q);
        i0.mo4966d(f4952q);
        i0.mo4973e(this.f4960i);
        mo5392a(i, i0);
        if (i0.mo5035y() == null && i0.mo4993h() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        i0.mo4932a(this.f4956e);
        if (!this.f4956e.equals(f4952q)) {
            int c = i0.mo4955c();
            if ((c & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((c & 128) == 0) {
                i0.mo4975e((CharSequence) this.f4960i.getContext().getPackageName());
                i0.mo4983f(this.f4960i, i);
                if (this.f4962k == i) {
                    i0.mo4940a(true);
                    i0.mo4930a(128);
                } else {
                    i0.mo4940a(false);
                    i0.mo4930a(64);
                }
                boolean z = this.f4963l == i;
                if (z) {
                    i0.mo4930a(2);
                } else if (i0.mo4919Q()) {
                    i0.mo4930a(1);
                }
                i0.mo5010l(z);
                this.f4960i.getLocationOnScreen(this.f4958g);
                i0.mo4947b(this.f4955d);
                if (this.f4955d.equals(f4952q)) {
                    i0.mo4932a(this.f4955d);
                    if (i0.f4597b != -1) {
                        C1016d i02 = C1016d.m5817i0();
                        for (int i2 = i0.f4597b; i2 != -1; i2 = i02.f4597b) {
                            i02.mo4974e(this.f4960i, -1);
                            i02.mo4957c(f4952q);
                            mo5392a(i2, i02);
                            i02.mo4932a(this.f4956e);
                            Rect rect = this.f4955d;
                            Rect rect2 = this.f4956e;
                            rect.offset(rect2.left, rect2.top);
                        }
                        i02.mo4971d0();
                    }
                    this.f4955d.offset(this.f4958g[0] - this.f4960i.getScrollX(), this.f4958g[1] - this.f4960i.getScrollY());
                }
                if (this.f4960i.getLocalVisibleRect(this.f4957f)) {
                    this.f4957f.offset(this.f4958g[0] - this.f4960i.getScrollX(), this.f4958g[1] - this.f4960i.getScrollY());
                    if (this.f4955d.intersect(this.f4957f)) {
                        i0.mo4966d(this.f4955d);
                        if (m6410a(this.f4955d)) {
                            i0.mo5033w(true);
                        }
                    }
                }
                return i0;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: a */
    public final boolean mo5400a(@C0193h0 KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int h = m6420h(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m6411b(h, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m6417f();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m6411b(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m6411b(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo5409d(int i) {
        if (!this.f4960i.isFocused() && !this.f4960i.requestFocus()) {
            return false;
        }
        int i2 = this.f4963l;
        if (i2 == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo5398a(i2);
        }
        this.f4963l = i;
        mo5393a(i, true);
        mo5404b(i, 8);
        return true;
    }

    /* renamed from: b */
    public final boolean mo5404b(int i, int i2) {
        if (i == Integer.MIN_VALUE || !this.f4959h.isEnabled()) {
            return false;
        }
        ViewParent parent = this.f4960i.getParent();
        if (parent == null) {
            return false;
        }
        return C0987h0.m5658a(parent, this.f4960i, m6412c(i, i2));
    }

    /* renamed from: b */
    public final void mo5403b(int i) {
        mo5390a(i, 0);
    }

    /* renamed from: a */
    public final void mo5397a(boolean z, int i, @C0195i0 Rect rect) {
        int i2 = this.f4963l;
        if (i2 != Integer.MIN_VALUE) {
            mo5398a(i2);
        }
        if (z) {
            m6411b(i, rect);
        }
    }

    /* renamed from: b */
    public void mo4753b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo4753b(view, accessibilityEvent);
        mo5394a(accessibilityEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5405b(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m6413c(i, i2, bundle);
        }
        return m6409a(i2, bundle);
    }

    /* renamed from: a */
    private void m6408a(int i, Rect rect) {
        mo5407c(i).mo4932a(rect);
    }

    /* renamed from: a */
    private static Rect m6407a(@C0193h0 View view, int i, @C0193h0 Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: a */
    public final void mo5390a(int i, int i2) {
        if (i != Integer.MIN_VALUE && this.f4959h.isEnabled()) {
            ViewParent parent = this.f4960i.getParent();
            if (parent != null) {
                AccessibilityEvent c = m6412c(i, 2048);
                C1009b.m5794c(c, i2);
                C0987h0.m5658a(parent, this.f4960i, c);
            }
        }
    }

    /* renamed from: a */
    public void mo4749a(View view, C1016d dVar) {
        super.mo4749a(view, dVar);
        mo5395a(dVar);
    }

    /* renamed from: a */
    private boolean m6409a(int i, Bundle bundle) {
        return C0962e0.m5465a(this.f4960i, i, bundle);
    }

    /* renamed from: a */
    private boolean m6410a(Rect rect) {
        boolean z = false;
        if (rect != null && !rect.isEmpty()) {
            if (this.f4960i.getWindowVisibility() != 0) {
                return false;
            }
            ViewParent parent = this.f4960i.getParent();
            while (parent instanceof View) {
                View view = (View) parent;
                if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                    return false;
                }
                parent = view.getParent();
            }
            if (parent != null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo5398a(int i) {
        if (this.f4963l != i) {
            return false;
        }
        this.f4963l = Integer.MIN_VALUE;
        mo5393a(i, false);
        mo5404b(i, 8);
        return true;
    }
}
