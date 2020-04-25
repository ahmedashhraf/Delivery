package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.p034l.C0962e0;

@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.r */
/* compiled from: GhostViewPort */
class C1936r extends ViewGroup implements C1929o {

    /* renamed from: N */
    final View f7444N;

    /* renamed from: O */
    int f7445O;
    @C0195i0

    /* renamed from: P */
    private Matrix f7446P;

    /* renamed from: Q */
    private final OnPreDrawListener f7447Q = new C1937a();

    /* renamed from: a */
    ViewGroup f7448a;

    /* renamed from: b */
    View f7449b;

    /* renamed from: androidx.transition.r$a */
    /* compiled from: GhostViewPort */
    class C1937a implements OnPreDrawListener {
        C1937a() {
        }

        public boolean onPreDraw() {
            C0962e0.m5561u0(C1936r.this);
            C1936r rVar = C1936r.this;
            ViewGroup viewGroup = rVar.f7448a;
            if (viewGroup != null) {
                View view = rVar.f7449b;
                if (view != null) {
                    viewGroup.endViewTransition(view);
                    C0962e0.m5561u0(C1936r.this.f7448a);
                    C1936r rVar2 = C1936r.this;
                    rVar2.f7448a = null;
                    rVar2.f7449b = null;
                }
            }
            return true;
        }
    }

    C1936r(View view) {
        super(view.getContext());
        this.f7444N = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    /* renamed from: b */
    static void m10225b(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        C1953x0.m10267b(viewGroup2, matrix);
        matrix.preTranslate((float) (-viewGroup2.getScrollX()), (float) (-viewGroup2.getScrollY()));
        C1953x0.m10269c(viewGroup, matrix);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8450a(@C0193h0 Matrix matrix) {
        this.f7446P = matrix;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m10223a(this.f7444N, this);
        this.f7444N.getViewTreeObserver().addOnPreDrawListener(this.f7447Q);
        C1953x0.m10263a(this.f7444N, 4);
        if (this.f7444N.getParent() != null) {
            ((View) this.f7444N.getParent()).invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f7444N.getViewTreeObserver().removeOnPreDrawListener(this.f7447Q);
        C1953x0.m10263a(this.f7444N, 0);
        m10223a(this.f7444N, (C1936r) null);
        if (this.f7444N.getParent() != null) {
            ((View) this.f7444N.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C1836d.m9836a(canvas, true);
        canvas.setMatrix(this.f7446P);
        C1953x0.m10263a(this.f7444N, 0);
        this.f7444N.invalidate();
        C1953x0.m10263a(this.f7444N, 4);
        drawChild(canvas, this.f7444N, getDrawingTime());
        C1836d.m9836a(canvas, false);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (m10220a(this.f7444N) == this) {
            C1953x0.m10263a(this.f7444N, i == 0 ? 4 : 0);
        }
    }

    /* renamed from: a */
    public void mo8437a(ViewGroup viewGroup, View view) {
        this.f7448a = viewGroup;
        this.f7449b = view;
    }

    /* renamed from: a */
    static void m10222a(View view, View view2) {
        C1953x0.m10264a(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* renamed from: b */
    static void m10224b(View view) {
        C1936r a = m10220a(view);
        if (a != null) {
            a.f7445O--;
            if (a.f7445O <= 0) {
                ((C1932p) a.getParent()).removeView(a);
            }
        }
    }

    /* renamed from: a */
    static C1936r m10220a(View view) {
        return (C1936r) view.getTag(C1822R.C1825id.ghost_view);
    }

    /* renamed from: a */
    static void m10223a(@C0193h0 View view, @C0195i0 C1936r rVar) {
        view.setTag(C1822R.C1825id.ghost_view, rVar);
    }

    /* renamed from: a */
    static C1936r m10221a(View view, ViewGroup viewGroup, Matrix matrix) {
        if (view.getParent() instanceof ViewGroup) {
            C1932p a = C1932p.m10201a(viewGroup);
            C1936r a2 = m10220a(view);
            int i = 0;
            if (a2 != null) {
                C1932p pVar = (C1932p) a2.getParent();
                if (pVar != a) {
                    i = a2.f7445O;
                    pVar.removeView(a2);
                    a2 = null;
                }
            }
            if (a2 == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    m10225b(view, viewGroup, matrix);
                }
                a2 = new C1936r(view);
                a2.mo8450a(matrix);
                if (a == null) {
                    a = new C1932p(viewGroup);
                } else {
                    a.mo8442a();
                }
                m10222a((View) viewGroup, (View) a);
                m10222a((View) viewGroup, (View) a2);
                a.mo8443a(a2);
                a2.f7445O = i;
            } else if (matrix != null) {
                a2.mo8450a(matrix);
            }
            a2.f7445O++;
            return a2;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }
}
