package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/* renamed from: com.mrsool.customeview.d */
/* compiled from: CustomeEditTextBold */
public class C10777d extends EditText {
    public C10777d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49535a();
    }

    /* renamed from: a */
    public static boolean m49536a(C10777d dVar) {
        return dVar.getText().toString().trim().length() < 1;
    }

    /* renamed from: b */
    public static String m49537b(C10777d dVar) {
        return dVar.getText().toString().trim();
    }

    /* renamed from: a */
    private void m49535a() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "ProximaNova-Bold.otf"));
        }
    }

    public C10777d(Context context) {
        super(context);
        m49535a();
    }
}
