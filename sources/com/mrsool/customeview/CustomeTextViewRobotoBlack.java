package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomeTextViewRobotoBlack extends TextView {
    public CustomeTextViewRobotoBlack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49292a();
    }

    /* renamed from: a */
    private void m49292a() {
        try {
            if (!isInEditMode()) {
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Roboto-Black.ttf"));
            }
        } catch (Exception unused) {
        }
    }

    public CustomeTextViewRobotoBlack(Context context) {
        super(context);
        m49292a();
    }
}
