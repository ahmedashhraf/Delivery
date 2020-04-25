package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0199k0;
import androidx.annotation.C0202m;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0209o;
import androidx.annotation.C0213q;
import androidx.annotation.RequiresApi;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.appcompat.widget.C0494f;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p034l.C0962e0;
import androidx.core.widget.C1120m;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6928p;
import com.google.android.material.internal.C6936w;
import com.google.android.material.p187p.C6982k;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p187p.C7003s;
import com.google.android.material.p302m.C6952c;
import com.google.android.material.theme.p307a.C7109a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends C0494f implements Checkable, C7003s {

    /* renamed from: c0 */
    private static final int[] f16335c0 = {16842911};

    /* renamed from: d0 */
    private static final int[] f16336d0 = {16842912};

    /* renamed from: e0 */
    public static final int f16337e0 = 1;

    /* renamed from: f0 */
    public static final int f16338f0 = 2;

    /* renamed from: g0 */
    public static final int f16339g0 = 3;

    /* renamed from: h0 */
    public static final int f16340h0 = 4;

    /* renamed from: i0 */
    private static final String f16341i0 = "MaterialButton";

    /* renamed from: j0 */
    private static final int f16342j0 = C5582R.style.Widget_MaterialComponents_Button;
    @C0193h0

    /* renamed from: N */
    private final C5681a f16343N;
    @C0193h0

    /* renamed from: O */
    private final LinkedHashSet<C5674b> f16344O;
    @C0195i0

    /* renamed from: P */
    private C5675c f16345P;
    @C0195i0

    /* renamed from: Q */
    private Mode f16346Q;
    @C0195i0

    /* renamed from: R */
    private ColorStateList f16347R;
    @C0195i0

    /* renamed from: S */
    private Drawable f16348S;
    @C0199k0

    /* renamed from: T */
    private int f16349T;
    @C0199k0

    /* renamed from: U */
    private int f16350U;
    @C0199k0

    /* renamed from: V */
    private int f16351V;

    /* renamed from: W */
    private boolean f16352W;

    /* renamed from: a0 */
    private boolean f16353a0;

    /* renamed from: b0 */
    private int f16354b0;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public @interface C5673a {
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    public interface C5674b {
        /* renamed from: a */
        void mo22551a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$c */
    interface C5675c {
        /* renamed from: a */
        void mo22552a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(@C0193h0 Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m24785a(boolean z) {
        if (z) {
            C1120m.m6376a((TextView) this, this.f16348S, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            C1120m.m6376a((TextView) this, (Drawable) null, (Drawable) null, this.f16348S, (Drawable) null);
        }
    }

    /* renamed from: b */
    private void m24786b(boolean z) {
        Drawable drawable = this.f16348S;
        boolean z2 = false;
        if (drawable != null) {
            this.f16348S = C0892a.m5161i(drawable).mutate();
            C0892a.m5146a(this.f16348S, this.f16347R);
            Mode mode = this.f16346Q;
            if (mode != null) {
                C0892a.m5149a(this.f16348S, mode);
            }
            int i = this.f16349T;
            if (i == 0) {
                i = this.f16348S.getIntrinsicWidth();
            }
            int i2 = this.f16349T;
            if (i2 == 0) {
                i2 = this.f16348S.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f16348S;
            int i3 = this.f16350U;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.f16354b0;
        boolean z3 = i4 == 1 || i4 == 2;
        if (z) {
            m24785a(z3);
            return;
        }
        Drawable[] h = C1120m.m6394h(this);
        Drawable drawable3 = h[0];
        Drawable drawable4 = h[2];
        if ((z3 && drawable3 != this.f16348S) || (!z3 && drawable4 != this.f16348S)) {
            z2 = true;
        }
        if (z2) {
            m24785a(z3);
        }
    }

    /* renamed from: c */
    private boolean mo27229c() {
        return C0962e0.m5566x(this) == 1;
    }

    /* renamed from: d */
    private boolean mo27232d() {
        C5681a aVar = this.f16343N;
        return aVar != null && !aVar.mo22598j();
    }

    /* renamed from: e */
    private void mo27236e() {
        if (!(this.f16348S == null || getLayout() == null)) {
            int i = this.f16354b0;
            boolean z = true;
            if (i == 1 || i == 3) {
                this.f16350U = 0;
                m24786b(false);
            } else {
                TextPaint paint = getPaint();
                String charSequence = getText().toString();
                if (getTransformationMethod() != null) {
                    charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
                }
                int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
                int i2 = this.f16349T;
                if (i2 == 0) {
                    i2 = this.f16348S.getIntrinsicWidth();
                }
                int measuredWidth = (((((getMeasuredWidth() - min) - C0962e0.m5404H(this)) - i2) - this.f16351V) - C0962e0.m5405I(this)) / 2;
                boolean c = mo27229c();
                if (this.f16354b0 != 4) {
                    z = false;
                }
                if (c != z) {
                    measuredWidth = -measuredWidth;
                }
                if (this.f16350U != measuredWidth) {
                    this.f16350U = measuredWidth;
                    m24786b(false);
                }
            }
        }
    }

    @C0193h0
    private String getA11yClassName() {
        return (mo22503b() ? CompoundButton.class : Button.class).getName();
    }

    @C0195i0
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @C0195i0
    public Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @C0199k0
    public int getCornerRadius() {
        if (mo27232d()) {
            return this.f16343N.mo22577a();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f16348S;
    }

    public int getIconGravity() {
        return this.f16354b0;
    }

    @C0199k0
    public int getIconPadding() {
        return this.f16351V;
    }

    @C0199k0
    public int getIconSize() {
        return this.f16349T;
    }

    public ColorStateList getIconTint() {
        return this.f16347R;
    }

    public Mode getIconTintMode() {
        return this.f16346Q;
    }

    @C0195i0
    public ColorStateList getRippleColor() {
        if (mo27232d()) {
            return this.f16343N.mo22592d();
        }
        return null;
    }

    @C0193h0
    public C6986o getShapeAppearanceModel() {
        if (mo27232d()) {
            return this.f16343N.mo22593e();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (mo27232d()) {
            return this.f16343N.mo22594f();
        }
        return null;
    }

    @C0199k0
    public int getStrokeWidth() {
        if (mo27232d()) {
            return this.f16343N.mo22595g();
        }
        return 0;
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @C0195i0
    public ColorStateList getSupportBackgroundTintList() {
        if (mo27232d()) {
            return this.f16343N.mo22596h();
        }
        return super.getSupportBackgroundTintList();
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @C0195i0
    public Mode getSupportBackgroundTintMode() {
        if (mo27232d()) {
            return this.f16343N.mo22597i();
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f16352W;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6982k.m33515a((View) this, this.f16343N.mo22589c());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo22503b()) {
            Button.mergeDrawableStates(onCreateDrawableState, f16335c0);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f16336d0);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(@C0193h0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(@C0193h0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo22503b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (VERSION.SDK_INT == 21) {
            C5681a aVar = this.f16343N;
            if (aVar != null) {
                aVar.mo22579a(i4 - i2, i3 - i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo27236e();
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        mo27236e();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(@C0193h0 Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(@C0198k int i) {
        if (mo27232d()) {
            this.f16343N.mo22578a(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(@C0193h0 Drawable drawable) {
        if (!mo27232d()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            this.f16343N.mo22600l();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(@C0213q int i) {
        setBackgroundDrawable(i != 0 ? C0242a.m1109c(getContext(), i) : null);
    }

    public void setBackgroundTintList(@C0195i0 ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(@C0195i0 Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (mo27232d()) {
            this.f16343N.mo22584a(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo22503b() && isEnabled() && this.f16352W != z) {
            this.f16352W = z;
            refreshDrawableState();
            if (!this.f16353a0) {
                this.f16353a0 = true;
                Iterator it = this.f16344O.iterator();
                while (it.hasNext()) {
                    ((C5674b) it.next()).mo22551a(this, this.f16352W);
                }
                this.f16353a0 = false;
            }
        }
    }

    public void setCornerRadius(@C0199k0 int i) {
        if (mo27232d()) {
            this.f16343N.mo22586b(i);
        }
    }

    public void setCornerRadiusResource(@C0209o int i) {
        if (mo27232d()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        if (mo27232d()) {
            this.f16343N.mo22589c().mo27799b(f);
        }
    }

    public void setIcon(@C0195i0 Drawable drawable) {
        if (this.f16348S != drawable) {
            this.f16348S = drawable;
            m24786b(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.f16354b0 != i) {
            this.f16354b0 = i;
            mo27236e();
        }
    }

    public void setIconPadding(@C0199k0 int i) {
        if (this.f16351V != i) {
            this.f16351V = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(@C0213q int i) {
        setIcon(i != 0 ? C0242a.m1109c(getContext(), i) : null);
    }

    public void setIconSize(@C0199k0 int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f16349T != i) {
            this.f16349T = i;
            m24786b(true);
        }
    }

    public void setIconTint(@C0195i0 ColorStateList colorStateList) {
        if (this.f16347R != colorStateList) {
            this.f16347R = colorStateList;
            m24786b(false);
        }
    }

    public void setIconTintMode(Mode mode) {
        if (this.f16346Q != mode) {
            this.f16346Q = mode;
            m24786b(false);
        }
    }

    public void setIconTintResource(@C0202m int i) {
        setIconTint(C0242a.m1108b(getContext(), i));
    }

    /* access modifiers changed from: 0000 */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: 0000 */
    public void setOnPressedChangeListenerInternal(@C0195i0 C5675c cVar) {
        this.f16345P = cVar;
    }

    public void setPressed(boolean z) {
        C5675c cVar = this.f16345P;
        if (cVar != null) {
            cVar.mo22552a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(@C0195i0 ColorStateList colorStateList) {
        if (mo27232d()) {
            this.f16343N.mo22580a(colorStateList);
        }
    }

    public void setRippleColorResource(@C0202m int i) {
        if (mo27232d()) {
            setRippleColor(C0242a.m1108b(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(@C0193h0 C6986o oVar) {
        if (mo27232d()) {
            this.f16343N.mo22583a(oVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: 0000 */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (mo27232d()) {
            this.f16343N.mo22588b(z);
        }
    }

    public void setStrokeColor(@C0195i0 ColorStateList colorStateList) {
        if (mo27232d()) {
            this.f16343N.mo22587b(colorStateList);
        }
    }

    public void setStrokeColorResource(@C0202m int i) {
        if (mo27232d()) {
            setStrokeColor(C0242a.m1108b(getContext(), i));
        }
    }

    public void setStrokeWidth(@C0199k0 int i) {
        if (mo27232d()) {
            this.f16343N.mo22590c(i);
        }
    }

    public void setStrokeWidthResource(@C0209o int i) {
        if (mo27232d()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@C0195i0 ColorStateList colorStateList) {
        if (mo27232d()) {
            this.f16343N.mo22591c(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@C0195i0 Mode mode) {
        if (mo27232d()) {
            this.f16343N.mo22582a(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f16352W);
    }

    public MaterialButton(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.materialButtonStyle);
    }

    public MaterialButton(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(C7109a.m34252b(context, attributeSet, i, f16342j0), attributeSet, i);
        this.f16344O = new LinkedHashSet<>();
        boolean z = false;
        this.f16352W = false;
        this.f16353a0 = false;
        Context context2 = getContext();
        TypedArray c = C6928p.m33264c(context2, attributeSet, C5582R.styleable.MaterialButton, i, f16342j0, new int[0]);
        this.f16351V = c.getDimensionPixelSize(C5582R.styleable.MaterialButton_iconPadding, 0);
        this.f16346Q = C6936w.m33293a(c.getInt(C5582R.styleable.MaterialButton_iconTintMode, -1), Mode.SRC_IN);
        this.f16347R = C6952c.m33332a(getContext(), c, C5582R.styleable.MaterialButton_iconTint);
        this.f16348S = C6952c.m33334b(getContext(), c, C5582R.styleable.MaterialButton_icon);
        this.f16354b0 = c.getInteger(C5582R.styleable.MaterialButton_iconGravity, 1);
        this.f16349T = c.getDimensionPixelSize(C5582R.styleable.MaterialButton_iconSize, 0);
        this.f16343N = new C5681a(this, C6986o.m33526a(context2, attributeSet, i, f16342j0).mo27878a());
        this.f16343N.mo22581a(c);
        c.recycle();
        setCompoundDrawablePadding(this.f16351V);
        if (this.f16348S != null) {
            z = true;
        }
        m24786b(z);
    }

    /* renamed from: a */
    public void mo22501a(@C0193h0 C5674b bVar) {
        this.f16344O.add(bVar);
    }

    /* renamed from: a */
    public void mo22500a() {
        this.f16344O.clear();
    }

    /* renamed from: b */
    public void mo22502b(@C0193h0 C5674b bVar) {
        this.f16344O.remove(bVar);
    }

    /* renamed from: b */
    public boolean mo22503b() {
        C5681a aVar = this.f16343N;
        return aVar != null && aVar.mo22599k();
    }
}
