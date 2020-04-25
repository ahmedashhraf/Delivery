package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import java.util.HashMap;

/* renamed from: com.mrsool.customeview.b */
/* compiled from: CustomAutoEditText */
public class C10775b extends AutoCompleteTextView {
    public C10775b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49531a();
    }

    /* renamed from: a */
    public static boolean m49532a(C10775b bVar) {
        return bVar.getText().toString().trim().length() < 1;
    }

    /* renamed from: b */
    public static String m49533b(C10775b bVar) {
        return bVar.getText().toString().trim();
    }

    /* access modifiers changed from: protected */
    public CharSequence convertSelectionToString(Object obj) {
        return (CharSequence) ((HashMap) obj).get("description");
    }

    /* renamed from: a */
    private void m49531a() {
        if (!isInEditMode()) {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "ProximaNova-Regular.otf"));
        }
    }

    public C10775b(Context context) {
        super(context);
        m49531a();
    }
}
