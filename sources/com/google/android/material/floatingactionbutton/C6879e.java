package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import androidx.core.content.C0841b;
import androidx.core.p033k.C0944i;
import com.google.android.material.C5582R;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p303n.C6961b;
import com.google.android.material.p304o.C6968c;
import java.util.ArrayList;

@RequiresApi(21)
/* renamed from: com.google.android.material.floatingactionbutton.e */
/* compiled from: FloatingActionButtonImplLollipop */
class C6879e extends C6866d {

    /* renamed from: com.google.android.material.floatingactionbutton.e$a */
    /* compiled from: FloatingActionButtonImplLollipop */
    static class C6880a extends C6978j {
        C6880a(C6986o oVar) {
            super(oVar);
        }

        public boolean isStateful() {
            return true;
        }
    }

    C6879e(FloatingActionButton floatingActionButton, C6968c cVar) {
        super(floatingActionButton, cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27417a(ColorStateList colorStateList, @C0195i0 Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        this.f19179b = mo27411a();
        this.f19179b.setTintList(colorStateList);
        if (mode != null) {
            this.f19179b.setTintMode(mode);
        }
        this.f19179b.mo27789a(this.f19202y.getContext());
        if (i > 0) {
            this.f19181d = mo27474a(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) C0944i.m5337a(this.f19181d), (Drawable) C0944i.m5337a(this.f19179b)});
        } else {
            this.f19181d = null;
            drawable = this.f19179b;
        }
        this.f19180c = new RippleDrawable(C6961b.m33359b(colorStateList2), drawable, null);
        this.f19182e = this.f19180c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27430b(@C0195i0 ColorStateList colorStateList) {
        Drawable drawable = this.f19180c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C6961b.m33359b(colorStateList));
        } else {
            super.mo27430b(colorStateList);
        }
    }

    /* renamed from: c */
    public float mo27436c() {
        return this.f19202y.getElevation();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo27450l() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo27452n() {
        mo27462x();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public boolean mo27457s() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public boolean mo27458t() {
        return this.f19203z.mo27378a() || !mo27459u();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo27460v() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27413a(float f, float f2, float f3) {
        if (VERSION.SDK_INT == 21) {
            this.f19202y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C6866d.f19167S, m33024a(f, f3));
            stateListAnimator.addState(C6866d.f19168T, m33024a(f, f2));
            stateListAnimator.addState(C6866d.f19169U, m33024a(f, f2));
            stateListAnimator.addState(C6866d.f19170V, m33024a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f19202y, "elevation", new float[]{f}).setDuration(0));
            int i = VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f19202y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f19202y, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C6866d.f19154F);
            stateListAnimator.addState(C6866d.f19171W, animatorSet);
            stateListAnimator.addState(C6866d.f19172X, m33024a(0.0f, 0.0f));
            this.f19202y.setStateListAnimator(stateListAnimator);
        }
        if (mo27458t()) {
            mo27462x();
        }
    }

    @C0193h0
    /* renamed from: a */
    private Animator m33024a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f19202y, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f19202y, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C6866d.f19154F);
        return animatorSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27425a(int[] iArr) {
        if (VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f19202y.isEnabled()) {
            this.f19202y.setElevation(this.f19185h);
            if (this.f19202y.isPressed()) {
                this.f19202y.setTranslationZ(this.f19187j);
            } else if (this.f19202y.isFocused() || this.f19202y.isHovered()) {
                this.f19202y.setTranslationZ(this.f19186i);
            } else {
                this.f19202y.setTranslationZ(0.0f);
            }
        } else {
            this.f19202y.setElevation(0.0f);
            this.f19202y.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: a */
    public C6863c mo27474a(int i, ColorStateList colorStateList) {
        Context context = this.f19202y.getContext();
        C6863c cVar = new C6863c((C6986o) C0944i.m5337a(this.f19178a));
        cVar.mo27395a(C0841b.m4915a(context, C5582R.C5584color.design_fab_stroke_top_outer_color), C0841b.m4915a(context, C5582R.C5584color.design_fab_stroke_top_inner_color), C0841b.m4915a(context, C5582R.C5584color.design_fab_stroke_end_inner_color), C0841b.m4915a(context, C5582R.C5584color.design_fab_stroke_end_outer_color));
        cVar.mo27394a((float) i);
        cVar.mo27396a(colorStateList);
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: a */
    public C6978j mo27411a() {
        return new C6880a((C6986o) C0944i.m5337a(this.f19178a));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27419a(@C0193h0 Rect rect) {
        if (this.f19203z.mo27378a()) {
            super.mo27419a(rect);
        } else if (!mo27459u()) {
            int sizeDimension = (this.f19188k - this.f19202y.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }
}
