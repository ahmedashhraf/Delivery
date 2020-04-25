package com.google.android.material.p303n;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.graphics.drawable.C0897e;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p187p.C7003s;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.n.a */
/* compiled from: RippleDrawableCompat */
public class C6958a extends Drawable implements C7003s, C0897e {

    /* renamed from: a */
    private C6960b f19465a;

    /* renamed from: com.google.android.material.n.a$b */
    /* compiled from: RippleDrawableCompat */
    static final class C6960b extends ConstantState {
        @C0193h0

        /* renamed from: a */
        C6978j f19466a;

        /* renamed from: b */
        boolean f19467b;

        public C6960b(C6978j jVar) {
            this.f19466a = jVar;
            this.f19467b = false;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @C0193h0
        public C6958a newDrawable() {
            return new C6958a(new C6960b(this));
        }

        public C6960b(@C0193h0 C6960b bVar) {
            this.f19466a = (C6978j) bVar.f19466a.getConstantState().newDrawable();
            this.f19467b = bVar.f19467b;
        }
    }

    public void draw(Canvas canvas) {
        C6960b bVar = this.f19465a;
        if (bVar.f19467b) {
            bVar.f19466a.draw(canvas);
        }
    }

    @C0195i0
    public ConstantState getConstantState() {
        return this.f19465a;
    }

    public int getOpacity() {
        return this.f19465a.f19466a.getOpacity();
    }

    @C0193h0
    public C6986o getShapeAppearanceModel() {
        return this.f19465a.f19466a.getShapeAppearanceModel();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(@C0193h0 Rect rect) {
        super.onBoundsChange(rect);
        this.f19465a.f19466a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(@C0193h0 int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f19465a.f19466a.setState(iArr)) {
            onStateChange = true;
        }
        boolean a = C6961b.m33358a(iArr);
        C6960b bVar = this.f19465a;
        if (bVar.f19467b == a) {
            return onStateChange;
        }
        bVar.f19467b = a;
        return true;
    }

    public void setAlpha(int i) {
        this.f19465a.f19466a.setAlpha(i);
    }

    public void setColorFilter(@C0195i0 ColorFilter colorFilter) {
        this.f19465a.f19466a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(@C0193h0 C6986o oVar) {
        this.f19465a.f19466a.setShapeAppearanceModel(oVar);
    }

    public void setTint(@C0198k int i) {
        this.f19465a.f19466a.setTint(i);
    }

    public void setTintList(@C0195i0 ColorStateList colorStateList) {
        this.f19465a.f19466a.setTintList(colorStateList);
    }

    public void setTintMode(@C0195i0 Mode mode) {
        this.f19465a.f19466a.setTintMode(mode);
    }

    public C6958a(C6986o oVar) {
        this(new C6960b(new C6978j(oVar)));
    }

    @C0193h0
    public C6958a mutate() {
        this.f19465a = new C6960b(this.f19465a);
        return this;
    }

    private C6958a(C6960b bVar) {
        this.f19465a = bVar;
    }
}
