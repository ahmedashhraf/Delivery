package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.core.p034l.C0962e0;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
public class ActionBarContainer extends FrameLayout {

    /* renamed from: N */
    private View f1463N;

    /* renamed from: O */
    private View f1464O;

    /* renamed from: P */
    Drawable f1465P;

    /* renamed from: Q */
    Drawable f1466Q;

    /* renamed from: R */
    Drawable f1467R;

    /* renamed from: S */
    boolean f1468S;

    /* renamed from: T */
    boolean f1469T;

    /* renamed from: U */
    private int f1470U;

    /* renamed from: a */
    private boolean f1471a;

    /* renamed from: b */
    private View f1472b;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m2258a(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m2259b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1465P;
        if (drawable != null && drawable.isStateful()) {
            this.f1465P.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1466Q;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1466Q.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1467R;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1467R.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1472b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1465P;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1466Q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1467R;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1463N = findViewById(C0238R.C0241id.action_bar);
        this.f1464O = findViewById(C0238R.C0241id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1471a || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f1472b;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f1468S) {
            Drawable drawable = this.f1467R;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f1465P != null) {
                if (this.f1463N.getVisibility() == 0) {
                    this.f1465P.setBounds(this.f1463N.getLeft(), this.f1463N.getTop(), this.f1463N.getRight(), this.f1463N.getBottom());
                } else {
                    View view2 = this.f1464O;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f1465P.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1465P.setBounds(this.f1464O.getLeft(), this.f1464O.getTop(), this.f1464O.getRight(), this.f1464O.getBottom());
                    }
                }
                z3 = true;
            }
            this.f1469T = z4;
            if (z4) {
                Drawable drawable2 = this.f1466Q;
                if (drawable2 != null) {
                    drawable2.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
            }
            z2 = z3;
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f1463N == null && MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int i3 = this.f1470U;
            if (i3 >= 0) {
                i2 = MeasureSpec.makeMeasureSpec(Math.min(i3, MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
        if (this.f1463N != null) {
            int mode = MeasureSpec.getMode(i2);
            View view = this.f1472b;
            if (!(view == null || view.getVisibility() == 8 || mode == 1073741824)) {
                int i4 = !m2259b(this.f1463N) ? m2258a(this.f1463N) : !m2259b(this.f1464O) ? m2258a(this.f1464O) : 0;
                setMeasuredDimension(getMeasuredWidth(), Math.min(i4 + m2258a(this.f1472b), mode == Integer.MIN_VALUE ? MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1465P;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1465P);
        }
        this.f1465P = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1463N;
            if (view != null) {
                this.f1465P.setBounds(view.getLeft(), this.f1463N.getTop(), this.f1463N.getRight(), this.f1463N.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1468S ? !(this.f1465P == null && this.f1466Q == null) : this.f1467R != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2 = this.f1467R;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1467R);
        }
        this.f1467R = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1468S) {
                Drawable drawable3 = this.f1467R;
                if (drawable3 != null) {
                    drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                }
            }
        }
        if (!this.f1468S ? this.f1465P == null && this.f1466Q == null : this.f1467R == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1466Q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1466Q);
        }
        this.f1466Q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1469T) {
                Drawable drawable3 = this.f1466Q;
                if (drawable3 != null) {
                    drawable3.setBounds(this.f1472b.getLeft(), this.f1472b.getTop(), this.f1472b.getRight(), this.f1472b.getBottom());
                }
            }
        }
        boolean z = true;
        if (!this.f1468S ? !(this.f1465P == null && this.f1466Q == null) : this.f1467R != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0523l0 l0Var) {
        View view = this.f1472b;
        if (view != null) {
            removeView(view);
        }
        this.f1472b = l0Var;
        if (l0Var != null) {
            addView(l0Var);
            ViewGroup.LayoutParams layoutParams = l0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            l0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1471a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1465P;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1466Q;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1467R;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1465P && !this.f1468S) || (drawable == this.f1466Q && this.f1469T) || ((drawable == this.f1467R && this.f1468S) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0962e0.m5440a((View) this, (Drawable) new C0471b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0238R.styleable.ActionBar);
        this.f1465P = obtainStyledAttributes.getDrawable(C0238R.styleable.ActionBar_background);
        this.f1466Q = obtainStyledAttributes.getDrawable(C0238R.styleable.ActionBar_backgroundStacked);
        this.f1470U = obtainStyledAttributes.getDimensionPixelSize(C0238R.styleable.ActionBar_height, -1);
        if (getId() == C0238R.C0241id.split_action_bar) {
            this.f1468S = true;
            this.f1467R = obtainStyledAttributes.getDrawable(C0238R.styleable.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f1468S ? this.f1465P == null && this.f1466Q == null : this.f1467R == null) {
            z = true;
        }
        setWillNotDraw(z);
    }
}
