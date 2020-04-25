package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0216r0;
import androidx.core.p033k.C0944i;
import androidx.core.p034l.C0962e0;
import com.google.android.material.C5582R;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p302m.C6952c;

/* renamed from: com.google.android.material.datepicker.a */
/* compiled from: CalendarItemStyle */
final class C6804a {
    @C0193h0

    /* renamed from: a */
    private final Rect f18929a;

    /* renamed from: b */
    private final ColorStateList f18930b;

    /* renamed from: c */
    private final ColorStateList f18931c;

    /* renamed from: d */
    private final ColorStateList f18932d;

    /* renamed from: e */
    private final int f18933e;

    /* renamed from: f */
    private final C6986o f18934f;

    private C6804a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C6986o oVar, @C0193h0 Rect rect) {
        C0944i.m5334a(rect.left);
        C0944i.m5334a(rect.top);
        C0944i.m5334a(rect.right);
        C0944i.m5334a(rect.bottom);
        this.f18929a = rect;
        this.f18930b = colorStateList2;
        this.f18931c = colorStateList;
        this.f18932d = colorStateList3;
        this.f18933e = i;
        this.f18934f = oVar;
    }

    @C0193h0
    /* renamed from: a */
    static C6804a m32556a(@C0193h0 Context context, @C0216r0 int i) {
        C0944i.m5340a(i != 0, (Object) "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C5582R.styleable.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C5582R.styleable.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(C5582R.styleable.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(C5582R.styleable.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(C5582R.styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a = C6952c.m33332a(context, obtainStyledAttributes, C5582R.styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList a2 = C6952c.m33332a(context, obtainStyledAttributes, C5582R.styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList a3 = C6952c.m33332a(context, obtainStyledAttributes, C5582R.styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C5582R.styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        C6986o a4 = C6986o.m33523a(context, obtainStyledAttributes.getResourceId(C5582R.styleable.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(C5582R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).mo27878a();
        obtainStyledAttributes.recycle();
        C6804a aVar = new C6804a(a, a2, a3, dimensionPixelSize, a4, rect);
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo27145b() {
        return this.f18929a.left;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo27146c() {
        return this.f18929a.right;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo27147d() {
        return this.f18929a.top;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27144a(@C0193h0 TextView textView) {
        C6978j jVar = new C6978j();
        C6978j jVar2 = new C6978j();
        jVar.setShapeAppearanceModel(this.f18934f);
        jVar2.setShapeAppearanceModel(this.f18934f);
        jVar.mo27790a(this.f18931c);
        jVar.mo27785a((float) this.f18933e, this.f18932d);
        textView.setTextColor(this.f18930b);
        Drawable rippleDrawable = VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f18930b.withAlpha(30), jVar, jVar2) : jVar;
        Rect rect = this.f18929a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        C0962e0.m5440a((View) textView, (Drawable) insetDrawable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo27143a() {
        return this.f18929a.bottom;
    }
}
