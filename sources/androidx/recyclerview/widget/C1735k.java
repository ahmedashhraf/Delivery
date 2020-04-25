package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import androidx.core.p034l.C0962e0;
import androidx.recyclerview.widget.RecyclerView.C1650n;
import androidx.recyclerview.widget.RecyclerView.C1659s;
import androidx.recyclerview.widget.RecyclerView.C1660t;
import androidx.recyclerview.widget.RecyclerView.State;

@C0224v0
/* renamed from: androidx.recyclerview.widget.k */
/* compiled from: FastScroller */
class C1735k extends C1650n implements C1659s {

    /* renamed from: D */
    private static final int f6687D = 0;

    /* renamed from: E */
    private static final int f6688E = 1;

    /* renamed from: F */
    private static final int f6689F = 2;

    /* renamed from: G */
    private static final int f6690G = 0;

    /* renamed from: H */
    private static final int f6691H = 1;

    /* renamed from: I */
    private static final int f6692I = 2;

    /* renamed from: J */
    private static final int f6693J = 0;

    /* renamed from: K */
    private static final int f6694K = 1;

    /* renamed from: L */
    private static final int f6695L = 2;

    /* renamed from: M */
    private static final int f6696M = 3;

    /* renamed from: N */
    private static final int f6697N = 500;

    /* renamed from: O */
    private static final int f6698O = 1500;

    /* renamed from: P */
    private static final int f6699P = 1200;

    /* renamed from: Q */
    private static final int f6700Q = 500;

    /* renamed from: R */
    private static final int f6701R = 255;

    /* renamed from: S */
    private static final int[] f6702S = {16842919};

    /* renamed from: T */
    private static final int[] f6703T = new int[0];

    /* renamed from: A */
    int f6704A = 0;

    /* renamed from: B */
    private final Runnable f6705B = new C1736a();

    /* renamed from: C */
    private final C1660t f6706C = new C1737b();

    /* renamed from: a */
    private final int f6707a;

    /* renamed from: b */
    private final int f6708b;

    /* renamed from: c */
    final StateListDrawable f6709c;

    /* renamed from: d */
    final Drawable f6710d;

    /* renamed from: e */
    private final int f6711e;

    /* renamed from: f */
    private final int f6712f;

    /* renamed from: g */
    private final StateListDrawable f6713g;

    /* renamed from: h */
    private final Drawable f6714h;

    /* renamed from: i */
    private final int f6715i;

    /* renamed from: j */
    private final int f6716j;
    @C0224v0

    /* renamed from: k */
    int f6717k;
    @C0224v0

    /* renamed from: l */
    int f6718l;
    @C0224v0

    /* renamed from: m */
    float f6719m;
    @C0224v0

    /* renamed from: n */
    int f6720n;
    @C0224v0

    /* renamed from: o */
    int f6721o;
    @C0224v0

    /* renamed from: p */
    float f6722p;

    /* renamed from: q */
    private int f6723q = 0;

    /* renamed from: r */
    private int f6724r = 0;

    /* renamed from: s */
    private RecyclerView f6725s;

    /* renamed from: t */
    private boolean f6726t = false;

    /* renamed from: u */
    private boolean f6727u = false;

    /* renamed from: v */
    private int f6728v = 0;

    /* renamed from: w */
    private int f6729w = 0;

    /* renamed from: x */
    private final int[] f6730x = new int[2];

    /* renamed from: y */
    private final int[] f6731y = new int[2];

    /* renamed from: z */
    final ValueAnimator f6732z = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* compiled from: FastScroller */
    class C1736a implements Runnable {
        C1736a() {
        }

