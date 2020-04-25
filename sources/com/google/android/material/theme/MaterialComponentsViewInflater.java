package com.google.android.material.theme;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0485d;
import androidx.appcompat.widget.C0494f;
import androidx.appcompat.widget.C0542q;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.p181c.C5682a;
import com.google.android.material.p301l.C6948a;
import com.google.android.material.textview.C7107a;
import com.google.android.material.textview.MaterialTextView;

public class MaterialComponentsViewInflater extends AppCompatViewInflater {

    /* renamed from: g */
    private static int f20171g = -1;

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: a */
    public C0485d mo901a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        return new C7107a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: b */
    public C0494f mo902b(@C0193h0 Context context, @C0193h0 AttributeSet attributeSet) {
        if (mo28467o(context, attributeSet)) {
            return new C0494f(context, attributeSet);
        }
        return new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: c */
    public AppCompatCheckBox mo903c(Context context, AttributeSet attributeSet) {
        return new C5682a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: i */
    public C0542q mo909i(Context context, AttributeSet attributeSet) {
        return new C6948a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: m */
    public AppCompatTextView mo913m(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: o */
    public boolean mo28467o(@C0193h0 Context context, @C0193h0 AttributeSet attributeSet) {
        int i = VERSION.SDK_INT;
        if (i != 23 && i != 24 && i != 25) {
            return false;
        }
        if (f20171g == -1) {
            f20171g = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", "android");
        }
        int i2 = f20171g;
        if (!(i2 == 0 || i2 == -1)) {
            for (int i3 = 0; i3 < attributeSet.getAttributeCount(); i3++) {
                if (attributeSet.getAttributeNameResource(i3) == 16842964 && f20171g == attributeSet.getAttributeListValue(i3, null, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
