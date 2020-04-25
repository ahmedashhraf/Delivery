package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p034l.C0962e0;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6936w;
import com.google.android.material.p185e.C5713a;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p187p.C7003s;
import com.google.android.material.p302m.C6952c;
import com.google.android.material.p303n.C6958a;
import com.google.android.material.p303n.C6961b;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.button.a */
/* compiled from: MaterialButtonHelper */
class C5681a {

    /* renamed from: s */
    private static final boolean f16374s = (VERSION.SDK_INT >= 21);

    /* renamed from: a */
    private final MaterialButton f16375a;
    @C0193h0

    /* renamed from: b */
    private C6986o f16376b;

    /* renamed from: c */
    private int f16377c;

    /* renamed from: d */
    private int f16378d;

    /* renamed from: e */
    private int f16379e;

    /* renamed from: f */
    private int f16380f;

    /* renamed from: g */
    private int f16381g;

    /* renamed from: h */
    private int f16382h;
    @C0195i0

    /* renamed from: i */
    private Mode f16383i;
    @C0195i0

    /* renamed from: j */
    private ColorStateList f16384j;
    @C0195i0

    /* renamed from: k */
    private ColorStateList f16385k;
    @C0195i0

    /* renamed from: l */
    private ColorStateList f16386l;
    @C0195i0

    /* renamed from: m */
    private Drawable f16387m;

    /* renamed from: n */
    private boolean f16388n = false;

    /* renamed from: o */
    private boolean f16389o = false;

    /* renamed from: p */
    private boolean f16390p = false;

    /* renamed from: q */
    private boolean f16391q;

    /* renamed from: r */
    private LayerDrawable f16392r;

    C5681a(MaterialButton materialButton, @C0193h0 C6986o oVar) {
        this.f16375a = materialButton;
        this.f16376b = oVar;
    }

    /* renamed from: m */
    private Drawable m24835m() {
        C6978j jVar = new C6978j(this.f16376b);
        jVar.mo27789a(this.f16375a.getContext());
        C0892a.m5146a((Drawable) jVar, this.f16384j);
        Mode mode = this.f16383i;
        if (mode != null) {
            C0892a.m5149a((Drawable) jVar, mode);
        }
        jVar.mo27785a((float) this.f16382h, this.f16385k);
        C6978j jVar2 = new C6978j(this.f16376b);
        jVar2.setTint(0);
        jVar2.mo27784a((float) this.f16382h, this.f16388n ? C5713a.m25190a((View) this.f16375a, C5582R.attr.colorSurface) : 0);
        if (f16374s) {
            this.f16387m = new C6978j(this.f16376b);
            C0892a.m5154b(this.f16387m, -1);
            this.f16392r = new RippleDrawable(C6961b.m33359b(this.f16386l), m24832a((Drawable) new LayerDrawable(new Drawable[]{jVar2, jVar})), this.f16387m);
            return this.f16392r;
        }
        this.f16387m = new C6958a(this.f16376b);
        C0892a.m5146a(this.f16387m, C6961b.m33359b(this.f16386l));
        this.f16392r = new LayerDrawable(new Drawable[]{jVar2, jVar, this.f16387m});
        return m24832a((Drawable) this.f16392r);
    }

    @C0195i0
    /* renamed from: n */
    private C6978j m24836n() {
        return m24834c(true);
    }

