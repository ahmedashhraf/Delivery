package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0211p;
import androidx.annotation.C0215r;
import androidx.annotation.C0216r0;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p034l.C0962e0;
import com.google.android.material.C5582R;
import com.google.android.material.p185e.C5713a;
import com.google.android.material.p187p.C6972e;
import com.google.android.material.p187p.C6973f;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6985n;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p187p.C6986o.C6988b;
import com.google.android.material.p302m.C6952c;
import com.google.android.material.p303n.C6961b;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.card.a */
/* compiled from: MaterialCardViewHelper */
class C5684a {

    /* renamed from: t */
    private static final int[] f16408t = {16842912};

    /* renamed from: u */
    private static final int f16409u = -1;

    /* renamed from: v */
    private static final double f16410v = Math.cos(Math.toRadians(45.0d));

    /* renamed from: w */
    private static final float f16411w = 1.5f;

    /* renamed from: x */
    private static final int f16412x = 2;
    @C0193h0

    /* renamed from: a */
    private final MaterialCardView f16413a;
    @C0193h0

    /* renamed from: b */
    private final Rect f16414b = new Rect();
    @C0193h0

    /* renamed from: c */
    private final C6978j f16415c;
    @C0193h0

    /* renamed from: d */
    private final C6978j f16416d;
    @C0211p

    /* renamed from: e */
    private final int f16417e;
    @C0211p

    /* renamed from: f */
    private final int f16418f;
    @C0211p

    /* renamed from: g */
    private int f16419g;
    @C0195i0

    /* renamed from: h */
    private Drawable f16420h;
    @C0195i0

    /* renamed from: i */
    private Drawable f16421i;
    @C0195i0

    /* renamed from: j */
    private ColorStateList f16422j;
    @C0195i0

    /* renamed from: k */
    private ColorStateList f16423k;
    @C0195i0

    /* renamed from: l */
    private C6986o f16424l;
    @C0195i0

    /* renamed from: m */
    private ColorStateList f16425m;
    @C0195i0

    /* renamed from: n */
    private Drawable f16426n;
    @C0195i0

    /* renamed from: o */
    private LayerDrawable f16427o;
    @C0195i0

    /* renamed from: p */
    private C6978j f16428p;
    @C0195i0

    /* renamed from: q */
    private C6978j f16429q;

    /* renamed from: r */
    private boolean f16430r = false;

    /* renamed from: s */
    private boolean f16431s;

    /* renamed from: com.google.android.material.card.a$a */
    /* compiled from: MaterialCardViewHelper */
    class C5685a extends InsetDrawable {
        C5685a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public C5684a(@C0193h0 MaterialCardView materialCardView, AttributeSet attributeSet, int i, @C0216r0 int i2) {
        this.f16413a = materialCardView;
        this.f16415c = new C6978j(materialCardView.getContext(), attributeSet, i, i2);
        this.f16415c.mo27789a(materialCardView.getContext());
        this.f16415c.mo27786a(-12303292);
        C6988b m = this.f16415c.getShapeAppearanceModel().mo27871m();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C5582R.styleable.CardView, i, C5582R.style.CardView);
        if (obtainStyledAttributes.hasValue(C5582R.styleable.CardView_cardCornerRadius)) {
            m.mo27872a(obtainStyledAttributes.getDimension(C5582R.styleable.CardView_cardCornerRadius, 0.0f));
        }
        this.f16416d = new C6978j();
        mo22647a(m.mo27878a());
        Resources resources = materialCardView.getResources();
        this.f16417e = resources.getDimensionPixelSize(C5582R.dimen.mtrl_card_checked_icon_margin);
        this.f16418f = resources.getDimensionPixelSize(C5582R.dimen.mtrl_card_checked_icon_size);
        obtainStyledAttributes.recycle();
    }

    @C0193h0
    /* renamed from: A */
    private Drawable m24870A() {
        if (!C6961b.f19468a) {
            return m24885z();
        }
        this.f16429q = m24871B();
        return new RippleDrawable(this.f16422j, null, this.f16429q);
    }

