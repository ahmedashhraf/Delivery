package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import java.util.HashMap;

public class CustomAutoCompleteRomotoRegular extends AutoCompleteTextView {
    public CustomAutoCompleteRomotoRegular(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49283a();
    }

    /* renamed from: a */
    private void m49283a() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "Roboto-Regular.ttf"));
        }
    }

    /* access modifiers changed from: protected */
    public CharSequence convertSelectionToString(Object obj) {
        return (CharSequence) ((HashMap) obj).get("description");
    }

    public CustomAutoCompleteRomotoRegular(Context context) {
        super(context);
        m49283a();
    }
}
