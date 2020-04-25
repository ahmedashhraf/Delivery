package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import androidx.core.p034l.C0962e0;
import com.google.android.material.C5582R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.p179a.C5587a;
import com.google.android.material.p179a.C5588b;
import com.google.android.material.p179a.C5589c;
import com.google.android.material.p179a.C5590d;
import com.google.android.material.p179a.C5591e;
import com.google.android.material.p179a.C5594h;
import com.google.android.material.p179a.C5595i;
import com.google.android.material.p179a.C5596j;
import com.google.android.material.p182d.C5696a;
import com.google.android.material.p182d.C5700d;
import com.google.android.material.p182d.C5705g;
import com.google.android.material.p182d.C5705g.C5709d;
import com.google.android.material.p182d.C5705g.C5710e;
import com.google.android.material.p300k.C6947a;
import java.util.ArrayList;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: f */
    private final Rect f20184f = new Rect();

    /* renamed from: g */
    private final RectF f20185g = new RectF();

    /* renamed from: h */
    private final RectF f20186h = new RectF();

    /* renamed from: i */
    private final int[] f20187i = new int[2];

    /* renamed from: j */
    private float f20188j;

    /* renamed from: k */
    private float f20189k;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C7112a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f20190a;

        /* renamed from: b */
        final /* synthetic */ View f20191b;

        /* renamed from: c */
        final /* synthetic */ View f20192c;

        C7112a(boolean z, View view, View view2) {
            this.f20190a = z;
            this.f20191b = view;
            this.f20192c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f20190a) {
                this.f20191b.setVisibility(4);
                this.f20192c.setAlpha(1.0f);
                this.f20192c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f20190a) {
                this.f20191b.setVisibility(0);
                this.f20192c.setAlpha(0.0f);
                this.f20192c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    class C7113b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f20194a;

        C7113b(View view) {
            this.f20194a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f20194a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    class C7114c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5705g f20196a;

        /* renamed from: b */
        final /* synthetic */ Drawable f20197b;

        C7114c(C5705g gVar, Drawable drawable) {
            this.f20196a = gVar;
            this.f20197b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f20196a.setCircularRevealOverlayDrawable(null);
        }

        public void onAnimationStart(Animator animator) {
            this.f20196a.setCircularRevealOverlayDrawable(this.f20197b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    class C7115d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5705g f20199a;

        C7115d(C5705g gVar) {
            this.f20199a = gVar;
        }

        public void onAnimationEnd(Animator animator) {
            C5710e revealInfo = this.f20199a.getRevealInfo();
            revealInfo.f16567c = Float.MAX_VALUE;
            this.f20199a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    protected static class C7116e {
        @C0195i0

        /* renamed from: a */
        public C5594h f20201a;

        /* renamed from: b */
        public C5596j f20202b;

        protected C7116e() {
        }
    }

    public FabTransformationBehavior() {
    }

    @TargetApi(21)
    /* renamed from: c */
    private void m34281c(View view, @C0193h0 View view2, boolean z, boolean z2, @C0193h0 C7116e eVar, @C0193h0 List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float r = C0962e0.m5551r(view2) - C0962e0.m5551r(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-r);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-r});
        }
        eVar.f20201a.mo22052b("elevation").mo22059a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: d */
    private void m34284d(View view, View view2, boolean z, boolean z2, @C0193h0 C7116e eVar, @C0193h0 List<Animator> list, @C0193h0 List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C5705g) && (view instanceof ImageView)) {
            C5705g gVar = (C5705g) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C5591e.f15936b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C5591e.f15936b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C7113b(view2));
                eVar.f20201a.mo22052b("iconFade").mo22059a((Animator) objectAnimator);
                list.add(objectAnimator);
                list2.add(new C7114c(gVar, drawable));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C7116e mo28473a(Context context, boolean z);

    @C0194i
    /* renamed from: a */
    public boolean mo3999a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 View view, @C0193h0 View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: b */
    public AnimatorSet mo28471b(@C0193h0 View view, @C0193h0 View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C7116e a = mo28473a(view2.getContext(), z3);
        if (z3) {
            this.f20188j = view.getTranslationX();
            this.f20189k = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (VERSION.SDK_INT >= 21) {
            m34281c(view, view2, z, z2, a, arrayList, arrayList2);
        }
        RectF rectF = this.f20185g;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m34273a(view3, view4, z4, z2, a, (List<Animator>) arrayList3, (List<AnimatorListener>) arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m34270a(view3, view4, z4, a, arrayList);
        boolean z5 = z2;
        C7116e eVar = a;
        m34284d(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        m34271a(view3, view4, z4, z5, eVar, width, height, (List<Animator>) arrayList, (List<AnimatorListener>) arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m34278b(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        m34272a(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C5588b.m24253a(animatorSet, arrayList);
        animatorSet.addListener(new C7112a(z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @C0194i
    /* renamed from: a */
    public void mo3983a(@C0193h0 C0716g gVar) {
        if (gVar.f3354h == 0) {
            gVar.f3354h = 80;
        }
    }

    /* renamed from: c */
    private float m34279c(@C0193h0 View view, @C0193h0 View view2, @C0193h0 C5596j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f20185g;
        RectF rectF2 = this.f20186h;
        m34269a(view, rectF);
        m34277b(view2, rectF2);
        int i = jVar.f15950a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f15951b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f15951b;
    }

    /* renamed from: a */
    private void m34270a(@C0193h0 View view, @C0193h0 View view2, boolean z, @C0193h0 C7116e eVar, @C0193h0 List<Animator> list) {
        float c = m34279c(view, view2, eVar.f20202b);
        float d = m34282d(view, view2, eVar.f20202b);
        Pair a = m34266a(c, d, z, eVar);
        C5595i iVar = (C5595i) a.first;
        C5595i iVar2 = (C5595i) a.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            c = this.f20188j;
        }
        fArr[0] = c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            d = this.f20189k;
        }
        fArr2[0] = d;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.mo22059a((Animator) ofFloat);
        iVar2.mo22059a((Animator) ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: d */
    private float m34282d(@C0193h0 View view, @C0193h0 View view2, @C0193h0 C5596j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f20185g;
        RectF rectF2 = this.f20186h;
        m34269a(view, rectF);
        m34277b(view2, rectF2);
        int i = jVar.f15950a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f15952c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f15952c;
    }

    /* renamed from: c */
    private int m34280c(@C0193h0 View view) {
        ColorStateList n = C0962e0.m5537n(view);
        if (n != null) {
            return n.getColorForState(view.getDrawableState(), n.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: a */
    private void m34273a(@C0193h0 View view, @C0193h0 View view2, boolean z, boolean z2, @C0193h0 C7116e eVar, @C0193h0 List<Animator> list, List<AnimatorListener> list2, @C0193h0 RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        C7116e eVar2 = eVar;
        List<Animator> list3 = list;
        float c = m34279c(view3, view4, eVar2.f20202b);
        float d = m34282d(view3, view4, eVar2.f20202b);
        Pair a = m34266a(c, d, z3, eVar2);
        C5595i iVar = (C5595i) a.first;
        C5595i iVar2 = (C5595i) a.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-c);
                view4.setTranslationY(-d);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            m34274a(view2, eVar, iVar, iVar2, -c, -d, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-c});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-d});
        }
        iVar.mo22059a((Animator) objectAnimator2);
        iVar2.mo22059a((Animator) objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: b */
    private void m34278b(@C0193h0 View view, View view2, boolean z, boolean z2, @C0193h0 C7116e eVar, @C0193h0 List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C5705g) {
            C5705g gVar = (C5705g) view2;
            int c = m34280c(view);
            int i = 16777215 & c;
            if (z) {
                if (!z2) {
                    gVar.setCircularRevealScrimColor(c);
                }
                objectAnimator = ObjectAnimator.ofInt(gVar, C5709d.f16563a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(gVar, C5709d.f16563a, new int[]{c});
            }
            objectAnimator.setEvaluator(C5589c.m24254a());
            eVar.f20201a.mo22052b("color").mo22059a((Animator) objectAnimator);
            list.add(objectAnimator);
        }
    }

    @C0195i0
    /* renamed from: d */
    private ViewGroup m34283d(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: b */
    private void m34277b(@C0193h0 View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f20187i;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: a */
    private void m34271a(@C0193h0 View view, View view2, boolean z, boolean z2, @C0193h0 C7116e eVar, float f, float f2, @C0193h0 List<Animator> list, @C0193h0 List<AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C7116e eVar2 = eVar;
        if (view4 instanceof C5705g) {
            C5705g gVar = (C5705g) view4;
            float a = m34264a(view3, view4, eVar2.f20202b);
            float b = m34275b(view3, view4, eVar2.f20202b);
            ((FloatingActionButton) view3).mo27297a(this.f20184f);
            float width = ((float) this.f20184f.width()) / 2.0f;
            C5595i b2 = eVar2.f20201a.mo22052b("expansion");
            if (z) {
                if (!z2) {
                    gVar.setRevealInfo(new C5710e(a, b, width));
                }
                if (z2) {
                    width = gVar.getRevealInfo().f16567c;
                }
                animator = C5696a.m25130a(gVar, a, b, C6947a.m33313a(a, b, 0.0f, 0.0f, f, f2));
                animator.addListener(new C7115d(gVar));
                m34267a(view2, b2.mo22058a(), (int) a, (int) b, width, list);
            } else {
                float f3 = gVar.getRevealInfo().f16567c;
                Animator a2 = C5696a.m25130a(gVar, a, b, width);
                int i = (int) a;
                int i2 = (int) b;
                View view5 = view2;
                int i3 = i;
                m34267a(view5, b2.mo22058a(), i, i2, f3, list);
                m34268a(view5, b2.mo22058a(), b2.mo22060b(), eVar2.f20201a.mo22047a(), i3, i2, width, list);
                animator = a2;
            }
            b2.mo22059a(animator);
            list.add(animator);
            list2.add(C5696a.m25129a(gVar));
        }
    }

    /* renamed from: b */
    private float m34275b(@C0193h0 View view, @C0193h0 View view2, @C0193h0 C5596j jVar) {
        RectF rectF = this.f20185g;
        RectF rectF2 = this.f20186h;
        m34269a(view, rectF);
        m34277b(view2, rectF2);
        rectF2.offset(0.0f, -m34282d(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    @C0195i0
    /* renamed from: b */
    private ViewGroup m34276b(@C0193h0 View view) {
        View findViewById = view.findViewById(C5582R.C5586id.mtrl_child_content_container);
        if (findViewById != null) {
            return m34283d(findViewById);
        }
        if ((view instanceof C7119b) || (view instanceof C7118a)) {
            return m34283d(((ViewGroup) view).getChildAt(0));
        }
        return m34283d(view);
    }

    /* renamed from: a */
    private void m34272a(View view, View view2, boolean z, boolean z2, @C0193h0 C7116e eVar, @C0193h0 List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if (!(view2 instanceof C5705g) || C5700d.f16547o != 0) {
                ViewGroup b = m34276b(view2);
                if (b != null) {
                    if (z) {
                        if (!z2) {
                            C5590d.f15935a.set(b, Float.valueOf(0.0f));
                        }
                        objectAnimator = ObjectAnimator.ofFloat(b, C5590d.f15935a, new float[]{1.0f});
                    } else {
                        objectAnimator = ObjectAnimator.ofFloat(b, C5590d.f15935a, new float[]{0.0f});
                    }
                    eVar.f20201a.mo22052b("contentFade").mo22059a((Animator) objectAnimator);
                    list.add(objectAnimator);
                }
            }
        }
    }

    @C0193h0
    /* renamed from: a */
    private Pair<C5595i, C5595i> m34266a(float f, float f2, boolean z, @C0193h0 C7116e eVar) {
        C5595i iVar;
        C5595i iVar2;
        if (f == 0.0f || f2 == 0.0f) {
            iVar2 = eVar.f20201a.mo22052b("translationXLinear");
            iVar = eVar.f20201a.mo22052b("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            iVar2 = eVar.f20201a.mo22052b("translationXCurveDownwards");
            iVar = eVar.f20201a.mo22052b("translationYCurveDownwards");
        } else {
            iVar2 = eVar.f20201a.mo22052b("translationXCurveUpwards");
            iVar = eVar.f20201a.mo22052b("translationYCurveUpwards");
        }
        return new Pair<>(iVar2, iVar);
    }

    /* renamed from: a */
    private void m34269a(@C0193h0 View view, @C0193h0 RectF rectF) {
        m34277b(view, rectF);
        rectF.offset(this.f20188j, this.f20189k);
    }

    /* renamed from: a */
    private float m34264a(@C0193h0 View view, @C0193h0 View view2, @C0193h0 C5596j jVar) {
        RectF rectF = this.f20185g;
        RectF rectF2 = this.f20186h;
        m34269a(view, rectF);
        m34277b(view2, rectF2);
        rectF2.offset(-m34279c(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: a */
    private void m34274a(@C0193h0 View view, @C0193h0 C7116e eVar, @C0193h0 C5595i iVar, @C0193h0 C5595i iVar2, float f, float f2, float f3, float f4, @C0193h0 RectF rectF) {
        float a = m34265a(eVar, iVar, f, f3);
        float a2 = m34265a(eVar, iVar2, f2, f4);
        Rect rect = this.f20184f;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f20185g;
        rectF2.set(rect);
        RectF rectF3 = this.f20186h;
        m34277b(view, rectF3);
        rectF3.offset(a, a2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: a */
    private float m34265a(@C0193h0 C7116e eVar, @C0193h0 C5595i iVar, float f, float f2) {
        long a = iVar.mo22058a();
        long b = iVar.mo22060b();
        C5595i b2 = eVar.f20201a.mo22052b("expansion");
        return C5587a.m24251a(f, f2, iVar.mo22061c().getInterpolation(((float) (((b2.mo22058a() + b2.mo22060b()) + 17) - a)) / ((float) b)));
    }

    /* renamed from: a */
    private void m34267a(View view, long j, int i, int i2, float f, @C0193h0 List<Animator> list) {
        if (VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: a */
    private void m34268a(View view, long j, long j2, long j3, int i, int i2, float f, @C0193h0 List<Animator> list) {
        if (VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }
}
