package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p033k.C0944i;
import androidx.core.p034l.C0962e0;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6918l;
import com.google.android.material.p179a.C5587a;
import com.google.android.material.p179a.C5588b;
import com.google.android.material.p179a.C5592f;
import com.google.android.material.p179a.C5593g;
import com.google.android.material.p179a.C5594h;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6982k;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p187p.C7003s;
import com.google.android.material.p303n.C6958a;
import com.google.android.material.p303n.C6961b;
import com.google.android.material.p304o.C6968c;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.material.floatingactionbutton.d */
/* compiled from: FloatingActionButtonImpl */
class C6866d {

    /* renamed from: F */
    static final TimeInterpolator f19154F = C5587a.f15931c;

    /* renamed from: G */
    static final long f19155G = 100;

    /* renamed from: H */
    static final long f19156H = 100;

    /* renamed from: I */
    static final int f19157I = 0;

    /* renamed from: J */
    static final int f19158J = 1;

    /* renamed from: K */
    static final int f19159K = 2;

    /* renamed from: L */
    static final float f19160L = 1.5f;

    /* renamed from: M */
    private static final float f19161M = 0.0f;

    /* renamed from: N */
    private static final float f19162N = 0.0f;

    /* renamed from: O */
    private static final float f19163O = 0.0f;

    /* renamed from: P */
    private static final float f19164P = 1.0f;

    /* renamed from: Q */
    private static final float f19165Q = 1.0f;

    /* renamed from: R */
    private static final float f19166R = 1.0f;

    /* renamed from: S */
    static final int[] f19167S = {16842919, 16842910};

    /* renamed from: T */
    static final int[] f19168T = {16843623, 16842908, 16842910};

    /* renamed from: U */
    static final int[] f19169U = {16842908, 16842910};

    /* renamed from: V */
    static final int[] f19170V = {16843623, 16842910};

    /* renamed from: W */
    static final int[] f19171W = {16842910};

    /* renamed from: X */
    static final int[] f19172X = new int[0];

    /* renamed from: A */
    private final Rect f19173A = new Rect();

    /* renamed from: B */
    private final RectF f19174B = new RectF();

    /* renamed from: C */
    private final RectF f19175C = new RectF();

    /* renamed from: D */
    private final Matrix f19176D = new Matrix();
    @C0195i0

    /* renamed from: E */
    private OnPreDrawListener f19177E;
    @C0195i0

    /* renamed from: a */
    C6986o f19178a;
    @C0195i0

    /* renamed from: b */
    C6978j f19179b;
    @C0195i0

    /* renamed from: c */
    Drawable f19180c;
    @C0195i0

    /* renamed from: d */
    C6863c f19181d;
    @C0195i0

    /* renamed from: e */
    Drawable f19182e;

    /* renamed from: f */
    boolean f19183f;

    /* renamed from: g */
    boolean f19184g = true;

    /* renamed from: h */
    float f19185h;

    /* renamed from: i */
    float f19186i;

    /* renamed from: j */
    float f19187j;

    /* renamed from: k */
    int f19188k;
    @C0193h0

    /* renamed from: l */
    private final C6918l f19189l;
    @C0195i0

    /* renamed from: m */
    private C5594h f19190m;
    @C0195i0

    /* renamed from: n */
    private C5594h f19191n;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: o */
    public Animator f19192o;
    @C0195i0

    /* renamed from: p */
    private C5594h f19193p;
    @C0195i0

    /* renamed from: q */
    private C5594h f19194q;

    /* renamed from: r */
    private float f19195r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f19196s = 1.0f;

    /* renamed from: t */
    private int f19197t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f19198u = 0;

    /* renamed from: v */
    private ArrayList<AnimatorListener> f19199v;

    /* renamed from: w */
    private ArrayList<AnimatorListener> f19200w;

    /* renamed from: x */
    private ArrayList<C6875i> f19201x;

    /* renamed from: y */
    final FloatingActionButton f19202y;

    /* renamed from: z */
    final C6968c f19203z;

    /* renamed from: com.google.android.material.floatingactionbutton.d$a */
    /* compiled from: FloatingActionButtonImpl */
    class C6867a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f19204a;

        /* renamed from: b */
        final /* synthetic */ boolean f19205b;

        /* renamed from: c */
        final /* synthetic */ C6876j f19206c;

