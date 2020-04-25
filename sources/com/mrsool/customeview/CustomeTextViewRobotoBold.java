package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomeTextViewRobotoBold extends TextView {
    public CustomeTextViewRobotoBold(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49293a();
    }

    /* renamed from: a */
    private void m49293a() {
        try {
            if (!isInEditMode()) {
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Roboto-Bold.ttf"));
            }
        } catch (Exception unused) {
        }
    }

    public CustomeTextViewRobotoBold(Context context) {
        super(context);
        m49293a();
    }
}