    @C0193h0
    /* renamed from: B */
    private C6978j m24871B() {
        return new C6978j(this.f16424l);
    }

    @C0193h0
    /* renamed from: C */
    private Drawable m24872C() {
        if (this.f16426n == null) {
            this.f16426n = m24870A();
        }
        if (this.f16427o == null) {
            this.f16427o = new LayerDrawable(new Drawable[]{this.f16426n, this.f16416d, m24884y()});
            this.f16427o.setId(2, C5582R.C5586id.mtrl_card_checked_layer_id);
        }
        return this.f16427o;
    }

    /* renamed from: D */
    private float m24873D() {
        if (!this.f16413a.getPreventCornerOverlap() || (VERSION.SDK_INT >= 21 && !this.f16413a.getUseCompatPadding())) {
            return 0.0f;
        }
        double d = 1.0d - f16410v;
        double cardViewRadius = (double) this.f16413a.getCardViewRadius();
        Double.isNaN(cardViewRadius);
        return (float) (d * cardViewRadius);
    }

    /* renamed from: E */
    private boolean m24874E() {
        return this.f16413a.getPreventCornerOverlap() && !m24883x();
    }

    /* renamed from: F */
    private boolean m24875F() {
        return this.f16413a.getPreventCornerOverlap() && m24883x() && this.f16413a.getUseCompatPadding();
    }

    /* renamed from: G */
    private void m24876G() {
        if (C6961b.f19468a) {
            Drawable drawable = this.f16426n;
            if (drawable != null) {
                ((RippleDrawable) drawable).setColor(this.f16422j);
                return;
            }
        }
        C6978j jVar = this.f16428p;
        if (jVar != null) {
            jVar.mo27790a(this.f16422j);
        }
    }

    /* renamed from: u */
    private float m24880u() {
        return Math.max(Math.max(m24877a(this.f16424l.mo27867i(), this.f16415c.mo27843w()), m24877a(this.f16424l.mo27869k(), this.f16415c.mo27844x())), Math.max(m24877a(this.f16424l.mo27862d(), this.f16415c.mo27803c()), m24877a(this.f16424l.mo27860b(), this.f16415c.mo27798b())));
    }

    /* renamed from: v */
    private float m24881v() {
        return this.f16413a.getMaxCardElevation() + (m24875F() ? m24880u() : 0.0f);
    }

    /* renamed from: w */
    private float m24882w() {
        return (this.f16413a.getMaxCardElevation() * f16411w) + (m24875F() ? m24880u() : 0.0f);
    }

    /* renamed from: x */
    private boolean m24883x() {
        return VERSION.SDK_INT >= 21 && this.f16415c.mo27781C();
    }

