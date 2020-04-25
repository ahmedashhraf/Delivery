package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomeTextViewRobotoMediumitalic extends TextView {
    public CustomeTextViewRobotoMediumitalic(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49296a();
    }

    /* renamed from: a */
    private void m49296a() {
        try {
            if (!isInEditMode()) {
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Roboto-MediumItalic.ttf"));
            }
        } catch (Exception unused) {
        }
    }

    public CustomeTextViewRobotoMediumitalic(Context context) {
        super(context);
        m49296a();
    }
}
