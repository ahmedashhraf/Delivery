package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.appcompat.C0238R;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.appcompat.p010c.C0336a;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p034l.C0962e0;
import androidx.core.widget.C1120m;

public class SwitchCompat extends CompoundButton {

    /* renamed from: B0 */
    private static final int f1745B0 = 250;

    /* renamed from: C0 */
    private static final int f1746C0 = 0;

    /* renamed from: D0 */
    private static final int f1747D0 = 1;

    /* renamed from: E0 */
    private static final int f1748E0 = 2;

    /* renamed from: F0 */
    private static final String f1749F0 = "android.widget.Switch";

    /* renamed from: G0 */
    private static final int f1750G0 = 1;

    /* renamed from: H0 */
    private static final int f1751H0 = 2;

    /* renamed from: I0 */
    private static final int f1752I0 = 3;

    /* renamed from: J0 */
    private static final Property<SwitchCompat, Float> f1753J0 = new C0457a(Float.class, "thumbPos");

    /* renamed from: K0 */
    private static final int[] f1754K0 = {16842912};

    /* renamed from: A0 */
    private final Rect f1755A0;

    /* renamed from: N */
    private Mode f1756N;

    /* renamed from: O */
    private boolean f1757O;

    /* renamed from: P */
    private boolean f1758P;

    /* renamed from: Q */
    private Drawable f1759Q;

    /* renamed from: R */
    private ColorStateList f1760R;

    /* renamed from: S */
    private Mode f1761S;

    /* renamed from: T */
    private boolean f1762T;

    /* renamed from: U */
    private boolean f1763U;

    /* renamed from: V */
    private int f1764V;

    /* renamed from: W */
    private int f1765W;

    /* renamed from: a */
    private Drawable f1766a;

    /* renamed from: a0 */
    private int f1767a0;

    /* renamed from: b */
    private ColorStateList f1768b;

    /* renamed from: b0 */
    private boolean f1769b0;

    /* renamed from: c0 */
    private CharSequence f1770c0;

    /* renamed from: d0 */
    private CharSequence f1771d0;

    /* renamed from: e0 */
    private boolean f1772e0;

    /* renamed from: f0 */
    private int f1773f0;

    /* renamed from: g0 */
    private int f1774g0;

    /* renamed from: h0 */
    private float f1775h0;

    /* renamed from: i0 */
    private float f1776i0;

    /* renamed from: j0 */
    private VelocityTracker f1777j0;

    /* renamed from: k0 */
    private int f1778k0;

    /* renamed from: l0 */
    float f1779l0;

    /* renamed from: m0 */
    private int f1780m0;

    /* renamed from: n0 */
    private int f1781n0;

    /* renamed from: o0 */
    private int f1782o0;

    /* renamed from: p0 */
    private int f1783p0;

    /* renamed from: q0 */
    private int f1784q0;

    /* renamed from: r0 */
    private int f1785r0;

    /* renamed from: s0 */
    private int f1786s0;

    /* renamed from: t0 */
    private final TextPaint f1787t0;

    /* renamed from: u0 */
    private ColorStateList f1788u0;

    /* renamed from: v0 */
    private Layout f1789v0;

    /* renamed from: w0 */
    private Layout f1790w0;

    /* renamed from: x0 */
    private TransformationMethod f1791x0;

    /* renamed from: y0 */
    ObjectAnimator f1792y0;

