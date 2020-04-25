package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.p035o0.C1016d.C1017a;
import androidx.core.p034l.p035o0.C1025g;
import androidx.core.p034l.p035o0.C1025g.C1026a;
import androidx.customview.p039a.C1138c;
import androidx.customview.p039a.C1138c.C1141c;

public class SwipeDismissBehavior<V extends View> extends C0712c<V> {

    /* renamed from: k */
    public static final int f16100k = 0;

    /* renamed from: l */
    public static final int f16101l = 1;

    /* renamed from: m */
    public static final int f16102m = 2;

    /* renamed from: n */
    public static final int f16103n = 0;

    /* renamed from: o */
    public static final int f16104o = 1;

    /* renamed from: p */
    public static final int f16105p = 2;

    /* renamed from: q */
    private static final float f16106q = 0.5f;

    /* renamed from: r */
    private static final float f16107r = 0.0f;

    /* renamed from: s */
    private static final float f16108s = 0.5f;

    /* renamed from: a */
    C1138c f16109a;

    /* renamed from: b */
    C5626c f16110b;

    /* renamed from: c */
    private boolean f16111c;

    /* renamed from: d */
    private float f16112d = 0.0f;

    /* renamed from: e */
    private boolean f16113e;

    /* renamed from: f */
    int f16114f = 2;

    /* renamed from: g */
    float f16115g = 0.5f;

    /* renamed from: h */
    float f16116h = 0.0f;

    /* renamed from: i */
    float f16117i = 0.5f;

