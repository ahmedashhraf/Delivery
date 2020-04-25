package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/* renamed from: com.mrsool.customeview.c */
/* compiled from: CustomeButtonText */
public class C10776c extends Button {
    public C10776c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49534a();
    }

    /* renamed from: a */
    private void m49534a() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "ProximaNova-Regular.otf"));
        }
    }

    public C10776c(Context context) {
        super(context);
        m49534a();
    }
}
