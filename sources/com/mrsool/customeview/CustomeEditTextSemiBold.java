package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class CustomeEditTextSemiBold extends EditText {
    public CustomeEditTextSemiBold(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49287a();
    }

    /* renamed from: a */
    public static boolean m49288a(CustomeEditTextSemiBold customeEditTextSemiBold) {
        return customeEditTextSemiBold.getText().toString().trim().length() < 1;
    }

    /* renamed from: b */
    public static String m49289b(CustomeEditTextSemiBold customeEditTextSemiBold) {
        return customeEditTextSemiBold.getText().toString().trim();
    }

    /* renamed from: a */
    private void m49287a() {
        try {
            if (!isInEditMode()) {
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "ProximaNova-Semibold.otf"));
            }
        } catch (Exception unused) {
        }
    }

    public CustomeEditTextSemiBold(Context context) {
        super(context);
        m49287a();
    }
}