    @C0193h0
    /* renamed from: y */
    private Drawable m24884y() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f16421i;
        if (drawable != null) {
            stateListDrawable.addState(f16408t, drawable);
        }
        return stateListDrawable;
    }

    @C0193h0
    /* renamed from: z */
    private Drawable m24885z() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f16428p = m24871B();
        this.f16428p.mo27790a(this.f16422j);
        stateListDrawable.addState(new int[]{16842919}, this.f16428p);
        return stateListDrawable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22645a(@C0193h0 TypedArray typedArray) {
        this.f16425m = C6952c.m33332a(this.f16413a.getContext(), typedArray, C5582R.styleable.MaterialCardView_strokeColor);
        if (this.f16425m == null) {
            this.f16425m = ColorStateList.valueOf(-1);
        }
        this.f16419g = typedArray.getDimensionPixelSize(C5582R.styleable.MaterialCardView_strokeWidth, 0);
        this.f16431s = typedArray.getBoolean(C5582R.styleable.MaterialCardView_android_checkable, false);
        this.f16413a.setLongClickable(this.f16431s);
        this.f16423k = C6952c.m33332a(this.f16413a.getContext(), typedArray, C5582R.styleable.MaterialCardView_checkedIconTint);
        mo22646a(C6952c.m33334b(this.f16413a.getContext(), typedArray, C5582R.styleable.MaterialCardView_checkedIcon));
        this.f16422j = C6952c.m33332a(this.f16413a.getContext(), typedArray, C5582R.styleable.MaterialCardView_rippleColor);
        if (this.f16422j == null) {
            this.f16422j = ColorStateList.valueOf(C5713a.m25190a((View) this.f16413a, C5582R.attr.colorControlHighlight));
        }
        ColorStateList a = C6952c.m33332a(this.f16413a.getContext(), typedArray, C5582R.styleable.MaterialCardView_cardForegroundColor);
        C6978j jVar = this.f16416d;
        if (a == null) {
            a = ColorStateList.valueOf(0);
        }
        jVar.mo27790a(a);
        m24876G();
        mo22670r();
        mo22672t();
        this.f16413a.setBackgroundInternal(m24878b((Drawable) this.f16415c));
        this.f16420h = this.f16413a.isClickable() ? m24872C() : this.f16416d;
        this.f16413a.setForeground(m24878b(this.f16420h));
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: b */
    public C6978j mo22649b() {
        return this.f16415c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public ColorStateList mo22653c() {
        return this.f16415c.mo27815f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo22656d(ColorStateList colorStateList) {
        if (this.f16425m != colorStateList) {
            this.f16425m = colorStateList;
            mo22672t();
        }
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: e */
    public ColorStateList mo22657e() {
        return this.f16423k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public float mo22658f() {
        return this.f16415c.mo27843w();
    }

    /* access modifiers changed from: 0000 */
    @C0215r(from = 0.0d, mo670to = 1.0d)
    /* renamed from: g */
    public float mo22659g() {
        return this.f16415c.mo27818g();
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: h */
    public ColorStateList mo22660h() {
        return this.f16422j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public C6986o mo22661i() {
        return this.f16424l;
    }

    /* access modifiers changed from: 0000 */
    @C0198k
    /* renamed from: j */
    public int mo22662j() {
        ColorStateList colorStateList = this.f16425m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: k */
    public ColorStateList mo22663k() {
        return this.f16425m;
    }

    /* access modifiers changed from: 0000 */
    @C0211p
    /* renamed from: l */
    public int mo22664l() {
        return this.f16419g;
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: m */
    public Rect mo22665m() {
        return this.f16414b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo22666n() {
        return this.f16430r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public boolean mo22667o() {
        return this.f16431s;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo22668p() {
        Drawable drawable = this.f16420h;
        this.f16420h = this.f16413a.isClickable() ? m24872C() : this.f16416d;
        Drawable drawable2 = this.f16420h;
        if (drawable != drawable2) {
            m24879c(drawable2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo22669q() {
        int u = (int) ((m24874E() || m24875F() ? m24880u() : 0.0f) - m24873D());
        MaterialCardView materialCardView = this.f16413a;
        Rect rect = this.f16414b;
        materialCardView.mo22604b(rect.left + u, rect.top + u, rect.right + u, rect.bottom + u);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo22670r() {
        this.f16415c.mo27799b(this.f16413a.getCardElevation());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo22671s() {
        if (!mo22666n()) {
            this.f16413a.setBackgroundInternal(m24878b((Drawable) this.f16415c));
        }
        this.f16413a.setForeground(m24878b(this.f16420h));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo22672t() {
        this.f16416d.mo27785a((float) this.f16419g, this.f16425m);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo22650b(@C0215r(from = 0.0d, mo670to = 1.0d) float f) {
        this.f16415c.mo27804c(f);
        C6978j jVar = this.f16416d;
        if (jVar != null) {
            jVar.mo27804c(f);
        }
        C6978j jVar2 = this.f16429q;
        if (jVar2 != null) {
            jVar2.mo27804c(f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo22654c(@C0195i0 ColorStateList colorStateList) {
        this.f16422j = colorStateList;
        m24876G();
    }

    /* renamed from: c */
    private void m24879c(Drawable drawable) {
        if (VERSION.SDK_INT < 23 || !(this.f16413a.getForeground() instanceof InsetDrawable)) {
            this.f16413a.setForeground(m24878b(drawable));
        } else {
            ((InsetDrawable) this.f16413a.getForeground()).setDrawable(drawable);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: d */
    public Drawable mo22655d() {
        return this.f16421i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo22652b(boolean z) {
        this.f16431s = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo22651b(@C0195i0 ColorStateList colorStateList) {
        this.f16423k = colorStateList;
        Drawable drawable = this.f16421i;
        if (drawable != null) {
            C0892a.m5146a(drawable, colorStateList);
        }
    }

    @C0193h0
    /* renamed from: b */
    private Drawable m24878b(Drawable drawable) {
        int i;
        int i2;
        if ((VERSION.SDK_INT < 21) || this.f16413a.getUseCompatPadding()) {
            i2 = (int) Math.ceil((double) m24881v());
            i = (int) Math.ceil((double) m24882w());
        } else {
            i2 = 0;
            i = 0;
        }
        C5685a aVar = new C5685a(drawable, i2, i, i2, i);
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22648a(boolean z) {
        this.f16430r = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22641a(@C0211p int i) {
        if (i != this.f16419g) {
            this.f16419g = i;
            mo22672t();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22644a(ColorStateList colorStateList) {
        this.f16415c.mo27790a(colorStateList);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22643a(int i, int i2, int i3, int i4) {
        this.f16414b.set(i, i2, i3, i4);
        mo22669q();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22640a(float f) {
        mo22647a(this.f16424l.mo27856a(f));
        this.f16420h.invalidateSelf();
        if (m24875F() || m24874E()) {
            mo22669q();
        }
        if (m24875F()) {
            mo22671s();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22646a(@C0195i0 Drawable drawable) {
        this.f16421i = drawable;
        if (drawable != null) {
            this.f16421i = C0892a.m5161i(drawable.mutate());
            C0892a.m5146a(this.f16421i, this.f16423k);
        }
        if (this.f16427o != null) {
            this.f16427o.setDrawableByLayerId(C5582R.C5586id.mtrl_card_checked_layer_id, m24884y());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22642a(int i, int i2) {
        int i3;
        int i4;
        if (this.f16427o != null) {
            int i5 = this.f16417e;
            int i6 = i - i5;
            int i7 = this.f16418f;
            int i8 = i6 - i7;
            int i9 = (i2 - i5) - i7;
            if (C0962e0.m5566x(this.f16413a) == 1) {
                i3 = i8;
                i4 = i5;
            } else {
                i4 = i8;
                i3 = i5;
            }
            this.f16427o.setLayerInset(2, i4, this.f16417e, i3, i9);
        }
    }

    /* access modifiers changed from: 0000 */
    @RequiresApi(api = 23)
    /* renamed from: a */
    public void mo22639a() {
        Drawable drawable = this.f16426n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f16426n.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f16426n.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22647a(@C0193h0 C6986o oVar) {
        this.f16424l = oVar;
        this.f16415c.setShapeAppearanceModel(oVar);
        C6978j jVar = this.f16415c;
        jVar.mo27802b(!jVar.mo27781C());
        C6978j jVar2 = this.f16416d;
        if (jVar2 != null) {
            jVar2.setShapeAppearanceModel(oVar);
        }
        C6978j jVar3 = this.f16429q;
        if (jVar3 != null) {
            jVar3.setShapeAppearanceModel(oVar);
        }
        C6978j jVar4 = this.f16428p;
        if (jVar4 != null) {
            jVar4.setShapeAppearanceModel(oVar);
        }
    }

    /* renamed from: a */
    private float m24877a(C6972e eVar, float f) {
        if (eVar instanceof C6985n) {
            double d = 1.0d - f16410v;
            double d2 = (double) f;
            Double.isNaN(d2);
            return (float) (d * d2);
        } else if (eVar instanceof C6973f) {
            return f / 2.0f;
        } else {
            return 0.0f;
        }
    }
}
