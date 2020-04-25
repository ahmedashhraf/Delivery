package com.mrsool.utils.p422c0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.mrsool.C10232R;

/* renamed from: com.mrsool.utils.c0.c */
/* compiled from: TooltipOverlayDrawable */
public class C11634c extends Drawable {

    /* renamed from: o */
    public static final String f33000o = C11633b.class.getSimpleName();

    /* renamed from: p */
    public static final float f33001p = 255.0f;

    /* renamed from: q */
    public static final double f33002q = 0.55d;

    /* renamed from: r */
    public static final double f33003r = 0.3d;

    /* renamed from: s */
    public static final double f33004s = 0.25d;

    /* renamed from: a */
    private Paint f33005a = new Paint(1);

    /* renamed from: b */
    private Paint f33006b = new Paint(1);

    /* renamed from: c */
    private float f33007c;

    /* renamed from: d */
    private float f33008d = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AnimatorSet f33009e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AnimatorSet f33010f;

    /* renamed from: g */
    private ValueAnimator f33011g;

    /* renamed from: h */
    private ValueAnimator f33012h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f33013i;

    /* renamed from: j */
    private boolean f33014j;

    /* renamed from: k */
    private int f33015k;

    /* renamed from: l */
    private int f33016l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f33017m = 1;

    /* renamed from: n */
    private long f33018n = 400;

    /* renamed from: com.mrsool.utils.c0.c$a */
    /* compiled from: TooltipOverlayDrawable */
    class C11635a extends AnimatorListenerAdapter {

        /* renamed from: a */
        boolean f33019a;

