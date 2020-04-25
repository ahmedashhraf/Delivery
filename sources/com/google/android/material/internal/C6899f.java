package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.C0490e0;
import androidx.core.p034l.C0984g;
import com.google.android.material.C5582R;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.f */
/* compiled from: ForegroundLinearLayout */
public class C6899f extends C0490e0 {
    @C0195i0

    /* renamed from: p0 */
    private Drawable f19308p0;

    /* renamed from: q0 */
    private final Rect f19309q0;

    /* renamed from: r0 */
    private final Rect f19310r0;

    /* renamed from: s0 */
    private int f19311s0;

    /* renamed from: t0 */
    protected boolean f19312t0;

    /* renamed from: u0 */
    boolean f19313u0;

    public C6899f(@C0193h0 Context context) {
        this(context, null);
    }

    public void draw(@C0193h0 Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f19308p0;
        if (drawable != null) {
            if (this.f19313u0) {
                this.f19313u0 = false;
                Rect rect = this.f19309q0;
                Rect rect2 = this.f19310r0;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f19312t0) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f19311s0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @RequiresApi(21)
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f19308p0;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f19308p0;
        if (drawable != null && drawable.isStateful()) {
            this.f19308p0.setState(getDrawableState());
        }
    }

    @C0195i0
    public Drawable getForeground() {
        return this.f19308p0;
    }

    public int getForegroundGravity() {
        return this.f19311s0;
    }

    @RequiresApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f19308p0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f19313u0 = z | this.f19313u0;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f19313u0 = true;
    }

    public void setForeground(@C0195i0 Drawable drawable) {
        Drawable drawable2 = this.f19308p0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f19308p0);
            }
            this.f19308p0 = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f19311s0 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f19311s0 != i) {
            if ((8388615 & i) == 0) {
                i |= C0984g.f4394b;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f19311s0 = i;
            if (this.f19311s0 == 119 && this.f19308p0 != null) {
                this.f19308p0.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f19308p0;
    }

    public C6899f(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6899f(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19309q0 = new Rect();
        this.f19310r0 = new Rect();
        this.f19311s0 = 119;
        this.f19312t0 = true;
        this.f19313u0 = false;
        TypedArray c = C6928p.m33264c(context, attributeSet, C5582R.styleable.ForegroundLinearLayout, i, 0, new int[0]);
        this.f19311s0 = c.getInt(C5582R.styleable.ForegroundLinearLayout_android_foregroundGravity, this.f19311s0);
        Drawable drawable = c.getDrawable(C5582R.styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f19312t0 = c.getBoolean(C5582R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        c.recycle();
    }
}
