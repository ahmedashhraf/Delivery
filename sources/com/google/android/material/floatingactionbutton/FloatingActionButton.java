package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import androidx.annotation.C0180b;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0199k0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0209o;
import androidx.annotation.C0213q;
import androidx.annotation.C0224v0;
import androidx.annotation.C0225w;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.C0510i;
import androidx.appcompat.widget.C0529m;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0711b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p033k.C0944i;
import androidx.core.p034l.C0955c0;
import androidx.core.p034l.C0962e0;
import androidx.core.widget.C1125p;
import com.google.android.material.C5582R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.C6897c;
import com.google.android.material.internal.C6928p;
import com.google.android.material.internal.C6936w;
import com.google.android.material.internal.C6943x;
import com.google.android.material.p179a.C5594h;
import com.google.android.material.p179a.C5597k;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p187p.C7003s;
import com.google.android.material.p299i.C6884a;
import com.google.android.material.p299i.C6886c;
import com.google.android.material.p302m.C6952c;
import com.google.android.material.p304o.C6968c;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.theme.p307a.C7109a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public class FloatingActionButton extends C6943x implements C0955c0, C1125p, C6884a, C7003s, C0711b {

    /* renamed from: f0 */
    private static final String f19096f0 = "FloatingActionButton";

    /* renamed from: g0 */
    private static final String f19097g0 = "expandableWidgetHelper";

    /* renamed from: h0 */
    private static final int f19098h0 = C5582R.style.Widget_Design_FloatingActionButton;

    /* renamed from: i0 */
    public static final int f19099i0 = 1;

    /* renamed from: j0 */
    public static final int f19100j0 = 0;

    /* renamed from: k0 */
    public static final int f19101k0 = -1;

    /* renamed from: l0 */
    public static final int f19102l0 = 0;

    /* renamed from: m0 */
    private static final int f19103m0 = 470;
    @C0195i0

    /* renamed from: N */
    private Mode f19104N;
    @C0195i0

    /* renamed from: O */
    private ColorStateList f19105O;
    @C0195i0

    /* renamed from: P */
    private Mode f19106P;
    @C0195i0

    /* renamed from: Q */
    private ColorStateList f19107Q;

    /* renamed from: R */
    private int f19108R;

    /* renamed from: S */
    private int f19109S;

    /* renamed from: T */
    private int f19110T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f19111U;

    /* renamed from: V */
    private int f19112V;

    /* renamed from: W */
    boolean f19113W;

    /* renamed from: a0 */
    final Rect f19114a0;
    @C0195i0

    /* renamed from: b */
    private ColorStateList f19115b;

    /* renamed from: b0 */
    private final Rect f19116b0;
    @C0193h0

    /* renamed from: c0 */
    private final C0529m f19117c0;
    @C0193h0

    /* renamed from: d0 */
    private final C6886c f19118d0;

    /* renamed from: e0 */
    private C6866d f19119e0;

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    public @interface C5714d {
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends C0712c<T> {

        /* renamed from: d */
        private static final boolean f19120d = true;

        /* renamed from: a */
        private Rect f19121a;

        /* renamed from: b */
        private C6858b f19122b;

        /* renamed from: c */
        private boolean f19123c;

        public BaseBehavior() {
            this.f19123c = true;
        }

        /* renamed from: b */
        public boolean mo27372b() {
            return this.f19123c;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5582R.styleable.FloatingActionButton_Behavior_Layout);
            this.f19123c = obtainStyledAttributes.getBoolean(C5582R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        private static boolean m32901b(@C0193h0 View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C0716g) {
                return ((C0716g) layoutParams).mo4027d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        public void mo27368a(boolean z) {
            this.f19123c = z;
        }

        /* renamed from: a */
        public void mo3983a(@C0193h0 C0716g gVar) {
            if (gVar.f3354h == 0) {
                gVar.f3354h = 80;
            }
        }

        /* renamed from: b */
        private boolean m32902b(@C0193h0 View view, @C0193h0 FloatingActionButton floatingActionButton) {
            if (!m32899a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((C0716g) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo27295a(this.f19122b, false);
            } else {
                floatingActionButton.mo27303b(this.f19122b, false);
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo4004b(CoordinatorLayout coordinatorLayout, @C0193h0 FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m32900a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else if (m32901b(view)) {
                m32902b(view, floatingActionButton);
            }
            return false;
        }

        @C0224v0
        /* renamed from: a */
        public void mo27367a(C6858b bVar) {
            this.f19122b = bVar;
        }

        /* renamed from: a */
        private boolean m32899a(@C0193h0 View view, @C0193h0 FloatingActionButton floatingActionButton) {
            C0716g gVar = (C0716g) floatingActionButton.getLayoutParams();
            if (this.f19123c && gVar.mo4025c() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m32900a(CoordinatorLayout coordinatorLayout, @C0193h0 AppBarLayout appBarLayout, @C0193h0 FloatingActionButton floatingActionButton) {
            if (!m32899a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f19121a == null) {
                this.f19121a = new Rect();
            }
            Rect rect = this.f19121a;
            C6897c.m33153a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo27295a(this.f19122b, false);
            } else {
                floatingActionButton.mo27303b(this.f19122b, false);
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo3994a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 FloatingActionButton floatingActionButton, int i) {
            List b = coordinatorLayout.mo3938b((View) floatingActionButton);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) b.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m32901b(view) && m32902b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m32900a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo3942c((View) floatingActionButton, i);
            m32898a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean mo3996a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 FloatingActionButton floatingActionButton, @C0193h0 Rect rect) {
            Rect rect2 = floatingActionButton.f19114a0;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        private void m32898a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f19114a0;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                C0716g gVar = (C0716g) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - gVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= gVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - gVar.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= gVar.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    C0962e0.m5513h((View) floatingActionButton, i);
                }
                if (i2 != 0) {
                    C0962e0.m5508g((View) floatingActionButton, i2);
                }
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo27370a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 FloatingActionButton floatingActionButton, @C0193h0 Rect rect) {
            return super.mo3996a(coordinatorLayout, floatingActionButton, rect);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo27372b() {
            return super.mo27372b();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo3983a(@C0193h0 C0716g gVar) {
            super.mo3983a(gVar);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo27371a(CoordinatorLayout coordinatorLayout, @C0193h0 FloatingActionButton floatingActionButton, View view) {
            return super.mo4004b(coordinatorLayout, floatingActionButton, view);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo27369a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 FloatingActionButton floatingActionButton, int i) {
            return super.mo3994a(coordinatorLayout, floatingActionButton, i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo27368a(boolean z) {
            super.mo27368a(z);
        }

        @C0224v0
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo27367a(C6858b bVar) {
            super.mo27367a(bVar);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    class C6857a implements C6876j {

        /* renamed from: a */
        final /* synthetic */ C6858b f19124a;

        C6857a(C6858b bVar) {
            this.f19124a = bVar;
        }

        /* renamed from: a */
        public void mo27373a() {
            this.f19124a.mo22338b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo27374b() {
            this.f19124a.mo22337a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C6858b {
        /* renamed from: a */
        public void mo22337a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo22338b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    private class C6859c implements C6968c {
        C6859c() {
        }

        /* renamed from: L */
        public float mo27375L() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }

        /* renamed from: a */
        public void mo27376a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f19114a0.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f19111U, i2 + FloatingActionButton.this.f19111U, i3 + FloatingActionButton.this.f19111U, i4 + FloatingActionButton.this.f19111U);
        }

        /* renamed from: a */
        public void mo27377a(@C0195i0 Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        /* renamed from: a */
        public boolean mo27378a() {
            return FloatingActionButton.this.f19113W;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$e */
    class C6860e<T extends FloatingActionButton> implements C6875i {
        @C0193h0

        /* renamed from: a */
        private final C5597k<T> f19127a;

        C6860e(@C0193h0 C5597k<T> kVar) {
            this.f19127a = kVar;
        }

        /* renamed from: a */
        public void mo27379a() {
            this.f19127a.mo22068b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo27380b() {
            this.f19127a.mo22067a(FloatingActionButton.this);
        }

        public boolean equals(@C0195i0 Object obj) {
            return (obj instanceof C6860e) && ((C6860e) obj).f19127a.equals(this.f19127a);
        }

        public int hashCode() {
            return this.f19127a.hashCode();
        }
    }

    public FloatingActionButton(@C0193h0 Context context) {
        this(context, null);
    }

    private C6866d getImpl() {
        if (this.f19119e0 == null) {
            this.f19119e0 = m32877h();
        }
        return this.f19119e0;
    }

    @C0193h0
    /* renamed from: h */
    private C6866d m32877h() {
        if (VERSION.SDK_INT >= 21) {
            return new C6879e(this, new C6859c());
        }
        return new C6866d(this, new C6859c());
    }

    /* renamed from: i */
    private void m32878i() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f19105O;
            if (colorStateList == null) {
                C0892a.m5153b(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            Mode mode = this.f19106P;
            if (mode == null) {
                mode = Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0510i.m2768a(colorForState, mode));
        }
    }

    /* renamed from: b */
    public void mo27302b(@C0195i0 C6858b bVar) {
        mo27303b(bVar, true);
    }

    /* renamed from: c */
    public void mo27304c() {
        mo27294a((C6858b) null);
    }

    /* renamed from: d */
    public void mo27306d(@C0193h0 AnimatorListener animatorListener) {
        getImpl().mo27440d(animatorListener);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo27425a(getDrawableState());
    }

    /* renamed from: e */
    public boolean mo27309e() {
        return getImpl().mo27449k();
    }

    /* renamed from: f */
    public boolean mo27310f() {
        return getImpl().mo27441d();
    }

    /* renamed from: g */
    public void mo27311g() {
        mo27302b((C6858b) null);
    }

    @C0195i0
    public ColorStateList getBackgroundTintList() {
        return this.f19115b;
    }

    @C0195i0
    public Mode getBackgroundTintMode() {
        return this.f19104N;
    }

    @C0193h0
    public C0712c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo27436c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo27444f();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo27445g();
    }

    @C0195i0
    public Drawable getContentBackground() {
        return getImpl().mo27426b();
    }

    @C0199k0
    public int getCustomSize() {
        return this.f19110T;
    }

    public int getExpandedComponentIdHint() {
        return this.f19118d0.mo27487a();
    }

    @C0195i0
    public C5594h getHideMotionSpec() {
        return getImpl().mo27442e();
    }

    @C0198k
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f19107Q;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @C0195i0
    public ColorStateList getRippleColorStateList() {
        return this.f19107Q;
    }

    @C0193h0
    public C6986o getShapeAppearanceModel() {
        return (C6986o) C0944i.m5337a(getImpl().mo27446h());
    }

    @C0195i0
    public C5594h getShowMotionSpec() {
        return getImpl().mo27447i();
    }

    public int getSize() {
        return this.f19109S;
    }

    /* access modifiers changed from: 0000 */
    public int getSizeDimension() {
        return m32871a(this.f19109S);
    }

    @C0195i0
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @C0195i0
    public Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @C0195i0
    public ColorStateList getSupportImageTintList() {
        return this.f19105O;
    }

    @C0195i0
    public Mode getSupportImageTintMode() {
        return this.f19106P;
    }

    public boolean getUseCompatPadding() {
        return this.f19113W;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo27450l();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo27451m();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo27453o();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f19111U = (sizeDimension - this.f19112V) / 2;
        getImpl().mo27462x();
        int min = Math.min(m32872a(sizeDimension, i), m32872a(sizeDimension, i2));
        Rect rect = this.f19114a0;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.getSuperState());
        this.f19118d0.mo27489a((Bundle) C0944i.m5337a(extendableSavedState.extendableStates.get(f19097g0)));
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.extendableStates.put(f19097g0, this.f19118d0.mo27492c());
        return extendableSavedState;
    }

    public boolean onTouchEvent(@C0193h0 MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo27297a(this.f19116b0) || this.f19116b0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(@C0195i0 ColorStateList colorStateList) {
        if (this.f19115b != colorStateList) {
            this.f19115b = colorStateList;
            getImpl().mo27416a(colorStateList);
        }
    }

    public void setBackgroundTintMode(@C0195i0 Mode mode) {
        if (this.f19104N != mode) {
            this.f19104N = mode;
            getImpl().mo27418a(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo27412a(f);
    }

    public void setCompatElevationResource(@C0209o int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo27427b(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(@C0209o int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo27439d(f);
    }

    public void setCompatPressedTranslationZResource(@C0209o int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(@C0199k0 int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f19110T) {
            this.f19110T = i;
            requestLayout();
        }
    }

    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo27443e(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo27441d()) {
            getImpl().mo27424a(z);
            requestLayout();
        }
    }

    public boolean setExpanded(boolean z) {
        return this.f19118d0.mo27490a(z);
    }

    public void setExpandedComponentIdHint(@C0225w int i) {
        this.f19118d0.mo27488a(i);
    }

    public void setHideMotionSpec(@C0195i0 C5594h hVar) {
        getImpl().mo27420a(hVar);
    }

    public void setHideMotionSpecResource(@C0180b int i) {
        setHideMotionSpec(C5594h.m24263a(getContext(), i));
    }

    public void setImageDrawable(@C0195i0 Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo27461w();
            if (this.f19105O != null) {
                m32878i();
            }
        }
    }

    public void setImageResource(@C0213q int i) {
        this.f19117c0.mo2793a(i);
        m32878i();
    }

    public void setRippleColor(@C0198k int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo27455q();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo27455q();
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @C0224v0
    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo27435b(z);
    }

    public void setShapeAppearanceModel(@C0193h0 C6986o oVar) {
        getImpl().mo27423a(oVar);
    }

    public void setShowMotionSpec(@C0195i0 C5594h hVar) {
        getImpl().mo27432b(hVar);
    }

    public void setShowMotionSpecResource(@C0180b int i) {
        setShowMotionSpec(C5594h.m24263a(getContext(), i));
    }

    public void setSize(int i) {
        this.f19110T = 0;
        if (i != this.f19109S) {
            this.f19109S = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(@C0195i0 ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(@C0195i0 Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(@C0195i0 ColorStateList colorStateList) {
        if (this.f19105O != colorStateList) {
            this.f19105O = colorStateList;
            m32878i();
        }
    }

    public void setSupportImageTintMode(@C0195i0 Mode mode) {
        if (this.f19106P != mode) {
            this.f19106P = mode;
            m32878i();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo27456r();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo27456r();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo27456r();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f19113W != z) {
            this.f19113W = z;
            getImpl().mo27452n();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public FloatingActionButton(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.floatingActionButtonStyle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27303b(@C0195i0 C6858b bVar, boolean z) {
        getImpl().mo27434b(m32875c(bVar), z);
    }

    /* renamed from: c */
    public void mo27305c(@C0193h0 AnimatorListener animatorListener) {
        getImpl().mo27438c(animatorListener);
    }

    /* renamed from: d */
    public boolean mo27307d() {
        return getImpl().mo27448j();
    }

    public void setRippleColor(@C0195i0 ColorStateList colorStateList) {
        if (this.f19107Q != colorStateList) {
            this.f19107Q = colorStateList;
            getImpl().mo27430b(this.f19107Q);
        }
    }

    public FloatingActionButton(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(C7109a.m34252b(context, attributeSet, i, f19098h0), attributeSet, i);
        this.f19114a0 = new Rect();
        this.f19116b0 = new Rect();
        Context context2 = getContext();
        TypedArray c = C6928p.m33264c(context2, attributeSet, C5582R.styleable.FloatingActionButton, i, f19098h0, new int[0]);
        this.f19115b = C6952c.m33332a(context2, c, C5582R.styleable.FloatingActionButton_backgroundTint);
        this.f19104N = C6936w.m33293a(c.getInt(C5582R.styleable.FloatingActionButton_backgroundTintMode, -1), (Mode) null);
        this.f19107Q = C6952c.m33332a(context2, c, C5582R.styleable.FloatingActionButton_rippleColor);
        this.f19109S = c.getInt(C5582R.styleable.FloatingActionButton_fabSize, -1);
        this.f19110T = c.getDimensionPixelSize(C5582R.styleable.FloatingActionButton_fabCustomSize, 0);
        this.f19108R = c.getDimensionPixelSize(C5582R.styleable.FloatingActionButton_borderWidth, 0);
        float dimension = c.getDimension(C5582R.styleable.FloatingActionButton_elevation, 0.0f);
        float dimension2 = c.getDimension(C5582R.styleable.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = c.getDimension(C5582R.styleable.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f19113W = c.getBoolean(C5582R.styleable.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C5582R.dimen.mtrl_fab_min_touch_target);
        this.f19112V = c.getDimensionPixelSize(C5582R.styleable.FloatingActionButton_maxImageSize, 0);
        C5594h a = C5594h.m24264a(context2, c, C5582R.styleable.FloatingActionButton_showMotionSpec);
        C5594h a2 = C5594h.m24264a(context2, c, C5582R.styleable.FloatingActionButton_hideMotionSpec);
        C6986o a3 = C6986o.m33528a(context2, attributeSet, i, f19098h0, C6986o.f19598m).mo27878a();
        boolean z = c.getBoolean(C5582R.styleable.FloatingActionButton_ensureMinTouchTargetSize, false);
        c.recycle();
        this.f19117c0 = new C0529m(this);
        this.f19117c0.mo2796a(attributeSet, i);
        this.f19118d0 = new C6886c(this);
        getImpl().mo27423a(a3);
        getImpl().mo27417a(this.f19115b, this.f19104N, this.f19107Q, this.f19108R);
        getImpl().mo27428b(dimensionPixelSize);
        getImpl().mo27412a(dimension);
        getImpl().mo27427b(dimension2);
        getImpl().mo27439d(dimension3);
        getImpl().mo27414a(this.f19112V);
        getImpl().mo27432b(a);
        getImpl().mo27420a(a2);
        getImpl().mo27424a(z);
        setScaleType(ScaleType.MATRIX);
    }

    @C0195i0
    /* renamed from: c */
    private C6876j m32875c(@C0195i0 C6858b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C6857a(bVar);
    }

    /* renamed from: a */
    public void mo27294a(@C0195i0 C6858b bVar) {
        mo27295a(bVar, true);
    }

    /* renamed from: b */
    public void mo27299b(@C0193h0 AnimatorListener animatorListener) {
        getImpl().mo27429b(animatorListener);
    }

    /* renamed from: c */
    private void m32876c(@C0193h0 Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f19114a0;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27295a(@C0195i0 C6858b bVar, boolean z) {
        getImpl().mo27422a(m32875c(bVar), z);
    }

    /* renamed from: b */
    public void mo27298b() {
        setCustomSize(0);
    }

    /* renamed from: a */
    public void mo27292a(@C0193h0 AnimatorListener animatorListener) {
        getImpl().mo27415a(animatorListener);
    }

    /* renamed from: b */
    public void mo27300b(@C0193h0 Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m32876c(rect);
    }

    /* renamed from: a */
    public boolean mo27296a() {
        return this.f19118d0.mo27491b();
    }

    /* renamed from: a */
    private int m32871a(int i) {
        int i2;
        int i3 = this.f19110T;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i == -1) {
            if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < f19103m0) {
                i2 = m32871a(1);
            } else {
                i2 = m32871a(0);
            }
            return i2;
        } else if (i != 1) {
            return resources.getDimensionPixelSize(C5582R.dimen.design_fab_size_normal);
        } else {
            return resources.getDimensionPixelSize(C5582R.dimen.design_fab_size_mini);
        }
    }

    /* renamed from: b */
    public void mo27301b(@C0193h0 C5597k<? extends FloatingActionButton> kVar) {
        getImpl().mo27433b((C6875i) new C6860e(kVar));
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo27297a(@C0193h0 Rect rect) {
        if (!C0962e0.m5540n0(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m32876c(rect);
        return true;
    }

    /* renamed from: a */
    private static int m32872a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public void mo27293a(@C0193h0 C5597k<? extends FloatingActionButton> kVar) {
        getImpl().mo27421a((C6875i) new C6860e(kVar));
    }
}
