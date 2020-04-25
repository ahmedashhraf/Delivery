package androidx.core.p034l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.l.i0 */
/* compiled from: ViewPropertyAnimatorCompat */
public final class C0990i0 {

    /* renamed from: e */
    static final int f4426e = 2113929216;

    /* renamed from: a */
    private WeakReference<View> f4427a;

    /* renamed from: b */
    Runnable f4428b = null;

    /* renamed from: c */
    Runnable f4429c = null;

    /* renamed from: d */
    int f4430d = -1;

    /* renamed from: androidx.core.l.i0$a */
    /* compiled from: ViewPropertyAnimatorCompat */
    class C0991a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0996j0 f4431a;

        /* renamed from: b */
        final /* synthetic */ View f4432b;

        C0991a(C0996j0 j0Var, View view) {
            this.f4431a = j0Var;
            this.f4432b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f4431a.mo2465a(this.f4432b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f4431a.mo865b(this.f4432b);
        }

        public void onAnimationStart(Animator animator) {
            this.f4431a.mo866c(this.f4432b);
        }
    }

    /* renamed from: androidx.core.l.i0$b */
    /* compiled from: ViewPropertyAnimatorCompat */
    class C0992b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C1000l0 f4434a;

        /* renamed from: b */
        final /* synthetic */ View f4435b;

