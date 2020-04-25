package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class CustomeEditTextRobotoMedium extends EditText {
    public CustomeEditTextRobotoMedium(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49285a();
    }

    /* renamed from: a */
    private void m49285a() {
        try {
            if (!isInEditMode()) {
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Roboto-Medium.ttf"));
            }
        } catch (Exception unused) {
        }
    }

    public CustomeEditTextRobotoMedium(Context context) {
        super(context);
        m49285a();
    }
}
