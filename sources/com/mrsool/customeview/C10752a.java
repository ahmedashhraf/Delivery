package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TabWidget;
import android.widget.TextView;

/* renamed from: com.mrsool.customeview.a */
/* compiled from: BadgeView */
public class C10752a extends TextView {

    /* renamed from: U */
    public static final int f29522U = 1;

    /* renamed from: V */
    public static final int f29523V = 2;

    /* renamed from: W */
    public static final int f29524W = 3;

    /* renamed from: a0 */
    public static final int f29525a0 = 4;

    /* renamed from: b0 */
    public static final int f29526b0 = 5;

    /* renamed from: c0 */
    private static final int f29527c0 = 5;

    /* renamed from: d0 */
    private static final int f29528d0 = 5;

    /* renamed from: e0 */
    private static final int f29529e0 = 8;

    /* renamed from: f0 */
    private static final int f29530f0 = 2;

    /* renamed from: g0 */
    private static final int f29531g0 = Color.parseColor("#CCFF0000");

    /* renamed from: h0 */
    private static final int f29532h0 = -1;

    /* renamed from: i0 */
    private static Animation f29533i0;

    /* renamed from: j0 */
    private static Animation f29534j0;

    /* renamed from: N */
    private int f29535N;

    /* renamed from: O */
    private int f29536O;

    /* renamed from: P */
    private int f29537P;

    /* renamed from: Q */
    private int f29538Q;

    /* renamed from: R */
    private boolean f29539R;

    /* renamed from: S */
    private ShapeDrawable f29540S;

    /* renamed from: T */
    private int f29541T;

    /* renamed from: a */
    private Context f29542a;

    /* renamed from: b */
    private View f29543b;

    public C10752a(Context context) {
        this(context, (AttributeSet) null, 16842884);
    }

    /* renamed from: a */
    private void m49437a(Context context, View view, int i) {
        this.f29542a = context;
        this.f29543b = view;
        this.f29541T = i;
        this.f29535N = 2;
        this.f29536O = m49442c(5);
        this.f29537P = this.f29536O;
        this.f29538Q = f29531g0;
        setTypeface(Typeface.DEFAULT_BOLD);
        int c = m49442c(5);
        setPadding(c, 0, c, 0);
        setTextColor(-1);
        f29533i0 = new AlphaAnimation(0.0f, 1.0f);
        f29533i0.setInterpolator(new DecelerateInterpolator());
        f29533i0.setDuration(200);
        f29534j0 = new AlphaAnimation(1.0f, 0.0f);
        f29534j0.setInterpolator(new AccelerateInterpolator());
        f29534j0.setDuration(200);
        this.f29539R = false;
        View view2 = this.f29543b;
        if (view2 != null) {
            m49438a(view2);
        } else {
            mo38307b();
        }
    }

