package com.oppwa.mobile.connect.checkout.dialog.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.oppwa.mobile.connect.C11771R;

public class CheckoutTextView extends AppCompatTextView {
    public CheckoutTextView(Context context) {
        super(context);
    }

    public CheckoutTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m53569a(context, attributeSet);
    }

    public CheckoutTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m53569a(context, attributeSet);
    }

    /* renamed from: a */
    private void m53569a(Context context, AttributeSet attributeSet) {
        Typeface a = C11912a.m53570a(context, attributeSet, C11771R.styleable.CheckoutView, C11771R.styleable.CheckoutView_typeface);
        if (a != null) {
            setTypeface(a);
        }
    }
}