        C0992b(C1000l0 l0Var, View view) {
            this.f4434a = l0Var;
            this.f4435b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f4434a.mo1120a(this.f4435b);
        }
    }

    /* renamed from: androidx.core.l.i0$c */
    /* compiled from: ViewPropertyAnimatorCompat */
    static class C0993c implements C0996j0 {

        /* renamed from: a */
        C0990i0 f4437a;

        /* renamed from: b */
        boolean f4438b;

        C0993c(C0990i0 i0Var) {
            this.f4437a = i0Var;
        }

        /* renamed from: a */
        public void mo2465a(View view) {
            Object tag = view.getTag(C0990i0.f4426e);
            C0996j0 j0Var = tag instanceof C0996j0 ? (C0996j0) tag : null;
            if (j0Var != null) {
                j0Var.mo2465a(view);
            }
        }

        /* renamed from: b */
        public void mo865b(View view) {
            int i = this.f4437a.f4430d;
            C0996j0 j0Var = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f4437a.f4430d = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f4438b) {
                C0990i0 i0Var = this.f4437a;
                Runnable runnable = i0Var.f4429c;
                if (runnable != null) {
                    i0Var.f4429c = null;
                    runnable.run();
                }
                Object tag = view.getTag(C0990i0.f4426e);
                if (tag instanceof C0996j0) {
                    j0Var = (C0996j0) tag;
                }
                if (j0Var != null) {
                    j0Var.mo865b(view);
                }
                this.f4438b = true;
            }
        }

        /* renamed from: c */
        public void mo866c(View view) {
            this.f4438b = false;
            C0996j0 j0Var = null;
            if (this.f4437a.f4430d > -1) {
                view.setLayerType(2, null);
            }
            C0990i0 i0Var = this.f4437a;
            Runnable runnable = i0Var.f4428b;
            if (runnable != null) {
                i0Var.f4428b = null;
                runnable.run();
            }
            Object tag = view.getTag(C0990i0.f4426e);
            if (tag instanceof C0996j0) {
                j0Var = (C0996j0) tag;
            }
            if (j0Var != null) {
                j0Var.mo866c(view);
            }
        }
    }

    C0990i0(View view) {
        this.f4427a = new WeakReference<>(view);
    }

    /* renamed from: a */
    public C0990i0 mo4825a(long j) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: b */
    public C0990i0 mo4832b(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    /* renamed from: c */
    public Interpolator mo4835c() {
        View view = (View) this.f4427a.get();
        if (view == null || VERSION.SDK_INT < 18) {
            return null;
        }
        return (Interpolator) view.animate().getInterpolator();
    }

    /* renamed from: d */
    public long mo4837d() {
        View view = (View) this.f4427a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0;
    }

    /* renamed from: e */
    public C0990i0 mo4839e(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    /* renamed from: f */
    public C0990i0 mo4842f(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    /* renamed from: g */
    public C0990i0 mo4843g(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    /* renamed from: h */
    public C0990i0 mo4844h(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    /* renamed from: i */
    public C0990i0 mo4845i(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    /* renamed from: j */
    public C0990i0 mo4846j(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    /* renamed from: k */
    public C0990i0 mo4847k(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    /* renamed from: l */
    public C0990i0 mo4848l(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    /* renamed from: m */
    public C0990i0 mo4849m(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    /* renamed from: n */
    public C0990i0 mo4850n(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    /* renamed from: o */
    public C0990i0 mo4851o(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: p */
    public C0990i0 mo4852p(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    /* renamed from: q */
    public C0990i0 mo4853q(float f) {
        View view = (View) this.f4427a.get();
        if (view != null && VERSION.SDK_INT >= 21) {
            view.animate().translationZ(f);
        }
        return this;
    }

    /* renamed from: r */
    public C0990i0 mo4854r(float f) {
        View view = (View) this.f4427a.get();
        if (view != null && VERSION.SDK_INT >= 21) {
            view.animate().translationZBy(f);
        }
        return this;
    }

    /* renamed from: s */
    public C0990i0 mo4855s(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    /* renamed from: t */
    public C0990i0 mo4856t(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    /* renamed from: u */
    public C0990i0 mo4857u(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    /* renamed from: v */
    public C0990i0 mo4858v(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    /* renamed from: w */
    public C0990i0 mo4859w(float f) {
        View view = (View) this.f4427a.get();
        if (view != null && VERSION.SDK_INT >= 21) {
            view.animate().z(f);
        }
        return this;
    }

    /* renamed from: x */
    public C0990i0 mo4860x(float f) {
        View view = (View) this.f4427a.get();
        if (view != null && VERSION.SDK_INT >= 21) {
            view.animate().zBy(f);
        }
        return this;
    }

    /* renamed from: a */
    public C0990i0 mo4824a(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public long mo4831b() {
        View view = (View) this.f4427a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: d */
    public C0990i0 mo4838d(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    /* renamed from: e */
    public void mo4840e() {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: f */
    public C0990i0 mo4841f() {
        View view = (View) this.f4427a.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                view.animate().withLayer();
            } else {
                this.f4430d = view.getLayerType();
                m5669a(view, new C0993c(this));
            }
        }
        return this;
    }

    /* renamed from: c */
    public C0990i0 mo4836c(float f) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    /* renamed from: a */
    public C0990i0 mo4829a(Runnable runnable) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                view.animate().withEndAction(runnable);
            } else {
                m5669a(view, new C0993c(this));
                this.f4429c = runnable;
            }
        }
        return this;
    }

    /* renamed from: b */
    public C0990i0 mo4833b(long j) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: b */
    public C0990i0 mo4834b(Runnable runnable) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                view.animate().withStartAction(runnable);
            } else {
                m5669a(view, new C0993c(this));
                this.f4428b = runnable;
            }
        }
        return this;
    }

    /* renamed from: a */
    public C0990i0 mo4826a(Interpolator interpolator) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: a */
    public void mo4830a() {
        View view = (View) this.f4427a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: a */
    public C0990i0 mo4827a(C0996j0 j0Var) {
        View view = (View) this.f4427a.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                m5669a(view, j0Var);
            } else {
                view.setTag(f4426e, j0Var);
                m5669a(view, new C0993c(this));
            }
        }
        return this;
    }

    /* renamed from: a */
    private void m5669a(View view, C0996j0 j0Var) {
        if (j0Var != null) {
            view.animate().setListener(new C0991a(j0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C0990i0 mo4828a(C1000l0 l0Var) {
        View view = (View) this.f4427a.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            C0992b bVar = null;
            if (l0Var != null) {
                bVar = new C0992b(l0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }
}
