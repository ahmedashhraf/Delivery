package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0216r0;
import com.google.android.material.C5582R;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p296f.C6844a;
import com.google.android.material.p296f.C6846c;
import com.google.android.material.p302m.C6951b;

@C0207n0({C0208a.LIBRARY_GROUP, C0208a.TESTS})
/* renamed from: com.google.android.material.datepicker.i */
/* compiled from: MaterialStyledDatePickerDialog */
public class C6829i extends DatePickerDialog {
    @C0188f

    /* renamed from: N */
    private static final int f19024N = 16843612;
    @C0216r0

    /* renamed from: O */
    private static final int f19025O = C5582R.style.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;
    @C0193h0

    /* renamed from: a */
    private final Drawable f19026a;
    @C0193h0

    /* renamed from: b */
    private final Rect f19027b;

    public C6829i(@C0193h0 Context context) {
        this(context, 0);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(this.f19026a);
        getWindow().getDecorView().setOnTouchListener(new C6844a(this, this.f19027b));
    }

    public C6829i(@C0193h0 Context context, int i) {
        this(context, i, null, -1, -1, -1);
    }

    public C6829i(@C0193h0 Context context, @C0195i0 OnDateSetListener onDateSetListener, int i, int i2, int i3) {
        this(context, 0, onDateSetListener, i, i2, i3);
    }

    public C6829i(@C0193h0 Context context, int i, @C0195i0 OnDateSetListener onDateSetListener, int i2, int i3, int i4) {
        super(context, i, onDateSetListener, i2, i3, i4);
        Context context2 = getContext();
        int b = C6951b.m33329b(getContext(), C5582R.attr.colorSurface, C6829i.class.getCanonicalName());
        C6978j jVar = new C6978j(context2, null, f19024N, f19025O);
        if (VERSION.SDK_INT >= 21) {
            jVar.mo27790a(ColorStateList.valueOf(b));
        } else {
            jVar.mo27790a(ColorStateList.valueOf(0));
        }
        this.f19027b = C6846c.m32794a(context2, f19024N, f19025O);
        this.f19026a = C6846c.m32795a(jVar, this.f19027b);
    }
}