        public void run() {
            C1735k.this.mo7891a(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$b */
    /* compiled from: FastScroller */
    class C1737b extends C1660t {
        C1737b() {
        }

        /* renamed from: a */
        public void mo7532a(RecyclerView recyclerView, int i, int i2) {
            C1735k.this.mo7892a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$c */
    /* compiled from: FastScroller */
    private class C1738c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f6735a = false;

        C1738c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f6735a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f6735a) {
                this.f6735a = false;
                return;
            }
            if (((Float) C1735k.this.f6732z.getAnimatedValue()).floatValue() == 0.0f) {
                C1735k kVar = C1735k.this;
                kVar.f6704A = 0;
                kVar.mo7896b(0);
            } else {
                C1735k kVar2 = C1735k.this;
                kVar2.f6704A = 2;
                kVar2.mo7902g();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$d */
    /* compiled from: FastScroller */
    private class C1739d implements AnimatorUpdateListener {
        C1739d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1735k.this.f6709c.setAlpha(floatValue);
            C1735k.this.f6710d.setAlpha(floatValue);
            C1735k.this.mo7902g();
        }
    }

    C1735k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f6709c = stateListDrawable;
        this.f6710d = drawable;
        this.f6713g = stateListDrawable2;
        this.f6714h = drawable2;
        this.f6711e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f6712f = Math.max(i, drawable.getIntrinsicWidth());
        this.f6715i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f6716j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f6707a = i2;
        this.f6708b = i3;
        this.f6709c.setAlpha(255);
        this.f6710d.setAlpha(255);
        this.f6732z.addListener(new C1738c());
        this.f6732z.addUpdateListener(new C1739d());
        mo7893a(recyclerView);
    }

    /* renamed from: c */
    private void m9360c(int i) {
        m9361i();
        this.f6725s.postDelayed(this.f6705B, (long) i);
    }

    /* renamed from: i */
    private void m9361i() {
        this.f6725s.removeCallbacks(this.f6705B);
    }

    /* renamed from: j */
    private void m9362j() {
        this.f6725s.removeItemDecoration(this);
        this.f6725s.removeOnItemTouchListener(this);
        this.f6725s.removeOnScrollListener(this.f6706C);
        m9361i();
    }

    /* renamed from: k */
    private int[] m9363k() {
        int[] iArr = this.f6731y;
        int i = this.f6708b;
        iArr[0] = i;
        iArr[1] = this.f6723q - i;
        return iArr;
    }

    /* renamed from: l */
    private int[] m9364l() {
        int[] iArr = this.f6730x;
        int i = this.f6708b;
        iArr[0] = i;
        iArr[1] = this.f6724r - i;
        return iArr;
    }

    /* renamed from: m */
    private boolean m9365m() {
        return C0962e0.m5566x(this.f6725s) == 1;
    }

    /* renamed from: n */
    private void m9366n() {
        this.f6725s.addItemDecoration(this);
        this.f6725s.addOnItemTouchListener(this);
        this.f6725s.addOnScrollListener(this.f6706C);
    }

    /* renamed from: a */
    public void mo7893a(@C0195i0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6725s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m9362j();
            }
            this.f6725s = recyclerView;
            if (this.f6725s != null) {
                m9366n();
            }
        }
    }

