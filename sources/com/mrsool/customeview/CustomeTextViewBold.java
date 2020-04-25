package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomeTextViewBold extends TextView {
    public CustomeTextViewBold(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49290a();
    }

    /* renamed from: a */
    private void m49290a() {
        try {
            if (!isInEditMode()) {
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "ProximaNova-Bold.otf"));
            }
        } catch (Exception unused) {
        }
    }

    public CustomeTextViewBold(Context context) {
        super(context);
        m49290a();
    }
}
