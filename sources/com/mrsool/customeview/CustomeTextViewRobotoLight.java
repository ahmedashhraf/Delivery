package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomeTextViewRobotoLight extends TextView {
    public CustomeTextViewRobotoLight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49294a();
    }

    /* renamed from: a */
    private void m49294a() {
        try {
            if (!isInEditMode()) {
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Roboto-Light.ttf"));
            }
        } catch (Exception unused) {
        }
    }

    public CustomeTextViewRobotoLight(Context context) {
        super(context);
        m49294a();
    }
}
