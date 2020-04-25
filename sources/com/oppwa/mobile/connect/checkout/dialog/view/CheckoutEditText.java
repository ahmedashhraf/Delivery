package com.oppwa.mobile.connect.checkout.dialog.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.appcompat.widget.C0518j;
import com.oppwa.mobile.connect.C11771R;

public class CheckoutEditText extends C0518j {

    /* renamed from: P */
    private static final int[] f34378P = {C11771R.attr.state_error};

    /* renamed from: O */
    private boolean f34379O;

    public CheckoutEditText(Context context) {
        super(context);
    }

    public CheckoutEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m53568a(context, attributeSet);
    }

    public CheckoutEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m53568a(context, attributeSet);
    }

    /* renamed from: a */
    private void m53568a(Context context, AttributeSet attributeSet) {
        Typeface a = C11912a.m53570a(context, attributeSet, C11771R.styleable.CheckoutView, C11771R.styleable.CheckoutView_typeface);
        if (a != null) {
            setTypeface(a);
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (!this.f34379O) {
            return super.onCreateDrawableState(i);
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        EditText.mergeDrawableStates(onCreateDrawableState, f34378P);
        return onCreateDrawableState;
    }

    public void setErrorState(boolean z) {
        if (this.f34379O != z) {
            this.f34379O = z;
            refreshDrawableState();
        }
    }
}
