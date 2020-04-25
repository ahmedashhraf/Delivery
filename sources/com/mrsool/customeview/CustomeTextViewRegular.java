package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomeTextViewRegular extends TextView {
    public CustomeTextViewRegular(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49291a();
    }

    /* renamed from: a */
    private void m49291a() {
        try {
            if (!isInEditMode()) {
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "ProximaNova-Regular.otf"));
            }
        } catch (Exception unused) {
        }
    }

    public CustomeTextViewRegular(Context context) {
        super(context);
        m49291a();
    }
}