    /* renamed from: a */
    public void mo7529a(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7896b(int i) {
        if (i == 2 && this.f6728v != 2) {
            this.f6709c.setState(f6702S);
            m9361i();
        }
        if (i == 0) {
            mo7902g();
        } else {
            mo7903h();
        }
        if (this.f6728v == 2 && i != 2) {
            this.f6709c.setState(f6703T);
            m9360c(f6699P);
        } else if (i == 1) {
            m9360c(1500);
        }
        this.f6728v = i;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: d */
    public Drawable mo7899d() {
        return this.f6710d;
    }

    /* renamed from: e */
    public boolean mo7900e() {
        return this.f6728v == 2;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: f */
    public boolean mo7901f() {
        return this.f6728v == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo7902g() {
        this.f6725s.invalidate();
    }

    /* renamed from: h */
    public void mo7903h() {
        int i = this.f6704A;
        if (i != 0) {
            if (i == 3) {
                this.f6732z.cancel();
            } else {
                return;
            }
        }
        this.f6704A = 1;
        ValueAnimator valueAnimator = this.f6732z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f6732z.setDuration(500);
        this.f6732z.setStartDelay(0);
        this.f6732z.start();
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: c */
    public Drawable mo7898c() {
        return this.f6709c;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public void mo7891a(int i) {
        int i2 = this.f6704A;
        if (i2 == 1) {
            this.f6732z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f6704A = 3;
        ValueAnimator valueAnimator = this.f6732z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f6732z.setDuration((long) i);
        this.f6732z.start();
    }

    /* renamed from: b */
    public void mo7396b(Canvas canvas, RecyclerView recyclerView, State state) {
        if (this.f6723q == this.f6725s.getWidth() && this.f6724r == this.f6725s.getHeight()) {
            if (this.f6704A != 0) {
                if (this.f6726t) {
                    m9359b(canvas);
                }
                if (this.f6727u) {
                    m9357a(canvas);
                }
            }
            return;
        }
        this.f6723q = this.f6725s.getWidth();
        this.f6724r = this.f6725s.getHeight();
        mo7896b(0);
    }

    /* renamed from: a */
    private void m9357a(Canvas canvas) {
        int i = this.f6724r;
        int i2 = this.f6715i;
        int i3 = i - i2;
        int i4 = this.f6721o;
        int i5 = this.f6720n;
        int i6 = i4 - (i5 / 2);
        this.f6713g.setBounds(0, 0, i5, i2);
        this.f6714h.setBounds(0, 0, this.f6723q, this.f6716j);
        canvas.translate(0.0f, (float) i3);
        this.f6714h.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f6713g.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: b */
    private void m9359b(Canvas canvas) {
        int i = this.f6723q;
        int i2 = this.f6711e;
        int i3 = i - i2;
        int i4 = this.f6718l;
        int i5 = this.f6717k;
        int i6 = i4 - (i5 / 2);
        this.f6709c.setBounds(0, 0, i2, i5);
        this.f6710d.setBounds(0, 0, this.f6712f, this.f6724r);
        if (m9365m()) {
            this.f6710d.draw(canvas);
            canvas.translate((float) this.f6711e, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f6709c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f6711e), (float) (-i6));
            return;
        }
        canvas.translate((float) i3, 0.0f);
        this.f6710d.draw(canvas);
        canvas.translate(0.0f, (float) i6);
        this.f6709c.draw(canvas);
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7892a(int i, int i2) {
        int computeVerticalScrollRange = this.f6725s.computeVerticalScrollRange();
        int i3 = this.f6724r;
        this.f6726t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f6707a;
        int computeHorizontalScrollRange = this.f6725s.computeHorizontalScrollRange();
        int i4 = this.f6723q;
        this.f6727u = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f6707a;
        if (this.f6726t || this.f6727u) {
            if (this.f6726t) {
                float f = (float) i3;
                this.f6718l = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f6717k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f6727u) {
                float f2 = (float) i4;
                this.f6721o = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f6720n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f6728v;
            if (i5 == 0 || i5 == 1) {
                mo7896b(1);
            }
            return;
        }
        if (this.f6728v != 0) {
            mo7896b(0);
        }
    }

    /* renamed from: b */
    public boolean mo7530b(@C0193h0 RecyclerView recyclerView, @C0193h0 MotionEvent motionEvent) {
        int i = this.f6728v;
        if (i == 1) {
            boolean b = mo7897b(motionEvent.getX(), motionEvent.getY());
            boolean a = mo7894a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b && !a) {
                return false;
            }
            if (a) {
                this.f6729w = 1;
                this.f6722p = (float) ((int) motionEvent.getX());
            } else if (b) {
                this.f6729w = 2;
                this.f6719m = (float) ((int) motionEvent.getY());
            }
            mo7896b(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo7528a(@C0193h0 RecyclerView recyclerView, @C0193h0 MotionEvent motionEvent) {
        if (this.f6728v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b = mo7897b(motionEvent.getX(), motionEvent.getY());
                boolean a = mo7894a(motionEvent.getX(), motionEvent.getY());
                if (b || a) {
                    if (a) {
                        this.f6729w = 1;
                        this.f6722p = (float) ((int) motionEvent.getX());
                    } else if (b) {
                        this.f6729w = 2;
                        this.f6719m = (float) ((int) motionEvent.getY());
                    }
                    mo7896b(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f6728v == 2) {
                this.f6719m = 0.0f;
                this.f6722p = 0.0f;
                mo7896b(1);
                this.f6729w = 0;
            } else if (motionEvent.getAction() == 2 && this.f6728v == 2) {
                mo7903h();
                if (this.f6729w == 1) {
                    m9356a(motionEvent.getX());
                }
                if (this.f6729w == 2) {
                    m9358b(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: b */
    private void m9358b(float f) {
        int[] l = m9364l();
        float max = Math.max((float) l[0], Math.min((float) l[1], f));
        if (Math.abs(((float) this.f6718l) - max) >= 2.0f) {
            int a = m9355a(this.f6719m, max, l, this.f6725s.computeVerticalScrollRange(), this.f6725s.computeVerticalScrollOffset(), this.f6724r);
            if (a != 0) {
                this.f6725s.scrollBy(0, a);
            }
            this.f6719m = max;
        }
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: b */
    public boolean mo7897b(float f, float f2) {
        if (!m9365m() ? f >= ((float) (this.f6723q - this.f6711e)) : f <= ((float) (this.f6711e / 2))) {
            int i = this.f6718l;
            int i2 = this.f6717k;
            if (f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: b */
    public Drawable mo7895b() {
        return this.f6714h;
    }

    /* renamed from: a */
    private void m9356a(float f) {
        int[] k = m9363k();
        float max = Math.max((float) k[0], Math.min((float) k[1], f));
        if (Math.abs(((float) this.f6721o) - max) >= 2.0f) {
            int a = m9355a(this.f6722p, max, k, this.f6725s.computeHorizontalScrollRange(), this.f6725s.computeHorizontalScrollOffset(), this.f6723q);
            if (a != 0) {
                this.f6725s.scrollBy(a, 0);
            }
            this.f6722p = max;
        }
    }

    /* renamed from: a */
    private int m9355a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public boolean mo7894a(float f, float f2) {
        if (f2 >= ((float) (this.f6724r - this.f6715i))) {
            int i = this.f6721o;
            int i2 = this.f6720n;
            if (f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public Drawable mo7890a() {
        return this.f6713g;
    }
}
