package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.C0193h0;
import com.google.android.material.C5582R;
import com.google.android.material.p302m.C6951b;
import com.google.android.material.p302m.C6952c;

/* renamed from: com.google.android.material.datepicker.b */
/* compiled from: CalendarStyle */
final class C6805b {
    @C0193h0

    /* renamed from: a */
    final C6804a f18935a;
    @C0193h0

    /* renamed from: b */
    final C6804a f18936b;
    @C0193h0

    /* renamed from: c */
    final C6804a f18937c;
    @C0193h0

    /* renamed from: d */
    final C6804a f18938d;
    @C0193h0

    /* renamed from: e */
    final C6804a f18939e;
    @C0193h0

    /* renamed from: f */
    final C6804a f18940f;
    @C0193h0

    /* renamed from: g */
    final C6804a f18941g;
    @C0193h0

    /* renamed from: h */
    final Paint f18942h = new Paint();

    C6805b(@C0193h0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C6951b.m33329b(context, C5582R.attr.materialCalendarStyle, C6809f.class.getCanonicalName()), C5582R.styleable.MaterialCalendar);
        this.f18935a = C6804a.m32556a(context, obtainStyledAttributes.getResourceId(C5582R.styleable.MaterialCalendar_dayStyle, 0));
        this.f18941g = C6804a.m32556a(context, obtainStyledAttributes.getResourceId(C5582R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.f18936b = C6804a.m32556a(context, obtainStyledAttributes.getResourceId(C5582R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.f18937c = C6804a.m32556a(context, obtainStyledAttributes.getResourceId(C5582R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a = C6952c.m33332a(context, obtainStyledAttributes, C5582R.styleable.MaterialCalendar_rangeFillColor);
        this.f18938d = C6804a.m32556a(context, obtainStyledAttributes.getResourceId(C5582R.styleable.MaterialCalendar_yearStyle, 0));
        this.f18939e = C6804a.m32556a(context, obtainStyledAttributes.getResourceId(C5582R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f18940f = C6804a.m32556a(context, obtainStyledAttributes.getResourceId(C5582R.styleable.MaterialCalendar_yearTodayStyle, 0));
        this.f18942h.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
