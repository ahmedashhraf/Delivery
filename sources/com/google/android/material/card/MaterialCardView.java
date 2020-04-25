package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0202m;
import androidx.annotation.C0211p;
import androidx.annotation.C0213q;
import androidx.annotation.C0215r;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.cardview.widget.CardView;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6928p;
import com.google.android.material.p187p.C6982k;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p187p.C7003s;
import com.google.android.material.theme.p307a.C7109a;

public class MaterialCardView extends CardView implements Checkable, C7003s {

    /* renamed from: c0 */
    private static final int[] f16397c0 = {16842911};

    /* renamed from: d0 */
    private static final int[] f16398d0 = {16842912};

    /* renamed from: e0 */
    private static final int[] f16399e0 = {C5582R.attr.state_dragged};

    /* renamed from: f0 */
    private static final int f16400f0 = C5582R.style.Widget_MaterialComponents_CardView;

    /* renamed from: g0 */
    private static final String f16401g0 = "MaterialCardView";

    /* renamed from: h0 */
    private static final String f16402h0 = "androidx.cardview.widget.CardView";
    @C0193h0

    /* renamed from: U */
    private final C5684a f16403U;

    /* renamed from: V */
    private boolean f16404V;

    /* renamed from: W */
    private boolean f16405W;

    /* renamed from: a0 */
    private boolean f16406a0;

    /* renamed from: b0 */
    private C5683a f16407b0;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface C5683a {
        /* renamed from: a */
        void mo22638a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    /* renamed from: f */
    private void m24864f() {
        if (VERSION.SDK_INT > 26) {
            this.f16403U.mo22639a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo22604b(int i, int i2, int i3, int i4) {
        super.mo3108a(i, i2, i3, i4);
    }

    /* renamed from: d */
    public boolean mo22605d() {
        C5684a aVar = this.f16403U;
        return aVar != null && aVar.mo22667o();
    }

    /* renamed from: e */
    public boolean mo22606e() {
        return this.f16406a0;
    }

    @C0193h0
    public ColorStateList getCardBackgroundColor() {
        return this.f16403U.mo22653c();
    }

    /* access modifiers changed from: 0000 */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    @C0195i0
    public Drawable getCheckedIcon() {
        return this.f16403U.mo22655d();
    }

    @C0195i0
    public ColorStateList getCheckedIconTint() {
        return this.f16403U.mo22657e();
    }

    public int getContentPaddingBottom() {
        return this.f16403U.mo22665m().bottom;
    }

    public int getContentPaddingLeft() {
        return this.f16403U.mo22665m().left;
    }

    public int getContentPaddingRight() {
        return this.f16403U.mo22665m().right;
    }

    public int getContentPaddingTop() {
        return this.f16403U.mo22665m().top;
    }

    @C0215r(from = 0.0d, mo670to = 1.0d)
    public float getProgress() {
        return this.f16403U.mo22659g();
    }

    public float getRadius() {
        return this.f16403U.mo22658f();
    }

    public ColorStateList getRippleColor() {
        return this.f16403U.mo22660h();
    }

    @C0193h0
    public C6986o getShapeAppearanceModel() {
        return this.f16403U.mo22661i();
    }

    @C0198k
    @Deprecated
    public int getStrokeColor() {
        return this.f16403U.mo22662j();
    }

    @C0195i0
    public ColorStateList getStrokeColorStateList() {
        return this.f16403U.mo22663k();
    }

    @C0211p
    public int getStrokeWidth() {
        return this.f16403U.mo22664l();
    }

    public boolean isChecked() {
        return this.f16405W;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6982k.m33515a((View) this, this.f16403U.mo22649b());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo22605d()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f16397c0);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f16398d0);
        }
        if (mo22606e()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f16399e0);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(@C0193h0 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f16402h0);
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(@C0193h0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f16402h0);
        accessibilityNodeInfo.setCheckable(mo22605d());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f16403U.mo22642a(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f16404V) {
            if (!this.f16403U.mo22666n()) {
                this.f16403U.mo22648a(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(@C0198k int i) {
        this.f16403U.mo22644a(ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f16403U.mo22670r();
    }

    public void setCheckable(boolean z) {
        this.f16403U.mo22652b(z);
    }

    public void setChecked(boolean z) {
        if (this.f16405W != z) {
            toggle();
        }
    }

    public void setCheckedIcon(@C0195i0 Drawable drawable) {
        this.f16403U.mo22646a(drawable);
    }

    public void setCheckedIconResource(@C0213q int i) {
        this.f16403U.mo22646a(C0242a.m1109c(getContext(), i));
    }

    public void setCheckedIconTint(@C0195i0 ColorStateList colorStateList) {
        this.f16403U.mo22651b(colorStateList);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        this.f16403U.mo22668p();
    }

    public void setDragged(boolean z) {
        if (this.f16406a0 != z) {
            this.f16406a0 = z;
            refreshDrawableState();
            m24864f();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f16403U.mo22671s();
    }

    public void setOnCheckedChangeListener(@C0195i0 C5683a aVar) {
        this.f16407b0 = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f16403U.mo22671s();
        this.f16403U.mo22669q();
    }

    public void setProgress(@C0215r(from = 0.0d, mo670to = 1.0d) float f) {
        this.f16403U.mo22650b(f);
    }

    public void setRadius(float f) {
        super.setRadius(f);
        this.f16403U.mo22640a(f);
    }

    public void setRippleColor(@C0195i0 ColorStateList colorStateList) {
        this.f16403U.mo22654c(colorStateList);
    }

    public void setRippleColorResource(@C0202m int i) {
        this.f16403U.mo22654c(C0242a.m1108b(getContext(), i));
    }

    public void setShapeAppearanceModel(@C0193h0 C6986o oVar) {
        this.f16403U.mo22647a(oVar);
    }

    public void setStrokeColor(@C0198k int i) {
        this.f16403U.mo22656d(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(@C0211p int i) {
        this.f16403U.mo22641a(i);
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f16403U.mo22671s();
        this.f16403U.mo22669q();
    }

    public void toggle() {
        if (mo22605d() && isEnabled()) {
            this.f16405W = !this.f16405W;
            refreshDrawableState();
            m24864f();
            C5683a aVar = this.f16407b0;
            if (aVar != null) {
                aVar.mo22638a(this, this.f16405W);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.materialCardViewStyle);
    }

    /* renamed from: a */
    public void mo3108a(int i, int i2, int i3, int i4) {
        this.f16403U.mo22643a(i, i2, i3, i4);
    }

    public void setCardBackgroundColor(@C0195i0 ColorStateList colorStateList) {
        this.f16403U.mo22644a(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f16403U.mo22656d(colorStateList);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(C7109a.m34252b(context, attributeSet, i, f16400f0), attributeSet, i);
        this.f16405W = false;
        this.f16406a0 = false;
        this.f16404V = true;
        TypedArray c = C6928p.m33264c(getContext(), attributeSet, C5582R.styleable.MaterialCardView, i, f16400f0, new int[0]);
        this.f16403U = new C5684a(this, attributeSet, i, f16400f0);
        this.f16403U.mo22644a(super.getCardBackgroundColor());
        this.f16403U.mo22643a(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        this.f16403U.mo22645a(c);
        c.recycle();
    }
}
