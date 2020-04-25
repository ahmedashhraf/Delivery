package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/* renamed from: com.mrsool.customeview.e */
/* compiled from: CustomeEditTextRobotoBold */
public class C10778e extends EditText {
    public C10778e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49538a();
    }

    /* renamed from: a */
    private void m49538a() {
        try {
            if (!isInEditMode()) {
                setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Roboto-Bold.ttf"));
            }
        } catch (Exception unused) {
        }
    }

    public C10778e(Context context) {
        super(context);
        m49538a();
    }
}