        C11635a() {
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f33019a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f33019a && C11634c.this.isVisible() && C11634c.m52447b(C11634c.this) < C11634c.this.f33017m) {
                C11634c.this.f33009e.start();
            }
        }
    }

    /* renamed from: com.mrsool.utils.c0.c$b */
    /* compiled from: TooltipOverlayDrawable */
    class C11636b extends AnimatorListenerAdapter {

        /* renamed from: a */
        boolean f33021a;

        C11636b() {
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f33021a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f33021a && C11634c.this.isVisible() && C11634c.this.f33013i < C11634c.this.f33017m) {
                C11634c.this.f33010f.setStartDelay(0);
                C11634c.this.f33010f.start();
            }
        }
    }

    public C11634c(Context context, int i) {
        this.f33005a.setStyle(Style.FILL);
        this.f33006b.setStyle(Style.FILL);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, C10232R.styleable.TooltipOverlay);
        for (int i2 = 0; i2 < obtainStyledAttributes.getIndexCount(); i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 1) {
                int color = obtainStyledAttributes.getColor(index, 0);
                this.f33005a.setColor(color);
                this.f33006b.setColor(color);
            } else if (index == 4) {
                this.f33017m = obtainStyledAttributes.getInt(index, 1);
            } else if (index == 2) {
                int i3 = (int) (obtainStyledAttributes.getFloat(index, ((float) this.f33006b.getAlpha()) / 255.0f) * 255.0f);
                this.f33006b.setAlpha(i3);
                this.f33005a.setAlpha(i3);
            } else if (index == 3) {
                this.f33018n = (long) obtainStyledAttributes.getInt(index, 400);
            }
        }
        obtainStyledAttributes.recycle();
        this.f33015k = mo39959c();
        this.f33016l = mo39953a();
        String str = "outerAlpha";
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, str, new int[]{0, this.f33015k});
        double d = (double) this.f33018n;
        Double.isNaN(d);
        ofInt.setDuration((long) (d * 0.3d));
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this, str, new int[]{this.f33015k, 0, 0});
        double d2 = (double) this.f33018n;
        Double.isNaN(d2);
        ofInt2.setStartDelay((long) (d2 * 0.55d));
        double d3 = (double) this.f33018n;
        Double.isNaN(d3);
        ofInt2.setDuration((long) (d3 * 0.44999999999999996d));
        this.f33011g = ObjectAnimator.ofFloat(this, "outerRadius", new float[]{0.0f, 1.0f});
        this.f33011g.setDuration(this.f33018n);
        this.f33009e = new AnimatorSet();
        this.f33009e.playTogether(new Animator[]{ofInt, this.f33011g, ofInt2});
        this.f33009e.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f33009e.setDuration(this.f33018n);
        String str2 = "innerAlpha";
        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(this, str2, new int[]{0, this.f33016l});
        double d4 = (double) this.f33018n;
        Double.isNaN(d4);
        ofInt3.setDuration((long) (d4 * 0.3d));
        ObjectAnimator ofInt4 = ObjectAnimator.ofInt(this, str2, new int[]{this.f33016l, 0, 0});
        double d5 = (double) this.f33018n;
        Double.isNaN(d5);
        ofInt4.setStartDelay((long) (d5 * 0.55d));
        double d6 = (double) this.f33018n;
        Double.isNaN(d6);
        ofInt4.setDuration((long) (d6 * 0.44999999999999996d));
        this.f33012h = ObjectAnimator.ofFloat(this, "innerRadius", new float[]{0.0f, 1.0f});
        this.f33012h.setDuration(this.f33018n);
        this.f33010f = new AnimatorSet();
        this.f33010f.playTogether(new Animator[]{ofInt3, this.f33012h, ofInt4});
        this.f33010f.setInterpolator(new AccelerateDecelerateInterpolator());
        AnimatorSet animatorSet = this.f33010f;
        double d7 = (double) this.f33018n;
        Double.isNaN(d7);
        animatorSet.setStartDelay((long) (d7 * 0.25d));
        this.f33010f.setDuration(this.f33018n);
        this.f33009e.addListener(new C11635a());
        this.f33010f.addListener(new C11636b());
    }

    /* renamed from: b */
    static /* synthetic */ int m52447b(C11634c cVar) {
        int i = cVar.f33013i + 1;
        cVar.f33013i = i;
        return i;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float width = (float) (bounds.width() / 2);
        float height = (float) (bounds.height() / 2);
        canvas.drawCircle(width, height, this.f33007c, this.f33005a);
        canvas.drawCircle(width, height, this.f33008d, this.f33006b);
    }

    /* renamed from: f */
    public void mo39963f() {
        mo39964g();
        mo39962e();
    }

    /* renamed from: g */
    public void mo39964g() {
        this.f33009e.cancel();
        this.f33010f.cancel();
        this.f33013i = 0;
        this.f33014j = false;
        mo39954a(0.0f);
        mo39957b(0.0f);
    }

    public int getIntrinsicHeight() {
        return 96;
    }

    public int getIntrinsicWidth() {
        return 96;
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f33007c = (float) (Math.min(rect.width(), rect.height()) / 2);
        this.f33011g.setFloatValues(new float[]{0.0f, this.f33007c});
        this.f33012h.setFloatValues(new float[]{0.0f, this.f33007c});
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = isVisible() != z;
        if (!z) {
            mo39964g();
        } else if (z2 || !this.f33014j) {
            mo39963f();
        }
        return z3;
    }

    /* renamed from: a */
    public int mo39953a() {
        return this.f33006b.getAlpha();
    }

    /* renamed from: b */
    public void mo39958b(int i) {
        this.f33005a.setAlpha(i);
        invalidateSelf();
    }

    /* renamed from: c */
    public int mo39959c() {
        return this.f33005a.getAlpha();
    }

    /* renamed from: d */
    public float mo39960d() {
        return this.f33007c;
    }

    /* renamed from: e */
    public void mo39962e() {
        this.f33013i = 0;
        this.f33014j = true;
        this.f33009e.start();
        AnimatorSet animatorSet = this.f33010f;
        double d = (double) this.f33018n;
        Double.isNaN(d);
        animatorSet.setStartDelay((long) (d * 0.25d));
        this.f33010f.start();
    }

    /* renamed from: a */
    public void mo39955a(int i) {
        this.f33006b.setAlpha(i);
        invalidateSelf();
    }

    /* renamed from: b */
    public float mo39956b() {
        return this.f33008d;
    }

    /* renamed from: a */
    public void mo39954a(float f) {
        this.f33008d = f;
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo39957b(float f) {
        this.f33007c = f;
        invalidateSelf();
    }
}
