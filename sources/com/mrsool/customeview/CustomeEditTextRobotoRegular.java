package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class CustomeEditTextRobotoRegular extends EditText {
    public CustomeEditTextRobotoRegular(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49286a();
    }

    /* renamed from: a */
    private void m49286a() {
        try {
            if (!isInEditMode()) {
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Roboto-Regular.ttf"));
            }
        } catch (Exception unused) {
        }
    }

    public CustomeEditTextRobotoRegular(Context context) {
        super(context);
        m49286a();
    }
}