    /* renamed from: d */
    private void m49443d() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        int i = this.f29535N;
        if (i == 1) {
            layoutParams.gravity = 51;
            layoutParams.setMargins(this.f29536O, this.f29537P, 0, 0);
        } else if (i == 2) {
            layoutParams.gravity = 53;
            layoutParams.setMargins(0, this.f29537P, this.f29536O, 0);
        } else if (i == 3) {
            layoutParams.gravity = 83;
            layoutParams.setMargins(this.f29536O, 0, 0, this.f29537P);
        } else if (i == 4) {
            layoutParams.gravity = 85;
            layoutParams.setMargins(0, 0, this.f29536O, this.f29537P);
        } else if (i == 5) {
            layoutParams.gravity = 17;
            layoutParams.setMargins(0, 0, 0, 0);
        }
        setLayoutParams(layoutParams);
    }

    private ShapeDrawable getDefaultBackground() {
        float c = (float) m49442c(8);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{c, c, c, c, c, c, c, c}, null, null));
        shapeDrawable.getPaint().setColor(this.f29538Q);
        return shapeDrawable;
    }

    /* renamed from: b */
    public void mo38307b() {
        m49441b(false, null);
    }

    /* renamed from: c */
    public void mo38310c() {
        m49440a(false, (Animation) null, (Animation) null);
    }

    public int getBadgeBackgroundColor() {
        return this.f29538Q;
    }

    public int getBadgePosition() {
        return this.f29535N;
    }

    public int getHorizontalBadgeMargin() {
        return this.f29536O;
    }

    public View getTarget() {
        return this.f29543b;
    }

    public int getVerticalBadgeMargin() {
        return this.f29537P;
    }

    public boolean isShown() {
        return this.f29539R;
    }

    public void setBadgeBackgroundColor(int i) {
        this.f29538Q = i;
        this.f29540S = getDefaultBackground();
    }

    public void setBadgeMargin(int i) {
        this.f29536O = i;
        this.f29537P = i;
    }

    public void setBadgePosition(int i) {
        this.f29535N = i;
    }

    public C10752a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* renamed from: b */
    public void mo38309b(boolean z) {
        m49441b(z, f29533i0);
    }

    /* renamed from: c */
    public void mo38311c(boolean z) {
        m49440a(z, f29533i0, f29534j0);
    }

    public C10752a(Context context, View view) {
        this(context, null, 16842884, view, 0);
    }

    /* renamed from: c */
    private int m49442c(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public void mo38308b(Animation animation) {
        m49441b(true, animation);
    }

    public C10752a(Context context, TabWidget tabWidget, int i) {
        this(context, null, 16842884, tabWidget, i);
    }

    /* renamed from: b */
    private void m49441b(boolean z, Animation animation) {
        if (getBackground() == null) {
            if (this.f29540S == null) {
                this.f29540S = getDefaultBackground();
            }
            setBackground(this.f29540S);
        }
        m49443d();
        if (z) {
            startAnimation(animation);
        }
        setVisibility(0);
        this.f29539R = true;
    }

    public C10752a(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 0);
    }

    public C10752a(Context context, AttributeSet attributeSet, int i, View view, int i2) {
        super(context, attributeSet, i);
        m49437a(context, view, i2);
    }

    /* renamed from: b */
    public int mo38306b(int i) {
        CharSequence text = getText();
        int i2 = 0;
        if (text != null) {
            try {
                i2 = Integer.parseInt(text.toString());
            } catch (NumberFormatException unused) {
            }
        }
        int i3 = i2 + i;
        setText(String.valueOf(i3));
        return i3;
    }

    /* renamed from: a */
    private void m49438a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewParent parent = view.getParent();
        FrameLayout frameLayout = new FrameLayout(this.f29542a);
        if (view instanceof TabWidget) {
            View childTabViewAt = ((TabWidget) view).getChildTabViewAt(this.f29541T);
            this.f29543b = childTabViewAt;
            ((ViewGroup) childTabViewAt).addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            setVisibility(8);
            frameLayout.addView(this);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int indexOfChild = viewGroup.indexOfChild(view);
        viewGroup.removeView(view);
        viewGroup.addView(frameLayout, indexOfChild, layoutParams);
        frameLayout.addView(view);
        setVisibility(8);
        frameLayout.addView(this);
        viewGroup.invalidate();
    }

    /* renamed from: a */
    public void mo38301a() {
        m49439a(false, (Animation) null);
    }

    /* renamed from: a */
    public void mo38305a(boolean z) {
        m49439a(z, f29534j0);
    }

    /* renamed from: a */
    public void mo38303a(Animation animation) {
        m49439a(true, animation);
    }

    /* renamed from: a */
    public void mo38304a(Animation animation, Animation animation2) {
        m49440a(true, animation, animation2);
    }

    /* renamed from: a */
    private void m49439a(boolean z, Animation animation) {
        setVisibility(8);
        if (z) {
            startAnimation(animation);
        }
        this.f29539R = false;
    }

    /* renamed from: a */
    private void m49440a(boolean z, Animation animation, Animation animation2) {
        boolean z2 = true;
        if (this.f29539R) {
            if (!z || animation2 == null) {
                z2 = false;
            }
            m49439a(z2, animation2);
            return;
        }
        if (!z || animation == null) {
            z2 = false;
        }
        m49441b(z2, animation);
    }

    /* renamed from: a */
    public int mo38300a(int i) {
        return mo38306b(-i);
    }

    /* renamed from: a */
    public void mo38302a(int i, int i2) {
        this.f29536O = i;
        this.f29537P = i2;
    }
}