    /* renamed from: o */
    private void m24837o() {
        C6978j c = mo22589c();
        C6978j n = m24836n();
        if (c != null) {
            c.mo27785a((float) this.f16382h, this.f16385k);
            if (n != null) {
                n.mo27784a((float) this.f16382h, this.f16388n ? C5713a.m25190a((View) this.f16375a, C5582R.attr.colorSurface) : 0);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22581a(@C0193h0 TypedArray typedArray) {
        this.f16377c = typedArray.getDimensionPixelOffset(C5582R.styleable.MaterialButton_android_insetLeft, 0);
        this.f16378d = typedArray.getDimensionPixelOffset(C5582R.styleable.MaterialButton_android_insetRight, 0);
        this.f16379e = typedArray.getDimensionPixelOffset(C5582R.styleable.MaterialButton_android_insetTop, 0);
        this.f16380f = typedArray.getDimensionPixelOffset(C5582R.styleable.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(C5582R.styleable.MaterialButton_cornerRadius)) {
            this.f16381g = typedArray.getDimensionPixelSize(C5582R.styleable.MaterialButton_cornerRadius, -1);
            mo22583a(this.f16376b.mo27856a((float) this.f16381g));
            this.f16390p = true;
        }
        this.f16382h = typedArray.getDimensionPixelSize(C5582R.styleable.MaterialButton_strokeWidth, 0);
        this.f16383i = C6936w.m33293a(typedArray.getInt(C5582R.styleable.MaterialButton_backgroundTintMode, -1), Mode.SRC_IN);
        this.f16384j = C6952c.m33332a(this.f16375a.getContext(), typedArray, C5582R.styleable.MaterialButton_backgroundTint);
        this.f16385k = C6952c.m33332a(this.f16375a.getContext(), typedArray, C5582R.styleable.MaterialButton_strokeColor);
        this.f16386l = C6952c.m33332a(this.f16375a.getContext(), typedArray, C5582R.styleable.MaterialButton_rippleColor);
        this.f16391q = typedArray.getBoolean(C5582R.styleable.MaterialButton_android_checkable, false);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C5582R.styleable.MaterialButton_elevation, 0);
        int I = C0962e0.m5405I(this.f16375a);
        int paddingTop = this.f16375a.getPaddingTop();
        int H = C0962e0.m5404H(this.f16375a);
        int paddingBottom = this.f16375a.getPaddingBottom();
        this.f16375a.setInternalBackground(m24835m());
        C6978j c = mo22589c();
        if (c != null) {
            c.mo27799b((float) dimensionPixelSize);
        }
        C0962e0.m5473b(this.f16375a, I + this.f16377c, paddingTop + this.f16379e, H + this.f16378d, paddingBottom + this.f16380f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo22588b(boolean z) {
        this.f16388n = z;
        m24837o();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo22591c(@C0195i0 ColorStateList colorStateList) {
        if (this.f16384j != colorStateList) {
            this.f16384j = colorStateList;
            if (mo22589c() != null) {
                C0892a.m5146a((Drawable) mo22589c(), this.f16384j);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: d */
    public ColorStateList mo22592d() {
        return this.f16386l;
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: e */
    public C6986o mo22593e() {
        return this.f16376b;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: f */
    public ColorStateList mo22594f() {
        return this.f16385k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo22595g() {
        return this.f16382h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public ColorStateList mo22596h() {
        return this.f16384j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Mode mo22597i() {
        return this.f16383i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo22598j() {
        return this.f16389o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo22599k() {
        return this.f16391q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo22600l() {
        this.f16389o = true;
        this.f16375a.setSupportBackgroundTintList(this.f16384j);
        this.f16375a.setSupportBackgroundTintMode(this.f16383i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo22587b(@C0195i0 ColorStateList colorStateList) {
        if (this.f16385k != colorStateList) {
            this.f16385k = colorStateList;
            m24837o();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo22590c(int i) {
        if (this.f16382h != i) {
            this.f16382h = i;
            m24837o();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo22586b(int i) {
        if (!this.f16390p || this.f16381g != i) {
            this.f16381g = i;
            this.f16390p = true;
            mo22583a(this.f16376b.mo27856a((float) i));
        }
    }

    @C0195i0
    /* renamed from: c */
    private C6978j m24834c(boolean z) {
        LayerDrawable layerDrawable = this.f16392r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f16374s) {
            return (C6978j) ((LayerDrawable) ((InsetDrawable) this.f16392r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
        }
        return (C6978j) this.f16392r.getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: b */
    private void m24833b(@C0193h0 C6986o oVar) {
        if (mo22589c() != null) {
            mo22589c().setShapeAppearanceModel(oVar);
        }
        if (m24836n() != null) {
            m24836n().setShapeAppearanceModel(oVar);
        }
        if (mo22585b() != null) {
            mo22585b().setShapeAppearanceModel(oVar);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: c */
    public C6978j mo22589c() {
        return m24834c(false);
    }

    @C0195i0
    /* renamed from: b */
    public C7003s mo22585b() {
        LayerDrawable layerDrawable = this.f16392r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f16392r.getNumberOfLayers() > 2) {
            return (C7003s) this.f16392r.getDrawable(2);
        }
        return (C7003s) this.f16392r.getDrawable(1);
    }

    @C0193h0
    /* renamed from: a */
    private InsetDrawable m24832a(Drawable drawable) {
        InsetDrawable insetDrawable = new InsetDrawable(drawable, this.f16377c, this.f16379e, this.f16378d, this.f16380f);
        return insetDrawable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22582a(@C0195i0 Mode mode) {
        if (this.f16383i != mode) {
            this.f16383i = mode;
            if (mo22589c() != null && this.f16383i != null) {
                C0892a.m5149a((Drawable) mo22589c(), this.f16383i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22579a(int i, int i2) {
        Drawable drawable = this.f16387m;
        if (drawable != null) {
            drawable.setBounds(this.f16377c, this.f16379e, i2 - this.f16378d, i - this.f16380f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22578a(int i) {
        if (mo22589c() != null) {
            mo22589c().setTint(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22580a(@C0195i0 ColorStateList colorStateList) {
        if (this.f16386l != colorStateList) {
            this.f16386l = colorStateList;
            if (f16374s && (this.f16375a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f16375a.getBackground()).setColor(C6961b.m33359b(colorStateList));
            } else if (!f16374s && (this.f16375a.getBackground() instanceof C6958a)) {
                ((C6958a) this.f16375a.getBackground()).setTintList(C6961b.m33359b(colorStateList));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo22577a() {
        return this.f16381g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22584a(boolean z) {
        this.f16391q = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22583a(@C0193h0 C6986o oVar) {
        this.f16376b = oVar;
        m24833b(oVar);
    }
}