    /* renamed from: j */
    private final C1141c f16118j = new C5624a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C5624a extends C1141c {

        /* renamed from: d */
        private static final int f16119d = -1;

        /* renamed from: a */
        private int f16120a;

        /* renamed from: b */
        private int f16121b = -1;

        C5624a() {
        }

        /* renamed from: a */
        public void mo5453a(@C0193h0 View view, int i) {
            this.f16121b = i;
            this.f16120a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: b */
        public boolean mo5459b(View view, int i) {
            int i2 = this.f16121b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo22294b(view);
        }

        /* renamed from: c */
        public void mo5460c(int i) {
            C5626c cVar = SwipeDismissBehavior.this.f16110b;
            if (cVar != null) {
                cVar.mo22298a(i);
            }
        }

        /* renamed from: b */
        public int mo5456b(@C0193h0 View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: a */
        public void mo5452a(@C0193h0 View view, float f, float f2) {
            boolean z;
            int i;
            this.f16121b = -1;
            int width = view.getWidth();
            if (m24537a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f16120a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f16120a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f16109a.mo5442e(i, view.getTop())) {
                C0962e0.m5451a(view, (Runnable) new C5627d(view, z));
            } else if (z) {
                C5626c cVar = SwipeDismissBehavior.this.f16110b;
                if (cVar != null) {
                    cVar.mo22299a(view);
                }
            }
        }

        /* renamed from: a */
        private boolean m24537a(@C0193h0 View view, float f) {
            boolean z = false;
            if (f != 0.0f) {
                boolean z2 = C0962e0.m5566x(view) == 1;
                int i = SwipeDismissBehavior.this.f16114f;
                if (i == 2) {
                    return true;
                }
                if (i == 0) {
                    return z2 ? z : z;
                    z = true;
                }
                if (i == 1) {
                    if (z2) {
                    }
                    z = true;
                }
                return z;
            }
            if (Math.abs(view.getLeft() - this.f16120a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f16115g)) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        public int mo5449a(@C0193h0 View view) {
            return view.getWidth();
        }

        /* renamed from: a */
        public int mo5450a(@C0193h0 View view, int i, int i2) {
            int i3;
            int i4;
            int width;
            boolean z = C0962e0.m5566x(view) == 1;
            int i5 = SwipeDismissBehavior.this.f16114f;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f16120a - view.getWidth();
                    i4 = view.getWidth() + this.f16120a;
                } else if (z) {
                    i3 = this.f16120a;
                    width = view.getWidth();
                } else {
                    i3 = this.f16120a - view.getWidth();
                    i4 = this.f16120a;
                }
                return SwipeDismissBehavior.m24521a(i3, i, i4);
            } else if (z) {
                i3 = this.f16120a - view.getWidth();
                i4 = this.f16120a;
                return SwipeDismissBehavior.m24521a(i3, i, i4);
            } else {
                i3 = this.f16120a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return SwipeDismissBehavior.m24521a(i3, i, i4);
        }

        /* renamed from: a */
        public void mo5454a(@C0193h0 View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f16120a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f16116h);
            float width2 = ((float) this.f16120a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f16117i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m24520a(0.0f, 1.0f - SwipeDismissBehavior.m24523b(width, width2, f), 1.0f));
            }
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    class C5625b implements C1025g {
        C5625b() {
        }

        /* renamed from: a */
        public boolean mo5111a(@C0193h0 View view, @C0195i0 C1026a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.mo22294b(view)) {
                return false;
            }
            boolean z2 = C0962e0.m5566x(view) == 1;
            if ((SwipeDismissBehavior.this.f16114f == 0 && z2) || (SwipeDismissBehavior.this.f16114f == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            C0962e0.m5508g(view, width);
            view.setAlpha(0.0f);
            C5626c cVar = SwipeDismissBehavior.this.f16110b;
            if (cVar != null) {
                cVar.mo22299a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public interface C5626c {
        /* renamed from: a */
        void mo22298a(int i);

        /* renamed from: a */
        void mo22299a(View view);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    private class C5627d implements Runnable {

        /* renamed from: a */
        private final View f16125a;

        /* renamed from: b */
        private final boolean f16126b;

        C5627d(View view, boolean z) {
            this.f16125a = view;
            this.f16126b = z;
        }

        public void run() {
            C1138c cVar = SwipeDismissBehavior.this.f16109a;
            if (cVar != null && cVar.mo5427a(true)) {
                C0962e0.m5451a(this.f16125a, (Runnable) this);
            } else if (this.f16126b) {
                C5626c cVar2 = SwipeDismissBehavior.this.f16110b;
                if (cVar2 != null) {
                    cVar2.mo22299a(this.f16125a);
                }
            }
        }
    }

    /* renamed from: b */
    static float m24523b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public void mo22291a(@C0195i0 C5626c cVar) {
        this.f16110b = cVar;
    }

    /* renamed from: b */
    public void mo22293b(float f) {
        this.f16117i = m24520a(0.0f, f, 1.0f);
    }

    /* renamed from: b */
    public boolean mo22294b(@C0193h0 View view) {
        return true;
    }

    @C0224v0
    @C0195i0
    /* renamed from: c */
    public C5626c mo22295c() {
        return this.f16110b;
    }

    /* renamed from: d */
    public void mo22297d(float f) {
        this.f16116h = m24520a(0.0f, f, 1.0f);
    }

    /* renamed from: a */
    public void mo22290a(int i) {
        this.f16114f = i;
    }

    /* renamed from: b */
    public boolean mo4003b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C1138c cVar = this.f16109a;
        if (cVar == null) {
            return false;
        }
        cVar.mo5421a(motionEvent);
        return true;
    }

    /* renamed from: c */
    public void mo22296c(float f) {
        this.f16112d = f;
        this.f16113e = true;
    }

    /* renamed from: a */
    public void mo22289a(float f) {
        this.f16115g = m24520a(0.0f, f, 1.0f);
    }

    /* renamed from: c */
    private void m24524c(View view) {
        C0962e0.m5518i(view, 1048576);
        if (mo22294b(view)) {
            C0962e0.m5446a(view, C1017a.f4599A, (CharSequence) null, (C1025g) new C5625b());
        }
    }

    /* renamed from: a */
    public boolean mo3994a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, int i) {
        boolean a = super.mo3994a(coordinatorLayout, v, i);
        if (C0962e0.m5557t(v) == 0) {
            C0962e0.m5531l((View) v, 1);
            m24524c((View) v);
        }
        return a;
    }

    /* renamed from: b */
    public int mo22292b() {
        C1138c cVar = this.f16109a;
        if (cVar != null) {
            return cVar.mo5445h();
        }
        return 0;
    }

    /* renamed from: a */
    public boolean mo3998a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 MotionEvent motionEvent) {
        boolean z = this.f16111c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f16111c = coordinatorLayout.mo3936a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
            z = this.f16111c;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f16111c = false;
        }
        if (!z) {
            return false;
        }
        m24522a((ViewGroup) coordinatorLayout);
        return this.f16109a.mo5431b(motionEvent);
    }

    /* renamed from: a */
    private void m24522a(ViewGroup viewGroup) {
        C1138c cVar;
        if (this.f16109a == null) {
            if (this.f16113e) {
                cVar = C1138c.m6479a(viewGroup, this.f16112d, this.f16118j);
            } else {
                cVar = C1138c.m6480a(viewGroup, this.f16118j);
            }
            this.f16109a = cVar;
        }
    }

    /* renamed from: a */
    static float m24520a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: a */
    static int m24521a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }
}