        C6867a(boolean z, C6876j jVar) {
            this.f19205b = z;
            this.f19206c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f19204a = true;
        }

        public void onAnimationEnd(Animator animator) {
            C6866d.this.f19198u = 0;
            C6866d.this.f19192o = null;
            if (!this.f19204a) {
                C6866d.this.f19202y.mo27676a(this.f19205b ? 8 : 4, this.f19205b);
                C6876j jVar = this.f19206c;
                if (jVar != null) {
                    jVar.mo27374b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C6866d.this.f19202y.mo27676a(0, this.f19205b);
            C6866d.this.f19198u = 1;
            C6866d.this.f19192o = animator;
            this.f19204a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$b */
    /* compiled from: FloatingActionButtonImpl */
    class C6868b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f19208a;

        /* renamed from: b */
        final /* synthetic */ C6876j f19209b;

        C6868b(boolean z, C6876j jVar) {
            this.f19208a = z;
            this.f19209b = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            C6866d.this.f19198u = 0;
            C6866d.this.f19192o = null;
            C6876j jVar = this.f19209b;
            if (jVar != null) {
                jVar.mo27373a();
            }
        }

        public void onAnimationStart(Animator animator) {
            C6866d.this.f19202y.mo27676a(0, this.f19208a);
            C6866d.this.f19198u = 2;
            C6866d.this.f19192o = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$c */
    /* compiled from: FloatingActionButtonImpl */
    class C6869c extends C5593g {
        C6869c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, @C0193h0 Matrix matrix, @C0193h0 Matrix matrix2) {
            C6866d.this.f19196s = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    /* compiled from: FloatingActionButtonImpl */
    class C6870d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f19212a = new FloatEvaluator();

        C6870d() {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f19212a.evaluate(f, f2, f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$e */
    /* compiled from: FloatingActionButtonImpl */
    class C6871e implements OnPreDrawListener {
        C6871e() {
        }

        public boolean onPreDraw() {
            C6866d.this.mo27454p();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$f */
    /* compiled from: FloatingActionButtonImpl */
    private class C6872f extends C6878l {
        C6872f() {
            super(C6866d.this, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo27471a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$g */
    /* compiled from: FloatingActionButtonImpl */
    private class C6873g extends C6878l {
        C6873g() {
            super(C6866d.this, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo27471a() {
            C6866d dVar = C6866d.this;
            return dVar.f19185h + dVar.f19186i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$h */
    /* compiled from: FloatingActionButtonImpl */
    private class C6874h extends C6878l {
        C6874h() {
            super(C6866d.this, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo27471a() {
            C6866d dVar = C6866d.this;
            return dVar.f19185h + dVar.f19187j;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$i */
    /* compiled from: FloatingActionButtonImpl */
    interface C6875i {
        /* renamed from: a */
        void mo27379a();

        /* renamed from: b */
        void mo27380b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$j */
    /* compiled from: FloatingActionButtonImpl */
    interface C6876j {
        /* renamed from: a */
        void mo27373a();

        /* renamed from: b */
        void mo27374b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$k */
    /* compiled from: FloatingActionButtonImpl */
    private class C6877k extends C6878l {
        C6877k() {
            super(C6866d.this, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo27471a() {
            return C6866d.this.f19185h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$l */
    /* compiled from: FloatingActionButtonImpl */
    private abstract class C6878l extends AnimatorListenerAdapter implements AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f19219a;

        /* renamed from: b */
        private float f19220b;

        /* renamed from: c */
        private float f19221c;

        private C6878l() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo27471a();

        public void onAnimationEnd(Animator animator) {
            C6866d.this.mo27443e((float) ((int) this.f19221c));
            this.f19219a = false;
        }

        public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
            if (!this.f19219a) {
                C6978j jVar = C6866d.this.f19179b;
                this.f19220b = jVar == null ? 0.0f : jVar.mo27812e();
                this.f19221c = mo27471a();
                this.f19219a = true;
            }
            C6866d dVar = C6866d.this;
            float f = this.f19220b;
            dVar.mo27443e((float) ((int) (f + ((this.f19221c - f) * valueAnimator.getAnimatedFraction()))));
        }

        /* synthetic */ C6878l(C6866d dVar, C6867a aVar) {
            this();
        }
    }

    C6866d(FloatingActionButton floatingActionButton, C6968c cVar) {
        this.f19202y = floatingActionButton;
        this.f19203z = cVar;
        this.f19189l = new C6918l();
        this.f19189l.mo27638a(f19167S, m32956a((C6878l) new C6874h()));
        this.f19189l.mo27638a(f19168T, m32956a((C6878l) new C6873g()));
        this.f19189l.mo27638a(f19169U, m32956a((C6878l) new C6873g()));
        this.f19189l.mo27638a(f19170V, m32956a((C6878l) new C6873g()));
        this.f19189l.mo27638a(f19171W, m32956a((C6878l) new C6877k()));
        this.f19189l.mo27638a(f19172X, m32956a((C6878l) new C6872f()));
        this.f19195r = this.f19202y.getRotation();
    }

    @C0193h0
    /* renamed from: A */
    private OnPreDrawListener m32950A() {
        if (this.f19177E == null) {
            this.f19177E = new C6871e();
        }
        return this.f19177E;
    }

    /* renamed from: B */
    private boolean m32951B() {
        return C0962e0.m5540n0(this.f19202y) && !this.f19202y.isInEditMode();
    }

    /* renamed from: y */
    private C5594h m32959y() {
        if (this.f19191n == null) {
            this.f19191n = C5594h.m24263a(this.f19202y.getContext(), C5582R.C5583animator.design_fab_hide_motion_spec);
        }
        return (C5594h) C0944i.m5337a(this.f19191n);
    }

    /* renamed from: z */
    private C5594h m32960z() {
        if (this.f19190m == null) {
            this.f19190m = C5594h.m24263a(this.f19202y.getContext(), C5582R.C5583animator.design_fab_show_motion_spec);
        }
        return (C5594h) C0944i.m5337a(this.f19190m);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27428b(int i) {
        this.f19188k = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo27436c() {
        return this.f19185h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo27439d(float f) {
        if (this.f19187j != f) {
            this.f19187j = f;
            mo27413a(this.f19185h, this.f19186i, this.f19187j);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: e */
    public final C5594h mo27442e() {
        return this.f19194q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public float mo27444f() {
        return this.f19186i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public float mo27445g() {
        return this.f19187j;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: h */
    public final C6986o mo27446h() {
        return this.f19178a;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: i */
    public final C5594h mo27447i() {
        return this.f19193p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo27448j() {
        boolean z = false;
        if (this.f19202y.getVisibility() == 0) {
            if (this.f19198u == 1) {
                z = true;
            }
            return z;
        }
        if (this.f19198u != 2) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo27449k() {
        boolean z = false;
        if (this.f19202y.getVisibility() != 0) {
            if (this.f19198u == 2) {
                z = true;
            }
            return z;
        }
        if (this.f19198u != 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo27450l() {
        this.f19189l.mo27636a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo27451m() {
        C6978j jVar = this.f19179b;
        if (jVar != null) {
            C6982k.m33515a((View) this.f19202y, jVar);
        }
        if (mo27457s()) {
            this.f19202y.getViewTreeObserver().addOnPreDrawListener(m32950A());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo27452n() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo27453o() {
        ViewTreeObserver viewTreeObserver = this.f19202y.getViewTreeObserver();
        OnPreDrawListener onPreDrawListener = this.f19177E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f19177E = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo27454p() {
        float rotation = this.f19202y.getRotation();
        if (this.f19195r != rotation) {
            this.f19195r = rotation;
            mo27460v();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo27455q() {
        ArrayList<C6875i> arrayList = this.f19201x;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C6875i) it.next()).mo27380b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo27456r() {
        ArrayList<C6875i> arrayList = this.f19201x;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C6875i) it.next()).mo27379a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public boolean mo27457s() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public boolean mo27458t() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final boolean mo27459u() {
        return !this.f19183f || this.f19202y.getSizeDimension() >= this.f19188k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo27460v() {
        if (VERSION.SDK_INT == 19) {
            if (this.f19195r % 90.0f != 0.0f) {
                if (this.f19202y.getLayerType() != 1) {
                    this.f19202y.setLayerType(1, null);
                }
            } else if (this.f19202y.getLayerType() != 0) {
                this.f19202y.setLayerType(0, null);
            }
        }
        C6978j jVar = this.f19179b;
        if (jVar != null) {
            jVar.mo27800b((int) this.f19195r);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final void mo27461w() {
        mo27437c(this.f19196s);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final void mo27462x() {
        Rect rect = this.f19173A;
        mo27419a(rect);
        mo27431b(rect);
        this.f19203z.mo27376a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27430b(@C0195i0 ColorStateList colorStateList) {
        Drawable drawable = this.f19180c;
        if (drawable != null) {
            C0892a.m5146a(drawable, C6961b.m33359b(colorStateList));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo27437c(float f) {
        this.f19196s = f;
        Matrix matrix = this.f19176D;
        m32957a(f, matrix);
        this.f19202y.setImageMatrix(matrix);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo27443e(float f) {
        C6978j jVar = this.f19179b;
        if (jVar != null) {
            jVar.mo27799b(f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27417a(ColorStateList colorStateList, @C0195i0 Mode mode, ColorStateList colorStateList2, int i) {
        this.f19179b = mo27411a();
        this.f19179b.setTintList(colorStateList);
        if (mode != null) {
            this.f19179b.setTintMode(mode);
        }
        this.f19179b.mo27786a(-12303292);
        this.f19179b.mo27789a(this.f19202y.getContext());
        C6958a aVar = new C6958a(this.f19179b.getShapeAppearanceModel());
        aVar.setTintList(C6961b.m33359b(colorStateList2));
        this.f19180c = aVar;
        this.f19182e = new LayerDrawable(new Drawable[]{(Drawable) C0944i.m5337a(this.f19179b), aVar});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo27441d() {
        return this.f19183f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo27427b(float f) {
        if (this.f19186i != f) {
            this.f19186i = f;
            mo27413a(this.f19185h, this.f19186i, this.f19187j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo27440d(@C0193h0 AnimatorListener animatorListener) {
        ArrayList<AnimatorListener> arrayList = this.f19199v;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* renamed from: c */
    public void mo27438c(@C0193h0 AnimatorListener animatorListener) {
        ArrayList<AnimatorListener> arrayList = this.f19200w;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo27432b(@C0195i0 C5594h hVar) {
        this.f19193p = hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27435b(boolean z) {
        this.f19184g = z;
        mo27462x();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27429b(@C0193h0 AnimatorListener animatorListener) {
        if (this.f19199v == null) {
            this.f19199v = new ArrayList<>();
        }
        this.f19199v.add(animatorListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27434b(@C0195i0 C6876j jVar, boolean z) {
        if (!mo27449k()) {
            Animator animator = this.f19192o;
            if (animator != null) {
                animator.cancel();
            }
            if (m32951B()) {
                if (this.f19202y.getVisibility() != 0) {
                    this.f19202y.setAlpha(0.0f);
                    this.f19202y.setScaleY(0.0f);
                    this.f19202y.setScaleX(0.0f);
                    mo27437c(0.0f);
                }
                C5594h hVar = this.f19193p;
                if (hVar == null) {
                    hVar = m32960z();
                }
                AnimatorSet a = m32955a(hVar, 1.0f, 1.0f, 1.0f);
                a.addListener(new C6868b(z, jVar));
                ArrayList<AnimatorListener> arrayList = this.f19199v;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener((AnimatorListener) it.next());
                    }
                }
                a.start();
            } else {
                this.f19202y.mo27676a(0, z);
                this.f19202y.setAlpha(1.0f);
                this.f19202y.setScaleY(1.0f);
                this.f19202y.setScaleX(1.0f);
                mo27437c(1.0f);
                if (jVar != null) {
                    jVar.mo27373a();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27416a(@C0195i0 ColorStateList colorStateList) {
        C6978j jVar = this.f19179b;
        if (jVar != null) {
            jVar.setTintList(colorStateList);
        }
        C6863c cVar = this.f19181d;
        if (cVar != null) {
            cVar.mo27396a(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27418a(@C0195i0 Mode mode) {
        C6978j jVar = this.f19179b;
        if (jVar != null) {
            jVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27412a(float f) {
        if (this.f19185h != f) {
            this.f19185h = f;
            mo27413a(this.f19185h, this.f19186i, this.f19187j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27414a(int i) {
        if (this.f19197t != i) {
            this.f19197t = i;
            mo27461w();
        }
    }

    /* renamed from: a */
    private void m32957a(float f, @C0193h0 Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f19202y.getDrawable();
        if (drawable != null && this.f19197t != 0) {
            RectF rectF = this.f19174B;
            RectF rectF2 = this.f19175C;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f19197t;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
            int i2 = this.f19197t;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27423a(@C0193h0 C6986o oVar) {
        this.f19178a = oVar;
        C6978j jVar = this.f19179b;
        if (jVar != null) {
            jVar.setShapeAppearanceModel(oVar);
        }
        Drawable drawable = this.f19180c;
        if (drawable instanceof C7003s) {
            ((C7003s) drawable).setShapeAppearanceModel(oVar);
        }
        C6863c cVar = this.f19181d;
        if (cVar != null) {
            cVar.mo27397a(oVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27433b(@C0193h0 C6875i iVar) {
        ArrayList<C6875i> arrayList = this.f19201x;
        if (arrayList != null) {
            arrayList.remove(iVar);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: b */
    public final Drawable mo27426b() {
        return this.f19182e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27431b(@C0193h0 Rect rect) {
        C0944i.m5338a(this.f19182e, (Object) "Didn't initialize content background");
        if (mo27458t()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.f19182e, rect.left, rect.top, rect.right, rect.bottom);
            this.f19203z.mo27377a(insetDrawable);
            return;
        }
        this.f19203z.mo27377a(this.f19182e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27420a(@C0195i0 C5594h hVar) {
        this.f19194q = hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27424a(boolean z) {
        this.f19183f = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27413a(float f, float f2, float f3) {
        mo27462x();
        mo27443e(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27425a(int[] iArr) {
        this.f19189l.mo27637a(iArr);
    }

    /* renamed from: a */
    public void mo27415a(@C0193h0 AnimatorListener animatorListener) {
        if (this.f19200w == null) {
            this.f19200w = new ArrayList<>();
        }
        this.f19200w.add(animatorListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27422a(@C0195i0 C6876j jVar, boolean z) {
        if (!mo27448j()) {
            Animator animator = this.f19192o;
            if (animator != null) {
                animator.cancel();
            }
            if (m32951B()) {
                C5594h hVar = this.f19194q;
                if (hVar == null) {
                    hVar = m32959y();
                }
                AnimatorSet a = m32955a(hVar, 0.0f, 0.0f, 0.0f);
                a.addListener(new C6867a(z, jVar));
                ArrayList<AnimatorListener> arrayList = this.f19200w;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener((AnimatorListener) it.next());
                    }
                }
                a.start();
            } else {
                this.f19202y.mo27676a(z ? 8 : 4, z);
                if (jVar != null) {
                    jVar.mo27374b();
                }
            }
        }
    }

    @C0193h0
    /* renamed from: a */
    private AnimatorSet m32955a(@C0193h0 C5594h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f19202y, View.ALPHA, new float[]{f});
        hVar.mo22052b("opacity").mo22059a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f19202y, View.SCALE_X, new float[]{f2});
        String str = "scale";
        hVar.mo22052b(str).mo22059a((Animator) ofFloat2);
        m32958a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f19202y, View.SCALE_Y, new float[]{f2});
        hVar.mo22052b(str).mo22059a((Animator) ofFloat3);
        m32958a(ofFloat3);
        arrayList.add(ofFloat3);
        m32957a(f3, this.f19176D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f19202y, new C5592f(), new C6869c(), new Matrix[]{new Matrix(this.f19176D)});
        hVar.mo22052b("iconScale").mo22059a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C5588b.m24253a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: a */
    private void m32958a(ObjectAnimator objectAnimator) {
        if (VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new C6870d());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27421a(@C0193h0 C6875i iVar) {
        if (this.f19201x == null) {
            this.f19201x = new ArrayList<>();
        }
        this.f19201x.add(iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27419a(@C0193h0 Rect rect) {
        int sizeDimension = this.f19183f ? (this.f19188k - this.f19202y.getSizeDimension()) / 2 : 0;
        float c = this.f19184g ? mo27436c() + this.f19187j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) c));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (c * f19160L)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C6978j mo27411a() {
        return new C6978j((C6986o) C0944i.m5337a(this.f19178a));
    }

    @C0193h0
    /* renamed from: a */
    private ValueAnimator m32956a(@C0193h0 C6878l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f19154F);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }
}
