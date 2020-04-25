package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomeTextViewRobotoRegular extends TextView {
    public CustomeTextViewRobotoRegular(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49297a();
    }

    /* renamed from: a */
    private void m49297a() {
        try {
            if (!isInEditMode()) {
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Roboto-Regular.ttf"));
            }
        } catch (Exception unused) {
        }
    }

    public CustomeTextViewRobotoRegular(Context context) {
        super(context);
        m49297a();
    }
}
