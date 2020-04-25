package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0983f0;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.w0 */
/* compiled from: TooltipCompatHandler */
class C0559w0 implements OnLongClickListener, OnHoverListener, OnAttachStateChangeListener {

    /* renamed from: U */
    private static final String f2264U = "TooltipCompatHandler";

    /* renamed from: V */
    private static final long f2265V = 2500;

    /* renamed from: W */
    private static final long f2266W = 15000;

    /* renamed from: X */
    private static final long f2267X = 3000;

    /* renamed from: Y */
    private static C0559w0 f2268Y;

    /* renamed from: Z */
    private static C0559w0 f2269Z;

    /* renamed from: N */
    private final int f2270N;

    /* renamed from: O */
    private final Runnable f2271O = new C0560a();

    /* renamed from: P */
    private final Runnable f2272P = new C0561b();

    /* renamed from: Q */
    private int f2273Q;

    /* renamed from: R */
    private int f2274R;

    /* renamed from: S */
    private C0563x0 f2275S;

    /* renamed from: T */
    private boolean f2276T;

    /* renamed from: a */
    private final View f2277a;

    /* renamed from: b */
    private final CharSequence f2278b;

    /* renamed from: androidx.appcompat.widget.w0$a */
    /* compiled from: TooltipCompatHandler */
    class C0560a implements Runnable {
        C0560a() {
        }

        public void run() {
            C0559w0.this.mo2995a(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.w0$b */
    /* compiled from: TooltipCompatHandler */
    class C0561b implements Runnable {
        C0561b() {
        }

        public void run() {
            C0559w0.this.mo2994a();
        }
    }

    private C0559w0(View view, CharSequence charSequence) {
        this.f2277a = view;
        this.f2278b = charSequence;
        this.f2270N = C0983f0.m5630a(ViewConfiguration.get(this.f2277a.getContext()));
        m3067c();
        this.f2277a.setOnLongClickListener(this);
        this.f2277a.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static void m3063a(View view, CharSequence charSequence) {
        C0559w0 w0Var = f2268Y;
        if (w0Var != null && w0Var.f2277a == view) {
            m3064a((C0559w0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0559w0 w0Var2 = f2269Z;
            if (w0Var2 != null && w0Var2.f2277a == view) {
                w0Var2.mo2994a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new C0559w0(view, charSequence);
    }

    /* renamed from: b */
    private void m3066b() {
        this.f2277a.removeCallbacks(this.f2271O);
    }

    /* renamed from: c */
    private void m3067c() {
        this.f2273Q = Integer.MAX_VALUE;
        this.f2274R = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m3068d() {
        this.f2277a.postDelayed(this.f2271O, (long) ViewConfiguration.getLongPressTimeout());
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2275S != null && this.f2276T) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2277a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m3067c();
                mo2994a();
            }
        } else if (this.f2277a.isEnabled() && this.f2275S == null && m3065a(motionEvent)) {
            m3064a(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f2273Q = view.getWidth() / 2;
        this.f2274R = view.getHeight() / 2;
        mo2995a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo2994a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2995a(boolean z) {
        long j;
        int i;
        long j2;
        if (C0962e0.m5515h0(this.f2277a)) {
            m3064a((C0559w0) null);
            C0559w0 w0Var = f2269Z;
            if (w0Var != null) {
                w0Var.mo2994a();
            }
            f2269Z = this;
            this.f2276T = z;
            this.f2275S = new C0563x0(this.f2277a.getContext());
            this.f2275S.mo3003a(this.f2277a, this.f2273Q, this.f2274R, this.f2276T, this.f2278b);
            this.f2277a.addOnAttachStateChangeListener(this);
            if (this.f2276T) {
                j = f2265V;
            } else {
                if ((C0962e0.m5419W(this.f2277a) & 1) == 1) {
                    j2 = f2267X;
                    i = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = f2266W;
                    i = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i);
            }
            this.f2277a.removeCallbacks(this.f2272P);
            this.f2277a.postDelayed(this.f2272P, j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2994a() {
        if (f2269Z == this) {
            f2269Z = null;
            C0563x0 x0Var = this.f2275S;
            if (x0Var != null) {
                x0Var.mo3002a();
                this.f2275S = null;
                m3067c();
                this.f2277a.removeOnAttachStateChangeListener(this);
            }
        }
        if (f2268Y == this) {
            m3064a((C0559w0) null);
        }
        this.f2277a.removeCallbacks(this.f2272P);
    }

    /* renamed from: a */
    private static void m3064a(C0559w0 w0Var) {
        C0559w0 w0Var2 = f2268Y;
        if (w0Var2 != null) {
            w0Var2.m3066b();
        }
        f2268Y = w0Var;
        C0559w0 w0Var3 = f2268Y;
        if (w0Var3 != null) {
            w0Var3.m3068d();
        }
    }

    /* renamed from: a */
    private boolean m3065a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f2273Q) <= this.f2270N && Math.abs(y - this.f2274R) <= this.f2270N) {
            return false;
        }
        this.f2273Q = x;
        this.f2274R = y;
        return true;
    }
}
