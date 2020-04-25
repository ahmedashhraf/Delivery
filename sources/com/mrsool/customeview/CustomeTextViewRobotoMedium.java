package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomeTextViewRobotoMedium extends TextView {
    public CustomeTextViewRobotoMedium(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49295a();
    }

    /* renamed from: a */
    private void m49295a() {
        try {
            if (!isInEditMode()) {
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Roboto-Medium.ttf"));
            }
        } catch (Exception unused) {
        }
    }

    public CustomeTextViewRobotoMedium(Context context) {
        super(context);
        m49295a();
    }
}
