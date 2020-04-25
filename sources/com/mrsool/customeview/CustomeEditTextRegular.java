package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class CustomeEditTextRegular extends EditText {
    public CustomeEditTextRegular(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49284a();
    }

    /* renamed from: a */
    private void m49284a() {
        try {
            if (!isInEditMode()) {
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "ProximaNova-Regular.otf"));
            }
        } catch (Exception unused) {
        }
    }

    public CustomeEditTextRegular(Context context) {
        super(context);
        m49284a();
    }
}
