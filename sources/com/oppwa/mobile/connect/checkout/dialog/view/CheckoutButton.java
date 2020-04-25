package com.oppwa.mobile.connect.checkout.dialog.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0494f;
import com.oppwa.mobile.connect.C11771R;

public class CheckoutButton extends C0494f {
    public CheckoutButton(Context context) {
        super(context);
    }

    public CheckoutButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m53567a(context, attributeSet);
    }

    public CheckoutButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m53567a(context, attributeSet);
    }

    /* renamed from: a */
    private void m53567a(Context context, AttributeSet attributeSet) {
        Typeface a = C11912a.m53570a(context, attributeSet, C11771R.styleable.CheckoutView, C11771R.styleable.CheckoutView_typeface);
        if (a != null) {
            setTypeface(a);
        }
    }
}