    /* renamed from: z0 */
    private final C0554v f1793z0;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    static class C0457a extends Property<SwitchCompat, Float> {
        C0457a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1779l0);
        }

        /* renamed from: a */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static float m2505a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: b */
    private void m2512b() {
        if (this.f1759Q == null) {
            return;
        }
        if (this.f1762T || this.f1763U) {
            this.f1759Q = C0892a.m5161i(this.f1759Q).mutate();
            if (this.f1762T) {
                C0892a.m5146a(this.f1759Q, this.f1760R);
            }
            if (this.f1763U) {
                C0892a.m5149a(this.f1759Q, this.f1761S);
            }
            if (this.f1759Q.isStateful()) {
                this.f1759Q.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    private void m2514c() {
        ObjectAnimator objectAnimator = this.f1792y0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.f1779l0 > 0.5f;
    }

    private int getThumbOffset() {
        float f;
        if (C0567z0.m3141a(this)) {
            f = 1.0f - this.f1779l0;
        } else {
            f = this.f1779l0;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f1759Q;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f1755A0;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f1766a;
        if (drawable2 != null) {
            rect = C0469a0.m2598d(drawable2);
        } else {
            rect = C0469a0.f1867d;
        }
        return ((((this.f1780m0 - this.f1782o0) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    /* renamed from: a */
    public void mo2294a(Context context, int i) {
        C0549t0 a = C0549t0.m2908a(context, i, C0238R.styleable.TextAppearance);
        ColorStateList a2 = a.mo2868a(C0238R.styleable.TextAppearance_android_textColor);
        if (a2 != null) {
            this.f1788u0 = a2;
        } else {
            this.f1788u0 = getTextColors();
        }
        int c = a.mo2876c(C0238R.styleable.TextAppearance_android_textSize, 0);
        if (c != 0) {
            float f = (float) c;
            if (f != this.f1787t0.getTextSize()) {
                this.f1787t0.setTextSize(f);
                requestLayout();
            }
        }
        m2508a(a.mo2880d(C0238R.styleable.TextAppearance_android_typeface, -1), a.mo2880d(C0238R.styleable.TextAppearance_android_textStyle, -1));
        if (a.mo2871a(C0238R.styleable.TextAppearance_textAllCaps, false)) {
            this.f1791x0 = new C0336a(getContext());
        } else {
            this.f1791x0 = null;
        }
        a.mo2887f();
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f1755A0;
        int i3 = this.f1783p0;
        int i4 = this.f1784q0;
        int i5 = this.f1785r0;
        int i6 = this.f1786s0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1766a;
        if (drawable != null) {
            rect = C0469a0.m2598d(drawable);
        } else {
            rect = C0469a0.f1867d;
        }
        Drawable drawable2 = this.f1759Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f1759Q.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1759Q.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1766a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.f1782o0 + rect2.right;
            this.f1766a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0892a.m5145a(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f1766a;
        if (drawable != null) {
            C0892a.m5144a(drawable, f, f2);
        }
        Drawable drawable2 = this.f1759Q;
        if (drawable2 != null) {
            C0892a.m5144a(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1766a;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1759Q;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0567z0.m3141a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1780m0;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingLeft += this.f1767a0;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0567z0.m3141a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1780m0;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingRight += this.f1767a0;
        }
        return compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1772e0;
    }

    public boolean getSplitTrack() {
        return this.f1769b0;
    }

    public int getSwitchMinWidth() {
        return this.f1765W;
    }

    public int getSwitchPadding() {
        return this.f1767a0;
    }

    public CharSequence getTextOff() {
        return this.f1771d0;
    }

    public CharSequence getTextOn() {
        return this.f1770c0;
    }

    public Drawable getThumbDrawable() {
        return this.f1766a;
    }

    public int getThumbTextPadding() {
        return this.f1764V;
    }

    @C0195i0
    public ColorStateList getThumbTintList() {
        return this.f1768b;
    }

    @C0195i0
    public Mode getThumbTintMode() {
        return this.f1756N;
    }

    public Drawable getTrackDrawable() {
        return this.f1759Q;
    }

    @C0195i0
    public ColorStateList getTrackTintList() {
        return this.f1760R;
    }

    @C0195i0
    public Mode getTrackTintMode() {
        return this.f1761S;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1766a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1759Q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1792y0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1792y0.end();
            this.f1792y0 = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f1754K0);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1755A0;
        Drawable drawable = this.f1759Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1784q0 + rect.top;
        int i3 = this.f1786s0 - rect.bottom;
        Drawable drawable2 = this.f1766a;
        if (drawable != null) {
            if (!this.f1769b0 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = C0469a0.m2598d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1789v0 : this.f1790w0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1788u0;
            if (colorStateList != null) {
                this.f1787t0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1787t0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i2 + i3) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f1749F0);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f1749F0);
        CharSequence charSequence = isChecked() ? this.f1770c0 : this.f1771d0;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f1766a != null) {
            Rect rect = this.f1755A0;
            Drawable drawable = this.f1759Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = C0469a0.m2598d(this.f1766a);
            i5 = Math.max(0, d.left - rect.left);
            i11 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0567z0.m3141a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f1780m0 + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f1780m0) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i10 = this.f1781n0;
            i9 = paddingTop - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f1781n0;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1781n0;
            this.f1783p0 = i7;
            this.f1784q0 = i9;
            this.f1786s0 = i8;
            this.f1785r0 = i6;
        }
        i8 = i10 + i9;
        this.f1783p0 = i7;
        this.f1784q0 = i9;
        this.f1786s0 = i8;
        this.f1785r0 = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1772e0) {
            if (this.f1789v0 == null) {
                this.f1789v0 = m2506a(this.f1770c0);
            }
            if (this.f1790w0 == null) {
                this.f1790w0 = m2506a(this.f1771d0);
            }
        }
        Rect rect = this.f1755A0;
        Drawable drawable = this.f1766a;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1766a.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1766a.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f1782o0 = Math.max(this.f1772e0 ? Math.max(this.f1789v0.getWidth(), this.f1790w0.getWidth()) + (this.f1764V * 2) : 0, i4);
        Drawable drawable2 = this.f1759Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f1759Q.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f1766a;
        if (drawable3 != null) {
            Rect d = C0469a0.m2598d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = Math.max(this.f1765W, (this.f1782o0 * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f1780m0 = max;
        this.f1781n0 = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1770c0 : this.f1771d0;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1777j0
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x00a1
            r2 = 2
            if (r0 == r1) goto L_0x008d
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008d
            goto L_0x00bb
        L_0x0016:
            int r0 = r6.f1773f0
            if (r0 == 0) goto L_0x00bb
            if (r0 == r1) goto L_0x0059
            if (r0 == r2) goto L_0x0020
            goto L_0x00bb
        L_0x0020:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1775h0
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0034
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003f
        L_0x0034:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003f
        L_0x003b:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003f:
            boolean r0 = androidx.appcompat.widget.C0567z0.m3141a(r6)
            if (r0 == 0) goto L_0x0046
            float r2 = -r2
        L_0x0046:
            float r0 = r6.f1779l0
            float r0 = r0 + r2
            float r0 = m2505a(r0, r4, r3)
            float r2 = r6.f1779l0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            r6.f1775h0 = r7
            r6.setThumbPosition(r0)
        L_0x0058:
            return r1
        L_0x0059:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1775h0
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1774g0
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007f
            float r4 = r6.f1776i0
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1774g0
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00bb
        L_0x007f:
            r6.f1773f0 = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1775h0 = r0
            r6.f1776i0 = r3
            return r1
        L_0x008d:
            int r0 = r6.f1773f0
            if (r0 != r2) goto L_0x0098
            r6.m2513b(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0098:
            r0 = 0
            r6.f1773f0 = r0
            android.view.VelocityTracker r0 = r6.f1777j0
            r0.clear()
            goto L_0x00bb
        L_0x00a1:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00bb
            boolean r3 = r6.m2511a(r0, r2)
            if (r3 == 0) goto L_0x00bb
            r6.f1773f0 = r1
            r6.f1775h0 = r0
            r6.f1776i0 = r2
        L_0x00bb:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C0962e0.m5540n0(this)) {
            m2514c();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m2510a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1120m.m6382b((TextView) this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f1772e0 != z) {
            this.f1772e0 = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1769b0 = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1765W = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1767a0 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1787t0.getTypeface() != null && !this.f1787t0.getTypeface().equals(typeface)) || (this.f1787t0.getTypeface() == null && typeface != null)) {
            this.f1787t0.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1771d0 = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1770c0 = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1766a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1766a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void setThumbPosition(float f) {
        this.f1779l0 = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0242a.m1109c(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1764V = i;
        requestLayout();
    }

    public void setThumbTintList(@C0195i0 ColorStateList colorStateList) {
        this.f1768b = colorStateList;
        this.f1757O = true;
        mo27932a();
    }

    public void setThumbTintMode(@C0195i0 Mode mode) {
        this.f1756N = mode;
        this.f1758P = true;
        mo27932a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1759Q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1759Q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0242a.m1109c(getContext(), i));
    }

    public void setTrackTintList(@C0195i0 ColorStateList colorStateList) {
        this.f1760R = colorStateList;
        this.f1762T = true;
        m2512b();
    }

    public void setTrackTintMode(@C0195i0 Mode mode) {
        this.f1761S = mode;
        this.f1763U = true;
        m2512b();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1766a || drawable == this.f1759Q;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0238R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1768b = null;
        this.f1756N = null;
        this.f1757O = false;
        this.f1758P = false;
        this.f1760R = null;
        this.f1761S = null;
        this.f1762T = false;
        this.f1763U = false;
        this.f1777j0 = VelocityTracker.obtain();
        this.f1755A0 = new Rect();
        this.f1787t0 = new TextPaint(1);
        Resources resources = getResources();
        this.f1787t0.density = resources.getDisplayMetrics().density;
        C0549t0 a = C0549t0.m2910a(context, attributeSet, C0238R.styleable.SwitchCompat, i, 0);
        this.f1766a = a.mo2875b(C0238R.styleable.SwitchCompat_android_thumb);
        Drawable drawable = this.f1766a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.f1759Q = a.mo2875b(C0238R.styleable.SwitchCompat_track);
        Drawable drawable2 = this.f1759Q;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        this.f1770c0 = a.mo2889g(C0238R.styleable.SwitchCompat_android_textOn);
        this.f1771d0 = a.mo2889g(C0238R.styleable.SwitchCompat_android_textOff);
        this.f1772e0 = a.mo2871a(C0238R.styleable.SwitchCompat_showText, true);
        this.f1764V = a.mo2876c(C0238R.styleable.SwitchCompat_thumbTextPadding, 0);
        this.f1765W = a.mo2876c(C0238R.styleable.SwitchCompat_switchMinWidth, 0);
        this.f1767a0 = a.mo2876c(C0238R.styleable.SwitchCompat_switchPadding, 0);
        this.f1769b0 = a.mo2871a(C0238R.styleable.SwitchCompat_splitTrack, false);
        ColorStateList a2 = a.mo2868a(C0238R.styleable.SwitchCompat_thumbTint);
        if (a2 != null) {
            this.f1768b = a2;
            this.f1757O = true;
        }
        Mode a3 = C0469a0.m2594a(a.mo2880d(C0238R.styleable.SwitchCompat_thumbTintMode, -1), null);
        if (this.f1756N != a3) {
            this.f1756N = a3;
            this.f1758P = true;
        }
        if (this.f1757O || this.f1758P) {
            mo27932a();
        }
        ColorStateList a4 = a.mo2868a(C0238R.styleable.SwitchCompat_trackTint);
        if (a4 != null) {
            this.f1760R = a4;
            this.f1762T = true;
        }
        Mode a5 = C0469a0.m2594a(a.mo2880d(C0238R.styleable.SwitchCompat_trackTintMode, -1), null);
        if (this.f1761S != a5) {
            this.f1761S = a5;
            this.f1763U = true;
        }
        if (this.f1762T || this.f1763U) {
            m2512b();
        }
        int g = a.mo2888g(C0238R.styleable.SwitchCompat_switchTextAppearance, 0);
        if (g != 0) {
            mo2294a(context, g);
        }
        this.f1793z0 = new C0554v(this);
        this.f1793z0.mo2962a(attributeSet, i);
        a.mo2887f();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1774g0 = viewConfiguration.getScaledTouchSlop();
        this.f1778k0 = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: b */
    private void m2513b(MotionEvent motionEvent) {
        boolean z;
        this.f1773f0 = 0;
        boolean z2 = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z3) {
            this.f1777j0.computeCurrentVelocity(1000);
            float xVelocity = this.f1777j0.getXVelocity();
            if (Math.abs(xVelocity) > ((float) this.f1778k0)) {
                if (!C0567z0.m3141a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
                z = z2;
            } else {
                z = getTargetCheckedState();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m2509a(motionEvent);
    }

    /* renamed from: a */
    private void m2508a(int i, int i2) {
        Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
        mo2295a(typeface, i2);
    }

    /* renamed from: a */
    public void mo2295a(Typeface typeface, int i) {
        Typeface typeface2;
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i);
            } else {
                typeface2 = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typeface2);
            int style = ((typeface2 != null ? typeface2.getStyle() : 0) ^ -1) & i;
            TextPaint textPaint = this.f1787t0;
            if ((style & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f1787t0;
            if ((style & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f1787t0.setFakeBoldText(false);
        this.f1787t0.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    /* renamed from: a */
    private void mo27932a() {
        if (this.f1766a == null) {
            return;
        }
        if (this.f1757O || this.f1758P) {
            this.f1766a = C0892a.m5161i(this.f1766a).mutate();
            if (this.f1757O) {
                C0892a.m5146a(this.f1766a, this.f1768b);
            }
            if (this.f1758P) {
                C0892a.m5149a(this.f1766a, this.f1756N);
            }
            if (this.f1766a.isStateful()) {
                this.f1766a.setState(getDrawableState());
            }
        }
    }

    /* renamed from: a */
    private Layout m2506a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f1791x0;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f1787t0;
        StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        return staticLayout;
    }

    /* renamed from: a */
    private boolean m2511a(float f, float f2) {
        boolean z = false;
        if (this.f1766a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1766a.getPadding(this.f1755A0);
        int i = this.f1784q0;
        int i2 = this.f1774g0;
        int i3 = i - i2;
        int i4 = (this.f1783p0 + thumbOffset) - i2;
        int i5 = this.f1782o0 + i4;
        Rect rect = this.f1755A0;
        int i6 = i5 + rect.left + rect.right + i2;
        int i7 = this.f1786s0 + i2;
        if (f > ((float) i4) && f < ((float) i6) && f2 > ((float) i3) && f2 < ((float) i7)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private void m2509a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    private void m2510a(boolean z) {
        this.f1792y0 = ObjectAnimator.ofFloat(this, f1753J0, new float[]{z ? 1.0f : 0.0f});
        this.f1792y0.setDuration(250);
        if (VERSION.SDK_INT >= 18) {
            this.f1792y0.setAutoCancel(true);
        }
        this.f1792y0.start();
    }
}
