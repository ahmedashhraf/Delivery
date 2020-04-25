package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomeTextViewSemiBold extends TextView {
    public CustomeTextViewSemiBold(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49298a();
    }

    /* renamed from: a */
    private void m49298a() {
        try {
            if (!isInEditMode()) {
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "ProximaNova-Semibold.otf"));
            }
        } catch (Exception unused) {
        }
    }

    public CustomeTextViewSemiBold(Context context) {
        super(context);
        m49298a();
    }
}
